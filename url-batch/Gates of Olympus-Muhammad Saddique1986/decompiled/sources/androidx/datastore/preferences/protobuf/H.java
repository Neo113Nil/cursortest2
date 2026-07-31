package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: b, reason: collision with root package name */
    public static final C0264s f4997b = new C0264s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4998a;

    public H(C0258l c0258l) {
        AbstractC0269x.a(c0258l, "output");
        this.f4998a = c0258l;
        c0258l.f5099c = this;
    }

    public void a(int i3, boolean z3) {
        ((C0258l) this.f4998a).M(i3, z3);
    }

    public void b(int i3, C0253g c0253g) {
        ((C0258l) this.f4998a).N(i3, c0253g);
    }

    public void c(double d3, int i3) {
        C0258l c0258l = (C0258l) this.f4998a;
        c0258l.getClass();
        c0258l.R(Double.doubleToRawLongBits(d3), i3);
    }

    public void d(int i3, int i4) {
        ((C0258l) this.f4998a).T(i3, i4);
    }

    public void e(int i3, int i4) {
        ((C0258l) this.f4998a).P(i3, i4);
    }

    public void f(long j3, int i3) {
        ((C0258l) this.f4998a).R(j3, i3);
    }

    public void g(float f3, int i3) {
        C0258l c0258l = (C0258l) this.f4998a;
        c0258l.getClass();
        c0258l.P(i3, Float.floatToRawIntBits(f3));
    }

    public void h(int i3, Object obj, Z z3) {
        C0258l c0258l = (C0258l) this.f4998a;
        c0258l.X(i3, 3);
        z3.d((AbstractC0245a) obj, c0258l.f5099c);
        c0258l.X(i3, 4);
    }

    public void i(int i3, int i4) {
        ((C0258l) this.f4998a).T(i3, i4);
    }

    public void j(long j3, int i3) {
        ((C0258l) this.f4998a).a0(j3, i3);
    }

    public void k(int i3, Object obj, Z z3) {
        C0258l c0258l = (C0258l) this.f4998a;
        AbstractC0245a abstractC0245a = (AbstractC0245a) obj;
        c0258l.X(i3, 2);
        c0258l.Z(abstractC0245a.a(z3));
        z3.d(abstractC0245a, c0258l.f5099c);
    }

    public void l(int i3, int i4) {
        ((C0258l) this.f4998a).P(i3, i4);
    }

    public void m(long j3, int i3) {
        ((C0258l) this.f4998a).R(j3, i3);
    }

    public void n(int i3, int i4) {
        ((C0258l) this.f4998a).Y(i3, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j3, int i3) {
        ((C0258l) this.f4998a).a0((j3 >> 63) ^ (j3 << 1), i3);
    }

    public void p(int i3, int i4) {
        ((C0258l) this.f4998a).Y(i3, i4);
    }

    public void q(long j3, int i3) {
        ((C0258l) this.f4998a).a0(j3, i3);
    }

    public H() {
        N n3;
        try {
            n3 = (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n3 = f4997b;
        }
        N[] nArr = {C0264s.f5122b, n3};
        G g3 = new G();
        g3.f4996a = nArr;
        Charset charset = AbstractC0269x.f5135a;
        this.f4998a = g3;
    }
}
