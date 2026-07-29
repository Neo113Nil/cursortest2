package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.c;

/* compiled from: UMDBCreater.java */
/* loaded from: classes2.dex */
class d extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    private static Context f8898b;

    /* renamed from: a, reason: collision with root package name */
    private String f8899a;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* compiled from: UMDBCreater.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f8900a = new d(d.f8898b, f.b(d.f8898b), c.f8858c, null, 1);

        private a() {
        }
    }

    public static d a(Context context) {
        if (f8898b == null) {
            f8898b = context.getApplicationContext();
        }
        return a.f8900a;
    }

    private d(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(new com.umeng.analytics.pro.a(context, str), str2, cursorFactory, i);
    }

    private d(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, TextUtils.isEmpty(str) ? c.f8858c : str, cursorFactory, i);
        this.f8899a = null;
        a();
    }

    public void a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!f.a(c.e.f8889a, writableDatabase)) {
                d(writableDatabase);
            }
            if (!f.a(c.d.f8880a, writableDatabase)) {
                c(writableDatabase);
            }
            if (!f.a(c.C0394c.f8873a, writableDatabase)) {
                b(writableDatabase);
            }
            if (f.a(c.a.f8860a, writableDatabase)) {
                return;
            }
            a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                d(sQLiteDatabase);
                c(sQLiteDatabase);
                b(sQLiteDatabase);
                a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase == null) {
                    return;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            f.a(f8898b);
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
                return;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8899a = "create table if not exists __dp(id INTEGER primary key autoincrement, __id INTEGER, __ii TEXT, __ty INTEGER, __ve TEXT, __io TEXT)";
            sQLiteDatabase.execSQL(this.f8899a);
        } catch (SQLException unused) {
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8899a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL(this.f8899a);
        } catch (SQLException unused) {
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8899a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER)";
            sQLiteDatabase.execSQL(this.f8899a);
        } catch (SQLException unused) {
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8899a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT)";
            sQLiteDatabase.execSQL(this.f8899a);
        } catch (SQLException unused) {
        }
    }
}
