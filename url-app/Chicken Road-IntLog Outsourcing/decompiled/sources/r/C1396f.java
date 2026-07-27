package r;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1396f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11690a;

    /* renamed from: b, reason: collision with root package name */
    public int f11691b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11692c;

    /* renamed from: d, reason: collision with root package name */
    public int f11693d;

    /* renamed from: e, reason: collision with root package name */
    public int f11694e;

    public C1396f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f11692c = i2;
        this.f11690a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f11690a.get(obj);
                if (obj2 != null) {
                    this.f11693d++;
                    return obj2;
                }
                this.f11694e++;
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
                this.f11691b++;
                put = this.f11690a.put(obj, obj2);
                if (put != null) {
                    this.f11691b--;
                }
            } finally {
            }
        }
        int i2 = this.f11692c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f11691b < 0 || (this.f11690a.isEmpty() && this.f11691b != 0)) {
                        break;
                    }
                    if (this.f11691b <= i2 || this.f11690a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f11690a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f11690a.remove(key);
                    this.f11691b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        int i6;
        try {
            i2 = this.f11693d;
            i3 = this.f11694e;
            int i7 = i2 + i3;
            i6 = i7 != 0 ? (i2 * 100) / i7 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f11692c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i6 + "%]";
    }
}
