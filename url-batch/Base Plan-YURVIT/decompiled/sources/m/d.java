package m;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2826a;

    /* renamed from: b, reason: collision with root package name */
    public int f2827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2828c;

    /* renamed from: d, reason: collision with root package name */
    public int f2829d;

    /* renamed from: e, reason: collision with root package name */
    public int f2830e;

    public d(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2828c = i2;
        this.f2826a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f2826a.get(obj);
                if (obj2 != null) {
                    this.f2829d++;
                    return obj2;
                }
                this.f2830e++;
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
                this.f2827b++;
                put = this.f2826a.put(obj, obj2);
                if (put != null) {
                    this.f2827b--;
                }
            } finally {
            }
        }
        int i2 = this.f2828c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f2827b < 0 || (this.f2826a.isEmpty() && this.f2827b != 0)) {
                        break;
                    }
                    if (this.f2827b <= i2 || this.f2826a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f2826a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f2826a.remove(key);
                    this.f2827b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        int i4;
        try {
            i2 = this.f2829d;
            i3 = this.f2830e;
            int i5 = i2 + i3;
            i4 = i5 != 0 ? (i2 * 100) / i5 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f2828c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}
