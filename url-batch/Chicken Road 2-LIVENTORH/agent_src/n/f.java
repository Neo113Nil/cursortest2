package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public c f2706f;

    /* renamed from: g, reason: collision with root package name */
    public c f2707g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f2708h = new WeakHashMap();
    public int i = 0;

    public c a(Object obj) {
        c cVar = this.f2706f;
        while (cVar != null && !cVar.f2700f.equals(obj)) {
            cVar = cVar.f2702h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.f2708h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a2);
            }
        }
        c cVar = a2.i;
        if (cVar != null) {
            cVar.f2702h = a2.f2702h;
        } else {
            this.f2706f = a2.f2702h;
        }
        c cVar2 = a2.f2702h;
        if (cVar2 != null) {
            cVar2.i = cVar;
        } else {
            this.f2707g = cVar;
        }
        a2.f2702h = null;
        a2.i = null;
        return a2.f2701g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.b) r7).hasNext() != false) goto L28;
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
        if (this.i != fVar.i) {
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
        b bVar = new b(this.f2706f, this.f2707g, 0);
        this.f2708h.put(bVar, Boolean.FALSE);
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
