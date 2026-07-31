package I;

import j.C0506x;

/* renamed from: I.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0506x f2236a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0086b0) {
            return Z1.i.a(this.f2236a, ((C0086b0) obj).f2236a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2236a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f2236a + ')';
    }
}
