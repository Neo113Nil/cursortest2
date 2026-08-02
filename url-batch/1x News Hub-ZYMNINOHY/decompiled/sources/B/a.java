package B;

import M0.o;
import M0.v;
import N0.AbstractBinderC0062a;
import N0.C;
import N0.r;
import U1.C0084e;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import b0.s;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0279z;
import com.google.android.gms.internal.play_billing.Q;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.impl.C0642l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import k.MenuC1065j;
import l.C1084f;
import l.C1087i;
import l.C1096s;
import l.C1097t;
import n0.AbstractC1135O;
import n0.C1143e;
import n0.C1147i;
import n0.C1148j;
import n0.InterfaceC1153o;
import n0.InterfaceC1154p;
import n0.InterfaceC1155q;
import t2.AbstractC1212w;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74a;

    /* renamed from: b, reason: collision with root package name */
    public Object f75b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76c;

    public /* synthetic */ a(Object obj, int i3, Object obj2) {
        this.f74a = i3;
        this.f75b = obj;
        this.f76c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y2.i iVar;
        N0.e eVar;
        Set set;
        N0.e eVar2 = null;
        switch (this.f74a) {
            case 0:
                C1096s c1096s = (C1096s) ((s) this.f75b).f2544a;
                if (c1096s != null) {
                    c1096s.b((Typeface) this.f76c);
                    return;
                }
                return;
            case 1:
                ((h) this.f75b).accept(this.f76c);
                return;
            case 2:
                o oVar = (o) this.f76c;
                M0.m mVar = (M0.m) ((M0.c) oVar.f).f920j.get((M0.a) oVar.f946c);
                if (mVar == null) {
                    return;
                }
                K0.b bVar = (K0.b) this.f75b;
                if ((bVar.f836b == 0 ? 1 : 0) == 0) {
                    mVar.o(bVar, null);
                    return;
                }
                oVar.f944a = true;
                L0.c cVar = (L0.c) oVar.f945b;
                if (cVar.m()) {
                    if (!oVar.f944a || (eVar = (N0.e) oVar.f947d) == null) {
                        return;
                    }
                    cVar.e(eVar, (Set) oVar.f948e);
                    return;
                }
                try {
                    cVar.e(null, cVar.b());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    cVar.c("Failed to get service from broker.");
                    mVar.o(new K0.b(10), null);
                    return;
                }
            case 3:
                c1.e eVar3 = (c1.e) this.f75b;
                K0.b bVar2 = eVar3.f2626b;
                boolean z = bVar2.f836b == 0;
                v vVar = (v) this.f76c;
                if (z) {
                    N0.n nVar = eVar3.f2627c;
                    r.c(nVar);
                    K0.b bVar3 = nVar.f1046c;
                    if (bVar3.f836b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        vVar.f970i.b(bVar3);
                        vVar.f969h.l();
                        return;
                    }
                    o oVar2 = vVar.f970i;
                    IBinder iBinder = nVar.f1045b;
                    if (iBinder != null) {
                        int i3 = AbstractBinderC0062a.f996c;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        eVar2 = queryLocalInterface instanceof N0.e ? (N0.e) queryLocalInterface : new C(iBinder);
                    }
                    oVar2.getClass();
                    if (eVar2 == null || (set = vVar.f) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        oVar2.b(new K0.b(4));
                    } else {
                        oVar2.f947d = eVar2;
                        oVar2.f948e = set;
                        if (oVar2.f944a) {
                            ((L0.c) oVar2.f945b).e(eVar2, set);
                        }
                    }
                } else {
                    vVar.f970i.b(bVar2);
                }
                vVar.f969h.l();
                return;
            case 4:
                V0.e eVar4 = (V0.e) this.f75b;
                Context context = (Context) eVar4.f1599b;
                String string = V0.e.G(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j3 = V0.e.G((Context) eVar4.f1599b).getLong("app_set_id_last_used_time", -1L);
                long j4 = j3 != -1 ? 33696000000L + j3 : -1L;
                d1.k kVar = ((d1.e) this.f76c).f4931a;
                if (string == null || System.currentTimeMillis() > j4) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new V0.d("Failed to store the app set ID.");
                        }
                        V0.e.H(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new V0.d("Failed to store the app set ID creation time.");
                        }
                    } catch (V0.d e4) {
                        kVar.d(e4);
                        return;
                    }
                } else {
                    try {
                        V0.e.H(context);
                    } catch (V0.d e5) {
                        kVar.d(e5);
                        return;
                    }
                }
                kVar.e(new H0.a(string, 1));
                return;
            case 5:
                d1.g gVar = (d1.g) this.f76c;
                try {
                    Task l3 = ((C0.e) gVar.f4936c).l((Task) this.f75b);
                    if (l3 == null) {
                        ((d1.k) gVar.f4937d).d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    d1.j jVar = d1.f.f4933b;
                    d1.k kVar2 = (d1.k) l3;
                    d1.g gVar2 = new d1.g(jVar, gVar);
                    V.e eVar5 = kVar2.f4943b;
                    eVar5.d(gVar2);
                    kVar2.g();
                    eVar5.d(new d1.h(jVar, gVar, 1));
                    kVar2.g();
                    eVar5.d(new d1.h(jVar, gVar, 0));
                    kVar2.g();
                    return;
                } catch (d1.d e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((d1.k) gVar.f4937d).d((Exception) e6.getCause());
                        return;
                    } else {
                        ((d1.k) gVar.f4937d).d(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((d1.k) gVar.f4937d).d(e7);
                    return;
                }
            case 6:
                synchronized (((d1.g) this.f76c).f4936c) {
                    ((d1.b) ((d1.g) this.f76c).f4937d).onComplete((Task) this.f75b);
                }
                return;
            case 7:
                synchronized (((d1.g) this.f76c).f4936c) {
                    try {
                        d1.c cVar2 = (d1.c) ((d1.g) this.f76c).f4937d;
                        if (cVar2 != null) {
                            cVar2.onSuccess(((Task) this.f75b).b());
                        }
                    } finally {
                    }
                }
                return;
            case 8:
                C1087i c1087i = (C1087i) this.f76c;
                MenuC1065j menuC1065j = c1087i.f9819c;
                ActionMenuView actionMenuView = c1087i.f9822g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C1084f c1084f = (C1084f) this.f75b;
                    if (!c1084f.b()) {
                        if (c1084f.f9646e != null) {
                            c1084f.d(0, 0, false, false);
                        }
                    }
                    c1087i.f9832r = c1084f;
                }
                c1087i.f9834t = null;
                return;
            case 9:
                C1097t c1097t = (C1097t) ((WeakReference) this.f75b).get();
                if (c1097t != null && c1097t.f9908m) {
                    TextView textView = c1097t.f9897a;
                    Typeface typeface = (Typeface) this.f76c;
                    textView.setTypeface(typeface);
                    c1097t.f9907l = typeface;
                    return;
                }
                return;
            case 10:
                C1143e c1143e = (C1143e) this.f75b;
                c1143e.getClass();
                C1147i c1147i = AbstractC1135O.f10027l;
                c1143e.H(24, 9, c1147i);
                C0279z c0279z = com.google.android.gms.internal.play_billing.C.f2714b;
                ((InterfaceC1155q) this.f76c).onQueryPurchasesResponse(c1147i, Q.f2774e);
                return;
            case 11:
                C1143e c1143e2 = (C1143e) this.f75b;
                c1143e2.getClass();
                c1143e2.A((B0.g) this.f76c, AbstractC1135O.f10027l, 24, null);
                return;
            case 12:
                Future future = (Future) this.f75b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                AbstractC0248o0.g("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = (Runnable) this.f76c;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                C1143e c1143e3 = (C1143e) this.f75b;
                C1147i c1147i2 = AbstractC1135O.f10027l;
                c1143e3.H(24, 4, c1147i2);
                ((C0084e) ((B0.g) this.f76c).f131b).a(S0.a.j(c1147i2));
                return;
            case 14:
                C1143e c1143e4 = (C1143e) this.f75b;
                c1143e4.getClass();
                C1147i c1147i3 = AbstractC1135O.f10027l;
                c1143e4.H(24, 11, c1147i3);
                ((InterfaceC1154p) this.f76c).onPurchaseHistoryResponse(c1147i3, null);
                return;
            case 15:
                C1143e c1143e5 = (C1143e) this.f75b;
                c1143e5.getClass();
                C1147i c1147i4 = AbstractC1135O.f10027l;
                c1143e5.H(24, 7, c1147i4);
                ((InterfaceC1153o) this.f76c).onProductDetailsResponse(c1147i4, new ArrayList());
                return;
            case 16:
                C1143e c1143e6 = (C1143e) this.f75b;
                C1147i c1147i5 = (C1147i) this.f76c;
                if (c1143e6.f10069e.f10043b != null) {
                    c1143e6.f10069e.f10043b.onPurchasesUpdated(c1147i5, null);
                    return;
                } else {
                    AbstractC0248o0.g("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 17:
                C1143e c1143e7 = (C1143e) this.f75b;
                c1143e7.getClass();
                c1143e7.G((B0.g) this.f76c, AbstractC1135O.f10027l, 24, null);
                return;
            case 18:
                C1143e c1143e8 = (C1143e) this.f75b;
                c1143e8.getClass();
                C1147i c1147i6 = AbstractC1135O.f10027l;
                c1143e8.H(24, 3, c1147i6);
                ((B0.g) this.f76c).b(c1147i6);
                return;
            case C0642l9.f7777C /* 19 */:
                C1143e c1143e9 = (C1143e) this.f75b;
                c1143e9.getClass();
                C1147i c1147i7 = AbstractC1135O.f10027l;
                c1143e9.H(24, 13, c1147i7);
                ((B0.g) this.f76c).d(c1147i7);
                return;
            case C0642l9.f7778D /* 20 */:
                C1143e c1143e10 = (C1143e) this.f75b;
                c1143e10.getClass();
                c1143e10.C((B0.g) this.f76c, AbstractC1135O.f10027l, 24, null);
                return;
        }
        do {
            try {
                ((Runnable) this.f75b).run();
            } catch (Throwable th) {
                AbstractC1212w.e(d2.i.f4951a, th);
            }
            iVar = (y2.i) this.f76c;
            Runnable e8 = iVar.e();
            if (e8 == null) {
                return;
            }
            this.f75b = e8;
            r2++;
        } while (r2 < 16);
        A2.m mVar2 = iVar.f10848c;
        mVar2.getClass();
        mVar2.c(iVar, this);
    }

    public /* synthetic */ a(Object obj, Object obj2, int i3, boolean z) {
        this.f74a = i3;
        this.f76c = obj;
        this.f75b = obj2;
    }

    public /* synthetic */ a(C1143e c1143e, B0.g gVar, C1148j c1148j) {
        this.f74a = 13;
        this.f75b = c1143e;
        this.f76c = gVar;
    }
}
