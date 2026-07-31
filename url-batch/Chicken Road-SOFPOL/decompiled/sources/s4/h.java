package s4;

import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    public final b f6723a;

    public h(b bVar) {
        q6.i.e(bVar, "latestEvent");
        this.f6723a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h.class == obj.getClass() && q6.i.a(this.f6723a, ((h) obj).f6723a);
    }

    public final int hashCode() {
        return this.f6723a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f6723a + ", direction=-1)";
    }
}
