package r1;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3416c = new d(V0.g.E0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.l f3418b;

    public d(Set set, z1.l lVar) {
        this.f3417a = set;
        this.f3418b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (g1.d.a(dVar.f3417a, this.f3417a) && g1.d.a(dVar.f3418b, this.f3418b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3417a.hashCode() + 1517) * 41;
        z1.l lVar = this.f3418b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
