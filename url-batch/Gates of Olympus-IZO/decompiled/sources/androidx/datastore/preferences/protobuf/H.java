package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final C0208s f3797b = new C0208s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f3798a;

    public H(C0202l c0202l) {
        AbstractC0213x.a(c0202l, "output");
        this.f3798a = c0202l;
        c0202l.f3898c = this;
    }

    public void a(int i3, boolean z3) {
        ((C0202l) this.f3798a).M(i3, z3);
    }

    public void b(int i3, C0197g c0197g) {
        ((C0202l) this.f3798a).N(i3, c0197g);
    }

    public void c(double d3, int i3) {
        C0202l c0202l = (C0202l) this.f3798a;
        c0202l.getClass();
        c0202l.R(Double.doubleToRawLongBits(d3), i3);
    }

    public void d(int i3, int i4) {
        ((C0202l) this.f3798a).T(i3, i4);
    }

    public void e(int i3, int i4) {
        ((C0202l) this.f3798a).P(i3, i4);
    }

    public void f(long j3, int i3) {
        ((C0202l) this.f3798a).R(j3, i3);
    }

    public void g(float f3, int i3) {
        C0202l c0202l = (C0202l) this.f3798a;
        c0202l.getClass();
        c0202l.P(i3, Float.floatToRawIntBits(f3));
    }

    public void h(int i3, Object obj, Z z3) {
        C0202l c0202l = (C0202l) this.f3798a;
        c0202l.X(i3, 3);
        z3.c((AbstractC0189a) obj, c0202l.f3898c);
        c0202l.X(i3, 4);
    }

    public void i(int i3, int i4) {
        ((C0202l) this.f3798a).T(i3, i4);
    }

    public void j(long j3, int i3) {
        ((C0202l) this.f3798a).a0(j3, i3);
    }

    public void k(int i3, Object obj, Z z3) {
        C0202l c0202l = (C0202l) this.f3798a;
        AbstractC0189a abstractC0189a = (AbstractC0189a) obj;
        c0202l.X(i3, 2);
        c0202l.Z(abstractC0189a.a(z3));
        z3.c(abstractC0189a, c0202l.f3898c);
    }

    public void l(int i3, int i4) {
        ((C0202l) this.f3798a).P(i3, i4);
    }

    public void m(long j3, int i3) {
        ((C0202l) this.f3798a).R(j3, i3);
    }

    public void n(int i3, int i4) {
        ((C0202l) this.f3798a).Y(i3, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j3, int i3) {
        ((C0202l) this.f3798a).a0((j3 >> 63) ^ (j3 << 1), i3);
    }

    public void p(int i3, int i4) {
        ((C0202l) this.f3798a).Y(i3, i4);
    }

    public void q(long j3, int i3) {
        ((C0202l) this.f3798a).a0(j3, i3);
    }

    public H() {
        N n3;
        try {
            n3 = (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n3 = f3797b;
        }
        N[] nArr = {C0208s.f3921b, n3};
        G g3 = new G();
        g3.f3796a = nArr;
        Charset charset = AbstractC0213x.f3934a;
        this.f3798a = g3;
    }
}
