package j1;

import c6.f;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f4920a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4921b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4922c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4923d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4924e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4925f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4926h;

    static {
        g8.b.i(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f3, float f10, float f11, float f12, long j, long j3, long j10, long j11) {
        this.f4920a = f3;
        this.f4921b = f10;
        this.f4922c = f11;
        this.f4923d = f12;
        this.f4924e = j;
        this.f4925f = j3;
        this.g = j10;
        this.f4926h = j11;
    }

    public final float a() {
        return this.f4923d - this.f4921b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f4920a, dVar.f4920a) == 0 && Float.compare(this.f4921b, dVar.f4921b) == 0 && Float.compare(this.f4922c, dVar.f4922c) == 0 && Float.compare(this.f4923d, dVar.f4923d) == 0 && a.a.r(this.f4924e, dVar.f4924e) && a.a.r(this.f4925f, dVar.f4925f) && a.a.r(this.g, dVar.g) && a.a.r(this.f4926h, dVar.f4926h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4926h) + l.c(l.c(l.c(l.b(this.f4923d, l.b(this.f4922c, l.b(this.f4921b, Float.hashCode(this.f4920a) * 31, 31), 31), 31), 31, this.f4924e), 31, this.f4925f), 31, this.g);
    }

    public final String toString() {
        String str = f.e0(this.f4920a) + ", " + f.e0(this.f4921b) + ", " + f.e0(this.f4922c) + ", " + f.e0(this.f4923d);
        long j = this.f4924e;
        long j3 = this.f4925f;
        boolean r9 = a.a.r(j, j3);
        long j10 = this.g;
        long j11 = this.f4926h;
        if (!r9 || !a.a.r(j3, j10) || !a.a.r(j10, j11)) {
            StringBuilder q3 = v4.a.q("RoundRect(rect=", str, ", topLeft=");
            q3.append((Object) a.a.c0(j));
            q3.append(", topRight=");
            q3.append((Object) a.a.c0(j3));
            q3.append(", bottomRight=");
            q3.append((Object) a.a.c0(j10));
            q3.append(", bottomLeft=");
            q3.append((Object) a.a.c0(j11));
            q3.append(')');
            return q3.toString();
        }
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i3) == Float.intBitsToFloat(i10)) {
            StringBuilder q7 = v4.a.q("RoundRect(rect=", str, ", radius=");
            q7.append(f.e0(Float.intBitsToFloat(i3)));
            q7.append(')');
            return q7.toString();
        }
        StringBuilder q10 = v4.a.q("RoundRect(rect=", str, ", x=");
        q10.append(f.e0(Float.intBitsToFloat(i3)));
        q10.append(", y=");
        q10.append(f.e0(Float.intBitsToFloat(i10)));
        q10.append(')');
        return q10.toString();
    }
}
