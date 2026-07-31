package r0;

import kotlin.jvm.internal.i;
import l0.q;
import q0.C0593a;
import u0.C0686p;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612d extends AbstractC0610b {
    static {
        i.d(q.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // r0.AbstractC0610b
    public final boolean a(C0686p workSpec) {
        i.e(workSpec, "workSpec");
        return workSpec.f6009j.f5255a == 4;
    }

    @Override // r0.AbstractC0610b
    public final boolean b(Object obj) {
        C0593a value = (C0593a) obj;
        i.e(value, "value");
        return (value.f5749a && value.f5752d) ? false : true;
    }
}
