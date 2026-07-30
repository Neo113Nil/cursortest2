package T;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2555a;

    public d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2555a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return Intrinsics.a(this.f2555a, ((d) obj).f2555a);
    }

    public final int hashCode() {
        return this.f2555a.hashCode();
    }

    public final String toString() {
        return this.f2555a;
    }
}
