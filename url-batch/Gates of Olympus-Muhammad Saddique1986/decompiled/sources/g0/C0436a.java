package g0;

import A.k;
import O0.h;
import O2.d;
import a0.C0241f;
import b0.C0338g;
import b0.C0344m;
import b0.M;
import d0.C0401b;
import d0.InterfaceC0403d;
import f2.j;
import t0.G;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436a extends AbstractC0437b {

    /* renamed from: e, reason: collision with root package name */
    public final C0338g f5834e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5835f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5836g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5837h;

    /* renamed from: i, reason: collision with root package name */
    public final long f5838i;

    /* renamed from: j, reason: collision with root package name */
    public float f5839j;

    /* renamed from: k, reason: collision with root package name */
    public C0344m f5840k;

    public C0436a(C0338g c0338g) {
        int i3;
        int i4;
        long d3 = d.d(c0338g.f5413a.getWidth(), c0338g.f5413a.getHeight());
        this.f5834e = c0338g;
        this.f5835f = 0L;
        this.f5836g = d3;
        this.f5837h = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i3 = (int) (d3 >> 32)) < 0 || (i4 = (int) (4294967295L & d3)) < 0 || i3 > c0338g.f5413a.getWidth() || i4 > c0338g.f5413a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f5838i = d3;
        this.f5839j = 1.0f;
    }

    @Override // g0.AbstractC0437b
    public final void a(float f3) {
        this.f5839j = f3;
    }

    @Override // g0.AbstractC0437b
    public final void b(C0344m c0344m) {
        this.f5840k = c0344m;
    }

    @Override // g0.AbstractC0437b
    public final long d() {
        return d.f0(this.f5838i);
    }

    @Override // g0.AbstractC0437b
    public final void e(G g3) {
        C0401b c0401b = g3.f8573d;
        long d3 = d.d(Math.round(C0241f.d(c0401b.d())), Math.round(C0241f.b(c0401b.d())));
        float f3 = this.f5839j;
        C0344m c0344m = this.f5840k;
        InterfaceC0403d.p(g3, this.f5834e, this.f5835f, this.f5836g, d3, f3, c0344m, this.f5837h, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0436a)) {
            return false;
        }
        C0436a c0436a = (C0436a) obj;
        return j.a(this.f5834e, c0436a.f5834e) && h.a(this.f5835f, c0436a.f5835f) && O0.j.a(this.f5836g, c0436a.f5836g) && M.r(this.f5837h, c0436a.f5837h);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5837h) + k.c(k.c(this.f5834e.hashCode() * 31, 31, this.f5835f), 31, this.f5836g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f5834e);
        sb.append(", srcOffset=");
        sb.append((Object) h.d(this.f5835f));
        sb.append(", srcSize=");
        sb.append((Object) O0.j.d(this.f5836g));
        sb.append(", filterQuality=");
        int i3 = this.f5837h;
        sb.append((Object) (M.r(i3, 0) ? "None" : M.r(i3, 1) ? "Low" : M.r(i3, 2) ? "Medium" : M.r(i3, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
