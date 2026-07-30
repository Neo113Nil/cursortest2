package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3486km implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32457n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3648nm f32458u;

    public /* synthetic */ RunnableC3486km(C3648nm c3648nm, int i) {
        this.f32457n = i;
        this.f32458u = c3648nm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2548Fb interfaceC2548Fb = null;
        switch (this.f32457n) {
            case 0:
                C3648nm c3648nm = this.f32458u;
                c3648nm.f33007n.L();
                C3917sm c3917sm = c3648nm.f33006m;
                synchronized (c3917sm) {
                    try {
                        InterfaceC3858rh interfaceC3858rh = c3917sm.i;
                        if (interfaceC3858rh != null) {
                            interfaceC3858rh.destroy();
                            c3917sm.i = null;
                        }
                        InterfaceC3858rh interfaceC3858rh2 = c3917sm.f34283j;
                        if (interfaceC3858rh2 != null) {
                            interfaceC3858rh2.destroy();
                            c3917sm.f34283j = null;
                        }
                        InterfaceC3858rh interfaceC3858rh3 = c3917sm.f34284k;
                        if (interfaceC3858rh3 != null) {
                            interfaceC3858rh3.destroy();
                            c3917sm.f34284k = null;
                        }
                        J3.a aVar = c3917sm.f34286m;
                        if (aVar != null) {
                            aVar.cancel(false);
                            c3917sm.f34286m = null;
                        }
                        C3320hg c3320hg = c3917sm.f34287n;
                        if (c3320hg != null) {
                            c3320hg.cancel(false);
                            c3917sm.f34287n = null;
                        }
                        c3917sm.f34285l = null;
                        c3917sm.f34295v.clear();
                        c3917sm.f34296w.clear();
                        c3917sm.f34276b = null;
                        c3917sm.f34277c = null;
                        c3917sm.f34278d = null;
                        c3917sm.f34279e = null;
                        c3917sm.f34282h = null;
                        c3917sm.f34288o = null;
                        c3917sm.f34289p = null;
                        c3917sm.f34290q = null;
                        c3917sm.f34292s = null;
                        c3917sm.f34293t = null;
                        c3917sm.f34294u = null;
                    } finally {
                    }
                }
                return;
            default:
                C3648nm c3648nm2 = this.f32458u;
                c3648nm2.getClass();
                try {
                    C3917sm c3917sm2 = c3648nm2.f33006m;
                    int q6 = c3917sm2.q();
                    C4133wm c4133wm = c3648nm2.f33010q;
                    if (q6 == 1) {
                        C2480Bb c2480Bb = c4133wm.f35061a;
                        if (c2480Bb != null) {
                            c3648nm2.l();
                            InterfaceC4122wb interfaceC4122wb = (InterfaceC4122wb) c3648nm2.f33011r.d();
                            Parcel A02 = c2480Bb.A0();
                            AbstractC3241g8.e(A02, interfaceC4122wb);
                            c2480Bb.G0(A02, 1);
                            return;
                        }
                        return;
                    }
                    if (q6 == 2) {
                        C2463Ab c2463Ab = c4133wm.f35062b;
                        if (c2463Ab != null) {
                            c3648nm2.l();
                            InterfaceC4068vb interfaceC4068vb = (InterfaceC4068vb) c3648nm2.f33012s.d();
                            Parcel A03 = c2463Ab.A0();
                            AbstractC3241g8.e(A03, interfaceC4068vb);
                            c2463Ab.G0(A03, 1);
                            return;
                        }
                        return;
                    }
                    if (q6 == 3) {
                        String g9 = c3917sm2.g();
                        if (g9 != null) {
                            interfaceC2548Fb = (InterfaceC2548Fb) c4133wm.f35066f.getOrDefault(g9, null);
                        }
                        if (interfaceC2548Fb != null) {
                            if (c3917sm2.h() != null) {
                                c3648nm2.e("Google", true);
                            }
                            interfaceC2548Fb.j3((InterfaceC4284zb) c3648nm2.f33015v.d());
                            return;
                        }
                        return;
                    }
                    if (q6 == 6) {
                        InterfaceC2616Jb interfaceC2616Jb = c4133wm.f35063c;
                        if (interfaceC2616Jb != null) {
                            c3648nm2.l();
                            interfaceC2616Jb.V0((InterfaceC2667Mb) c3648nm2.f33013t.d());
                            return;
                        }
                        return;
                    }
                    if (q6 != 7) {
                        int i = t2.C.f40822b;
                        u2.i.c("Wrong native template id!");
                        return;
                    }
                    C2532Ec c2532Ec = c4133wm.f35065e;
                    if (c2532Ec != null) {
                        InterfaceC2481Bc interfaceC2481Bc = (InterfaceC2481Bc) c3648nm2.f33014u.d();
                        Parcel A04 = c2532Ec.A0();
                        AbstractC3241g8.e(A04, interfaceC2481Bc);
                        c2532Ec.G0(A04, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e6) {
                    int i4 = t2.C.f40822b;
                    u2.i.d("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
        }
    }
}
