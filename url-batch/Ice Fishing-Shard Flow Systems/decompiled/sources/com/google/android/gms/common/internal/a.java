package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import h0.C0464j;
import i.C0511M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import n.w1;
import q1.b;
import q1.d;
import q1.e;
import q1.f;
import r1.InterfaceC0844c;
import r1.k;
import r1.l;
import t1.C0904A;
import t1.C0905B;
import t1.C0906C;
import t1.C0908E;
import t1.C0911H;
import t1.C0912I;
import t1.C0918e;
import t1.C0921h;
import t1.InterfaceC0915b;
import t1.InterfaceC0919f;
import t1.s;
import t1.t;
import t1.u;
import t1.x;
import t1.y;
import t1.z;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC0844c {

    /* renamed from: D, reason: collision with root package name */
    public static final d[] f4373D = new d[0];

    /* renamed from: A, reason: collision with root package name */
    public volatile C0906C f4374A;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicInteger f4375B;

    /* renamed from: C, reason: collision with root package name */
    public final Set f4376C;

    /* renamed from: a, reason: collision with root package name */
    public int f4377a;

    /* renamed from: b, reason: collision with root package name */
    public long f4378b;

    /* renamed from: c, reason: collision with root package name */
    public long f4379c;

    /* renamed from: d, reason: collision with root package name */
    public int f4380d;

    /* renamed from: e, reason: collision with root package name */
    public long f4381e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f4382f;

    /* renamed from: g, reason: collision with root package name */
    public C0464j f4383g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f4384h;

    /* renamed from: i, reason: collision with root package name */
    public final C0911H f4385i;
    public final x j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4386k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4387l;

    /* renamed from: m, reason: collision with root package name */
    public t f4388m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0915b f4389n;

    /* renamed from: o, reason: collision with root package name */
    public IInterface f4390o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4391p;

    /* renamed from: q, reason: collision with root package name */
    public z f4392q;

    /* renamed from: r, reason: collision with root package name */
    public int f4393r;

    /* renamed from: s, reason: collision with root package name */
    public final C0921h f4394s;

    /* renamed from: t, reason: collision with root package name */
    public final C0921h f4395t;

    /* renamed from: u, reason: collision with root package name */
    public final int f4396u;

    /* renamed from: v, reason: collision with root package name */
    public final String f4397v;

    /* renamed from: w, reason: collision with root package name */
    public volatile String f4398w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0511M f4399x;

    /* renamed from: y, reason: collision with root package name */
    public b f4400y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4401z;

    public a(Context context, Looper looper, int i2, w1 w1Var, k kVar, l lVar) {
        synchronized (C0911H.f7913g) {
            try {
                if (C0911H.f7914h == null) {
                    C0911H.f7914h = new C0911H(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0911H c0911h = C0911H.f7914h;
        Object obj = e.f7322d;
        u.f(kVar);
        u.f(lVar);
        C0921h c0921h = new C0921h(kVar);
        C0921h c0921h2 = new C0921h(lVar);
        String str = (String) w1Var.f6945m;
        this.f4382f = null;
        this.f4386k = new Object();
        this.f4387l = new Object();
        this.f4391p = new ArrayList();
        this.f4393r = 1;
        this.f4400y = null;
        this.f4401z = false;
        this.f4374A = null;
        this.f4375B = new AtomicInteger(0);
        u.g(context, "Context must not be null");
        this.f4384h = context;
        u.g(looper, "Looper must not be null");
        u.g(c0911h, "Supervisor must not be null");
        this.f4385i = c0911h;
        this.j = new x(this, looper);
        this.f4396u = i2;
        this.f4394s = c0921h;
        this.f4395t = c0921h2;
        this.f4397v = str;
        Set set = (Set) w1Var.f6942e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4376C = set;
    }

    @Override // r1.InterfaceC0844c
    public boolean b() {
        return false;
    }

    public abstract IInterface c(IBinder iBinder);

    public final void d() {
        this.f4375B.incrementAndGet();
        ArrayList arrayList = this.f4391p;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    s sVar = (s) arrayList.get(i2);
                    synchronized (sVar) {
                        sVar.f7994a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4387l) {
            this.f4388m = null;
        }
        p(1, null);
    }

    public final void e(String str) {
        this.f4382f = str;
        d();
    }

    public d[] f() {
        return f4373D;
    }

    public Bundle g() {
        return new Bundle();
    }

    public final void h(InterfaceC0919f interfaceC0919f, Set set) {
        String attributionTag;
        String attributionTag2;
        Bundle g7 = g();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.f4398w;
        } else if (this.f4399x == null) {
            attributionTag2 = this.f4398w;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f4399x.f5381e;
            if (attributionSource == null) {
                attributionTag2 = this.f4398w;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.f4398w : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i2 = this.f4396u;
        int i5 = f.f7325a;
        Scope[] scopeArr = C0918e.f7931w;
        Bundle bundle = new Bundle();
        d[] dVarArr = C0918e.f7932x;
        C0918e c0918e = new C0918e(6, i2, i5, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0918e.f7936l = this.f4384h.getPackageName();
        c0918e.f7939o = g7;
        if (set != null) {
            c0918e.f7938n = (Scope[]) set.toArray(new Scope[0]);
        }
        if (b()) {
            c0918e.f7940p = new Account("<<default account>>", "com.google");
            if (interfaceC0919f != null) {
                c0918e.f7937m = ((C0912I) interfaceC0919f).f7922e;
            }
        }
        c0918e.f7941q = f4373D;
        c0918e.f7942r = f();
        if (this instanceof D1.b) {
            c0918e.f7945u = true;
        }
        try {
            synchronized (this.f4387l) {
                try {
                    t tVar = this.f4388m;
                    if (tVar != null) {
                        tVar.b(new y(this, this.f4375B.get()), c0918e);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            int i7 = this.f4375B.get();
            x xVar = this.j;
            xVar.sendMessage(xVar.obtainMessage(6, i7, 3));
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i8 = this.f4375B.get();
            C0904A c0904a = new C0904A(this, 8, null, null);
            x xVar2 = this.j;
            xVar2.sendMessage(xVar2.obtainMessage(1, i8, -1, c0904a));
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i82 = this.f4375B.get();
            C0904A c0904a2 = new C0904A(this, 8, null, null);
            x xVar22 = this.j;
            xVar22.sendMessage(xVar22.obtainMessage(1, i82, -1, c0904a2));
        }
    }

    public final IInterface i() {
        IInterface iInterface;
        synchronized (this.f4386k) {
            try {
                if (this.f4393r == 5) {
                    throw new DeadObjectException();
                }
                if (!m()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f4390o;
                u.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String j();

    public abstract String k();

    public boolean l() {
        return a() >= 211700000;
    }

    public final boolean m() {
        boolean z7;
        synchronized (this.f4386k) {
            z7 = this.f4393r == 4;
        }
        return z7;
    }

    public final boolean n() {
        boolean z7;
        synchronized (this.f4386k) {
            int i2 = this.f4393r;
            z7 = true;
            if (i2 != 2 && i2 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public final /* synthetic */ boolean o(int i2, int i5, IInterface iInterface) {
        synchronized (this.f4386k) {
            try {
                if (this.f4393r != i2) {
                    return false;
                }
                p(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(int i2, IInterface iInterface) {
        C0464j c0464j;
        if ((i2 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f4386k) {
            try {
                this.f4393r = i2;
                this.f4390o = iInterface;
                Bundle bundle = null;
                if (i2 == 1) {
                    z zVar = this.f4392q;
                    if (zVar != null) {
                        C0911H c0911h = this.f4385i;
                        String str = this.f4383g.f5108b;
                        u.f(str);
                        this.f4383g.getClass();
                        if (this.f4397v == null) {
                            this.f4384h.getClass();
                        }
                        c0911h.b(str, zVar, this.f4383g.f5109c);
                        this.f4392q = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    z zVar2 = this.f4392q;
                    if (zVar2 != null && (c0464j = this.f4383g) != null) {
                        String str2 = c0464j.f5108b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C0911H c0911h2 = this.f4385i;
                        String str3 = this.f4383g.f5108b;
                        u.f(str3);
                        this.f4383g.getClass();
                        if (this.f4397v == null) {
                            this.f4384h.getClass();
                        }
                        c0911h2.b(str3, zVar2, this.f4383g.f5109c);
                        this.f4375B.incrementAndGet();
                    }
                    z zVar3 = new z(this, this.f4375B.get());
                    this.f4392q = zVar3;
                    String k7 = k();
                    boolean l7 = l();
                    this.f4383g = new C0464j(2, k7, l7);
                    if (l7 && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f4383g.f5108b)));
                    }
                    C0911H c0911h3 = this.f4385i;
                    String str4 = this.f4383g.f5108b;
                    u.f(str4);
                    this.f4383g.getClass();
                    String str5 = this.f4397v;
                    if (str5 == null) {
                        str5 = this.f4384h.getClass().getName();
                    }
                    b a7 = c0911h3.a(new C0908E(str4, this.f4383g.f5109c), zVar3, str5);
                    if (!a7.b()) {
                        String str6 = this.f4383g.f5108b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i5 = a7.f7311e;
                        if (i5 == -1) {
                            i5 = 16;
                        }
                        if (a7.f7312i != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", a7.f7312i);
                        }
                        int i7 = this.f4375B.get();
                        C0905B c0905b = new C0905B(this, i5, bundle);
                        x xVar = this.j;
                        xVar.sendMessage(xVar.obtainMessage(7, i7, -1, c0905b));
                    }
                } else if (i2 == 4) {
                    u.f(iInterface);
                    this.f4379c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
