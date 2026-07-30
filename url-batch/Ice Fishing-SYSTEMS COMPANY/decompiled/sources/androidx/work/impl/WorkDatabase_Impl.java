package androidx.work.impl;

import F.d;
import S0.c;
import S0.e;
import S0.f;
import S0.h;
import S0.i;
import S0.l;
import S0.n;
import S0.q;
import S0.s;
import com.google.android.gms.internal.ads.C4088vv;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u0.C5091b;
import u0.C5095f;
import y0.b;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile q f5487k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f5488l;

    /* renamed from: m, reason: collision with root package name */
    public volatile s f5489m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f5490n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f5491o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f5492p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f5493q;

    @Override // androidx.work.impl.WorkDatabase
    public final C5095f d() {
        return new C5095f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b e(C5091b c5091b) {
        return c5091b.f41003c.a(new C4088vv(c5091b.f41001a, c5091b.f41002b, new d(c5091b, new h4.c(7, this)), false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f5488l != null) {
            return this.f5488l;
        }
        synchronized (this) {
            try {
                if (this.f5488l == null) {
                    this.f5488l = new c(this);
                }
                cVar = this.f5488l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new K0.d(13, 14, 9), new K0.d());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Set i() {
        return new HashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final Map j() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(q.class, list);
        hashMap.put(c.class, list);
        hashMap.put(s.class, list);
        hashMap.put(i.class, list);
        hashMap.put(l.class, list);
        hashMap.put(n.class, list);
        hashMap.put(e.class, list);
        hashMap.put(f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f5493q != null) {
            return this.f5493q;
        }
        synchronized (this) {
            try {
                if (this.f5493q == null) {
                    this.f5493q = new e(this);
                }
                eVar = this.f5493q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f5490n != null) {
            return this.f5490n;
        }
        synchronized (this) {
            try {
                if (this.f5490n == null) {
                    this.f5490n = new i(this);
                }
                iVar = this.f5490n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f5491o != null) {
            return this.f5491o;
        }
        synchronized (this) {
            try {
                if (this.f5491o == null) {
                    this.f5491o = new l(this);
                }
                lVar = this.f5491o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f5492p != null) {
            return this.f5492p;
        }
        synchronized (this) {
            try {
                if (this.f5492p == null) {
                    n nVar2 = new n();
                    nVar2.f2914n = this;
                    nVar2.f2915u = new S0.b(this, 4);
                    nVar2.f2916v = new h(this, 2);
                    nVar2.f2917w = new h(this, 3);
                    this.f5492p = nVar2;
                }
                nVar = this.f5492p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f5487k != null) {
            return this.f5487k;
        }
        synchronized (this) {
            try {
                if (this.f5487k == null) {
                    this.f5487k = new q(this);
                }
                qVar = this.f5487k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f5489m != null) {
            return this.f5489m;
        }
        synchronized (this) {
            try {
                if (this.f5489m == null) {
                    this.f5489m = new s(this);
                }
                sVar = this.f5489m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
