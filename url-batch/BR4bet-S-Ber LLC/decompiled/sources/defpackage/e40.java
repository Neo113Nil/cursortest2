package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class e40 implements Iterable {
    public b40 f;
    public b40 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public b40 a(Object obj) {
        b40 b40Var = this.f;
        while (b40Var != null && !b40Var.f.equals(obj)) {
            b40Var = b40Var.h;
        }
        return b40Var;
    }

    public Object b(Object obj) {
        b40 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((d40) it.next()).a(a);
            }
        }
        b40 b40Var = a.i;
        b40 b40Var2 = a.h;
        if (b40Var != null) {
            b40Var.h = b40Var2;
        } else {
            this.f = b40Var2;
        }
        b40 b40Var3 = a.h;
        if (b40Var3 != null) {
            b40Var3.i = b40Var;
        } else {
            this.g = b40Var;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.a40) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        if (this.i != e40Var.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = e40Var.iterator();
        while (true) {
            a40 a40Var = (a40) it;
            if (!a40Var.hasNext()) {
                break;
            }
            a40 a40Var2 = (a40) it2;
            if (!a40Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) a40Var.next();
            Object next = a40Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            a40 a40Var = (a40) it;
            if (!a40Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) a40Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a40 a40Var = new a40(this.f, this.g, 0);
        this.h.put(a40Var, Boolean.FALSE);
        return a40Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            a40 a40Var = (a40) it;
            if (!a40Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) a40Var.next()).toString());
            if (a40Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
