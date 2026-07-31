package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* renamed from: F.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046j {

    /* renamed from: a, reason: collision with root package name */
    public final long f1269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1270b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1271c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1272d;

    public C0046j(long j3, long j4, long j5, long j6) {
        this.f1269a = j3;
        this.f1270b = j4;
        this.f1271c = j5;
        this.f1272d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0046j)) {
            return false;
        }
        C0046j c0046j = (C0046j) obj;
        return C0288u.c(this.f1269a, c0046j.f1269a) && C0288u.c(this.f1270b, c0046j.f1270b) && C0288u.c(this.f1271c, c0046j.f1271c) && C0288u.c(this.f1272d, c0046j.f1272d);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1272d) + AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1269a) * 31, 31, this.f1270b), 31, this.f1271c);
    }
}
