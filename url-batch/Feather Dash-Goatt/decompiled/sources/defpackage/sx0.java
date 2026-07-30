package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sx0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public sx0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return xa0.n(this.a, sx0Var.a) && this.b == sx0Var.b && wq0.b(this.c, sx0Var.c) && wq0.b(this.d, sx0Var.d) && this.e == sx0Var.e && Float.compare(this.f, sx0Var.f) == 0 && this.g == sx0Var.g && this.h == sx0Var.h && this.i.equals(sx0Var.i) && wq0.b(this.j, sx0Var.j) && wq0.b(this.k, sx0Var.k);
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + qy0.e(this.j, (this.i.hashCode() + qy0.d(qy0.c(this.g, qy0.b(this.f, qy0.d(qy0.e(this.d, qy0.e(this.c, qy0.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31), 31, this.h)) * 31, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) xa0.z(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) wq0.g(this.c)) + ", position=" + ((Object) wq0.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) zx0.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) wq0.g(this.j)) + ", originalEventPosition=" + ((Object) wq0.g(this.k)) + ')';
    }
}
