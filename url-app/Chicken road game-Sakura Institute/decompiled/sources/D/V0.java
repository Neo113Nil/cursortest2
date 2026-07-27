package D;

import A.AbstractC0017m;
import C.C0113h;
import Z.C0323u;
import kotlin.jvm.internal.Intrinsics;
import y2.y;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1668a = C0323u.f4547g;

    /* renamed from: b, reason: collision with root package name */
    public final C0113h f1669b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        return C0323u.c(this.f1668a, v02.f1668a) && Intrinsics.a(this.f1669b, v02.f1669b);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        int hashCode = Long.hashCode(this.f1668a) * 31;
        C0113h c0113h = this.f1669b;
        return hashCode + (c0113h != null ? c0113h.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AbstractC0017m.s(this.f1668a, sb, ", rippleAlpha=");
        sb.append(this.f1669b);
        sb.append(')');
        return sb.toString();
    }
}
