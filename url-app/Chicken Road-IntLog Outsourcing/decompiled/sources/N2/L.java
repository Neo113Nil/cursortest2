package N2;

import a.AbstractC0169a;
import g4.AbstractC0466k;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final String f2073a;

    /* renamed from: b, reason: collision with root package name */
    public final J f2074b;

    public L(String str, J j2) {
        this.f2073a = str;
        this.f2074b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        L l2 = (L) obj;
        return AbstractC0169a.i(AbstractC0466k.A0(this.f2073a, this.f2074b), AbstractC0466k.A0(l2.f2073a, l2.f2074b));
    }

    public final int hashCode() {
        return AbstractC0466k.A0(this.f2073a, this.f2074b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2073a + ", type=" + this.f2074b + ")";
    }
}
