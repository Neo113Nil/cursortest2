package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class da extends SQLiteOpenHelper implements uf {

    /* renamed from: f, reason: collision with root package name */
    private static da f15866f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final String f15867g = " TEXT";

    /* renamed from: h, reason: collision with root package name */
    private static final String f15868h = " INTEGER";

    /* renamed from: i, reason: collision with root package name */
    private static final String f15869i = ",";

    /* renamed from: a, reason: collision with root package name */
    private final ea f15870a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15871b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15872c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15873d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15874e;

    static abstract class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f15875a = "events";

        /* renamed from: b, reason: collision with root package name */
        public static final int f15876b = 4;

        /* renamed from: c, reason: collision with root package name */
        public static final String f15877c = "eventid";

        /* renamed from: d, reason: collision with root package name */
        public static final String f15878d = "timestamp";

        /* renamed from: e, reason: collision with root package name */
        public static final String f15879e = "type";

        /* renamed from: f, reason: collision with root package name */
        public static final String f15880f = "data";

        a() {
        }
    }

    public da(Context context, String str, int i4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.f15870a = new ea();
        this.f15871b = 4;
        this.f15872c = 400;
        this.f15873d = "DROP TABLE IF EXISTS events";
        this.f15874e = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(zb zbVar, String str) {
        if (zbVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(zbVar.c()));
        contentValues.put(a.f15878d, Long.valueOf(zbVar.d()));
        contentValues.put("type", str);
        contentValues.put("data", zbVar.a());
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1.isOpen() != false) goto L20;
     */
    @Override // com.ironsource.uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr = {str};
        try {
            sQLiteDatabase = a(true);
            try {
                sQLiteDatabase.delete("events", "type = ?", strArr);
            } catch (Throwable th) {
                th = th;
                try {
                    o9.d().a(th);
                    Log.e("IronSource", "Exception while clearing events: ", th);
                } finally {
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }

    private synchronized SQLiteDatabase a(boolean z4) {
        int i4 = 0;
        while (true) {
            try {
                if (z4) {
                    return this.f15870a.a(true, this);
                }
                return this.f15870a.a(false, this);
            } finally {
            }
        }
    }

    public static synchronized da a(Context context, String str, int i4) {
        da daVar;
        synchronized (da.class) {
            try {
                if (f15866f == null) {
                    f15866f = new da(context, str, i4);
                }
                daVar = f15866f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return daVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        if (r3.isOpen() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
    
        if (r3.isOpen() != false) goto L42;
     */
    @Override // com.ironsource.uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ArrayList<zb> a(String str) {
        ArrayList<zb> arrayList;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        try {
            arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                sQLiteDatabase = a(false);
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
            }
            try {
                cursor = sQLiteDatabase.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        int columnIndex = cursor.getColumnIndex("eventid");
                        if (columnIndex >= 0) {
                            int i4 = cursor.getInt(columnIndex);
                            int columnIndex2 = cursor.getColumnIndex(a.f15878d);
                            if (columnIndex2 >= 0) {
                                long j4 = cursor.getLong(columnIndex2);
                                int columnIndex3 = cursor.getColumnIndex("data");
                                if (columnIndex3 >= 0) {
                                    arrayList.add(new zb(i4, j4, cursor.getString(columnIndex3)));
                                    cursor.moveToNext();
                                }
                            }
                        }
                    }
                    cursor.close();
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    o9.d().a(th);
                    Log.e("IronSource", "Exception while loading events: ", th);
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                    }
                    return arrayList;
                } finally {
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r0.isOpen() != false) goto L31;
     */
    @Override // com.ironsource.uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(List<zb> list, String str) {
        SQLiteDatabase sQLiteDatabase;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase2 = null;
                try {
                    sQLiteDatabase = a(true);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Iterator<zb> it = list.iterator();
                    while (it.hasNext()) {
                        ContentValues a4 = a(it.next(), str);
                        if (sQLiteDatabase != null && a4 != null) {
                            sQLiteDatabase.insert("events", null, a4);
                        }
                    }
                    if (sQLiteDatabase != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase2 = sQLiteDatabase;
                    try {
                        o9.d().a(th);
                        Log.e("IronSource", "Exception while saving events: ", th);
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase = sQLiteDatabase2;
                            sQLiteDatabase.close();
                        }
                    } catch (Throwable th3) {
                        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
                            sQLiteDatabase2.close();
                        }
                        throw th3;
                    }
                }
            }
        }
    }
}
