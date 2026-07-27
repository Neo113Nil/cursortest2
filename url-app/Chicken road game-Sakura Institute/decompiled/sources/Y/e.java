package Y;

import A.AbstractC0017m;
import u3.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4380c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4381d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4382e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4383f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4384g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4385h;

    static {
        long j4 = a.f4366a;
        l.I(a.b(j4), a.c(j4));
    }

    public e(float f4, float f5, float f6, float f7, long j4, long j5, long j6, long j7) {
        this.f4378a = f4;
        this.f4379b = f5;
        this.f4380c = f6;
        this.f4381d = f7;
        this.f4382e = j4;
        this.f4383f = j5;
        this.f4384g = j6;
        this.f4385h = j7;
    }

    public final float a() {
        return this.f4381d - this.f4379b;
    }

    public final float b() {
        return this.f4380c - this.f4378a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f4378a, eVar.f4378a) == 0 && Float.compare(this.f4379b, eVar.f4379b) == 0 && Float.compare(this.f4380c, eVar.f4380c) == 0 && Float.compare(this.f4381d, eVar.f4381d) == 0 && a.a(this.f4382e, eVar.f4382e) && a.a(this.f4383f, eVar.f4383f) && a.a(this.f4384g, eVar.f4384g) && a.a(this.f4385h, eVar.f4385h);
    }

    public final int hashCode() {
        int a4 = AbstractC0017m.a(this.f4381d, AbstractC0017m.a(this.f4380c, AbstractC0017m.a(this.f4379b, Float.hashCode(this.f4378a) * 31, 31), 31), 31);
        int i2 = a.f4367b;
        return Long.hashCode(this.f4385h) + AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(a4, 31, this.f4382e), 31, this.f4383f), 31, this.f4384g);
    }

    public final String toString() {
        String str = M1.a.W(this.f4378a) + ", " + M1.a.W(this.f4379b) + ", " + M1.a.W(this.f4380c) + ", " + M1.a.W(this.f4381d);
        long j4 = this.f4382e;
        long j5 = this.f4383f;
        boolean a4 = a.a(j4, j5);
        long j6 = this.f4384g;
        long j7 = this.f4385h;
        if (!a4 || !a.a(j5, j6) || !a.a(j6, j7)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.d(j4)) + ", topRight=" + ((Object) a.d(j5)) + ", bottomRight=" + ((Object) a.d(j6)) + ", bottomLeft=" + ((Object) a.d(j7)) + ')';
        }
        if (a.b(j4) == a.c(j4)) {
            return "RoundRect(rect=" + str + ", radius=" + M1.a.W(a.b(j4)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + M1.a.W(a.b(j4)) + ", y=" + M1.a.W(a.c(j4)) + ')';
    }
}
