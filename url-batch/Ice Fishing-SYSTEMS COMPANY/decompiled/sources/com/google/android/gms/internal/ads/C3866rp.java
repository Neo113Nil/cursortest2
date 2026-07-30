package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3866rp extends AbstractC4082vp {

    /* renamed from: A, reason: collision with root package name */
    public final Context f34110A;

    /* renamed from: B, reason: collision with root package name */
    public final SD f34111B;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f34112z;

    public C3866rp(Context context, SD sd, int i) {
        this.f34112z = i;
        switch (i) {
            case 1:
                this.f34110A = context;
                this.f34111B = sd;
                this.f34869y = new T8(context, p2.j.f39798C.f39819t.b(), this, this, 2);
                break;
            default:
                this.f34110A = context;
                this.f34111B = sd;
                this.f34869y = new T8(context, p2.j.f39798C.f39819t.b(), this, this, 2);
                break;
        }
    }

    public J3.a c(C2687Ne c2687Ne) {
        synchronized (this.f34865u) {
            try {
                if (this.f34866v) {
                    return this.f34864n;
                }
                this.f34866v = true;
                this.f34868x = c2687Ne;
                this.f34869y.o();
                C3320hg c3320hg = this.f34864n;
                c3320hg.f31242n.c(new RunnableC3376ij(13, this), AbstractC3212fg.f30745h);
                AbstractC4082vp.b(this.f34110A, c3320hg, this.f34111B);
                return c3320hg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O2.InterfaceC0365b
    public final void j() {
        switch (this.f34112z) {
            case 0:
                synchronized (this.f34865u) {
                    try {
                        if (!this.f34867w) {
                            this.f34867w = true;
                            try {
                                try {
                                    ((InterfaceC2568Ge) this.f34869y.u()).L0(this.f34868x, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ue)).booleanValue() ? new BinderC4028up(this.f34864n, this.f34868x) : new BinderC3974tp(this));
                                } catch (RemoteException | IllegalArgumentException unused) {
                                    this.f34864n.b(new C2494Bp(1));
                                }
                            } catch (Throwable th) {
                                p2.j.f39798C.f39808h.d("RemoteAdRequestClientTask.onConnected", th);
                                this.f34864n.b(new C2494Bp(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.f34865u) {
                    try {
                        if (!this.f34867w) {
                            this.f34867w = true;
                            try {
                                ((InterfaceC2568Ge) this.f34869y.u()).a2(this.f34868x, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ue)).booleanValue() ? new BinderC4028up(this.f34864n, this.f34868x) : new BinderC3974tp(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f34864n.b(new C2494Bp(1));
                            } catch (Throwable th3) {
                                p2.j.f39798C.f39808h.d("RemoteSignalsClientTask.onConnected", th3);
                                this.f34864n.b(new C2494Bp(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4082vp, O2.InterfaceC0366c
    public void onConnectionFailed(L2.b bVar) {
        switch (this.f34112z) {
            case 0:
                int i = t2.C.f40822b;
                u2.i.a("Cannot connect to remote service, fallback to local instance.");
                this.f34864n.b(new C2494Bp(1));
                break;
            default:
                super.onConnectionFailed(bVar);
                break;
        }
    }
}
