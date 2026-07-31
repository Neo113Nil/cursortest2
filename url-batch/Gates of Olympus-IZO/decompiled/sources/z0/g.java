package z0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1.j f8955b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8956c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Y1.a aVar, Y1.a aVar2, boolean z3) {
        this.f8954a = (Z1.j) aVar;
        this.f8955b = (Z1.j) aVar2;
        this.f8956c = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.a, Z1.j] */
    public final Y1.a a() {
        return this.f8955b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y1.a, Z1.j] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f8954a.b()).floatValue() + ", maxValue=" + ((Number) this.f8955b.b()).floatValue() + ", reverseScrolling=" + this.f8956c + ')';
    }
}
