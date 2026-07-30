package org.greenrobot.greendao.database;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes5.dex */
public class h implements c {
    private final SQLiteStatement delegate;

    public h(SQLiteStatement sQLiteStatement) {
        this.delegate = sQLiteStatement;
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindBlob(int i8, byte[] bArr) {
        this.delegate.bindBlob(i8, bArr);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindDouble(int i8, double d8) {
        this.delegate.bindDouble(i8, d8);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindLong(int i8, long j8) {
        this.delegate.bindLong(i8, j8);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindNull(int i8) {
        this.delegate.bindNull(i8);
    }

    @Override // org.greenrobot.greendao.database.c
    public void bindString(int i8, String str) {
        this.delegate.bindString(i8, str);
    }

    @Override // org.greenrobot.greendao.database.c
    public void clearBindings() {
        this.delegate.clearBindings();
    }

    @Override // org.greenrobot.greendao.database.c
    public void close() {
        this.delegate.close();
    }

    @Override // org.greenrobot.greendao.database.c
    public void execute() {
        this.delegate.execute();
    }

    @Override // org.greenrobot.greendao.database.c
    public long executeInsert() {
        return this.delegate.executeInsert();
    }

    @Override // org.greenrobot.greendao.database.c
    public Object getRawStatement() {
        return this.delegate;
    }

    @Override // org.greenrobot.greendao.database.c
    public long simpleQueryForLong() {
        return this.delegate.simpleQueryForLong();
    }
}
