package c7;

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
import com.google.android.gms.internal.measurement.p5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {
    public static final z6.d[] D = new z6.d[0];

    /* renamed from: a, reason: collision with root package name */
    public int f1878a;

    /* renamed from: b, reason: collision with root package name */
    public long f1879b;

    /* renamed from: c, reason: collision with root package name */
    public long f1880c;

    /* renamed from: d, reason: collision with root package name */
    public int f1881d;

    /* renamed from: e, reason: collision with root package name */
    public long f1882e;
    public p0 g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f1884h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f1885i;
    public final z6.g j;

    /* renamed from: k, reason: collision with root package name */
    public final f0 f1886k;

    /* renamed from: n, reason: collision with root package name */
    public y f1889n;

    /* renamed from: o, reason: collision with root package name */
    public d f1890o;

    /* renamed from: p, reason: collision with root package name */
    public IInterface f1891p;

    /* renamed from: r, reason: collision with root package name */
    public h0 f1893r;

    /* renamed from: t, reason: collision with root package name */
    public final b f1895t;

    /* renamed from: u, reason: collision with root package name */
    public final c f1896u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1897v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1898w;

    /* renamed from: x, reason: collision with root package name */
    public volatile String f1899x;

    /* renamed from: y, reason: collision with root package name */
    public volatile d9.c f1900y;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f1883f = null;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1887l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final Object f1888m = new Object();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1892q = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public int f1894s = 1;

    /* renamed from: z, reason: collision with root package name */
    public z6.b f1901z = null;
    public boolean A = false;
    public volatile k0 B = null;
    public final AtomicInteger C = new AtomicInteger(0);

    public f(Context context, Looper looper, o0 o0Var, z6.g gVar, int i3, b bVar, c cVar, String str) {
        c0.h(context, "Context must not be null");
        this.f1884h = context;
        c0.h(looper, "Looper must not be null");
        c0.h(o0Var, "Supervisor must not be null");
        this.f1885i = o0Var;
        c0.h(gVar, "API availability must not be null");
        this.j = gVar;
        this.f1886k = new f0(this, looper);
        this.f1897v = i3;
        this.f1895t = bVar;
        this.f1896u = cVar;
        this.f1898w = str;
    }

    public final void a() {
        int b10 = this.j.b(this.f1884h, j());
        if (b10 == 0) {
            b(new e(this));
            return;
        }
        u(1, null);
        this.f1890o = new e(this);
        int i3 = this.C.get();
        f0 f0Var = this.f1886k;
        f0Var.sendMessage(f0Var.obtainMessage(3, i3, b10, null));
    }

    public final void b(d dVar) {
        c0.h(dVar, "Connection progress callbacks cannot be null.");
        this.f1890o = dVar;
        u(2, null);
    }

    public abstract IInterface c(IBinder iBinder);

    public final void d() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.f1892q;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    x xVar = (x) arrayList.get(i3);
                    synchronized (xVar) {
                        xVar.f1999a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f1888m) {
            this.f1889n = null;
        }
        u(1, null);
    }

    public final void e(String str) {
        this.f1883f = str;
        d();
    }

    public Account f() {
        return null;
    }

    public z6.d[] g() {
        return D;
    }

    public Executor h() {
        return null;
    }

    public Bundle i() {
        return new Bundle();
    }

    public abstract int j();

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(j jVar, Set set) {
        String attributionTag;
        String attributionTag2;
        Bundle i3 = i();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.f1899x;
        } else if (this.f1900y == null) {
            attributionTag2 = this.f1899x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f1900y.f3701e;
            if (attributionSource == null) {
                attributionTag2 = this.f1899x;
            } else {
                attributionTag = attributionSource.getAttributionTag();
                attributionTag2 = attributionTag == null ? this.f1899x : attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag2;
        int i10 = this.f1897v;
        int i11 = z6.g.f10881a;
        Scope[] scopeArr = h.C;
        Bundle bundle = new Bundle();
        z6.d[] dVarArr = h.D;
        h hVar = new h(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        hVar.f1914r = this.f1884h.getPackageName();
        hVar.f1917u = i3;
        if (set != null) {
            hVar.f1916t = (Scope[]) set.toArray(new Scope[0]);
        }
        if (s()) {
            Account f3 = f();
            if (f3 == null) {
                f3 = new Account("<<default account>>", "com.google");
            }
            hVar.f1918v = f3;
            if (jVar != 0) {
                hVar.f1915s = ((p5) jVar).f2665e;
            }
        }
        hVar.f1919w = D;
        hVar.f1920x = g();
        if (this instanceof n7.b) {
            hVar.A = true;
        }
        try {
            synchronized (this.f1888m) {
                try {
                    y yVar = this.f1889n;
                    if (yVar != null) {
                        yVar.C(new g0(this, this.C.get()), hVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i12 = this.C.get();
            f0 f0Var = this.f1886k;
            f0Var.sendMessage(f0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.C.get();
            i0 i0Var = new i0(this, 8, null, null);
            f0 f0Var2 = this.f1886k;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i13, -1, i0Var));
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i132 = this.C.get();
            i0 i0Var2 = new i0(this, 8, null, null);
            f0 f0Var22 = this.f1886k;
            f0Var22.sendMessage(f0Var22.obtainMessage(1, i132, -1, i0Var2));
        }
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.f1887l) {
            try {
                if (this.f1894s == 5) {
                    throw new DeadObjectException();
                }
                if (!q()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f1891p;
                c0.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public boolean p() {
        return j() >= 211700000;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f1887l) {
            z10 = this.f1894s == 4;
        }
        return z10;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f1887l) {
            int i3 = this.f1894s;
            z10 = true;
            if (i3 != 2 && i3 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean s() {
        return false;
    }

    public final /* synthetic */ boolean t(int i3, int i10, IInterface iInterface) {
        synchronized (this.f1887l) {
            try {
                if (this.f1894s != i3) {
                    return false;
                }
                u(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i3, IInterface iInterface) {
        p0 p0Var;
        c0.b((i3 == 4) == (iInterface != null));
        synchronized (this.f1887l) {
            try {
                this.f1894s = i3;
                this.f1891p = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    h0 h0Var = this.f1893r;
                    if (h0Var != null) {
                        o0 o0Var = this.f1885i;
                        String str = this.g.f1971b;
                        c0.g(str);
                        this.g.getClass();
                        if (this.f1898w == null) {
                            this.f1884h.getClass();
                        }
                        o0Var.c(str, h0Var, this.g.f1972c);
                        this.f1893r = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    h0 h0Var2 = this.f1893r;
                    if (h0Var2 != null && (p0Var = this.g) != null) {
                        String str2 = p0Var.f1971b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        o0 o0Var2 = this.f1885i;
                        String str3 = this.g.f1971b;
                        c0.g(str3);
                        this.g.getClass();
                        if (this.f1898w == null) {
                            this.f1884h.getClass();
                        }
                        o0Var2.c(str3, h0Var2, this.g.f1972c);
                        this.C.incrementAndGet();
                    }
                    h0 h0Var3 = new h0(this, this.C.get());
                    this.f1893r = h0Var3;
                    String o6 = o();
                    boolean p4 = p();
                    this.g = new p0(o6, p4, 0);
                    if (p4 && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.f1971b)));
                    }
                    o0 o0Var3 = this.f1885i;
                    String str4 = this.g.f1971b;
                    c0.g(str4);
                    this.g.getClass();
                    String str5 = this.f1898w;
                    if (str5 == null) {
                        str5 = this.f1884h.getClass().getName();
                    }
                    z6.b b10 = o0Var3.b(new l0(str4, this.g.f1972c), h0Var3, str5, h());
                    if (!b10.c()) {
                        String str6 = this.g.f1971b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str6);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i10 = b10.f10867e;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (b10.f10868i != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b10.f10868i);
                        }
                        int i11 = this.C.get();
                        j0 j0Var = new j0(this, i10, bundle);
                        f0 f0Var = this.f1886k;
                        f0Var.sendMessage(f0Var.obtainMessage(7, i11, -1, j0Var));
                    }
                } else if (i3 == 4) {
                    c0.g(iInterface);
                    this.f1880c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
