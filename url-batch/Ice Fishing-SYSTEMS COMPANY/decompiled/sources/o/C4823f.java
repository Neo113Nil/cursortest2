package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4823f implements Iterable {

    /* renamed from: n, reason: collision with root package name */
    public C4820c f39670n;

    /* renamed from: u, reason: collision with root package name */
    public C4820c f39671u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f39672v = new WeakHashMap();

    /* renamed from: w, reason: collision with root package name */
    public int f39673w = 0;

    public C4820c a(Object obj) {
        C4820c c4820c = this.f39670n;
        while (c4820c != null && !c4820c.f39663n.equals(obj)) {
            c4820c = c4820c.f39665v;
        }
        return c4820c;
    }

    public Object c(Object obj) {
        C4820c a9 = a(obj);
        if (a9 == null) {
            return null;
        }
        this.f39673w--;
        WeakHashMap weakHashMap = this.f39672v;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC4822e) it.next()).a(a9);
            }
        }
        C4820c c4820c = a9.f39666w;
        if (c4820c != null) {
            c4820c.f39665v = a9.f39665v;
        } else {
            this.f39670n = a9.f39665v;
        }
        C4820c c4820c2 = a9.f39665v;
        if (c4820c2 != null) {
            c4820c2.f39666w = c4820c;
        } else {
            this.f39671u = c4820c;
        }
        a9.f39665v = null;
        a9.f39666w = null;
        return a9.f39664u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((o.C4819b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C4823f)) {
            return false;
        }
        C4823f c4823f = (C4823f) obj;
        if (this.f39673w != c4823f.f39673w) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c4823f.iterator();
        while (true) {
            C4819b c4819b = (C4819b) it;
            if (!c4819b.hasNext()) {
                break;
            }
            C4819b c4819b2 = (C4819b) it2;
            if (!c4819b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4819b.next();
            Object next = c4819b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C4819b c4819b = (C4819b) it;
            if (!c4819b.hasNext()) {
                return i;
            }
            i += ((Map.Entry) c4819b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4819b c4819b = new C4819b(this.f39670n, this.f39671u, 0);
        this.f39672v.put(c4819b, Boolean.FALSE);
        return c4819b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C4819b c4819b = (C4819b) it;
            if (!c4819b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c4819b.next()).toString());
            if (c4819b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
