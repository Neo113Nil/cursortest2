package p;

import a0.C0144j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q.C1351b;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f14659a;

    /* renamed from: b, reason: collision with root package name */
    public final C1351b f14660b;

    /* renamed from: c, reason: collision with root package name */
    public final C0144j f14661c;

    /* renamed from: d, reason: collision with root package name */
    public int f14662d;

    /* renamed from: e, reason: collision with root package name */
    public int f14663e;

    /* renamed from: f, reason: collision with root package name */
    public int f14664f;

    public i(int i4) {
        this.f14659a = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f14660b = new C1351b(0);
        this.f14661c = new C0144j(27, false);
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f14661c) {
            C1351b c1351b = this.f14660b;
            c1351b.getClass();
            Object obj = c1351b.f14811a.get(key);
            if (obj != null) {
                this.f14663e++;
                return obj;
            }
            this.f14664f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object key, Object obj) {
        Object put;
        kotlin.jvm.internal.i.e(key, "key");
        synchronized (this.f14661c) {
            this.f14662d++;
            C1351b c1351b = this.f14660b;
            c1351b.getClass();
            put = c1351b.f14811a.put(key, obj);
            if (put != null) {
                this.f14662d--;
            }
        }
        int i4 = this.f14659a;
        while (true) {
            synchronized (this.f14661c) {
                try {
                    if (this.f14662d < 0 || (this.f14660b.f14811a.isEmpty() && this.f14662d != 0)) {
                        break;
                    }
                    if (this.f14662d <= i4 || this.f14660b.f14811a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f14660b.f14811a.entrySet();
                    kotlin.jvm.internal.i.d(entrySet, "map.entries");
                    Object obj2 = null;
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            obj2 = list.get(0);
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            obj2 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj2;
                    if (entry == null) {
                        return put;
                    }
                    Object key2 = entry.getKey();
                    Object value = entry.getValue();
                    C1351b c1351b2 = this.f14660b;
                    c1351b2.getClass();
                    kotlin.jvm.internal.i.e(key2, "key");
                    c1351b2.f14811a.remove(key2);
                    int i5 = this.f14662d;
                    kotlin.jvm.internal.i.e(value, "value");
                    this.f14662d = i5 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f14661c) {
            try {
                int i4 = this.f14663e;
                int i5 = this.f14664f + i4;
                str = "LruCache[maxSize=" + this.f14659a + ",hits=" + this.f14663e + ",misses=" + this.f14664f + ",hitRate=" + (i5 != 0 ? (i4 * 100) / i5 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
