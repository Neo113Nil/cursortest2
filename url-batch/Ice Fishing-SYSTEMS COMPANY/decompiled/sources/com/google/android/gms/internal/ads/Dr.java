package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import h3.InterfaceC4567a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import q2.InterfaceC4873A;
import q2.InterfaceC4878a0;
import q2.InterfaceC4922x;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final /* synthetic */ class Dr implements InterfaceC4032ut, LD, InterfaceC4567a, InterfaceC3404jB, InterfaceC3352iB, InterfaceC3623nE, InterfaceC4272zG, InterfaceC4056vG {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24597n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ Dr f24591u = new Dr(0, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Dr f24592v = new Dr(0, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Dr f24593w = new Dr(0, 2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Dr f24594x = new Dr(0, 3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ Dr f24595y = new Dr(0, 4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ Dr f24596z = new Dr(0, 5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ Dr f24576A = new Dr(0, 6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ Dr f24577B = new Dr(0, 7);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ Dr f24578C = new Dr(0, 8);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ Dr f24579D = new Dr(0, 10);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ Dr f24580E = new Dr(0, 11);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ Dr f24581F = new Dr(0, 12);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ Dr f24582G = new Dr(0, 13);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ Dr f24583H = new Dr(0, 20);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ Dr f24584I = new Dr(0, 22);
    public static final /* synthetic */ Dr J = new Dr(0, 23);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ Dr f24585K = new Dr(0, 24);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ Dr f24586L = new Dr(0, 25);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ Dr f24587M = new Dr(0, 26);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ Dr f24588N = new Dr(0, 27);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ Dr f24589O = new Dr(0, 28);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ Dr f24590P = new Dr(0, 29);

    public /* synthetic */ Dr(byte b9, int i) {
        this.f24597n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4272zG
    public Object J(C3838rE c3838rE) {
        XC xc = c3838rE.f33995a;
        if (xc instanceof CE) {
            return C3143eK.b((CE) xc);
        }
        if (xc instanceof NE) {
            NE ne = (NE) xc;
            ne.getClass();
            return new C4271zF(((C3791qK) ne.f26495c.f26395u).b(), ne.f26496d);
        }
        if (xc instanceof RE) {
            return HF.b((RE) xc);
        }
        if (xc instanceof JE) {
            return ZJ.b((JE) xc);
        }
        if (xc instanceof UE) {
            UE ue = (UE) xc;
            try {
                C4001uF.b();
                return new C4001uF(((C3791qK) ue.f27949c.f26395u).b(), ue.f27950d.b(), C4001uF.b().getProvider());
            } catch (GeneralSecurityException unused) {
                return new C4271zF(2, ((C3791qK) ue.f27949c.f26395u).b(), ue.f27950d.b());
            }
        }
        if (xc instanceof C3462kF) {
            C3462kF c3462kF = (C3462kF) xc;
            try {
                C4001uF.b();
                return new FF(((C3791qK) c3462kF.f32282c.f26395u).b(), c3462kF.f32283d.b(), C4001uF.b().getProvider());
            } catch (GeneralSecurityException unused2) {
                return new C4271zF(3, ((C3791qK) c3462kF.f32282c.f26395u).b(), c3462kF.f32283d.b());
            }
        }
        if (!(xc instanceof C3302hF)) {
            throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(xc.getClass())));
        }
        C3302hF c3302hF = (C3302hF) xc;
        c3302hF.getClass();
        return new CF(((C3791qK) c3302hF.f31219c.f26395u).b(), c3302hF.f31220d, c3302hF.f31218b.f32095b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        switch (this.f24597n) {
            case 13:
                return -1;
            case 14:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4032ut
    public /* synthetic */ void b(Object obj) {
        switch (this.f24597n) {
            case 0:
                ((InterfaceC4922x) obj).f();
                break;
            case 1:
                ((InterfaceC4922x) obj).h();
                break;
            case 2:
                ((InterfaceC4922x) obj).z();
                break;
            case 3:
                ((InterfaceC4873A) obj).z();
                break;
            case 4:
                ((InterfaceC4878a0) obj).o();
                break;
            case 5:
                ((Jv) obj).a();
                break;
            case 6:
                ((InterfaceC2693Nk) obj).k();
                break;
            case 7:
                ((s2.l) obj).G2();
                break;
            case 8:
                ((s2.l) obj).K2();
                break;
            case 9:
            default:
                ((F2.a) obj).d();
                break;
            case 10:
                ((Cif) obj).j();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4056vG
    public Object c(XC xc) {
        byte[] b9;
        switch (this.f24597n) {
            case 22:
                C3085dG c3085dG = (C3085dG) xc;
                BG bg = c3085dG.f29994b;
                int i = AbstractC2976bG.f29468b[AbstractC5088e.d(bg.f24015d)];
                InterfaceC3569mE interfaceC3569mE = (InterfaceC3569mE) UF.f27953d.b(InterfaceC3569mE.class, bg.f24012a).a(bg.f24014c);
                EI ei = bg.f24016e;
                int ordinal = ei.ordinal();
                BG bg2 = c3085dG.f29994b;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            b9 = AbstractC3571mG.f32676a.b();
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(ei)));
                        }
                    }
                    b9 = AbstractC3571mG.a(bg2.f24017f.intValue()).b();
                } else {
                    b9 = AbstractC3571mG.b(bg2.f24017f.intValue()).b();
                }
                return new C4271zF(interfaceC3569mE, b9);
            case 23:
                return C3143eK.b((CE) xc);
            case 24:
                return ZJ.b((JE) xc);
            case 25:
                NE ne = (NE) xc;
                ne.getClass();
                return new C4271zF(((C3791qK) ne.f26495c.f26395u).b(), ne.f26496d);
            case 26:
                return HF.b((RE) xc);
            case 27:
                UE ue = (UE) xc;
                C4002uG c4002uG = VE.f28226a;
                try {
                    C4001uF.b();
                    return new C4001uF(((C3791qK) ue.f27949c.f26395u).b(), ue.f27950d.b(), C4001uF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C4271zF(2, ((C3791qK) ue.f27949c.f26395u).b(), ue.f27950d.b());
                }
            case 28:
                C4002uG c4002uG2 = XE.f28621a;
                AbstractC3892sE.a(((ZE) xc).f28973b.f29187a);
                throw null;
            default:
                C2921aG c2921aG = YE.f28813a;
                AbstractC3892sE.a(((C3084dF) xc).f29991b.f30337b);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3623nE
    public Object d(C2593Hm c2593Hm, Class cls) {
        switch (this.f24597n) {
            case 19:
                C4218yG c4218yG = (C4218yG) C3463kG.f32285b.f32286a.get();
                HashMap hashMap = c4218yG.f35336b;
                if (!hashMap.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
                }
                AG ag = (AG) hashMap.get(cls);
                return ag.b(c2593Hm, new C4164xG(0, c4218yG, ag));
            default:
                if (cls == InterfaceC3569mE.class) {
                    return cls.cast(AbstractC3137eE.a(c2593Hm, f24583H));
                }
                throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3352iB
    public Iterator g(com.bumptech.glide.manager.o oVar, CharSequence charSequence) {
        return new C3189fB(oVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public /* synthetic */ void mo7l(Object obj) {
        t2.C.k("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        t2.C.k("Notification of cache hit failed.");
    }

    @Override // h3.InterfaceC4567a
    public /* synthetic */ Object s(h3.n nVar) {
        return new Boolean(nVar.i());
    }

    public Dr(int i) {
        this.f24597n = 16;
    }
}
