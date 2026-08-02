package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887ul implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0485f7 f8468a;

    public C0887ul(C0485f7 c0485f7) {
        this.f8468a = c0485f7;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final SQLiteDatabase a() {
        try {
            return this.f8468a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
