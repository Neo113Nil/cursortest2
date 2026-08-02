package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0156t f1612b = new C0156t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1613a;

    public F(C0150m c0150m) {
        AbstractC0161y.a(c0150m, "output");
        this.f1613a = c0150m;
        c0150m.f1722j = this;
    }

    public void a(int i2, boolean z2) {
        ((C0150m) this.f1613a).w0(i2, z2);
    }

    public void b(int i2, C0144g c0144g) {
        ((C0150m) this.f1613a).x0(i2, c0144g);
    }

    public void c(int i2, double d2) {
        C0150m c0150m = (C0150m) this.f1613a;
        c0150m.getClass();
        c0150m.B0(Double.doubleToRawLongBits(d2), i2);
    }

    public void d(int i2, int i3) {
        ((C0150m) this.f1613a).D0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((C0150m) this.f1613a).z0(i2, i3);
    }

    public void f(long j2, int i2) {
        ((C0150m) this.f1613a).B0(j2, i2);
    }

    public void g(int i2, float f2) {
        C0150m c0150m = (C0150m) this.f1613a;
        c0150m.getClass();
        c0150m.z0(i2, Float.floatToRawIntBits(f2));
    }

    public void h(int i2, Object obj, W w2) {
        C0150m c0150m = (C0150m) this.f1613a;
        c0150m.H0(i2, 3);
        w2.d((AbstractC0138a) obj, c0150m.f1722j);
        c0150m.H0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((C0150m) this.f1613a).D0(i2, i3);
    }

    public void j(long j2, int i2) {
        ((C0150m) this.f1613a).K0(j2, i2);
    }

    public void k(int i2, Object obj, W w2) {
        C0150m c0150m = (C0150m) this.f1613a;
        AbstractC0138a abstractC0138a = (AbstractC0138a) obj;
        c0150m.H0(i2, 2);
        c0150m.J0(abstractC0138a.a(w2));
        w2.d(abstractC0138a, c0150m.f1722j);
    }

    public void l(int i2, int i3) {
        ((C0150m) this.f1613a).z0(i2, i3);
    }

    public void m(long j2, int i2) {
        ((C0150m) this.f1613a).B0(j2, i2);
    }

    public void n(int i2, int i3) {
        ((C0150m) this.f1613a).I0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(long j2, int i2) {
        ((C0150m) this.f1613a).K0((j2 >> 63) ^ (j2 << 1), i2);
    }

    public void p(int i2, int i3) {
        ((C0150m) this.f1613a).I0(i2, i3);
    }

    public void q(long j2, int i2) {
        ((C0150m) this.f1613a).K0(j2, i2);
    }

    public F() {
        T t2 = T.f1643c;
        Object obj = f1612b;
        try {
            obj = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        L[] lArr = {C0156t.f1757b, obj};
        E e2 = new E();
        e2.f1611a = lArr;
        Charset charset = AbstractC0161y.f1761a;
        this.f1613a = e2;
    }
}
