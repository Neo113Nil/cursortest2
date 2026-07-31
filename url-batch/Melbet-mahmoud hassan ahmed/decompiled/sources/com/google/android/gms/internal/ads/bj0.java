package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class bj0 implements Callable<aj0> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3443a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dj0 f3444b;

    bj0(dj0 dj0Var, Context context) {
        this.f3444b = dj0Var;
        this.f3443a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ aj0 call() {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        weakHashMap = this.f3444b.f4232a;
        cj0 cj0Var = (cj0) weakHashMap.get(this.f3443a);
        aj0 a7 = (cj0Var == null || cj0Var.f3851a + s20.f11622a.e().longValue() < y2.t.a().b()) ? new zi0(this.f3443a).a() : new zi0(this.f3443a, cj0Var.f3852b).a();
        weakHashMap2 = this.f3444b.f4232a;
        weakHashMap2.put(this.f3443a, new cj0(this.f3444b, a7));
        return a7;
    }
}
