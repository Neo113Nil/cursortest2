package androidx.compose.foundation;

import I.C0167p;
import U.q;
import e2.InterfaceC0427f;
import f2.k;
import n.y0;
import n.z0;
import p.C0775m;
import p.P;

/* loaded from: classes.dex */
public final class e extends k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f4789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0775m f4791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y0 y0Var, boolean z3, C0775m c0775m, boolean z4) {
        super(3);
        this.f4789e = y0Var;
        this.f4790f = z3;
        this.f4791g = c0775m;
        this.f4792h = z4;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(1478351300);
        y0 y0Var = this.f4789e;
        boolean z3 = this.f4790f;
        C0775m c0775m = this.f4791g;
        boolean z4 = this.f4792h;
        q i3 = z0.m(new ScrollSemanticsElement(y0Var, z3, c0775m, z4), y0Var, P.f7567d, z4, z3, c0775m, y0Var.f7244c, c0167p).i(new ScrollingLayoutElement(y0Var, this.f4790f));
        c0167p.p(false);
        return i3;
    }
}
