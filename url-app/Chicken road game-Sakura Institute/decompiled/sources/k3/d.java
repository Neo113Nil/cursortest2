package k3;

import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5353a;

    public d(String str) {
        k.f(str, "name");
        this.f5353a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return k.a(this.f5353a, ((d) obj).f5353a);
    }

    public final int hashCode() {
        return this.f5353a.hashCode();
    }

    public final String toString() {
        return this.f5353a;
    }
}
