package a2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface i0 extends x2.c {
    static h0 V(i0 i0Var, int i3, int i10, Function1 function1) {
        kotlin.collections.k0 k0Var = kotlin.collections.k0.f5575d;
        k0Var.getClass();
        return i0Var.t(i3, i10, k0Var, function1);
    }

    x2.l getLayoutDirection();

    boolean j();

    default h0 t(int i3, int i10, Map map, Function1 function1) {
        return x(i3, i10, map, null, function1);
    }

    h0 x(int i3, int i10, Map map, Function1 function1, Function1 function12);
}
