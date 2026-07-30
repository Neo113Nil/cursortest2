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
import defpackage.b4;
import defpackage.b8;
import defpackage.bu1;
import defpackage.c50;
import defpackage.d50;
import defpackage.dd0;
import defpackage.e50;
import defpackage.es1;
import defpackage.f50;
import defpackage.fm;
import defpackage.fu1;
import defpackage.hu1;
import defpackage.it1;
import defpackage.jb;
import defpackage.lt1;
import defpackage.nq0;
import defpackage.nu1;
import defpackage.pt1;
import defpackage.r40;
import defpackage.ru1;
import defpackage.t60;
import defpackage.u2;
import defpackage.vx;
import defpackage.wu1;
import defpackage.xt1;
import defpackage.y90;
import defpackage.yu1;
import defpackage.zc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class a implements b8 {
    public static final vx[] x = new vx[0];
    public volatile String a;
    public u2 b;
    public final Context c;
    public final wu1 d;
    public final pt1 e;
    public final Object f;
    public final Object g;
    public lt1 h;
    public zc i;
    public IInterface j;
    public final ArrayList k;
    public bu1 l;
    public int m;
    public final nq0 n;
    public final nq0 o;
    public final int p;
    public final String q;
    public volatile String r;
    public fm s;
    public boolean t;
    public volatile nu1 u;
    public final AtomicInteger v;
    public final Set w;

    public a(Context context, Looper looper, int i, jb jbVar, e50 e50Var, f50 f50Var) {
        synchronized (wu1.g) {
            try {
                if (wu1.h == null) {
                    wu1.h = new wu1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wu1 wu1Var = wu1.h;
        Object obj = c50.c;
        y90.i(e50Var);
        y90.i(f50Var);
        nq0 nq0Var = new nq0(24, e50Var);
        nq0 nq0Var2 = new nq0(25, f50Var);
        String str = (String) jbVar.e;
        this.a = null;
        this.f = new Object();
        this.g = new Object();
        this.k = new ArrayList();
        this.m = 1;
        this.s = null;
        this.t = false;
        this.u = null;
        this.v = new AtomicInteger(0);
        y90.j(context, "Context must not be null");
        this.c = context;
        y90.j(looper, "Looper must not be null");
        y90.j(wu1Var, "Supervisor must not be null");
        this.d = wu1Var;
        this.e = new pt1(this, looper);
        this.p = i;
        this.n = nq0Var;
        this.o = nq0Var2;
        this.q = str;
        Set set = (Set) jbVar.d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                dd0.j("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(a aVar, int i, int i2, IInterface iInterface) {
        synchronized (aVar.f) {
            try {
                if (aVar.m != i) {
                    return false;
                }
                aVar.v(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b8
    public final boolean a() {
        boolean z;
        synchronized (this.f) {
            z = this.m == 4;
        }
        return z;
    }

    @Override // defpackage.b8
    public final Set b() {
        return k() ? this.w : Collections.EMPTY_SET;
    }

    @Override // defpackage.b8
    public final void c(String str) {
        this.a = str;
        n();
    }

    @Override // defpackage.b8
    public final void d(nq0 nq0Var) {
        ((es1) nq0Var.e).m.m.post(new b4(3, nq0Var));
    }

    @Override // defpackage.b8
    public final boolean f() {
        boolean z;
        synchronized (this.f) {
            int i = this.m;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.b8
    public final vx[] g() {
        nu1 nu1Var = this.u;
        if (nu1Var == null) {
            return null;
        }
        return nu1Var.e;
    }

    @Override // defpackage.b8
    public final void h() {
        if (!a() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // defpackage.b8
    public final void i(zc zcVar) {
        this.i = zcVar;
        v(2, null);
    }

    @Override // defpackage.b8
    public final String j() {
        return this.a;
    }

    @Override // defpackage.b8
    public boolean k() {
        return false;
    }

    @Override // defpackage.b8
    public final void l(t60 t60Var, Set set) {
        Bundle p = p();
        String str = this.r;
        int i = d50.a;
        Scope[] scopeArr = r40.s;
        Bundle bundle = new Bundle();
        int i2 = this.p;
        vx[] vxVarArr = r40.t;
        r40 r40Var = new r40(6, i2, i, null, null, scopeArr, bundle, null, vxVarArr, vxVarArr, true, 0, false, str);
        r40Var.h = this.c.getPackageName();
        r40Var.k = p;
        if (set != null) {
            r40Var.j = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            r40Var.l = new Account("<<default account>>", "com.google");
            if (t60Var != null) {
                r40Var.i = ((yu1) t60Var).b;
            }
        }
        r40Var.m = x;
        r40Var.n = o();
        try {
            try {
                synchronized (this.g) {
                    try {
                        lt1 lt1Var = this.h;
                        if (lt1Var != null) {
                            lt1Var.a(new xt1(this, this.v.get()), r40Var);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i3 = this.v.get();
                fu1 fu1Var = new fu1(this, 8, null, null);
                pt1 pt1Var = this.e;
                pt1Var.sendMessage(pt1Var.obtainMessage(1, i3, -1, fu1Var));
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.v.get();
            pt1 pt1Var2 = this.e;
            pt1Var2.sendMessage(pt1Var2.obtainMessage(6, i4, 3));
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    public abstract IInterface m(IBinder iBinder);

    public final void n() {
        this.v.incrementAndGet();
        synchronized (this.k) {
            try {
                int size = this.k.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.k;
                    if (i < size) {
                        it1 it1Var = (it1) arrayList.get(i);
                        synchronized (it1Var) {
                            it1Var.a = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.h = null;
        }
        v(1, null);
    }

    public vx[] o() {
        return x;
    }

    public abstract Bundle p();

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.m == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.j;
                y90.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return e() >= 211700000;
    }

    public final void v(int i, IInterface iInterface) {
        u2 u2Var;
        int i2 = 1;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f) {
            try {
                this.m = i;
                this.j = iInterface;
                if (i == 1) {
                    bu1 bu1Var = this.l;
                    if (bu1Var != null) {
                        wu1 wu1Var = this.d;
                        String str = (String) this.b.e;
                        y90.i(str);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        wu1Var.a(str, bu1Var, this.b.g);
                        this.l = null;
                    }
                } else if (i == 2 || i == 3) {
                    bu1 bu1Var2 = this.l;
                    if (bu1Var2 != null && (u2Var = this.b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) u2Var.e) + " on com.google.android.gms");
                        wu1 wu1Var2 = this.d;
                        String str2 = (String) this.b.e;
                        y90.i(str2);
                        this.b.getClass();
                        if (this.q == null) {
                            this.c.getClass();
                        }
                        wu1Var2.a(str2, bu1Var2, this.b.g);
                        this.v.incrementAndGet();
                    }
                    bu1 bu1Var3 = new bu1(this, this.v.get());
                    this.l = bu1Var3;
                    String s = s();
                    boolean t = t();
                    this.b = new u2(s, t, i2);
                    if (t && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.b.e)));
                    }
                    wu1 wu1Var3 = this.d;
                    String str3 = (String) this.b.e;
                    y90.i(str3);
                    this.b.getClass();
                    String str4 = this.q;
                    if (str4 == null) {
                        str4 = this.c.getClass().getName();
                    }
                    if (!wu1Var3.b(new ru1(str3, this.b.g), bu1Var3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.b.e) + " on com.google.android.gms");
                        int i3 = this.v.get();
                        hu1 hu1Var = new hu1(this, 16);
                        pt1 pt1Var = this.e;
                        pt1Var.sendMessage(pt1Var.obtainMessage(7, i3, -1, hu1Var));
                    }
                } else if (i == 4) {
                    y90.i(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
