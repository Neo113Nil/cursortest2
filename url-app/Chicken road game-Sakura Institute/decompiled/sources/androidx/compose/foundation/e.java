package androidx.compose.foundation;

import G.C0216p;
import M2.p;
import S.o;
import m.u0;
import o.C0898m;
import o.N;

/* loaded from: classes.dex */
public final class e extends p implements L2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f5042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5043e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0898m f5044i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5045j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u0 u0Var, boolean z4, C0898m c0898m, boolean z5) {
        super(3);
        this.f5042d = u0Var;
        this.f5043e = z4;
        this.f5044i = c0898m;
        this.f5045j = z5;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C0216p c0216p = (C0216p) obj2;
        ((Number) obj3).intValue();
        c0216p.S(1478351300);
        u0 u0Var = this.f5042d;
        boolean z4 = this.f5043e;
        C0898m c0898m = this.f5044i;
        boolean z5 = this.f5045j;
        o h4 = u3.d.S(new ScrollSemanticsElement(u0Var, z4, c0898m, z5), u0Var, N.f8665d, z5, z4, c0898m, u0Var.f8196c, c0216p).h(new ScrollingLayoutElement(u0Var, this.f5043e));
        c0216p.q(false);
        return h4;
    }
}
