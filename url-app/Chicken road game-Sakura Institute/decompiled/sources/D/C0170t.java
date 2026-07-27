package D;

import A.AbstractC0017m;

/* renamed from: D.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170t {

    /* renamed from: a, reason: collision with root package name */
    public final float f2020a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2021b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2022c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2023d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2024e;

    public C0170t(float f4, float f5, float f6, float f7, float f8) {
        this.f2020a = f4;
        this.f2021b = f5;
        this.f2022c = f6;
        this.f2023d = f7;
        this.f2024e = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0170t)) {
            return false;
        }
        C0170t c0170t = (C0170t) obj;
        return M0.e.a(this.f2020a, c0170t.f2020a) && M0.e.a(this.f2021b, c0170t.f2021b) && M0.e.a(this.f2022c, c0170t.f2022c) && M0.e.a(this.f2023d, c0170t.f2023d) && M0.e.a(this.f2024e, c0170t.f2024e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2024e) + AbstractC0017m.a(this.f2023d, AbstractC0017m.a(this.f2022c, AbstractC0017m.a(this.f2021b, Float.hashCode(this.f2020a) * 31, 31), 31), 31);
    }
}
