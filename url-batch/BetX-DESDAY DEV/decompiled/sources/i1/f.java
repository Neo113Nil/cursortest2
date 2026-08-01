package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f2660c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f2661a;

    /* renamed from: b, reason: collision with root package name */
    public final m f2662b;

    static {
        ArrayList arrayList = new ArrayList();
        Set set = O0.s.f697a;
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
        f2660c = new f(set, null);
    }

    public f(Set set, m mVar) {
        this.f2661a = set;
        this.f2662b = mVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (X0.f.a(fVar.f2661a, this.f2661a) && X0.f.a(fVar.f2662b, this.f2662b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f2661a.hashCode() + 1517) * 41;
        m mVar = this.f2662b;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
