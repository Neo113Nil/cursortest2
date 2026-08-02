package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254a implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public C0256c f3108e;

    /* renamed from: f, reason: collision with root package name */
    public C0256c f3109f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f3110g = new WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f3111h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f3112i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((l.C0255b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
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
        if (!(obj instanceof C0254a)) {
            return false;
        }
        C0254a c0254a = (C0254a) obj;
        if (this.f3111h != c0254a.f3111h) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c0254a.iterator();
        while (true) {
            C0255b c0255b = (C0255b) it;
            if (!c0255b.hasNext()) {
                break;
            }
            C0255b c0255b2 = (C0255b) it2;
            if (!c0255b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c0255b.next();
            Object next = c0255b2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            C0255b c0255b = (C0255b) it;
            if (!c0255b.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) c0255b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0255b c0255b = new C0255b(this.f3108e, this.f3109f, 0);
        this.f3110g.put(c0255b, Boolean.FALSE);
        return c0255b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0255b c0255b = (C0255b) it;
            if (!c0255b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0255b.next()).toString());
            if (c0255b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
