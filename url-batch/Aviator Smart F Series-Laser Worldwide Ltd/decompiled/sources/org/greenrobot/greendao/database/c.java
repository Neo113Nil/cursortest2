package org.greenrobot.greendao.database;

/* loaded from: classes5.dex */
public interface c {
    void bindBlob(int i8, byte[] bArr);

    void bindDouble(int i8, double d8);

    void bindLong(int i8, long j8);

    void bindNull(int i8);

    void bindString(int i8, String str);

    void clearBindings();

    void close();

    void execute();

    long executeInsert();

    Object getRawStatement();

    long simpleQueryForLong();
}
