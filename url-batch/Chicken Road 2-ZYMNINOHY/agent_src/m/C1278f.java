package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1278f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1275c f14288a;

    /* renamed from: b, reason: collision with root package name */
    public C1275c f14289b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f14290c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f14291d = 0;

    public C1275c b(Object obj) {
        C1275c c1275c = this.f14288a;
        while (c1275c != null && !c1275c.f14281a.equals(obj)) {
            c1275c = c1275c.f14283c;
        }
        return c1275c;
    }

    public Object c(Object obj) {
        C1275c b4 = b(obj);
        if (b4 == null) {
            return null;
        }
        this.f14291d--;
        WeakHashMap weakHashMap = this.f14290c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1277e) it.next()).a(b4);
            }
        }
        C1275c c1275c = b4.f14284d;
        if (c1275c != null) {
            c1275c.f14283c = b4.f14283c;
        } else {
            this.f14288a = b4.f14283c;
        }
        C1275c c1275c2 = b4.f14283c;
        if (c1275c2 != null) {
            c1275c2.f14284d = c1275c;
        } else {
            this.f14289b = c1275c;
        }
        b4.f14283c = null;
        b4.f14284d = null;
        return b4.f14282b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.C1274b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C1278f)) {
            return false;
        }
        C1278f c1278f = (C1278f) obj;
        if (this.f14291d != c1278f.f14291d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1278f.iterator();
        while (true) {
            C1274b c1274b = (C1274b) it;
            if (!c1274b.hasNext()) {
                break;
            }
            C1274b c1274b2 = (C1274b) it2;
            if (!c1274b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c1274b.next();
            Object next = c1274b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (true) {
            C1274b c1274b = (C1274b) it;
            if (!c1274b.hasNext()) {
                return i4;
            }
            i4 += ((Map.Entry) c1274b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1274b c1274b = new C1274b(this.f14288a, this.f14289b, 0);
        this.f14290c.put(c1274b, Boolean.FALSE);
        return c1274b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1274b c1274b = (C1274b) it;
            if (!c1274b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1274b.next()).toString());
            if (c1274b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
