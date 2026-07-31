package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1017a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1018b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1019c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1020d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1021e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1022f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1023g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1024h;

    /* renamed from: i, reason: collision with root package name */
    public final long f1025i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1026j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1027k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1028l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1029m;

    public J0(long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f1017a = j3;
        this.f1018b = j4;
        this.f1019c = j5;
        this.f1020d = j6;
        this.f1021e = j7;
        this.f1022f = j8;
        this.f1023g = j9;
        this.f1024h = j10;
        this.f1025i = j11;
        this.f1026j = j12;
        this.f1027k = j13;
        this.f1028l = j14;
        this.f1029m = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return C0288u.c(this.f1017a, j02.f1017a) && C0288u.c(this.f1018b, j02.f1018b) && C0288u.c(this.f1019c, j02.f1019c) && C0288u.c(this.f1020d, j02.f1020d) && C0288u.c(this.f1021e, j02.f1021e) && C0288u.c(this.f1022f, j02.f1022f) && C0288u.c(this.f1023g, j02.f1023g) && C0288u.c(this.f1024h, j02.f1024h) && C0288u.c(this.f1025i, j02.f1025i) && C0288u.c(this.f1026j, j02.f1026j) && C0288u.c(this.f1027k, j02.f1027k) && C0288u.c(this.f1028l, j02.f1028l) && C0288u.c(this.f1029m, j02.f1029m);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1029m) + AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1017a) * 31, 31, this.f1018b), 31, this.f1019c), 31, this.f1020d), 31, this.f1021e), 31, this.f1022f), 31, this.f1023g), 31, this.f1024h), 31, this.f1025i), 31, this.f1026j), 31, this.f1027k), 31, this.f1028l);
    }
}
