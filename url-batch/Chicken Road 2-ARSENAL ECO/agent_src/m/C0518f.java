package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0518f implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public C0515c f5322f;

    /* renamed from: g, reason: collision with root package name */
    public C0515c f5323g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f5324h = new WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f5325i = 0;

    public C0515c a(Object obj) {
        C0515c c0515c = this.f5322f;
        while (c0515c != null && !c0515c.f5315f.equals(obj)) {
            c0515c = c0515c.f5317h;
        }
        return c0515c;
    }

    public Object b(Object obj) {
        C0515c a7 = a(obj);
        if (a7 == null) {
            return null;
        }
        this.f5325i--;
        WeakHashMap weakHashMap = this.f5324h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0517e) it.next()).a(a7);
            }
        }
        C0515c c0515c = a7.f5318i;
        if (c0515c != null) {
            c0515c.f5317h = a7.f5317h;
        } else {
            this.f5322f = a7.f5317h;
        }
        C0515c c0515c2 = a7.f5317h;
        if (c0515c2 != null) {
            c0515c2.f5318i = c0515c;
        } else {
            this.f5323g = c0515c;
        }
        a7.f5317h = null;
        a7.f5318i = null;
        return a7.f5316g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.C0514b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0518f)) {
            return false;
        }
        C0518f c0518f = (C0518f) obj;
        if (this.f5325i != c0518f.f5325i) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0518f.iterator();
        while (true) {
            C0514b c0514b = (C0514b) it;
            if (!c0514b.hasNext()) {
                break;
            }
            C0514b c0514b2 = (C0514b) it2;
            if (!c0514b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0514b.next();
            Object next = c0514b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (true) {
            C0514b c0514b = (C0514b) it;
            if (!c0514b.hasNext()) {
                return i7;
            }
            i7 += ((Map.Entry) c0514b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0514b c0514b = new C0514b(this.f5322f, this.f5323g, 0);
        this.f5324h.put(c0514b, Boolean.FALSE);
        return c0514b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0514b c0514b = (C0514b) it;
            if (!c0514b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0514b.next()).toString());
            if (c0514b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
