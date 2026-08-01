package r1;

import X0.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3450c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3451a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.d f3452b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = X0.u.f994a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(v.g0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                g1.d.d(set, "singleton(...)");
            }
        }
        f3450c = new d(set, null);
    }

    public d(Set set, z1.d dVar) {
        this.f3451a = set;
        this.f3452b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (g1.d.a(dVar.f3451a, this.f3451a) && g1.d.a(dVar.f3452b, this.f3452b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3451a.hashCode() + 1517) * 41;
        z1.d dVar = this.f3452b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
