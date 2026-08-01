package a2;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends c2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f182b;

    public x(c0 c0Var, Function2 function2) {
        this.f181a = c0Var;
        this.f182b = function2;
    }

    @Override // a2.g0
    public final h0 a(i0 i0Var, List list, long j) {
        c0 c0Var = this.f181a;
        v vVar = c0Var.f67u;
        vVar.f164d = i0Var.getLayoutDirection();
        vVar.f165e = i0Var.g();
        vVar.f166i = i0Var.d();
        boolean j3 = i0Var.j();
        Function2 function2 = this.f182b;
        if (j3 || c0Var.f61d.f1556v == null) {
            c0Var.f63i = 0;
            h0 h0Var = (h0) function2.invoke(vVar, new x2.a(j));
            return new w(h0Var, c0Var, c0Var.f63i, h0Var, 1);
        }
        c0Var.f64r = 0;
        h0 h0Var2 = (h0) function2.invoke(c0Var.f68v, new x2.a(j));
        return new w(h0Var2, c0Var, c0Var.f64r, h0Var2, 0);
    }
}
