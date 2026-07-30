package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public class g implements a {
    private final SQLiteDatabase delegate;

    public g(SQLiteDatabase sQLiteDatabase) {
        this.delegate = sQLiteDatabase;
    }

    @Override // org.greenrobot.greendao.database.a
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public void close() {
        this.delegate.close();
    }

    @Override // org.greenrobot.greendao.database.a
    public c compileStatement(String str) {
        return new h(this.delegate.compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.a
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str) {
        this.delegate.execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.a
    public Object getRawDatabase() {
        return this.delegate;
    }

    public SQLiteDatabase getSQLiteDatabase() {
        return this.delegate;
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // org.greenrobot.greendao.database.a
    public Cursor rawQuery(String str, String[] strArr) {
        return this.delegate.rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.a
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.a
    public void execSQL(String str, Object[] objArr) {
        this.delegate.execSQL(str, objArr);
    }
}
