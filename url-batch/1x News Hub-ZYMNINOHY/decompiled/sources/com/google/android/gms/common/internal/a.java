package com.google.android.gms.common.internal;

import E1.A;
import K0.b;
import K0.d;
import K0.e;
import K0.f;
import L0.c;
import L0.h;
import M0.m;
import N0.B;
import N0.C;
import N0.InterfaceC0063b;
import N0.g;
import N0.o;
import N0.q;
import N0.r;
import N0.s;
import N0.t;
import N0.u;
import N0.v;
import N0.w;
import N0.x;
import N0.y;
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

/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: x, reason: collision with root package name */
    public static final d[] f2681x = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2682a;

    /* renamed from: b, reason: collision with root package name */
    public A f2683b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2684c;

    /* renamed from: d, reason: collision with root package name */
    public final B f2685d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2686e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2687g;

    /* renamed from: h, reason: collision with root package name */
    public q f2688h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0063b f2689i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f2690j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2691k;

    /* renamed from: l, reason: collision with root package name */
    public u f2692l;

    /* renamed from: m, reason: collision with root package name */
    public int f2693m;

    /* renamed from: n, reason: collision with root package name */
    public final g f2694n;
    public final g o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2695p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2696q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f2697r;

    /* renamed from: s, reason: collision with root package name */
    public b f2698s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2699t;

    /* renamed from: u, reason: collision with root package name */
    public volatile x f2700u;
    public final AtomicInteger v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2701w;

    public a(Context context, Looper looper, int i3, F1.c cVar, L0.g gVar, h hVar) {
        synchronized (B.f987g) {
            try {
                if (B.f988h == null) {
                    B.f988h = new B(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B b3 = B.f988h;
        Object obj = e.f845c;
        r.c(gVar);
        r.c(hVar);
        g gVar2 = new g(gVar);
        g gVar3 = new g(hVar);
        String str = (String) cVar.f489d;
        this.f2682a = null;
        this.f = new Object();
        this.f2687g = new Object();
        this.f2691k = new ArrayList();
        this.f2693m = 1;
        this.f2698s = null;
        this.f2699t = false;
        this.f2700u = null;
        this.v = new AtomicInteger(0);
        r.d(context, "Context must not be null");
        this.f2684c = context;
        r.d(looper, "Looper must not be null");
        r.d(b3, "Supervisor must not be null");
        this.f2685d = b3;
        this.f2686e = new s(this, looper);
        this.f2695p = i3;
        this.f2694n = gVar2;
        this.o = gVar3;
        this.f2696q = str;
        Set set = (Set) cVar.f487b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2701w = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i3, int i4, IInterface iInterface) {
        synchronized (aVar.f) {
            try {
                if (aVar.f2693m != i3) {
                    return false;
                }
                aVar.w(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L0.c
    public final boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.f2693m == 4;
        }
        return z;
    }

    @Override // L0.c
    public final Set b() {
        return m() ? this.f2701w : Collections.EMPTY_SET;
    }

    @Override // L0.c
    public final void c(String str) {
        this.f2682a = str;
        l();
    }

    @Override // L0.c
    public final void d(C0.e eVar) {
        ((m) eVar.f201b).f941n.f923m.post(new B.b(3, eVar));
    }

    @Override // L0.c
    public final void e(N0.e eVar, Set set) {
        Bundle p3 = p();
        String str = this.f2697r;
        int i3 = f.f847a;
        Scope[] scopeArr = N0.d.o;
        Bundle bundle = new Bundle();
        int i4 = this.f2695p;
        d[] dVarArr = N0.d.f1002p;
        N0.d dVar = new N0.d(6, i4, i3, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        dVar.f1006d = this.f2684c.getPackageName();
        dVar.f1008g = p3;
        if (set != null) {
            dVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            dVar.f1009h = new Account("<<default account>>", "com.google");
            if (eVar != null) {
                dVar.f1007e = ((C) eVar).f995a;
            }
        }
        dVar.f1010i = f2681x;
        dVar.f1011j = o();
        if (u()) {
            dVar.f1014m = true;
        }
        try {
            synchronized (this.f2687g) {
                try {
                    q qVar = this.f2688h;
                    if (qVar != null) {
                        qVar.a(new t(this, this.v.get()), dVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i5 = this.v.get();
            s sVar = this.f2686e;
            sVar.sendMessage(sVar.obtainMessage(6, i5, 3));
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i6 = this.v.get();
            v vVar = new v(this, 8, null, null);
            s sVar2 = this.f2686e;
            sVar2.sendMessage(sVar2.obtainMessage(1, i6, -1, vVar));
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i62 = this.v.get();
            v vVar2 = new v(this, 8, null, null);
            s sVar22 = this.f2686e;
            sVar22.sendMessage(sVar22.obtainMessage(1, i62, -1, vVar2));
        }
    }

    @Override // L0.c
    public final void f(InterfaceC0063b interfaceC0063b) {
        this.f2689i = interfaceC0063b;
        w(2, null);
    }

    @Override // L0.c
    public final boolean h() {
        boolean z;
        synchronized (this.f) {
            int i3 = this.f2693m;
            z = true;
            if (i3 != 2 && i3 != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // L0.c
    public final d[] i() {
        x xVar = this.f2700u;
        if (xVar == null) {
            return null;
        }
        return xVar.f1067b;
    }

    @Override // L0.c
    public final void j() {
        if (!a() || this.f2683b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // L0.c
    public final String k() {
        return this.f2682a;
    }

    @Override // L0.c
    public void l() {
        this.v.incrementAndGet();
        synchronized (this.f2691k) {
            try {
                int size = this.f2691k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    o oVar = (o) this.f2691k.get(i3);
                    synchronized (oVar) {
                        oVar.f1049a = null;
                    }
                }
                this.f2691k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2687g) {
            this.f2688h = null;
        }
        w(1, null);
    }

    @Override // L0.c
    public boolean m() {
        return false;
    }

    public abstract IInterface n(IBinder iBinder);

    public d[] o() {
        return f2681x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.f2693m == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2690j;
                r.d(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return g() >= 211700000;
    }

    public boolean u() {
        return this instanceof V0.b;
    }

    public final void w(int i3, IInterface iInterface) {
        A a3;
        if ((i3 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f) {
            try {
                this.f2693m = i3;
                this.f2690j = iInterface;
                if (i3 == 1) {
                    u uVar = this.f2692l;
                    if (uVar != null) {
                        B b3 = this.f2685d;
                        String str = (String) this.f2683b.f309b;
                        r.c(str);
                        this.f2683b.getClass();
                        if (this.f2696q == null) {
                            this.f2684c.getClass();
                        }
                        b3.a(str, uVar, this.f2683b.f308a);
                        this.f2692l = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    u uVar2 = this.f2692l;
                    if (uVar2 != null && (a3 = this.f2683b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) a3.f309b) + " on com.google.android.gms");
                        B b4 = this.f2685d;
                        String str2 = (String) this.f2683b.f309b;
                        r.c(str2);
                        this.f2683b.getClass();
                        if (this.f2696q == null) {
                            this.f2684c.getClass();
                        }
                        b4.a(str2, uVar2, this.f2683b.f308a);
                        this.v.incrementAndGet();
                    }
                    u uVar3 = new u(this, this.v.get());
                    this.f2692l = uVar3;
                    String s3 = s();
                    boolean t3 = t();
                    A a4 = new A();
                    a4.f309b = s3;
                    a4.f308a = t3;
                    this.f2683b = a4;
                    if (t3 && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2683b.f309b)));
                    }
                    B b5 = this.f2685d;
                    String str3 = (String) this.f2683b.f309b;
                    r.c(str3);
                    this.f2683b.getClass();
                    String str4 = this.f2696q;
                    if (str4 == null) {
                        str4 = this.f2684c.getClass().getName();
                    }
                    if (!b5.b(new y(str3, this.f2683b.f308a), uVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2683b.f309b) + " on com.google.android.gms");
                        int i4 = this.v.get();
                        w wVar = new w(this, 16);
                        s sVar = this.f2686e;
                        sVar.sendMessage(sVar.obtainMessage(7, i4, -1, wVar));
                    }
                } else if (i3 == 4) {
                    r.c(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
