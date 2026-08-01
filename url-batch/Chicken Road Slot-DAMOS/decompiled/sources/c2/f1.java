package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f1 extends wd.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f1540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(i1 i1Var, int i3) {
        super(0);
        this.f1539d = i3;
        this.f1540e = i1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1539d) {
            case 0:
                i1 i1Var = this.f1540e;
                k1.n nVar = i1Var.U;
                nVar.getClass();
                i1Var.x0(nVar, i1Var.T);
                break;
            default:
                i1 i1Var2 = this.f1540e.D;
                if (i1Var2 != null) {
                    i1Var2.K0();
                }
                break;
        }
        return Unit.f5554a;
    }
}
