package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public c f5241d;

    /* renamed from: e, reason: collision with root package name */
    public c f5242e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f5243f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f5244g = 0;

    public c a(Object obj) {
        c cVar = this.f5241d;
        while (cVar != null && !cVar.f5234d.equals(obj)) {
            cVar = cVar.f5236f;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a8 = a(obj);
        if (a8 == null) {
            return null;
        }
        this.f5244g--;
        WeakHashMap weakHashMap = this.f5243f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a8);
            }
        }
        c cVar = a8.f5237g;
        if (cVar != null) {
            cVar.f5236f = a8.f5236f;
        } else {
            this.f5241d = a8.f5236f;
        }
        c cVar2 = a8.f5236f;
        if (cVar2 != null) {
            cVar2.f5237g = cVar;
        } else {
            this.f5242e = cVar;
        }
        a8.f5236f = null;
        a8.f5237g = null;
        return a8.f5235e;
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
        if (this.f5244g != fVar.f5244g) {
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
        b bVar = new b(this.f5241d, this.f5242e, 0);
        this.f5243f.put(bVar, Boolean.FALSE);
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
