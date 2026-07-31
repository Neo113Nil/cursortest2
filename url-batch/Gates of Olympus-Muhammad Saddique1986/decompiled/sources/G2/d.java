package G2;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2153c = new d(S1.l.d1(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f2154a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.c f2155b;

    public d(Set set, l0.c cVar) {
        this.f2154a = set;
        this.f2155b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (f2.j.a(dVar.f2154a, this.f2154a) && f2.j.a(dVar.f2155b, this.f2155b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2154a.hashCode() + 1517) * 41;
        l0.c cVar = this.f2155b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
