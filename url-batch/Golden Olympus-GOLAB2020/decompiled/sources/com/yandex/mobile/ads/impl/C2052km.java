package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.km, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2052km {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f28248c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    private final ov f28249a;

    /* renamed from: b, reason: collision with root package name */
    private String f28250b;

    public C2052km(a60 a60Var) {
        this.f28249a = a60Var;
    }

    public final HashMap a() {
        try {
            this.f28250b.getClass();
            Cursor query = this.f28249a.getReadableDatabase().query(this.f28250b, f28248c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new C2028jm(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void a(long j4) {
        try {
            String hexString = Long.toHexString(j4);
            this.f28250b = "ExoPlayerCacheFileMetadata" + hexString;
            if (ya2.a(this.f28249a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f28249a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ya2.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f28250b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f28250b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void a(String str) {
        this.f28250b.getClass();
        try {
            this.f28249a.getWritableDatabase().delete(this.f28250b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new nv(th);
        }
    }

    public final void a(Set<String> set) {
        this.f28250b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f28249a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f28250b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            throw new nv(th2);
        }
    }

    public final void a(String str, long j4, long j5) {
        this.f28250b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f28249a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j4));
            contentValues.put("last_touch_timestamp", Long.valueOf(j5));
            writableDatabase.replaceOrThrow(this.f28250b, null, contentValues);
        } catch (Throwable th) {
            throw new nv(th);
        }
    }
}
