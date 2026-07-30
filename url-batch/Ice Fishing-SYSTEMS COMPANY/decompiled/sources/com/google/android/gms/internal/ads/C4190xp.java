package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.xp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4190xp extends AbstractC4082vp {

    /* renamed from: A, reason: collision with root package name */
    public int f35253A;

    /* renamed from: z, reason: collision with root package name */
    public String f35254z;

    @Override // O2.InterfaceC0365b
    public final void j() {
        synchronized (this.f34865u) {
            try {
                if (!this.f34867w) {
                    this.f34867w = true;
                    try {
                        try {
                            int i = this.f35253A;
                            if (i == 2) {
                                ((InterfaceC2568Ge) this.f34869y.u()).E1(this.f34868x, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ue)).booleanValue() ? new BinderC4028up(this.f34864n, this.f34868x) : new BinderC3974tp(this));
                            } else if (i == 3) {
                                ((InterfaceC2568Ge) this.f34869y.u()).Q2(this.f35254z, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ue)).booleanValue() ? new BinderC4028up(this.f34864n, this.f34868x) : new BinderC3974tp(this));
                            } else {
                                this.f34864n.b(new C2494Bp(1));
                            }
                        } catch (Throwable th) {
                            p2.j.f39798C.f39808h.d("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f34864n.b(new C2494Bp(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f34864n.b(new C2494Bp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4082vp, O2.InterfaceC0366c
    public final void onConnectionFailed(L2.b bVar) {
        int i = t2.C.f40822b;
        u2.i.a("Cannot connect to remote service, fallback to local instance.");
        this.f34864n.b(new C2494Bp(1));
    }
}
