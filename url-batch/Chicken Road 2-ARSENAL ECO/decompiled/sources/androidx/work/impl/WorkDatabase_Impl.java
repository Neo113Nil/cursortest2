package androidx.work.impl;

import Q.b;
import Q.f;
import U.a;
import U.c;
import a6.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.AbstractC0676f;
import u0.C0672b;
import u0.C0673c;
import u0.C0675e;
import u0.C0678h;
import u0.C0679i;
import u0.C0682l;
import u0.C0684n;
import u0.C0687q;
import u0.C0689s;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile C0687q f3571k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0673c f3572l;

    /* renamed from: m, reason: collision with root package name */
    public volatile C0689s f3573m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0679i f3574n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C0682l f3575o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C0684n f3576p;

    /* renamed from: q, reason: collision with root package name */
    public volatile C0675e f3577q;

    @Override // androidx.work.impl.WorkDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c e(b bVar) {
        return bVar.f1904c.a(new a(bVar.f1902a, bVar.f1903b, new D1.b(bVar, new d(this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0673c f() {
        C0673c c0673c;
        if (this.f3572l != null) {
            return this.f3572l;
        }
        synchronized (this) {
            try {
                if (this.f3572l == null) {
                    C0673c c0673c2 = new C0673c();
                    c0673c2.f5968f = this;
                    c0673c2.f5969g = new C0672b(this, 0);
                    this.f3572l = c0673c2;
                }
                c0673c = this.f3572l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0673c;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(Map map) {
        return Arrays.asList(new m0.d(13, 14, 9), new m0.d());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(C0687q.class, list);
        hashMap.put(C0673c.class, list);
        hashMap.put(C0689s.class, list);
        hashMap.put(C0679i.class, list);
        hashMap.put(C0682l.class, list);
        hashMap.put(C0684n.class, list);
        hashMap.put(C0675e.class, list);
        hashMap.put(AbstractC0676f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0675e l() {
        C0675e c0675e;
        if (this.f3577q != null) {
            return this.f3577q;
        }
        synchronized (this) {
            try {
                if (this.f3577q == null) {
                    this.f3577q = new C0675e((WorkDatabase) this);
                }
                c0675e = this.f3577q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0675e;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0679i p() {
        C0679i c0679i;
        if (this.f3574n != null) {
            return this.f3574n;
        }
        synchronized (this) {
            try {
                if (this.f3574n == null) {
                    C0679i c0679i2 = new C0679i();
                    c0679i2.f5981f = this;
                    c0679i2.f5982g = new C0672b(this, 2);
                    c0679i2.f5983h = new C0678h(this, 0);
                    c0679i2.f5984i = new C0678h(this, 1);
                    this.f3574n = c0679i2;
                }
                c0679i = this.f3574n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0679i;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0682l r() {
        C0682l c0682l;
        if (this.f3575o != null) {
            return this.f3575o;
        }
        synchronized (this) {
            try {
                if (this.f3575o == null) {
                    C0682l c0682l2 = new C0682l();
                    c0682l2.f5989f = this;
                    c0682l2.f5990g = new C0672b(this, 3);
                    this.f3575o = c0682l2;
                }
                c0682l = this.f3575o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0682l;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0684n s() {
        C0684n c0684n;
        if (this.f3576p != null) {
            return this.f3576p;
        }
        synchronized (this) {
            try {
                if (this.f3576p == null) {
                    this.f3576p = new C0684n(this);
                }
                c0684n = this.f3576p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0684n;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0687q t() {
        C0687q c0687q;
        if (this.f3571k != null) {
            return this.f3571k;
        }
        synchronized (this) {
            try {
                if (this.f3571k == null) {
                    this.f3571k = new C0687q(this);
                }
                c0687q = this.f3571k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0687q;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C0689s u() {
        C0689s c0689s;
        if (this.f3573m != null) {
            return this.f3573m;
        }
        synchronized (this) {
            try {
                if (this.f3573m == null) {
                    C0689s c0689s2 = new C0689s();
                    c0689s2.f6034f = this;
                    c0689s2.f6035g = new C0672b(this, 6);
                    new C0678h(this, 16);
                    this.f3573m = c0689s2;
                }
                c0689s = this.f3573m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0689s;
    }
}
