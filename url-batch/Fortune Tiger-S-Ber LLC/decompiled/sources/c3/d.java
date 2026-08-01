package c3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {
    public static final d c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final l0.g f1029b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i4 = 0;
            if (size != 1) {
                set = new LinkedHashSet(n2.r.B(arrayList.size()));
                int size2 = arrayList.size();
                while (i4 < size2) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                u2.c.d(set, "singleton(...)");
            }
        } else {
            set = n2.q.f2955f;
        }
        c = new d(set, null);
    }

    public d(Set set, l0.g gVar) {
        this.f1028a = set;
        this.f1029b = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return u2.c.a(dVar.f1028a, this.f1028a) && u2.c.a(dVar.f1029b, this.f1029b);
    }

    public final int hashCode() {
        int hashCode = (this.f1028a.hashCode() + 1517) * 41;
        l0.g gVar = this.f1029b;
        return hashCode + (gVar != null ? gVar.hashCode() : 0);
    }
}
