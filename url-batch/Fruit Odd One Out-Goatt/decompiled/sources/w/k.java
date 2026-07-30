package w;

import l.r;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final r f1224b;

    public k(t.b bVar, r rVar) {
        rVar.getClass();
        this.f1223a = bVar;
        this.f1224b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        k kVar = (k) obj;
        return d1.h.a(this.f1223a, kVar.f1223a) && d1.h.a(this.f1224b, kVar.f1224b);
    }

    public final int hashCode() {
        return this.f1224b.hashCode() + (this.f1223a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1223a + ", windowInsetsCompat=" + this.f1224b + ')';
    }
}
