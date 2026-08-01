package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public c f2902f;
    public c g;
    public final WeakHashMap h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f2903i = 0;

    public c a(Object obj) {
        c cVar = this.f2902f;
        while (cVar != null && !cVar.f2899f.equals(obj)) {
            cVar = cVar.h;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a4 = a(obj);
        if (a4 == null) {
            return null;
        }
        this.f2903i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a4);
            }
        }
        c cVar = a4.f2900i;
        if (cVar != null) {
            cVar.h = a4.h;
        } else {
            this.f2902f = a4.h;
        }
        c cVar2 = a4.h;
        if (cVar2 != null) {
            cVar2.f2900i = cVar;
        } else {
            this.g = cVar;
        }
        a4.h = null;
        a4.f2900i = null;
        return a4.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.b) r7).hasNext() != false) goto L28;
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
        if (this.f2903i != fVar.f2903i) {
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
        int i4 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i4;
            }
            i4 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f2902f, this.g, 0);
        this.h.put(bVar, Boolean.FALSE);
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
