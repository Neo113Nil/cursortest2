package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f3273a;

    /* renamed from: b, reason: collision with root package name */
    public c f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f3275c = new WeakHashMap();
    public int d = 0;

    public c a(Object obj) {
        c cVar = this.f3273a;
        while (cVar != null && !cVar.f3267a.equals(obj)) {
            cVar = cVar.f3269c;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f3275c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a2);
            }
        }
        c cVar = a2.d;
        if (cVar != null) {
            cVar.f3269c = a2.f3269c;
        } else {
            this.f3273a = a2.f3269c;
        }
        c cVar2 = a2.f3269c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f3274b = cVar;
        }
        a2.f3269c = null;
        a2.d = null;
        return a2.f3268b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.d != fVar.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f3273a, this.f3274b, 0);
        this.f3275c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
