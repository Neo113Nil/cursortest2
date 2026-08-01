package h6;

import a2.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4478a;

    public c(String str) {
        if (str != null) {
            this.f4478a = str;
        } else {
            r.j("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f4478a.equals(((c) obj).f4478a);
    }

    public final int hashCode() {
        return this.f4478a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return v4.a.o(new StringBuilder("Encoding{name=\""), this.f4478a, "\"}");
    }
}
