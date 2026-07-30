package b1;

import m2.k;
import z0.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public m2.b f1225a;

    /* renamed from: b, reason: collision with root package name */
    public k f1226b;

    /* renamed from: c, reason: collision with root package name */
    public r f1227c;

    /* renamed from: d, reason: collision with root package name */
    public long f1228d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r6.k.a(this.f1225a, aVar.f1225a) && this.f1226b == aVar.f1226b && r6.k.a(this.f1227c, aVar.f1227c) && y0.f.a(this.f1228d, aVar.f1228d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1228d) + ((this.f1227c.hashCode() + ((this.f1226b.hashCode() + (this.f1225a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f1225a + ", layoutDirection=" + this.f1226b + ", canvas=" + this.f1227c + ", size=" + ((Object) y0.f.f(this.f1228d)) + ')';
    }
}
