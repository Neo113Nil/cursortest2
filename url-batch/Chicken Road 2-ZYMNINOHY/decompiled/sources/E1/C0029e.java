package E1;

import E.AbstractC0005f;
import a.AbstractC0124a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC0328k;
import com.google.android.gms.internal.play_billing.AbstractC0346t;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0298a;
import com.google.android.gms.internal.play_billing.C0308d0;
import com.google.android.gms.internal.play_billing.C0311e0;
import com.google.android.gms.internal.play_billing.C0312e1;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0318g1;
import com.google.android.gms.internal.play_billing.C0321h1;
import com.google.android.gms.internal.play_billing.C0324i1;
import com.google.android.gms.internal.play_billing.C0327j1;
import com.google.android.gms.internal.play_billing.C0337o;
import com.google.android.gms.internal.play_billing.C0354x;
import com.google.android.gms.internal.play_billing.C1;
import com.google.android.gms.internal.play_billing.D1;
import com.google.android.gms.internal.play_billing.InterfaceC0304c;
import com.google.android.gms.internal.play_billing.l1;
import com.google.android.gms.internal.play_billing.n1;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.r1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: E1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0029e extends AbstractC0028d {

    /* renamed from: A, reason: collision with root package name */
    public boolean f587A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f588B;

    /* renamed from: C, reason: collision with root package name */
    public final C0038n f589C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f590D;

    /* renamed from: E, reason: collision with root package name */
    public ExecutorService f591E;

    /* renamed from: F, reason: collision with root package name */
    public final Long f592F;

    /* renamed from: G, reason: collision with root package name */
    public final AbstractC0124a f593G;

    /* renamed from: c, reason: collision with root package name */
    public final String f596c;

    /* renamed from: d, reason: collision with root package name */
    public final String f597d;

    /* renamed from: f, reason: collision with root package name */
    public volatile a0 f599f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f600g;

    /* renamed from: h, reason: collision with root package name */
    public final l2.e f601h;

    /* renamed from: i, reason: collision with root package name */
    public volatile InterfaceC0304c f602i;

    /* renamed from: j, reason: collision with root package name */
    public volatile K f603j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f604k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f605l;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f607p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f608q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f609r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f610s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f611t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f612u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f613w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f614x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f615y;
    public boolean z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f594a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f595b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f598e = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public int f606m = 0;

    public C0029e(C0038n c0038n, Context context, InterfaceC0047x interfaceC0047x, C0027c c0027c) {
        long nextLong = new Random().nextLong();
        this.f592F = Long.valueOf(nextLong);
        this.f593G = AbstractC0328k.f5959a;
        this.f596c = "8.0.0";
        String G4 = G();
        this.f597d = G4;
        this.f600g = context.getApplicationContext();
        n1 x4 = o1.x();
        x4.c();
        o1.v((o1) x4.f6024b);
        if (G4 != null) {
            x4.c();
            o1.w((o1) x4.f6024b, G4);
        }
        String packageName = this.f600g.getPackageName();
        x4.c();
        o1.t((o1) x4.f6024b, packageName);
        x4.c();
        o1.q((o1) x4.f6024b, nextLong);
        x4.c();
        o1.u((o1) x4.f6024b);
        int i4 = Build.VERSION.SDK_INT;
        x4.c();
        o1.n((o1) x4.f6024b, i4);
        x4.d();
        try {
            int i5 = this.f600g.getPackageManager().getPackageInfo(this.f600g.getPackageName(), 0).versionCode;
            x4.c();
            o1.o((o1) x4.f6024b, i5);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Error getting app version code.", th);
        }
        this.f601h = new l2.e(this.f600g, (o1) x4.a());
        if (interfaceC0047x == null) {
            AbstractC0352w.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f599f = new a0(this.f600g, interfaceC0047x, null, this.f601h);
        this.f589C = c0038n;
        this.f590D = false;
        this.f600g.getPackageName();
    }

    public static void A(C0029e c0029e, int i4) {
        if (i4 != 0) {
            c0029e.t(0);
            return;
        }
        synchronized (c0029e.f594a) {
            try {
                if (c0029e.f595b == 3) {
                    return;
                }
                c0029e.t(2);
                a0 a0Var = c0029e.f599f != null ? c0029e.f599f : null;
                if (a0Var != null) {
                    boolean z = c0029e.f615y;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    a0Var.f566b = z;
                    Z z4 = (Z) a0Var.f571g;
                    Context context = a0Var.f565a;
                    z4.a(context, intentFilter2);
                    if (!a0Var.f566b) {
                        ((Z) a0Var.f570f).a(context, intentFilter);
                        return;
                    }
                    Z z5 = (Z) a0Var.f570f;
                    synchronized (z5) {
                        try {
                            if (z5.f559a) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(z5, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != z5.f560b ? 4 : 2);
                            } else {
                                context.registerReceiver(z5, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            z5.f559a = true;
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static String G() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Future j(Callable callable, long j4, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new B.a(submit, 8, runnable), (long) (j4 * 0.95d));
            return submit;
        } catch (Exception e4) {
            AbstractC0352w.i("BillingClient", "Async task throws exception!", e4);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void z(C0029e c0029e, int i4) {
        c0029e.f606m = i4;
        c0029e.f588B = i4 >= 26;
        c0029e.f587A = i4 >= 24;
        c0029e.z = i4 >= 23;
        c0029e.f615y = i4 >= 21;
        c0029e.f614x = i4 >= 20;
        c0029e.f613w = i4 >= 19;
        c0029e.v = i4 >= 18;
        c0029e.f612u = i4 >= 17;
        c0029e.f611t = i4 >= 16;
        c0029e.f610s = i4 >= 15;
        c0029e.f609r = i4 >= 14;
        c0029e.f608q = i4 >= 12;
        c0029e.f607p = i4 >= 9;
        c0029e.o = i4 >= 8;
        c0029e.n = i4 >= 6;
    }

    public final Handler B() {
        return Looper.myLooper() == null ? this.f598e : new Handler(Looper.myLooper());
    }

    public final N C(C0037m c0037m, int i4, String str, Exception exc) {
        AbstractC0352w.i("BillingClient", str, exc);
        L(i4, 7, c0037m, U.a(exc));
        return new N(c0037m.f633a, c0037m.f635c, new ArrayList(), new ArrayList());
    }

    public final C0037m D() {
        AbstractC0352w.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        C0318g1 t4 = C0321h1.t();
        t4.c();
        C0321h1.s((C0321h1) t4.f6024b, 6);
        C1 r4 = D1.r();
        r4.c();
        D1.q((D1) r4.f6024b);
        r4.d(false);
        r4.e();
        t4.c();
        C0321h1.r((C0321h1) t4.f6024b, (D1) r4.a());
        r((C0321h1) t4.a());
        return W.f541i;
    }

    public final C0037m E() {
        int[] iArr = {0, 3};
        synchronized (this.f594a) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (this.f595b == iArr[i4]) {
                    return W.f542j;
                }
            }
            return W.f540h;
        }
    }

    public final void F() {
        if (TextUtils.isEmpty(null)) {
            this.f600g.getPackageName();
        }
    }

    public final l2.e H(C0037m c0037m, int i4, String str, Exception exc) {
        L(i4, 9, c0037m, U.a(exc));
        AbstractC0352w.i("BillingClient", str, exc);
        return new l2.e(c0037m, null, 4, false);
    }

    public final void I(int i4, int i5, C0037m c0037m) {
        C0321h1 c0321h1 = null;
        C0315f1 c0315f1 = null;
        if (c0037m.f633a == 0) {
            int i6 = U.f526a;
            try {
                C0318g1 t4 = C0321h1.t();
                t4.c();
                C0321h1.s((C0321h1) t4.f6024b, 5);
                q1 o = r1.o();
                o.c();
                r1.n((r1) o.f6024b, i5);
                r1 r1Var = (r1) o.a();
                t4.c();
                C0321h1.p((C0321h1) t4.f6024b, r1Var);
                c0321h1 = (C0321h1) t4.a();
            } catch (Exception e4) {
                AbstractC0352w.i("BillingLogger", "Unable to create logging payload", e4);
            }
            r(c0321h1);
            return;
        }
        int i7 = U.f526a;
        try {
            C0312e1 v = C0315f1.v();
            C0324i1 s4 = C0327j1.s();
            int i8 = c0037m.f633a;
            s4.c();
            C0327j1.r((C0327j1) s4.f6024b, i8);
            String str = c0037m.f635c;
            s4.c();
            C0327j1.o((C0327j1) s4.f6024b, str);
            s4.d(i4);
            v.d(s4);
            v.f(5);
            q1 o4 = r1.o();
            o4.c();
            r1.n((r1) o4.f6024b, i5);
            r1 r1Var2 = (r1) o4.a();
            v.c();
            C0315f1.r((C0315f1) v.f6024b, r1Var2);
            c0315f1 = (C0315f1) v.a();
        } catch (Exception e5) {
            AbstractC0352w.i("BillingLogger", "Unable to create logging payload", e5);
        }
        q(c0315f1);
    }

    public final void J(int i4, int i5, C0037m c0037m) {
        try {
            int i6 = U.f526a;
            q(U.b(i4, i5, c0037m, null, l1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(int i4, C0037m c0037m, long j4) {
        try {
            int i5 = U.f526a;
            try {
                this.f601h.x(U.b(i4, 2, c0037m, null, l1.BROADCAST_ACTION_UNSPECIFIED), this.f606m, j4);
            } catch (Throwable th) {
                AbstractC0352w.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void L(int i4, int i5, C0037m c0037m, String str) {
        try {
            int i6 = U.f526a;
            q(U.b(i4, i5, c0037m, str, l1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void M(int i4, C0037m c0037m, long j4, boolean z) {
        try {
            int i5 = U.f526a;
            try {
                this.f601h.z(U.b(i4, 2, c0037m, null, l1.BROADCAST_ACTION_UNSPECIFIED), this.f606m, j4, z);
            } catch (Throwable th) {
                AbstractC0352w.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void N(int i4, C0037m c0037m, String str, long j4, boolean z) {
        try {
            int i5 = U.f526a;
            try {
                this.f601h.z(U.b(i4, 2, c0037m, str, l1.BROADCAST_ACTION_UNSPECIFIED), this.f606m, j4, z);
            } catch (Throwable th) {
                AbstractC0352w.i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void O(C0037m c0037m) {
        if (Thread.interrupted()) {
            return;
        }
        this.f598e.post(new B.a(this, 4, c0037m));
    }

    @Override // E1.AbstractC0028d
    public void a(C3.v vVar, io.flutter.plugins.inapppurchase.f fVar) {
        if (j(new F(this, fVar, vVar, 0), 30000L, new B.a(this, 3, fVar), B(), i()) == null) {
            C0037m E4 = E();
            J(25, 3, E4);
            fVar.a(E4);
        }
    }

    @Override // E1.AbstractC0028d
    public void b(C3.v vVar, io.flutter.plugins.inapppurchase.f fVar) {
        int i4 = 1;
        if (j(new F(this, fVar, vVar, i4), 30000L, new B.o(this, fVar, vVar, i4), B(), i()) == null) {
            C0037m E4 = E();
            J(25, 4, E4);
            fVar.f(E4, vVar.f321b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // E1.AbstractC0028d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        try {
            int i4 = U.f526a;
            r(U.c(12, l1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f594a) {
            try {
                if (this.f599f != null) {
                    a0 a0Var = this.f599f;
                    Z z = (Z) a0Var.f570f;
                    Context context = a0Var.f565a;
                    z.b(context);
                    ((Z) a0Var.f571g).b(context);
                }
            } finally {
                AbstractC0352w.g("BillingClient", "Unbinding from service.");
                v();
                synchronized (this) {
                }
            }
            try {
                AbstractC0352w.g("BillingClient", "Unbinding from service.");
                v();
            } catch (Throwable th2) {
                AbstractC0352w.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
            }
            try {
                synchronized (this) {
                    ExecutorService executorService = this.f591E;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        this.f591E = null;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a0  */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v35, types: [android.os.BaseBundle, android.os.Bundle] */
    @Override // E1.AbstractC0028d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0037m d(Activity activity, final C0035k c0035k) {
        String str;
        String str2;
        long j4;
        String str3;
        C0037m c0037m;
        C0040p c0040p;
        C0037m c0037m2;
        long j5;
        boolean z;
        String str4;
        Future j6;
        long j7;
        boolean z4;
        long j8;
        boolean z5;
        long j9;
        Object obj;
        int b4;
        int i4;
        boolean z6;
        int i5;
        long j10;
        String str5;
        String str6;
        boolean z7;
        long j11;
        String str7;
        long j12;
        String str8;
        boolean z8;
        long nextLong = new Random().nextLong();
        if (this.f599f == null || ((InterfaceC0047x) this.f599f.f567c) == null) {
            C0037m c0037m3 = W.f531D;
            K(12, c0037m3, nextLong);
            return c0037m3;
        }
        if (!w()) {
            C0037m c0037m4 = W.f542j;
            K(2, c0037m4, nextLong);
            O(c0037m4);
            return c0037m4;
        }
        synchronized (this.f594a) {
            try {
                if (this.f603j != null) {
                    this.f603j.getClass();
                }
            } finally {
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) c0035k.f629f);
        AbstractC0346t abstractC0346t = (AbstractC0346t) c0035k.f628e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.r rVar = (com.google.android.gms.internal.play_billing.r) abstractC0346t.iterator();
        C0032h c0032h = (C0032h) (rVar.hasNext() ? rVar.next() : null);
        C0043t c0043t = c0032h.f617a;
        String str9 = c0043t.f661c;
        String str10 = c0043t.f662d;
        if (str10.equals("subs") && !this.f604k) {
            AbstractC0352w.h("BillingClient", "Current client doesn't support subscriptions.");
            C0037m c0037m5 = W.f544l;
            M(9, c0037m5, nextLong, false);
            O(c0037m5);
            return c0037m5;
        }
        if (((String) c0035k.f625b) == null && ((String) c0035k.f626c) == null) {
            C0034j c0034j = (C0034j) c0035k.f627d;
            c0034j.getClass();
            if (c0034j.f623b == 0 && !c0035k.f624a) {
                AbstractC0346t abstractC0346t2 = (AbstractC0346t) c0035k.f628e;
                if (abstractC0346t2 != null) {
                    int size = abstractC0346t2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                    }
                }
                if (arrayList.size() <= 1 && !this.f611t) {
                    AbstractC0352w.h("BillingClient", "Current client doesn't support multi-item purchases.");
                    C0037m c0037m6 = W.f546p;
                    M(19, c0037m6, nextLong, false);
                    O(c0037m6);
                    return c0037m6;
                }
                if (abstractC0346t.isEmpty() && !this.f612u) {
                    AbstractC0352w.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    C0037m c0037m7 = W.f548r;
                    M(20, c0037m7, nextLong, false);
                    O(c0037m7);
                    return c0037m7;
                }
                if (((AbstractC0346t) c0035k.f628e).isEmpty()) {
                    C0032h c0032h2 = (C0032h) ((AbstractC0346t) c0035k.f628e).get(0);
                    int i7 = 1;
                    str = null;
                    while (true) {
                        if (i7 < ((AbstractC0346t) c0035k.f628e).size()) {
                            C0032h c0032h3 = (C0032h) ((AbstractC0346t) c0035k.f628e).get(i7);
                            str2 = str9;
                            if (!c0032h3.f617a.f662d.equals(c0032h2.f617a.f662d) && !c0032h3.f617a.f662d.equals("play_pass_subs")) {
                                j4 = nextLong;
                                c0037m2 = W.a(5, "All products should have same ProductType.");
                                str3 = str10;
                                break;
                            }
                            i7++;
                            str9 = str2;
                        } else {
                            str2 = str9;
                            C0043t c0043t2 = c0032h2.f617a;
                            String optString = c0043t2.f660b.optString("packageName");
                            HashMap hashMap = new HashMap();
                            HashSet hashSet = new HashSet();
                            j4 = nextLong;
                            AbstractC0346t abstractC0346t3 = (AbstractC0346t) c0035k.f628e;
                            int size2 = abstractC0346t3.size();
                            str3 = str10;
                            int i8 = 0;
                            while (true) {
                                if (i8 < size2) {
                                    AbstractC0346t abstractC0346t4 = abstractC0346t3;
                                    C0032h c0032h4 = (C0032h) abstractC0346t3.get(i8);
                                    int i9 = size2;
                                    C0043t c0043t3 = c0032h4.f617a;
                                    int i10 = i8;
                                    String str11 = c0043t3.f661c;
                                    HashSet hashSet2 = hashSet;
                                    String str12 = c0043t3.f661c;
                                    if (c0043t3.f668j != null && c0032h4.f618b == null) {
                                        c0037m = W.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str11);
                                        break;
                                    }
                                    if (hashMap.containsKey(str11)) {
                                        c0037m = W.a(5, "ProductId can not be duplicated. Invalid product id: " + str12 + ".");
                                        break;
                                    }
                                    hashMap.put(str12, c0032h4);
                                    if (!c0043t2.f662d.equals("play_pass_subs") && !c0043t3.f662d.equals("play_pass_subs") && !optString.equals(c0043t3.f660b.optString("packageName"))) {
                                        c0037m = W.a(5, "All products must have the same package name.");
                                        break;
                                    }
                                    i8 = i10 + 1;
                                    size2 = i9;
                                    abstractC0346t3 = abstractC0346t4;
                                    hashSet = hashSet2;
                                } else {
                                    Iterator it2 = hashSet.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            String str13 = (String) it2.next();
                                            if (hashMap.containsKey(str13)) {
                                                c0037m = W.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str13 + ".");
                                                break;
                                            }
                                        } else {
                                            ArrayList arrayList2 = c0043t2.f669k;
                                            String str14 = c0032h2.f618b;
                                            if (str14 != null && arrayList2 != null) {
                                                int size3 = arrayList2.size();
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 >= size3) {
                                                        c0040p = null;
                                                        break;
                                                    }
                                                    Object obj2 = arrayList2.get(i11);
                                                    i11++;
                                                    c0040p = (C0040p) obj2;
                                                    if (str14.equals(c0040p.f642d)) {
                                                        break;
                                                    }
                                                }
                                                if (c0040p != null && c0040p.f645g != null) {
                                                    c0037m = W.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                                }
                                            }
                                            c0037m = W.f541i;
                                        }
                                    }
                                }
                            }
                            c0037m2 = c0037m;
                        }
                    }
                } else {
                    str2 = str9;
                    j4 = nextLong;
                    c0037m2 = W.f541i;
                    str3 = str10;
                    str = null;
                }
                if (c0037m2 == W.f541i) {
                    M(108, c0037m2, j4, false);
                    O(c0037m2);
                    return c0037m2;
                }
                boolean z9 = false;
                long j13 = j4;
                if (this.n) {
                    boolean z10 = this.f607p;
                    boolean z11 = this.f613w;
                    this.f589C.getClass();
                    boolean z12 = this.f589C.f636a;
                    boolean z13 = this.f590D;
                    String str15 = this.f596c;
                    String str16 = this.f597d;
                    long longValue = this.f592F.longValue();
                    this.f600g.getPackageName();
                    int i12 = AbstractC0352w.f6025a;
                    final ?? bundle = new Bundle();
                    AbstractC0352w.b(bundle, str15, str16, longValue);
                    bundle.putLong("billingClientTransactionId", j13);
                    int i13 = ((C0034j) c0035k.f627d).f623b;
                    if (i13 != 0) {
                        bundle.putInt("prorationMode", i13);
                    }
                    if (!TextUtils.isEmpty((String) c0035k.f625b)) {
                        bundle.putString("accountId", (String) c0035k.f625b);
                    }
                    if (!TextUtils.isEmpty((String) c0035k.f626c)) {
                        bundle.putString("obfuscatedProfileId", (String) c0035k.f626c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(str)));
                    }
                    if (!TextUtils.isEmpty(((C0034j) c0035k.f627d).f622a)) {
                        bundle.putString("oldSkuPurchaseToken", ((C0034j) c0035k.f627d).f622a);
                    }
                    if (TextUtils.isEmpty(str)) {
                        str6 = str;
                    } else {
                        str6 = str;
                        bundle.putString("oldSkuPurchaseId", str6);
                    }
                    ((C0034j) c0035k.f627d).getClass();
                    if (!TextUtils.isEmpty(str6)) {
                        ((C0034j) c0035k.f627d).getClass();
                        bundle.putString("originalExternalTransactionId", str6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("paymentsPurchaseParams", str6);
                    }
                    if (z10) {
                        z7 = true;
                        bundle.putBoolean("enablePendingPurchases", true);
                    } else {
                        z7 = true;
                    }
                    if (z11 && z12) {
                        bundle.putBoolean("enablePendingPurchaseForSubscriptions", z7);
                    }
                    if (z13) {
                        bundle.putBoolean("enableAlternativeBilling", z7);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    com.google.android.gms.internal.play_billing.r listIterator = ((AbstractC0346t) c0035k.f628e).listIterator(0);
                    while (listIterator.hasNext()) {
                    }
                    if (!arrayList3.isEmpty()) {
                        C0308d0 n = C0311e0.n();
                        n.c();
                        C0311e0.o((C0311e0) n.f6024b, arrayList3);
                        bundle.putByteArray("subscriptionProductReplacementParamsList", ((C0311e0) n.a()).a());
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(abstractC0346t.size() - 1);
                        ArrayList arrayList5 = new ArrayList(abstractC0346t.size() - 1);
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        int i14 = 0;
                        while (i14 < abstractC0346t.size()) {
                            C0032h c0032h5 = (C0032h) abstractC0346t.get(i14);
                            C0043t c0043t4 = c0032h5.f617a;
                            if (!c0043t4.f666h.isEmpty()) {
                                arrayList6.add(c0043t4.f666h);
                            }
                            arrayList7.add(c0032h5.f618b);
                            String str17 = c0043t4.f667i;
                            ArrayList arrayList10 = c0043t4.f669k;
                            if (arrayList10 == null || arrayList10.isEmpty()) {
                                str7 = str17;
                            } else {
                                ArrayList arrayList11 = c0043t4.f669k;
                                int size4 = arrayList11.size();
                                str7 = str17;
                                int i15 = 0;
                                while (i15 < size4) {
                                    Object obj3 = arrayList11.get(i15);
                                    int i16 = i15 + 1;
                                    C0040p c0040p2 = (C0040p) obj3;
                                    j12 = j13;
                                    if (!TextUtils.isEmpty(c0040p2.f644f)) {
                                        str8 = c0040p2.f644f;
                                        break;
                                    }
                                    i15 = i16;
                                    j13 = j12;
                                }
                            }
                            j12 = j13;
                            str8 = str7;
                            if (!TextUtils.isEmpty(str8)) {
                                arrayList8.add(str8);
                            }
                            if (i14 > 0) {
                                arrayList4.add(((C0032h) abstractC0346t.get(i14)).f617a.f661c);
                                arrayList5.add(((C0032h) abstractC0346t.get(i14)).f617a.f662d);
                            }
                            i14++;
                            j13 = j12;
                        }
                        j11 = j13;
                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                        if (!arrayList9.isEmpty()) {
                            bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList9);
                        }
                        if (!arrayList6.isEmpty()) {
                            bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                        }
                        if (!arrayList8.isEmpty()) {
                            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList8);
                        }
                        if (!arrayList4.isEmpty()) {
                            bundle.putStringArrayList("additionalSkus", arrayList4);
                            bundle.putStringArrayList("additionalSkuTypes", arrayList5);
                        }
                    } else {
                        ArrayList arrayList12 = new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            it3.next().getClass();
                            throw new ClassCastException();
                        }
                        if (!arrayList12.isEmpty()) {
                            bundle.putStringArrayList("skuDetailsTokens", arrayList12);
                        }
                        if (arrayList.size() > 1) {
                            ArrayList arrayList13 = new ArrayList(arrayList.size() - 1);
                            ArrayList arrayList14 = new ArrayList(arrayList.size() - 1);
                            if (1 < arrayList.size()) {
                                throw AbstractC0005f.g(1, arrayList);
                            }
                            bundle.putStringArrayList("additionalSkus", arrayList13);
                            bundle.putStringArrayList("additionalSkuTypes", arrayList14);
                        }
                        j11 = j13;
                    }
                    if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f609r) {
                        C0037m c0037m8 = W.f547q;
                        M(21, c0037m8, j11, false);
                        O(c0037m8);
                        return c0037m8;
                    }
                    j5 = j11;
                    z = false;
                    if (TextUtils.isEmpty(c0032h.f617a.f660b.optString("packageName"))) {
                        z8 = false;
                    } else {
                        bundle.putString("skuPackageName", c0032h.f617a.f660b.optString("packageName"));
                        z8 = true;
                    }
                    str4 = null;
                    if (!TextUtils.isEmpty(null)) {
                        bundle.putString("accountName", null);
                    }
                    Intent intent = activity.getIntent();
                    if (intent == null) {
                        AbstractC0352w.h("BillingClient", "Activity's intent is null.");
                    } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            bundle.putString("proxyPackageVersion", this.f600g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString("proxyPackageVersion", "package not found");
                        }
                    }
                    final int i17 = (!this.f612u || abstractC0346t.isEmpty()) ? (this.f610s && z8) ? 15 : this.f607p ? 9 : 6 : 17;
                    final String str18 = str2;
                    final ?? r4 = str3;
                    j6 = j(new Callable(i17, str18, r4, c0035k, bundle) { // from class: E1.b0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f574b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f575c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ String f576d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ Bundle f577e;

                        {
                            this.f577e = bundle;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle c4;
                            InterfaceC0304c interfaceC0304c;
                            C0029e c0029e = C0029e.this;
                            int i18 = this.f574b;
                            String str19 = this.f575c;
                            String str20 = this.f576d;
                            Bundle bundle2 = this.f577e;
                            try {
                                synchronized (c0029e.f594a) {
                                    interfaceC0304c = c0029e.f602i;
                                }
                                if (interfaceC0304c == null) {
                                    return AbstractC0352w.c(107, W.f542j);
                                }
                                return ((C0298a) interfaceC0304c).h(i18, c0029e.f600g.getPackageName(), str19, str20, bundle2);
                            } catch (DeadObjectException e4) {
                                C0037m c0037m9 = W.f542j;
                                String a3 = U.a(e4);
                                c4 = AbstractC0352w.c(5, c0037m9);
                                if (a3 != null) {
                                    c4.putString("ADDITIONAL_LOG_DETAILS", a3);
                                }
                                return c4;
                            } catch (Exception e5) {
                                C0037m c0037m10 = W.f540h;
                                String a4 = U.a(e5);
                                c4 = AbstractC0352w.c(5, c0037m10);
                                if (a4 != null) {
                                    c4.putString("ADDITIONAL_LOG_DETAILS", a4);
                                }
                                return c4;
                            }
                        }
                    }, 5000L, null, this.f598e, i());
                    j7 = r4;
                    z9 = bundle;
                } else {
                    j5 = j13;
                    z = false;
                    str4 = str;
                    ?? r42 = str3;
                    j6 = j(new F(this, str2, r42, 4), 5000L, null, this.f598e, i());
                    j7 = r42;
                }
                try {
                    if (j6 == null) {
                        try {
                            C0037m c0037m9 = W.f535c;
                            M(25, c0037m9, j5, z);
                            O(c0037m9);
                            return c0037m9;
                        } catch (CancellationException e4) {
                            e = e4;
                            z5 = z;
                            j9 = j5;
                            AbstractC0352w.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            C0037m c0037m10 = W.f543k;
                            N(4, c0037m10, U.a(e), j9, z5);
                            O(c0037m10);
                            return c0037m10;
                        } catch (TimeoutException e5) {
                            e = e5;
                            z5 = z;
                            j9 = j5;
                            AbstractC0352w.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                            C0037m c0037m102 = W.f543k;
                            N(4, c0037m102, U.a(e), j9, z5);
                            O(c0037m102);
                            return c0037m102;
                        } catch (Exception e6) {
                            e = e6;
                            z4 = z;
                            j8 = j5;
                            AbstractC0352w.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                            C0037m c0037m11 = W.f542j;
                            N(5, c0037m11, U.a(e), j8, z4);
                            O(c0037m11);
                            return c0037m11;
                        }
                    }
                    boolean z14 = z;
                    long j14 = j5;
                    Bundle bundle2 = (Bundle) j6.get(5000L, TimeUnit.MILLISECONDS);
                    int a3 = AbstractC0352w.a(bundle2, "BillingClient");
                    String f4 = AbstractC0352w.f(bundle2, "BillingClient");
                    if (a3 == 0) {
                        Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                        intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                        intent2.putExtra("billingClientTransactionId", j14);
                        intent2.putExtra("wasServiceAutoReconnected", z14);
                        activity.startActivity(intent2);
                        return W.f541i;
                    }
                    AbstractC0352w.h("BillingClient", "Unable to buy item, Error response code: " + a3);
                    C0037m a4 = W.a(a3, f4);
                    try {
                        if (bundle2 != null) {
                            try {
                                obj = bundle2.get("LOG_REASON");
                            } catch (Throwable th) {
                                AbstractC0352w.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                            }
                            if (obj != null) {
                                if (obj instanceof Integer) {
                                    b4 = AbstractC0005f.b(((Integer) obj).intValue());
                                    i4 = 1;
                                    if (b4 == i4) {
                                        b4 = 23;
                                    }
                                    if (bundle2 != null) {
                                        try {
                                            String string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                                            z6 = z14;
                                            i5 = b4;
                                            j10 = j14;
                                            str5 = string;
                                        } catch (Throwable th2) {
                                            AbstractC0352w.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                                        }
                                        N(i5, a4, str5, j10, z6);
                                        O(a4);
                                        return a4;
                                    }
                                    z6 = z14;
                                    i5 = b4;
                                    j10 = j14;
                                    str5 = str4;
                                    N(i5, a4, str5, j10, z6);
                                    O(a4);
                                    return a4;
                                }
                                AbstractC0352w.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                        N(i5, a4, str5, j10, z6);
                        O(a4);
                        return a4;
                    } catch (CancellationException e7) {
                        e = e7;
                        j9 = j10;
                        z5 = z6;
                        AbstractC0352w.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        C0037m c0037m1022 = W.f543k;
                        N(4, c0037m1022, U.a(e), j9, z5);
                        O(c0037m1022);
                        return c0037m1022;
                    } catch (TimeoutException e8) {
                        e = e8;
                        j9 = j10;
                        z5 = z6;
                        AbstractC0352w.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        C0037m c0037m10222 = W.f543k;
                        N(4, c0037m10222, U.a(e), j9, z5);
                        O(c0037m10222);
                        return c0037m10222;
                    } catch (Exception e9) {
                        e = e9;
                        j8 = j10;
                        z4 = z6;
                        AbstractC0352w.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        C0037m c0037m112 = W.f542j;
                        N(5, c0037m112, U.a(e), j8, z4);
                        O(c0037m112);
                        return c0037m112;
                    }
                    i4 = 1;
                    b4 = 1;
                    if (b4 == i4) {
                    }
                    if (bundle2 != null) {
                    }
                    z6 = z14;
                    i5 = b4;
                    j10 = j14;
                    str5 = str4;
                } catch (CancellationException e10) {
                    e = e10;
                } catch (TimeoutException e11) {
                    e = e11;
                    j9 = j7;
                    z5 = z9;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }
        if (!this.n) {
            AbstractC0352w.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0037m c0037m12 = W.f538f;
            M(18, c0037m12, nextLong, false);
            O(c0037m12);
            return c0037m12;
        }
        if (arrayList.size() <= 1) {
        }
        if (abstractC0346t.isEmpty()) {
        }
        if (((AbstractC0346t) c0035k.f628e).isEmpty()) {
        }
        if (c0037m2 == W.f541i) {
        }
    }

    @Override // E1.AbstractC0028d
    public void e(C0048y c0048y, InterfaceC0044u interfaceC0044u) {
        if (j(new F(this, interfaceC0044u, c0048y, 2), 30000L, new B.a(this, 9, interfaceC0044u), B(), i()) == null) {
            C0037m E4 = E();
            J(25, 7, E4);
            com.google.android.gms.internal.play_billing.r rVar = AbstractC0346t.f6014b;
            C0354x c0354x = C0354x.f6026e;
            interfaceC0044u.onProductDetailsResponse(E4, new A(c0354x, c0354x));
        }
    }

    @Override // E1.AbstractC0028d
    public final void f(C3.v vVar, InterfaceC0046w interfaceC0046w) {
        if (j(new F(this, interfaceC0046w, vVar.f321b), 30000L, new B.a(this, 10, interfaceC0046w), B(), i()) == null) {
            C0037m E4 = E();
            J(25, 9, E4);
            com.google.android.gms.internal.play_billing.r rVar = AbstractC0346t.f6014b;
            interfaceC0046w.onQueryPurchasesResponse(E4, C0354x.f6026e);
        }
    }

    @Override // E1.AbstractC0028d
    public final C0037m g(final Activity activity, final io.flutter.plugins.inapppurchase.f fVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!w()) {
            C0037m c0037m = W.f542j;
            J(2, 16, c0037m);
            return c0037m;
        }
        if (!this.f615y) {
            AbstractC0352w.h("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            C0037m c0037m2 = W.f530C;
            J(66, 16, c0037m2);
            return c0037m2;
        }
        Handler handler = this.f598e;
        final I i4 = new I(this, handler, fVar);
        if (j(new Callable() { // from class: E1.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC0304c interfaceC0304c;
                C0029e c0029e = C0029e.this;
                io.flutter.plugins.inapppurchase.f fVar2 = fVar;
                Activity activity2 = activity;
                I i5 = i4;
                c0029e.getClass();
                try {
                    synchronized (c0029e.f594a) {
                        interfaceC0304c = c0029e.f602i;
                    }
                    if (interfaceC0304c == null) {
                        c0029e.p(fVar2, W.f542j, 107, null);
                        return null;
                    }
                    String packageName = c0029e.f600g.getPackageName();
                    String str = c0029e.f596c;
                    String str2 = c0029e.f597d;
                    long longValue = c0029e.f592F.longValue();
                    int i6 = AbstractC0352w.f6025a;
                    Bundle bundle = new Bundle();
                    AbstractC0352w.b(bundle, str, str2, longValue);
                    ((C0298a) interfaceC0304c).m(packageName, bundle, new M(new WeakReference(activity2), i5));
                    return null;
                } catch (DeadObjectException e4) {
                    c0029e.p(fVar2, W.f542j, 74, e4);
                    return null;
                } catch (Exception e5) {
                    c0029e.p(fVar2, W.f540h, 74, e5);
                    return null;
                }
            }
        }, 30000L, new B.a(this, 11, fVar), handler, i()) != null) {
            return W.f541i;
        }
        C0037m E4 = E();
        J(25, 16, E4);
        return E4;
    }

    @Override // E1.AbstractC0028d
    public void h(InterfaceC0030f interfaceC0030f) {
        u(interfaceC0030f);
    }

    public final synchronized ExecutorService i() {
        try {
            if (this.f591E == null) {
                this.f591E = Executors.newFixedThreadPool(AbstractC0352w.f6025a, new H(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f591E;
    }

    public final void k(io.flutter.plugins.inapppurchase.f fVar, C0037m c0037m, int i4, Exception exc) {
        AbstractC0352w.i("BillingClient", "Error in acknowledge purchase!", exc);
        L(i4, 3, c0037m, U.a(exc));
        fVar.a(c0037m);
    }

    public final void l(io.flutter.plugins.inapppurchase.f fVar, C0037m c0037m, int i4, Exception exc) {
        L(i4, 14, c0037m, U.a(exc));
        fVar.b(c0037m);
    }

    public final void m(io.flutter.plugins.inapppurchase.f fVar, String str, C0037m c0037m, int i4, String str2, Exception exc) {
        AbstractC0352w.i("BillingClient", str2, exc);
        L(i4, 4, c0037m, U.a(exc));
        fVar.f(c0037m, str);
    }

    public final void n(io.flutter.plugins.inapppurchase.f fVar, C0037m c0037m, int i4, Exception exc) {
        L(i4, 15, c0037m, U.a(exc));
        fVar.d(c0037m, null);
    }

    public final void o(io.flutter.plugins.inapppurchase.f fVar, C0037m c0037m, int i4, Exception exc) {
        AbstractC0352w.i("BillingClient", "getBillingConfig got an exception.", exc);
        L(i4, 13, c0037m, U.a(exc));
        fVar.e(c0037m, null);
    }

    public final void p(io.flutter.plugins.inapppurchase.f fVar, C0037m c0037m, int i4, Exception exc) {
        L(i4, 16, c0037m, U.a(exc));
        fVar.c(c0037m);
    }

    public final void q(C0315f1 c0315f1) {
        try {
            this.f601h.w(c0315f1, this.f606m);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void r(C0321h1 c0321h1) {
        try {
            l2.e eVar = this.f601h;
            int i4 = this.f606m;
            eVar.getClass();
            try {
                n1 n1Var = (n1) ((o1) eVar.f14270b).g();
                n1Var.c();
                o1.p((o1) n1Var.f6024b, i4);
                o1 o1Var = (o1) n1Var.a();
                eVar.f14270b = o1Var;
                try {
                    eVar.H(c0321h1, o1Var);
                } catch (Throwable th) {
                    AbstractC0352w.i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                AbstractC0352w.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void s(int i4, C0037m c0037m) {
        try {
            int i5 = U.f526a;
            C0312e1 c0312e1 = (C0312e1) U.b(i4, 6, c0037m, null, l1.BROADCAST_ACTION_UNSPECIFIED).g();
            C1 r4 = D1.r();
            r4.d(false);
            r4.e();
            c0312e1.e(r4);
            q((C0315f1) c0312e1.a());
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void t(int i4) {
        synchronized (this.f594a) {
            try {
                if (this.f595b == 3) {
                    return;
                }
                int i5 = this.f595b;
                AbstractC0352w.g("BillingClient", "Setting clientState from " + (i5 != 0 ? i5 != 1 ? i5 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i4 != 0 ? i4 != 1 ? i4 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f595b = i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(InterfaceC0030f interfaceC0030f) {
        int i4;
        C0037m c0037m;
        synchronized (this.f594a) {
            try {
                if (y()) {
                    c0037m = D();
                } else if (this.f595b == 1) {
                    AbstractC0352w.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    c0037m = W.f536d;
                    s(37, c0037m);
                } else if (this.f595b == 3) {
                    AbstractC0352w.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c0037m = W.f542j;
                    s(38, c0037m);
                } else {
                    t(1);
                    v();
                    AbstractC0352w.g("BillingClient", "Starting in-app billing setup.");
                    this.f603j = new K(this, interfaceC0030f);
                    C0337o c0337o = this.f603j.f502b;
                    c0337o.f5986c = 0L;
                    c0337o.f5985b = false;
                    c0337o.a();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f600g.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i4 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i4 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC0352w.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f596c);
                                synchronized (this.f594a) {
                                    try {
                                        if (this.f595b == 2) {
                                            c0037m = D();
                                        } else if (this.f595b != 1) {
                                            AbstractC0352w.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c0037m = W.f542j;
                                            s(105, c0037m);
                                        } else {
                                            K k4 = this.f603j;
                                            if (this.f600g.bindService(intent2, k4, 1)) {
                                                AbstractC0352w.g("BillingClient", "Service was bonded successfully.");
                                                c0037m = null;
                                            } else {
                                                AbstractC0352w.h("BillingClient", "Connection to Billing service is blocked.");
                                                i4 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            AbstractC0352w.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    t(0);
                    AbstractC0352w.g("BillingClient", "Billing service unavailable on device.");
                    c0037m = W.f534b;
                    s(i4, c0037m);
                }
            } finally {
            }
        }
        if (c0037m != null) {
            interfaceC0030f.onBillingSetupFinished(c0037m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        synchronized (this.f594a) {
            if (this.f603j != null) {
                try {
                    this.f600g.unbindService(this.f603j);
                } catch (Throwable th) {
                    try {
                        AbstractC0352w.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.f602i = null;
                        this.f603j = null;
                    } finally {
                        this.f602i = null;
                        this.f603j = null;
                    }
                }
            }
        }
    }

    public final boolean w() {
        try {
            AbstractC0352w.g("BillingClient", "Already connected or not opted into auto reconnection.");
            C0037m c0037m = W.f541i;
            TimeUnit.MILLISECONDS.getClass();
            int i4 = c0037m.f633a;
            if (i4 == 0) {
                AbstractC0352w.g("BillingClient", "Reconnection succeeded with result: " + i4);
            } else {
                AbstractC0352w.h("BillingClient", "Reconnection failed with result: " + i4);
            }
        } catch (Exception e4) {
            if (e4 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            AbstractC0352w.i("BillingClient", "Error during reconnection attempt: ", e4);
        }
        return y();
    }

    public final boolean x() {
        AbstractC0124a abstractC0124a = this.f593G;
        if (abstractC0124a == null) {
            throw new NullPointerException("ticker");
        }
        long U4 = abstractC0124a.U();
        long j4 = 30000;
        int i4 = 1;
        long j5 = 30000;
        while (i4 <= 3) {
            try {
            } catch (Exception e4) {
                if (e4 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                AbstractC0352w.i("BillingClient", "Error during reconnection attempt: ", e4);
            }
            if (Math.max(0L, j5) <= 0) {
                AbstractC0352w.h("BillingClient", "No time remaining for reconnection attempt.");
                return y();
            }
            AbstractC0352w.g("BillingClient", "Already connected or not opted into auto reconnection.");
            C0037m c0037m = W.f541i;
            TimeUnit.MILLISECONDS.getClass();
            int i5 = c0037m.f633a;
            if (i5 == 0) {
                AbstractC0352w.g("BillingClient", "Reconnection succeeded with result: " + i5);
                return y();
            }
            AbstractC0352w.h("BillingClient", "Reconnection failed with result: " + i5);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long U5 = (abstractC0124a.U() - U4) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            j5 = j4 - timeUnit.convert(U5, timeUnit2);
            long j6 = j4;
            long pow = ((long) Math.pow(2.0d, i4 - 1)) * 1000;
            if (j5 < pow) {
                AbstractC0352w.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return y();
            }
            if (i4 < 3 && pow > 0) {
                try {
                    Thread.sleep(pow);
                    j5 = j6 - timeUnit.convert((abstractC0124a.U() - U4) + 0, timeUnit2);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    AbstractC0352w.i("BillingClient", "Error sleeping during reconnection attempt: ", e5);
                }
            }
            i4++;
            j4 = j6;
        }
        AbstractC0352w.h("BillingClient", "Max retries reached.");
        return y();
    }

    public final boolean y() {
        boolean z;
        synchronized (this.f594a) {
            try {
                z = false;
                if (this.f595b == 2 && this.f602i != null && this.f603j != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public C0029e(C0038n c0038n, Context context, InterfaceC0047x interfaceC0047x, C c4, C0027c c0027c) {
        long nextLong = new Random().nextLong();
        this.f592F = Long.valueOf(nextLong);
        this.f593G = AbstractC0328k.f5959a;
        this.f596c = "8.0.0";
        String G4 = G();
        this.f597d = G4;
        this.f600g = context.getApplicationContext();
        n1 x4 = o1.x();
        x4.c();
        o1.v((o1) x4.f6024b);
        if (G4 != null) {
            x4.c();
            o1.w((o1) x4.f6024b, G4);
        }
        String packageName = this.f600g.getPackageName();
        x4.c();
        o1.t((o1) x4.f6024b, packageName);
        x4.c();
        o1.q((o1) x4.f6024b, nextLong);
        x4.c();
        o1.u((o1) x4.f6024b);
        int i4 = Build.VERSION.SDK_INT;
        x4.c();
        o1.n((o1) x4.f6024b, i4);
        x4.d();
        try {
            int i5 = this.f600g.getPackageManager().getPackageInfo(this.f600g.getPackageName(), 0).versionCode;
            x4.c();
            o1.o((o1) x4.f6024b, i5);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Error getting app version code.", th);
        }
        this.f601h = new l2.e(this.f600g, (o1) x4.a());
        if (interfaceC0047x == null) {
            AbstractC0352w.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f599f = new a0(this.f600g, interfaceC0047x, c4, this.f601h);
        this.f589C = c0038n;
        this.f590D = c4 != null;
    }

    public C0029e(Context context, C0027c c0027c) {
        long nextLong = new Random().nextLong();
        this.f592F = Long.valueOf(nextLong);
        this.f593G = AbstractC0328k.f5959a;
        this.f596c = "8.0.0";
        String G4 = G();
        this.f597d = G4;
        this.f600g = context.getApplicationContext();
        n1 x4 = o1.x();
        x4.c();
        o1.v((o1) x4.f6024b);
        if (G4 != null) {
            x4.c();
            o1.w((o1) x4.f6024b, G4);
        }
        String packageName = this.f600g.getPackageName();
        x4.c();
        o1.t((o1) x4.f6024b, packageName);
        x4.c();
        o1.q((o1) x4.f6024b, nextLong);
        x4.c();
        o1.u((o1) x4.f6024b);
        int i4 = Build.VERSION.SDK_INT;
        x4.c();
        o1.n((o1) x4.f6024b, i4);
        x4.d();
        try {
            int i5 = this.f600g.getPackageManager().getPackageInfo(this.f600g.getPackageName(), 0).versionCode;
            x4.c();
            o1.o((o1) x4.f6024b, i5);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Error getting app version code.", th);
        }
        this.f601h = new l2.e(this.f600g, (o1) x4.a());
        this.f600g.getPackageName();
    }

    public C0029e(C0038n c0038n, Context context, C0027c c0027c) {
        long nextLong = new Random().nextLong();
        this.f592F = Long.valueOf(nextLong);
        this.f593G = AbstractC0328k.f5959a;
        this.f596c = "8.0.0";
        String G4 = G();
        this.f597d = G4;
        this.f600g = context.getApplicationContext();
        n1 x4 = o1.x();
        x4.c();
        o1.v((o1) x4.f6024b);
        if (G4 != null) {
            x4.c();
            o1.w((o1) x4.f6024b, G4);
        }
        String packageName = this.f600g.getPackageName();
        x4.c();
        o1.t((o1) x4.f6024b, packageName);
        x4.c();
        o1.q((o1) x4.f6024b, nextLong);
        x4.c();
        o1.u((o1) x4.f6024b);
        int i4 = Build.VERSION.SDK_INT;
        x4.c();
        o1.n((o1) x4.f6024b, i4);
        x4.d();
        try {
            int i5 = this.f600g.getPackageManager().getPackageInfo(this.f600g.getPackageName(), 0).versionCode;
            x4.c();
            o1.o((o1) x4.f6024b, i5);
        } catch (Throwable th) {
            AbstractC0352w.i("BillingClient", "Error getting app version code.", th);
        }
        this.f601h = new l2.e(this.f600g, (o1) x4.a());
        AbstractC0352w.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f599f = new a0(this.f600g, null, null, this.f601h);
        this.f589C = c0038n;
        this.f600g.getPackageName();
    }
}
