package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kx0 {
    public final hx0 a;

    public kx0(hx0 hx0Var) {
        this.a = hx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kx0) {
            return Intrinsics.a(this.a, ((kx0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        hx0 hx0Var = this.a;
        if (hx0Var != null) {
            return hx0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.a + ')';
    }
}
