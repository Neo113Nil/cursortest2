package androidx.work.impl;

import android.content.Context;
import c6.b;
import c6.c;
import c6.e;
import c6.h;
import c6.i;
import c6.l;
import c6.n;
import c6.q;
import c6.s;
import j5.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z4.a;
import z4.f;
import z4.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l, reason: collision with root package name */
    public volatile q f766l;

    /* renamed from: m, reason: collision with root package name */
    public volatile c f767m;

    /* renamed from: n, reason: collision with root package name */
    public volatile s f768n;

    /* renamed from: o, reason: collision with root package name */
    public volatile i f769o;

    /* renamed from: p, reason: collision with root package name */
    public volatile l f770p;

    /* renamed from: q, reason: collision with root package name */
    public volatile n f771q;

    /* renamed from: r, reason: collision with root package name */
    public volatile e f772r;

    @Override // androidx.work.impl.WorkDatabase
    public final n A() {
        n nVar;
        if (this.f771q != null) {
            return this.f771q;
        }
        synchronized (this) {
            try {
                if (this.f771q == null) {
                    this.f771q = new n(this);
                }
                nVar = this.f771q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q B() {
        q qVar;
        if (this.f766l != null) {
            return this.f766l;
        }
        synchronized (this) {
            try {
                if (this.f766l == null) {
                    this.f766l = new q(this);
                }
                qVar = this.f766l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s C() {
        s sVar;
        if (this.f768n != null) {
            return this.f768n;
        }
        synchronized (this) {
            try {
                if (this.f768n == null) {
                    s sVar2 = new s();
                    sVar2.f1868d = this;
                    sVar2.f1869e = new b(this, 6);
                    new h(this, 16);
                    this.f768n = sVar2;
                }
                sVar = this.f768n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // z4.u
    public final f e() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // z4.u
    public final d g(a aVar) {
        y yVar = new y(aVar, new l.d(29, this));
        Context context = aVar.f10703a;
        context.getClass();
        return aVar.f10705c.e(new j5.b(context, aVar.f10704b, yVar, false, false));
    }

    @Override // z4.u
    public final List i(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new u5.d(13, 14, 9), new u5.d());
    }

    @Override // z4.u
    public final Set m() {
        return new HashSet();
    }

    @Override // z4.u
    public final Map o() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(q.class, list);
        hashMap.put(c.class, list);
        hashMap.put(s.class, list);
        hashMap.put(i.class, list);
        hashMap.put(l.class, list);
        hashMap.put(n.class, list);
        hashMap.put(e.class, list);
        hashMap.put(c6.f.class, list);
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c w() {
        c cVar;
        if (this.f767m != null) {
            return this.f767m;
        }
        synchronized (this) {
            try {
                if (this.f767m == null) {
                    this.f767m = new c(this);
                }
                cVar = this.f767m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e x() {
        e eVar;
        if (this.f772r != null) {
            return this.f772r;
        }
        synchronized (this) {
            try {
                if (this.f772r == null) {
                    this.f772r = new e((WorkDatabase) this);
                }
                eVar = this.f772r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i y() {
        i iVar;
        if (this.f769o != null) {
            return this.f769o;
        }
        synchronized (this) {
            try {
                if (this.f769o == null) {
                    this.f769o = new i(this);
                }
                iVar = this.f769o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l z() {
        l lVar;
        if (this.f770p != null) {
            return this.f770p;
        }
        synchronized (this) {
            try {
                if (this.f770p == null) {
                    this.f770p = new l(this);
                }
                lVar = this.f770p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
