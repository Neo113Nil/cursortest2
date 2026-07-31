package G0;

import A1.i;
import S1.l;
import f2.j;
import f2.x;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import m1.t;
import n1.C0719a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b, reason: collision with root package name */
    public int f2075b;

    /* renamed from: c, reason: collision with root package name */
    public int f2076c;

    /* renamed from: d, reason: collision with root package name */
    public int f2077d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2078e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2079f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2080g;

    public b() {
        this.f2074a = 0;
        this.f2078e = new i(6, false);
        this.f2079f = new HashMap(0, 0.75f);
        this.f2080g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((i) this.f2078e)) {
            Object obj2 = ((HashMap) this.f2079f).get(obj);
            if (obj2 == null) {
                this.f2077d++;
                return null;
            }
            ((LinkedHashSet) this.f2080g).remove(obj);
            ((LinkedHashSet) this.f2080g).add(obj);
            this.f2076c++;
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
        synchronized (((i) this.f2078e)) {
            try {
                this.f2075b = e() + 1;
                put = ((HashMap) this.f2079f).put(obj, obj2);
                if (put != null) {
                    this.f2075b = e() - 1;
                }
                if (((LinkedHashSet) this.f2080g).contains(obj)) {
                    ((LinkedHashSet) this.f2080g).remove(obj);
                }
                ((LinkedHashSet) this.f2080g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((i) this.f2078e)) {
                try {
                    if (e() >= 0) {
                        if (((HashMap) this.f2079f).isEmpty() && e() != 0) {
                            break;
                        }
                        if (((HashMap) this.f2079f).isEmpty() != ((LinkedHashSet) this.f2080g).isEmpty()) {
                            break;
                        }
                        if (e() <= 16 || ((HashMap) this.f2079f).isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = l.J0((LinkedHashSet) this.f2080g);
                            obj4 = ((HashMap) this.f2079f).get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            x.c((HashMap) this.f2079f).remove(obj3);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f2080g;
                            x.a(linkedHashSet);
                            linkedHashSet.remove(obj3);
                            int e3 = e();
                            j.c(obj3);
                            this.f2075b = e3 - 1;
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
            j.c(obj3);
            j.c(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public void c() {
        this.f2075b = 1;
        this.f2079f = (t) this.f2078e;
        this.f2077d = 0;
    }

    public boolean d() {
        C0719a c2 = ((t) this.f2079f).f6980b.c();
        int a3 = c2.a(6);
        return !(a3 == 0 || ((ByteBuffer) c2.f4353g).get(a3 + c2.f4350d) == 0) || this.f2076c == 65039;
    }

    public int e() {
        int i3;
        synchronized (((i) this.f2078e)) {
            i3 = this.f2075b;
        }
        return i3;
    }

    public String toString() {
        String str;
        switch (this.f2074a) {
            case 0:
                synchronized (((i) this.f2078e)) {
                    try {
                        int i3 = this.f2076c;
                        int i4 = this.f2077d + i3;
                        str = "LruCache[maxSize=16,hits=" + this.f2076c + ",misses=" + this.f2077d + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(t tVar) {
        this.f2074a = 1;
        this.f2075b = 1;
        this.f2078e = tVar;
        this.f2079f = tVar;
    }
}
