package i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0514f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C0511c f6233d;

    /* renamed from: e, reason: collision with root package name */
    public C0511c f6234e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f6235f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f6236g = 0;

    public C0511c b(Object obj) {
        C0511c c0511c = this.f6233d;
        while (c0511c != null && !c0511c.f6226d.equals(obj)) {
            c0511c = c0511c.f6228f;
        }
        return c0511c;
    }

    public Object c(Object obj) {
        C0511c b3 = b(obj);
        if (b3 == null) {
            return null;
        }
        this.f6236g--;
        WeakHashMap weakHashMap = this.f6235f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0513e) it.next()).a(b3);
            }
        }
        C0511c c0511c = b3.f6229g;
        if (c0511c != null) {
            c0511c.f6228f = b3.f6228f;
        } else {
            this.f6233d = b3.f6228f;
        }
        C0511c c0511c2 = b3.f6228f;
        if (c0511c2 != null) {
            c0511c2.f6229g = c0511c;
        } else {
            this.f6234e = c0511c;
        }
        b3.f6228f = null;
        b3.f6229g = null;
        return b3.f6227e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((i.C0510b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0514f)) {
            return false;
        }
        C0514f c0514f = (C0514f) obj;
        if (this.f6236g != c0514f.f6236g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0514f.iterator();
        while (true) {
            C0510b c0510b = (C0510b) it;
            if (!c0510b.hasNext()) {
                break;
            }
            C0510b c0510b2 = (C0510b) it2;
            if (!c0510b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0510b.next();
            Object next = c0510b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (true) {
            C0510b c0510b = (C0510b) it;
            if (!c0510b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c0510b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0510b c0510b = new C0510b(this.f6233d, this.f6234e, 0);
        this.f6235f.put(c0510b, Boolean.FALSE);
        return c0510b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0510b c0510b = (C0510b) it;
            if (!c0510b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0510b.next()).toString());
            if (c0510b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
