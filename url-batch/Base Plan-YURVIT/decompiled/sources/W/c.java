package W;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final T.b f880a;

    /* renamed from: b, reason: collision with root package name */
    public final b f881b;

    /* renamed from: c, reason: collision with root package name */
    public final b f882c;

    public c(T.b bVar, b bVar2, b bVar3) {
        int i2 = bVar.f832b;
        this.f880a = bVar;
        this.f881b = bVar2;
        this.f882c = bVar3;
        int i3 = bVar.f833c;
        int i4 = bVar.f831a;
        if (i3 - i4 == 0 && bVar.f834d - i2 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i4 != 0 && i2 != 0) {
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
        P0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return P0.h.a(this.f880a, cVar.f880a) && P0.h.a(this.f881b, cVar.f881b) && P0.h.a(this.f882c, cVar.f882c);
    }

    public final int hashCode() {
        return this.f882c.hashCode() + ((this.f881b.hashCode() + (this.f880a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f880a + ", type=" + this.f881b + ", state=" + this.f882c + " }";
    }
}
