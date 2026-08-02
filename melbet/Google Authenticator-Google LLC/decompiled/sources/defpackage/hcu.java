package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hcu implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hcu hcuVar) {
        if (hcuVar == hct.a) {
            return 1;
        }
        if (hcuVar == hcr.a) {
            return -1;
        }
        Comparable comparable = hcuVar.b;
        hip hipVar = hip.a;
        int compareTo = "".compareTo("");
        return compareTo != 0 ? compareTo : Boolean.compare(this instanceof hcs, hcuVar instanceof hcs);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hcu) {
            try {
                if (compareTo((hcu) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }
}
