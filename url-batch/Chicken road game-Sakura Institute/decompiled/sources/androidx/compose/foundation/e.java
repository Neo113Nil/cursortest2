package androidx.compose.foundation;

import g0.p;
import m.g1;
import o.j0;
import q6.f;
import r6.l;
import s0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends l implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g1 g1Var) {
        super(3);
        this.f605g = g1Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        p pVar = (p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(1478351300);
        g1 g1Var = this.f605g;
        o j8 = a8.d.X(new ScrollSemanticsElement(g1Var), g1Var, j0.f6657f, true, null, g1Var.f6161c, pVar).j(new ScrollingLayoutElement(g1Var));
        pVar.p(false);
        return j8;
    }
}
