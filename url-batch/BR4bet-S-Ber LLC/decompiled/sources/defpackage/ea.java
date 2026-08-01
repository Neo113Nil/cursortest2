package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ea {
    public static final ea c;
    public final Set a;
    public final xf b;

    static {
        Set set;
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        if (size != 0) {
            int i = 0;
            if (size != 1) {
                set = new LinkedHashSet(pu.p0(arrayList.size()));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    set.add(obj);
                }
            } else {
                set = Collections.singleton(arrayList.get(0));
                set.getClass();
            }
        } else {
            set = kk.f;
        }
        c = new ea(set, null);
    }

    public ea(Set set, xf xfVar) {
        this.a = set;
        this.b = xfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        return eaVar.a.equals(this.a) && kr.b(eaVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        xf xfVar = this.b;
        return hashCode + (xfVar != null ? xfVar.hashCode() : 0);
    }
}
