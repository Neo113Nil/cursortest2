package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y0 extends wd.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i3) {
        super(2);
        this.f183d = i3;
        this.f184e = z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f183d) {
            case 0:
                this.f184e.a().f62e = (n0.o) obj2;
                break;
            case 1:
                ((c2.g0) obj).Y(new x(this.f184e.a(), (Function2) obj2));
                break;
            default:
                c2.g0 g0Var = (c2.g0) obj;
                c0 c0Var = g0Var.U;
                if (c0Var == null) {
                    c0Var = new c0(g0Var);
                    g0Var.U = c0Var;
                }
                z0 z0Var = this.f184e;
                z0Var.f187a = c0Var;
                z0Var.a().c();
                z0Var.a();
                break;
        }
        return Unit.f5554a;
    }
}
