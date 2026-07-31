package F;

import E.C0027i;
import H2.AbstractC0080b;
import b0.C0288u;

/* renamed from: F.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078z0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1440a = C0288u.f4296f;

    /* renamed from: b, reason: collision with root package name */
    public final C0027i f1441b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0078z0)) {
            return false;
        }
        C0078z0 c0078z0 = (C0078z0) obj;
        return C0288u.c(this.f1440a, c0078z0.f1440a) && Z1.i.a(this.f1441b, c0078z0.f1441b);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        int hashCode = Long.hashCode(this.f1440a) * 31;
        C0027i c0027i = this.f1441b;
        return hashCode + (c0027i != null ? c0027i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        AbstractC0080b.q(this.f1440a, sb, ", rippleAlpha=");
        sb.append(this.f1441b);
        sb.append(')');
        return sb.toString();
    }
}
