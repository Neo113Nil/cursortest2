package N;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f981a;

    public d(String name) {
        j.e(name, "name");
        this.f981a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return j.a(this.f981a, ((d) obj).f981a);
    }

    public final int hashCode() {
        return this.f981a.hashCode();
    }

    public final String toString() {
        return this.f981a;
    }
}
