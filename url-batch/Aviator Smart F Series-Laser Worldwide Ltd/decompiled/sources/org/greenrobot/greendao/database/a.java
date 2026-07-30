package org.greenrobot.greendao.database;

import android.database.Cursor;

/* loaded from: classes5.dex */
public interface a {
    void beginTransaction();

    void close();

    c compileStatement(String str);

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    Object getRawDatabase();

    boolean inTransaction();

    boolean isDbLockedByCurrentThread();

    boolean isOpen();

    Cursor rawQuery(String str, String[] strArr);

    void setTransactionSuccessful();
}
