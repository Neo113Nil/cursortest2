package com.google.android.gms.common.internal;

import X.j;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
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
import l.q0;
import l1.b;
import l1.d;
import l1.f;
import l1.g;
import m1.InterfaceC1276c;
import m1.i;
import n1.C1300D;
import n2.AbstractC1341c;
import o1.C1356A;
import o1.C1358C;
import o1.C1361F;
import o1.C1362G;
import o1.C1368f;
import o1.C1371i;
import o1.InterfaceC1364b;
import o1.InterfaceC1369g;
import o1.r;
import o1.t;
import o1.u;
import o1.v;
import o1.w;
import o1.x;
import o1.y;
import o1.z;

/* loaded from: classes.dex */
public abstract class a implements InterfaceC1276c {

    /* renamed from: C, reason: collision with root package name */
    public static final d[] f4990C = new d[0];

    /* renamed from: A, reason: collision with root package name */
    public final AtomicInteger f4991A;

    /* renamed from: B, reason: collision with root package name */
    public final Set f4992B;

    /* renamed from: a, reason: collision with root package name */
    public int f4993a;

    /* renamed from: b, reason: collision with root package name */
    public long f4994b;

    /* renamed from: c, reason: collision with root package name */
    public long f4995c;

    /* renamed from: d, reason: collision with root package name */
    public int f4996d;

    /* renamed from: e, reason: collision with root package name */
    public long f4997e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f4998f;

    /* renamed from: g, reason: collision with root package name */
    public j f4999g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f5000h;

    /* renamed from: i, reason: collision with root package name */
    public final C1361F f5001i;

    /* renamed from: j, reason: collision with root package name */
    public final v f5002j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5003k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5004l;

    /* renamed from: m, reason: collision with root package name */
    public t f5005m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC1364b f5006n;

    /* renamed from: o, reason: collision with root package name */
    public IInterface f5007o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f5008p;

    /* renamed from: q, reason: collision with root package name */
    public x f5009q;

    /* renamed from: r, reason: collision with root package name */
    public int f5010r;

    /* renamed from: s, reason: collision with root package name */
    public final C1371i f5011s;

    /* renamed from: t, reason: collision with root package name */
    public final C1371i f5012t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5013u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5014v;

    /* renamed from: w, reason: collision with root package name */
    public volatile String f5015w;

    /* renamed from: x, reason: collision with root package name */
    public b f5016x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5017y;
    public volatile C1356A z;

