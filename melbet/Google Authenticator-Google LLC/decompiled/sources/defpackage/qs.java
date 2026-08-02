package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qs {
    private final int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final brn h = new brn((byte[]) null, (char[]) null, (byte[]) null);
    private final pj g = new pj();

    public qs(int i) {
        this.a = i;
    }

    protected static final void c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    protected static final void d(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
    }

    public final Object a(Object obj) {
        synchronized (this.g) {
            Object obj2 = ((LinkedHashMap) this.h.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object T;
        Object key;
        Object value;
        obj2.getClass();
        synchronized (this.g) {
            this.c++;
            int i = this.b;
            d(obj, obj2);
            this.b = i + 1;
            T = this.h.T(obj, obj2);
            if (T != null) {
                int i2 = this.b;
                d(obj, T);
                this.b = i2 - 1;
            }
        }
        if (T != null) {
            c(obj, T);
        }
        int i3 = this.a;
        while (true) {
            synchronized (this.g) {
                if (this.b < 0 || (this.h.U() && this.b != 0)) {
                    pk.c("LruCache.sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= i3) {
                    break;
                }
                brn brnVar = this.h;
                if (!brnVar.U()) {
                    Object obj3 = brnVar.a;
                    Set entrySet = ((LinkedHashMap) obj3).entrySet();
                    entrySet.getClass();
                    Object obj4 = null;
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (!list.isEmpty()) {
                            obj4 = list.get(0);
                        }
                    } else {
                        Iterator it = entrySet.iterator();
                        if (it.hasNext()) {
                            obj4 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj4;
                    if (entry == null) {
                        break;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    key.getClass();
                    ((LinkedHashMap) obj3).remove(key);
                    int i4 = this.b;
                    d(key, value);
                    this.b = i4 - 1;
                    this.d++;
                } else {
                    break;
                }
            }
            c(key, value);
        }
        return T;
    }

    public final String toString() {
        String str;
        synchronized (this.g) {
            int i = this.e;
            int i2 = this.f;
            int i3 = i + i2;
            int i4 = i3 != 0 ? (i * 100) / i3 : 0;
            str = "LruCache[maxSize=" + this.a + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i4 + "%]";
        }
        return str;
    }
}
