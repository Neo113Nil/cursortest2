package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public abstract class l6 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7210b;

    public l6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.f7210b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f7209a;
        if (sQLiteDatabase2 != null) {
            return sQLiteDatabase2;
        }
        synchronized (this.f7210b) {
            try {
                sQLiteDatabase = this.f7209a;
                if (sQLiteDatabase == null) {
                    sQLiteDatabase = getWritableDatabase();
                    this.f7209a = sQLiteDatabase;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}
