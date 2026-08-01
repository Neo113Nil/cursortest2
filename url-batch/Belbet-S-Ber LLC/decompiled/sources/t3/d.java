package t3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f3415c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f3416a;

    /* renamed from: b, reason: collision with root package name */
    public final b4.d f3417b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                set = new LinkedHashSet(x2.t.F(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                i3.d.d(set, "singleton(...)");
            }
        } else {
            set = x2.s.f3889f;
        }
        f3415c = new d(set, null);
    }

    public d(Set set, b4.d dVar) {
        this.f3416a = set;
        this.f3417b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i3.d.a(dVar.f3416a, this.f3416a) && i3.d.a(dVar.f3417b, this.f3417b);
    }

    public final int hashCode() {
        int hashCode = (this.f3416a.hashCode() + 1517) * 41;
        b4.d dVar = this.f3417b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
