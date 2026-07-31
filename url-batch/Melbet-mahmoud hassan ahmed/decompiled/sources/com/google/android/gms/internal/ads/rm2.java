package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.b41;
import com.google.android.gms.internal.ads.ca1;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class rm2<AppOpenAd extends v61, AppOpenRequestComponent extends b41<AppOpenAd>, AppOpenRequestComponentBuilder extends ca1<AppOpenRequestComponent>> implements cd2<AppOpenAd> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11251a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11252b;

    /* renamed from: c, reason: collision with root package name */
    protected final bw0 f11253c;

    /* renamed from: d, reason: collision with root package name */
    private final in2 f11254d;

    /* renamed from: e, reason: collision with root package name */
    private final ep2<AppOpenRequestComponent, AppOpenAd> f11255e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewGroup f11256f;

    /* renamed from: g, reason: collision with root package name */
    private final qx2 f11257g;

    /* renamed from: h, reason: collision with root package name */
    private final is2 f11258h;

    /* renamed from: i, reason: collision with root package name */
    private cc3<AppOpenAd> f11259i;

    protected rm2(Context context, Executor executor, bw0 bw0Var, ep2<AppOpenRequestComponent, AppOpenAd> ep2Var, in2 in2Var, is2 is2Var) {
        this.f11251a = context;
        this.f11252b = executor;
        this.f11253c = bw0Var;
        this.f11255e = ep2Var;
        this.f11254d = in2Var;
        this.f11258h = is2Var;
        this.f11256f = new FrameLayout(context);
        this.f11257g = bw0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized AppOpenRequestComponentBuilder l(cp2 cp2Var) {
        qm2 qm2Var = (qm2) cp2Var;
        if (((Boolean) sw.c().b(m10.W5)).booleanValue()) {
            q41 q41Var = new q41(this.f11256f);
            fa1 fa1Var = new fa1();
            fa1Var.c(this.f11251a);
            fa1Var.f(qm2Var.f10757a);
            ha1 g7 = fa1Var.g();
            mg1 mg1Var = new mg1();
            mg1Var.f(this.f11254d, this.f11252b);
            mg1Var.o(this.f11254d, this.f11252b);
            return b(q41Var, g7, mg1Var.q());
        }
        in2 c7 = in2.c(this.f11254d);
        mg1 mg1Var2 = new mg1();
        mg1Var2.e(c7, this.f11252b);
        mg1Var2.j(c7, this.f11252b);
        mg1Var2.k(c7, this.f11252b);
        mg1Var2.l(c7, this.f11252b);
        mg1Var2.f(c7, this.f11252b);
        mg1Var2.o(c7, this.f11252b);
        mg1Var2.p(c7);
        q41 q41Var2 = new q41(this.f11256f);
        fa1 fa1Var2 = new fa1();
        fa1Var2.c(this.f11251a);
        fa1Var2.f(qm2Var.f10757a);
        return b(q41Var2, fa1Var2.g(), mg1Var2.q());
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final synchronized boolean a(kv kvVar, String str, ad2 ad2Var, bd2<? super AppOpenAd> bd2Var) {
        ox2 p7 = ox2.p(this.f11251a, 7, 7, kvVar);
        r3.o.e("loadAd must be called on the main UI thread.");
        if (str == null) {
            io0.d("Ad unit ID should not be null for app open ad.");
            this.f11252b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mm2
                @Override // java.lang.Runnable
                public final void run() {
                    rm2.this.j();
                }
            });
            if (p7 != null) {
                qx2 qx2Var = this.f11257g;
                p7.g(false);
                qx2Var.a(p7.i());
            }
            return false;
        }
        if (this.f11259i != null) {
            if (p7 != null) {
                qx2 qx2Var2 = this.f11257g;
                p7.g(false);
                qx2Var2.a(p7.i());
            }
            return false;
        }
        zs2.a(this.f11251a, kvVar.f7648k);
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && kvVar.f7648k) {
            this.f11253c.s().l(true);
        }
        is2 is2Var = this.f11258h;
        is2Var.H(str);
        is2Var.G(pv.g());
        is2Var.d(kvVar);
        ks2 f7 = is2Var.f();
        qm2 qm2Var = new qm2(null);
        qm2Var.f10757a = f7;
        cc3<AppOpenAd> a7 = this.f11255e.a(new fp2(qm2Var, null), new dp2() { // from class: com.google.android.gms.internal.ads.lm2
            @Override // com.google.android.gms.internal.ads.dp2
            public final ca1 a(cp2 cp2Var) {
                ca1 l7;
                l7 = rm2.this.l(cp2Var);
                return l7;
            }
        }, null);
        this.f11259i = a7;
        rb3.r(a7, new om2(this, bd2Var, p7, qm2Var), this.f11252b);
        return true;
    }

    protected abstract AppOpenRequestComponentBuilder b(q41 q41Var, ha1 ha1Var, og1 og1Var);

    final /* synthetic */ void j() {
        this.f11254d.d(dt2.d(6, null, null));
    }

    public final void k(vv vvVar) {
        this.f11258h.I(vvVar);
    }

    @Override // com.google.android.gms.internal.ads.cd2
    public final boolean zza() {
        cc3<AppOpenAd> cc3Var = this.f11259i;
        return (cc3Var == null || cc3Var.isDone()) ? false : true;
    }
}
