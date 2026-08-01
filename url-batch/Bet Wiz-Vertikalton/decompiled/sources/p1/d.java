package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3316c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final x1.l f3318b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = W0.s.f898a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(W0.t.o0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                e1.d.d(set, "singleton(...)");
            }
        }
        f3316c = new d(set, null);
    }

    public d(Set set, x1.l lVar) {
        this.f3317a = set;
        this.f3318b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (e1.d.a(dVar.f3317a, this.f3317a) && e1.d.a(dVar.f3318b, this.f3318b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3317a.hashCode() + 1517) * 41;
        x1.l lVar = this.f3318b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
