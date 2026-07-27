package E0;

import E1.i;
import M2.J;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import k1.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l1.C0820a;
import z2.C1403G;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2264a;

    /* renamed from: b, reason: collision with root package name */
    public int f2265b;

    /* renamed from: c, reason: collision with root package name */
    public int f2266c;

    /* renamed from: d, reason: collision with root package name */
    public int f2267d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2268e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2269f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2270g;

    public b() {
        this.f2264a = 0;
        this.f2268e = new i(5);
        this.f2269f = new HashMap(0, 0.75f);
        this.f2270g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((i) this.f2268e)) {
            Object obj2 = ((HashMap) this.f2269f).get(obj);
            if (obj2 == null) {
                this.f2267d++;
                return null;
            }
            ((LinkedHashSet) this.f2270g).remove(obj);
            ((LinkedHashSet) this.f2270g).add(obj);
            this.f2266c++;
            return obj2;
        }
    }

    public Object b(Object obj, Object obj2) {
        Object put;
        Object obj3;
        Object obj4;
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        synchronized (((i) this.f2268e)) {
            try {
                this.f2265b = f() + 1;
                put = ((HashMap) this.f2269f).put(obj, obj2);
                if (put != null) {
                    this.f2265b = f() - 1;
                }
                if (((LinkedHashSet) this.f2270g).contains(obj)) {
                    ((LinkedHashSet) this.f2270g).remove(obj);
                }
                ((LinkedHashSet) this.f2270g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((i) this.f2268e)) {
                try {
                    if (f() >= 0) {
                        if (((HashMap) this.f2269f).isEmpty() && f() != 0) {
                            break;
                        }
                        if (((HashMap) this.f2269f).isEmpty() != ((LinkedHashSet) this.f2270g).isEmpty()) {
                            break;
                        }
                        if (f() <= 16 || ((HashMap) this.f2269f).isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = C1403G.p((LinkedHashSet) this.f2270g);
                            obj4 = ((HashMap) this.f2269f).get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            J.c((HashMap) this.f2269f).remove(obj3);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f2270g;
                            J.a(linkedHashSet);
                            linkedHashSet.remove(obj3);
                            int f4 = f();
                            Intrinsics.c(obj3);
                            this.f2265b = f4 - 1;
                        }
                        Unit unit = Unit.f7487a;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (obj3 == null && obj4 == null) {
                return put;
            }
            Intrinsics.c(obj3);
            Intrinsics.c(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public Object c(Object obj) {
        Object remove;
        synchronized (((i) this.f2268e)) {
            try {
                remove = ((HashMap) this.f2269f).remove(obj);
                ((LinkedHashSet) this.f2270g).remove(obj);
                if (remove != null) {
                    this.f2265b = f() - 1;
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    public void d() {
        this.f2265b = 1;
        this.f2269f = (p) this.f2268e;
        this.f2267d = 0;
    }

    public boolean e() {
        C0820a c4 = ((p) this.f2269f).f7407b.c();
        int b4 = c4.b(6);
        return !(b4 == 0 || ((ByteBuffer) c4.f838j).get(b4 + c4.f835d) == 0) || this.f2266c == 65039;
    }

    public int f() {
        int i2;
        synchronized (((i) this.f2268e)) {
            i2 = this.f2265b;
        }
        return i2;
    }

    public String toString() {
        String str;
        switch (this.f2264a) {
            case 0:
                synchronized (((i) this.f2268e)) {
                    try {
                        int i2 = this.f2266c;
                        int i4 = this.f2267d + i2;
                        str = "LruCache[maxSize=16,hits=" + this.f2266c + ",misses=" + this.f2267d + ",hitRate=" + (i4 != 0 ? (i2 * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(p pVar) {
        this.f2264a = 1;
        this.f2265b = 1;
        this.f2268e = pVar;
        this.f2269f = pVar;
    }
}
