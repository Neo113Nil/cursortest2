package H1;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f1910a;

    /* renamed from: b, reason: collision with root package name */
    public final com.gates.olympus.miruv.data.d f1911b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1912c;

    public v(List list, com.gates.olympus.miruv.data.d dVar, Set set) {
        Z1.i.f(list, "all");
        Z1.i.f(set, "savedIds");
        this.f1910a = list;
        this.f1911b = dVar;
        this.f1912c = set;
    }

    public static v a(v vVar, com.gates.olympus.miruv.data.d dVar, Set set, int i3) {
        List list = vVar.f1910a;
        if ((i3 & 2) != 0) {
            dVar = vVar.f1911b;
        }
        if ((i3 & 4) != 0) {
            set = vVar.f1912c;
        }
        vVar.getClass();
        Z1.i.f(list, "all");
        Z1.i.f(set, "savedIds");
        return new v(list, dVar, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Z1.i.a(this.f1910a, vVar.f1910a) && this.f1911b == vVar.f1911b && Z1.i.a(this.f1912c, vVar.f1912c);
    }

    public final int hashCode() {
        int hashCode = this.f1910a.hashCode() * 31;
        com.gates.olympus.miruv.data.d dVar = this.f1911b;
        return this.f1912c.hashCode() + ((hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public final String toString() {
        return "JointsState(all=" + this.f1910a + ", filter=" + this.f1911b + ", savedIds=" + this.f1912c + ")";
    }
}
