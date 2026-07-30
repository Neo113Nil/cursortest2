package com.google.android.gms.internal.ads;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p.AbstractC4846f;
import q2.AbstractBinderC4888f0;
import q2.C4907p;
import q2.InterfaceC4906o0;
import t2.C5067a;
import t2.C5074h;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4075vi extends AbstractBinderC4888f0 {

    /* renamed from: A, reason: collision with root package name */
    public final C2815Un f34835A;

    /* renamed from: B, reason: collision with root package name */
    public final C2748Qo f34836B;

    /* renamed from: C, reason: collision with root package name */
    public final C3550lw f34837C;

    /* renamed from: D, reason: collision with root package name */
    public final Zu f34838D;

    /* renamed from: E, reason: collision with root package name */
    public final C3602mu f34839E;

    /* renamed from: F, reason: collision with root package name */
    public final C2879Yj f34840F;

    /* renamed from: G, reason: collision with root package name */
    public final C3165eo f34841G;

    /* renamed from: H, reason: collision with root package name */
    public final C3166ep f34842H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f34843I = false;
    public final Long J;

    /* renamed from: n, reason: collision with root package name */
    public final Context f34844n;

    /* renamed from: u, reason: collision with root package name */
    public final C5107a f34845u;

    /* renamed from: v, reason: collision with root package name */
    public final C2781Sn f34846v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC3544lq f34847w;

    /* renamed from: x, reason: collision with root package name */
    public final C4084vr f34848x;

    /* renamed from: y, reason: collision with root package name */
    public final C2527Do f34849y;

    /* renamed from: z, reason: collision with root package name */
    public final C2569Gf f34850z;

    public BinderC4075vi(Context context, C5107a c5107a, C2781Sn c2781Sn, InterfaceC3544lq interfaceC3544lq, C4084vr c4084vr, C2527Do c2527Do, C2569Gf c2569Gf, C2815Un c2815Un, C2748Qo c2748Qo, C3550lw c3550lw, Zu zu, C3602mu c3602mu, C2879Yj c2879Yj, C3165eo c3165eo, C3166ep c3166ep) {
        this.f34844n = context;
        this.f34845u = c5107a;
        this.f34846v = c2781Sn;
        this.f34847w = interfaceC3544lq;
        this.f34848x = c4084vr;
        this.f34849y = c2527Do;
        this.f34850z = c2569Gf;
        this.f34835A = c2815Un;
        this.f34836B = c2748Qo;
        this.f34837C = c3550lw;
        this.f34838D = zu;
        this.f34839E = c3602mu;
        this.f34840F = c2879Yj;
        this.f34841G = c3165eo;
        this.f34842H = c3166ep;
        p2.j.f39798C.f39810k.getClass();
        this.J = Long.valueOf(SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // q2.InterfaceC4890g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(V2.a aVar, String str) {
        String M8;
        String str2;
        RunnableC4021ui runnableC4021ui;
        Context context = this.f34844n;
        AbstractC3368ia.a(context);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31609Z4)).booleanValue()) {
            try {
                t2.G g9 = p2.j.f39798C.f39803c;
                M8 = t2.G.M(context);
            } catch (RemoteException | RuntimeException e6) {
                p2.j.f39798C.f39808h.d("NonagonMobileAdsSettingManager_AppId", e6);
            }
            boolean z8 = true;
            str2 = true != TextUtils.isEmpty(M8) ? str : M8;
            if (TextUtils.isEmpty(str2)) {
                C3151ea c3151ea = AbstractC3368ia.f31548S4;
                q2.r rVar = q2.r.f40116e;
                boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
                C3151ea c3151ea2 = AbstractC3368ia.f31844z1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                boolean booleanValue2 = booleanValue | ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
                    runnableC4021ui = new RunnableC4021ui(this, (Runnable) V2.b.A0(aVar), 0);
                } else {
                    runnableC4021ui = null;
                    z8 = booleanValue2;
                }
                RunnableC4021ui runnableC4021ui2 = runnableC4021ui;
                if (z8) {
                    p2.j.f39798C.f39811l.t(this.f34844n, this.f34845u, true, null, str2, null, runnableC4021ui2, this.f34838D, this.f34841G, this.J, this.f34836B.f());
                    return;
                }
                return;
            }
            return;
        }
        M8 = "";
        boolean z82 = true;
        if (true != TextUtils.isEmpty(M8)) {
        }
        if (TextUtils.isEmpty(str2)) {
        }
    }

    @Override // q2.InterfaceC4890g0
    public final void F1(String str) {
        this.f34848x.b(str);
    }

    @Override // q2.InterfaceC4890g0
    public final void H1(InterfaceC4906o0 interfaceC4906o0) {
        this.f34836B.e(interfaceC4906o0, EnumC2731Po.f27051u);
    }

    @Override // q2.InterfaceC4890g0
    public final void O0(InterfaceC4231yc interfaceC4231yc) {
        C2527Do c2527Do = this.f34849y;
        c2527Do.getClass();
        c2527Do.f24559e.f31242n.c(new MD(29, c2527Do, interfaceC4231yc), c2527Do.f24563j);
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized void P2(String str) {
        Context context = this.f34844n;
        AbstractC3368ia.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31548S4)).booleanValue()) {
                p2.j.f39798C.f39811l.t(context, this.f34845u, true, null, str, null, null, this.f34838D, null, null, this.f34836B.f());
            }
        }
    }

    @Override // q2.InterfaceC4890g0
    public final void W(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.La)).booleanValue()) {
            p2.j.f39798C.f39808h.f29018g = str;
        }
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized void X() {
        C3151ea c3151ea = AbstractC3368ia.d3;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C2518Df c2518Df = p2.j.f39798C.f39817r;
            synchronized (c2518Df.f24453u) {
                try {
                    C2855Xc c2855Xc = (C2855Xc) c2518Df.f24455w;
                    if (c2855Xc != null) {
                        c7.m mVar = c2855Xc.f28656a;
                        C2770Sc c2770Sc = (C2770Sc) mVar.f5725h;
                        if (c2770Sc != null) {
                            c2770Sc.u();
                            mVar.f5725h = null;
                        }
                        c2518Df.f24455w = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31654e3)).booleanValue()) {
                C4907p.f40108g.f40111c = true;
            }
        }
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized void c() {
        final int i = 1;
        final int i4 = 0;
        final int i9 = 2;
        synchronized (this) {
            if (this.f34843I) {
                int i10 = t2.C.f40822b;
                u2.i.f("Mobile ads is initialized already.");
                return;
            }
            C3151ea c3151ea = AbstractC3368ia.f31654e3;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                C4907p.a();
            }
            Context context = this.f34844n;
            AbstractC3368ia.a(context);
            C5107a c5107a = this.f34845u;
            C3165eo c3165eo = this.f34841G;
            p2.j jVar = p2.j.f39798C;
            jVar.f39808h.b(context, c5107a, c3165eo);
            this.f34840F.b();
            jVar.f39809j.c(context);
            this.f34843I = true;
            this.f34849y.a();
            C4084vr c4084vr = this.f34848x;
            c4084vr.getClass();
            t2.E g9 = jVar.f39808h.g();
            g9.f40832c.add(new RunnableC4030ur(c4084vr, 2));
            c4084vr.f34879f.execute(new RunnableC4030ur(c4084vr, 0));
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31566U4)).booleanValue()) {
                C2815Un c2815Un = this.f34835A;
                if (!c2815Un.f28084f.getAndSet(true)) {
                    t2.E g10 = jVar.f39808h.g();
                    g10.f40832c.add(new RunnableC2798Tn(c2815Un, 0));
                }
                c2815Un.f28081c.execute(new RunnableC2798Tn(c2815Un, 2));
            }
            this.f34836B.a();
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.za)).booleanValue()) {
                final int i11 = 3;
                AbstractC3212fg.f30738a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ti

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4075vi f34446u;

                    {
                        this.f34446u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C2934ab c2934ab;
                        boolean z8;
                        String str;
                        switch (i11) {
                            case 0:
                                AbstractC3035cL.k(this.f34446u.f34844n, true);
                                return;
                            case 1:
                                BinderC4075vi binderC4075vi = this.f34446u;
                                binderC4075vi.getClass();
                                C3851ra c3851ra = p2.j.f39798C.f39813n;
                                if (c3851ra.f34041n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4075vi.f34844n;
                                c3851ra.f34042u = context2;
                                c3851ra.f34043v = binderC4075vi.f34841G;
                                if (c3851ra.f34045x != null || context2 == null || (b9 = AbstractC4846f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4846f.a(context2, b9, c3851ra);
                                return;
                            case 2:
                                BinderC4075vi binderC4075vi2 = this.f34446u;
                                binderC4075vi2.getClass();
                                BinderC2483Be binderC2483Be = new BinderC2483Be("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3550lw c3550lw = binderC4075vi2.f34837C;
                                c3550lw.getClass();
                                try {
                                    try {
                                        IBinder b10 = AbstractC0415a.I(c3550lw.f32622a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c2934ab = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c2934ab = queryLocalInterface instanceof C2934ab ? (C2934ab) queryLocalInterface : new C2934ab(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel A02 = c2934ab.A0();
                                        AbstractC3241g8.e(A02, binderC2483Be);
                                        c2934ab.G0(A02, 1);
                                        return;
                                    } catch (Exception e6) {
                                        throw new u2.j(e6);
                                    }
                                } catch (RemoteException e9) {
                                    u2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e9.getMessage())));
                                    return;
                                } catch (u2.j e10) {
                                    u2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4075vi binderC4075vi3 = this.f34446u;
                                binderC4075vi3.getClass();
                                p2.j jVar2 = p2.j.f39798C;
                                t2.E g11 = jVar2.f39808h.g();
                                g11.i();
                                synchronized (g11.f40830a) {
                                    z8 = g11.f40853y;
                                }
                                if (z8) {
                                    t2.E g12 = jVar2.f39808h.g();
                                    g12.i();
                                    synchronized (g12.f40830a) {
                                        str = g12.f40854z;
                                    }
                                    if (jVar2.f39814o.b(binderC4075vi3.f34844n, str, binderC4075vi3.f34845u.f41217n)) {
                                        return;
                                    }
                                    jVar2.f39808h.g().e(false);
                                    jVar2.f39808h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.qc)).booleanValue()) {
                AbstractC3212fg.f30738a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ti

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4075vi f34446u;

                    {
                        this.f34446u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C2934ab c2934ab;
                        boolean z8;
                        String str;
                        switch (i9) {
                            case 0:
                                AbstractC3035cL.k(this.f34446u.f34844n, true);
                                return;
                            case 1:
                                BinderC4075vi binderC4075vi = this.f34446u;
                                binderC4075vi.getClass();
                                C3851ra c3851ra = p2.j.f39798C.f39813n;
                                if (c3851ra.f34041n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4075vi.f34844n;
                                c3851ra.f34042u = context2;
                                c3851ra.f34043v = binderC4075vi.f34841G;
                                if (c3851ra.f34045x != null || context2 == null || (b9 = AbstractC4846f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4846f.a(context2, b9, c3851ra);
                                return;
                            case 2:
                                BinderC4075vi binderC4075vi2 = this.f34446u;
                                binderC4075vi2.getClass();
                                BinderC2483Be binderC2483Be = new BinderC2483Be("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3550lw c3550lw = binderC4075vi2.f34837C;
                                c3550lw.getClass();
                                try {
                                    try {
                                        IBinder b10 = AbstractC0415a.I(c3550lw.f32622a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c2934ab = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c2934ab = queryLocalInterface instanceof C2934ab ? (C2934ab) queryLocalInterface : new C2934ab(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel A02 = c2934ab.A0();
                                        AbstractC3241g8.e(A02, binderC2483Be);
                                        c2934ab.G0(A02, 1);
                                        return;
                                    } catch (Exception e6) {
                                        throw new u2.j(e6);
                                    }
                                } catch (RemoteException e9) {
                                    u2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e9.getMessage())));
                                    return;
                                } catch (u2.j e10) {
                                    u2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4075vi binderC4075vi3 = this.f34446u;
                                binderC4075vi3.getClass();
                                p2.j jVar2 = p2.j.f39798C;
                                t2.E g11 = jVar2.f39808h.g();
                                g11.i();
                                synchronized (g11.f40830a) {
                                    z8 = g11.f40853y;
                                }
                                if (z8) {
                                    t2.E g12 = jVar2.f39808h.g();
                                    g12.i();
                                    synchronized (g12.f40830a) {
                                        str = g12.f40854z;
                                    }
                                    if (jVar2.f39814o.b(binderC4075vi3.f34844n, str, binderC4075vi3.f34845u.f41217n)) {
                                        return;
                                    }
                                    jVar2.f39808h.g().e(false);
                                    jVar2.f39808h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31538R3)).booleanValue()) {
                AbstractC3212fg.f30738a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ti

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ BinderC4075vi f34446u;

                    {
                        this.f34446u = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b9;
                        C2934ab c2934ab;
                        boolean z8;
                        String str;
                        switch (i4) {
                            case 0:
                                AbstractC3035cL.k(this.f34446u.f34844n, true);
                                return;
                            case 1:
                                BinderC4075vi binderC4075vi = this.f34446u;
                                binderC4075vi.getClass();
                                C3851ra c3851ra = p2.j.f39798C.f39813n;
                                if (c3851ra.f34041n.getAndSet(true)) {
                                    return;
                                }
                                Context context2 = binderC4075vi.f34844n;
                                c3851ra.f34042u = context2;
                                c3851ra.f34043v = binderC4075vi.f34841G;
                                if (c3851ra.f34045x != null || context2 == null || (b9 = AbstractC4846f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                    return;
                                }
                                AbstractC4846f.a(context2, b9, c3851ra);
                                return;
                            case 2:
                                BinderC4075vi binderC4075vi2 = this.f34446u;
                                binderC4075vi2.getClass();
                                BinderC2483Be binderC2483Be = new BinderC2483Be("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                C3550lw c3550lw = binderC4075vi2.f34837C;
                                c3550lw.getClass();
                                try {
                                    try {
                                        IBinder b10 = AbstractC0415a.I(c3550lw.f32622a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b10 == null) {
                                            c2934ab = null;
                                        } else {
                                            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            c2934ab = queryLocalInterface instanceof C2934ab ? (C2934ab) queryLocalInterface : new C2934ab(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                        }
                                        Parcel A02 = c2934ab.A0();
                                        AbstractC3241g8.e(A02, binderC2483Be);
                                        c2934ab.G0(A02, 1);
                                        return;
                                    } catch (Exception e6) {
                                        throw new u2.j(e6);
                                    }
                                } catch (RemoteException e9) {
                                    u2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e9.getMessage())));
                                    return;
                                } catch (u2.j e10) {
                                    u2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                    return;
                                }
                            default:
                                BinderC4075vi binderC4075vi3 = this.f34446u;
                                binderC4075vi3.getClass();
                                p2.j jVar2 = p2.j.f39798C;
                                t2.E g11 = jVar2.f39808h.g();
                                g11.i();
                                synchronized (g11.f40830a) {
                                    z8 = g11.f40853y;
                                }
                                if (z8) {
                                    t2.E g12 = jVar2.f39808h.g();
                                    g12.i();
                                    synchronized (g12.f40830a) {
                                        str = g12.f40854z;
                                    }
                                    if (jVar2.f39814o.b(binderC4075vi3.f34844n, str, binderC4075vi3.f34845u.f41217n)) {
                                        return;
                                    }
                                    jVar2.f39808h.g().e(false);
                                    jVar2.f39808h.g().f("");
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31848z5)).booleanValue()) {
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31397A5)).booleanValue()) {
                    AbstractC3212fg.f30738a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ti

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ BinderC4075vi f34446u;

                        {
                            this.f34446u = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String b9;
                            C2934ab c2934ab;
                            boolean z8;
                            String str;
                            switch (i) {
                                case 0:
                                    AbstractC3035cL.k(this.f34446u.f34844n, true);
                                    return;
                                case 1:
                                    BinderC4075vi binderC4075vi = this.f34446u;
                                    binderC4075vi.getClass();
                                    C3851ra c3851ra = p2.j.f39798C.f39813n;
                                    if (c3851ra.f34041n.getAndSet(true)) {
                                        return;
                                    }
                                    Context context2 = binderC4075vi.f34844n;
                                    c3851ra.f34042u = context2;
                                    c3851ra.f34043v = binderC4075vi.f34841G;
                                    if (c3851ra.f34045x != null || context2 == null || (b9 = AbstractC4846f.b(context2)) == null || b9.equals(context2.getPackageName())) {
                                        return;
                                    }
                                    AbstractC4846f.a(context2, b9, c3851ra);
                                    return;
                                case 2:
                                    BinderC4075vi binderC4075vi2 = this.f34446u;
                                    binderC4075vi2.getClass();
                                    BinderC2483Be binderC2483Be = new BinderC2483Be("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                    C3550lw c3550lw = binderC4075vi2.f34837C;
                                    c3550lw.getClass();
                                    try {
                                        try {
                                            IBinder b10 = AbstractC0415a.I(c3550lw.f32622a).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                            if (b10 == null) {
                                                c2934ab = null;
                                            } else {
                                                IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                                c2934ab = queryLocalInterface instanceof C2934ab ? (C2934ab) queryLocalInterface : new C2934ab(b10, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 2);
                                            }
                                            Parcel A02 = c2934ab.A0();
                                            AbstractC3241g8.e(A02, binderC2483Be);
                                            c2934ab.G0(A02, 1);
                                            return;
                                        } catch (Exception e6) {
                                            throw new u2.j(e6);
                                        }
                                    } catch (RemoteException e9) {
                                        u2.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e9.getMessage())));
                                        return;
                                    } catch (u2.j e10) {
                                        u2.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                        return;
                                    }
                                default:
                                    BinderC4075vi binderC4075vi3 = this.f34446u;
                                    binderC4075vi3.getClass();
                                    p2.j jVar2 = p2.j.f39798C;
                                    t2.E g11 = jVar2.f39808h.g();
                                    g11.i();
                                    synchronized (g11.f40830a) {
                                        z8 = g11.f40853y;
                                    }
                                    if (z8) {
                                        t2.E g12 = jVar2.f39808h.g();
                                        g12.i();
                                        synchronized (g12.f40830a) {
                                            str = g12.f40854z;
                                        }
                                        if (jVar2.f39814o.b(binderC4075vi3.f34844n, str, binderC4075vi3.f34845u.f41217n)) {
                                            return;
                                        }
                                        jVar2.f39808h.g().e(false);
                                        jVar2.f39808h.g().f("");
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                }
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31515O5)).booleanValue()) {
                C3166ep c3166ep = this.f34842H;
                C3157eg c3157eg = AbstractC3212fg.f30743f;
                Objects.requireNonNull(c3166ep);
                c3157eg.execute(new RunnableC3068d(27, c3166ep));
            }
        }
    }

    @Override // q2.InterfaceC4890g0
    public final void c1(V2.a aVar, String str) {
        if (aVar == null) {
            int i = t2.C.f40822b;
            u2.i.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) V2.b.A0(aVar);
        if (context == null) {
            int i4 = t2.C.f40822b;
            u2.i.c("Context is null. Failed to open debug menu.");
        } else {
            C5074h c5074h = new C5074h(context);
            c5074h.f40897d = str;
            c5074h.f40898e = this.f34845u.f41217n;
            c5074h.b();
        }
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized void d0(boolean z8) {
        C5067a c5067a = p2.j.f39798C.i;
        synchronized (c5067a) {
            c5067a.f40873a = z8;
        }
    }

    @Override // q2.InterfaceC4890g0
    public final void g2(q2.X0 x02) {
        C2569Gf c2569Gf = this.f34850z;
        Context context = this.f34844n;
        c2569Gf.getClass();
        C2518Df p6 = C2518Df.p(context);
        C2467Af c2467Af = (C2467Af) ((C4009uN) p6.f24455w).d();
        ((S2.a) p6.f24453u).getClass();
        c2467Af.a(-1, System.currentTimeMillis());
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31596Y0)).booleanValue() && c2569Gf.a(context) && C2569Gf.g(context)) {
            synchronized (c2569Gf.f25188j) {
            }
        }
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized float j() {
        return p2.j.f39798C.i.a();
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized boolean k() {
        boolean z8;
        C5067a c5067a = p2.j.f39798C.i;
        synchronized (c5067a) {
            z8 = c5067a.f40873a;
        }
        return z8;
    }

    @Override // q2.InterfaceC4890g0
    public final synchronized void k1(float f6) {
        C5067a c5067a = p2.j.f39798C.i;
        synchronized (c5067a) {
            c5067a.f40874b = f6;
        }
    }

    @Override // q2.InterfaceC4890g0
    public final String m() {
        return this.f34845u.f41217n;
    }

    @Override // q2.InterfaceC4890g0
    public final List n() {
        return this.f34849y.b();
    }

    @Override // q2.InterfaceC4890g0
    public final void w() {
        this.f34849y.f24570q = false;
    }

    @Override // q2.InterfaceC4890g0
    public final void w0(boolean z8) {
        try {
            Rx.g(this.f34844n).m(z8);
        } catch (IOException e6) {
            throw new RemoteException(e6.getMessage());
        }
    }

    @Override // q2.InterfaceC4890g0
    public final void z2(InterfaceC3423jd interfaceC3423jd) {
        this.f34839E.v(interfaceC3423jd);
    }
}
