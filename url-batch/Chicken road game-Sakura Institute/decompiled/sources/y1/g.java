package y1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final r6.l f9804a;

    /* renamed from: b, reason: collision with root package name */
    public final r6.l f9805b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(q6.a aVar, q6.a aVar2) {
        this.f9804a = (r6.l) aVar;
        this.f9805b = (r6.l) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.a, r6.l] */
    public final q6.a a() {
        return this.f9805b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [q6.a, r6.l] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f9804a.a()).floatValue() + ", maxValue=" + ((Number) this.f9805b.a()).floatValue() + ", reverseScrolling=false)";
    }
}
