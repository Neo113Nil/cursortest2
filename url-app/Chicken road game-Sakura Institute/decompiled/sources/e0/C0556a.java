package e0;

import A.AbstractC0017m;
import M0.h;
import M0.j;
import Y.f;
import Z.C0310g;
import Z.C0316m;
import Z.K;
import b0.C0494b;
import b0.InterfaceC0496d;
import kotlin.jvm.internal.Intrinsics;
import r0.G;
import u3.d;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556a extends AbstractC0557b {

    /* renamed from: e, reason: collision with root package name */
    public final C0310g f6151e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6152f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6153g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6154h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6155i;

    /* renamed from: j, reason: collision with root package name */
    public float f6156j;

    /* renamed from: k, reason: collision with root package name */
    public C0316m f6157k;

    public C0556a(C0310g c0310g) {
        int i2;
        int i4;
        long c4 = d.c(c0310g.f4523a.getWidth(), c0310g.f4523a.getHeight());
        this.f6151e = c0310g;
        this.f6152f = 0L;
        this.f6153g = c4;
        this.f6154h = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i2 = (int) (c4 >> 32)) < 0 || (i4 = (int) (4294967295L & c4)) < 0 || i2 > c0310g.f4523a.getWidth() || i4 > c0310g.f4523a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f6155i = c4;
        this.f6156j = 1.0f;
    }

    @Override // e0.AbstractC0557b
    public final void a(float f4) {
        this.f6156j = f4;
    }

    @Override // e0.AbstractC0557b
    public final void b(C0316m c0316m) {
        this.f6157k = c0316m;
    }

    @Override // e0.AbstractC0557b
    public final long d() {
        return d.U(this.f6155i);
    }

    @Override // e0.AbstractC0557b
    public final void e(G g4) {
        C0494b c0494b = g4.f9624d;
        long c4 = d.c(Math.round(f.d(c0494b.h())), Math.round(f.b(c0494b.h())));
        float f4 = this.f6156j;
        C0316m c0316m = this.f6157k;
        InterfaceC0496d.s(g4, this.f6151e, this.f6152f, this.f6153g, c4, f4, c0316m, this.f6154h, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0556a)) {
            return false;
        }
        C0556a c0556a = (C0556a) obj;
        return Intrinsics.a(this.f6151e, c0556a.f6151e) && h.a(this.f6152f, c0556a.f6152f) && j.a(this.f6153g, c0556a.f6153g) && K.q(this.f6154h, c0556a.f6154h);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6154h) + AbstractC0017m.c(AbstractC0017m.c(this.f6151e.hashCode() * 31, 31, this.f6152f), 31, this.f6153g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f6151e);
        sb.append(", srcOffset=");
        sb.append((Object) h.d(this.f6152f));
        sb.append(", srcSize=");
        sb.append((Object) j.d(this.f6153g));
        sb.append(", filterQuality=");
        int i2 = this.f6154h;
        sb.append((Object) (K.q(i2, 0) ? "None" : K.q(i2, 1) ? "Low" : K.q(i2, 2) ? "Medium" : K.q(i2, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
