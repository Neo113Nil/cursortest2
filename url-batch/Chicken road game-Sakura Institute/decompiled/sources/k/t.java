package k;

import l.v1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final s0.g f5263a;

    /* renamed from: b, reason: collision with root package name */
    public final r6.l f5264b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f5265c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(s0.g gVar, q6.c cVar, v1 v1Var) {
        this.f5263a = gVar;
        this.f5264b = (r6.l) cVar;
        this.f5265c = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f5263a.equals(tVar.f5263a) && this.f5264b.equals(tVar.f5264b) && this.f5265c.equals(tVar.f5265c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f5265c.hashCode() + ((this.f5264b.hashCode() + (this.f5263a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f5263a + ", size=" + this.f5264b + ", animationSpec=" + this.f5265c + ", clip=true)";
    }
}
