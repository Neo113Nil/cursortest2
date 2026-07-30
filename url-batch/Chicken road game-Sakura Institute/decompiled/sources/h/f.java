package h;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public c f4583f;

    /* renamed from: g, reason: collision with root package name */
    public c f4584g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f4585h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f4586i = 0;

    public c a(Object obj) {
        c cVar = this.f4583f;
        while (cVar != null && !cVar.f4576f.equals(obj)) {
            cVar = cVar.f4578h;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((h.b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4586i != fVar.f4586i) {
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

    public Object g(Object obj) {
        c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.f4586i--;
        WeakHashMap weakHashMap = this.f4585h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a3);
            }
        }
        c cVar = a3.f4579i;
        if (cVar != null) {
            cVar.f4578h = a3.f4578h;
        } else {
            this.f4583f = a3.f4578h;
        }
        c cVar2 = a3.f4578h;
        if (cVar2 != null) {
            cVar2.f4579i = cVar;
        } else {
            this.f4584g = cVar;
        }
        a3.f4578h = null;
        a3.f4579i = null;
        return a3.f4577g;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i7;
            }
            i7 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f4583f, this.f4584g, 0);
        this.f4585h.put(bVar, Boolean.FALSE);
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
