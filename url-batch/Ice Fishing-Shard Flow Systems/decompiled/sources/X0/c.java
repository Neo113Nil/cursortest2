package X0;

import r4.f;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2850a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f2850a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f2850a.equals(((c) obj).f2850a);
    }

    public final int hashCode() {
        return this.f2850a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f.f(new StringBuilder("Encoding{name=\""), this.f2850a, "\"}");
    }
}
