package A0;

import N.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f42a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f42a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f42a.equals(((c) obj).f42a);
    }

    public final int hashCode() {
        return this.f42a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.b(new StringBuilder("Encoding{name=\""), this.f42a, "\"}");
    }
}
