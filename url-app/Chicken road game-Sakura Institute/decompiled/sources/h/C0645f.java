package h;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0645f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C0642c f6822d;

    /* renamed from: e, reason: collision with root package name */
    public C0642c f6823e;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f6824i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public int f6825j = 0;

    public C0642c e(Object obj) {
        C0642c c0642c = this.f6822d;
        while (c0642c != null && !c0642c.f6815d.equals(obj)) {
            c0642c = c0642c.f6817i;
        }
        return c0642c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((h.C0641b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0645f)) {
            return false;
        }
        C0645f c0645f = (C0645f) obj;
        if (this.f6825j != c0645f.f6825j) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0645f.iterator();
        while (true) {
            C0641b c0641b = (C0641b) it;
            if (!c0641b.hasNext()) {
                break;
            }
            C0641b c0641b2 = (C0641b) it2;
            if (!c0641b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0641b.next();
            Object next = c0641b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public Object h(Object obj) {
        C0642c e4 = e(obj);
        if (e4 == null) {
            return null;
        }
        this.f6825j--;
        WeakHashMap weakHashMap = this.f6824i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0644e) it.next()).a(e4);
            }
        }
        C0642c c0642c = e4.f6818j;
        if (c0642c != null) {
            c0642c.f6817i = e4.f6817i;
        } else {
            this.f6822d = e4.f6817i;
        }
        C0642c c0642c2 = e4.f6817i;
        if (c0642c2 != null) {
            c0642c2.f6818j = c0642c;
        } else {
            this.f6823e = c0642c;
        }
        e4.f6817i = null;
        e4.f6818j = null;
        return e4.f6816e;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0641b c0641b = (C0641b) it;
            if (!c0641b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0641b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0641b c0641b = new C0641b(this.f6822d, this.f6823e, 0);
        this.f6824i.put(c0641b, Boolean.FALSE);
        return c0641b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0641b c0641b = (C0641b) it;
            if (!c0641b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0641b.next()).toString());
            if (c0641b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
