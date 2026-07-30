package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lj0 {
    public final int a;
    public final mj0 b;
    public final j50 c;
    public int d;
    public int e;
    public int f;

    public lj0(int i) {
        this.a = i;
        if (i <= 0) {
            dd0.e("maxSize <= 0");
            throw null;
        }
        this.b = new mj0(0);
        this.c = new j50(23);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            mj0 mj0Var = this.b;
            mj0Var.getClass();
            Object obj2 = mj0Var.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:13:0x0029, B:15:0x002d, B:17:0x0037, B:25:0x003f, B:27:0x0043, B:29:0x004e, B:31:0x005f, B:35:0x007e, B:37:0x0084, B:42:0x0068, B:43:0x006e, B:45:0x007a, B:21:0x00a6, B:22:0x00ad), top: B:12:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        Object next;
        Map.Entry entry;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            mj0 mj0Var = this.b;
            mj0Var.getClass();
            put = mj0Var.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        int i = this.a;
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
                        if (list.isEmpty()) {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return put;
                            }
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            mj0 mj0Var2 = this.b;
                            mj0Var2.getClass();
                            key.getClass();
                            mj0Var2.a.remove(key);
                            int i2 = this.d;
                            value.getClass();
                            this.d = i2 - 1;
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
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final Object c(Object obj) {
        Object remove;
        synchronized (this.c) {
            mj0 mj0Var = this.b;
            mj0Var.getClass();
            remove = mj0Var.a.remove(obj);
            if (remove != null) {
                this.d--;
            }
        }
        return remove;
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
