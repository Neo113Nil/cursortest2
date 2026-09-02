package I1;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1125a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f1125a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f1125a.equals(((b) obj).f1125a);
    }

    public final int hashCode() {
        return this.f1125a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0005f.q(new StringBuilder("Encoding{name=\""), this.f1125a, "\"}");
    }
}
