package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import q2.InterfaceC4877a;

/* renamed from: com.google.android.gms.internal.ads.ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2943ak implements InterfaceC3701ol {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29298n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29292u = new C2943ak(2);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29293v = new C2943ak(3);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29294w = new C2943ak(4);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29295x = new C2943ak(5);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29296y = new C2943ak(6);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29297z = new C2943ak(7);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29271A = new C2943ak(8);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29272B = new C2943ak(9);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29273C = new C2943ak(10);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29274D = new C2943ak(11);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29275E = new C2943ak(12);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29276F = new C2943ak(13);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29277G = new C2943ak(14);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29278H = new C2943ak(15);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29279I = new C2943ak(16);
    public static final /* synthetic */ C2943ak J = new C2943ak(17);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29280K = new C2943ak(18);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29281L = new C2943ak(19);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29282M = new C2943ak(20);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29283N = new C2943ak(21);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29284O = new C2943ak(22);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29285P = new C2943ak(23);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29286Q = new C2943ak(24);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29287R = new C2943ak(25);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29288S = new C2943ak(26);

    /* renamed from: T, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29289T = new C2943ak(27);

    /* renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29290U = new C2943ak(28);

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ C2943ak f29291V = new C2943ak(29);

    public /* synthetic */ C2943ak(int i) {
        this.f29298n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        int i;
        int i4;
        switch (this.f29298n) {
            case 2:
                ((InterfaceC4877a) obj).onAdClicked();
                return;
            case 3:
                ((InterfaceC4185xk) obj).c();
                return;
            case 4:
                ((InterfaceC2472Ak) obj).b(AbstractC3217fl.M(11, null, null));
                return;
            case 5:
                ((InterfaceC2506Ck) obj).y();
                return;
            case 6:
                ((InterfaceC3915sk) obj).x();
                return;
            case 7:
                ((InterfaceC3915sk) obj).F();
                return;
            case 8:
                ((InterfaceC3915sk) obj).c();
                return;
            case 9:
                ((InterfaceC3915sk) obj).f();
                return;
            case 10:
                ((InterfaceC3915sk) obj).E();
                return;
            case 11:
                ((InterfaceC2608Ik) obj).e();
                return;
            case 12:
                ((F2.a) obj).d();
                return;
            case 13:
                ((InterfaceC2693Nk) obj).k();
                return;
            case 14:
                ((s2.l) obj).o1();
                return;
            case 15:
                ((s2.l) obj).K1();
                return;
            case 16:
                ((s2.l) obj).u0();
                return;
            case 17:
                ((s2.l) obj).G2();
                return;
            case 18:
                ((s2.l) obj).K2();
                return;
            case 19:
                ((s2.l) obj).y1();
                return;
            case 20:
                ((s2.l) obj).Y1();
                return;
            case 21:
                ((s2.l) obj).D0();
                return;
            case 22:
                ((s2.l) obj).f1();
                return;
            case 23:
                ((s2.l) obj).g();
                return;
            case 24:
                ((InterfaceC2795Tk) obj).j();
                return;
            case 25:
                Cr cr = (Cr) ((InterfaceC2812Uk) obj);
                synchronized (cr) {
                    C3763pt c3763pt = cr.f24256u;
                    if (c3763pt.d()) {
                        c3763pt.c();
                        return;
                    }
                    C3378il c3378il = c3763pt.f33535j;
                    C2863Xk c2863Xk = c3763pt.f33534h;
                    synchronized (c3378il) {
                        i = c3378il.f31995u;
                    }
                    c2863Xk.w1(i);
                    return;
                }
            case 26:
                Cr cr2 = (Cr) ((InterfaceC2812Uk) obj);
                synchronized (cr2) {
                    try {
                        if (!cr2.f24256u.d()) {
                            C3763pt c3763pt2 = cr2.f24256u;
                            C2863Xk c2863Xk2 = c3763pt2.f33534h;
                            C3378il c3378il2 = c3763pt2.f33535j;
                            synchronized (c3378il2) {
                                i4 = c3378il2.f31994n;
                            }
                            c2863Xk2.v1(i4);
                            return;
                        }
                        C3171eu c3171eu = cr2.f24260y;
                        q2.g1 g1Var = c3171eu.f30531b;
                        C3429jj c3429jj = cr2.f24254B;
                        if (c3429jj != null && c3171eu.f30545q) {
                            g1Var = AbstractC3035cL.i(cr2.f24255n, Collections.singletonList(c3429jj.f32160o));
                        }
                        synchronized (cr2) {
                            C3171eu c3171eu2 = cr2.f24260y;
                            c3171eu2.f30531b = g1Var;
                            c3171eu2.f30545q = cr2.f24259x.f40053G;
                            c3171eu.f30544p = true;
                            try {
                                cr2.G3(c3171eu.f30530a);
                            } catch (RemoteException unused) {
                                int i9 = t2.C.f40822b;
                                u2.i.f("Failed to refresh the banner ad.");
                            }
                            cr2.f24260y.f30544p = false;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            case 27:
                ((InterfaceC3108dl) obj).a();
                return;
            case 28:
                ((InterfaceC3271gl) obj).t();
                return;
            default:
                ((InterfaceC3271gl) obj).o();
                return;
        }
    }
}
