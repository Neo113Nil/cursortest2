package I;

import j.C0550x;

/* renamed from: I.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0550x f2793a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0140b0) {
            return f2.j.a(this.f2793a, ((C0140b0) obj).f2793a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2793a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f2793a + ')';
    }
}
