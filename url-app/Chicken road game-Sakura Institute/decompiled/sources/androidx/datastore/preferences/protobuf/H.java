package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final C0453s f5271b = new C0453s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5272a;

    public H(C0447l c0447l) {
        AbstractC0458x.a(c0447l, "output");
        this.f5272a = c0447l;
        c0447l.f5373c = this;
    }

    public void a(int i2, boolean z4) {
        ((C0447l) this.f5272a).M(i2, z4);
    }

    public void b(int i2, C0442g c0442g) {
        ((C0447l) this.f5272a).N(i2, c0442g);
    }

    public void c(double d4, int i2) {
        C0447l c0447l = (C0447l) this.f5272a;
        c0447l.getClass();
        c0447l.R(Double.doubleToRawLongBits(d4), i2);
    }

    public void d(int i2, int i4) {
        ((C0447l) this.f5272a).T(i2, i4);
    }

    public void e(int i2, int i4) {
        ((C0447l) this.f5272a).P(i2, i4);
    }

    public void f(long j4, int i2) {
        ((C0447l) this.f5272a).R(j4, i2);
    }

    public void g(float f4, int i2) {
        C0447l c0447l = (C0447l) this.f5272a;
        c0447l.getClass();
        c0447l.P(i2, Float.floatToRawIntBits(f4));
    }

    public void h(int i2, Object obj, Z z4) {
        C0447l c0447l = (C0447l) this.f5272a;
        c0447l.X(i2, 3);
        z4.c((AbstractC0434a) obj, c0447l.f5373c);
        c0447l.X(i2, 4);
    }

    public void i(int i2, int i4) {
        ((C0447l) this.f5272a).T(i2, i4);
    }

    public void j(long j4, int i2) {
        ((C0447l) this.f5272a).a0(j4, i2);
    }

    public void k(int i2, Object obj, Z z4) {
        C0447l c0447l = (C0447l) this.f5272a;
        AbstractC0434a abstractC0434a = (AbstractC0434a) obj;
        c0447l.X(i2, 2);
        c0447l.Z(abstractC0434a.a(z4));
        z4.c(abstractC0434a, c0447l.f5373c);
    }

    public void l(int i2, int i4) {
        ((C0447l) this.f5272a).P(i2, i4);
    }

    public void m(long j4, int i2) {
        ((C0447l) this.f5272a).R(j4, i2);
    }

    public void n(int i2, int i4) {
        ((C0447l) this.f5272a).Y(i2, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j4, int i2) {
        ((C0447l) this.f5272a).a0((j4 >> 63) ^ (j4 << 1), i2);
    }

    public void p(int i2, int i4) {
        ((C0447l) this.f5272a).Y(i2, i4);
    }

    public void q(long j4, int i2) {
        ((C0447l) this.f5272a).a0(j4, i2);
    }

    public H() {
        N n2;
        try {
            n2 = (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n2 = f5271b;
        }
        N[] nArr = {C0453s.f5396b, n2};
        G g4 = new G();
        g4.f5270a = nArr;
        Charset charset = AbstractC0458x.f5409a;
        this.f5272a = g4;
    }
}
