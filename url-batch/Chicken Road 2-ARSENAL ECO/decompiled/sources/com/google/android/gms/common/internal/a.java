package com.google.android.gms.common.internal;

import A.b;
import D3.M;
import Q.j;
import R0.c;
import R0.d;
import S0.e;
import S0.f;
import T0.B;
import U0.A;
import U0.C;
import U0.D;
import U0.InterfaceC0211b;
import U0.q;
import U0.s;
import U0.t;
import U0.u;
import U0.v;
import U0.w;
import U0.x;
import U0.y;
import U0.z;
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
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k.v0;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class a implements S0.a {

    /* renamed from: C, reason: collision with root package name */
    public static final c[] f3863C = new c[0];

    /* renamed from: A, reason: collision with root package name */
    public final AtomicInteger f3864A;

    /* renamed from: B, reason: collision with root package name */
    public final Set f3865B;

    /* renamed from: a, reason: collision with root package name */
    public int f3866a;

    /* renamed from: b, reason: collision with root package name */
    public long f3867b;

    /* renamed from: c, reason: collision with root package name */
    public long f3868c;

    /* renamed from: d, reason: collision with root package name */
    public int f3869d;

    /* renamed from: e, reason: collision with root package name */
    public long f3870e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f3871f;

    /* renamed from: g, reason: collision with root package name */
    public j f3872g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f3873h;

    /* renamed from: i, reason: collision with root package name */
    public final C f3874i;

    /* renamed from: j, reason: collision with root package name */
    public final u f3875j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f3876k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3877l;

    /* renamed from: m, reason: collision with root package name */
    public s f3878m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0211b f3879n;

    /* renamed from: o, reason: collision with root package name */
    public IInterface f3880o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3881p;

    /* renamed from: q, reason: collision with root package name */
    public w f3882q;

    /* renamed from: r, reason: collision with root package name */
    public int f3883r;

    /* renamed from: s, reason: collision with root package name */
    public final J1.c f3884s;

    /* renamed from: t, reason: collision with root package name */
    public final M f3885t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3886u;

    /* renamed from: v, reason: collision with root package name */
    public final String f3887v;

    /* renamed from: w, reason: collision with root package name */
    public volatile String f3888w;

    /* renamed from: x, reason: collision with root package name */
    public R0.a f3889x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public volatile z f3890z;

    public a(Context context, Looper looper, int i7, v0 v0Var, e eVar, f fVar) {
        synchronized (C.f2497g) {
            try {
                if (C.f2498h == null) {
                    C.f2498h = new C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C c7 = C.f2498h;
        Object obj = d.f2062b;
        t.f(eVar);
        t.f(fVar);
        J1.c cVar = new J1.c(28, eVar);
        M m4 = new M(26, fVar);
        String str = (String) v0Var.f5140j;
        this.f3871f = null;
        this.f3876k = new Object();
        this.f3877l = new Object();
        this.f3881p = new ArrayList();
        this.f3883r = 1;
        this.f3889x = null;
        this.y = false;
        this.f3890z = null;
        this.f3864A = new AtomicInteger(0);
        t.g(context, "Context must not be null");
        this.f3873h = context;
        t.g(looper, "Looper must not be null");
        t.g(c7, "Supervisor must not be null");
        this.f3874i = c7;
        this.f3875j = new u(this, looper);
        this.f3886u = i7;
        this.f3884s = cVar;
        this.f3885t = m4;
        this.f3887v = str;
        Set set = (Set) v0Var.f5137g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f3865B = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i7, int i8, IInterface iInterface) {
        synchronized (aVar.f3876k) {
            try {
                if (aVar.f3883r != i7) {
                    return false;
                }
                aVar.w(i8, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S0.a
    public final boolean a() {
        boolean z5;
        synchronized (this.f3876k) {
            z5 = this.f3883r == 4;
        }
        return z5;
    }

    @Override // S0.a
    public final Set b() {
        return m() ? this.f3865B : Collections.EMPTY_SET;
    }

    @Override // S0.a
    public final void c(M m4) {
        ((B) m4.f401g).f2233o.f2293m.post(new b(8, m4));
    }

    @Override // S0.a
    public final void d(String str) {
        this.f3871f = str;
        l();
    }

    @Override // S0.a
    public final boolean f() {
        boolean z5;
        synchronized (this.f3876k) {
            int i7 = this.f3883r;
            z5 = true;
            if (i7 != 2 && i7 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // S0.a
    public final void g(String str, PrintWriter printWriter) {
        int i7;
        IInterface iInterface;
        s sVar;
        synchronized (this.f3876k) {
            i7 = this.f3883r;
            iInterface = this.f3880o;
        }
        synchronized (this.f3877l) {
            sVar = this.f3878m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) s()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (sVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(sVar.f2579d)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f3868c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j4 = this.f3868c;
            append.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
        if (this.f3867b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.f3866a;
            if (i8 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i8 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i8 != 3) {
                printWriter.append((CharSequence) String.valueOf(i8));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j7 = this.f3867b;
            append2.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
        if (this.f3870e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC0676f.k(this.f3869d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j8 = this.f3870e;
            append3.println(j8 + " " + simpleDateFormat.format(new Date(j8)));
        }
    }

    @Override // S0.a
    public final c[] h() {
        z zVar = this.f3890z;
        if (zVar == null) {
            return null;
        }
        return zVar.f2592g;
    }

    @Override // S0.a
    public final void i() {
        if (!a() || this.f3872g == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // S0.a
    public final void j(InterfaceC0211b interfaceC0211b) {
        t.g(interfaceC0211b, "Connection progress callbacks cannot be null.");
        this.f3879n = interfaceC0211b;
        w(2, null);
    }

    @Override // S0.a
    public final String k() {
        return this.f3871f;
    }

    @Override // S0.a
    public final void l() {
        this.f3864A.incrementAndGet();
        synchronized (this.f3881p) {
            try {
                int size = this.f3881p.size();
                for (int i7 = 0; i7 < size; i7++) {
                    q qVar = (q) this.f3881p.get(i7);
                    synchronized (qVar) {
                        qVar.f2573a = null;
                    }
                }
                this.f3881p.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f3877l) {
            this.f3878m = null;
        }
        w(1, null);
    }

    @Override // S0.a
    public boolean m() {
        return false;
    }

    @Override // S0.a
    public final void n(U0.f fVar, Set set) {
        Bundle q6 = q();
        String str = this.f3888w;
        int i7 = R0.e.f2064a;
        Scope[] scopeArr = U0.e.f2515t;
        Bundle bundle = new Bundle();
        int i8 = this.f3886u;
        c[] cVarArr = U0.e.f2516u;
        U0.e eVar = new U0.e(6, i8, i7, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        eVar.f2520i = this.f3873h.getPackageName();
        eVar.f2523l = q6;
        if (set != null) {
            eVar.f2522k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            eVar.f2524m = new Account("<<default account>>", "com.google");
            if (fVar != null) {
                eVar.f2521j = ((D) fVar).f2506d;
            }
        }
        eVar.f2525n = f3863C;
        eVar.f2526o = p();
        try {
            synchronized (this.f3877l) {
                try {
                    s sVar = this.f3878m;
                    if (sVar != null) {
                        sVar.b(new v(this, this.f3864A.get()), eVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i9 = this.f3864A.get();
            u uVar = this.f3875j;
            uVar.sendMessage(uVar.obtainMessage(6, i9, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i10 = this.f3864A.get();
            x xVar = new x(this, 8, null, null);
            u uVar2 = this.f3875j;
            uVar2.sendMessage(uVar2.obtainMessage(1, i10, -1, xVar));
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i102 = this.f3864A.get();
            x xVar2 = new x(this, 8, null, null);
            u uVar22 = this.f3875j;
            uVar22.sendMessage(uVar22.obtainMessage(1, i102, -1, xVar2));
        }
    }

    public abstract IInterface o(IBinder iBinder);

    public c[] p() {
        return f3863C;
    }

    public abstract Bundle q();

    public final IInterface r() {
        IInterface iInterface;
        synchronized (this.f3876k) {
            try {
                if (this.f3883r == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f3880o;
                t.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String s();

    public abstract String t();

    public boolean u() {
        return e() >= 211700000;
    }

    public final void w(int i7, IInterface iInterface) {
        j jVar;
        if ((i7 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f3876k) {
            try {
                this.f3883r = i7;
                this.f3880o = iInterface;
                if (i7 == 1) {
                    w wVar = this.f3882q;
                    if (wVar != null) {
                        C c7 = this.f3874i;
                        String str = this.f3872g.f1946a;
                        t.f(str);
                        this.f3872g.getClass();
                        if (this.f3887v == null) {
                            this.f3873h.getClass();
                        }
                        c7.a(str, wVar, this.f3872g.f1947b);
                        this.f3882q = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    w wVar2 = this.f3882q;
                    if (wVar2 != null && (jVar = this.f3872g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + jVar.f1946a + " on com.google.android.gms");
                        C c8 = this.f3874i;
                        String str2 = this.f3872g.f1946a;
                        t.f(str2);
                        this.f3872g.getClass();
                        if (this.f3887v == null) {
                            this.f3873h.getClass();
                        }
                        c8.a(str2, wVar2, this.f3872g.f1947b);
                        this.f3864A.incrementAndGet();
                    }
                    w wVar3 = new w(this, this.f3864A.get());
                    this.f3882q = wVar3;
                    String t6 = t();
                    boolean u6 = u();
                    this.f3872g = new j(t6, u6);
                    if (u6 && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f3872g.f1946a)));
                    }
                    C c9 = this.f3874i;
                    String str3 = this.f3872g.f1946a;
                    t.f(str3);
                    this.f3872g.getClass();
                    String str4 = this.f3887v;
                    if (str4 == null) {
                        str4 = this.f3873h.getClass().getName();
                    }
                    if (!c9.b(new A(str3, this.f3872g.f1947b), wVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f3872g.f1946a + " on com.google.android.gms");
                        int i8 = this.f3864A.get();
                        y yVar = new y(this, 16);
                        u uVar = this.f3875j;
                        uVar.sendMessage(uVar.obtainMessage(7, i8, -1, yVar));
                    }
                } else if (i7 == 4) {
                    t.f(iInterface);
                    this.f3868c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
