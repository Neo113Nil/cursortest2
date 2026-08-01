package b0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2.o0 f859e;

    public /* synthetic */ j(a2.o0 o0Var, int i3) {
        this.f858d = i3;
        this.f859e = o0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a2.n0 n0Var = (a2.n0) obj;
        switch (this.f858d) {
            case 0:
                a2.n0.p(n0Var, this.f859e, 0, 0);
                break;
            case 1:
                a2.n0.p(n0Var, this.f859e, 0, 0);
                break;
            case 2:
                a2.n0.p(n0Var, this.f859e, 0, 0);
                break;
            default:
                n0Var.h(this.f859e, 0, 0, 0.0f);
                break;
        }
        return Unit.f5554a;
    }
}
