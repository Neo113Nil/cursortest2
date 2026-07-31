package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class uv2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12998a;

    /* renamed from: b, reason: collision with root package name */
    private final List<cc3<?>> f12999b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ew2 f13000c;

    /* synthetic */ uv2(ew2 ew2Var, Object obj, List list, tv2 tv2Var) {
        this.f13000c = ew2Var;
        this.f12998a = obj;
        this.f12999b = list;
    }

    public final <O> dw2<O> a(Callable<O> callable) {
        dc3 dc3Var;
        qb3 c7 = rb3.c(this.f12999b);
        cc3 a7 = c7.a(new Callable() { // from class: com.google.android.gms.internal.ads.sv2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, wo0.f13899f);
        ew2 ew2Var = this.f13000c;
        Object obj = this.f12998a;
        List<cc3<?>> list = this.f12999b;
        dc3Var = ew2Var.f4791a;
        return new dw2<>(ew2Var, obj, a7, list, c7.a(callable, dc3Var));
    }
}
