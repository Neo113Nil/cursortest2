package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906ql implements InterfaceC1098y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Y6 f12627a;

    public C0906ql(Y6 y6) {
        this.f12627a = y6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1098y6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1098y6
    public final SQLiteDatabase a() {
        try {
            return this.f12627a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
