package e2;

import com.android.installreferrer.api.InstallReferrerClient;
import e6.l;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import l3.u;
import m4.f;
import r6.k;
import r6.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2736a;

    /* renamed from: b, reason: collision with root package name */
    public int f2737b;

    /* renamed from: c, reason: collision with root package name */
    public int f2738c;

    /* renamed from: d, reason: collision with root package name */
    public int f2739d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2740e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2741f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2742g;

    public b() {
        this.f2736a = 0;
        this.f2740e = new f();
        this.f2741f = new HashMap(0, 0.75f);
        this.f2742g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((f) this.f2740e)) {
            Object obj2 = ((HashMap) this.f2741f).get(obj);
            if (obj2 == null) {
                this.f2739d++;
                return null;
            }
            ((LinkedHashSet) this.f2742g).remove(obj);
            ((LinkedHashSet) this.f2742g).add(obj);
            this.f2738c++;
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
        synchronized (((f) this.f2740e)) {
            try {
                this.f2737b = e() + 1;
                put = ((HashMap) this.f2741f).put(obj, obj2);
                if (put != null) {
                    this.f2737b = e() - 1;
                }
                if (((LinkedHashSet) this.f2742g).contains(obj)) {
                    ((LinkedHashSet) this.f2742g).remove(obj);
                }
                ((LinkedHashSet) this.f2742g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((f) this.f2740e)) {
                try {
                    if (e() >= 0) {
                        if (((HashMap) this.f2741f).isEmpty() && e() != 0) {
                            break;
                        }
                        if (((HashMap) this.f2741f).isEmpty() != ((LinkedHashSet) this.f2742g).isEmpty()) {
                            break;
                        }
                        if (e() <= 16 || ((HashMap) this.f2741f).isEmpty()) {
                            obj3 = null;
                            obj4 = null;
                        } else {
                            obj3 = l.g0((LinkedHashSet) this.f2742g);
                            obj4 = ((HashMap) this.f2741f).get(obj3);
                            if (obj4 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            y.c((HashMap) this.f2741f).remove(obj3);
                            LinkedHashSet linkedHashSet = (LinkedHashSet) this.f2742g;
                            y.a(linkedHashSet);
                            linkedHashSet.remove(obj3);
                            int e9 = e();
                            k.c(obj3);
                            this.f2737b = e9 - 1;
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
            k.c(obj3);
            k.c(obj4);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public void c() {
        this.f2737b = 1;
        this.f2741f = (u) this.f2740e;
        this.f2739d = 0;
    }

    public boolean d() {
        m3.a b9 = ((u) this.f2741f).f5935b.b();
        int a3 = b9.a(6);
        return !(a3 == 0 || ((ByteBuffer) b9.f3416i).get(a3 + b9.f3413f) == 0) || this.f2738c == 65039;
    }

    public int e() {
        int i7;
        synchronized (((f) this.f2740e)) {
            i7 = this.f2737b;
        }
        return i7;
    }

    public String toString() {
        String str;
        switch (this.f2736a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                synchronized (((f) this.f2740e)) {
                    try {
                        int i7 = this.f2738c;
                        int i8 = this.f2739d + i7;
                        str = "LruCache[maxSize=16,hits=" + this.f2738c + ",misses=" + this.f2739d + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(u uVar) {
        this.f2736a = 1;
        this.f2737b = 1;
        this.f2740e = uVar;
        this.f2741f = uVar;
    }
}
