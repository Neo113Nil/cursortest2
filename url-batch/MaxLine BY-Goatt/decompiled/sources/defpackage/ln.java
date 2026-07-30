package defpackage;

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
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ln {
    public static final mk0[] J = new mk0[0];
    public final in A;
    public final jn B;
    public final int C;
    public final String D;
    public volatile String E;
    public mb2 n;
    public final Context o;
    public final rs3 p;
    public final tv0 q;
    public final yc3 r;
    public mb3 u;
    public kn v;
    public IInterface w;
    public lf3 y;
    public volatile String m = null;
    public final Object s = new Object();
    public final Object t = new Object();
    public final ArrayList x = new ArrayList();
    public int z = 1;
    public c10 F = null;
    public boolean G = false;
    public volatile nl3 H = null;
    public final AtomicInteger I = new AtomicInteger(0);

    public ln(Context context, Looper looper, rs3 rs3Var, tv0 tv0Var, int i, in inVar, jn jnVar, String str) {
        ll3.w(context, "Context must not be null");
        this.o = context;
        ll3.w(looper, "Looper must not be null");
        ll3.w(rs3Var, "Supervisor must not be null");
        this.p = rs3Var;
        ll3.w(tv0Var, "API availability must not be null");
        this.q = tv0Var;
        this.r = new yc3(this, looper);
        this.C = i;
        this.A = inVar;
        this.B = jnVar;
        this.D = str;
    }

    public static /* bridge */ /* synthetic */ boolean x(ln lnVar, int i, int i2, IInterface iInterface) {
        synchronized (lnVar.s) {
            try {
                if (lnVar.z != i) {
                    return false;
                }
                lnVar.y(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.s) {
            z = this.z == 4;
        }
        return z;
    }

    public final void c(String str) {
        this.m = str;
        o();
    }

    public final void d(ot2 ot2Var) {
        ((aa3) ot2Var.n).r.y.post(new r7(12, ot2Var));
    }

    public abstract int e();

    public final boolean f() {
        boolean z;
        synchronized (this.s) {
            int i = this.z;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final mk0[] g() {
        nl3 nl3Var = this.H;
        if (nl3Var == null) {
            return null;
        }
        return nl3Var.n;
    }

    public final void h() {
        if (!a() || this.n == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void i(kn knVar) {
        this.v = knVar;
        y(2, null);
    }

    public final String j() {
        return this.m;
    }

    public boolean k() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(nz0 nz0Var, Set set) {
        Bundle r = r();
        String str = this.E;
        int i = this.C;
        int i2 = tv0.a;
        Scope[] scopeArr = bv0.A;
        Bundle bundle = new Bundle();
        mk0[] mk0VarArr = bv0.B;
        bv0 bv0Var = new bv0(6, i, i2, null, null, scopeArr, bundle, null, mk0VarArr, mk0VarArr, true, 0, false, str);
        bv0Var.p = this.o.getPackageName();
        bv0Var.s = r;
        if (set != null) {
            bv0Var.r = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            Account p = p();
            if (p == null) {
                p = new Account("<<default account>>", "com.google");
            }
            bv0Var.t = p;
            if (nz0Var != 0) {
                bv0Var.q = ((w93) nz0Var).h;
            }
        }
        bv0Var.u = J;
        bv0Var.v = q();
        try {
            synchronized (this.t) {
                try {
                    mb3 mb3Var = this.u;
                    if (mb3Var != null) {
                        mb3Var.b(new pe3(this, this.I.get()), bv0Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.I.get();
            yc3 yc3Var = this.r;
            yc3Var.sendMessage(yc3Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.I.get();
            zf3 zf3Var = new zf3(this, 8, null, null);
            yc3 yc3Var2 = this.r;
            yc3Var2.sendMessage(yc3Var2.obtainMessage(1, i4, -1, zf3Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.I.get();
            zf3 zf3Var2 = new zf3(this, 8, null, null);
            yc3 yc3Var22 = this.r;
            yc3Var22.sendMessage(yc3Var22.obtainMessage(1, i42, -1, zf3Var2));
        }
    }

    public final void m() {
        int b = this.q.b(this.o, e());
        int i = 10;
        if (b == 0) {
            i(new ar0(i, this));
            return;
        }
        y(1, null);
        this.v = new ar0(i, this);
        int i2 = this.I.get();
        yc3 yc3Var = this.r;
        yc3Var.sendMessage(yc3Var.obtainMessage(3, i2, b, null));
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.I.incrementAndGet();
        synchronized (this.x) {
            try {
                int size = this.x.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.x;
                    if (i < size) {
                        eb3 eb3Var = (eb3) arrayList.get(i);
                        synchronized (eb3Var) {
                            eb3Var.a = null;
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
        synchronized (this.t) {
            this.u = null;
        }
        y(1, null);
    }

    public Account p() {
        return null;
    }

    public mk0[] q() {
        return J;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.s) {
            try {
                if (this.z == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.w;
                ll3.w(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return e() >= 211700000;
    }

    public final void y(int i, IInterface iInterface) {
        mb2 mb2Var;
        ll3.p((i == 4) == (iInterface != null));
        synchronized (this.s) {
            try {
                this.z = i;
                this.w = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    lf3 lf3Var = this.y;
                    if (lf3Var != null) {
                        rs3 rs3Var = this.p;
                        String str = this.n.a;
                        ll3.v(str);
                        this.n.getClass();
                        if (this.D == null) {
                            this.o.getClass();
                        }
                        rs3Var.c(str, lf3Var, this.n.b);
                        this.y = null;
                    }
                } else if (i == 2 || i == 3) {
                    lf3 lf3Var2 = this.y;
                    if (lf3Var2 != null && (mb2Var = this.n) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + mb2Var.a + " on com.google.android.gms");
                        rs3 rs3Var2 = this.p;
                        String str2 = this.n.a;
                        ll3.v(str2);
                        this.n.getClass();
                        if (this.D == null) {
                            this.o.getClass();
                        }
                        rs3Var2.c(str2, lf3Var2, this.n.b);
                        this.I.incrementAndGet();
                    }
                    lf3 lf3Var3 = new lf3(this, this.I.get());
                    this.y = lf3Var3;
                    String v = v();
                    boolean w = w();
                    this.n = new mb2(v, w);
                    if (w && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.n.a)));
                    }
                    rs3 rs3Var3 = this.p;
                    String str3 = this.n.a;
                    ll3.v(str3);
                    this.n.getClass();
                    String str4 = this.D;
                    if (str4 == null) {
                        str4 = this.o.getClass().getName();
                    }
                    c10 b = rs3Var3.b(new bp3(str3, this.n.b), lf3Var3, str4, null);
                    if (!(b.n == 0)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.n.a + " on com.google.android.gms");
                        int i2 = b.n;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b.o != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b.o);
                        }
                        int i3 = this.I.get();
                        wg3 wg3Var = new wg3(this, i2, bundle);
                        yc3 yc3Var = this.r;
                        yc3Var.sendMessage(yc3Var.obtainMessage(7, i3, -1, wg3Var));
                    }
                } else if (i == 4) {
                    ll3.v(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
