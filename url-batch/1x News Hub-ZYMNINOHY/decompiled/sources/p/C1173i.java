package p;

import androidx.lifecycle.F;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: p.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1173i {

    /* renamed from: a, reason: collision with root package name */
    public final int f10199a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10200b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.c f10201c;

    /* renamed from: d, reason: collision with root package name */
    public int f10202d;

    /* renamed from: e, reason: collision with root package name */
    public int f10203e;
    public int f;

    public C1173i(int i3) {
        this.f10199a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f10200b = new F(1);
        this.f10201c = new m1.c();
    }

    public final Object a(Object key) {
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f10201c) {
            F f = this.f10200b;
            f.getClass();
            Object obj = f.f2375a.get(key);
            if (obj != null) {
                this.f10203e++;
                return obj;
            }
            this.f++;
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
        kotlin.jvm.internal.j.e(key, "key");
        synchronized (this.f10201c) {
            this.f10202d++;
            F f = this.f10200b;
            f.getClass();
            put = f.f2375a.put(key, obj);
            if (put != null) {
                this.f10202d--;
            }
        }
        int i3 = this.f10199a;
        while (true) {
            synchronized (this.f10201c) {
                try {
                    if (this.f10202d < 0 || (this.f10200b.f2375a.isEmpty() && this.f10202d != 0)) {
                        break;
                    }
                    if (this.f10202d <= i3 || this.f10200b.f2375a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f10200b.f2375a.entrySet();
                    kotlin.jvm.internal.j.d(entrySet, "map.entries");
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
                    F f3 = this.f10200b;
                    f3.getClass();
                    kotlin.jvm.internal.j.e(key2, "key");
                    f3.f2375a.remove(key2);
                    int i4 = this.f10202d;
                    kotlin.jvm.internal.j.e(value, "value");
                    this.f10202d = i4 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f10201c) {
            try {
                int i3 = this.f10203e;
                int i4 = this.f + i3;
                str = "LruCache[maxSize=" + this.f10199a + ",hits=" + this.f10203e + ",misses=" + this.f + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
