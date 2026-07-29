package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
class gh extends gg {

    /* renamed from: b, reason: collision with root package name */
    private final File f8192b;

    /* renamed from: c, reason: collision with root package name */
    private final gz f8193c;

    /* renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f8194d;
    private long e;
    private long f;
    private long g;

    public gh(File file, gz gzVar) {
        this.f8192b = file;
        this.f8193c = gzVar;
    }

    protected void finalize() {
        if (this.f8194d != null) {
            ka.a(this.f8194d);
            this.f8194d = null;
        }
        super.finalize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.gg
    public void a(long j) {
        if (this.f8194d != null) {
            return;
        }
        this.f8194d = SQLiteDatabase.openOrCreateDatabase(this.f8192b, (SQLiteDatabase.CursorFactory) null);
        int version = this.f8194d.getVersion();
        switch (version) {
            case 0:
                this.f8194d.beginTransaction();
                try {
                    this.f8194d.execSQL("CREATE TABLE IF NOT EXISTS UsageStats(name TEXT,dimensions TEXT,count INTEGER,first_time INTEGER,last_time INTEGER,PRIMARY KEY(name, dimensions))");
                    this.f8194d.execSQL("CREATE TABLE IF NOT EXISTS UsageStatValues(stat_id LONG,name TEXT,count INTEGER,avg REAL,max INTEGER,PRIMARY KEY(stat_id, name))");
                    this.f8194d.setVersion(1);
                    this.f8194d.setTransactionSuccessful();
                    break;
                } finally {
                    this.f8194d.endTransaction();
                }
            case 1:
                break;
            default:
                throw new SQLException("Unknown database version: " + version);
        }
        Cursor rawQuery = this.f8194d.rawQuery("SELECT MIN(first_time), MAX(last_time) FROM UsageStats", null);
        try {
            if (rawQuery.moveToNext()) {
                this.f = rawQuery.getLong(0);
                this.g = rawQuery.getLong(1);
            }
            rawQuery.close();
            if (this.f <= 0 || this.f + 86400000 > j) {
                return;
            }
            b();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tapjoy.internal.gg
    public void a() {
        if (this.f8194d != null) {
            ka.a(this.f8194d);
            this.f8194d = null;
        }
        this.f8192b.delete();
        this.g = 0L;
        this.f = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01de, code lost:
    
        throw r0;
     */
    @Override // com.tapjoy.internal.gg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j, String str, @Nullable String str2, @Nullable Map map) {
        long insert;
        long j2;
        Object obj;
        if (this.f8194d == null) {
            return;
        }
        if (this.e == 0) {
            this.g = j;
            this.e = j;
        } else if (j < this.e || j >= this.e + 86400000) {
            if (j < this.e && this.g - j < 86400000) {
                this.e = j;
            } else {
                b();
                this.g = j;
                this.e = j;
            }
        } else if (j > this.g) {
            this.g = j;
        }
        String str3 = str2 == null ? "" : str2;
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Cursor rawQuery = this.f8194d.rawQuery("SELECT ROWID,count,first_time,last_time FROM UsageStats WHERE name = ? AND dimensions = ?", new String[]{str, str3});
        try {
            ContentValues contentValues = new ContentValues();
            if (rawQuery.moveToNext()) {
                insert = rawQuery.getLong(0);
                int i4 = rawQuery.getInt(1);
                long j3 = rawQuery.getLong(2);
                long j4 = rawQuery.getLong(3);
                contentValues.put("count", Integer.valueOf(i4 + 1));
                if (j < j3) {
                    contentValues.put("first_time", Long.valueOf(j));
                }
                if (j > j4) {
                    contentValues.put("last_time", Long.valueOf(j));
                }
                this.f8194d.update("UsageStats", contentValues, "ROWID = " + insert, null);
            } else {
                contentValues.put("name", str);
                contentValues.put(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS, str3);
                contentValues.put("count", (Integer) 1);
                contentValues.put("first_time", Long.valueOf(j));
                contentValues.put("last_time", Long.valueOf(j));
                insert = this.f8194d.insert("UsageStats", null, contentValues);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() != null) {
                        String str4 = (String) entry.getKey();
                        long longValue = ((Long) entry.getValue()).longValue();
                        String[] strArr = new String[i];
                        strArr[i2] = Long.toString(insert);
                        strArr[i3] = str4;
                        rawQuery = this.f8194d.rawQuery("SELECT ROWID, * FROM UsageStatValues WHERE stat_id = ? AND name = ?", strArr);
                        if (rawQuery.moveToNext()) {
                            long j5 = rawQuery.getLong(i2);
                            int i5 = rawQuery.getInt(3);
                            double d2 = rawQuery.getDouble(4);
                            long j6 = rawQuery.getLong(5);
                            contentValues.clear();
                            int i6 = i5 + i3;
                            contentValues.put("count", Integer.valueOf(i6));
                            double d3 = longValue;
                            Double.isNaN(d3);
                            j2 = insert;
                            double d4 = i6;
                            Double.isNaN(d4);
                            contentValues.put("avg", Double.valueOf(d2 + ((d3 - d2) / d4)));
                            if (longValue > j6) {
                                contentValues.put("max", Long.valueOf(longValue));
                            }
                            this.f8194d.update("UsageStatValues", contentValues, "ROWID = " + j5, null);
                            obj = null;
                        } else {
                            j2 = insert;
                            contentValues.clear();
                            contentValues.put("stat_id", Long.valueOf(j2));
                            contentValues.put("name", str4);
                            contentValues.put("count", (Integer) 1);
                            contentValues.put("avg", Long.valueOf(longValue));
                            contentValues.put("max", Long.valueOf(longValue));
                            obj = null;
                            this.f8194d.insert("UsageStatValues", null, contentValues);
                        }
                        rawQuery.close();
                        insert = j2;
                        i = 2;
                        i2 = 0;
                        i3 = 1;
                    }
                }
            }
        } finally {
        }
    }

    private void b() {
        String str;
        HashMap hashMap;
        Set set = gg.f8184a;
        Cursor rawQuery = this.f8194d.rawQuery("SELECT ROWID, * FROM UsageStats ORDER BY ROWID ASC", null);
        try {
            rawQuery = this.f8194d.rawQuery("SELECT * FROM UsageStatValues ORDER BY stat_id ASC", null);
            try {
                rawQuery.moveToNext();
                while (rawQuery.moveToNext()) {
                    int i = 0;
                    long j = rawQuery.getLong(0);
                    int i2 = 1;
                    String string = rawQuery.getString(1);
                    String string2 = rawQuery.getString(2);
                    String str2 = string2.isEmpty() ? str : string2;
                    int i3 = rawQuery.getInt(3);
                    long j2 = rawQuery.getLong(4);
                    long j3 = rawQuery.getLong(5);
                    if (rawQuery.isAfterLast()) {
                        hashMap = null;
                    } else {
                        hashMap = null;
                        while (rawQuery.getLong(i) == j) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            String string3 = rawQuery.getString(i2);
                            long j4 = rawQuery.getLong(3);
                            long j5 = rawQuery.getLong(4);
                            hashMap.put(string3, Long.valueOf(j4));
                            hashMap.put(string3 + "_max", Long.valueOf(j5));
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                            i = 0;
                            i2 = 1;
                        }
                    }
                    str = (set != null && set.contains(string)) ? null : null;
                    this.f8193c.a(string, str2, i3, j2, j3, hashMap);
                }
                rawQuery.close();
                this.f8194d.execSQL("DELETE FROM UsageStats");
                this.f8194d.execSQL("DELETE FROM UsageStatValues");
                this.g = 0L;
                this.f = 0L;
            } finally {
                rawQuery.close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
