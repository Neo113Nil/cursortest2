package com.google.android.gms.common.internal;

import B1.C0097d;
import E1.b;
import E1.d;
import E1.e;
import E1.f;
import F1.c;
import G1.j;
import G1.l;
import G1.o;
import H1.A;
import H1.n;
import H1.p;
import H1.q;
import H1.r;
import H1.s;
import H1.t;
import H1.u;
import H1.v;
import H1.y;
import H1.z;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import w2.C1294c;

/* loaded from: classes.dex */
public abstract class a implements F1.a {

    /* renamed from: x, reason: collision with root package name */
    public static final d[] f6033x = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f6034a;

    /* renamed from: b, reason: collision with root package name */
    public z f6035b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6036c;

    /* renamed from: d, reason: collision with root package name */
    public final y f6037d;

    /* renamed from: e, reason: collision with root package name */
    public final p f6038e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6039f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6040g;

    /* renamed from: h, reason: collision with root package name */
    public n f6041h;

    /* renamed from: i, reason: collision with root package name */
    public o f6042i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f6043j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6044k;

    /* renamed from: l, reason: collision with root package name */
    public r f6045l;

    /* renamed from: m, reason: collision with root package name */
    public int f6046m;

    /* renamed from: n, reason: collision with root package name */
    public final C1294c f6047n;

    /* renamed from: o, reason: collision with root package name */
    public final C1294c f6048o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6049p;

    /* renamed from: q, reason: collision with root package name */
    public final String f6050q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f6051r;

    /* renamed from: s, reason: collision with root package name */
    public b f6052s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6053t;

    /* renamed from: u, reason: collision with root package name */
    public volatile u f6054u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f6055v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f6056w;

