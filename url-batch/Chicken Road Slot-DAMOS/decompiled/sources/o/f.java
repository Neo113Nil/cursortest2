package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public c f7306d;

    /* renamed from: e, reason: collision with root package name */
    public c f7307e;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f7308i = new WeakHashMap();

    /* renamed from: r, reason: collision with root package name */
    public int f7309r = 0;

    public c b(Object obj) {
        c cVar = this.f7306d;
        while (cVar != null && !cVar.f7299d.equals(obj)) {
            cVar = cVar.f7301i;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c b10 = b(obj);
        if (b10 == null) {
            return null;
        }
        this.f7309r--;
        WeakHashMap weakHashMap = this.f7308i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(b10);
            }
        }
        c cVar = b10.f7302r;
        c cVar2 = b10.f7301i;
        if (cVar != null) {
            cVar.f7301i = cVar2;
        } else {
            this.f7306d = cVar2;
        }
        c cVar3 = b10.f7301i;
        if (cVar3 != null) {
            cVar3.f7302r = cVar;
        } else {
            this.f7307e = cVar;
        }
        b10.f7301i = null;
        b10.f7302r = null;
        return b10.f7300e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.b) r7).hasNext() != false) goto L28;
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
        if (this.f7309r != fVar.f7309r) {
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
        int i3 = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f7306d, this.f7307e, 0);
        this.f7308i.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
