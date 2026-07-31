package A2;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f60c = new d(M1.l.F0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f61a;

    /* renamed from: b, reason: collision with root package name */
    public final I2.l f62b;

    public d(Set set, I2.l lVar) {
        this.f61a = set;
        this.f62b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Z1.i.a(dVar.f61a, this.f61a) && Z1.i.a(dVar.f62b, this.f62b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f61a.hashCode() + 1517) * 41;
        I2.l lVar = this.f62b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
