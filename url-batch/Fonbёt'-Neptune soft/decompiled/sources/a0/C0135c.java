package a0;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135c {

    /* renamed from: a, reason: collision with root package name */
    public final X.b f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final C0134b f1264b;

    /* renamed from: c, reason: collision with root package name */
    public final C0134b f1265c;

    public C0135c(X.b bVar, C0134b c0134b, C0134b c0134b2) {
        this.f1263a = bVar;
        this.f1264b = c0134b;
        this.f1265c = c0134b2;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f1121a != 0 && bVar.f1122b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0135c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Q0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0135c c0135c = (C0135c) obj;
        return Q0.h.a(this.f1263a, c0135c.f1263a) && Q0.h.a(this.f1264b, c0135c.f1264b) && Q0.h.a(this.f1265c, c0135c.f1265c);
    }

    public final int hashCode() {
        return this.f1265c.hashCode() + ((this.f1264b.hashCode() + (this.f1263a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0135c.class.getSimpleName() + " { " + this.f1263a + ", type=" + this.f1264b + ", state=" + this.f1265c + " }";
    }
}
