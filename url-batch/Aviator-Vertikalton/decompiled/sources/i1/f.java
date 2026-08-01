package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f2656c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2657a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2658b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = O0.s.f696a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                set = new LinkedHashSet(O0.t.u0(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    set.add(it.next());
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                X0.f.d(set, "singleton(...)");
            }
        }
        f2656c = new f(set, null);
    }

    public f(Set set, m mVar) {
        this.f2657a = set;
        this.f2658b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (X0.f.a(fVar.f2657a, this.f2657a) && X0.f.a(fVar.f2658b, this.f2658b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2657a.hashCode() + 1517) * 41;
        m mVar = this.f2658b;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
