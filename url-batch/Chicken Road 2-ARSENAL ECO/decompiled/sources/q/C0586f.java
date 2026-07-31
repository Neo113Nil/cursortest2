package q;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0586f {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5721a;

    /* renamed from: b, reason: collision with root package name */
    public int f5722b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5723c;

    /* renamed from: d, reason: collision with root package name */
    public int f5724d;

    /* renamed from: e, reason: collision with root package name */
    public int f5725e;

    public C0586f(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5723c = i7;
        this.f5721a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f5721a.get(obj);
                if (obj2 != null) {
                    this.f5724d++;
                    return obj2;
                }
                this.f5725e++;
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
                this.f5722b++;
                put = this.f5721a.put(obj, obj2);
                if (put != null) {
                    this.f5722b--;
                }
            } finally {
            }
        }
        int i7 = this.f5723c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f5722b < 0 || (this.f5721a.isEmpty() && this.f5722b != 0)) {
                        break;
                    }
                    if (this.f5722b <= i7 || this.f5721a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f5721a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f5721a.remove(key);
                    this.f5722b--;
                } finally {
                }
            }
        }
        return put;
    }

    public final synchronized String toString() {
        int i7;
        int i8;
        int i9;
        try {
            i7 = this.f5724d;
            i8 = this.f5725e;
            int i10 = i7 + i8;
            i9 = i10 != 0 ? (i7 * 100) / i10 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f5723c + ",hits=" + i7 + ",misses=" + i8 + ",hitRate=" + i9 + "%]";
    }
}
