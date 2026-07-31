package i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0461f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C0458c f5093d;

    /* renamed from: e, reason: collision with root package name */
    public C0458c f5094e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f5095f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f5096g = 0;

    public C0458c b(Object obj) {
        C0458c c0458c = this.f5093d;
        while (c0458c != null && !c0458c.f5086d.equals(obj)) {
            c0458c = c0458c.f5088f;
        }
        return c0458c;
    }

    public Object c(Object obj) {
        C0458c b2 = b(obj);
        if (b2 == null) {
            return null;
        }
        this.f5096g--;
        WeakHashMap weakHashMap = this.f5095f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0460e) it.next()).a(b2);
            }
        }
        C0458c c0458c = b2.f5089g;
        if (c0458c != null) {
            c0458c.f5088f = b2.f5088f;
        } else {
            this.f5093d = b2.f5088f;
        }
        C0458c c0458c2 = b2.f5088f;
        if (c0458c2 != null) {
            c0458c2.f5089g = c0458c;
        } else {
            this.f5094e = c0458c;
        }
        b2.f5088f = null;
        b2.f5089g = null;
        return b2.f5087e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((i.C0457b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0461f)) {
            return false;
        }
        C0461f c0461f = (C0461f) obj;
        if (this.f5096g != c0461f.f5096g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0461f.iterator();
        while (true) {
            C0457b c0457b = (C0457b) it;
            if (!c0457b.hasNext()) {
                break;
            }
            C0457b c0457b2 = (C0457b) it2;
            if (!c0457b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0457b.next();
            Object next = c0457b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0457b c0457b = (C0457b) it;
            if (!c0457b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c0457b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0457b c0457b = new C0457b(this.f5093d, this.f5094e, 0);
        this.f5095f.put(c0457b, Boolean.FALSE);
        return c0457b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0457b c0457b = (C0457b) it;
            if (!c0457b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0457b.next()).toString());
            if (c0457b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
