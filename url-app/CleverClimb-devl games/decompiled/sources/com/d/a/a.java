package com.d.a;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: DatabaseHelper.java */
/* loaded from: classes.dex */
final class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static a f4425a;

    /* renamed from: b, reason: collision with root package name */
    private final SQLiteDatabase f4426b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4427c;

    String a() {
        return "INSERT INTO requests ( _id, _url, _file_path, _status, _headers, _written_bytes, _file_size, _error, _priority ) VALUES ";
    }

    String b() {
        return ";";
    }

    private a(Context context) {
        super(context, "com_tonyodev_fetch.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f4427c = true;
        this.f4426b = getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE requests ( _id INTEGER PRIMARY KEY NOT NULL, _url TEXT NOT NULL, _file_path TEXT NOT NULL, _status INTEGER NOT NULL, _headers TEXT NOT NULL, _written_bytes INTEGER NOT NULL, _file_size INTEGER NOT NULL, _error INTEGER NOT NULL, _priority INTEGER NOT NULL, unique( _file_path ) )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != 1) {
            return;
        }
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX table_unique ON requests ( _file_path)");
    }

    static synchronized a a(Context context) {
        synchronized (a.class) {
            if (f4425a != null) {
                return f4425a;
            }
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            f4425a = new a(context.getApplicationContext());
            return f4425a;
        }
    }

    synchronized boolean a(long j, String str, String str2, int i, String str3, long j2, long j3, int i2, int i3) {
        return a(a() + b(j, str, str2, i, str3, j2, j3, i2, i3) + b());
    }

    String b(long j, String str, String str2, int i, String str3, long j2, long j3, int i2, int i3) {
        return "( " + j + ", " + DatabaseUtils.sqlEscapeString(str) + ", " + DatabaseUtils.sqlEscapeString(str2) + ", " + i + ", " + DatabaseUtils.sqlEscapeString(str3) + ", " + j2 + ", " + j3 + ", " + i3 + ", " + i2 + " )";
    }

    synchronized boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            try {
                try {
                    this.f4426b.beginTransaction();
                    this.f4426b.execSQL(str);
                    this.f4426b.setTransactionSuccessful();
                    try {
                        this.f4426b.endTransaction();
                        return true;
                    } catch (SQLiteException e) {
                        if (this.f4427c) {
                            e.printStackTrace();
                        }
                        throw new com.d.a.b.b(e.getMessage(), b.a(e.getMessage()));
                    }
                } catch (Exception e2) {
                    if (this.f4427c) {
                        e2.printStackTrace();
                    }
                    throw new com.d.a.b.b(e2.getMessage(), b.a(e2.getMessage()));
                }
            } catch (Throwable th) {
                try {
                    this.f4426b.endTransaction();
                    throw th;
                } catch (SQLiteException e3) {
                    if (this.f4427c) {
                        e3.printStackTrace();
                    }
                    throw new com.d.a.b.b(e3.getMessage(), b.a(e3.getMessage()));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean a(long j) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _status = 902 WHERE _id = " + j + " AND _status != 903 AND _status != 904");
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        Cursor cursor = null;
        try {
            try {
                this.f4426b.endTransaction();
                Cursor rawQuery = this.f4426b.rawQuery("SELECT _id FROM requests WHERE _id = " + j + " AND _status = 902", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0) {
                            z = true;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = rawQuery;
                        if (this.f4427c) {
                            e.printStackTrace();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    synchronized boolean b(long j) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _status = 900 WHERE _id = " + j + " AND _status != 903 AND _status != 904");
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        Cursor cursor = null;
        try {
            try {
                this.f4426b.endTransaction();
                Cursor rawQuery = this.f4426b.rawQuery("SELECT _id FROM requests WHERE _id = " + j + " AND _status = 900", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0) {
                            z = true;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = rawQuery;
                        if (this.f4427c) {
                            e.printStackTrace();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    synchronized boolean a(long j, int i, int i2) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _status = " + i + ", _error = " + i2 + " WHERE _id = " + j);
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
            z = true;
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
        return z;
    }

    synchronized boolean a(long j, long j2, long j3) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _file_size = " + j3 + ", _written_bytes = " + j2 + " WHERE _id = " + j);
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
            z = true;
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
        return z;
    }

    synchronized boolean c(long j) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("DELETE FROM requests WHERE _id = " + j);
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
            z = true;
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
        return z;
    }

    synchronized boolean c() {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("DELETE FROM requests");
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
            z = true;
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
        return z;
    }

    synchronized boolean a(long j, int i) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _priority = " + i + " WHERE _id = " + j);
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
            z = true;
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
        return z;
    }

    synchronized boolean d(long j) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _status = 900, _error = -1 WHERE _id = " + j + " AND _status = 904");
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        Cursor cursor = null;
        try {
            try {
                this.f4426b.endTransaction();
                Cursor rawQuery = this.f4426b.rawQuery("SELECT _id FROM requests WHERE _id = " + j + " AND _status = 900", null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0) {
                            z = true;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = rawQuery;
                        if (this.f4427c) {
                            e.printStackTrace();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
        return z;
    }

    synchronized boolean a(long j, String str) {
        boolean z;
        z = false;
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _url = " + DatabaseUtils.sqlEscapeString(str) + " WHERE _id = " + j);
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        Cursor cursor = null;
        try {
            try {
                this.f4426b.endTransaction();
                Cursor rawQuery = this.f4426b.rawQuery("SELECT _id FROM requests WHERE _id = " + j + " AND _url = " + DatabaseUtils.sqlEscapeString(str), null);
                if (rawQuery != null) {
                    try {
                        if (rawQuery.getCount() > 0) {
                            z = true;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = rawQuery;
                        if (this.f4427c) {
                            e.printStackTrace();
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        cursor = rawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return z;
    }

    synchronized Cursor e(long j) {
        try {
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
            return null;
        }
        return this.f4426b.rawQuery("SELECT * FROM requests WHERE _id = " + j, null);
    }

    synchronized Cursor d() {
        try {
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
            return null;
        }
        return this.f4426b.rawQuery("SELECT * FROM requests", null);
    }

    synchronized Cursor a(int i) {
        try {
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
            return null;
        }
        return this.f4426b.rawQuery("SELECT * FROM requests WHERE _status = " + i, null);
    }

    synchronized Cursor e() {
        Cursor rawQuery = this.f4426b.rawQuery("SELECT * FROM requests WHERE _status = 900 AND _priority = 601 LIMIT 1", null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            return rawQuery;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return this.f4426b.rawQuery("SELECT * FROM requests WHERE _status = 900 LIMIT 1", null);
    }

    synchronized boolean f() {
        boolean z;
        Cursor rawQuery = this.f4426b.rawQuery("SELECT _id FROM requests WHERE _status = 900 LIMIT 1", null);
        z = false;
        if (rawQuery != null && rawQuery.getCount() > 0) {
            z = true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return z;
    }

    synchronized void g() {
        try {
            this.f4426b.beginTransaction();
            this.f4426b.execSQL("UPDATE requests SET _status = 900 WHERE _status = 901");
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            this.f4426b.endTransaction();
        } catch (SQLiteException e2) {
            if (this.f4427c) {
                e2.printStackTrace();
            }
        }
    }

    synchronized void h() {
        Cursor rawQuery = this.f4426b.rawQuery("SELECT _id, _file_path FROM requests WHERE _status = 903", null);
        if (rawQuery == null) {
            return;
        }
        if (rawQuery.getCount() < 1) {
            return;
        }
        try {
            this.f4426b.beginTransaction();
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                String string = rawQuery.getString(rawQuery.getColumnIndex("_file_path"));
                if (string != null && !g.e(string)) {
                    long j = rawQuery.getLong(rawQuery.getColumnIndex("_id"));
                    this.f4426b.execSQL("UPDATE requests SET _status = 904, _error = -111 WHERE _id = " + j);
                }
                rawQuery.moveToNext();
            }
            this.f4426b.setTransactionSuccessful();
        } catch (SQLiteException e) {
            if (this.f4427c) {
                e.printStackTrace();
            }
        }
        try {
            try {
                this.f4426b.endTransaction();
            } catch (SQLiteException e2) {
                if (this.f4427c) {
                    e2.printStackTrace();
                }
            }
        } finally {
            rawQuery.close();
        }
    }

    synchronized void a(boolean z) {
        this.f4427c = z;
    }
}
