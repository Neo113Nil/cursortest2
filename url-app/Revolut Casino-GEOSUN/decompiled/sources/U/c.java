package U;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final R.b f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1003b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1004c;

    public c(R.b bVar, b bVar2, b bVar3) {
        this.f1002a = bVar;
        this.f1003b = bVar2;
        this.f1004c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f869a != 0 && bVar.f870b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        F0.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return F0.i.a(this.f1002a, cVar.f1002a) && F0.i.a(this.f1003b, cVar.f1003b) && F0.i.a(this.f1004c, cVar.f1004c);
    }

    public final int hashCode() {
        return this.f1004c.hashCode() + ((this.f1003b.hashCode() + (this.f1002a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1002a + ", type=" + this.f1003b + ", state=" + this.f1004c + " }";
    }
}
