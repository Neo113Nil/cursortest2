package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u00 extends pc0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v00 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u00(v00 v00Var, int i) {
        super(1);
        this.d = i;
        this.e = v00Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        v00 v00Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                qf qfVar = (qf) obj;
                View j = m90.j(v00Var);
                if (!j.isFocused() && !j.hasFocus()) {
                    b10 focusOwner = ((d4) op.J(v00Var)).getFocusOwner();
                    View K = m90.K(v00Var);
                    Integer c = y00.c(qfVar.a);
                    int[] iArr = new int[2];
                    K.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    j.getLocationOnScreen(iArr2);
                    o10 E = uq1.E(((e10) focusOwner).c);
                    Rect rect = null;
                    s11 G = E != null ? uq1.G(E) : null;
                    if (G != null) {
                        int i2 = (int) G.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) G.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) G.c) + i3) - i4, (((int) G.d) + i6) - i7);
                    }
                    if (!y00.b(j, c, rect)) {
                        qfVar.b = true;
                    }
                }
                break;
            default:
                m90.j(v00Var);
                break;
        }
        return Unit.a;
    }
}
