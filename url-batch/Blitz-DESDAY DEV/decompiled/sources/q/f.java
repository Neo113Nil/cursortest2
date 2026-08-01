package q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3353a;

    /* renamed from: b, reason: collision with root package name */
    public int f3354b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3355c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3356e;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3355c = i;
        this.f3353a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3353a.get(obj);
                if (obj2 != null) {
                    this.d++;
                    return obj2;
                }
                this.f3356e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f3354b++;
                put = this.f3353a.put(obj, obj2);
                if (put != null) {
                    this.f3354b--;
                }
            } finally {
            }
        }
        int i = this.f3355c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3354b < 0 || (this.f3353a.isEmpty() && this.f3354b != 0)) {
                        break;
                    }
                    if (this.f3354b <= i || this.f3353a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f3353a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f3353a.remove(key);
                    this.f3354b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        try {
            i = this.d;
            i2 = this.f3356e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3355c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }
}
