package q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3905a;

    /* renamed from: b, reason: collision with root package name */
    public int f3906b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3907c;

    /* renamed from: d, reason: collision with root package name */
    public int f3908d;
    public int e;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3907c = i;
        this.f3905a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3905a.get(obj);
                if (obj2 != null) {
                    this.f3908d++;
                    return obj2;
                }
                this.e++;
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
                this.f3906b++;
                put = this.f3905a.put(obj, obj2);
                if (put != null) {
                    this.f3906b--;
                }
            } finally {
            }
        }
        int i = this.f3907c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3906b < 0 || (this.f3905a.isEmpty() && this.f3906b != 0)) {
                        break;
                    }
                    if (this.f3906b <= i || this.f3905a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f3905a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f3905a.remove(key);
                    this.f3906b--;
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
            i = this.f3908d;
            i2 = this.e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3907c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }
}
