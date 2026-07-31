package b4;

import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1244a;

    public c(String str) {
        this.f1244a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return i.a(this.f1244a, ((c) obj).f1244a);
    }

    public final int hashCode() {
        return this.f1244a.hashCode();
    }

    public final String toString() {
        return this.f1244a;
    }
}
