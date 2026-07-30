package e1;

import b1.e;
import j1.c;
import m2.j;
import r1.f0;
import r6.k;
import y0.f;
import z0.h;
import z0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final h f2724e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2725f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2726g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2727h;

    /* renamed from: i, reason: collision with root package name */
    public float f2728i;

    /* renamed from: j, reason: collision with root package name */
    public m f2729j;

    public a(h hVar) {
        int i7;
        int i8;
        long G = c.G(hVar.f9996a.getWidth(), hVar.f9996a.getHeight());
        this.f2724e = hVar;
        this.f2725f = G;
        this.f2726g = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i7 = (int) (G >> 32)) < 0 || (i8 = (int) (4294967295L & G)) < 0 || i7 > hVar.f9996a.getWidth() || i8 > hVar.f9996a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f2727h = G;
        this.f2728i = 1.0f;
    }

    @Override // e1.b
    public final void a(float f9) {
        this.f2728i = f9;
    }

    @Override // e1.b
    public final void b(m mVar) {
        this.f2729j = mVar;
    }

    @Override // e1.b
    public final long d() {
        return c.o0(this.f2727h);
    }

    @Override // e1.b
    public final void e(f0 f0Var) {
        b1.c cVar = f0Var.f7767f;
        e.c0(f0Var, this.f2724e, this.f2725f, c.G(Math.round(f.d(cVar.d())), Math.round(f.b(cVar.d()))), this.f2728i, this.f2729j, this.f2726g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f2724e, aVar.f2724e) && m2.h.a(0L, 0L) && j.a(this.f2725f, aVar.f2725f) && this.f2726g == aVar.f2726g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2726g) + a0.m.d(a0.m.d(this.f2724e.hashCode() * 31, 31, 0L), 31, this.f2725f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f2724e);
        sb.append(", srcOffset=");
        sb.append((Object) m2.h.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) j.b(this.f2725f));
        sb.append(", filterQuality=");
        int i7 = this.f2726g;
        sb.append((Object) (i7 == 0 ? "None" : i7 == 1 ? "Low" : i7 == 2 ? "Medium" : i7 == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
