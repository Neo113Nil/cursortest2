package y0;

import a0.m;
import u3.q;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f9779e = new d(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f9780a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9781b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9782c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9783d;

    public d(float f9, float f10, float f11, float f12) {
        this.f9780a = f9;
        this.f9781b = f10;
        this.f9782c = f11;
        this.f9783d = f12;
    }

    public final long a() {
        return r.a((c() / 2.0f) + this.f9780a, (b() / 2.0f) + this.f9781b);
    }

    public final float b() {
        return this.f9783d - this.f9781b;
    }

    public final float c() {
        return this.f9782c - this.f9780a;
    }

    public final d d(d dVar) {
        return new d(Math.max(this.f9780a, dVar.f9780a), Math.max(this.f9781b, dVar.f9781b), Math.min(this.f9782c, dVar.f9782c), Math.min(this.f9783d, dVar.f9783d));
    }

    public final boolean e() {
        return this.f9780a >= this.f9782c || this.f9781b >= this.f9783d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f9780a, dVar.f9780a) == 0 && Float.compare(this.f9781b, dVar.f9781b) == 0 && Float.compare(this.f9782c, dVar.f9782c) == 0 && Float.compare(this.f9783d, dVar.f9783d) == 0;
    }

    public final boolean f(d dVar) {
        return this.f9782c > dVar.f9780a && dVar.f9782c > this.f9780a && this.f9783d > dVar.f9781b && dVar.f9783d > this.f9781b;
    }

    public final d g(float f9, float f10) {
        return new d(this.f9780a + f9, this.f9781b + f10, this.f9782c + f9, this.f9783d + f10);
    }

    public final d h(long j8) {
        return new d(c.d(j8) + this.f9780a, c.e(j8) + this.f9781b, c.d(j8) + this.f9782c, c.e(j8) + this.f9783d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9783d) + m.a(this.f9782c, m.a(this.f9781b, Float.hashCode(this.f9780a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + q.k(this.f9780a) + ", " + q.k(this.f9781b) + ", " + q.k(this.f9782c) + ", " + q.k(this.f9783d) + ')';
    }
}
