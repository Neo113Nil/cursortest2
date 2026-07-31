package r3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private boolean A;
    private volatile v0 B;

    @RecentlyNonNull
    protected AtomicInteger C;

    /* renamed from: a, reason: collision with root package name */
    private int f21202a;

    /* renamed from: b, reason: collision with root package name */
    private long f21203b;

    /* renamed from: c, reason: collision with root package name */
    private long f21204c;

    /* renamed from: d, reason: collision with root package name */
    private int f21205d;

    /* renamed from: e, reason: collision with root package name */
    private long f21206e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f21207f;

    /* renamed from: g, reason: collision with root package name */
    g1 f21208g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f21209h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f21210i;

    /* renamed from: j, reason: collision with root package name */
    private final h f21211j;

    /* renamed from: k, reason: collision with root package name */
    private final o3.f f21212k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f21213l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f21214m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f21215n;

    /* renamed from: o, reason: collision with root package name */
    private l f21216o;

    /* renamed from: p, reason: collision with root package name */
    @RecentlyNonNull
    protected InterfaceC0129c f21217p;

    /* renamed from: q, reason: collision with root package name */
    private T f21218q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList<q0<?>> f21219r;

    /* renamed from: s, reason: collision with root package name */
    private s0 f21220s;

    /* renamed from: t, reason: collision with root package name */
    private int f21221t;

    /* renamed from: u, reason: collision with root package name */
    private final a f21222u;

    /* renamed from: v, reason: collision with root package name */
    private final b f21223v;

    /* renamed from: w, reason: collision with root package name */
    private final int f21224w;

    /* renamed from: x, reason: collision with root package name */
    private final String f21225x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f21226y;

    /* renamed from: z, reason: collision with root package name */
    private o3.b f21227z;
    private static final o3.d[] E = new o3.d[0];

    @RecentlyNonNull
    public static final String[] D = {"service_esmobile", "service_googleme"};

    public interface a {
        void O0(Bundle bundle);

        void q0(int i7);
    }

    public interface b {
        void E(@RecentlyNonNull o3.b bVar);
    }

    /* renamed from: r3.c$c, reason: collision with other inner class name */
    public interface InterfaceC0129c {
        void c(@RecentlyNonNull o3.b bVar);
    }

    protected class d implements InterfaceC0129c {
        public d() {
        }

        @Override // r3.c.InterfaceC0129c
        public final void c(@RecentlyNonNull o3.b bVar) {
            if (bVar.j()) {
                c cVar = c.this;
                cVar.e(null, cVar.B());
            } else if (c.this.f21223v != null) {
                c.this.f21223v.E(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i7, a aVar, b bVar, String str) {
        this(context, looper, r3, r4, i7, aVar, bVar, str);
        h b7 = h.b(context);
        o3.f f7 = o3.f.f();
        o.i(aVar);
        o.i(bVar);
    }

    protected c(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull h hVar, @RecentlyNonNull o3.f fVar, int i7, a aVar, b bVar, String str) {
        this.f21207f = null;
        this.f21214m = new Object();
        this.f21215n = new Object();
        this.f21219r = new ArrayList<>();
        this.f21221t = 1;
        this.f21227z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        o.j(context, "Context must not be null");
        this.f21209h = context;
        o.j(looper, "Looper must not be null");
        this.f21210i = looper;
        o.j(hVar, "Supervisor must not be null");
        this.f21211j = hVar;
        o.j(fVar, "API availability must not be null");
        this.f21212k = fVar;
        this.f21213l = new p0(this, looper);
        this.f21224w = i7;
        this.f21222u = aVar;
        this.f21223v = bVar;
        this.f21225x = str;
    }

    static /* synthetic */ void U(c cVar, int i7) {
        int i8;
        int i9;
        synchronized (cVar.f21214m) {
            i8 = cVar.f21221t;
        }
        if (i8 == 3) {
            cVar.A = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = cVar.f21213l;
        handler.sendMessage(handler.obtainMessage(i9, cVar.C.get(), 16));
    }

    static /* synthetic */ boolean Y(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ boolean d0(c cVar, int i7, int i8, IInterface iInterface) {
        synchronized (cVar.f21214m) {
            if (cVar.f21221t != i7) {
                return false;
            }
            cVar.h0(i8, iInterface);
            return true;
        }
    }

    static /* synthetic */ void g0(c cVar, v0 v0Var) {
        cVar.B = v0Var;
        if (cVar.R()) {
            r3.e eVar = v0Var.f21337i;
            p.b().c(eVar == null ? null : eVar.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(int i7, T t6) {
        g1 g1Var;
        o.a((i7 == 4) == (t6 != null));
        synchronized (this.f21214m) {
            this.f21221t = i7;
            this.f21218q = t6;
            if (i7 == 1) {
                s0 s0Var = this.f21220s;
                if (s0Var != null) {
                    h hVar = this.f21211j;
                    String a7 = this.f21208g.a();
                    o.i(a7);
                    hVar.c(a7, this.f21208g.b(), this.f21208g.c(), s0Var, S(), this.f21208g.d());
                    this.f21220s = null;
                }
            } else if (i7 == 2 || i7 == 3) {
                s0 s0Var2 = this.f21220s;
                if (s0Var2 != null && (g1Var = this.f21208g) != null) {
                    String a8 = g1Var.a();
                    String b7 = this.f21208g.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(a8).length() + 70 + String.valueOf(b7).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(a8);
                    sb.append(" on ");
                    sb.append(b7);
                    Log.e("GmsClient", sb.toString());
                    h hVar2 = this.f21211j;
                    String a9 = this.f21208g.a();
                    o.i(a9);
                    hVar2.c(a9, this.f21208g.b(), this.f21208g.c(), s0Var2, S(), this.f21208g.d());
                    this.C.incrementAndGet();
                }
                s0 s0Var3 = new s0(this, this.C.get());
                this.f21220s = s0Var3;
                g1 g1Var2 = (this.f21221t != 3 || A() == null) ? new g1(F(), E(), false, h.a(), H()) : new g1(x().getPackageName(), A(), true, h.a(), false);
                this.f21208g = g1Var2;
                if (g1Var2.d() && j() < 17895000) {
                    String valueOf = String.valueOf(this.f21208g.a());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                h hVar3 = this.f21211j;
                String a10 = this.f21208g.a();
                o.i(a10);
                if (!hVar3.d(new z0(a10, this.f21208g.b(), this.f21208g.c(), this.f21208g.d()), s0Var3, S())) {
                    String a11 = this.f21208g.a();
                    String b8 = this.f21208g.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a11).length() + 34 + String.valueOf(b8).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(a11);
                    sb2.append(" on ");
                    sb2.append(b8);
                    Log.e("GmsClient", sb2.toString());
                    T(16, null, this.C.get());
                }
            } else if (i7 == 4) {
                o.i(t6);
                J(t6);
            }
        }
    }

    @RecentlyNullable
    protected String A() {
        return null;
    }

    @RecentlyNonNull
    protected Set<Scope> B() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    public final T C() {
        T t6;
        synchronized (this.f21214m) {
            if (this.f21221t == 5) {
                throw new DeadObjectException();
            }
            r();
            t6 = this.f21218q;
            o.j(t6, "Client is connected but service is null");
        }
        return t6;
    }

    protected abstract String D();

    protected abstract String E();

    @RecentlyNonNull
    protected String F() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    public r3.e G() {
        v0 v0Var = this.B;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f21337i;
    }

    protected boolean H() {
        return false;
    }

    public boolean I() {
        return this.B != null;
    }

    protected void J(@RecentlyNonNull T t6) {
        this.f21204c = System.currentTimeMillis();
    }

    protected void K(@RecentlyNonNull o3.b bVar) {
        this.f21205d = bVar.c();
        this.f21206e = System.currentTimeMillis();
    }

    protected void L(int i7) {
        this.f21202a = i7;
        this.f21203b = System.currentTimeMillis();
    }

    protected void M(int i7, IBinder iBinder, Bundle bundle, int i8) {
        Handler handler = this.f21213l;
        handler.sendMessage(handler.obtainMessage(1, i8, -1, new t0(this, i7, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(@RecentlyNonNull String str) {
        this.f21226y = str;
    }

    public void P(int i7) {
        Handler handler = this.f21213l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i7));
    }

    protected void Q(@RecentlyNonNull InterfaceC0129c interfaceC0129c, int i7, PendingIntent pendingIntent) {
        o.j(interfaceC0129c, "Connection progress callbacks cannot be null.");
        this.f21217p = interfaceC0129c;
        Handler handler = this.f21213l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i7, pendingIntent));
    }

    public boolean R() {
        return false;
    }

    @RecentlyNonNull
    protected final String S() {
        String str = this.f21225x;
        return str == null ? this.f21209h.getClass().getName() : str;
    }

    protected final void T(int i7, Bundle bundle, int i8) {
        Handler handler = this.f21213l;
        handler.sendMessage(handler.obtainMessage(7, i8, -1, new u0(this, i7, null)));
    }

    public boolean a() {
        boolean z6;
        synchronized (this.f21214m) {
            z6 = this.f21221t == 4;
        }
        return z6;
    }

    public void c(@RecentlyNonNull InterfaceC0129c interfaceC0129c) {
        o.j(interfaceC0129c, "Connection progress callbacks cannot be null.");
        this.f21217p = interfaceC0129c;
        h0(2, null);
    }

    public void d() {
        this.C.incrementAndGet();
        synchronized (this.f21219r) {
            int size = this.f21219r.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f21219r.get(i7).e();
            }
            this.f21219r.clear();
        }
        synchronized (this.f21215n) {
            this.f21216o = null;
        }
        h0(1, null);
    }

    public void e(i iVar, @RecentlyNonNull Set<Scope> set) {
        Bundle z6 = z();
        f fVar = new f(this.f21224w, this.f21226y);
        fVar.f21263i = this.f21209h.getPackageName();
        fVar.f21266l = z6;
        if (set != null) {
            fVar.f21265k = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (o()) {
            Account u6 = u();
            if (u6 == null) {
                u6 = new Account("<<default account>>", "com.google");
            }
            fVar.f21267m = u6;
            if (iVar != null) {
                fVar.f21264j = iVar.asBinder();
            }
        } else if (N()) {
            fVar.f21267m = u();
        }
        fVar.f21268n = E;
        fVar.f21269o = v();
        if (R()) {
            fVar.f21272r = true;
        }
        try {
            synchronized (this.f21215n) {
                l lVar = this.f21216o;
                if (lVar != null) {
                    lVar.w4(new r0(this, this.C.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            P(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        }
    }

    public void f(@RecentlyNonNull String str) {
        this.f21207f = str;
        d();
    }

    public void g(@RecentlyNonNull e eVar) {
        eVar.a();
    }

    public boolean h() {
        return true;
    }

    public int j() {
        return o3.f.f19857a;
    }

    public boolean k() {
        boolean z6;
        synchronized (this.f21214m) {
            int i7 = this.f21221t;
            z6 = true;
            if (i7 != 2 && i7 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    @RecentlyNullable
    public final o3.d[] l() {
        v0 v0Var = this.B;
        if (v0Var == null) {
            return null;
        }
        return v0Var.f21335g;
    }

    @RecentlyNonNull
    public String m() {
        g1 g1Var;
        if (!a() || (g1Var = this.f21208g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return g1Var.b();
    }

    @RecentlyNullable
    public String n() {
        return this.f21207f;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h7 = this.f21212k.h(this.f21209h, j());
        if (h7 == 0) {
            c(new d());
        } else {
            h0(1, null);
            Q(new d(), h7, null);
        }
    }

    protected final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    @RecentlyNullable
    protected abstract T s(@RecentlyNonNull IBinder iBinder);

    protected boolean t() {
        return false;
    }

    @RecentlyNullable
    public Account u() {
        return null;
    }

    @RecentlyNonNull
    public o3.d[] v() {
        return E;
    }

    @RecentlyNullable
    public Bundle w() {
        return null;
    }

    @RecentlyNonNull
    public final Context x() {
        return this.f21209h;
    }

    public int y() {
        return this.f21224w;
    }

    @RecentlyNonNull
    protected Bundle z() {
        return new Bundle();
    }
}
