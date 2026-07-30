package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h3 extends pc0 implements t30 {
    public final /* synthetic */ i3 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(i3 i3Var, int i) {
        super(4);
        this.d = i3Var;
        this.e = i;
    }

    @Override // defpackage.t30
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        i3 i3Var = this.d;
        nq0 nq0Var = i3Var.d;
        ((AutofillManager) nq0Var.e).notifyViewEntered(i3Var.g, this.e, new Rect(intValue, intValue2, intValue3, intValue4));
        return Unit.a;
    }
}
