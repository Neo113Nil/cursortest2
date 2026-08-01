package o1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3271c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final w1.d f3273b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = S0.r.f797a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(S0.s.b0(arrayList.size()));
                d1.d.e(arrayList, "<this>");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                d1.d.d(set, "singleton(...)");
            }
        }
        f3271c = new d(set, null);
    }

    public d(Set set, w1.d dVar) {
        this.f3272a = set;
        this.f3273b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (d1.d.a(dVar.f3272a, this.f3272a) && d1.d.a(dVar.f3273b, this.f3273b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3272a.hashCode() + 1517) * 41;
        w1.d dVar = this.f3273b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
