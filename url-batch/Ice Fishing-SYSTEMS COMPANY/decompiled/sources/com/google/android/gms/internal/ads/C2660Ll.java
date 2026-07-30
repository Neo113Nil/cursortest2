package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Ll, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2660Ll extends AbstractC2539Ej {

    /* renamed from: l, reason: collision with root package name */
    public final Context f26201l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f26202m;

    /* renamed from: n, reason: collision with root package name */
    public final Nu f26203n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2779Sl f26204o;

    /* renamed from: p, reason: collision with root package name */
    public final C2692Nj f26205p;

    /* renamed from: q, reason: collision with root package name */
    public final Iw f26206q;

    /* renamed from: r, reason: collision with root package name */
    public final C4293zk f26207r;

    /* renamed from: s, reason: collision with root package name */
    public final C2994bg f26208s;

    /* renamed from: t, reason: collision with root package name */
    public final C3165eo f26209t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26210u;

    public C2660Ll(S0.q qVar, Context context, InterfaceC3858rh interfaceC3858rh, Nu nu, InterfaceC2779Sl interfaceC2779Sl, C2692Nj c2692Nj, Iw iw, C4293zk c4293zk, C2994bg c2994bg, C3165eo c3165eo) {
        super(qVar);
        this.f26210u = false;
        this.f26201l = context;
        this.f26202m = new WeakReference(interfaceC3858rh);
        this.f26203n = nu;
        this.f26204o = interfaceC2779Sl;
        this.f26205p = c2692Nj;
        this.f26206q = iw;
        this.f26207r = c4293zk;
        this.f26208s = c2994bg;
        this.f26209t = c3165eo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z8) {
        Ut J;
        int i;
        Nu nu = this.f26203n;
        nu.u1(C3431jl.f32189z);
        t2.G g9 = p2.j.f39798C.f39803c;
        InterfaceC2779Sl interfaceC2779Sl = this.f26204o;
        boolean m8 = t2.G.m(interfaceC2779Sl.d());
        Context context = this.f26201l;
        C4293zk c4293zk = this.f26207r;
        if (!m8) {
            C3151ea c3151ea = AbstractC3368ia.bf;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                t2.G.l(context, this.f24804b, this.f26209t);
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31698j1)).booleanValue() && t2.G.g(context)) {
                int i4 = t2.C.f40822b;
                u2.i.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                c4293zk.c();
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31708k1)).booleanValue()) {
                    this.f26206q.a(((Wt) this.f24803a.f29349b.f24454v).f28491b);
                    return;
                }
                return;
            }
        }
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f26202m.get();
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.qd)).booleanValue() && interfaceC3858rh != null && (J = interfaceC3858rh.J()) != null && J.f28172r0) {
            C2994bg c2994bg = this.f26208s;
            synchronized (c2994bg.f29527n) {
                C2939ag c2939ag = c2994bg.f29530w;
                synchronized (c2939ag.f29246f) {
                    i = c2939ag.f29251l;
                }
            }
            if (J.f28174s0 != i) {
                int i9 = t2.C.f40822b;
                u2.i.f("The interstitial consent form has been shown.");
                c4293zk.U(AbstractC3217fl.M(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f26210u) {
            int i10 = t2.C.f40822b;
            u2.i.f("The interstitial ad has been shown.");
            c4293zk.U(AbstractC3217fl.M(10, null, null));
        }
        if (this.f26210u) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            interfaceC2779Sl.h(z8, activity, c4293zk);
            nu.v1();
            this.f26210u = true;
        } catch (C2762Rl e6) {
            c4293zk.V(e6);
        }
    }

    public final void finalize() {
        try {
            InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f26202m.get();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31424D7)).booleanValue()) {
                if (!this.f26210u && interfaceC3858rh != null) {
                    AbstractC3212fg.f30743f.execute(new RunnableC3968tj(interfaceC3858rh, 2));
                }
            } else if (interfaceC3858rh != null) {
                interfaceC3858rh.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
