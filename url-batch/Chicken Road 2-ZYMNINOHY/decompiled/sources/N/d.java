package N;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1790a;

    public d(String name) {
        i.e(name, "name");
        this.f1790a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f1790a, ((d) obj).f1790a);
    }

    public final int hashCode() {
        return this.f1790a.hashCode();
    }

    public final String toString() {
        return this.f1790a;
    }
}
