package p1;

import k1.e;
import k1.j;
import kotlin.jvm.internal.Intrinsics;
import m1.d;
import n0.l;
import te.a1;
import x2.i;
import x2.k;
import z4.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e, reason: collision with root package name */
    public final e f7594e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7595f;
    public final int g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final long f7596h;

    /* renamed from: i, reason: collision with root package name */
    public float f7597i;
    public j j;

    public a(e eVar) {
        int i3;
        int i10;
        long width = (eVar.f5314a.getWidth() << 32) | (eVar.f5314a.getHeight() & 4294967295L);
        this.f7594e = eVar;
        this.f7595f = width;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i3 = (int) (width >> 32)) < 0 || (i10 = (int) (width & 4294967295L)) < 0 || i3 > eVar.f5314a.getWidth() || i10 > eVar.f5314a.getHeight()) {
            a1.e("Failed requirement.");
            throw null;
        }
        this.f7596h = width;
        this.f7597i = 1.0f;
    }

    @Override // p1.b
    public final void a(float f3) {
        this.f7597i = f3;
    }

    @Override // p1.b
    public final void b(j jVar) {
        this.j = jVar;
    }

    @Override // p1.b
    public final long d() {
        return m.b(this.f7596h);
    }

    @Override // p1.b
    public final void e(d dVar) {
        int round = Math.round(Float.intBitsToFloat((int) (dVar.u() >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (dVar.u() & 4294967295L)));
        d.U(dVar, this.f7594e, this.f7595f, (round << 32) | (round2 & 4294967295L), this.f7597i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f7594e, aVar.f7594e) && i.a(0L, 0L) && k.a(this.f7595f, aVar.f7595f) && this.g == aVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + l.c(l.c(this.f7594e.hashCode() * 31, 31, 0L), 31, this.f7595f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f7594e);
        sb2.append(", srcOffset=");
        sb2.append((Object) i.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) k.b(this.f7595f));
        sb2.append(", filterQuality=");
        int i3 = this.g;
        sb2.append((Object) (i3 == 0 ? "None" : i3 == 1 ? "Low" : i3 == 2 ? "Medium" : i3 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
