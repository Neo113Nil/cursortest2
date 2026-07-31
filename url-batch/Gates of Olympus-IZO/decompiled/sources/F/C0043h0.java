package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* renamed from: F.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1255c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1256d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1257e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1258f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1259g;

    public C0043h0(long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f1253a = j3;
        this.f1254b = j4;
        this.f1255c = j5;
        this.f1256d = j6;
        this.f1257e = j7;
        this.f1258f = j8;
        this.f1259g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0043h0)) {
            return false;
        }
        C0043h0 c0043h0 = (C0043h0) obj;
        return C0288u.c(this.f1253a, c0043h0.f1253a) && C0288u.c(this.f1256d, c0043h0.f1256d) && C0288u.c(this.f1254b, c0043h0.f1254b) && C0288u.c(this.f1257e, c0043h0.f1257e) && C0288u.c(this.f1255c, c0043h0.f1255c) && C0288u.c(this.f1258f, c0043h0.f1258f) && C0288u.c(this.f1259g, c0043h0.f1259g);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1259g) + AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1253a) * 31, 31, this.f1256d), 31, this.f1254b), 31, this.f1257e), 31, this.f1255c), 31, this.f1258f);
    }
}
