package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class oc1 implements az {
    public final float d;
    public final Object e;

    public oc1(float f, Object obj) {
        this.d = f;
        this.e = obj;
    }

    @Override // defpackage.p7
    public final qm1 a(c51 c51Var) {
        Object obj = this.e;
        return new nq0(this.d, obj == null ? null : (v7) ((Function1) c51Var.e).invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oc1)) {
            return false;
        }
        oc1 oc1Var = (oc1) obj;
        return oc1Var.d == this.d && Intrinsics.a(oc1Var.e, this.e);
    }

    public final int hashCode() {
        Object obj = this.e;
        return Float.hashCode(this.d) + qy0.b(1.0f, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
