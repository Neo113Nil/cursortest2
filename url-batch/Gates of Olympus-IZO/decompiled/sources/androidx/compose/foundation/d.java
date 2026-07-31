package androidx.compose.foundation;

import I.C0113p;
import U.l;
import Y1.f;
import Z1.j;
import f.AbstractC0382a;
import n.k0;
import o.C0737m;
import o.J;

/* loaded from: classes.dex */
public final class d extends j implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0737m f3613g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k0 k0Var, boolean z3, C0737m c0737m, boolean z4) {
        super(3);
        this.f3611e = k0Var;
        this.f3612f = z3;
        this.f3613g = c0737m;
        this.f3614h = z4;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0113p c0113p = (C0113p) obj2;
        ((Number) obj3).intValue();
        c0113p.Q(1478351300);
        k0 k0Var = this.f3611e;
        boolean z3 = this.f3612f;
        C0737m c0737m = this.f3613g;
        boolean z4 = this.f3614h;
        l e3 = AbstractC0382a.w(new ScrollSemanticsElement(k0Var, z3, c0737m, z4), k0Var, J.f6443d, z4, z3, c0737m, k0Var.f6108c, c0113p).e(new ScrollingLayoutElement(k0Var, this.f3612f));
        c0113p.p(false);
        return e3;
    }
}
