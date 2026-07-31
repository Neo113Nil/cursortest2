package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0486rl implements InterfaceC0671z6 {

    /* renamed from: a, reason: collision with root package name */
    public final Z6 f1471a;

    public C0486rl(Z6 z6) {
        this.f1471a = z6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0671z6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0671z6
    public final SQLiteDatabase a() {
        try {
            return this.f1471a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
