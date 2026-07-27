package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038ul implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0636f7 f9417a;

    public C1038ul(C0636f7 c0636f7) {
        this.f9417a = c0636f7;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final SQLiteDatabase a() {
        try {
            return this.f9417a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
