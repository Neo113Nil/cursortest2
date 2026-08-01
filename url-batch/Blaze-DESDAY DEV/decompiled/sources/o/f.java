package o;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3273a;

    /* renamed from: b, reason: collision with root package name */
    public int f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3275c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3276e;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3275c = i;
        this.f3273a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3273a.get(obj);
                if (obj2 != null) {
                    this.d++;
                    return obj2;
                }
                this.f3276e++;
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
                this.f3274b++;
                put = this.f3273a.put(obj, obj2);
                if (put != null) {
                    this.f3274b--;
                }
            } finally {
            }
        }
        int i = this.f3275c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3274b < 0 || (this.f3273a.isEmpty() && this.f3274b != 0)) {
                        break;
                    }
                    if (this.f3274b <= i || this.f3273a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f3273a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f3273a.remove(key);
                    this.f3274b--;
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
            i2 = this.f3276e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3275c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }
}
