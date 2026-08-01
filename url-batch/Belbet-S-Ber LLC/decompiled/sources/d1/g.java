package d1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends b4.l {

    /* renamed from: b, reason: collision with root package name */
    public final b f1299b;

    public g(b bVar) {
        i3.d.e(bVar, "latestEvent");
        this.f1299b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && i3.d.a(this.f1299b, ((g) obj).f1299b);
    }

    public final int hashCode() {
        return this.f1299b.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f1299b + ", direction=-1)";
    }
}
