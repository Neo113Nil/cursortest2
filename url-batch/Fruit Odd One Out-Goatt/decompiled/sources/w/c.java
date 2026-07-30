package w;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f1207a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1208b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1209c;

    public c(t.b bVar, b bVar2, b bVar3) {
        int i2 = bVar.f1150b;
        this.f1207a = bVar;
        this.f1208b = bVar2;
        this.f1209c = bVar3;
        int i3 = bVar.f1151c;
        int i4 = bVar.f1149a;
        if (i3 - i4 == 0 && bVar.f1152d - i2 == 0) {
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
        obj.getClass();
        c cVar = (c) obj;
        return this.f1207a.equals(cVar.f1207a) && this.f1208b.equals(cVar.f1208b) && this.f1209c.equals(cVar.f1209c);
    }

    public final int hashCode() {
        return this.f1209c.hashCode() + ((this.f1208b.hashCode() + (this.f1207a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f1207a + ", type=" + this.f1208b + ", state=" + this.f1209c + " }";
    }
}
