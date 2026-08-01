package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f2404c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2405a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2406b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = Q0.s.f673a;
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
        f2404c = new d(set, null);
    }

    public d(Set set, q qVar) {
        this.f2405a = set;
        this.f2406b = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (X0.d.a(dVar.f2405a, this.f2405a) && X0.d.a(dVar.f2406b, this.f2406b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2405a.hashCode() + 1517) * 41;
        q qVar = this.f2406b;
        return hashCode + (qVar != null ? qVar.hashCode() : 0);
    }
}
