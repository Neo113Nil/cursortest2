package androidx.compose.foundation.selection;

import S.l;
import S.o;
import androidx.compose.foundation.d;
import androidx.compose.material3.MinimumInteractiveModifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m.Q;
import m.W;
import p.C0935k;
import s0.C1157n;
import y0.f;

/* loaded from: classes.dex */
public abstract class b {
    public static final o a(o oVar, boolean z4, C0935k c0935k, Q q2, boolean z5, f fVar, Function0 function0) {
        o b4;
        if (q2 instanceof W) {
            b4 = new SelectableElement(z4, c0935k, (W) q2, z5, fVar, function0);
        } else if (q2 == null) {
            b4 = new SelectableElement(z4, c0935k, null, z5, fVar, function0);
        } else {
            l lVar = l.f3977a;
            if (c0935k != null) {
                b4 = d.a(lVar, c0935k, q2).h(new SelectableElement(z4, c0935k, null, z5, fVar, function0));
            } else {
                b4 = S.a.b(lVar, C1157n.f10272m, new a(q2, z4, z5, fVar, function0));
            }
        }
        return oVar.h(b4);
    }

    public static final o b(MinimumInteractiveModifier minimumInteractiveModifier, boolean z4, C0935k c0935k, boolean z5, f fVar, Function1 function1) {
        return minimumInteractiveModifier.h(new ToggleableElement(z4, c0935k, z5, fVar, function1));
    }
}
