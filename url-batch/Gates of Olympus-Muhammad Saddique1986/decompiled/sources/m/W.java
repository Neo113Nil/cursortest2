package m;

/* loaded from: classes.dex */
public final class W implements InterfaceC0640z {

    /* renamed from: a, reason: collision with root package name */
    public final float f6695a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6696b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6697c;

    public W(float f3, float f4, Object obj) {
        this.f6695a = f3;
        this.f6696b = f4;
        this.f6697c = obj;
    }

    @Override // m.InterfaceC0627l
    public final w0 a(u0 u0Var) {
        Object obj = this.f6697c;
        return new y0(this.f6695a, this.f6696b, obj == null ? null : (r) u0Var.f6889a.n(obj));
    }

    @Override // m.InterfaceC0640z
    public final x0 e() {
        u0 u0Var = v0.f6899a;
        Object obj = this.f6697c;
        return new y0(this.f6695a, this.f6696b, obj == null ? null : (r) c0.f6742m.n(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W)) {
            return false;
        }
        W w2 = (W) obj;
        return w2.f6695a == this.f6695a && w2.f6696b == this.f6696b && f2.j.a(w2.f6697c, this.f6697c);
    }

    public final int hashCode() {
        Object obj = this.f6697c;
        return Float.hashCode(this.f6696b) + A.k.a(this.f6695a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ W(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
