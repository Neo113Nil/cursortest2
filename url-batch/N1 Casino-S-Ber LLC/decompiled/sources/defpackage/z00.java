package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class z00 implements Iterable {
    public w00 f;
    public w00 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public w00 a(Object obj) {
        w00 w00Var = this.f;
        while (w00Var != null && !w00Var.f.equals(obj)) {
            w00Var = w00Var.h;
        }
        return w00Var;
    }

    public Object b(Object obj) {
        w00 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((y00) it.next()).a(a);
            }
        }
        w00 w00Var = a.i;
        w00 w00Var2 = a.h;
        if (w00Var != null) {
            w00Var.h = w00Var2;
        } else {
            this.f = w00Var2;
        }
        w00 w00Var3 = a.h;
        if (w00Var3 != null) {
            w00Var3.i = w00Var;
        } else {
            this.g = w00Var;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.v00) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        if (this.i != z00Var.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = z00Var.iterator();
        while (true) {
            v00 v00Var = (v00) it;
            if (!v00Var.hasNext()) {
                break;
            }
            v00 v00Var2 = (v00) it2;
            if (!v00Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) v00Var.next();
            Object next = v00Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            v00 v00Var = (v00) it;
            if (!v00Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) v00Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        v00 v00Var = new v00(this.f, this.g, 0);
        this.h.put(v00Var, Boolean.FALSE);
        return v00Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            v00 v00Var = (v00) it;
            if (!v00Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) v00Var.next()).toString());
            if (v00Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
