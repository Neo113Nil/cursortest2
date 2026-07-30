package G;

import F0.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f332a;

    public d(String str) {
        i.e(str, "name");
        this.f332a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f332a, ((d) obj).f332a);
    }

    public final int hashCode() {
        return this.f332a.hashCode();
    }

    public final String toString() {
        return this.f332a;
    }
}
