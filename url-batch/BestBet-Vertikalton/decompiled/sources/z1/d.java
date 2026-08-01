package z1;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f4647c = new d(Y0.j.E0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f4648a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.d f4649b;

    public d(Set set, H1.d dVar) {
        this.f4648a = set;
        this.f4649b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (k1.e.a(dVar.f4648a, this.f4648a) && k1.e.a(dVar.f4649b, this.f4649b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4648a.hashCode() + 1517) * 41;
        H1.d dVar = this.f4649b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
