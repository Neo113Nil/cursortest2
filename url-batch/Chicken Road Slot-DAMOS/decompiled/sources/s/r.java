package s;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f8361a;

    /* renamed from: b, reason: collision with root package name */
    public final k4.d f8362b;

    /* renamed from: c, reason: collision with root package name */
    public final s7.c0 f8363c;

    /* renamed from: d, reason: collision with root package name */
    public int f8364d;

    /* renamed from: e, reason: collision with root package name */
    public int f8365e;

    /* renamed from: f, reason: collision with root package name */
    public int f8366f;

    public r(int i3) {
        this.f8361a = i3;
        if (i3 <= 0) {
            a1.e("maxSize <= 0");
            throw null;
        }
        this.f8362b = new k4.d(1);
        this.f8363c = new s7.c0(15);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
    }

    public final Object c(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.f8363c) {
            k4.d dVar = this.f8362b;
            dVar.getClass();
            Object obj2 = dVar.f5388a.get(obj);
            if (obj2 != null) {
                this.f8365e++;
                return obj2;
            }
            this.f8366f++;
            Object a9 = a(obj);
            if (a9 == null) {
                return null;
            }
            synchronized (this.f8363c) {
                try {
                    k4.d dVar2 = this.f8362b;
                    dVar2.getClass();
                    put = dVar2.f5388a.put(obj, a9);
                    if (put != null) {
                        k4.d dVar3 = this.f8362b;
                        dVar3.getClass();
                        dVar3.f5388a.put(obj, put);
                    } else {
                        this.f8364d++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(obj, a9, put);
                return put;
            }
            f(this.f8361a);
            return a9;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.f8363c) {
            this.f8364d++;
            k4.d dVar = this.f8362b;
            dVar.getClass();
            put = dVar.f5388a.put(obj, obj2);
            if (put != null) {
                this.f8364d--;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        f(this.f8361a);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f8363c) {
            k4.d dVar = this.f8362b;
            dVar.getClass();
            remove = dVar.f5388a.remove(obj);
            if (remove != null) {
                this.f8364d--;
            }
        }
        if (remove != null) {
            b(obj, remove, null);
        }
        return remove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:26:0x0059, B:28:0x005f, B:34:0x0043, B:35:0x0049, B:37:0x0055, B:12:0x0085, B:13:0x008c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f8363c) {
                try {
                    if (this.f8364d < 0 || (this.f8362b.f5388a.isEmpty() && this.f8364d != 0)) {
                        break;
                    }
                    if (this.f8364d <= i3 || this.f8362b.f5388a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.f8362b.f5388a.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (list.isEmpty()) {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            k4.d dVar = this.f8362b;
                            dVar.getClass();
                            key.getClass();
                            dVar.f5388a.remove(key);
                            int i10 = this.f8364d;
                            value.getClass();
                            this.f8364d = i10 - 1;
                        } else {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(key, value, null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f8363c) {
            try {
                int i3 = this.f8365e;
                int i10 = this.f8366f + i3;
                str = "LruCache[maxSize=" + this.f8361a + ",hits=" + this.f8365e + ",misses=" + this.f8366f + ",hitRate=" + (i10 != 0 ? (i3 * 100) / i10 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
