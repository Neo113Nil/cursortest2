package y1;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final v1.b f16237a;

    /* renamed from: b, reason: collision with root package name */
    public final b f16238b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16239c;

    public c(v1.b bVar, b bVar2, b bVar3) {
        int i4 = bVar.f15537b;
        this.f16237a = bVar;
        this.f16238b = bVar2;
        this.f16239c = bVar3;
        int i5 = bVar.f15538c;
        int i6 = bVar.f15536a;
        if (i5 - i6 == 0 && bVar.f15539d - i4 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i6 != 0 && i4 != 0) {
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
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return kotlin.jvm.internal.i.a(this.f16237a, cVar.f16237a) && kotlin.jvm.internal.i.a(this.f16238b, cVar.f16238b) && kotlin.jvm.internal.i.a(this.f16239c, cVar.f16239c);
    }

    public final int hashCode() {
        return this.f16239c.hashCode() + ((this.f16238b.hashCode() + (this.f16237a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f16237a + ", type=" + this.f16238b + ", state=" + this.f16239c + " }";
    }
}
