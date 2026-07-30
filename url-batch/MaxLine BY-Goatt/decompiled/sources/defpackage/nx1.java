package defpackage;

import defpackage.q13;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nx1 {
    public final long a;
    public final zx1 b;

    public nx1() {
        long d = ap.d(4284900966L);
        zx1 zx1Var = new zx1(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = d;
        this.b = zx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nx1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        nx1 nx1Var = (nx1) obj;
        return aw.c(this.a, nx1Var.a) && Intrinsics.b(this.b, nx1Var.b);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        in1.o(this.a, sb, ", drawPadding=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
