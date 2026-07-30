package com.google.android.gms.internal.ads;

import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2597Hq extends AbstractBinderC3639nd implements InterfaceC2574Gk {

    /* renamed from: n, reason: collision with root package name */
    public BinderC3653nr f25427n;

    /* renamed from: u, reason: collision with root package name */
    public com.bumptech.glide.manager.o f25428u;

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void A3(int i, String str) {
        com.bumptech.glide.manager.o oVar = this.f25428u;
        if (oVar != null) {
            synchronized (oVar) {
                try {
                    if (!oVar.f23623u) {
                        oVar.f23623u = true;
                        if (str == null) {
                            str = C3599mr.c(i, ((C3598mq) oVar.f23624v).f32760a);
                        }
                        oVar.o(new C4927z0(i, str, "undefined", null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2574Gk
    public final synchronized void C1(com.bumptech.glide.manager.o oVar) {
        this.f25428u = oVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void H0(C2938af c2938af) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.H0(c2938af);
        }
    }

    public final synchronized void H3(BinderC3653nr binderC3653nr) {
        this.f25427n = binderC3653nr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void S() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.S();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void T(int i) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.T(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void T0(InterfaceC4284zb interfaceC4284zb, String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void W(String str) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.W(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void Y() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.Y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void Z0(C4927z0 c4927z0) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.Z0(c4927z0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void c() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void d3(C4927z0 c4927z0) {
        com.bumptech.glide.manager.o oVar = this.f25428u;
        if (oVar != null) {
            synchronized (oVar) {
                if (!oVar.f23623u) {
                    oVar.f23623u = true;
                    oVar.o(c4927z0);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void e3(String str, String str2) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.e3(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void f() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void g() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void h() {
        try {
            BinderC3653nr binderC3653nr = this.f25427n;
            if (binderC3653nr != null) {
                binderC3653nr.h();
            }
            com.bumptech.glide.manager.o oVar = this.f25428u;
            if (oVar != null) {
                synchronized (oVar) {
                    ((C3320hg) oVar.f23625w).a(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void j() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void k2() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.k2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void l() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void l0(int i) {
        com.bumptech.glide.manager.o oVar = this.f25428u;
        if (oVar != null) {
            oVar.h(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void q() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void u() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void u1(InterfaceC3047cf interfaceC3047cf) {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.u1(interfaceC3047cf);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3693od
    public final synchronized void y() {
        BinderC3653nr binderC3653nr = this.f25427n;
        if (binderC3653nr != null) {
            binderC3653nr.y();
        }
    }
}
