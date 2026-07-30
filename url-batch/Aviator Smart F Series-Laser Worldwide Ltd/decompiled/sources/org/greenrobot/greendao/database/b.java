package org.greenrobot.greendao.database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public abstract class b extends SQLiteOpenHelper {
    private final Context context;
    private a encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    interface a {
        org.greenrobot.greendao.database.a getEncryptedReadableDb(String str);

        org.greenrobot.greendao.database.a getEncryptedReadableDb(char[] cArr);

        org.greenrobot.greendao.database.a getEncryptedWritableDb(String str);

        org.greenrobot.greendao.database.a getEncryptedWritableDb(char[] cArr);
    }

    public b(Context context, String str, int i8) {
        this(context, str, null, i8);
    }

    private a checkEncryptedHelper() {
        if (this.encryptedHelper == null) {
            try {
                Class.forName("net.sqlcipher.database.SQLiteOpenHelper");
                try {
                    this.encryptedHelper = (a) Class.forName("org.greenrobot.greendao.database.f").getConstructor(b.class, Context.class, String.class, Integer.TYPE, Boolean.TYPE).newInstance(this, this.context, this.name, Integer.valueOf(this.version), Boolean.valueOf(this.loadSQLCipherNativeLibs));
                } catch (Exception e8) {
                    throw new DaoException(e8);
                }
            } catch (ClassNotFoundException unused) {
                throw new DaoException("Using an encrypted database requires SQLCipher, make sure to add it to dependencies: https://greenrobot.org/greendao/documentation/database-encryption/");
            }
        }
        return this.encryptedHelper;
    }

    public org.greenrobot.greendao.database.a getEncryptedReadableDb(String str) {
        return checkEncryptedHelper().getEncryptedReadableDb(str);
    }

    public org.greenrobot.greendao.database.a getEncryptedWritableDb(String str) {
        return checkEncryptedHelper().getEncryptedWritableDb(str);
    }

    public org.greenrobot.greendao.database.a getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public org.greenrobot.greendao.database.a getWritableDb() {
        return wrap(getWritableDatabase());
    }

    public void onCreate(org.greenrobot.greendao.database.a aVar) {
    }

    public void onOpen(org.greenrobot.greendao.database.a aVar) {
    }

    public void onUpgrade(org.greenrobot.greendao.database.a aVar, int i8, int i9) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z7) {
        this.loadSQLCipherNativeLibs = z7;
    }

    protected org.greenrobot.greendao.database.a wrap(SQLiteDatabase sQLiteDatabase) {
        return new g(sQLiteDatabase);
    }

    public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8) {
        super(context, str, cursorFactory, i8);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i8;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        onUpgrade(wrap(sQLiteDatabase), i8, i9);
    }

    @SuppressLint({"NewApi"})
    public b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i8, DatabaseErrorHandler databaseErrorHandler) {
        super(context, str, cursorFactory, i8, databaseErrorHandler);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = i8;
    }

    public org.greenrobot.greendao.database.a getEncryptedReadableDb(char[] cArr) {
        return checkEncryptedHelper().getEncryptedReadableDb(cArr);
    }

    public org.greenrobot.greendao.database.a getEncryptedWritableDb(char[] cArr) {
        return checkEncryptedHelper().getEncryptedWritableDb(cArr);
    }
}
