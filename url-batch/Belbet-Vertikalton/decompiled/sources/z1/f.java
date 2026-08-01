package z1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f4828c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f4829a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.l f4830b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    static {
        ArrayList arrayList = new ArrayList();
        X0.v vVar = X0.v.f1387a;
        int size = arrayList.size();
        X0.v vVar2 = vVar;
        if (size != 0) {
            if (size != 1) {
                ?? linkedHashSet = new LinkedHashSet(X0.w.h0(arrayList.size()));
                X0.k.r0(arrayList, linkedHashSet);
                vVar2 = linkedHashSet;
            } else {
                ?? singleton = Collections.singleton(arrayList.get(0));
                j1.h.d(singleton, "singleton(...)");
                vVar2 = singleton;
            }
        }
        f4828c = new f(vVar2, null);
    }

    public f(Set set, H1.l lVar) {
        this.f4829a = set;
        this.f4830b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (j1.h.a(fVar.f4829a, this.f4829a) && j1.h.a(fVar.f4830b, this.f4830b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4829a.hashCode() + 1517) * 41;
        H1.l lVar = this.f4830b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
