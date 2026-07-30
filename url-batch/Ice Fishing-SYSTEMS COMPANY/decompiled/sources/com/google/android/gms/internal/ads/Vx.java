package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k2.C4630a;
import org.json.JSONObject;
import w2.InterfaceC5155c;

/* loaded from: classes2.dex */
public final class Vx implements InterfaceC3392j, F0, NC, LD, InterfaceC3426jg, InterfaceC3373ig, InterfaceC5155c, F2.b, InterfaceC3701ol, InterfaceC3152eb, InterfaceC2528Dp, InterfaceC2505Cj, Kr, At {

    /* renamed from: v, reason: collision with root package name */
    public static Vx f28327v;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28328n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28329u;

    public /* synthetic */ Vx(int i, Object obj) {
        this.f28328n = i;
        this.f28329u = obj;
    }

    public static final Vx k(Context context) {
        Vx vx;
        synchronized (Vx.class) {
            try {
                if (f28327v == null) {
                    f28327v = new Vx(context);
                }
                vx = f28327v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vx;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2505Cj, com.google.android.gms.internal.ads.InterfaceC3404jB
    public q2.A0 a() {
        try {
            return ((InterfaceC2669Md) ((C3598mq) this.f28329u).f32761b).g();
        } catch (RemoteException e6) {
            throw new C3334hu(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public void mo5b(Object obj) {
        switch (this.f28328n) {
            case 8:
                c7.m mVar = (c7.m) this.f28329u;
                mVar.getClass();
                InterfaceC3858rh interfaceC3858rh = ((C2634Kc) obj).f25993n;
                if (interfaceC3858rh == null || interfaceC3858rh.r0()) {
                    mVar.f5720c = 1;
                    break;
                }
                break;
            case 18:
                ((InterfaceC4185xk) obj).V((C2762Rl) this.f28329u);
                break;
            case 19:
                ((InterfaceC3539ll) obj).I((E9) this.f28329u);
                break;
            default:
                ((InterfaceC3725p8) obj).A((C3671o8) this.f28329u);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2528Dp
    public J3.a c(C2687Ne c2687Ne) {
        C4190xp c4190xp = (C4190xp) ((C4017ue) this.f28329u).f34631v;
        String str = c2687Ne.f26573A;
        synchronized (c4190xp.f34865u) {
            try {
                int i = c4190xp.f35253A;
                if (i != 1 && i != 3) {
                    return C3686oN.l(new C2494Bp(2));
                }
                if (c4190xp.f34866v) {
                    return c4190xp.f34864n;
                }
                c4190xp.f35253A = 3;
                c4190xp.f34866v = true;
                c4190xp.f35254z = str;
                c4190xp.f34869y.o();
                C3320hg c3320hg = c4190xp.f34864n;
                c3320hg.f31242n.c(new RunnableC4136wp(c4190xp, 0), AbstractC3212fg.f30745h);
                return c3320hg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F0
    public long d(long j9) {
        ((U0) this.f28329u).getClass();
        String str = AbstractC3548lu.f32613a;
        return Math.max(0L, Math.min((j9 * r0.f27904e) / 1000000, r0.f27908j - 1));
    }

    @Override // com.google.android.gms.internal.ads.NC
    public /* synthetic */ void e(long j9, Lr lr) {
        switch (this.f28328n) {
            case 3:
                AbstractC3035cL.j(j9, lr, ((N2) this.f28329u).f26427I);
                break;
            default:
                AbstractC3035cL.j(j9, lr, (InterfaceC3448k1[]) ((C4017ue) this.f28329u).f34631v);
                break;
        }
    }

    @Override // w2.InterfaceC5155c
    public void f(C4630a c4630a) {
        switch (this.f28328n) {
            case 10:
                try {
                    ((InterfaceC2567Gd) this.f28329u).a(c4630a.a());
                    break;
                } catch (RemoteException e6) {
                    u2.i.d("", e6);
                    return;
                }
            default:
                try {
                    ((InterfaceC2635Kd) this.f28329u).a(c4630a.a());
                    break;
                } catch (RemoteException e9) {
                    u2.i.d("", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3392j
    public C3675oC g(int i, B8 b82, int[] iArr) {
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        int i9 = 0;
        while (i4 < b82.f23997a) {
            int i10 = i;
            B8 b83 = b82;
            C3122e c3122e = new C3122e(i10, b83, i4, (C3286h) this.f28329u, iArr[i4]);
            int length = objArr.length;
            int i11 = i9 + 1;
            int d2 = PB.d(length, i11);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = c3122e;
            i4++;
            i9 = i11;
            i = i10;
            b82 = b83;
        }
        return UB.p(objArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public JSONObject i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ C3322hi j(InterfaceC4302zt interfaceC4302zt) {
        return ((C3493kt) this.f28329u).b(interfaceC4302zt);
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        C3320hg c3320hg;
        switch (this.f28328n) {
            case 7:
                String str = (String) obj;
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f28329u;
                new t2.v(interfaceC3858rh.getContext(), interfaceC3858rh.w().f41217n, str, interfaceC3858rh.J() != null ? interfaceC3858rh.J().f28184x0 : null).l();
                return;
            case 13:
                ((AtomicInteger) ((D2.a) this.f28329u).f684v).set(1);
                return;
            case 17:
                ((C3216fk) this.f28329u).f30856n.a();
                return;
            case 21:
                C3648nm c3648nm = (C3648nm) this.f28329u;
                C3917sm c3917sm = c3648nm.f33006m;
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) obj;
                synchronized (c3917sm) {
                    c3917sm.f34284k = interfaceC3858rh2;
                }
                C3917sm c3917sm2 = c3648nm.f33006m;
                synchronized (c3917sm2) {
                    c3320hg = c3917sm2.f34287n;
                }
                C3330hq e6 = c3648nm.e("Google", true);
                if (e6 != null && c3320hg != null) {
                    c3320hg.a(e6);
                    return;
                } else {
                    if (c3320hg != null) {
                        c3320hg.cancel(false);
                        return;
                    }
                    return;
                }
            case 22:
                InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) obj;
                C3320hg c3320hg2 = (C3320hg) this.f28329u;
                if (interfaceC3858rh3 == null) {
                    c3320hg2.b(new C3059cr(1, "Missing webview from video view future."));
                    return;
                } else {
                    interfaceC3858rh3.N0("/video", new C2752Rb(7, new Rx(22, c3320hg2)));
                    interfaceC3858rh3.n0();
                    return;
                }
            case 24:
                ((C2612Io) obj).f25618G = true;
                ((BinderC2948ap) this.f28329u).f29326w.b();
                return;
            default:
                try {
                    ((Gu) this.f28329u).b((SQLiteDatabase) obj);
                    return;
                } catch (Exception e9) {
                    String valueOf = String.valueOf(e9.getMessage());
                    int i = t2.C.f40822b;
                    u2.i.c("Error executing function on offline signal database: ".concat(valueOf));
                    return;
                }
        }
    }

    public AtomicReference m(String str) {
        synchronized (this) {
            try {
                HashMap hashMap = (HashMap) this.f28329u;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f28329u).get(str);
    }

    public void n(AbstractC3074d5 abstractC3074d5, com.bumptech.glide.manager.n nVar, MD md) {
        synchronized (abstractC3074d5.f29797x) {
            abstractC3074d5.f29789B = true;
        }
        abstractC3074d5.a("post-response");
        ((K) this.f28329u).f25863u.post(new RunnableC3771q0(abstractC3074d5, nVar, md, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public JSONObject o() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        Object obj = this.f28329u;
        switch (this.f28328n) {
            case 7:
                p2.j.f39798C.f39808h.d("DefaultGmsgHandlers.attributionReportingManager", th);
                break;
            case 13:
                ((AtomicInteger) ((D2.a) obj).f684v).set(-1);
                break;
            case 17:
                break;
            case 21:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.p6)).booleanValue()) {
                    p2.j.f39798C.f39808h.e("omid native display exp", th);
                    break;
                }
                break;
            case 22:
                int i = t2.C.f40822b;
                u2.i.c("Failed to load media data due to video view load failure.");
                ((C3320hg) obj).b(th);
                break;
            case 24:
                break;
            default:
                String valueOf = String.valueOf(th.getMessage());
                int i4 = t2.C.f40822b;
                u2.i.c("Failed to get offline signal database: ".concat(valueOf));
                break;
        }
    }

    public void s() {
        synchronized (Vx.class) {
            C2593Hm c2593Hm = (C2593Hm) this.f28329u;
            c2593Hm.w("vendor_scoped_gpid_v2_id");
            c2593Hm.w("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.internal.ads.Kr
    public void u(AbstractC2539Ej abstractC2539Ej) {
        C3270gk c3270gk;
        Cr cr = (Cr) this.f28329u;
        C3429jj c3429jj = (C3429jj) abstractC2539Ej;
        synchronized (cr) {
            try {
                C3429jj c3429jj2 = cr.f24254B;
                if (c3429jj2 != null) {
                    C3270gk c3270gk2 = c3429jj.f24811j;
                    if (c3270gk2 != null && (c3270gk = c3429jj2.f24811j) != null) {
                        c3270gk2.a(c3270gk.f31098a.get());
                    }
                    C2540Ek c2540Ek = cr.f24254B.f24805c;
                    c2540Ek.getClass();
                    c2540Ek.u1(new C3042ca(null, false));
                }
                cr.f24254B = c3429jj;
                c3429jj.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Vx() {
        this.f28328n = 6;
        this.f28329u = new HashMap();
    }

    public Vx(D2.a aVar) {
        this.f28328n = 13;
        Objects.requireNonNull(aVar);
        this.f28329u = aVar;
    }

    public Vx(Context context) {
        this.f28328n = 0;
        if (C2593Hm.f25414w == null) {
            C2593Hm.f25414w = new C2593Hm(context);
        }
        this.f28329u = C2593Hm.f25414w;
        Rx.g(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3373ig, com.google.android.gms.internal.ads.InterfaceC3152eb, com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        switch (this.f28328n) {
            case 9:
                t2.C.k("Rejecting reference for JS Engine.");
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.C8)).booleanValue();
                C2753Rc c2753Rc = (C2753Rc) this.f28329u;
                if (booleanValue) {
                    c2753Rc.r("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    c2753Rc.q();
                    return;
                }
            case 23:
                C3648nm c3648nm = ((BinderC3649nn) this.f28329u).f33023w;
                if (c3648nm != null) {
                    synchronized (c3648nm) {
                        c3648nm.f33007n.E("_videoMediaView");
                    }
                    return;
                }
                return;
            default:
                Cr cr = (Cr) this.f28329u;
                synchronized (cr) {
                    cr.f24254B = null;
                }
                return;
        }
    }

    public Vx(Handler handler) {
        this.f28328n = 5;
        this.f28329u = new K(this, handler);
    }

    public Vx(C2770Sc c2770Sc, C2753Rc c2753Rc) {
        this.f28328n = 9;
        this.f28329u = c2753Rc;
        Objects.requireNonNull(c2770Sc);
    }

    public Vx(BinderC2737Qd binderC2737Qd, InterfaceC2567Gd interfaceC2567Gd) {
        this.f28328n = 10;
        this.f28329u = interfaceC2567Gd;
        Objects.requireNonNull(binderC2737Qd);
    }

    public Vx(BinderC2737Qd binderC2737Qd, InterfaceC2635Kd interfaceC2635Kd) {
        this.f28328n = 11;
        this.f28329u = interfaceC2635Kd;
        Objects.requireNonNull(binderC2737Qd);
    }

    public Vx(C3216fk c3216fk) {
        this.f28328n = 17;
        Objects.requireNonNull(c3216fk);
        this.f28329u = c3216fk;
    }

    public Vx(C3648nm c3648nm) {
        this.f28328n = 21;
        Objects.requireNonNull(c3648nm);
        this.f28329u = c3648nm;
    }

    public Vx(C2593Hm c2593Hm, Gu gu) {
        this.f28328n = 26;
        this.f28329u = gu;
        Objects.requireNonNull(c2593Hm);
    }

    public Vx(C2946an c2946an, C3320hg c3320hg) {
        this.f28328n = 22;
        this.f28329u = c3320hg;
        Objects.requireNonNull(c2946an);
    }

    public Vx(BinderC3649nn binderC3649nn) {
        this.f28328n = 23;
        Objects.requireNonNull(binderC3649nn);
        this.f28329u = binderC3649nn;
    }

    public Vx(BinderC2948ap binderC2948ap) {
        this.f28328n = 24;
        Objects.requireNonNull(binderC2948ap);
        this.f28329u = binderC2948ap;
    }

    public Vx(Cr cr) {
        this.f28328n = 28;
        Objects.requireNonNull(cr);
        this.f28329u = cr;
    }

    private final void p(Throwable th) {
    }

    private final void r(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3152eb
    public void h(MotionEvent motionEvent) {
    }
}
