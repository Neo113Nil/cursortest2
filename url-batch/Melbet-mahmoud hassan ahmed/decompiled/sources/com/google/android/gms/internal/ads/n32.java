package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class n32 {

    /* renamed from: a, reason: collision with root package name */
    private final j32 f8916a;

    /* renamed from: b, reason: collision with root package name */
    private final dc3 f8917b;

    public n32(j32 j32Var, dc3 dc3Var) {
        this.f8916a = j32Var;
        this.f8917b = dc3Var;
    }

    public final void a(pv2<SQLiteDatabase, Void> pv2Var) {
        dc3 dc3Var = this.f8917b;
        final j32 j32Var = this.f8916a;
        rb3.r(dc3Var.E(new Callable() { // from class: com.google.android.gms.internal.ads.l32
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return j32.this.getWritableDatabase();
            }
        }), new m32(this, pv2Var), this.f8917b);
    }
}
