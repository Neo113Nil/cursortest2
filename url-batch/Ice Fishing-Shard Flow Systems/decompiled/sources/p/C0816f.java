package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0816f implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public C0813c f7147d;

    /* renamed from: e, reason: collision with root package name */
    public C0813c f7148e;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f7149i = new WeakHashMap();

    /* renamed from: l, reason: collision with root package name */
    public int f7150l = 0;

    public C0813c a(Object obj) {
        C0813c c0813c = this.f7147d;
        while (c0813c != null && !c0813c.f7140d.equals(obj)) {
            c0813c = c0813c.f7142i;
        }
        return c0813c;
    }

    public Object b(Object obj) {
        C0813c a7 = a(obj);
        if (a7 == null) {
            return null;
        }
        this.f7150l--;
        WeakHashMap weakHashMap = this.f7149i;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0815e) it.next()).a(a7);
            }
        }
        C0813c c0813c = a7.f7143l;
        if (c0813c != null) {
            c0813c.f7142i = a7.f7142i;
        } else {
            this.f7147d = a7.f7142i;
        }
        C0813c c0813c2 = a7.f7142i;
        if (c0813c2 != null) {
            c0813c2.f7143l = c0813c;
        } else {
            this.f7148e = c0813c;
        }
        a7.f7142i = null;
        a7.f7143l = null;
        return a7.f7141e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((p.C0812b) r7).hasNext() != false) goto L28;
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
        if (!(obj instanceof C0816f)) {
            return false;
        }
        C0816f c0816f = (C0816f) obj;
        if (this.f7150l != c0816f.f7150l) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0816f.iterator();
        while (true) {
            C0812b c0812b = (C0812b) it;
            if (!c0812b.hasNext()) {
                break;
            }
            C0812b c0812b2 = (C0812b) it2;
            if (!c0812b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0812b.next();
            Object next = c0812b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0812b c0812b = (C0812b) it;
            if (!c0812b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0812b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0812b c0812b = new C0812b(this.f7147d, this.f7148e, 0);
        this.f7149i.put(c0812b, Boolean.FALSE);
        return c0812b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0812b c0812b = (C0812b) it;
            if (!c0812b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0812b.next()).toString());
            if (c0812b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
