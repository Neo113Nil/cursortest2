package f1;

import kotlin.jvm.internal.Intrinsics;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final g f4059c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.c f4060d;

    public f(int i3, long j, g gVar, d9.c cVar) {
        this.f4057a = i3;
        this.f4058b = j;
        this.f4059c = gVar;
        this.f4060d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4057a == fVar.f4057a && this.f4058b == fVar.f4058b && this.f4059c == fVar.f4059c && Intrinsics.a(this.f4060d, fVar.f4060d);
    }

    public final int hashCode() {
        int hashCode = (this.f4059c.hashCode() + l.c(Integer.hashCode(this.f4057a) * 31, 31, this.f4058b)) * 31;
        d9.c cVar = this.f4060d;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f4057a + ", timestamp=" + this.f4058b + ", type=" + this.f4059c + ", structureCompat=" + this.f4060d + ')';
    }
}
