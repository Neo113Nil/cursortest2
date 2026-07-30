package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class au0 {
    public final long a;
    public final ku0 b;

    public au0() {
        long d = la0.d(4284900966L);
        ku0 ku0Var = new ku0();
        this.a = d;
        this.b = ku0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!au0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        au0 au0Var = (au0) obj;
        return hi.c(this.a, au0Var.a) && Intrinsics.a(this.b, au0Var.b);
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        qy0.r(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
