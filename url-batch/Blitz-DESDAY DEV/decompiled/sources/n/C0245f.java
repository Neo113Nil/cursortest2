package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C0242c f3223a;

    /* renamed from: b, reason: collision with root package name */
    public C0242c f3224b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3225c = new WeakHashMap();
    public int d = 0;

    public C0242c a(Object obj) {
        C0242c c0242c = this.f3223a;
        while (c0242c != null && !c0242c.f3217a.equals(obj)) {
            c0242c = c0242c.f3219c;
        }
        return c0242c;
    }

    public Object b(Object obj) {
        C0242c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f3225c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0244e) it.next()).a(a2);
            }
        }
        C0242c c0242c = a2.d;
        if (c0242c != null) {
            c0242c.f3219c = a2.f3219c;
        } else {
            this.f3223a = a2.f3219c;
        }
        C0242c c0242c2 = a2.f3219c;
        if (c0242c2 != null) {
            c0242c2.d = c0242c;
        } else {
            this.f3224b = c0242c;
        }
        a2.f3219c = null;
        a2.d = null;
        return a2.f3218b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.C0241b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0245f)) {
            return false;
        }
        C0245f c0245f = (C0245f) obj;
        if (this.d != c0245f.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0245f.iterator();
        while (true) {
            C0241b c0241b = (C0241b) it;
            if (!c0241b.hasNext()) {
                break;
            }
            C0241b c0241b2 = (C0241b) it2;
            if (!c0241b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0241b.next();
            Object next = c0241b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C0241b c0241b = (C0241b) it;
            if (!c0241b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c0241b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0241b c0241b = new C0241b(this.f3223a, this.f3224b, 0);
        this.f3225c.put(c0241b, Boolean.FALSE);
        return c0241b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0241b c0241b = (C0241b) it;
            if (!c0241b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0241b.next()).toString());
            if (c0241b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
