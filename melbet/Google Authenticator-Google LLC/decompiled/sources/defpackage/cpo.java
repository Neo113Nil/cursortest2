package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cpo {
    private static final cli[] t = new cli[0];
    cqo a;
    public final Context b;
    final Handler c;
    protected cpj f;
    public final int i;
    public volatile String j;
    public volatile csq k;
    public cqu q;
    public final kee r;
    public final kee s;
    private final cqj v;
    private IInterface w;
    private cpk x;
    private final String y;
    private volatile String u = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public int h = 1;
    public clg l = null;
    public boolean m = false;
    public volatile cpv n = null;
    protected final AtomicInteger o = new AtomicInteger(0);
    public volatile int p = -1;

    protected cpo(Context context, Looper looper, cqj cqjVar, clm clmVar, int i, kee keeVar, kee keeVar2, String str) {
        oy.au(context, "Context must not be null");
        this.b = context;
        oy.au(looper, "Looper must not be null");
        oy.au(cqjVar, "Supervisor must not be null");
        this.v = cqjVar;
        oy.au(clmVar, "API availability must not be null");
        this.c = new cph(this, looper);
        this.i = i;
        this.s = keeVar;
        this.r = keeVar2;
        this.y = str;
        boolean z = cqjVar.f;
    }

    protected final void A(int i, Bundle bundle, int i2) {
        cpn cpnVar = new cpn(this, i, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, cpnVar));
    }

    public final boolean B() {
        return this.n != null;
    }

    public boolean C() {
        return false;
    }

    public boolean D() {
        return true;
    }

    public cli[] E() {
        throw null;
    }

    public final boolean F(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.h != i) {
                return false;
            }
            H(i2, iInterface);
            return true;
        }
    }

    protected final void G() {
        if (this.y == null) {
            this.b.getClass().getName();
        }
    }

    public final void H(int i, IInterface iInterface) {
        cqo cqoVar;
        oy.al((i == 4) == (iInterface != null));
        synchronized (this.d) {
            this.h = i;
            this.w = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                cpk cpkVar = this.x;
                if (cpkVar != null) {
                    cqj cqjVar = this.v;
                    cqo cqoVar2 = this.a;
                    String str = cqoVar2.a;
                    String str2 = cqoVar2.b;
                    int i2 = cqoVar2.c;
                    G();
                    cqjVar.d(new cqi(str, this.a.d), cpkVar);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                cpk cpkVar2 = this.x;
                if (cpkVar2 != null && (cqoVar = this.a) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + cqoVar.a + " on " + cqoVar.b);
                    cqj cqjVar2 = this.v;
                    cqo cqoVar3 = this.a;
                    String str3 = cqoVar3.a;
                    String str4 = cqoVar3.b;
                    int i3 = cqoVar3.c;
                    G();
                    cqjVar2.d(new cqi(str3, this.a.d), cpkVar2);
                    this.o.incrementAndGet();
                }
                AtomicInteger atomicInteger = this.o;
                cpk cpkVar3 = new cpk(this, atomicInteger.get());
                this.x = cpkVar3;
                cqo cqoVar4 = new cqo(d(), f());
                this.a = cqoVar4;
                if (cqoVar4.d && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(cqoVar4.a));
                }
                cqj cqjVar3 = this.v;
                String str5 = cqoVar4.a;
                String str6 = cqoVar4.b;
                int i4 = cqoVar4.c;
                G();
                clg e = cqjVar3.e(new cqi(str5, this.a.d), cpkVar3, w());
                if (!e.c()) {
                    cqo cqoVar5 = this.a;
                    Log.w("GmsClient", "unable to connect to service: " + cqoVar5.a + " on " + cqoVar5.b);
                    int i5 = e.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    PendingIntent pendingIntent = e.d;
                    if (pendingIntent != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", pendingIntent);
                    }
                    A(i5, bundle, atomicInteger.get());
                }
            } else if (i == 4) {
                oy.at(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public boolean e() {
        return false;
    }

    protected boolean f() {
        return a() >= 211700000;
    }

    public cli[] g() {
        return t;
    }

    public final String h() {
        cqo cqoVar;
        if (!m() || (cqoVar = this.a) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return cqoVar.b;
    }

    public final String i() {
        return this.u;
    }

    public final void k(cpj cpjVar) {
        this.f = cpjVar;
        H(2, null);
    }

    public final void l(String str) {
        this.u = str;
        y();
    }

    public final boolean m() {
        boolean z;
        synchronized (this.d) {
            z = this.h == 4;
        }
        return z;
    }

    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.h;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean o() {
        return false;
    }

    public final cli[] p() {
        cpv cpvVar = this.n;
        if (cpvVar == null) {
            return null;
        }
        return cpvVar.b;
    }

    public final void r(cqp cqpVar, Set set) {
        AttributionSource attributionSource;
        String attributionTag;
        String attributionTag2;
        Bundle u = u();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag2 = this.j;
        } else if (this.k == null || (attributionSource = this.k.a) == null) {
            attributionTag2 = this.j;
        } else {
            attributionTag = attributionSource.getAttributionTag();
            attributionTag2 = attributionTag == null ? this.j : attributionSource.getAttributionTag();
        }
        String str = attributionTag2;
        int i = this.i;
        int i2 = clm.c;
        Scope[] scopeArr = cqb.a;
        Bundle bundle = new Bundle();
        cli[] cliVarArr = cqb.b;
        cqb cqbVar = new cqb(6, i, i2, null, null, scopeArr, bundle, null, cliVarArr, cliVarArr, true, 0, false, str);
        cqbVar.f = this.b.getPackageName();
        cqbVar.i = u;
        if (set != null) {
            cqbVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account t2 = t();
            if (t2 == null) {
                t2 = new Account("<<default account>>", "com.google");
            }
            cqbVar.j = t2;
            if (cqpVar != null) {
                cqbVar.g = cqpVar.a;
            }
        } else if (C()) {
            cqbVar.j = t();
        }
        cqbVar.k = E();
        cqbVar.l = g();
        if (e()) {
            cqbVar.o = true;
        }
        try {
            synchronized (this.e) {
                cqu cquVar = this.q;
                if (cquVar != null) {
                    cqt cqtVar = new cqt(this, this.o.get());
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(cqtVar);
                        obtain.writeInt(1);
                        cqc.a(cqbVar, obtain, 0);
                        cquVar.a.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(6, this.o.get(), 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.o.get());
        }
    }

    public final void s(kee keeVar) {
        ((coc) keeVar.a).k.o.post(new ath(keeVar, 6, null));
    }

    public Account t() {
        throw null;
    }

    protected Bundle u() {
        return new Bundle();
    }

    public final IInterface v() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.h == 5) {
                throw new DeadObjectException();
            }
            x();
            iInterface = this.w;
            oy.au(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected Executor w() {
        throw null;
    }

    protected final void x() {
        if (!m()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void y() {
        this.o.incrementAndGet();
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cpi) arrayList.get(i)).d();
            }
            arrayList.clear();
        }
        synchronized (this.e) {
            this.q = null;
        }
        H(1, null);
    }

    protected void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        cpm cpmVar = new cpm(this, i, iBinder, bundle);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, cpmVar));
    }

    public final void q() {
    }
}
