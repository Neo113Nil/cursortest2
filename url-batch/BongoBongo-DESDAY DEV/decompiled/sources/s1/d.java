package s1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3600c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3601a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.d f3602b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = W0.r.f961a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(W0.s.q0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                h1.d.d(set, "singleton(...)");
            }
        }
        f3600c = new d(set, null);
    }

    public d(Set set, A1.d dVar) {
        this.f3601a = set;
        this.f3602b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (h1.d.a(dVar.f3601a, this.f3601a) && h1.d.a(dVar.f3602b, this.f3602b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3601a.hashCode() + 1517) * 41;
        A1.d dVar = this.f3602b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
