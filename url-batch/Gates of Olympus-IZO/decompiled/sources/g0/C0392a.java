package g0;

import H2.AbstractC0080b;
import I2.l;
import M0.g;
import Z1.i;
import a0.f;
import b0.AbstractC0259J;
import b0.C0275h;
import b0.C0281n;
import d0.C0321b;
import d0.InterfaceC0323d;
import t0.F;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392a extends AbstractC0393b {

    /* renamed from: e, reason: collision with root package name */
    public final C0275h f4785e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4786f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4787g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4788h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4789i;

    /* renamed from: j, reason: collision with root package name */
    public float f4790j;

    /* renamed from: k, reason: collision with root package name */
    public C0281n f4791k;

    public C0392a(C0275h c0275h) {
        int i3;
        int i4;
        long e3 = l.e(c0275h.f4271a.getWidth(), c0275h.f4271a.getHeight());
        this.f4785e = c0275h;
        this.f4786f = 0L;
        this.f4787g = e3;
        this.f4788h = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i3 = (int) (e3 >> 32)) < 0 || (i4 = (int) (4294967295L & e3)) < 0 || i3 > c0275h.f4271a.getWidth() || i4 > c0275h.f4271a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f4789i = e3;
        this.f4790j = 1.0f;
    }

    @Override // g0.AbstractC0393b
    public final void a(float f3) {
        this.f4790j = f3;
    }

    @Override // g0.AbstractC0393b
    public final void b(C0281n c0281n) {
        this.f4791k = c0281n;
    }

    @Override // g0.AbstractC0393b
    public final long d() {
        return l.R(this.f4789i);
    }

    @Override // g0.AbstractC0393b
    public final void e(F f3) {
        C0321b c0321b = f3.f7748d;
        long e3 = l.e(Math.round(f.d(c0321b.c())), Math.round(f.b(c0321b.c())));
        float f4 = this.f4790j;
        C0281n c0281n = this.f4791k;
        InterfaceC0323d.o(f3, this.f4785e, this.f4786f, this.f4787g, e3, f4, c0281n, this.f4788h, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0392a)) {
            return false;
        }
        C0392a c0392a = (C0392a) obj;
        return i.a(this.f4785e, c0392a.f4785e) && g.a(this.f4786f, c0392a.f4786f) && M0.i.a(this.f4787g, c0392a.f4787g) && AbstractC0259J.p(this.f4788h, c0392a.f4788h);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4788h) + AbstractC0080b.d(AbstractC0080b.d(this.f4785e.hashCode() * 31, 31, this.f4786f), 31, this.f4787g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f4785e);
        sb.append(", srcOffset=");
        sb.append((Object) g.d(this.f4786f));
        sb.append(", srcSize=");
        sb.append((Object) M0.i.d(this.f4787g));
        sb.append(", filterQuality=");
        int i3 = this.f4788h;
        sb.append((Object) (AbstractC0259J.p(i3, 0) ? "None" : AbstractC0259J.p(i3, 1) ? "Low" : AbstractC0259J.p(i3, 2) ? "Medium" : AbstractC0259J.p(i3, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
