package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1120f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1117c f9981a;

    /* renamed from: b, reason: collision with root package name */
    public C1117c f9982b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f9983c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f9984d = 0;

    public C1117c b(Object obj) {
        C1117c c1117c = this.f9981a;
        while (c1117c != null && !c1117c.f9974a.equals(obj)) {
            c1117c = c1117c.f9976c;
        }
        return c1117c;
    }

    public Object c(Object obj) {
        C1117c b3 = b(obj);
        if (b3 == null) {
            return null;
        }
        this.f9984d--;
        WeakHashMap weakHashMap = this.f9983c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1119e) it.next()).a(b3);
            }
        }
        C1117c c1117c = b3.f9977d;
        if (c1117c != null) {
            c1117c.f9976c = b3.f9976c;
        } else {
            this.f9981a = b3.f9976c;
        }
        C1117c c1117c2 = b3.f9976c;
        if (c1117c2 != null) {
            c1117c2.f9977d = c1117c;
        } else {
            this.f9982b = c1117c;
        }
        b3.f9976c = null;
        b3.f9977d = null;
        return b3.f9975b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((n.C1116b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C1120f)) {
            return false;
        }
        C1120f c1120f = (C1120f) obj;
        if (this.f9984d != c1120f.f9984d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1120f.iterator();
        while (true) {
            C1116b c1116b = (C1116b) it;
            if (!c1116b.hasNext()) {
                break;
            }
            C1116b c1116b2 = (C1116b) it2;
            if (!c1116b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1116b.next();
            Object next = c1116b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C1116b c1116b = (C1116b) it;
            if (!c1116b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c1116b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1116b c1116b = new C1116b(this.f9981a, this.f9982b, 0);
        this.f9983c.put(c1116b, Boolean.FALSE);
        return c1116b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1116b c1116b = (C1116b) it;
            if (!c1116b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1116b.next()).toString());
            if (c1116b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
