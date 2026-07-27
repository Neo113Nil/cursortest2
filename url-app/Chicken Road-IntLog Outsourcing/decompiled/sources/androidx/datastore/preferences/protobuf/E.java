package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0223s f4361b = new C0223s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4362a;

    public E(C0217l c0217l) {
        AbstractC0228x.a(c0217l, "output");
        this.f4362a = c0217l;
        c0217l.f4469c = this;
    }

    public void a(int i2, boolean z) {
        ((C0217l) this.f4362a).i0(i2, z);
    }

    public void b(int i2, C0212g c0212g) {
        ((C0217l) this.f4362a).j0(i2, c0212g);
    }

    public void c(int i2, double d6) {
        C0217l c0217l = (C0217l) this.f4362a;
        c0217l.getClass();
        c0217l.n0(i2, Double.doubleToRawLongBits(d6));
    }

    public void d(int i2, int i3) {
        ((C0217l) this.f4362a).p0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((C0217l) this.f4362a).l0(i2, i3);
    }

    public void f(int i2, long j2) {
        ((C0217l) this.f4362a).n0(i2, j2);
    }

    public void g(int i2, float f3) {
        C0217l c0217l = (C0217l) this.f4362a;
        c0217l.getClass();
        c0217l.l0(i2, Float.floatToRawIntBits(f3));
    }

    public void h(int i2, Object obj, V v4) {
        C0217l c0217l = (C0217l) this.f4362a;
        c0217l.t0(i2, 3);
        v4.b((AbstractC0206a) obj, c0217l.f4469c);
        c0217l.t0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((C0217l) this.f4362a).p0(i2, i3);
    }

    public void j(int i2, long j2) {
        ((C0217l) this.f4362a).w0(i2, j2);
    }

    public void k(int i2, Object obj, V v4) {
        C0217l c0217l = (C0217l) this.f4362a;
        AbstractC0206a abstractC0206a = (AbstractC0206a) obj;
        c0217l.t0(i2, 2);
        c0217l.v0(abstractC0206a.a(v4));
        v4.b(abstractC0206a, c0217l.f4469c);
    }

    public void l(int i2, int i3) {
        ((C0217l) this.f4362a).l0(i2, i3);
    }

    public void m(int i2, long j2) {
        ((C0217l) this.f4362a).n0(i2, j2);
    }

    public void n(int i2, int i3) {
        ((C0217l) this.f4362a).u0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(int i2, long j2) {
        ((C0217l) this.f4362a).w0(i2, (j2 >> 63) ^ (j2 << 1));
    }

    public void p(int i2, int i3) {
        ((C0217l) this.f4362a).u0(i2, i3);
    }

    public void q(int i2, long j2) {
        ((C0217l) this.f4362a).w0(i2, j2);
    }

    public E() {
        S s2 = S.f4392c;
        Object obj = f4361b;
        try {
            obj = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        K[] kArr = {C0223s.f4504b, obj};
        D d6 = new D();
        d6.f4360a = kArr;
        Charset charset = AbstractC0228x.f4508a;
        this.f4362a = d6;
    }
}
