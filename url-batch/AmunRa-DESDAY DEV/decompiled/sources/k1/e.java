package k1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k0.y;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f2782c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2783a;

    /* renamed from: b, reason: collision with root package name */
    public final y f2784b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = R0.s.f714a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(R0.t.n0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                Z0.d.d(set, "singleton(...)");
            }
        }
        f2782c = new e(set, null);
    }

    public e(Set set, y yVar) {
        this.f2783a = set;
        this.f2784b = yVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (Z0.d.a(eVar.f2783a, this.f2783a) && Z0.d.a(eVar.f2784b, this.f2784b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2783a.hashCode() + 1517) * 41;
        y yVar = this.f2784b;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }
}
