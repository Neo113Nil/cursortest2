package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import j4.b;
import j4.d;
import j4.e;
import j4.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k4.c;
import l1.x;
import l4.j;
import l4.l;
import m4.a0;
import m4.n;
import m4.o;
import m4.p;
import m4.q;
import m4.r;
import m4.s;
import m4.t;
import m4.u;
import m4.v;
import m4.y;
import m4.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements k4.a {

    /* renamed from: x, reason: collision with root package name */
    public static final d[] f1778x = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f1779a;

    /* renamed from: b, reason: collision with root package name */
    public z f1780b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1781c;

    /* renamed from: d, reason: collision with root package name */
    public final y f1782d;

    /* renamed from: e, reason: collision with root package name */
    public final p f1783e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1784f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1785g;

    /* renamed from: h, reason: collision with root package name */
    public n f1786h;

    /* renamed from: i, reason: collision with root package name */
    public l f1787i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f1788j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1789k;

    /* renamed from: l, reason: collision with root package name */
    public r f1790l;

    /* renamed from: m, reason: collision with root package name */
    public int f1791m;

    /* renamed from: n, reason: collision with root package name */
    public final x f1792n;

    /* renamed from: o, reason: collision with root package name */
    public final x f1793o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1794p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1795q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f1796r;

    /* renamed from: s, reason: collision with root package name */
    public b f1797s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1798t;

    /* renamed from: u, reason: collision with root package name */
    public volatile u f1799u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f1800v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f1801w;

    public a(Context context, Looper looper, int i7, b1.b bVar, c cVar, k4.d dVar) {
        synchronized (y.f6413g) {
            try {
                if (y.f6414h == null) {
                    y.f6414h = new y(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y yVar = y.f6414h;
        Object obj = e.f5012c;
        o.d(cVar);
        o.d(dVar);
        x xVar = new x(6, cVar);
        x xVar2 = new x(7, dVar);
        String str = (String) bVar.f1231h;
        this.f1779a = null;
        this.f1784f = new Object();
        this.f1785g = new Object();
        this.f1789k = new ArrayList();
        this.f1791m = 1;
        this.f1797s = null;
        this.f1798t = false;
        this.f1799u = null;
        this.f1800v = new AtomicInteger(0);
        o.e(context, "Context must not be null");
        this.f1781c = context;
        o.e(looper, "Looper must not be null");
        o.e(yVar, "Supervisor must not be null");
        this.f1782d = yVar;
        this.f1783e = new p(this, looper);
        this.f1794p = i7;
        this.f1792n = xVar;
        this.f1793o = xVar2;
        this.f1795q = str;
        Set set = (Set) bVar.f1230g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f1801w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i7, int i8, IInterface iInterface) {
        synchronized (aVar.f1784f) {
            try {
                if (aVar.f1791m != i7) {
                    return false;
                }
                aVar.v(i8, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.a
    public final boolean a() {
        boolean z8;
        synchronized (this.f1784f) {
            z8 = this.f1791m == 4;
        }
        return z8;
    }

    @Override // k4.a
    public final Set b() {
        return m() ? this.f1801w : Collections.EMPTY_SET;
    }

    @Override // k4.a
    public final void c(x xVar) {
        ((j) xVar.f5847g).f5984m.f5971m.post(new androidx.room.o(3, xVar));
    }

    @Override // k4.a
    public final void d(String str) {
        this.f1779a = str;
        l();
    }

    @Override // k4.a
    public final boolean f() {
        boolean z8;
        synchronized (this.f1784f) {
            int i7 = this.f1791m;
            z8 = true;
            if (i7 != 2 && i7 != 3) {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // k4.a
    public final d[] g() {
        u uVar = this.f1799u;
        if (uVar == null) {
            return null;
        }
        return uVar.f6398g;
    }

    @Override // k4.a
    public final void h(m4.d dVar, Set set) {
        Bundle q8 = q();
        String str = this.f1796r;
        int i7 = f.f5014a;
        Scope[] scopeArr = m4.c.f6339t;
        Bundle bundle = new Bundle();
        int i8 = this.f1794p;
        d[] dVarArr = m4.c.f6340u;
        m4.c cVar = new m4.c(6, i8, i7, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        cVar.f6344i = this.f1781c.getPackageName();
        cVar.f6347l = q8;
        if (set != null) {
            cVar.f6346k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            cVar.f6348m = new Account("<<default account>>", "com.google");
            if (dVar != null) {
                cVar.f6345j = ((a0) dVar).f6332c;
            }
        }
        cVar.f6349n = f1778x;
        cVar.f6350o = p();
        try {
            synchronized (this.f1785g) {
                try {
                    n nVar = this.f1786h;
                    if (nVar != null) {
                        nVar.a(new q(this, this.f1800v.get()), cVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            int i9 = this.f1800v.get();
            p pVar = this.f1783e;
            pVar.sendMessage(pVar.obtainMessage(6, i9, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i10 = this.f1800v.get();
            s sVar = new s(this, 8, null, null);
            p pVar2 = this.f1783e;
            pVar2.sendMessage(pVar2.obtainMessage(1, i10, -1, sVar));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i102 = this.f1800v.get();
            s sVar2 = new s(this, 8, null, null);
            p pVar22 = this.f1783e;
            pVar22.sendMessage(pVar22.obtainMessage(1, i102, -1, sVar2));
        }
    }

    @Override // k4.a
    public final void i() {
        if (!a() || this.f1780b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // k4.a
    public final void j(l lVar) {
        this.f1787i = lVar;
        v(2, null);
    }

    @Override // k4.a
    public final String k() {
        return this.f1779a;
    }

    @Override // k4.a
    public final void l() {
        this.f1800v.incrementAndGet();
        synchronized (this.f1789k) {
            try {
                int size = this.f1789k.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m4.l lVar = (m4.l) this.f1789k.get(i7);
                    synchronized (lVar) {
                        lVar.f6379a = null;
                    }
                }
                this.f1789k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f1785g) {
            this.f1786h = null;
        }
        v(1, null);
    }

    @Override // k4.a
    public boolean m() {
        return false;
    }

    public abstract IInterface o(IBinder iBinder);

    public abstract d[] p();

    public abstract Bundle q();

    public abstract String r();

    public abstract String s();

    public abstract boolean t();

    public final void v(int i7, IInterface iInterface) {
        z zVar;
        if ((i7 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f1784f) {
            try {
                this.f1791m = i7;
                this.f1788j = iInterface;
                if (i7 == 1) {
                    r rVar = this.f1790l;
                    if (rVar != null) {
                        y yVar = this.f1782d;
                        String str = (String) this.f1780b.f6423b;
                        o.d(str);
                        this.f1780b.getClass();
                        if (this.f1795q == null) {
                            this.f1781c.getClass();
                        }
                        yVar.a(str, rVar, this.f1780b.f6422a);
                        this.f1790l = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    r rVar2 = this.f1790l;
                    if (rVar2 != null && (zVar = this.f1780b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) zVar.f6423b) + " on com.google.android.gms");
                        y yVar2 = this.f1782d;
                        String str2 = (String) this.f1780b.f6423b;
                        o.d(str2);
                        this.f1780b.getClass();
                        if (this.f1795q == null) {
                            this.f1781c.getClass();
                        }
                        yVar2.a(str2, rVar2, this.f1780b.f6422a);
                        this.f1800v.incrementAndGet();
                    }
                    r rVar3 = new r(this, this.f1800v.get());
                    this.f1790l = rVar3;
                    String s5 = s();
                    boolean t2 = t();
                    this.f1780b = new z(s5, t2);
                    if (t2 && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f1780b.f6423b)));
                    }
                    y yVar3 = this.f1782d;
                    String str3 = (String) this.f1780b.f6423b;
                    o.d(str3);
                    this.f1780b.getClass();
                    String str4 = this.f1795q;
                    if (str4 == null) {
                        str4 = this.f1781c.getClass().getName();
                    }
                    if (!yVar3.b(new v(str3, this.f1780b.f6422a), rVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f1780b.f6423b) + " on com.google.android.gms");
                        int i8 = this.f1800v.get();
                        t tVar = new t(this, 16);
                        p pVar = this.f1783e;
                        pVar.sendMessage(pVar.obtainMessage(7, i8, -1, tVar));
                    }
                } else if (i7 == 4) {
                    o.d(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
