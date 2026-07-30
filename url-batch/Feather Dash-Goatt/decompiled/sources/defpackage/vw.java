package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class vw implements Iterable {
    public j51 d;
    public j51 e;
    public final WeakHashMap g = new WeakHashMap();
    public int h = 0;
    public final HashMap i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.i51) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        if (this.h != vwVar.h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = vwVar.iterator();
        while (true) {
            i51 i51Var = (i51) it;
            if (!i51Var.hasNext()) {
                break;
            }
            i51 i51Var2 = (i51) it2;
            if (!i51Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) i51Var.next();
            Object next = i51Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            i51 i51Var = (i51) it;
            if (!i51Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) i51Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i51 i51Var = new i51(this.d, this.e, 0);
        this.g.put(i51Var, Boolean.FALSE);
        return i51Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            i51 i51Var = (i51) it;
            if (!i51Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) i51Var.next()).toString());
            if (i51Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
