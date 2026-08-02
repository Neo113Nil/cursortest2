package n0;

import E1.AbstractActivityC0029e;
import U1.C0084e;
import a0.C0130a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.internal.play_billing.AbstractC0216d1;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.AbstractC0250p;
import com.google.android.gms.internal.play_billing.C0208b;
import com.google.android.gms.internal.play_billing.C0279z;
import com.google.android.gms.internal.play_billing.InterfaceC0214d;
import com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC0280z0;
import com.google.android.gms.internal.play_billing.N0;
import com.google.android.gms.internal.play_billing.O0;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import com.google.android.gms.internal.play_billing.Z1;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.c2;
import com.google.android.gms.internal.play_billing.e2;
import com.google.android.gms.internal.play_billing.n2;
import com.google.android.gms.internal.play_billing.o2;
import f0.C0322a;
import i1.C0342b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
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
import java.util.function.Function;
import java.util.function.Predicate;
import n0.C1145g;
import n0.C1152n;

/* renamed from: n0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1143e extends AbstractC1142d {

    /* renamed from: A, reason: collision with root package name */
    public final C0342b f10060A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f10061B;

    /* renamed from: C, reason: collision with root package name */
    public ExecutorService f10062C;

    /* renamed from: D, reason: collision with root package name */
    public volatile InterfaceExecutorServiceC0280z0 f10063D;

    /* renamed from: E, reason: collision with root package name */
    public final Long f10064E;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10065a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f10066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10067c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f10068d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1137Q f10069e;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final C0322a f10070g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC0214d f10071h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ServiceConnectionC1164z f10072i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10073j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10074k;

    /* renamed from: l, reason: collision with root package name */
    public int f10075l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10076m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10077n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10078p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10079q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10080r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10081s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10082t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10083u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10084w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10085x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10086y;
    public boolean z;

    public C1143e(Context context) {
        this.f10065a = new Object();
        this.f10066b = 0;
        this.f10068d = new Handler(Looper.getMainLooper());
        this.f10075l = 0;
        long nextLong = new Random().nextLong();
        this.f10064E = Long.valueOf(nextLong);
        String p3 = p();
        this.f10067c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2860b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2860b, packageName);
        r3.d();
        a2.o((a2) r3.f2860b, nextLong);
        this.f10070g = new C0322a(this.f, (a2) r3.b());
        this.f.getPackageName();
    }

    public static Future m(Callable callable, long j3, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new B.a(submit, 12, runnable), (long) (j3 * 0.95d));
            return submit;
        } catch (Exception e3) {
            AbstractC0248o0.h("BillingClient", "Async task throws exception!", e3);
            return null;
        }
    }

    public static String p() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    public final void A(B0.g gVar, C1147i c1147i, int i3, Exception exc) {
        I(i3, 14, c1147i, AbstractC1133M.a(exc));
        ((C0084e) gVar.f131b).a(S0.a.j(c1147i));
    }

    public final void B(B0.g gVar, C1147i c1147i, int i3, String str, Exception exc) {
        AbstractC0248o0.h("BillingClient", str, exc);
        I(i3, 4, c1147i, AbstractC1133M.a(exc));
        ((C0084e) gVar.f131b).a(S0.a.j(c1147i));
    }

    public final void C(B0.g gVar, C1147i c1147i, int i3, Exception exc) {
        I(i3, 15, c1147i, AbstractC1133M.a(exc));
        gVar.c(c1147i);
    }

    public final Handler D() {
        return Looper.myLooper() == null ? this.f10068d : new Handler(Looper.myLooper());
    }

    public final C1147i E() {
        AbstractC0248o0.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        R1 q3 = S1.q();
        q3.d();
        S1.p((S1) q3.f2860b, 6);
        n2 o = o2.o();
        o.d();
        o2.n((o2) o.f2860b);
        q3.d();
        S1.o((S1) q3.f2860b, (o2) o.b());
        s((S1) q3.b());
        return AbstractC1135O.f10025j;
    }

    public final void F(B0.g gVar, C1147i c1147i, int i3, Exception exc) {
        AbstractC0248o0.h("BillingClient", "getBillingConfig got an exception.", exc);
        I(i3, 13, c1147i, AbstractC1133M.a(exc));
        gVar.d(c1147i);
    }

    public final void G(B0.g gVar, C1147i c1147i, int i3, Exception exc) {
        I(i3, 16, c1147i, AbstractC1133M.a(exc));
        ((C0084e) gVar.f131b).a(S0.a.j(c1147i));
    }

    public final void H(int i3, int i4, C1147i c1147i) {
        try {
            r(AbstractC1133M.b(i3, i4, c1147i));
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void I(int i3, int i4, C1147i c1147i, String str) {
        try {
            r(AbstractC1133M.c(i3, i4, c1147i, str));
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void J(int i3) {
        try {
            s(AbstractC1133M.d(i3));
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(C1147i c1147i) {
        if (Thread.interrupted()) {
            return;
        }
        this.f10068d.post(new B.a(this, 16, c1147i));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // n0.AbstractC1142d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        J(12);
        synchronized (this.f10065a) {
            try {
                try {
                    if (this.f10069e != null) {
                        C1137Q c1137q = this.f10069e;
                        C1136P c1136p = c1137q.f10046e;
                        Context context = c1137q.f10042a;
                        c1136p.b(context);
                        c1137q.f.b(context);
                    }
                } finally {
                    AbstractC0248o0.f("BillingClient", "Unbinding from service.");
                    u();
                    synchronized (this) {
                    }
                }
                synchronized (this) {
                    ExecutorService executorService = this.f10062C;
                    if (executorService != null) {
                        executorService.shutdownNow();
                        this.f10062C = null;
                        this.f10063D = null;
                    }
                }
            } finally {
                try {
                } finally {
                }
            }
            try {
                AbstractC0248o0.f("BillingClient", "Unbinding from service.");
                u();
            } catch (Throwable th) {
                AbstractC0248o0.h("BillingClient", "There was an exception while unbinding from the service while ending connection!", th);
            }
        }
    }

    @Override // n0.AbstractC1142d
    public final boolean b() {
        boolean z;
        synchronized (this.f10065a) {
            try {
                z = false;
                if (this.f10066b == 2 && this.f10071h != null && this.f10072i != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // n0.AbstractC1142d
    public void c(b0.s sVar, InterfaceC1153o interfaceC1153o) {
        if (!b()) {
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 7, c1147i);
            interfaceC1153o.onProductDetailsResponse(c1147i, new ArrayList());
        } else {
            if (!this.f10082t) {
                AbstractC0248o0.g("BillingClient", "Querying product details is not supported.");
                C1147i c1147i2 = AbstractC1135O.f10034t;
                H(20, 7, c1147i2);
                interfaceC1153o.onProductDetailsResponse(c1147i2, new ArrayList());
                return;
            }
            if (m(new CallableC1159u(this, sVar, interfaceC1153o, 1), 30000L, new B.a(this, 15, interfaceC1153o), D(), q()) == null) {
                C1147i n3 = n();
                H(25, 7, n3);
                interfaceC1153o.onProductDetailsResponse(n3, new ArrayList());
            }
        }
    }

    @Override // n0.AbstractC1142d
    public final void d(C1148j c1148j, InterfaceC1155q interfaceC1155q) {
        int i3 = 2;
        if (!b()) {
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 9, c1147i);
            C0279z c0279z = com.google.android.gms.internal.play_billing.C.f2714b;
            interfaceC1155q.onQueryPurchasesResponse(c1147i, com.google.android.gms.internal.play_billing.Q.f2774e);
            return;
        }
        String str = c1148j.f10095b;
        if (TextUtils.isEmpty(str)) {
            AbstractC0248o0.g("BillingClient", "Please provide a valid product type.");
            C1147i c1147i2 = AbstractC1135O.f;
            H(50, 9, c1147i2);
            C0279z c0279z2 = com.google.android.gms.internal.play_billing.C.f2714b;
            interfaceC1155q.onQueryPurchasesResponse(c1147i2, com.google.android.gms.internal.play_billing.Q.f2774e);
            return;
        }
        if (m(new CallableC1159u(this, str, interfaceC1155q, i3), 30000L, new B.a(this, 10, interfaceC1155q), D(), q()) == null) {
            C1147i n3 = n();
            H(25, 9, n3);
            C0279z c0279z3 = com.google.android.gms.internal.play_billing.C.f2714b;
            interfaceC1155q.onQueryPurchasesResponse(n3, com.google.android.gms.internal.play_billing.Q.f2774e);
        }
    }

    public void e(C1140b c1140b, B0.g gVar) {
        if (!b()) {
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 3, c1147i);
            gVar.b(c1147i);
            return;
        }
        if (TextUtils.isEmpty(c1140b.f10054a)) {
            AbstractC0248o0.g("BillingClient", "Please provide a valid purchase token.");
            C1147i c1147i2 = AbstractC1135O.f10023h;
            H(26, 3, c1147i2);
            gVar.b(c1147i2);
            return;
        }
        if (!this.o) {
            C1147i c1147i3 = AbstractC1135O.f10018b;
            H(27, 3, c1147i3);
            gVar.b(c1147i3);
        } else if (m(new CallableC1159u(this, gVar, c1140b, 5), 30000L, new B.a(this, 18, gVar), D(), q()) == null) {
            C1147i n3 = n();
            H(25, 3, n3);
            gVar.b(n3);
        }
    }

    public void f(B0.g gVar, C1148j c1148j) {
        boolean b3 = b();
        C0084e c0084e = (C0084e) gVar.f131b;
        if (!b3) {
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 4, c1147i);
            c0084e.a(S0.a.j(c1147i));
        } else if (m(new CallableC1159u(this, c1148j, gVar, 0), 30000L, new B.a(this, gVar, c1148j), D(), q()) == null) {
            C1147i n3 = n();
            H(25, 4, n3);
            c0084e.a(S0.a.j(n3));
        }
    }

    public final void g(B0.g gVar) {
        if (!b()) {
            C(gVar, AbstractC1135O.f10026k, 2, null);
            return;
        }
        if (!this.f10085x) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            C(gVar, AbstractC1135O.f10014C, 66, null);
        } else if (m(new J1.b(this, gVar, 3), 30000L, new B.a(this, 20, gVar), D(), q()) == null) {
            C(gVar, n(), 25, null);
        }
    }

    public final void h(B0.g gVar) {
        if (!b()) {
            AbstractC0248o0.g("BillingClient", "Service disconnected.");
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 13, c1147i);
            gVar.d(c1147i);
            return;
        }
        if (!this.f10083u) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support get billing config.");
            C1147i c1147i2 = AbstractC1135O.f10038y;
            H(32, 13, c1147i2);
            gVar.d(c1147i2);
            return;
        }
        if (m(new J1.b(this, gVar, 2), 30000L, new B.a(this, 19, gVar), D(), q()) == null) {
            C1147i n3 = n();
            H(25, 13, n3);
            gVar.d(n3);
        }
    }

    public final void i(B0.g gVar) {
        if (!b()) {
            A(gVar, AbstractC1135O.f10026k, 2, null);
            return;
        }
        if (!this.f10085x) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support alternative billing only.");
            A(gVar, AbstractC1135O.f10014C, 66, null);
        } else if (m(new J1.b(this, gVar, 1), 30000L, new B.a(this, 11, gVar), D(), q()) == null) {
            A(gVar, n(), 25, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r29.f944a == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x063b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1147i j(AbstractActivityC0029e abstractActivityC0029e, final M0.o oVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C1147i a3;
        String str5;
        String str6;
        Future m3;
        Object obj;
        int m4;
        int i3;
        String string;
        String str7;
        boolean z;
        String str8;
        String str9;
        C1145g c1145g;
        String str10;
        boolean z2;
        String str11;
        int i4;
        final int i5;
        final C1143e c1143e = this;
        if (c1143e.f10069e == null || c1143e.f10069e.f10043b == null) {
            C1147i c1147i = AbstractC1135O.f10015D;
            c1143e.H(12, 2, c1147i);
            return c1147i;
        }
        if (!c1143e.b()) {
            C1147i c1147i2 = AbstractC1135O.f10026k;
            c1143e.H(2, 2, c1147i2);
            c1143e.K(c1147i2);
            return c1147i2;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) oVar.f);
        com.google.android.gms.internal.play_billing.C c3 = (com.google.android.gms.internal.play_billing.C) oVar.f948e;
        Iterator it = arrayList.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        C0279z c0279z = (C0279z) c3.iterator();
        C1145g c1145g2 = (C1145g) (c0279z.hasNext() ? c0279z.next() : null);
        C1152n c1152n = c1145g2.f10087a;
        String str12 = c1152n.f10113c;
        String str13 = c1152n.f10114d;
        if (str13.equals("subs") && !c1143e.f10073j) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support subscriptions.");
            C1147i c1147i3 = AbstractC1135O.f10028m;
            c1143e.H(9, 2, c1147i3);
            c1143e.K(c1147i3);
            return c1147i3;
        }
        if (((String) oVar.f945b) == null && ((String) oVar.f946c) == null) {
            C0130a c0130a = (C0130a) oVar.f947d;
            c0130a.getClass();
            if (c0130a.f1920b == 0) {
                if (!((com.google.android.gms.internal.play_billing.C) oVar.f948e).stream().anyMatch(new C1131K())) {
                }
            }
        }
        if (!c1143e.f10076m) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support extra params for buy intent.");
            C1147i c1147i4 = AbstractC1135O.f10022g;
            c1143e.H(18, 2, c1147i4);
            c1143e.K(c1147i4);
            return c1147i4;
        }
        if (arrayList.size() > 1 && !c1143e.f10081s) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support multi-item purchases.");
            C1147i c1147i5 = AbstractC1135O.f10032r;
            c1143e.H(19, 2, c1147i5);
            c1143e.K(c1147i5);
            return c1147i5;
        }
        if (!c3.isEmpty() && !c1143e.f10082t) {
            AbstractC0248o0.g("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C1147i c1147i6 = AbstractC1135O.f10034t;
            c1143e.H(20, 2, c1147i6);
            c1143e.K(c1147i6);
            return c1147i6;
        }
        if (((com.google.android.gms.internal.play_billing.C) oVar.f948e).isEmpty()) {
            a3 = AbstractC1135O.f10025j;
            str2 = str13;
            str4 = "BUY_INTENT";
            str3 = str12;
            str = null;
        } else {
            C1145g c1145g3 = (C1145g) ((com.google.android.gms.internal.play_billing.C) oVar.f948e).get(0);
            int i6 = 1;
            while (true) {
                str = null;
                if (i6 < ((com.google.android.gms.internal.play_billing.C) oVar.f948e).size()) {
                    C1145g c1145g4 = (C1145g) ((com.google.android.gms.internal.play_billing.C) oVar.f948e).get(i6);
                    str2 = str13;
                    if (!c1145g4.f10087a.f10114d.equals(c1145g3.f10087a.f10114d) && !c1145g4.f10087a.f10114d.equals("play_pass_subs")) {
                        a3 = AbstractC1135O.a(5, "All products should have same ProductType.");
                        str4 = "BUY_INTENT";
                        str3 = str12;
                        break;
                    }
                    i6++;
                    str13 = str2;
                } else {
                    str2 = str13;
                    String optString = c1145g3.f10087a.f10112b.optString("packageName");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    str3 = str12;
                    com.google.android.gms.internal.play_billing.C c4 = (com.google.android.gms.internal.play_billing.C) oVar.f948e;
                    int size = c4.size();
                    str4 = "BUY_INTENT";
                    int i7 = 0;
                    while (true) {
                        C1152n c1152n2 = c1145g3.f10087a;
                        C1145g c1145g5 = c1145g3;
                        if (i7 < size) {
                            int i8 = i7;
                            C1145g c1145g6 = (C1145g) c4.get(i7);
                            com.google.android.gms.internal.play_billing.C c5 = c4;
                            int i9 = size;
                            c1145g6.f10087a.f10114d.equals("subs");
                            C1152n c1152n3 = c1145g6.f10087a;
                            String str14 = c1152n3.f10113c;
                            if (!hashSet.contains(str14)) {
                                hashSet.add(str14);
                                if (!c1152n2.f10114d.equals("play_pass_subs") && !c1152n3.f10114d.equals("play_pass_subs") && !optString.equals(c1152n3.f10112b.optString("packageName"))) {
                                    a3 = AbstractC1135O.a(5, "All products must have the same package name.");
                                    break;
                                }
                                i7 = i8 + 1;
                                c1145g3 = c1145g5;
                                c4 = c5;
                                size = i9;
                            } else {
                                a3 = AbstractC1135O.a(5, "ProductId can not be duplicated. Invalid product id: " + str14 + ".");
                                break;
                            }
                        } else {
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str15 = (String) it2.next();
                                    if (hashSet.contains(str15)) {
                                        a3 = AbstractC1135O.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str15 + ".");
                                        break;
                                    }
                                } else {
                                    C1149k a4 = c1152n2.a();
                                    a3 = (a4 == null || a4.f == null) ? AbstractC1135O.f10025j : AbstractC1135O.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                }
                            }
                        }
                    }
                }
            }
        }
        if (a3 != AbstractC1135O.f10025j) {
            c1143e.H(120, 2, a3);
            c1143e.K(a3);
            return a3;
        }
        if (c1143e.f10076m) {
            boolean z3 = c1143e.o;
            boolean z4 = c1143e.v;
            c1143e.f10060A.getClass();
            boolean z5 = c1143e.f10060A.f5087a;
            boolean z6 = c1143e.f10061B;
            String str16 = c1143e.f10067c;
            long longValue = c1143e.f10064E.longValue();
            final String packageName = c1143e.f.getPackageName();
            final Bundle bundle = new Bundle();
            AbstractC0248o0.b(bundle, str16, longValue);
            int i10 = ((C0130a) oVar.f947d).f1920b;
            if (i10 != 0) {
                bundle.putInt("prorationMode", i10);
            }
            if (!TextUtils.isEmpty((String) oVar.f945b)) {
                bundle.putString("accountId", (String) oVar.f945b);
            }
            if (!TextUtils.isEmpty((String) oVar.f946c)) {
                bundle.putString("obfuscatedProfileId", (String) oVar.f946c);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str)));
            }
            if (!TextUtils.isEmpty(((C0130a) oVar.f947d).f1919a)) {
                bundle.putString("oldSkuPurchaseToken", ((C0130a) oVar.f947d).f1919a);
            }
            if (TextUtils.isEmpty(str)) {
                str7 = str;
            } else {
                str7 = str;
                bundle.putString("oldSkuPurchaseId", str7);
            }
            ((C0130a) oVar.f947d).getClass();
            if (!TextUtils.isEmpty(str7)) {
                ((C0130a) oVar.f947d).getClass();
                bundle.putString("originalExternalTransactionId", str7);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("paymentsPurchaseParams", str7);
            }
            if (z3) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && z5) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z6) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            final int i11 = 0;
            if (((com.google.android.gms.internal.play_billing.C) oVar.f948e).stream().anyMatch(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    switch (i11) {
                        case 0:
                            int i12 = AbstractC0248o0.f2894a;
                            break;
                        default:
                            int i13 = AbstractC0248o0.f2894a;
                            break;
                    }
                    return false;
                }
            })) {
                N0 n3 = O0.n();
                final int i12 = 1;
                Iterable iterable = (Iterable) ((com.google.android.gms.internal.play_billing.C) oVar.f948e).stream().filter(new Predicate() { // from class: com.google.android.gms.internal.play_billing.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        switch (i12) {
                            case 0:
                                int i122 = AbstractC0248o0.f2894a;
                                break;
                            default:
                                int i13 = AbstractC0248o0.f2894a;
                                break;
                        }
                        return false;
                    }
                }).map(new Function() { // from class: com.google.android.gms.internal.play_billing.s
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i13 = AbstractC0248o0.f2894a;
                        C1152n c1152n4 = ((C1145g) obj2).f10087a;
                        L0 n4 = M0.n();
                        P0 n5 = Q0.n();
                        String str17 = "subs:" + packageName + StringUtils.PROCESS_POSTFIX_DELIMITER + c1152n4.f10113c;
                        n5.d();
                        Q0.o((Q0) n5.f2860b, str17);
                        n4.d();
                        M0.o((M0) n4.f2860b, (Q0) n5.b());
                        Q0.n();
                        throw null;
                    }
                }).collect(AbstractC0250p.f2905a);
                n3.d();
                O0.o((O0) n3.f2860b, iterable);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((O0) n3.b()).b());
            }
            if (arrayList.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(c3.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(c3.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                str8 = "proxyPackageVersion";
                str9 = "BillingClient";
                int i13 = 0;
                while (i13 < c3.size()) {
                    C1145g c1145g7 = (C1145g) c3.get(i13);
                    C1145g c1145g8 = c1145g2;
                    C1152n c1152n4 = c1145g7.f10087a;
                    if (!c1152n4.f10117h.isEmpty()) {
                        arrayList4.add(c1152n4.f10117h);
                    }
                    arrayList5.add(c1145g7.f10088b);
                    String str17 = c1152n4.f10118i;
                    ArrayList arrayList8 = c1152n4.f10120k;
                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                        Iterator it3 = c1152n4.f10120k.iterator();
                        while (it3.hasNext()) {
                            C1149k c1149k = (C1149k) it3.next();
                            String str18 = str17;
                            if (!TextUtils.isEmpty(c1149k.f10100e)) {
                                str10 = c1149k.f10100e;
                                break;
                            }
                            str17 = str18;
                        }
                    }
                    str10 = str17;
                    if (!TextUtils.isEmpty(str10)) {
                        arrayList6.add(str10);
                    }
                    if (i13 > 0) {
                        arrayList2.add(((C1145g) c3.get(i13)).f10087a.f10113c);
                        arrayList3.add(((C1145g) c3.get(i13)).f10087a.f10114d);
                    }
                    i13++;
                    c1145g2 = c1145g8;
                }
                c1145g = c1145g2;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                bundle.putIntegerArrayList("AUTO_PAY_BALANCE_THRESHOLD_LIST", arrayList7);
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                }
            } else {
                ArrayList<String> arrayList9 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it4 = arrayList.iterator();
                if (it4.hasNext()) {
                    it4.next().getClass();
                    throw new ClassCastException();
                }
                if (!arrayList9.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList9);
                }
                if (arrayList.size() > 1) {
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayList.size() - 1);
                    ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                    if (1 < arrayList.size()) {
                        arrayList.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList10);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList11);
                }
                str8 = "proxyPackageVersion";
                c1145g = c1145g2;
                str9 = "BillingClient";
            }
            c1143e = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !c1143e.f10079q) {
                C1147i c1147i7 = AbstractC1135O.f10033s;
                c1143e.H(21, 2, c1147i7);
                c1143e.K(c1147i7);
                return c1147i7;
            }
            C1145g c1145g9 = c1145g;
            if (TextUtils.isEmpty(c1145g9.f10087a.f10112b.optString("packageName"))) {
                z2 = false;
            } else {
                bundle.putString("skuPackageName", c1145g9.f10087a.f10112b.optString("packageName"));
                z2 = true;
            }
            str6 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = abstractActivityC0029e.getIntent();
            if (intent == null) {
                str5 = str9;
                AbstractC0248o0.g(str5, "Activity's intent is null.");
            } else {
                str5 = str9;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str11 = str8;
                        try {
                            bundle.putString(str11, c1143e.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str11, "package not found");
                            if (!c1143e.f10082t) {
                            }
                            if (!c1143e.f10080r) {
                            }
                            if (c1143e.o) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str11 = str8;
                    }
                }
            }
            if (!c1143e.f10082t && !c3.isEmpty()) {
                i4 = 17;
            } else if (!c1143e.f10080r && z2) {
                i4 = 15;
            } else if (c1143e.o) {
                i4 = 6;
            } else {
                i5 = 9;
                final String str19 = str2;
                final String str20 = str3;
                m3 = m(new Callable(i5, str20, str19, oVar, bundle) { // from class: n0.v

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f10131b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f10132c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f10133d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ Bundle f10134e;

                    {
                        this.f10134e = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle i14;
                        InterfaceC0214d interfaceC0214d;
                        C1143e c1143e2 = C1143e.this;
                        int i15 = this.f10131b;
                        String str21 = this.f10132c;
                        String str22 = this.f10133d;
                        Bundle bundle2 = this.f10134e;
                        try {
                            synchronized (c1143e2.f10065a) {
                                interfaceC0214d = c1143e2.f10071h;
                            }
                            if (interfaceC0214d == null) {
                                return AbstractC0248o0.i(AbstractC1135O.f10026k, 119);
                            }
                            return ((C0208b) interfaceC0214d).h(i15, c1143e2.f.getPackageName(), str21, str22, bundle2);
                        } catch (DeadObjectException e3) {
                            C1147i c1147i8 = AbstractC1135O.f10026k;
                            String a5 = AbstractC1133M.a(e3);
                            i14 = AbstractC0248o0.i(c1147i8, 5);
                            if (a5 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a5);
                            }
                            return i14;
                        } catch (Exception e4) {
                            C1147i c1147i9 = AbstractC1135O.f10024i;
                            String a6 = AbstractC1133M.a(e4);
                            i14 = AbstractC0248o0.i(c1147i9, 5);
                            if (a6 != null) {
                                i14.putString("ADDITIONAL_LOG_DETAILS", a6);
                            }
                            return i14;
                        }
                    }
                }, 5000L, null, c1143e.f10068d, c1143e.q());
            }
            i5 = i4;
            final String str192 = str2;
            final String str202 = str3;
            m3 = m(new Callable(i5, str202, str192, oVar, bundle) { // from class: n0.v

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f10131b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f10132c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f10133d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Bundle f10134e;

                {
                    this.f10134e = bundle;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle i14;
                    InterfaceC0214d interfaceC0214d;
                    C1143e c1143e2 = C1143e.this;
                    int i15 = this.f10131b;
                    String str21 = this.f10132c;
                    String str22 = this.f10133d;
                    Bundle bundle2 = this.f10134e;
                    try {
                        synchronized (c1143e2.f10065a) {
                            interfaceC0214d = c1143e2.f10071h;
                        }
                        if (interfaceC0214d == null) {
                            return AbstractC0248o0.i(AbstractC1135O.f10026k, 119);
                        }
                        return ((C0208b) interfaceC0214d).h(i15, c1143e2.f.getPackageName(), str21, str22, bundle2);
                    } catch (DeadObjectException e3) {
                        C1147i c1147i8 = AbstractC1135O.f10026k;
                        String a5 = AbstractC1133M.a(e3);
                        i14 = AbstractC0248o0.i(c1147i8, 5);
                        if (a5 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a5);
                        }
                        return i14;
                    } catch (Exception e4) {
                        C1147i c1147i9 = AbstractC1135O.f10024i;
                        String a6 = AbstractC1133M.a(e4);
                        i14 = AbstractC0248o0.i(c1147i9, 5);
                        if (a6 != null) {
                            i14.putString("ADDITIONAL_LOG_DETAILS", a6);
                        }
                        return i14;
                    }
                }
            }, 5000L, null, c1143e.f10068d, c1143e.q());
        } else {
            str5 = "BillingClient";
            str6 = str;
            m3 = m(new CallableC1159u(c1143e, str3, str2, 4), 5000L, null, c1143e.f10068d, c1143e.q());
        }
        try {
            if (m3 == null) {
                C1147i c1147i8 = AbstractC1135O.f10020d;
                c1143e.H(25, 2, c1147i8);
                c1143e.K(c1147i8);
                return c1147i8;
            }
            Bundle bundle2 = (Bundle) m3.get(5000L, TimeUnit.MILLISECONDS);
            int a5 = AbstractC0248o0.a(bundle2, str5);
            String e3 = AbstractC0248o0.e(bundle2, str5);
            if (a5 == 0) {
                Intent intent2 = new Intent(abstractActivityC0029e, (Class<?>) ProxyBillingActivity.class);
                String str21 = str4;
                intent2.putExtra(str21, (PendingIntent) bundle2.getParcelable(str21));
                abstractActivityC0029e.startActivity(intent2);
                return AbstractC1135O.f10025j;
            }
            AbstractC0248o0.g(str5, "Unable to buy item, Error response code: " + a5);
            C1147i a6 = AbstractC1135O.a(a5, e3);
            if (bundle2 != null) {
                try {
                    obj = bundle2.get("LOG_REASON");
                } catch (Throwable th) {
                    AbstractC0248o0.g(str5, "Failed to get log reason from bundle: ".concat(String.valueOf(th.getMessage())));
                }
                if (obj != null) {
                    if (obj instanceof Integer) {
                        m4 = AbstractC0216d1.m(((Integer) obj).intValue());
                        i3 = 1;
                        if (m4 == i3) {
                            m4 = 23;
                        }
                        if (bundle2 != null) {
                            try {
                                string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                            } catch (Throwable th2) {
                                AbstractC0248o0.g(str5, "Failed to get additional log details from bundle: ".concat(String.valueOf(th2.getMessage())));
                            }
                            c1143e.I(m4, 2, a6, string);
                            c1143e.K(a6);
                            return a6;
                        }
                        string = str6;
                        c1143e.I(m4, 2, a6, string);
                        c1143e.K(a6);
                        return a6;
                    }
                    AbstractC0248o0.g(str5, "Unexpected type for bundle log reason: " + obj.getClass().getName());
                }
            }
            i3 = 1;
            m4 = 1;
            if (m4 == i3) {
            }
            if (bundle2 != null) {
            }
            string = str6;
            c1143e.I(m4, 2, a6, string);
            c1143e.K(a6);
            return a6;
        } catch (CancellationException e4) {
            e = e4;
            AbstractC0248o0.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            C1147i c1147i9 = AbstractC1135O.f10027l;
            c1143e.I(4, 2, c1147i9, AbstractC1133M.a(e));
            c1143e.K(c1147i9);
            return c1147i9;
        } catch (TimeoutException e5) {
            e = e5;
            AbstractC0248o0.h(str5, "Time out while launching billing flow. Try to reconnect", e);
            C1147i c1147i92 = AbstractC1135O.f10027l;
            c1143e.I(4, 2, c1147i92, AbstractC1133M.a(e));
            c1143e.K(c1147i92);
            return c1147i92;
        } catch (Exception e6) {
            AbstractC0248o0.h(str5, "Exception while launching billing flow. Try to reconnect", e6);
            C1147i c1147i10 = AbstractC1135O.f10026k;
            c1143e.I(5, 2, c1147i10, AbstractC1133M.a(e6));
            c1143e.K(c1147i10);
            return c1147i10;
        }
    }

    public final C1147i k(final AbstractActivityC0029e abstractActivityC0029e, final B0.g gVar) {
        if (abstractActivityC0029e == null) {
            throw new IllegalArgumentException("Please provide a valid activity.");
        }
        if (!b()) {
            C1147i c1147i = AbstractC1135O.f10026k;
            H(2, 16, c1147i);
            return c1147i;
        }
        if (!this.f10085x) {
            AbstractC0248o0.g("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            C1147i c1147i2 = AbstractC1135O.f10014C;
            H(66, 16, c1147i2);
            return c1147i2;
        }
        Handler handler = this.f10068d;
        final ResultReceiverC1162x resultReceiverC1162x = new ResultReceiverC1162x(this, handler, gVar);
        if (m(new Callable() { // from class: n0.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC0214d interfaceC0214d;
                C1143e c1143e = C1143e.this;
                B0.g gVar2 = gVar;
                AbstractActivityC0029e abstractActivityC0029e2 = abstractActivityC0029e;
                ResultReceiverC1162x resultReceiverC1162x2 = resultReceiverC1162x;
                c1143e.getClass();
                try {
                    synchronized (c1143e.f10065a) {
                        interfaceC0214d = c1143e.f10071h;
                    }
                    if (interfaceC0214d == null) {
                        c1143e.G(gVar2, AbstractC1135O.f10026k, 119, null);
                        return null;
                    }
                    String packageName = c1143e.f.getPackageName();
                    String str = c1143e.f10067c;
                    long longValue = c1143e.f10064E.longValue();
                    int i3 = AbstractC0248o0.f2894a;
                    Bundle bundle = new Bundle();
                    AbstractC0248o0.b(bundle, str, longValue);
                    ((C0208b) interfaceC0214d).n(packageName, bundle, new BinderC1122B(new WeakReference(abstractActivityC0029e2), resultReceiverC1162x2));
                    return null;
                } catch (DeadObjectException e3) {
                    c1143e.G(gVar2, AbstractC1135O.f10026k, 74, e3);
                    return null;
                } catch (Exception e4) {
                    c1143e.G(gVar2, AbstractC1135O.f10024i, 74, e4);
                    return null;
                }
            }
        }, 30000L, new B.a(this, 17, gVar), handler, q()) != null) {
            return AbstractC1135O.f10025j;
        }
        C1147i n3 = n();
        H(25, 16, n3);
        return n3;
    }

    public void l(InterfaceC1144f interfaceC1144f) {
        C1147i c1147i;
        synchronized (this.f10065a) {
            try {
                if (b()) {
                    c1147i = E();
                } else if (this.f10066b == 1) {
                    AbstractC0248o0.g("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1147i = AbstractC1135O.f10021e;
                    H(37, 6, c1147i);
                } else if (this.f10066b == 3) {
                    AbstractC0248o0.g("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1147i = AbstractC1135O.f10026k;
                    H(38, 6, c1147i);
                } else {
                    t(1);
                    u();
                    AbstractC0248o0.f("BillingClient", "Starting in-app billing setup.");
                    this.f10072i = new ServiceConnectionC1164z(this, interfaceC1144f);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                    int i3 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i3 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                AbstractC0248o0.g("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f10067c);
                                synchronized (this.f10065a) {
                                    try {
                                        if (this.f10066b == 2) {
                                            c1147i = E();
                                        } else if (this.f10066b != 1) {
                                            AbstractC0248o0.g("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1147i = AbstractC1135O.f10026k;
                                            H(117, 6, c1147i);
                                        } else {
                                            ServiceConnectionC1164z serviceConnectionC1164z = this.f10072i;
                                            if (this.f.bindService(intent2, serviceConnectionC1164z, 1)) {
                                                AbstractC0248o0.f("BillingClient", "Service was bonded successfully.");
                                                c1147i = null;
                                            } else {
                                                AbstractC0248o0.g("BillingClient", "Connection to Billing service is blocked.");
                                                i3 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            AbstractC0248o0.g("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    t(0);
                    AbstractC0248o0.f("BillingClient", "Billing service unavailable on device.");
                    c1147i = AbstractC1135O.f10019c;
                    H(i3, 6, c1147i);
                }
            } finally {
            }
        }
        if (c1147i != null) {
            interfaceC1144f.onBillingSetupFinished(c1147i);
        }
    }

    public final C1147i n() {
        int[] iArr = {0, 3};
        synchronized (this.f10065a) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.f10066b == iArr[i3]) {
                    return AbstractC1135O.f10026k;
                }
            }
            return AbstractC1135O.f10024i;
        }
    }

    public final void o() {
        if (TextUtils.isEmpty(null)) {
            this.f.getPackageName();
        }
    }

    public final synchronized ExecutorService q() {
        try {
            if (this.f10062C == null) {
                this.f10062C = Executors.newFixedThreadPool(AbstractC0248o0.f2894a, new ThreadFactoryC1161w());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10062C;
    }

    public final void r(Q1 q12) {
        try {
            this.f10070g.w(q12, this.f10075l);
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th);
        }
    }

    public final void s(S1 s12) {
        try {
            C0322a c0322a = this.f10070g;
            int i3 = this.f10075l;
            c0322a.getClass();
            try {
                Z1 z12 = (Z1) ((a2) c0322a.f4977b).g();
                z12.d();
                a2.n((a2) z12.f2860b, i3);
                c0322a.f4977b = (a2) z12.b();
                c0322a.x(s12);
            } catch (Throwable th) {
                AbstractC0248o0.h("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            AbstractC0248o0.h("BillingClient", "Unable to log.", th2);
        }
    }

    public final void t(int i3) {
        synchronized (this.f10065a) {
            try {
                if (this.f10066b == 3) {
                    return;
                }
                int i4 = this.f10066b;
                AbstractC0248o0.f("BillingClient", "Setting clientState from " + (i4 != 0 ? i4 != 1 ? i4 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i3 != 0 ? i3 != 1 ? i3 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f10066b = i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        synchronized (this.f10065a) {
            if (this.f10072i != null) {
                try {
                    this.f.unbindService(this.f10072i);
                } catch (Throwable th) {
                    try {
                        AbstractC0248o0.h("BillingClient", "There was an exception while unbinding service!", th);
                        this.f10071h = null;
                        this.f10072i = null;
                    } finally {
                        this.f10071h = null;
                        this.f10072i = null;
                    }
                }
            }
        }
    }

    public final T1.a v(C1147i c1147i, int i3, String str, Exception exc) {
        AbstractC0248o0.h("BillingClient", str, exc);
        I(i3, 7, c1147i, AbstractC1133M.a(exc));
        return new T1.a(c1147i.f10092a, c1147i.f10093b, new ArrayList());
    }

    public final C1123C w(C1147i c1147i, int i3, String str, Exception exc) {
        AbstractC0248o0.h("BillingClient", str, exc);
        I(i3, 11, c1147i, AbstractC1133M.a(exc));
        return new C1123C(c1147i, null);
    }

    public final C1123C x(C1147i c1147i, int i3, String str, Exception exc) {
        I(i3, 9, c1147i, AbstractC1133M.a(exc));
        AbstractC0248o0.h("BillingClient", str, exc);
        return new C1123C(c1147i, null);
    }

    public final void y(int i3, int i4, C1147i c1147i) {
        S1 s12 = null;
        Q1 q12 = null;
        if (c1147i.f10092a == 0) {
            int i5 = AbstractC1133M.f10010a;
            try {
                R1 q3 = S1.q();
                q3.d();
                S1.p((S1) q3.f2860b, 5);
                c2 o = e2.o();
                o.d();
                e2.n((e2) o.f2860b, i4);
                e2 e2Var = (e2) o.b();
                q3.d();
                S1.n((S1) q3.f2860b, e2Var);
                s12 = (S1) q3.b();
            } catch (Exception e3) {
                AbstractC0248o0.h("BillingLogger", "Unable to create logging payload", e3);
            }
            s(s12);
            return;
        }
        int i6 = AbstractC1133M.f10010a;
        try {
            P1 r3 = Q1.r();
            T1 r4 = U1.r();
            r4.e(c1147i.f10092a);
            String str = c1147i.f10093b;
            r4.d();
            U1.o((U1) r4.f2860b, str);
            r4.f(i3);
            r3.e(r4);
            r3.f(5);
            c2 o3 = e2.o();
            o3.d();
            e2.n((e2) o3.f2860b, i4);
            e2 e2Var2 = (e2) o3.b();
            r3.d();
            Q1.p((Q1) r3.f2860b, e2Var2);
            q12 = (Q1) r3.b();
        } catch (Exception e4) {
            AbstractC0248o0.h("BillingLogger", "Unable to create logging payload", e4);
        }
        r(q12);
    }

    public final void z(B0.g gVar, C1147i c1147i, int i3, Exception exc) {
        AbstractC0248o0.h("BillingClient", "Error in acknowledge purchase!", exc);
        I(i3, 3, c1147i, AbstractC1133M.a(exc));
        gVar.b(c1147i);
    }

    public C1143e(C0342b c0342b, Context context) {
        this.f10065a = new Object();
        this.f10066b = 0;
        this.f10068d = new Handler(Looper.getMainLooper());
        this.f10075l = 0;
        long nextLong = new Random().nextLong();
        this.f10064E = Long.valueOf(nextLong);
        this.f10067c = p();
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        String p3 = p();
        r3.d();
        a2.q((a2) r3.f2860b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2860b, packageName);
        r3.d();
        a2.o((a2) r3.f2860b, nextLong);
        this.f10070g = new C0322a(this.f, (a2) r3.b());
        AbstractC0248o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f10069e = new C1137Q(this.f, null, null, this.f10070g);
        this.f10060A = c0342b;
        this.f.getPackageName();
    }

    public C1143e(C0342b c0342b, Context context, InterfaceC1156r interfaceC1156r) {
        String p3 = p();
        this.f10065a = new Object();
        this.f10066b = 0;
        this.f10068d = new Handler(Looper.getMainLooper());
        this.f10075l = 0;
        long nextLong = new Random().nextLong();
        this.f10064E = Long.valueOf(nextLong);
        this.f10067c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2860b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2860b, packageName);
        r3.d();
        a2.o((a2) r3.f2860b, nextLong);
        this.f10070g = new C0322a(this.f, (a2) r3.b());
        if (interfaceC1156r == null) {
            AbstractC0248o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10069e = new C1137Q(this.f, interfaceC1156r, null, this.f10070g);
        this.f10060A = c0342b;
        this.f10061B = false;
        this.f.getPackageName();
    }

    public C1143e(C0342b c0342b, Context context, InterfaceC1156r interfaceC1156r, B0.k kVar) {
        String p3 = p();
        this.f10065a = new Object();
        this.f10066b = 0;
        this.f10068d = new Handler(Looper.getMainLooper());
        this.f10075l = 0;
        long nextLong = new Random().nextLong();
        this.f10064E = Long.valueOf(nextLong);
        this.f10067c = p3;
        this.f = context.getApplicationContext();
        Z1 r3 = a2.r();
        r3.d();
        a2.q((a2) r3.f2860b, p3);
        String packageName = this.f.getPackageName();
        r3.d();
        a2.p((a2) r3.f2860b, packageName);
        r3.d();
        a2.o((a2) r3.f2860b, nextLong);
        this.f10070g = new C0322a(this.f, (a2) r3.b());
        if (interfaceC1156r == null) {
            AbstractC0248o0.g("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10069e = new C1137Q(this.f, interfaceC1156r, kVar, this.f10070g);
        this.f10060A = c0342b;
        this.f10061B = kVar != null;
    }
}
