package W1;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3418a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f3418a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3418a.equals(((c) obj).f3418a);
    }

    public final int hashCode() {
        return this.f3418a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC5051n.g(new StringBuilder("Encoding{name=\""), this.f3418a, "\"}");
    }
}
