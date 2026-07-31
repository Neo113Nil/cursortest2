package r;

/* renamed from: r.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876x {

    /* renamed from: a, reason: collision with root package name */
    public final U.g f8093a;

    public C0876x(U.g gVar) {
        this.f8093a = gVar;
    }

    public final int a(int i3, O0.k kVar) {
        return this.f8093a.a(0, i3, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0876x) && f2.j.a(this.f8093a, ((C0876x) obj).f8093a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8093a.f4479a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f8093a + ')';
    }
}
