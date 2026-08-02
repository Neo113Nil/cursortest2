package com.google.android.gms.common.internal;

import B.b;
import E1.X;
import a2.C0162b;
import a2.C0164d;
import a2.C0165e;
import a2.C0166f;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import b2.c;
import b2.g;
import c2.m;
import com.google.android.gms.common.api.Scope;
import d2.C0381C;
import d2.C0382D;
import d2.C0386d;
import d2.InterfaceC0384b;
import d2.InterfaceC0387e;
import d2.h;
import d2.p;
import d2.r;
import d2.s;
import d2.t;
import d2.u;
import d2.v;
import d2.w;
import d2.x;
import d2.y;
import d2.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: x, reason: collision with root package name */
    public static final C0164d[] f5777x = new C0164d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f5778a;

    /* renamed from: b, reason: collision with root package name */
    public X f5779b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5780c;

    /* renamed from: d, reason: collision with root package name */
    public final C0381C f5781d;

    /* renamed from: e, reason: collision with root package name */
    public final t f5782e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5783f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5784g;

    /* renamed from: h, reason: collision with root package name */
    public r f5785h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0384b f5786i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f5787j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f5788k;

    /* renamed from: l, reason: collision with root package name */
    public v f5789l;

    /* renamed from: m, reason: collision with root package name */
    public int f5790m;
    public final h n;
    public final h o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5791p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5792q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f5793r;

    /* renamed from: s, reason: collision with root package name */
    public C0162b f5794s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5795t;

    /* renamed from: u, reason: collision with root package name */
    public volatile y f5796u;
    public final AtomicInteger v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f5797w;

    public a(Context context, Looper looper, int i4, L1.h hVar, g gVar, b2.h hVar2, int i5) {
        synchronized (C0381C.f8223g) {
            try {
                if (C0381C.f8224h == null) {
                    C0381C.f8224h = new C0381C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0381C c0381c = C0381C.f8224h;
        Object obj = C0165e.f4274c;
        s.c(gVar);
        s.c(hVar2);
        h hVar3 = new h(gVar);
        h hVar4 = new h(hVar2);
        String str = (String) hVar.f1637e;
        this.f5778a = null;
        this.f5783f = new Object();
        this.f5784g = new Object();
        this.f5788k = new ArrayList();
        this.f5790m = 1;
        this.f5794s = null;
        this.f5795t = false;
        this.f5796u = null;
        this.v = new AtomicInteger(0);
        s.d(context, "Context must not be null");
        this.f5780c = context;
        s.d(looper, "Looper must not be null");
        s.d(c0381c, "Supervisor must not be null");
        this.f5781d = c0381c;
        this.f5782e = new t(this, looper);
        this.f5791p = i4;
        this.n = hVar3;
        this.o = hVar4;
        this.f5792q = str;
        Set set = (Set) hVar.f1636d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f5797w = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i4, int i5, IInterface iInterface) {
        synchronized (aVar.f5783f) {
            try {
                if (aVar.f5790m != i4) {
                    return false;
                }
                aVar.w(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b2.c
    public final Set a() {
        return m() ? this.f5797w : Collections.EMPTY_SET;
    }

    @Override // b2.c
    public final void b(String str) {
        this.f5778a = str;
        e();
    }

    @Override // b2.c
    public final boolean c() {
        boolean z;
        synchronized (this.f5783f) {
            int i4 = this.f5790m;
            z = true;
            if (i4 != 2 && i4 != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // b2.c
    public final void d() {
        if (!g() || this.f5779b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // b2.c
    public void e() {
        this.v.incrementAndGet();
        synchronized (this.f5788k) {
            try {
                int size = this.f5788k.size();
                for (int i4 = 0; i4 < size; i4++) {
                    p pVar = (p) this.f5788k.get(i4);
                    synchronized (pVar) {
                        pVar.f8291a = null;
                    }
                }
                this.f5788k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f5784g) {
            this.f5785h = null;
        }
        w(1, null);
    }

    @Override // b2.c
    public final void f(InterfaceC0384b interfaceC0384b) {
        this.f5786i = interfaceC0384b;
        w(2, null);
    }

    @Override // b2.c
    public final boolean g() {
        boolean z;
        synchronized (this.f5783f) {
            z = this.f5790m == 4;
        }
        return z;
    }

    @Override // b2.c
    public final void h(InterfaceC0387e interfaceC0387e, Set set) {
        Bundle p2 = p();
        String str = this.f5793r;
        int i4 = C0166f.f4276a;
        Scope[] scopeArr = C0386d.o;
        Bundle bundle = new Bundle();
        int i5 = this.f5791p;
        C0164d[] c0164dArr = C0386d.f8240p;
        C0386d c0386d = new C0386d(6, i5, i4, null, null, scopeArr, bundle, null, c0164dArr, c0164dArr, true, 0, false, str);
        c0386d.f8244d = this.f5780c.getPackageName();
        c0386d.f8247g = p2;
        if (set != null) {
            c0386d.f8246f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            c0386d.f8248h = new Account("<<default account>>", "com.google");
            if (interfaceC0387e != null) {
                c0386d.f8245e = ((C0382D) interfaceC0387e).f8232a;
            }
        }
        c0386d.f8249i = f5777x;
        c0386d.f8250j = o();
        if (u()) {
            c0386d.f8253m = true;
        }
        try {
            synchronized (this.f5784g) {
                try {
                    r rVar = this.f5785h;
                    if (rVar != null) {
                        rVar.a(new u(this, this.v.get()), c0386d);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i6 = this.v.get();
            t tVar = this.f5782e;
            tVar.sendMessage(tVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.v.get();
            w wVar = new w(this, 8, null, null);
            t tVar2 = this.f5782e;
            tVar2.sendMessage(tVar2.obtainMessage(1, i7, -1, wVar));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.v.get();
            w wVar2 = new w(this, 8, null, null);
            t tVar22 = this.f5782e;
            tVar22.sendMessage(tVar22.obtainMessage(1, i72, -1, wVar2));
        }
    }

    @Override // b2.c
    public final C0164d[] j() {
        y yVar = this.f5796u;
        if (yVar == null) {
            return null;
        }
        return yVar.f8310b;
    }

    @Override // b2.c
    public final void k(t1.h hVar) {
        ((m) hVar.f15398b).f5694m.f5674m.post(new b(10, hVar));
    }

    @Override // b2.c
    public final String l() {
        return this.f5778a;
    }

    @Override // b2.c
    public boolean m() {
        return false;
    }

    public abstract IInterface n(IBinder iBinder);

    public C0164d[] o() {
        return f5777x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f5783f) {
            try {
                if (this.f5790m == 5) {
                    throw new DeadObjectException();
                }
                if (!g()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f5787j;
                s.d(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return i() >= 211700000;
    }

    public boolean u() {
        return this instanceof l2.b;
    }

    public final void w(int i4, IInterface iInterface) {
        X x4;
        if ((i4 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f5783f) {
            try {
                this.f5790m = i4;
                this.f5787j = iInterface;
                if (i4 == 1) {
                    v vVar = this.f5789l;
                    if (vVar != null) {
                        C0381C c0381c = this.f5781d;
                        String str = (String) this.f5779b.f556b;
                        s.c(str);
                        this.f5779b.getClass();
                        if (this.f5792q == null) {
                            this.f5780c.getClass();
                        }
                        c0381c.a(str, vVar, this.f5779b.f555a);
                        this.f5789l = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    v vVar2 = this.f5789l;
                    if (vVar2 != null && (x4 = this.f5779b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) x4.f556b) + " on com.google.android.gms");
                        C0381C c0381c2 = this.f5781d;
                        String str2 = (String) this.f5779b.f556b;
                        s.c(str2);
                        this.f5779b.getClass();
                        if (this.f5792q == null) {
                            this.f5780c.getClass();
                        }
                        c0381c2.a(str2, vVar2, this.f5779b.f555a);
                        this.v.incrementAndGet();
                    }
                    v vVar3 = new v(this, this.v.get());
                    this.f5789l = vVar3;
                    String s4 = s();
                    boolean t4 = t();
                    X x5 = new X();
                    x5.f556b = s4;
                    x5.f555a = t4;
                    this.f5779b = x5;
                    if (t4 && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f5779b.f556b)));
                    }
                    C0381C c0381c3 = this.f5781d;
                    String str3 = (String) this.f5779b.f556b;
                    s.c(str3);
                    this.f5779b.getClass();
                    String str4 = this.f5792q;
                    if (str4 == null) {
                        str4 = this.f5780c.getClass().getName();
                    }
                    if (!c0381c3.b(new z(str3, this.f5779b.f555a), vVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f5779b.f556b) + " on com.google.android.gms");
                        int i5 = this.v.get();
                        x xVar = new x(this, 16);
                        t tVar = this.f5782e;
                        tVar.sendMessage(tVar.obtainMessage(7, i5, -1, xVar));
                    }
                } else if (i4 == 4) {
                    s.c(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
