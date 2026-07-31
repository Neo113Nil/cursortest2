package F;

import H2.AbstractC0080b;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056o {

    /* renamed from: a, reason: collision with root package name */
    public final float f1313a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1314b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1315c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1316d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1317e;

    public C0056o(float f3, float f4, float f5, float f6, float f7) {
        this.f1313a = f3;
        this.f1314b = f4;
        this.f1315c = f5;
        this.f1316d = f6;
        this.f1317e = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0056o)) {
            return false;
        }
        C0056o c0056o = (C0056o) obj;
        return M0.e.a(this.f1313a, c0056o.f1313a) && M0.e.a(this.f1314b, c0056o.f1314b) && M0.e.a(this.f1315c, c0056o.f1315c) && M0.e.a(this.f1316d, c0056o.f1316d) && M0.e.a(this.f1317e, c0056o.f1317e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1317e) + AbstractC0080b.a(this.f1316d, AbstractC0080b.a(this.f1315c, AbstractC0080b.a(this.f1314b, Float.hashCode(this.f1313a) * 31, 31), 31), 31);
    }
}
