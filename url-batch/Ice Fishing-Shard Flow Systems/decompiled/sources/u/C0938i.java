package u;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0938i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8037a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f8038b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.b f8039c;

    /* renamed from: d, reason: collision with root package name */
    public int f8040d;

    /* renamed from: e, reason: collision with root package name */
    public int f8041e;

    /* renamed from: f, reason: collision with root package name */
    public int f8042f;

    public C0938i(int i2) {
        this.f8037a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8038b = new l4.b(22);
        this.f8039c = new r4.b();
    }

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f8039c) {
            l4.b bVar = this.f8038b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = ((LinkedHashMap) bVar.f6272e).get(key);
            if (obj != null) {
                this.f8041e++;
                return obj;
            }
            this.f8042f++;
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0104, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[Catch: all -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:15:0x005e, B:17:0x0062, B:19:0x006e, B:27:0x0076, B:29:0x007a, B:31:0x0088, B:33:0x00a0, B:37:0x00bf, B:39:0x00c5, B:45:0x00a9, B:46:0x00af, B:48:0x00bb, B:23:0x00fd, B:24:0x0104), top: B:14:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object key, Object value) {
        Object oldValue;
        Object next;
        Map.Entry entry;
        Object key2;
        Object oldValue2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f8039c) {
            try {
                int i2 = this.f8040d;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f8040d = i2 + 1;
                l4.b bVar = this.f8038b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                oldValue = ((LinkedHashMap) bVar.f6272e).put(key, value);
                if (oldValue != null) {
                    int i5 = this.f8040d;
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(oldValue, "value");
                    this.f8040d = i5 - 1;
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oldValue != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        }
        int i7 = this.f8037a;
        while (true) {
            synchronized (this.f8039c) {
                try {
                    if (this.f8040d < 0 || (((LinkedHashMap) this.f8038b.f6272e).isEmpty() && this.f8040d != 0)) {
                        break;
                    }
                    if (this.f8040d <= i7 || ((LinkedHashMap) this.f8038b.f6272e).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) this.f8038b.f6272e).entrySet();
                    Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
                    Intrinsics.checkNotNullParameter(entrySet, "<this>");
                    if (entrySet instanceof List) {
                        List list = (List) entrySet;
                        if (list.isEmpty()) {
                            next = null;
                            entry = (Map.Entry) next;
                            if (entry != null) {
                                return oldValue;
                            }
                            key2 = entry.getKey();
                            oldValue2 = entry.getValue();
                            l4.b bVar2 = this.f8038b;
                            bVar2.getClass();
                            Intrinsics.checkNotNullParameter(key2, "key");
                            ((LinkedHashMap) bVar2.f6272e).remove(key2);
                            int i8 = this.f8040d;
                            Intrinsics.checkNotNullParameter(key2, "key");
                            Intrinsics.checkNotNullParameter(oldValue2, "value");
                            this.f8040d = i8 - 1;
                        } else {
                            next = list.get(0);
                            entry = (Map.Entry) next;
                            if (entry != null) {
                            }
                        }
                    } else {
                        Iterator it = entrySet.iterator();
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
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Intrinsics.checkNotNullParameter(key2, "key");
            Intrinsics.checkNotNullParameter(oldValue2, "oldValue");
        }
        return oldValue;
    }

    public final String toString() {
        String str;
        synchronized (this.f8039c) {
            try {
                int i2 = this.f8041e;
                int i5 = this.f8042f + i2;
                str = "LruCache[maxSize=" + this.f8037a + ",hits=" + this.f8041e + ",misses=" + this.f8042f + ",hitRate=" + (i5 != 0 ? (i2 * 100) / i5 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
