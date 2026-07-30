package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import q2.C4927z0;
import q2.InterfaceC4911r0;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3439jt implements InterfaceC4131wk, InterfaceC2693Nk, InterfaceC4248yt, s2.l, InterfaceC2761Rk, InterfaceC2472Ak, InterfaceC2524Dl {

    /* renamed from: n, reason: collision with root package name */
    public final C3818qu f32211n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f32212u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f32213v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f32214w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f32215x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f32216y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f32217z = new AtomicReference();

    /* renamed from: A, reason: collision with root package name */
    public final AtomicReference f32209A = new AtomicReference();

    /* renamed from: B, reason: collision with root package name */
    public C3439jt f32210B = null;

    public C3439jt(C3818qu c3818qu) {
        this.f32211n = c3818qu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.C();
            return;
        }
        Object obj = this.f32214w.get();
        if (obj == null) {
            return;
        }
        try {
            ((O8) obj).e();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // s2.l
    public final void G2() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.G2();
        } else {
            AbstractC3194fG.h(this.f32216y, Dr.f24577B);
        }
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final void K2() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.K2();
        } else {
            AbstractC3194fG.h(this.f32216y, Dr.f24578C);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
    }

    @Override // s2.l
    public final void R0(int i) {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.R0(i);
            return;
        }
        Object obj = this.f32216y.get();
        if (obj == null) {
            return;
        }
        try {
            ((s2.l) obj).R0(i);
        } catch (RemoteException e6) {
            int i4 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i9 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // s2.l
    public final void Y1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2761Rk
    public final void a(q2.h1 h1Var) {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.a(h1Var);
            return;
        }
        Object obj = this.f32217z.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4911r0) obj).v1(h1Var);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2472Ak
    public final void b(C4927z0 c4927z0) {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.b(c4927z0);
            return;
        }
        Object obj = this.f32214w.get();
        if (obj == null) {
            return;
        }
        try {
            ((O8) obj).c0(c4927z0);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final void c(BinderC3269gj binderC3269gj) {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.c(binderC3269gj);
            return;
        }
        Object obj = this.f32212u.get();
        if (obj == null) {
            return;
        }
        try {
            ((M8) obj).t3(binderC3269gj);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final void d() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.d();
            return;
        }
        C2478Aq c2478Aq = this.f32211n.f33909a;
        if (c2478Aq != null) {
            C3877s c3877s = (C3877s) c2478Aq.f23905u;
            synchronized (c3877s) {
                c3877s.f34149n = 1;
                c3877s.f();
            }
        }
        if (this.f32213v.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj = this.f32214w.get();
        if (obj != null) {
            try {
                ((O8) obj).o();
            } catch (RemoteException e10) {
                int i9 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i10 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = this.f32209A.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((Jv) obj2).a();
        } catch (RemoteException e12) {
            int i11 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i12 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final void g() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.g();
            return;
        }
        Object obj = this.f32216y.get();
        if (obj != null) {
            try {
                ((s2.l) obj).g();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        AtomicReference atomicReference = this.f32214w;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((O8) obj2).x();
            } catch (RemoteException e10) {
                int i9 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i10 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((O8) obj3).f();
        } catch (RemoteException e12) {
            int i11 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i12 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2693Nk
    public final void k() {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.k();
        } else {
            AbstractC3194fG.h(this.f32215x, Dr.f24576A);
        }
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        C3439jt c3439jt = this.f32210B;
        if (c3439jt != null) {
            c3439jt.v(c4927z0);
            return;
        }
        AtomicReference atomicReference = this.f32212u;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((M8) obj).h0(c4927z0);
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((M8) obj2).D(c4927z0.f40122n);
        } catch (RemoteException e10) {
            int i9 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i10 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // s2.l
    public final void y1() {
    }
}
