package a1;

import a0.q;
import q3.k;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final long f216b;

    /* renamed from: c, reason: collision with root package name */
    public final j f217c;

    /* renamed from: d, reason: collision with root package name */
    public final k f218d;

    public i(int i, long j7, j jVar, k kVar) {
        this.f215a = i;
        this.f216b = j7;
        this.f217c = jVar;
        this.f218d = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f215a == iVar.f215a && this.f216b == iVar.f216b && this.f217c == iVar.f217c && q6.i.a(this.f218d, iVar.f218d);
    }

    public final int hashCode() {
        int hashCode = (this.f217c.hashCode() + q.c(Integer.hashCode(this.f215a) * 31, 31, this.f216b)) * 31;
        k kVar = this.f218d;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f215a + ", timestamp=" + this.f216b + ", type=" + this.f217c + ", structureCompat=" + this.f218d + ')';
    }
}
