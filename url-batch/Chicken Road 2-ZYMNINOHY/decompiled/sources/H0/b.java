package H0;

import O3.l;
import T.D;

/* loaded from: classes.dex */
public final class b implements D {

    /* renamed from: a, reason: collision with root package name */
    public final long f1084a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1085b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1086c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1087d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1088e;

    public b(long j4, long j5, long j6, long j7, long j8) {
        this.f1084a = j4;
        this.f1085b = j5;
        this.f1086c = j6;
        this.f1087d = j7;
        this.f1088e = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f1084a == bVar.f1084a && this.f1085b == bVar.f1085b && this.f1086c == bVar.f1086c && this.f1087d == bVar.f1087d && this.f1088e == bVar.f1088e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.r(this.f1088e) + ((l.r(this.f1087d) + ((l.r(this.f1086c) + ((l.r(this.f1085b) + ((l.r(this.f1084a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1084a + ", photoSize=" + this.f1085b + ", photoPresentationTimestampUs=" + this.f1086c + ", videoStartPosition=" + this.f1087d + ", videoSize=" + this.f1088e;
    }
}
