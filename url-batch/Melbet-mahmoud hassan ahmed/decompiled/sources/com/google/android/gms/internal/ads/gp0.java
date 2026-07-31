package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class gp0 implements nb3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ip0 f5707a;

    gp0(ip0 ip0Var) {
        this.f5707a = ip0Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void a(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f5707a.f6735b;
        atomicInteger.set(1);
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f5707a.f6735b;
        atomicInteger.set(-1);
    }
}
