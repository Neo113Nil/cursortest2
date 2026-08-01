package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class jb0 implements Iterable {
    public gb0 f;
    public gb0 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public gb0 a(Object obj) {
        gb0 gb0Var = this.f;
        while (gb0Var != null && !gb0Var.f.equals(obj)) {
            gb0Var = gb0Var.h;
        }
        return gb0Var;
    }

    public Object b(Object obj) {
        gb0 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((ib0) it.next()).a(a);
            }
        }
        gb0 gb0Var = a.i;
        gb0 gb0Var2 = a.h;
        if (gb0Var != null) {
            gb0Var.h = gb0Var2;
        } else {
            this.f = gb0Var2;
        }
        gb0 gb0Var3 = a.h;
        if (gb0Var3 != null) {
            gb0Var3.i = gb0Var;
        } else {
            this.g = gb0Var;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.fb0) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        if (this.i != jb0Var.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = jb0Var.iterator();
        while (true) {
            fb0 fb0Var = (fb0) it;
            if (!fb0Var.hasNext()) {
                break;
            }
            fb0 fb0Var2 = (fb0) it2;
            if (!fb0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) fb0Var.next();
            Object next = fb0Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            fb0 fb0Var = (fb0) it;
            if (!fb0Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) fb0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fb0 fb0Var = new fb0(this.f, this.g, 0);
        this.h.put(fb0Var, Boolean.FALSE);
        return fb0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            fb0 fb0Var = (fb0) it;
            if (!fb0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) fb0Var.next()).toString());
            if (fb0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
