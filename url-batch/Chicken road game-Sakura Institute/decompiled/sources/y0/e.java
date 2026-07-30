package y0;

import a0.m;
import u3.q;
import v1.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f9784a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9785b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9786c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9787d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9788e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9789f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9790g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9791h;

    static {
        long j8 = a.f9772a;
        g.a(a.b(j8), a.c(j8));
    }

    public e(float f9, float f10, float f11, float f12, long j8, long j9, long j10, long j11) {
        this.f9784a = f9;
        this.f9785b = f10;
        this.f9786c = f11;
        this.f9787d = f12;
        this.f9788e = j8;
        this.f9789f = j9;
        this.f9790g = j10;
        this.f9791h = j11;
    }

    public final float a() {
        return this.f9787d - this.f9785b;
    }

    public final float b() {
        return this.f9786c - this.f9784a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f9784a, eVar.f9784a) == 0 && Float.compare(this.f9785b, eVar.f9785b) == 0 && Float.compare(this.f9786c, eVar.f9786c) == 0 && Float.compare(this.f9787d, eVar.f9787d) == 0 && a.a(this.f9788e, eVar.f9788e) && a.a(this.f9789f, eVar.f9789f) && a.a(this.f9790g, eVar.f9790g) && a.a(this.f9791h, eVar.f9791h);
    }

    public final int hashCode() {
        int a3 = m.a(this.f9787d, m.a(this.f9786c, m.a(this.f9785b, Float.hashCode(this.f9784a) * 31, 31), 31), 31);
        int i7 = a.f9773b;
        return Long.hashCode(this.f9791h) + m.d(m.d(m.d(a3, 31, this.f9788e), 31, this.f9789f), 31, this.f9790g);
    }

    public final String toString() {
        String str = q.k(this.f9784a) + ", " + q.k(this.f9785b) + ", " + q.k(this.f9786c) + ", " + q.k(this.f9787d);
        long j8 = this.f9788e;
        long j9 = this.f9789f;
        boolean a3 = a.a(j8, j9);
        long j10 = this.f9790g;
        long j11 = this.f9791h;
        if (!a3 || !a.a(j9, j10) || !a.a(j10, j11)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.d(j8)) + ", topRight=" + ((Object) a.d(j9)) + ", bottomRight=" + ((Object) a.d(j10)) + ", bottomLeft=" + ((Object) a.d(j11)) + ')';
        }
        if (a.b(j8) == a.c(j8)) {
            return "RoundRect(rect=" + str + ", radius=" + q.k(a.b(j8)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + q.k(a.b(j8)) + ", y=" + q.k(a.c(j8)) + ')';
    }
}
