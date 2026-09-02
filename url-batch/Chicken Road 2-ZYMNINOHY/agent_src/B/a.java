package B;

import E1.C0029e;
import E1.C0035k;
import E1.C0037m;
import E1.InterfaceC0044u;
import E1.InterfaceC0046w;
import E1.InterfaceC0047x;
import E1.W;
import N3.A;
import a2.C0162b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import c2.C0284a;
import c2.C0286c;
import c2.u;
import com.google.android.gms.internal.play_billing.AbstractC0346t;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0354x;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.Task;
import d2.AbstractBinderC0383a;
import d2.C0382D;
import d2.InterfaceC0387e;
import d2.s;
import e0.t;
import f3.C0431i;
import io.appmetrica.analytics.impl.C0583e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Future;
import k.C1212f;
import k.C1218i;
import k.C1232s;
import t2.InterfaceC1440a;
import x3.AbstractC1558s;
import x3.AbstractC1562w;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    /* renamed from: b, reason: collision with root package name */
    public Object f146b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f147c;

    public a(J2.i iVar, WebView webView, String str) {
        this.f145a = 12;
        this.f146b = webView;
        this.f147c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0387e interfaceC0387e;
        int i4 = 0;
        InterfaceC0387e interfaceC0387e2 = null;
        switch (this.f145a) {
            case 0:
                t tVar = (t) this.f146b;
                Typeface typeface = (Typeface) this.f147c;
                A a3 = (A) tVar.f8416a;
                if (a3 != null) {
                    a3.e(typeface);
                    return;
                }
                return;
            case 1:
                ((h) this.f146b).accept(this.f147c);
                return;
            case 2:
                C3.i iVar = (C3.i) this.f147c;
                AbstractC1558s abstractC1558s = iVar.f298c;
                while (true) {
                    try {
                        ((Runnable) this.f146b).run();
                    } catch (Throwable th) {
                        AbstractC1562w.e(C0431i.f8817a, th);
                    }
                    Runnable u4 = iVar.u();
                    if (u4 == null) {
                        return;
                    }
                    this.f146b = u4;
                    i4++;
                    if (i4 >= 16 && abstractC1558s.t()) {
                        abstractC1558s.s(iVar, this);
                        return;
                    }
                }
                break;
            case 3:
                C0029e c0029e = (C0029e) this.f146b;
                io.flutter.plugins.inapppurchase.f fVar = (io.flutter.plugins.inapppurchase.f) this.f147c;
                C0037m c0037m = W.f543k;
                c0029e.J(24, 3, c0037m);
                fVar.a(c0037m);
                return;
            case 4:
                C0029e c0029e2 = (C0029e) this.f146b;
                C0037m c0037m2 = (C0037m) this.f147c;
                if (((InterfaceC0047x) c0029e2.f599f.f567c) != null) {
                    ((InterfaceC0047x) c0029e2.f599f.f567c).onPurchasesUpdated(c0037m2, null);
                    return;
                } else {
                    AbstractC0352w.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 5:
                C0029e c0029e3 = (C0029e) this.f146b;
                io.flutter.plugins.inapppurchase.f fVar2 = (io.flutter.plugins.inapppurchase.f) this.f147c;
                C0037m c0037m3 = W.f543k;
                c0029e3.J(24, 13, c0037m3);
                fVar2.e(c0037m3, null);
                return;
            case 6:
                ((C0029e) this.f146b).n((io.flutter.plugins.inapppurchase.f) this.f147c, W.f543k, 24, null);
                return;
            case 7:
                ((C0029e) this.f146b).l((io.flutter.plugins.inapppurchase.f) this.f147c, W.f543k, 24, null);
                return;
            case 8:
                Future future = (Future) this.f146b;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.f147c;
                future.cancel(true);
                AbstractC0352w.h("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                C0029e c0029e4 = (C0029e) this.f146b;
                InterfaceC0044u interfaceC0044u = (InterfaceC0044u) this.f147c;
                C0037m c0037m4 = W.f543k;
                c0029e4.J(24, 7, c0037m4);
                r rVar = AbstractC0346t.f6014b;
                C0354x c0354x = C0354x.f6026e;
                interfaceC0044u.onProductDetailsResponse(c0037m4, new E1.A(c0354x, c0354x));
                return;
            case 10:
                C0029e c0029e5 = (C0029e) this.f146b;
                InterfaceC0046w interfaceC0046w = (InterfaceC0046w) this.f147c;
                C0037m c0037m5 = W.f543k;
                c0029e5.J(24, 9, c0037m5);
                r rVar2 = AbstractC0346t.f6014b;
                interfaceC0046w.onQueryPurchasesResponse(c0037m5, C0354x.f6026e);
                return;
            case 11:
                ((C0029e) this.f146b).p((io.flutter.plugins.inapppurchase.f) this.f147c, W.f543k, 24, null);
                return;
            case 12:
                J2.i.b((WebView) this.f146b, (String) this.f147c);
                return;
            case 13:
                C0162b c0162b = (C0162b) this.f146b;
                C0035k c0035k = (C0035k) this.f147c;
                b2.c cVar = (b2.c) c0035k.f625b;
                c2.m mVar = (c2.m) ((C0286c) c0035k.f629f).f5671j.get((C0284a) c0035k.f626c);
                if (mVar == null) {
                    return;
                }
                if (c0162b.f4265b != 0) {
                    mVar.o(c0162b, null);
                    return;
                }
                c0035k.f624a = true;
                if (cVar.m()) {
                    if (!c0035k.f624a || (interfaceC0387e = (InterfaceC0387e) c0035k.f627d) == null) {
                        return;
                    }
                    cVar.h(interfaceC0387e, (Set) c0035k.f628e);
                    return;
                }
                try {
                    cVar.h(null, cVar.a());
                    return;
                } catch (SecurityException e4) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e4);
                    cVar.b("Failed to get service from broker.");
                    mVar.o(new C0162b(10), null);
                    return;
                }
            case 14:
                u uVar = (u) this.f147c;
                s2.f fVar3 = (s2.f) this.f146b;
                C0162b c0162b2 = fVar3.f15238b;
                if (c0162b2.f4265b == 0) {
                    d2.o oVar = fVar3.f15239c;
                    s.c(oVar);
                    C0162b c0162b3 = oVar.f8288c;
                    if (c0162b3.f4265b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0162b3)), new Exception());
                        uVar.f5719h.c(c0162b3);
                        uVar.f5718g.e();
                        return;
                    }
                    C0035k c0035k2 = uVar.f5719h;
                    IBinder iBinder = oVar.f8287b;
                    if (iBinder != null) {
                        int i5 = AbstractBinderC0383a.f8233b;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        interfaceC0387e2 = queryLocalInterface instanceof InterfaceC0387e ? (InterfaceC0387e) queryLocalInterface : new C0382D(iBinder);
                    }
                    Set set = uVar.f5716e;
                    c0035k2.getClass();
                    if (interfaceC0387e2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c0035k2.c(new C0162b(4));
                    } else {
                        c0035k2.f627d = interfaceC0387e2;
                        c0035k2.f628e = set;
                        if (c0035k2.f624a) {
                            ((b2.c) c0035k2.f625b).h(interfaceC0387e2, set);
                        }
                    }
                } else {
                    uVar.f5719h.c(c0162b2);
                }
                uVar.f5718g.e();
                return;
            case 15:
                C1212f c1212f = (C1212f) this.f146b;
                C1218i c1218i = (C1218i) this.f147c;
                ActionMenuView actionMenuView = c1218i.f14018g;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!c1212f.b()) {
                        if (c1212f.f13696e != null) {
                            c1212f.d(0, 0, false, false);
                        }
                    }
                    c1218i.f14027r = c1212f;
                }
                c1218i.f14029t = null;
                return;
            case 16:
                C1232s c1232s = (C1232s) ((WeakReference) this.f146b).get();
                if (c1232s == null) {
                    return;
                }
                Typeface typeface2 = (Typeface) this.f147c;
                if (c1232s.f14102m) {
                    c1232s.f14090a.setTypeface(typeface2);
                    c1232s.f14101l = typeface2;
                    return;
                }
                return;
            case 17:
                l2.e eVar = (l2.e) this.f146b;
                t2.j jVar = ((t2.d) this.f147c).f15407a;
                Context context = (Context) eVar.f14270b;
                String string = l2.e.A(context).getString(CommonUrlParts.APP_SET_ID, null);
                long j4 = l2.e.A(context).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (string == null || System.currentTimeMillis() > j5) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString(CommonUrlParts.APP_SET_ID, string).commit()) {
                            String valueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new l2.d("Failed to store the app set ID.");
                        }
                        l2.e.B(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new l2.d("Failed to store the app set ID creation time.");
                        }
                    } catch (l2.d e5) {
                        jVar.d(e5);
                        return;
                    }
                } else {
                    try {
                        l2.e.B(context);
                    } catch (l2.d e6) {
                        jVar.d(e6);
                        return;
                    }
                }
                jVar.e(new X1.a(string, 1));
                return;
            case 18:
                t2.f fVar4 = (t2.f) this.f147c;
                t2.j jVar2 = (t2.j) fVar4.f15413d;
                try {
                    Task J4 = ((t) fVar4.f15412c).J((Task) this.f146b);
                    if (J4 == null) {
                        jVar2.d(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    t2.i iVar2 = t2.e.f15409b;
                    t2.j jVar3 = (t2.j) J4;
                    g0.f fVar5 = jVar3.f15419b;
                    fVar5.b(new t2.f(iVar2, fVar4));
                    jVar3.g();
                    fVar5.b(new t2.g(iVar2, fVar4, 1));
                    jVar3.g();
                    fVar5.b(new t2.g(iVar2, fVar4, 0));
                    jVar3.g();
                    return;
                } catch (t2.c e7) {
                    if (e7.getCause() instanceof Exception) {
                        jVar2.d((Exception) e7.getCause());
                        return;
                    } else {
                        jVar2.d(e7);
                        return;
                    }
                } catch (Exception e8) {
                    jVar2.d(e8);
                    return;
                }
            case C0583e9.f11743C /* 19 */:
                synchronized (((t2.f) this.f147c).f15412c) {
                    ((InterfaceC1440a) ((t2.f) this.f147c).f15413d).onComplete((Task) this.f146b);
                }
                return;
            case C0583e9.f11744D /* 20 */:
                synchronized (((t2.g) this.f147c).f15416c) {
                    t2.f fVar6 = ((t2.g) this.f147c).f15417d;
                    Exception a4 = ((Task) this.f146b).a();
                    s.c(a4);
                    ((t2.j) fVar6.f15413d).d(a4);
                }
                return;
            default:
                synchronized (((t2.f) this.f147c).f15412c) {
                    ((t2.b) ((t2.f) this.f147c).f15413d).onSuccess(((Task) this.f146b).b());
                }
                return;
        }
    }

    public /* synthetic */ a(Object obj, int i4, Object obj2) {
        this.f145a = i4;
        this.f146b = obj;
        this.f147c = obj2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i4, boolean z) {
        this.f145a = i4;
        this.f147c = obj;
        this.f146b = obj2;
    }
}
