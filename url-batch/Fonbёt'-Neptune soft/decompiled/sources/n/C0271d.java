package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0271d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3234a;

    /* renamed from: b, reason: collision with root package name */
    public int f3235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3236c;

    /* renamed from: d, reason: collision with root package name */
    public int f3237d;

    /* renamed from: e, reason: collision with root package name */
    public int f3238e;

    public C0271d(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3236c = i2;
        this.f3234a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3234a.get(obj);
                if (obj2 != null) {
                    this.f3237d++;
                    return obj2;
                }
                this.f3238e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f3235b++;
                put = this.f3234a.put(obj, obj2);
                if (put != null) {
                    this.f3235b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f3236c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i2) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3235b < 0 || (this.f3234a.isEmpty() && this.f3235b != 0)) {
                        break;
                    }
                    if (this.f3235b <= i2 || this.f3234a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f3234a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f3234a.remove(key);
                    this.f3235b--;
                } finally {
                }
            }
        }
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        int i4;
        try {
            i2 = this.f3237d;
            i3 = this.f3238e;
            int i5 = i2 + i3;
            i4 = i5 != 0 ? (i2 * 100) / i5 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3236c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}
