package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2926r4 extends AbstractC2597ed {

    /* renamed from: a, reason: collision with root package name */
    public final C2730jf f39699a;

    public C2926r4(@NonNull Context context) {
        this(new C2730jf(C3007u7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final void a(int i4) {
        this.f39699a.c(i4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final int b() {
        return (int) this.f39699a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2597ed
    public final SparseArray<InterfaceC2571dd> c() {
        return new SparseArray<>();
    }

    public C2926r4(C2730jf c2730jf) {
        this.f39699a = c2730jf;
    }
}
