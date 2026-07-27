package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public c f11273a;

    /* renamed from: b, reason: collision with root package name */
    public c f11274b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f11275c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f11276d = 0;

    public c b(Object obj) {
        c cVar = this.f11273a;
        while (cVar != null && !cVar.f11266a.equals(obj)) {
            cVar = cVar.f11268c;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c b6 = b(obj);
        if (b6 == null) {
            return null;
        }
        this.f11276d--;
        WeakHashMap weakHashMap = this.f11275c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(b6);
            }
        }
        c cVar = b6.f11269d;
        if (cVar != null) {
            cVar.f11268c = b6.f11268c;
        } else {
            this.f11273a = b6.f11268c;
        }
        c cVar2 = b6.f11268c;
        if (cVar2 != null) {
            cVar2.f11269d = cVar;
        } else {
            this.f11274b = cVar;
        }
        b6.f11268c = null;
        b6.f11269d = null;
        return b6.f11267b;
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
        if (this.f11276d != fVar.f11276d) {
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
        int i2 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f11273a, this.f11274b, 0);
        this.f11275c.put(bVar, Boolean.FALSE);
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
