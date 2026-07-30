package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface xk0 extends nr {
    static wk0 q(xk0 xk0Var, int i, int i2, Function1 function1) {
        ov ovVar = ov.d;
        ovVar.getClass();
        return xk0Var.w(i, i2, ovVar, function1);
    }

    wk0 D(int i, int i2, Map map, Function1 function1, Function1 function12);

    vc0 getLayoutDirection();

    boolean m();

    default wk0 w(int i, int i2, Map map, Function1 function1) {
        return D(i, i2, map, null, function1);
    }
}
