package m1;

import j0.AbstractC0143a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3137c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3138a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0143a f3139b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = T0.s.f831a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(T0.t.j0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                b1.d.d(set, "singleton(...)");
            }
        }
        f3137c = new d(set, null);
    }

    public d(Set set, AbstractC0143a abstractC0143a) {
        this.f3138a = set;
        this.f3139b = abstractC0143a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (b1.d.a(dVar.f3138a, this.f3138a) && b1.d.a(dVar.f3139b, this.f3139b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3138a.hashCode() + 1517) * 41;
        AbstractC0143a abstractC0143a = this.f3139b;
        return hashCode + (abstractC0143a != null ? abstractC0143a.hashCode() : 0);
    }
}
