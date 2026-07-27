package m;

import A.AbstractC0017m;
import Z.C0323u;
import kotlin.jvm.internal.Intrinsics;
import q.InterfaceC1021Z;
import y2.y;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8118a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1021Z f8119b;

    public g0() {
        long d4 = Z.K.d(4284900966L);
        q.a0 a4 = androidx.compose.foundation.layout.b.a(0.0f, 3);
        this.f8118a = d4;
        this.f8119b = a4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        g0 g0Var = (g0) obj;
        return C0323u.c(this.f8118a, g0Var.f8118a) && Intrinsics.a(this.f8119b, g0Var.f8119b);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return this.f8119b.hashCode() + (Long.hashCode(this.f8118a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0017m.s(this.f8118a, sb, ", drawPadding=");
        sb.append(this.f8119b);
        sb.append(')');
        return sb.toString();
    }
}
