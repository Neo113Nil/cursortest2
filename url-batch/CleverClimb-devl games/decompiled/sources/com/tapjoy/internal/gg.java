package com.tapjoy.internal;

import android.os.SystemClock;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class gg {

    /* renamed from: c, reason: collision with root package name */
    private static gg f8186c;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f8185b = new ThreadLocal() { // from class: com.tapjoy.internal.gg.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            return new HashMap();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f8187d = false;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    static Set f8184a = null;

    protected abstract void a();

    protected abstract void a(long j);

    protected abstract void a(long j, String str, @Nullable String str2, @Nullable Map map);

    public static void a(gi giVar) {
        if (f8186c == null) {
            f8186c = giVar;
            if (f8187d) {
                giVar.a(v.b());
            }
        }
    }

    public static void a(boolean z) {
        if (f8187d != z) {
            f8187d = z;
            if (f8186c != null) {
                if (z) {
                    f8186c.a(v.b());
                } else {
                    f8186c.a();
                }
            }
        }
    }

    public static void a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            f8184a = null;
        } else {
            f8184a = new HashSet(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, @Nullable String str2, @Nullable Map map) {
        Set set = f8184a;
        if ((set == null || !set.contains(str)) && f8187d && f8186c != null) {
            f8186c.a(v.b(), str, str2, map);
        }
    }

    public static void a(String str, @Nullable TreeMap treeMap, @Nullable Map map) {
        b(str, treeMap != null ? bh.a((Object) treeMap) : null, map);
    }

    public static a a(String str) {
        a a2 = new a(str).a();
        ((Map) f8185b.get()).put(str, a2);
        return a2;
    }

    public static a b(String str) {
        a aVar = (a) ((Map) f8185b.get()).remove(str);
        return aVar != null ? aVar.b() : new a(str);
    }

    public static a c(String str) {
        return (a) ((Map) f8185b.get()).get(str);
    }

    public static a d(String str) {
        return (a) ((Map) f8185b.get()).remove(str);
    }

    public static void a(String str, a aVar) {
        if (aVar != null) {
            if (str.equals(aVar.f8188a)) {
                ((Map) f8185b.get()).put(str, aVar);
                return;
            } else {
                Object[] objArr = {str, aVar.f8188a};
                return;
            }
        }
        new Object[1][0] = str;
    }

    public static a e(String str) {
        return new a(str);
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final String f8188a;

        /* renamed from: b, reason: collision with root package name */
        private final TreeMap f8189b = new TreeMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map f8190c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        private volatile long f8191d;

        a(String str) {
            this.f8188a = str;
        }

        public final a a() {
            try {
                this.f8191d = SystemClock.elapsedRealtime();
            } catch (NullPointerException unused) {
                this.f8191d = -1L;
            }
            return this;
        }

        public final a b() {
            long j = this.f8191d;
            if (j != -1) {
                try {
                    a("spent_time", SystemClock.elapsedRealtime() - j);
                } catch (NullPointerException unused) {
                }
            }
            return this;
        }

        public final a a(String str, Object obj) {
            this.f8189b.put(str, obj);
            return this;
        }

        public final a a(Map map) {
            if (map != null) {
                this.f8189b.putAll(map);
            }
            return this;
        }

        public final a a(String str) {
            this.f8189b.put("failure", str);
            return this;
        }

        public final a b(String str) {
            this.f8189b.put("misuse", str);
            return this;
        }

        public final a a(String str, long j) {
            this.f8190c.put(str, Long.valueOf(j));
            return this;
        }

        public final a b(Map map) {
            if (map != null) {
                this.f8190c.putAll(map);
            }
            return this;
        }

        public final void c() {
            gg.b(this.f8188a, this.f8189b.size() > 0 ? bh.a((Object) this.f8189b) : null, this.f8190c.size() > 0 ? this.f8190c : null);
        }
    }
}
