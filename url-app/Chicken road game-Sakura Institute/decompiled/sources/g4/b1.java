package g4;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4256b;

    public b1(List list, Map map) {
        r6.k.f(list, "meals");
        r6.k.f(map, "bySlot");
        this.f4255a = list;
        this.f4256b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return r6.k.a(this.f4255a, b1Var.f4255a) && r6.k.a(this.f4256b, b1Var.f4256b);
    }

    public final int hashCode() {
        return this.f4256b.hashCode() + (this.f4255a.hashCode() * 31);
    }

    public final String toString() {
        return "PlannerUi(meals=" + this.f4255a + ", bySlot=" + this.f4256b + ")";
    }
}
