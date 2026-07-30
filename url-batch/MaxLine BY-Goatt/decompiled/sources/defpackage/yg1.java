package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class yg1 {
    public final int a;
    public final zg1 b;
    public final u30 c;
    public int d;
    public int e;
    public int f;

    public yg1(int i) {
        this.a = i;
        if (i <= 0) {
            lh.e("maxSize <= 0");
            throw null;
        }
        this.b = new zg1(0);
        this.c = new u30(27);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public void b(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object c(Object obj) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            zg1 zg1Var = this.b;
            zg1Var.getClass();
            Object obj2 = zg1Var.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object a = a(obj);
            if (a == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    zg1 zg1Var2 = this.b;
                    zg1Var2.getClass();
                    put = zg1Var2.a.put(obj, a);
                    if (put != null) {
                        zg1 zg1Var3 = this.b;
                        zg1Var3.getClass();
                        zg1Var3.a.put(obj, put);
                    } else {
                        this.d += f(obj, a);
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (put != null) {
                b(obj, a, put);
                return put;
            }
            h(this.a);
            return a;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        synchronized (this.c) {
            try {
                this.d += f(obj, obj2);
                zg1 zg1Var = this.b;
                zg1Var.getClass();
                put = zg1Var.a.put(obj, obj2);
                if (put != null) {
                    this.d -= f(obj, put);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (put != null) {
            b(obj, put, obj2);
        }
        h(this.a);
        return put;
    }

    public final Object e(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.c) {
            try {
                zg1 zg1Var = this.b;
                zg1Var.getClass();
                remove = zg1Var.a.remove(obj);
                if (remove != null) {
                    this.d -= f(obj, remove);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (remove != null) {
            b(obj, remove, null);
        }
        return remove;
    }

    public final int f(Object obj, Object obj2) {
        int g = g(obj, obj2);
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    public int g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0016, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:16:0x0019, B:18:0x001d, B:20:0x0028, B:22:0x003a, B:25:0x0059, B:27:0x005f, B:33:0x0044, B:34:0x004a, B:37:0x0055, B:12:0x0085, B:13:0x008c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i) {
        Object next;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.b.a.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return;
                            }
                            key = entry.getKey();
                            value = entry.getValue();
                            zg1 zg1Var = this.b;
                            zg1Var.getClass();
                            key.getClass();
                            zg1Var.a.remove(key);
                            this.d -= f(key, value);
                        }
                        next = null;
                        entry = (Map.Entry) next;
                        if (entry != null) {
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        } else {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
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
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
