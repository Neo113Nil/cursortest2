package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class p10 implements Iterable {
    public m10 f;
    public m10 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public m10 a(Object obj) {
        m10 m10Var = this.f;
        while (m10Var != null && !m10Var.f.equals(obj)) {
            m10Var = m10Var.h;
        }
        return m10Var;
    }

    public Object b(Object obj) {
        m10 a = a(obj);
        if (a == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((o10) it.next()).a(a);
            }
        }
        m10 m10Var = a.i;
        m10 m10Var2 = a.h;
        if (m10Var != null) {
            m10Var.h = m10Var2;
        } else {
            this.f = m10Var2;
        }
        m10 m10Var3 = a.h;
        if (m10Var3 != null) {
            m10Var3.i = m10Var;
        } else {
            this.g = m10Var;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.l10) r6).hasNext() != false) goto L28;
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
        if (!(obj instanceof p10)) {
            return false;
        }
        p10 p10Var = (p10) obj;
        if (this.i != p10Var.i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = p10Var.iterator();
        while (true) {
            l10 l10Var = (l10) it;
            if (!l10Var.hasNext()) {
                break;
            }
            l10 l10Var2 = (l10) it2;
            if (!l10Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) l10Var.next();
            Object next = l10Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            l10 l10Var = (l10) it;
            if (!l10Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) l10Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l10 l10Var = new l10(this.f, this.g, 0);
        this.h.put(l10Var, Boolean.FALSE);
        return l10Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            l10 l10Var = (l10) it;
            if (!l10Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) l10Var.next()).toString());
            if (l10Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
