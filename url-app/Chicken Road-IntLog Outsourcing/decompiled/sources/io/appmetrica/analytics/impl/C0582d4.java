package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582d4 extends Qc {

    /* renamed from: a, reason: collision with root package name */
    public final C0515af f8028a;

    public C0582d4(Context context) {
        this(new C0515af(C0662g7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final void a(int i2) {
        this.f8028a.c(i2);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final int b() {
        return (int) this.f8028a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.Qc
    public final SparseArray<Pc> c() {
        return new SparseArray<>();
    }

    public C0582d4(C0515af c0515af) {
        this.f8028a = c0515af;
    }
}