    public a(Context context, Looper looper, int i2, C0097d c0097d, c cVar, F1.d dVar) {
        synchronized (y.f3311g) {
            try {
                if (y.f3312h == null) {
                    y.f3312h = new y(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y yVar = y.f3312h;
        Object obj = e.f2287c;
        H1.o.d(cVar);
        H1.o.d(dVar);
        C1294c c1294c = new C1294c(cVar);
        C1294c c1294c2 = new C1294c(dVar);
        String str = (String) c0097d.f988i;
        this.f6034a = null;
        this.f6039f = new Object();
        this.f6040g = new Object();
        this.f6044k = new ArrayList();
        this.f6046m = 1;
        this.f6052s = null;
        this.f6053t = false;
        this.f6054u = null;
        this.f6055v = new AtomicInteger(0);
        H1.o.e(context, "Context must not be null");
        this.f6036c = context;
        H1.o.e(looper, "Looper must not be null");
        H1.o.e(yVar, "Supervisor must not be null");
        this.f6037d = yVar;
        this.f6038e = new p(this, looper);
        this.f6049p = i2;
        this.f6047n = c1294c;
        this.f6048o = c1294c2;
        this.f6050q = str;
        Set set = (Set) c0097d.f987e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f6056w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i2, int i4, IInterface iInterface) {
        synchronized (aVar.f6039f) {
            try {
                if (aVar.f6046m != i2) {
                    return false;
                }
                aVar.v(i4, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // F1.a
    public final boolean a() {
        boolean z4;
        synchronized (this.f6039f) {
            int i2 = this.f6046m;
            z4 = true;
            if (i2 != 2 && i2 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // F1.a
    public final d[] b() {
        u uVar = this.f6054u;
        if (uVar == null) {
            return null;
        }
        return uVar.f3296e;
    }

    @Override // F1.a
    public final boolean c() {
        boolean z4;
        synchronized (this.f6039f) {
            z4 = this.f6046m == 4;
        }
        return z4;
    }

    @Override // F1.a
    public final void d() {
        if (!c() || this.f6035b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // F1.a
    public final void e(H1.d dVar, Set set) {
        Bundle q2 = q();
        String str = this.f6051r;
        int i2 = f.f2289a;
        Scope[] scopeArr = H1.c.f3237u;
        Bundle bundle = new Bundle();
        int i4 = this.f6049p;
        d[] dVarArr = H1.c.f3238v;
        H1.c cVar = new H1.c(6, i4, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        cVar.f3242j = this.f6036c.getPackageName();
        cVar.f3245m = q2;
        if (set != null) {
            cVar.f3244l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            cVar.f3246n = new Account("<<default account>>", "com.google");
            if (dVar != null) {
                cVar.f3243k = ((A) dVar).f3229a;
            }
        }
        cVar.f3247o = f6033x;
        cVar.f3248p = p();
        try {
            synchronized (this.f6040g) {
                try {
                    n nVar = this.f6041h;
                    if (nVar != null) {
                        nVar.a(new q(this, this.f6055v.get()), cVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i5 = this.f6055v.get();
            p pVar = this.f6038e;
            pVar.sendMessage(pVar.obtainMessage(6, i5, 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i6 = this.f6055v.get();
            s sVar = new s(this, 8, null, null);
            p pVar2 = this.f6038e;
            pVar2.sendMessage(pVar2.obtainMessage(1, i6, -1, sVar));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i62 = this.f6055v.get();
            s sVar2 = new s(this, 8, null, null);
            p pVar22 = this.f6038e;
            pVar22.sendMessage(pVar22.obtainMessage(1, i62, -1, sVar2));
        }
    }

    @Override // F1.a
    public final String f() {
        return this.f6034a;
    }

    @Override // F1.a
    public final Set g() {
        return l() ? this.f6056w : Collections.emptySet();
    }

    @Override // F1.a
    public final void h(C1294c c1294c) {
        ((l) c1294c.f11388d).f3140k.f3122m.post(new j(1, c1294c));
    }

    @Override // F1.a
    public final void i(o oVar) {
        this.f6042i = oVar;
        v(2, null);
    }

    @Override // F1.a
    public final void j() {
        this.f6055v.incrementAndGet();
        synchronized (this.f6044k) {
            try {
                int size = this.f6044k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    H1.l lVar = (H1.l) this.f6044k.get(i2);
                    synchronized (lVar) {
                        lVar.f3277a = null;
                    }
                }
                this.f6044k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6040g) {
            this.f6041h = null;
        }
        v(1, null);
    }

    @Override // F1.a
    public final void k(String str) {
        this.f6034a = str;
        j();
    }

    @Override // F1.a
    public boolean l() {
        return false;
    }

    public abstract IInterface o(IBinder iBinder);

    public abstract d[] p();

    public abstract Bundle q();

    public abstract String r();

    public abstract String s();

    public abstract boolean t();

    public final void v(int i2, IInterface iInterface) {
        z zVar;
        if ((i2 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f6039f) {
            try {
                this.f6046m = i2;
                this.f6043j = iInterface;
                if (i2 == 1) {
                    r rVar = this.f6045l;
                    if (rVar != null) {
                        y yVar = this.f6037d;
                        String str = (String) this.f6035b.f3321b;
                        H1.o.d(str);
                        this.f6035b.getClass();
                        if (this.f6050q == null) {
                            this.f6036c.getClass();
                        }
                        yVar.a(str, rVar, this.f6035b.f3320a);
                        this.f6045l = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    r rVar2 = this.f6045l;
                    if (rVar2 != null && (zVar = this.f6035b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) zVar.f3321b) + " on com.google.android.gms");
                        y yVar2 = this.f6037d;
                        String str2 = (String) this.f6035b.f3321b;
                        H1.o.d(str2);
                        this.f6035b.getClass();
                        if (this.f6050q == null) {
                            this.f6036c.getClass();
                        }
                        yVar2.a(str2, rVar2, this.f6035b.f3320a);
                        this.f6055v.incrementAndGet();
                    }
                    r rVar3 = new r(this, this.f6055v.get());
                    this.f6045l = rVar3;
                    String s4 = s();
                    boolean t4 = t();
                    this.f6035b = new z((Object) s4, t4);
                    if (t4 && n() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f6035b.f3321b)));
                    }
                    y yVar3 = this.f6037d;
                    String str3 = (String) this.f6035b.f3321b;
                    H1.o.d(str3);
                    this.f6035b.getClass();
                    String str4 = this.f6050q;
                    if (str4 == null) {
                        str4 = this.f6036c.getClass().getName();
                    }
                    if (!yVar3.b(new v(str3, this.f6035b.f3320a), rVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f6035b.f3321b) + " on com.google.android.gms");
                        int i4 = this.f6055v.get();
                        t tVar = new t(this, 16);
                        p pVar = this.f6038e;
                        pVar.sendMessage(pVar.obtainMessage(7, i4, -1, tVar));
                    }
                } else if (i2 == 4) {
                    H1.o.d(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
