package org.greenrobot.greendao.database;

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;
import org.greenrobot.greendao.database.b;

/* loaded from: classes5.dex */
class f extends SQLiteOpenHelper implements b.a {
    private final b delegate;

    public f(b bVar, Context context, String str, int i8, boolean z7) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i8);
        this.delegate = bVar;
        if (z7) {
            SQLiteDatabase.loadLibs(context);
        }
    }

    private a wrap(SQLiteDatabase sQLiteDatabase) {
        return new d(sQLiteDatabase);
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a getEncryptedReadableDb(String str) {
        return wrap(getReadableDatabase(str));
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a getEncryptedWritableDb(String str) {
        return wrap(getWritableDatabase(str));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.delegate.onCreate(wrap(sQLiteDatabase));
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.delegate.onOpen(wrap(sQLiteDatabase));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i8, int i9) {
        this.delegate.onUpgrade(wrap(sQLiteDatabase), i8, i9);
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a getEncryptedReadableDb(char[] cArr) {
        return wrap(getReadableDatabase(cArr));
    }

    @Override // org.greenrobot.greendao.database.b.a
    public a getEncryptedWritableDb(char[] cArr) {
        return wrap(getWritableDatabase(cArr));
    }
}
