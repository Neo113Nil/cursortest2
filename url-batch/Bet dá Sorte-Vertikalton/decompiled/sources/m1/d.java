package m1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k0.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3169c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3170a;

    /* renamed from: b, reason: collision with root package name */
    public final z f3171b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = T0.s.f846a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(T0.t.r0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                b1.d.d(set, "singleton(...)");
            }
        }
        f3169c = new d(set, null);
    }

    public d(Set set, z zVar) {
        this.f3170a = set;
        this.f3171b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (b1.d.a(dVar.f3170a, this.f3170a) && b1.d.a(dVar.f3171b, this.f3171b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3170a.hashCode() + 1517) * 41;
        z zVar = this.f3171b;
        return hashCode + (zVar != null ? zVar.hashCode() : 0);
    }
}
