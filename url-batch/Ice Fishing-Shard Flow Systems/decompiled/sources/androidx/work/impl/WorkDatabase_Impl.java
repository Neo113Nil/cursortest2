package androidx.work.impl;

import B.f;
import B6.o;
import H0.d;
import H6.h;
import P0.b;
import P0.c;
import P0.e;
import P0.i;
import P0.l;
import P0.n;
import P0.q;
import P0.s;
import android.content.Context;
import h0.C0456b;
import h0.C0460f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0656c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k, reason: collision with root package name */
    public volatile q f4100k;

    /* renamed from: l, reason: collision with root package name */
    public volatile c f4101l;

    /* renamed from: m, reason: collision with root package name */
    public volatile s f4102m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i f4103n;

    /* renamed from: o, reason: collision with root package name */
    public volatile l f4104o;

    /* renamed from: p, reason: collision with root package name */
    public volatile n f4105p;

    /* renamed from: q, reason: collision with root package name */
    public volatile e f4106q;

    @Override // androidx.work.impl.WorkDatabase
    public final C0460f d() {
        return new C0460f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC0656c e(C0456b c0456b) {
        o callback = new o(c0456b, new f(4, this));
        Context context = c0456b.f5062a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = c0456b.f5063b;
        Intrinsics.checkNotNullParameter(callback, "callback");
        return c0456b.f5064c.c(new h(context, str, callback, false, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c f() {
        c cVar;
        if (this.f4101l != null) {
            return this.f4101l;
        }
        synchronized (this) {
            try {
                if (this.f4101l == null) {
                    this.f4101l = new c(this);
                }
                cVar = this.f4101l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final List g(Map map) {
        return Arrays.asList(new d(13, 14, 9), new d());
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
        hashMap.put(P0.f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e l() {
        e eVar;
        if (this.f4106q != null) {
            return this.f4106q;
        }
        synchronized (this) {
            try {
                if (this.f4106q == null) {
                    this.f4106q = new e((WorkDatabase) this);
                }
                eVar = this.f4106q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i p() {
        i iVar;
        if (this.f4103n != null) {
            return this.f4103n;
        }
        synchronized (this) {
            try {
                if (this.f4103n == null) {
                    i iVar2 = new i();
                    iVar2.f2200a = this;
                    Intrinsics.checkNotNullParameter(this, "database");
                    iVar2.f2201b = new b(this, 2);
                    iVar2.f2202c = new P0.h(this, 0);
                    iVar2.f2203d = new P0.h(this, 1);
                    this.f4103n = iVar2;
                }
                iVar = this.f4103n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l r() {
        l lVar;
        if (this.f4104o != null) {
            return this.f4104o;
        }
        synchronized (this) {
            try {
                if (this.f4104o == null) {
                    this.f4104o = new l(this);
                }
                lVar = this.f4104o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        n nVar;
        if (this.f4105p != null) {
            return this.f4105p;
        }
        synchronized (this) {
            try {
                if (this.f4105p == null) {
                    this.f4105p = new n(this);
                }
                nVar = this.f4105p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        q qVar;
        if (this.f4100k != null) {
            return this.f4100k;
        }
        synchronized (this) {
            try {
                if (this.f4100k == null) {
                    this.f4100k = new q(this);
                }
                qVar = this.f4100k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f4102m != null) {
            return this.f4102m;
        }
        synchronized (this) {
            try {
                if (this.f4102m == null) {
                    s sVar2 = new s();
                    sVar2.f2251d = this;
                    Intrinsics.checkNotNullParameter(this, "database");
                    sVar2.f2252e = new b(this, 6);
                    new P0.h(this, 16);
                    this.f4102m = sVar2;
                }
                sVar = this.f4102m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }
}
