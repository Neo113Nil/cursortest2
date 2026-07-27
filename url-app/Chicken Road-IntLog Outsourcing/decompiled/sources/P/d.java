package P;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2273a;

    public d(String name) {
        i.e(name, "name");
        this.f2273a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f2273a, ((d) obj).f2273a);
    }

    public final int hashCode() {
        return this.f2273a.hashCode();
    }

    public final String toString() {
        return this.f2273a;
    }
}
