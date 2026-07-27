package androidx.work.impl;

import B0.c;
import B0.e;
import B0.i;
import B0.l;
import B0.n;
import B0.r;
import B0.t;
import B3.d;
import V0.j;
import X.b;
import X.f;
import b0.InterfaceC0261b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile r f4729k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f4730l;

    /* renamed from: m, reason: collision with root package name */
    public volatile t f4731m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f4732n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f4733o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f4734p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f4735q;

    @Override // androidx.work.impl.WorkDatabase
    public final f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0261b e(b bVar) {
        return bVar.f3446c.a(new X4.i(bVar.f3444a, bVar.f3445b, new d(bVar, new j(24, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f4730l != null) {
            return this.f4730l;
        }
        synchronized (this) {
            try {
                if (this.f4730l == null) {
                    this.f4730l = new c(this);
                }
                cVar = this.f4730l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new t0.e(13, 14, 9), new t0.e());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap hashMap = new HashMap();
        hashMap.put(r.class, Collections.emptyList());
        hashMap.put(c.class, Collections.emptyList());
        hashMap.put(t.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(l.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(B0.f.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f4735q != null) {
            return this.f4735q;
        }
        synchronized (this) {
            try {
                if (this.f4735q == null) {
                    this.f4735q = new e(this);
                }
                eVar = this.f4735q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f4732n != null) {
            return this.f4732n;
        }
        synchronized (this) {
            try {
                if (this.f4732n == null) {
                    this.f4732n = new i(this);
                }
                iVar = this.f4732n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f4733o != null) {
            return this.f4733o;
        }
        synchronized (this) {
            try {
                if (this.f4733o == null) {
                    this.f4733o = new l(this);
                }
                lVar = this.f4733o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f4734p != null) {
            return this.f4734p;
        }
        synchronized (this) {
            try {
                if (this.f4734p == null) {
                    this.f4734p = new n(this);
                }
                nVar = this.f4734p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final r t() {
        r rVar;
        if (this.f4729k != null) {
            return this.f4729k;
        }
        synchronized (this) {
            try {
                if (this.f4729k == null) {
                    this.f4729k = new r(this);
                }
                rVar = this.f4729k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t u() {
        t tVar;
        if (this.f4731m != null) {
            return this.f4731m;
        }
        synchronized (this) {
            try {
                if (this.f4731m == null) {
                    this.f4731m = new t(this);
                }
                tVar = this.f4731m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }
}
