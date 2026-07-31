package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class c6 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f195a;
    public final Object b;

    public c6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.f195a;
        if (sQLiteDatabase2 != null) {
            return sQLiteDatabase2;
        }
        synchronized (this.b) {
            sQLiteDatabase = this.f195a;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = getWritableDatabase();
                this.f195a = sQLiteDatabase;
            }
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
