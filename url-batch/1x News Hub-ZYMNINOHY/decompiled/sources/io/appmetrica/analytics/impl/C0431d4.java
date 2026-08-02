package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431d4 extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final C0364af f7171a;

    public C0431d4(Context context) {
        this(new C0364af(C0511g7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i3) {
        this.f7171a.c(i3);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        return (int) this.f7171a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        return new SparseArray<>();
    }

    public C0431d4(C0364af c0364af) {
        this.f7171a = c0364af;
    }
}
