package M0;

import G0.s;
import G0.t;
import P0.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends b {
    static {
        Intrinsics.checkNotNullExpressionValue(s.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // M0.b
    public final boolean a(p workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.f794a == t.f828l;
    }

    @Override // M0.b
    public final boolean b(Object obj) {
        L0.a value = (L0.a) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.f1656a && value.f1659d) ? false : true;
    }
}
