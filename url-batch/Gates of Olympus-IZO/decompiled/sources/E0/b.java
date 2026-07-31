package E0;

import M1.l;
import Z1.i;
import Z1.w;
import j1.s;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import k1.C0526a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f724a;

    /* renamed from: b, reason: collision with root package name */
    public int f725b;

    /* renamed from: c, reason: collision with root package name */
    public int f726c;

    /* renamed from: d, reason: collision with root package name */
    public int f727d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f728e;

    /* renamed from: f, reason: collision with root package name */
    public Object f729f;

    /* renamed from: g, reason: collision with root package name */
    public Object f730g;

    public b() {
        this.f724a = 0;
        this.f728e = new F0.a(4);
        this.f729f = new HashMap(0, 0.75f);
        this.f730g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((F0.a) this.f728e)) {
            Object obj2 = ((HashMap) this.f729f).get(obj);
            if (obj2 == null) {
                this.f727d++;
                return null;
            }
            ((LinkedHashSet) this.f730g).remove(obj);
            ((LinkedHashSet) this.f730g).add(obj);
            this.f726c++;
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
        synchronized (((F0.a) this.f728e)) {
            try {
                this.f725b = e() + 1;
                put = ((HashMap) this.f729f).put(obj, obj2);
                if (put != null) {
                    this.f725b = e() - 1;
                }
                if (((LinkedHashSet) this.f730g).contains(obj)) {
                    ((LinkedHashSet) this.f730g).remove(obj);
                }
                ((LinkedHashSet) this.f730g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((F0.a) this.f728e)) {
                try {
                    if (e() >= 0) {
                        if (((HashMap) this.f729f).isEmpty() && e() != 0) {
                            break;
                        }
                        if (((HashMap) this.f729f).isEmpty() != ((LinkedHashSet) this.f730g).isEmpty()) {
                            break;
                        }
                        if (e() <= 16 || ((HashMap) this.f729f).isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = l.l0((LinkedHashSet) this.f730g);
                            obj4 = ((HashMap) this.f729f).get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            w.c((HashMap) this.f729f).remove(obj3);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f730g;
                            w.a(linkedHashSet);
                            linkedHashSet.remove(obj3);
                            int e3 = e();
                            i.c(obj3);
                            this.f725b = e3 - 1;
                        }
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
            i.c(obj3);
            i.c(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public void c() {
        this.f725b = 1;
        this.f729f = (s) this.f728e;
        this.f727d = 0;
    }

    public boolean d() {
        C0526a c3 = ((s) this.f729f).f5287b.c();
        int a3 = c3.a(6);
        return !(a3 == 0 || ((ByteBuffer) c3.f2874g).get(a3 + c3.f2871d) == 0) || this.f726c == 65039;
    }

    public int e() {
        int i3;
        synchronized (((F0.a) this.f728e)) {
            i3 = this.f725b;
        }
        return i3;
    }

    public String toString() {
        String str;
        switch (this.f724a) {
            case 0:
                synchronized (((F0.a) this.f728e)) {
                    try {
                        int i3 = this.f726c;
                        int i4 = this.f727d + i3;
                        str = "LruCache[maxSize=16,hits=" + this.f726c + ",misses=" + this.f727d + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(s sVar) {
        this.f724a = 1;
        this.f725b = 1;
        this.f728e = sVar;
        this.f729f = sVar;
    }
}