    public a(Context context, Looper looper, int i2, q0 q0Var, i iVar, m1.j jVar) {
        synchronized (C1361F.f11515g) {
            try {
                if (C1361F.f11516h == null) {
                    C1361F.f11516h = new C1361F(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1361F c1361f = C1361F.f11516h;
        Object obj = f.f11009c;
        u.g(iVar);
        u.g(jVar);
        C1371i c1371i = new C1371i(iVar);
        C1371i c1371i2 = new C1371i(jVar);
        String str = (String) q0Var.f10945e;
        this.f4998f = null;
        this.f5003k = new Object();
        this.f5004l = new Object();
        this.f5008p = new ArrayList();
        this.f5010r = 1;
        this.f5016x = null;
        this.f5017y = false;
        this.z = null;
        this.f4991A = new AtomicInteger(0);
        u.h(context, "Context must not be null");
        this.f5000h = context;
        u.h(looper, "Looper must not be null");
        u.h(c1361f, "Supervisor must not be null");
        this.f5001i = c1361f;
        this.f5002j = new v(this, looper);
        this.f5013u = i2;
        this.f5011s = c1371i;
        this.f5012t = c1371i2;
        this.f5014v = str;
        Set set = (Set) q0Var.f10942b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f4992B = set;
    }

    public static /* bridge */ /* synthetic */ boolean y(a aVar, int i2, int i3, IInterface iInterface) {
        synchronized (aVar.f5003k) {
            try {
                if (aVar.f5010r != i2) {
                    return false;
                }
                aVar.z(i3, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // m1.InterfaceC1276c
    public final boolean a() {
        boolean z;
        synchronized (this.f5003k) {
            z = this.f5010r == 4;
        }
        return z;
    }

    @Override // m1.InterfaceC1276c
    public final Set b() {
        return n() ? this.f4992B : Collections.emptySet();
    }

    @Override // m1.InterfaceC1276c
    public final void c(String str) {
        this.f4998f = str;
        l();
    }

    @Override // m1.InterfaceC1276c
    public final void d(InterfaceC1364b interfaceC1364b) {
        u.h(interfaceC1364b, "Connection progress callbacks cannot be null.");
        this.f5006n = interfaceC1364b;
        z(2, null);
    }

    @Override // m1.InterfaceC1276c
    public final void e(V0.j jVar) {
        ((C1300D) jVar.f3212b).f11305p.f11383m.post(new B.a(19, jVar));
    }

    @Override // m1.InterfaceC1276c
    public final boolean g() {
        boolean z;
        synchronized (this.f5003k) {
            int i2 = this.f5010r;
            z = true;
            if (i2 != 2 && i2 != 3) {
                z = false;
            }
        }
        return z;
    }

    @Override // m1.InterfaceC1276c
    public final void h(String str, PrintWriter printWriter) {
        int i2;
        IInterface iInterface;
        t tVar;
        synchronized (this.f5003k) {
            i2 = this.f5010r;
            iInterface = this.f5007o;
        }
        synchronized (this.f5004l) {
            tVar = this.f5005m;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) u()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (tVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(tVar.f11600a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f4995c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j2 = this.f4995c;
            append.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.f4994b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i3 = this.f4993a;
            if (i3 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i3 != 3) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j6 = this.f4994b;
            append2.println(j6 + " " + simpleDateFormat.format(new Date(j6)));
        }
        if (this.f4997e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC1341c.q(this.f4996d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j7 = this.f4997e;
            append3.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
    }

    @Override // m1.InterfaceC1276c
    public final d[] i() {
        C1356A c1356a = this.z;
        if (c1356a == null) {
            return null;
        }
        return c1356a.f11499b;
    }

    @Override // m1.InterfaceC1276c
    public final void j() {
        if (!a() || this.f4999g == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // m1.InterfaceC1276c
    public final String k() {
        return this.f4998f;
    }

    @Override // m1.InterfaceC1276c
    public void l() {
        this.f4991A.incrementAndGet();
        synchronized (this.f5008p) {
            try {
                int size = this.f5008p.size();
                for (int i2 = 0; i2 < size; i2++) {
                    r rVar = (r) this.f5008p.get(i2);
                    synchronized (rVar) {
                        rVar.f11594a = null;
                    }
                }
                this.f5008p.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f5004l) {
            this.f5005m = null;
        }
        z(1, null);
    }

    @Override // m1.InterfaceC1276c
    public final Intent m() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override // m1.InterfaceC1276c
    public boolean n() {
        return false;
    }

    @Override // m1.InterfaceC1276c
    public final void o(InterfaceC1369g interfaceC1369g, Set set) {
        Bundle s2 = s();
        String str = this.f5015w;
        int i2 = g.f11011a;
        Scope[] scopeArr = C1368f.f11535o;
        Bundle bundle = new Bundle();
        int i3 = this.f5013u;
        d[] dVarArr = C1368f.f11536p;
        C1368f c1368f = new C1368f(6, i3, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c1368f.f11540d = this.f5000h.getPackageName();
        c1368f.f11543g = s2;
        if (set != null) {
            c1368f.f11542f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (n()) {
            c1368f.f11544h = new Account("<<default account>>", "com.google");
            if (interfaceC1369g != null) {
                c1368f.f11541e = ((C1362G) interfaceC1369g).f11524a;
            }
        }
        c1368f.f11545i = f4990C;
        c1368f.f11546j = r();
        if (x()) {
            c1368f.f11549m = true;
        }
        try {
            synchronized (this.f5004l) {
                try {
                    t tVar = this.f5005m;
                    if (tVar != null) {
                        tVar.b(new w(this, this.f4991A.get()), c1368f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i6 = this.f4991A.get();
            v vVar = this.f5002j;
            vVar.sendMessage(vVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f4991A.get();
            y yVar = new y(this, 8, null, null);
            v vVar2 = this.f5002j;
            vVar2.sendMessage(vVar2.obtainMessage(1, i7, -1, yVar));
        } catch (SecurityException e7) {
            throw e7;
        } catch (RuntimeException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f4991A.get();
            y yVar2 = new y(this, 8, null, null);
            v vVar22 = this.f5002j;
            vVar22.sendMessage(vVar22.obtainMessage(1, i72, -1, yVar2));
        }
    }

    public final void p() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface q(IBinder iBinder);

    public d[] r() {
        return f4990C;
    }

    public Bundle s() {
        return new Bundle();
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f5003k) {
            try {
                if (this.f5010r == 5) {
                    throw new DeadObjectException();
                }
                p();
                iInterface = this.f5007o;
                u.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return f() >= 211700000;
    }

    public boolean x() {
        return this instanceof x1.b;
    }

    public final void z(int i2, IInterface iInterface) {
        j jVar;
        if ((i2 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f5003k) {
            try {
                this.f5010r = i2;
                this.f5007o = iInterface;
                if (i2 == 1) {
                    x xVar = this.f5009q;
                    if (xVar != null) {
                        C1361F c1361f = this.f5001i;
                        String str = this.f4999g.f3491a;
                        u.g(str);
                        this.f4999g.getClass();
                        if (this.f5014v == null) {
                            this.f5000h.getClass();
                        }
                        c1361f.a(str, xVar, this.f4999g.f3492b);
                        this.f5009q = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    x xVar2 = this.f5009q;
                    if (xVar2 != null && (jVar = this.f4999g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + jVar.f3491a + " on com.google.android.gms");
                        C1361F c1361f2 = this.f5001i;
                        String str2 = this.f4999g.f3491a;
                        u.g(str2);
                        this.f4999g.getClass();
                        if (this.f5014v == null) {
                            this.f5000h.getClass();
                        }
                        c1361f2.a(str2, xVar2, this.f4999g.f3492b);
                        this.f4991A.incrementAndGet();
                    }
                    x xVar3 = new x(this, this.f4991A.get());
                    this.f5009q = xVar3;
                    String v4 = v();
                    boolean w3 = w();
                    this.f4999g = new j(v4, w3);
                    if (w3 && f() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f4999g.f3491a)));
                    }
                    C1361F c1361f3 = this.f5001i;
                    String str3 = this.f4999g.f3491a;
                    u.g(str3);
                    this.f4999g.getClass();
                    String str4 = this.f5014v;
                    if (str4 == null) {
                        str4 = this.f5000h.getClass().getName();
                    }
                    if (!c1361f3.b(new C1358C(str3, this.f4999g.f3492b), xVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f4999g.f3491a + " on com.google.android.gms");
                        int i3 = this.f4991A.get();
                        z zVar = new z(this, 16);
                        v vVar = this.f5002j;
                        vVar.sendMessage(vVar.obtainMessage(7, i3, -1, zVar));
                    }
                } else if (i2 == 4) {
                    u.g(iInterface);
                    this.f4995c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
