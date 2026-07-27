package D;

import A.AbstractC0017m;
import Z.C0323u;
import y2.y;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156o {

    /* renamed from: a, reason: collision with root package name */
    public final long f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1935b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1936c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1937d;

    public C0156o(long j4, long j5, long j6, long j7) {
        this.f1934a = j4;
        this.f1935b = j5;
        this.f1936c = j6;
        this.f1937d = j7;
    }

    public final C0156o a(long j4, long j5, long j6, long j7) {
        return new C0156o(j4 != 16 ? j4 : this.f1934a, j5 != 16 ? j5 : this.f1935b, j6 != 16 ? j6 : this.f1936c, j7 != 16 ? j7 : this.f1937d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0156o)) {
            return false;
        }
        C0156o c0156o = (C0156o) obj;
        return C0323u.c(this.f1934a, c0156o.f1934a) && C0323u.c(this.f1935b, c0156o.f1935b) && C0323u.c(this.f1936c, c0156o.f1936c) && C0323u.c(this.f1937d, c0156o.f1937d);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f1937d) + AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f1934a) * 31, 31, this.f1935b), 31, this.f1936c);
    }
}
