package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qy1 implements Iterable {
    public final WeakHashMap rtx2ld2ELZv4 = new WeakHashMap();
    public final int OPXfSBeufaJ8 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.oy1) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof qy1)) {
            return false;
        }
        qy1 qy1Var = (qy1) obj;
        if (this.OPXfSBeufaJ8 != qy1Var.OPXfSBeufaJ8) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = qy1Var.iterator();
        while (true) {
            oy1 oy1Var = (oy1) it;
            if (!oy1Var.hasNext()) {
                break;
            }
            oy1 oy1Var2 = (oy1) it2;
            if (!oy1Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) oy1Var.next();
            Object next = oy1Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            oy1 oy1Var = (oy1) it;
            if (!oy1Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) oy1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        oy1 oy1Var = new oy1();
        this.rtx2ld2ELZv4.put(oy1Var, Boolean.FALSE);
        return oy1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            oy1 oy1Var = (oy1) it;
            if (!oy1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) oy1Var.next()).toString());
            if (oy1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
