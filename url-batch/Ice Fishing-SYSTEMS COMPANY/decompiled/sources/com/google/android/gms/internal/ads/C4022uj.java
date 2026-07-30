package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4022uj implements InterfaceC3725p8 {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3858rh f34644n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f34645u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f34646v = new AtomicReference();

    public C4022uj(InterfaceC3858rh interfaceC3858rh, Executor executor) {
        this.f34644n = interfaceC3858rh;
        this.f34645u = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final synchronized void A(C3671o8 c3671o8) {
        InterfaceC3858rh interfaceC3858rh = this.f34644n;
        if (interfaceC3858rh != null) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.be)).booleanValue()) {
                if (c3671o8.f33111j) {
                    AtomicReference atomicReference = this.f34646v;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f34645u.execute(new RunnableC3968tj(interfaceC3858rh, 1));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f34646v;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f34645u.execute(new RunnableC3968tj(interfaceC3858rh, 0));
                    }
                }
            }
        }
    }
}
