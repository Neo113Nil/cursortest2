package d0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n2 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0.o f2211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f2212h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m2.b f2213i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t3 f2214j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f2215k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q6.c f2216l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2217m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a2.k0 f2218n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w.i0 f2219o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ w.h0 f2220p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f2221q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2222r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2223s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a0.s f2224t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p.j f2225u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2226v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(s0.o oVar, q6.e eVar, m2.b bVar, t3 t3Var, String str, q6.c cVar, boolean z8, a2.k0 k0Var, w.i0 i0Var, w.h0 h0Var, boolean z9, int i7, int i8, a0.s sVar, p.j jVar, z0.p0 p0Var) {
        super(2);
        this.f2211g = oVar;
        this.f2212h = eVar;
        this.f2213i = bVar;
        this.f2214j = t3Var;
        this.f2215k = str;
        this.f2216l = cVar;
        this.f2217m = z8;
        this.f2218n = k0Var;
        this.f2219o = i0Var;
        this.f2220p = h0Var;
        this.f2221q = z9;
        this.f2222r = i7;
        this.f2223s = i8;
        this.f2224t = sVar;
        this.f2225u = jVar;
        this.f2226v = p0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            q6.e eVar = this.f2212h;
            s0.o oVar = s0.l.f8103a;
            if (eVar != null) {
                oVar = androidx.compose.foundation.layout.b.h(y1.k.a(oVar, true, a0.f1814k), 0.0f, this.f2213i.G(r2.f2359b), 0.0f, 0.0f, 13);
            }
            s0.o j8 = this.f2211g.j(oVar);
            pVar.k(AndroidCompositionLocals_androidKt.f738a);
            ((Context) pVar.k(AndroidCompositionLocals_androidKt.f739b)).getResources().getString(R.string.default_error_message);
            float f9 = e0.o.f2714b;
            s0.o a3 = androidx.compose.foundation.layout.c.a(j8, k2.f2130c, k2.f2129b);
            t3 t3Var = this.f2214j;
            z0.r0 r0Var = new z0.r0(t3Var.f2414i);
            q6.e eVar2 = this.f2212h;
            z0.p0 p0Var = this.f2226v;
            String str = this.f2215k;
            boolean z8 = this.f2217m;
            boolean z9 = this.f2221q;
            a0.s sVar = this.f2224t;
            p.j jVar = this.f2225u;
            w.g.a(str, this.f2216l, a3, z8, this.f2218n, this.f2219o, this.f2220p, z9, this.f2222r, this.f2223s, sVar, null, jVar, r0Var, o0.f.b(1474611661, new m2(str, z8, z9, sVar, jVar, eVar2, t3Var, p0Var), pVar), pVar, 0);
        }
        return d6.z.f2639a;
    }
}
