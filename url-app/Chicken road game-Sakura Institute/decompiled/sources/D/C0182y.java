package D;

import A.AbstractC0017m;
import Z.C0323u;
import y2.y;

/* renamed from: D.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182y {

    /* renamed from: a, reason: collision with root package name */
    public final long f2103a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2104b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2105c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2106d;

    public C0182y(long j4, long j5, long j6, long j7) {
        this.f2103a = j4;
        this.f2104b = j5;
        this.f2105c = j6;
        this.f2106d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0182y)) {
            return false;
        }
        C0182y c0182y = (C0182y) obj;
        return C0323u.c(this.f2103a, c0182y.f2103a) && C0323u.c(this.f2104b, c0182y.f2104b) && C0323u.c(this.f2105c, c0182y.f2105c) && C0323u.c(this.f2106d, c0182y.f2106d);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f2106d) + AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f2103a) * 31, 31, this.f2104b), 31, this.f2105c);
    }
}
