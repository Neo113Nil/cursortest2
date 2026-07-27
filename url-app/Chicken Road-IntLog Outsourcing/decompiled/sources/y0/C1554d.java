package y0;

import B0.q;
import kotlin.jvm.internal.i;
import s0.s;
import x0.C1535a;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554d extends AbstractC1552b {
    static {
        i.d(s.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // y0.AbstractC1552b
    public final boolean a(q workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.f182j.f11762a == 4;
    }

    @Override // y0.AbstractC1552b
    public final boolean b(Object obj) {
        C1535a value = (C1535a) obj;
        i.e(value, "value");
        return (value.f12254a && value.f12257d) ? false : true;
    }
}
