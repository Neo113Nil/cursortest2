package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2406c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2408b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = Q0.s.f672a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(Q0.t.d0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                X0.d.d(set, "singleton(...)");
            }
        }
        f2406c = new d(set, null);
    }

    public d(Set set, p pVar) {
        this.f2407a = set;
        this.f2408b = pVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (X0.d.a(dVar.f2407a, this.f2407a) && X0.d.a(dVar.f2408b, this.f2408b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2407a.hashCode() + 1517) * 41;
        p pVar = this.f2408b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }
}
