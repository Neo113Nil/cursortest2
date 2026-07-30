package p1;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends r1.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f7112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6.e f7113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, q6.e eVar, String str) {
        super(str);
        this.f7112b = b0Var;
        this.f7113c = eVar;
    }

    @Override // p1.f0
    public final g0 a(h0 h0Var, List list, long j8) {
        b0 b0Var = this.f7112b;
        w wVar = b0Var.f7025m;
        wVar.f7102f = h0Var.getLayoutDirection();
        wVar.f7103g = h0Var.a();
        wVar.f7104h = h0Var.m();
        boolean v5 = h0Var.v();
        q6.e eVar = this.f7113c;
        if (v5 || b0Var.f7018f.f7721h == null) {
            b0Var.f7021i = 0;
            g0 g0Var = (g0) eVar.d(wVar, new m2.a(j8));
            return new x(g0Var, b0Var, b0Var.f7021i, g0Var, 1);
        }
        b0Var.f7022j = 0;
        g0 g0Var2 = (g0) eVar.d(b0Var.f7026n, new m2.a(j8));
        return new x(g0Var2, b0Var, b0Var.f7022j, g0Var2, 0);
    }
}
