package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2918ql implements T6 {

    /* renamed from: a, reason: collision with root package name */
    public final C2981t7 f39664a;

    public C2918ql(C2981t7 c2981t7) {
        this.f39664a = c2981t7;
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final SQLiteDatabase a() {
        try {
            return this.f39664a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
