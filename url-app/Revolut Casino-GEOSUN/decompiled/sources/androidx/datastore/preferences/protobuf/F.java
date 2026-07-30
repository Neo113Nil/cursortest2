package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final C0089t f1364b = new C0089t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1365a;

    public F(C0083m c0083m) {
        AbstractC0094y.a(c0083m, "output");
        this.f1365a = c0083m;
        c0083m.f1473i = this;
    }

    public void a(int i2, boolean z2) {
        ((C0083m) this.f1365a).t0(i2, z2);
    }

    public void b(int i2, C0077g c0077g) {
        ((C0083m) this.f1365a).u0(i2, c0077g);
    }

    public void c(int i2, double d2) {
        C0083m c0083m = (C0083m) this.f1365a;
        c0083m.getClass();
        c0083m.y0(Double.doubleToRawLongBits(d2), i2);
    }

    public void d(int i2, int i3) {
        ((C0083m) this.f1365a).A0(i2, i3);
    }

    public void e(int i2, int i3) {
        ((C0083m) this.f1365a).w0(i2, i3);
    }

    public void f(long j2, int i2) {
        ((C0083m) this.f1365a).y0(j2, i2);
    }

    public void g(int i2, float f2) {
        C0083m c0083m = (C0083m) this.f1365a;
        c0083m.getClass();
        c0083m.w0(i2, Float.floatToRawIntBits(f2));
    }

    public void h(int i2, Object obj, W w2) {
        C0083m c0083m = (C0083m) this.f1365a;
        c0083m.E0(i2, 3);
        w2.f((AbstractC0071a) obj, c0083m.f1473i);
        c0083m.E0(i2, 4);
    }

    public void i(int i2, int i3) {
        ((C0083m) this.f1365a).A0(i2, i3);
    }

    public void j(long j2, int i2) {
        ((C0083m) this.f1365a).H0(j2, i2);
    }

    public void k(int i2, Object obj, W w2) {
        C0083m c0083m = (C0083m) this.f1365a;
        AbstractC0071a abstractC0071a = (AbstractC0071a) obj;
        c0083m.E0(i2, 2);
        c0083m.G0(abstractC0071a.a(w2));
        w2.f(abstractC0071a, c0083m.f1473i);
    }

    public void l(int i2, int i3) {
        ((C0083m) this.f1365a).w0(i2, i3);
    }

    public void m(long j2, int i2) {
        ((C0083m) this.f1365a).y0(j2, i2);
    }

    public void n(int i2, int i3) {
        ((C0083m) this.f1365a).F0(i2, (i3 >> 31) ^ (i3 << 1));
    }

    public void o(long j2, int i2) {
        ((C0083m) this.f1365a).H0((j2 >> 63) ^ (j2 << 1), i2);
    }

    public void p(int i2, int i3) {
        ((C0083m) this.f1365a).F0(i2, i3);
    }

    public void q(long j2, int i2) {
        ((C0083m) this.f1365a).H0(j2, i2);
    }

    public F() {
        T t2 = T.f1395c;
        Object obj = f1364b;
        try {
            obj = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        L[] lArr = {C0089t.f1508b, obj};
        E e2 = new E();
        e2.f1363a = lArr;
        Charset charset = AbstractC0094y.f1512a;
        this.f1365a = e2;
    }
}
