package a3;

import android.view.WindowInsets;
import c2.g0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o3.k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f210e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0 f211i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(e0 e0Var, g0 g0Var, int i3) {
        super(1);
        this.f209d = i3;
        this.f210e = e0Var;
        this.f211i = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets b10;
        switch (this.f209d) {
            case 0:
                d2.v vVar = (d2.v) obj;
                if (!(vVar instanceof d2.v)) {
                    vVar = null;
                }
                e0 e0Var = this.f210e;
                if (vVar != null) {
                    HashMap<n, g0> holderToLayoutNode = vVar.getAndroidViewsHandler$ui().getHolderToLayoutNode();
                    g0 g0Var = this.f211i;
                    holderToLayoutNode.put(e0Var, g0Var);
                    vVar.getAndroidViewsHandler$ui().addView(e0Var);
                    vVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(g0Var, e0Var);
                    e0Var.setImportantForAccessibility(1);
                    o3.c0.d(e0Var, new d2.n(vVar, g0Var, vVar));
                }
                if (e0Var.getView().getParent() != e0Var) {
                    e0Var.addView(e0Var.getView());
                }
                break;
            case 1:
                o.d(this.f210e, this.f211i);
                break;
            default:
                g0 g0Var2 = this.f211i;
                e0 e0Var2 = this.f210e;
                o.d(e0Var2, g0Var2);
                e0Var2.f235i.U = true;
                int[] iArr = e0Var2.B;
                int i3 = iArr[0];
                int i10 = iArr[1];
                e0Var2.getView().getLocationOnScreen(iArr);
                long j = e0Var2.C;
                long J = ((a2.n) obj).J();
                e0Var2.C = J;
                k1 k1Var = e0Var2.D;
                if (k1Var != null && ((i3 != iArr[0] || i10 != iArr[1] || !x2.k.a(j, J)) && (b10 = e0Var2.m(k1Var).b()) != null)) {
                    e0Var2.getView().dispatchApplyWindowInsets(b10);
                }
                break;
        }
        return Unit.f5554a;
    }
}
