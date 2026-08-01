package c1;

import a.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends y {

    /* renamed from: n, reason: collision with root package name */
    public final b f778n;

    public g(b bVar) {
        f3.d.e(bVar, "latestEvent");
        this.f778n = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && f3.d.a(this.f778n, ((g) obj).f778n);
    }

    public final int hashCode() {
        return this.f778n.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f778n + ", direction=-1)";
    }
}
