package m;

import H2.AbstractC0080b;

/* renamed from: m.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590b0 implements InterfaceC0615z {

    /* renamed from: a, reason: collision with root package name */
    public final float f5695a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5696b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5697c;

    public C0590b0(float f3, float f4, Object obj) {
        this.f5695a = f3;
        this.f5696b = f4;
        this.f5697c = obj;
    }

    @Override // m.InterfaceC0602l
    public final A0 a(y0 y0Var) {
        Object obj = this.f5697c;
        return new A2.g(this.f5695a, this.f5696b, obj == null ? null : (r) y0Var.f5883a.j(obj));
    }

    @Override // m.InterfaceC0615z
    public final B0 e() {
        y0 y0Var = z0.f5885a;
        Object obj = this.f5697c;
        return new A2.g(this.f5695a, this.f5696b, obj == null ? null : (r) i0.f5762m.j(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0590b0)) {
            return false;
        }
        C0590b0 c0590b0 = (C0590b0) obj;
        return c0590b0.f5695a == this.f5695a && c0590b0.f5696b == this.f5696b && Z1.i.a(c0590b0.f5697c, this.f5697c);
    }

    public final int hashCode() {
        Object obj = this.f5697c;
        return Float.hashCode(this.f5696b) + AbstractC0080b.a(this.f5695a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
