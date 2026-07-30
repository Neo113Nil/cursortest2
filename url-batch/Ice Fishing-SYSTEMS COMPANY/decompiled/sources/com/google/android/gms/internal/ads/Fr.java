package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.InterfaceC4689d;
import q2.C4927z0;
import q2.InterfaceC4873A;
import q2.InterfaceC4877a;
import q2.InterfaceC4878a0;
import q2.InterfaceC4911r0;
import q2.InterfaceC4922x;

/* loaded from: classes2.dex */
public final class Fr implements InterfaceC4689d, InterfaceC2944al, InterfaceC2608Ik, InterfaceC4131wk, InterfaceC2506Ck, InterfaceC4877a, InterfaceC3915sk, InterfaceC2761Rk, InterfaceC2472Ak, InterfaceC2524Dl {

    /* renamed from: C, reason: collision with root package name */
    public final C3165eo f25035C;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReference f25037n = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f25038u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f25039v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f25040w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f25041x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f25042y = new AtomicBoolean(true);

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f25043z = new AtomicBoolean(false);

    /* renamed from: A, reason: collision with root package name */
    public final AtomicBoolean f25033A = new AtomicBoolean(false);

    /* renamed from: B, reason: collision with root package name */
    public final AtomicReference f25034B = new AtomicReference();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f25036D = new ArrayBlockingQueue(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.ha)).intValue());

    public Fr(C3165eo c3165eo) {
        this.f25035C = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        Object obj;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue() && (obj = this.f25037n.get()) != null) {
            try {
                ((InterfaceC4922x) obj).g();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = this.f25041x.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((InterfaceC4878a0) obj2).f();
        } catch (RemoteException e10) {
            int i9 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i10 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        this.f25042y.set(true);
        this.f25033A.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void E() {
        AbstractC3194fG.h(this.f25037n, Dr.f24593w);
        AbstractC3194fG.h(this.f25041x, Dr.f24595y);
        AbstractC3194fG.h(this.f25034B, Dr.f24596z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void F() {
        Object obj = this.f25037n.get();
        if (obj != null) {
            try {
                ((InterfaceC4922x) obj).e();
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        AtomicReference atomicReference = this.f25041x;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4878a0) obj2).x();
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
            ((InterfaceC4878a0) obj3).c();
        } catch (RemoteException e12) {
            int i11 = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i12 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
        Object obj = this.f25037n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4922x) obj).l();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2761Rk
    public final void a(q2.h1 h1Var) {
        Object obj = this.f25039v.get();
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
        Object obj = this.f25041x.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4878a0) obj).O1(c4927z0);
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void c() {
    }

    public final synchronized InterfaceC4922x d() {
        return (InterfaceC4922x) this.f25037n.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final synchronized void e() {
        AbstractC3194fG.h(this.f25037n, Dr.f24591u);
        AbstractC3194fG.h(this.f25040w, Dr.f24594x);
        this.f25033A.set(true);
        q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void f() {
    }

    @Override // l2.InterfaceC4689d
    public final synchronized void l(String str, String str2) {
        if (!this.f25042y.get()) {
            Object obj = this.f25038u.get();
            if (obj != null) {
                try {
                    ((q2.V) obj).m0(str, str2);
                } catch (RemoteException e6) {
                    int i = t2.C.f40822b;
                    u2.i.i("#007 Could not call remote method.", e6);
                } catch (NullPointerException e9) {
                    int i4 = t2.C.f40822b;
                    u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
                }
            }
            return;
        }
        if (!this.f25036D.offer(new Pair(str, str2))) {
            int i9 = t2.C.f40822b;
            u2.i.a("The queue for app events is full, dropping the new event.");
            C3165eo c3165eo = this.f25035C;
            if (c3165eo != null) {
                C2593Hm a9 = c3165eo.a();
                a9.r(NativeAdvancedJsUtils.f18064p, "dae_action");
                a9.r("dae_name", str);
                a9.r("dae_data", str2);
                a9.s();
            }
        }
    }

    public final void o(q2.V v6) {
        this.f25038u.set(v6);
        this.f25043z.set(true);
        q();
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.gc)).booleanValue() || (obj = this.f25037n.get()) == null) {
            return;
        }
        try {
            ((InterfaceC4922x) obj).g();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final void q() {
        if (this.f25043z.get() && this.f25033A.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f25036D;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f25038u.get();
                if (obj != null) {
                    try {
                        ((q2.V) obj).m0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e6) {
                        int i = t2.C.f40822b;
                        u2.i.i("#007 Could not call remote method.", e6);
                    } catch (NullPointerException e9) {
                        int i4 = t2.C.f40822b;
                        u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f25042y.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        AtomicReference atomicReference = this.f25037n;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC4922x) obj).h0(c4927z0);
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e6);
            } catch (NullPointerException e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC4922x) obj2).D(c4927z0.f40122n);
            } catch (RemoteException e10) {
                int i9 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i10 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f25040w.get();
        if (obj3 != null) {
            try {
                ((InterfaceC4873A) obj3).U(c4927z0);
            } catch (RemoteException e12) {
                int i11 = t2.C.f40822b;
                u2.i.i("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i12 = t2.C.f40822b;
                u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        this.f25042y.set(false);
        this.f25036D.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void x() {
        Object obj = this.f25037n.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC4922x) obj).c();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        } catch (NullPointerException e9) {
            int i4 = t2.C.f40822b;
            u2.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        AbstractC3194fG.h(this.f25037n, Dr.f24592v);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3915sk
    public final void i(BinderC2772Se binderC2772Se, String str, String str2) {
    }
}
