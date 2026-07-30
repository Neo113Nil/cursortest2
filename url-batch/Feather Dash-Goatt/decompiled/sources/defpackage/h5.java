package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class h5 implements PointerInputEventHandler {
    public final /* synthetic */ i5 a;

    public h5(i5 i5Var) {
        this.a = i5Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ux0 ux0Var, dn dnVar) {
        Object n = m90.n(ux0Var, new g5(this.a, null), dnVar);
        return n == tn.d ? n : Unit.a;
    }
}
