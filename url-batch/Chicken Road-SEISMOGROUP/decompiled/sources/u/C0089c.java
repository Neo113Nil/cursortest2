package u;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089c {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f1268a;

    /* renamed from: b, reason: collision with root package name */
    public final C0088b f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final C0088b f1270c;

    public C0089c(r.b bVar, C0088b c0088b, C0088b c0088b2) {
        this.f1268a = bVar;
        this.f1269b = c0088b;
        this.f1270c = c0088b2;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f1233a != 0 && bVar.f1234b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0089c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0089c c0089c = (C0089c) obj;
        return e0.h.a(this.f1268a, c0089c.f1268a) && e0.h.a(this.f1269b, c0089c.f1269b) && e0.h.a(this.f1270c, c0089c.f1270c);
    }

    public final int hashCode() {
        return this.f1270c.hashCode() + ((this.f1269b.hashCode() + (this.f1268a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0089c.class.getSimpleName() + " { " + this.f1268a + ", type=" + this.f1269b + ", state=" + this.f1270c + " }";
    }
}
