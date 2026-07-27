package n1;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C0793l9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m1.InterfaceC1276c;
import o1.C1361F;
import o1.C1370h;
import o1.C1371i;
import o1.C1372j;
import o1.C1373k;
import o1.C1374l;
import r.C1393c;
import r.C1397g;
import u1.AbstractC1477a;

/* renamed from: n1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318e implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f11367o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f11368p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f11369q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static C1318e f11370r;

    /* renamed from: a, reason: collision with root package name */
    public long f11371a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11372b;

    /* renamed from: c, reason: collision with root package name */
    public C1373k f11373c;

    /* renamed from: d, reason: collision with root package name */
    public q1.b f11374d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f11375e;

    /* renamed from: f, reason: collision with root package name */
    public final l1.f f11376f;

    /* renamed from: g, reason: collision with root package name */
    public final x1.e f11377g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f11378h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f11379i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f11380j;

    /* renamed from: k, reason: collision with root package name */
    public final C1393c f11381k;

    /* renamed from: l, reason: collision with root package name */
    public final C1393c f11382l;

    /* renamed from: m, reason: collision with root package name */
    public final A1.c f11383m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f11384n;

    public C1318e(Context context, Looper looper) {
        l1.f fVar = l1.f.f11010d;
        this.f11371a = 10000L;
        this.f11372b = false;
        this.f11378h = new AtomicInteger(1);
        this.f11379i = new AtomicInteger(0);
        this.f11380j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f11381k = new C1393c(0);
        this.f11382l = new C1393c(0);
        this.f11384n = true;
        this.f11375e = context;
        A1.c cVar = new A1.c(looper, this);
        this.f11383m = cVar;
        this.f11376f = fVar;
        this.f11377g = new x1.e(fVar);
        PackageManager packageManager = context.getPackageManager();
        if (s1.b.f11805e == null) {
            s1.b.f11805e = Boolean.valueOf(s1.b.b() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (s1.b.f11805e.booleanValue()) {
            this.f11384n = false;
        }
        cVar.sendMessage(cVar.obtainMessage(6));
    }

    public static Status c(C1314a c1314a, l1.b bVar) {
        return new Status(17, "API: " + c1314a.f11359b.f11125c + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f11001c, bVar);
    }

    public static C1318e e(Context context) {
        C1318e c1318e;
        HandlerThread handlerThread;
        synchronized (f11369q) {
            if (f11370r == null) {
                synchronized (C1361F.f11515g) {
                    try {
                        handlerThread = C1361F.f11517i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C1361F.f11517i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C1361F.f11517i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = l1.f.f11009c;
                f11370r = new C1318e(applicationContext, looper);
            }
            c1318e = f11370r;
        }
        return c1318e;
    }

    public final boolean a() {
        if (this.f11372b) {
            return false;
        }
        C1372j c1372j = (C1372j) C1371i.a().f11562a;
        if (c1372j != null && !c1372j.f11564b) {
            return false;
        }
        int i2 = ((SparseIntArray) this.f11377g.f12265a).get(203400000, -1);
        return i2 == -1 || i2 == 0;
    }

    public final boolean b(l1.b bVar, int i2) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        l1.f fVar = this.f11376f;
        Context context = this.f11375e;
        fVar.getClass();
        synchronized (AbstractC1477a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC1477a.f12045a;
            if (context2 != null && (bool = AbstractC1477a.f12046b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC1477a.f12046b = null;
            if (s1.b.b()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC1477a.f12046b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC1477a.f12046b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC1477a.f12046b = Boolean.FALSE;
                }
            }
            AbstractC1477a.f12045a = applicationContext;
            booleanValue = AbstractC1477a.f12046b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        if (bVar.a()) {
            activity = bVar.f11001c;
        } else {
            Intent a6 = fVar.a(context, null, bVar.f11000b);
            activity = a6 != null ? PendingIntent.getActivity(context, 0, a6, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = bVar.f11000b;
        int i6 = GoogleApiActivity.f4969b;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        fVar.f(context, i3, PendingIntent.getActivity(context, 0, intent, y1.d.f12342a | 134217728));
        return true;
    }

    public final C1300D d(m1.h hVar) {
        ConcurrentHashMap concurrentHashMap = this.f11380j;
        C1314a c1314a = hVar.f11133e;
        C1300D c1300d = (C1300D) concurrentHashMap.get(c1314a);
        if (c1300d == null) {
            c1300d = new C1300D(this, hVar);
            concurrentHashMap.put(c1314a, c1300d);
        }
        if (c1300d.f11294e.n()) {
            this.f11382l.add(c1314a);
        }
        c1300d.j();
        return c1300d;
    }

    public final void f(l1.b bVar, int i2) {
        if (b(bVar, i2)) {
            return;
        }
        A1.c cVar = this.f11383m;
        cVar.sendMessage(cVar.obtainMessage(5, i2, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1300D c1300d;
        l1.d[] b6;
        int i2 = 23;
        int i3 = message.what;
        A1.c cVar = this.f11383m;
        ConcurrentHashMap concurrentHashMap = this.f11380j;
        switch (i3) {
            case 1:
                this.f11371a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                cVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    cVar.sendMessageDelayed(cVar.obtainMessage(12, (C1314a) it.next()), this.f11371a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (C1300D c1300d2 : concurrentHashMap.values()) {
                    o1.u.b(c1300d2.f11305p.f11383m);
                    c1300d2.f11303n = null;
                    c1300d2.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C1311O c1311o = (C1311O) message.obj;
                C1300D c1300d3 = (C1300D) concurrentHashMap.get(c1311o.f11331c.f11133e);
                if (c1300d3 == null) {
                    c1300d3 = d(c1311o.f11331c);
                }
                boolean n6 = c1300d3.f11294e.n();
                AbstractC1307K abstractC1307K = c1311o.f11329a;
                if (!n6 || this.f11379i.get() == c1311o.f11330b) {
                    c1300d3.k(abstractC1307K);
                    return true;
                }
                abstractC1307K.c(f11367o);
                c1300d3.n();
                return true;
            case 5:
                int i6 = message.arg1;
                l1.b bVar = (l1.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        c1300d = (C1300D) it2.next();
                        if (c1300d.f11299j == i6) {
                        }
                    } else {
                        c1300d = null;
                    }
                }
                if (c1300d == null) {
                    Log.wtf("GoogleApiManager", B0.o.g(i6, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i7 = bVar.f11000b;
                if (i7 != 13) {
                    c1300d.b(c(c1300d.f11295f, bVar));
                    return true;
                }
                this.f11376f.getClass();
                int i8 = l1.i.f11015c;
                c1300d.b(new Status(17, "Error resolution was canceled by the user, original error message: " + l1.b.c(i7) + ": " + bVar.f11002d, null, null));
                return true;
            case 6:
                Context context = this.f11375e;
                if (!(context.getApplicationContext() instanceof Application)) {
                    return true;
                }
                ComponentCallbacks2C1316c.a((Application) context.getApplicationContext());
                ComponentCallbacks2C1316c componentCallbacks2C1316c = ComponentCallbacks2C1316c.f11362e;
                C1299C c1299c = new C1299C(this);
                componentCallbacks2C1316c.getClass();
                synchronized (componentCallbacks2C1316c) {
                    componentCallbacks2C1316c.f11365c.add(c1299c);
                }
                AtomicBoolean atomicBoolean = componentCallbacks2C1316c.f11364b;
                boolean z = atomicBoolean.get();
                AtomicBoolean atomicBoolean2 = componentCallbacks2C1316c.f11363a;
                if (!z) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                        atomicBoolean2.set(true);
                    }
                }
                if (atomicBoolean2.get()) {
                    return true;
                }
                this.f11371a = 300000L;
                return true;
            case 7:
                d((m1.h) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C1300D c1300d4 = (C1300D) concurrentHashMap.get(message.obj);
                o1.u.b(c1300d4.f11305p.f11383m);
                if (!c1300d4.f11301l) {
                    return true;
                }
                c1300d4.j();
                return true;
            case 10:
                C1393c c1393c = this.f11382l;
                Iterator it3 = c1393c.iterator();
                while (true) {
                    C1397g c1397g = (C1397g) it3;
                    if (!c1397g.hasNext()) {
                        c1393c.clear();
                        return true;
                    }
                    C1300D c1300d5 = (C1300D) concurrentHashMap.remove((C1314a) c1397g.next());
                    if (c1300d5 != null) {
                        c1300d5.n();
                    }
                }
            case 11:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C1300D c1300d6 = (C1300D) concurrentHashMap.get(message.obj);
                C1318e c1318e = c1300d6.f11305p;
                o1.u.b(c1318e.f11383m);
                boolean z5 = c1300d6.f11301l;
                if (!z5) {
                    return true;
                }
                if (z5) {
                    C1318e c1318e2 = c1300d6.f11305p;
                    A1.c cVar2 = c1318e2.f11383m;
                    C1314a c1314a = c1300d6.f11295f;
                    cVar2.removeMessages(11, c1314a);
                    c1318e2.f11383m.removeMessages(9, c1314a);
                    c1300d6.f11301l = false;
                }
                c1300d6.b(c1318e.f11376f.b(c1318e.f11375e, l1.g.f11011a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                c1300d6.f11294e.c("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                C1300D c1300d7 = (C1300D) concurrentHashMap.get(message.obj);
                o1.u.b(c1300d7.f11305p.f11383m);
                InterfaceC1276c interfaceC1276c = c1300d7.f11294e;
                if (!interfaceC1276c.a() || !c1300d7.f11298i.isEmpty()) {
                    return true;
                }
                S s2 = c1300d7.f11296g;
                if (((Map) s2.f11345a).isEmpty() && ((Map) s2.f11346b).isEmpty()) {
                    interfaceC1276c.c("Timing out service connection.");
                    return true;
                }
                c1300d7.g();
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                C1301E c1301e = (C1301E) message.obj;
                if (!concurrentHashMap.containsKey(c1301e.f11306a)) {
                    return true;
                }
                C1300D c1300d8 = (C1300D) concurrentHashMap.get(c1301e.f11306a);
                if (!c1300d8.f11302m.contains(c1301e) || c1300d8.f11301l) {
                    return true;
                }
                if (c1300d8.f11294e.a()) {
                    c1300d8.d();
                    return true;
                }
                c1300d8.j();
                return true;
            case 16:
                C1301E c1301e2 = (C1301E) message.obj;
                if (!concurrentHashMap.containsKey(c1301e2.f11306a)) {
                    return true;
                }
                C1300D c1300d9 = (C1300D) concurrentHashMap.get(c1301e2.f11306a);
                if (!c1300d9.f11302m.remove(c1301e2)) {
                    return true;
                }
                C1318e c1318e3 = c1300d9.f11305p;
                c1318e3.f11383m.removeMessages(15, c1301e2);
                c1318e3.f11383m.removeMessages(16, c1301e2);
                LinkedList linkedList = c1300d9.f11293a;
                ArrayList arrayList = new ArrayList(linkedList.size());
                Iterator it4 = linkedList.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    l1.d dVar = c1301e2.f11307b;
                    if (!hasNext) {
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            AbstractC1307K abstractC1307K2 = (AbstractC1307K) arrayList.get(i9);
                            linkedList.remove(abstractC1307K2);
                            abstractC1307K2.d(new m1.m(dVar));
                        }
                        return true;
                    }
                    AbstractC1307K abstractC1307K3 = (AbstractC1307K) it4.next();
                    if ((abstractC1307K3 instanceof AbstractC1307K) && (b6 = abstractC1307K3.b(c1300d9)) != null) {
                        int length = b6.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            if (!o1.u.j(b6[i10], dVar)) {
                                i10++;
                            } else if (i10 >= 0) {
                                arrayList.add(abstractC1307K3);
                            }
                        }
                    }
                }
                break;
            case 17:
                C1373k c1373k = this.f11373c;
                if (c1373k == null) {
                    return true;
                }
                if (c1373k.f11568a > 0 || a()) {
                    if (this.f11374d == null) {
                        this.f11374d = new q1.b(this.f11375e, q1.b.f11664i, C1374l.f11570b, m1.g.f11127b);
                    }
                    q1.b bVar2 = this.f11374d;
                    bVar2.getClass();
                    U.e eVar = new U.e();
                    l1.d[] dVarArr = {y1.b.f12340a};
                    eVar.f3053a = new V0.j(i2, c1373k);
                    bVar2.b(2, new C1313Q(eVar, dVarArr, false, 0));
                }
                this.f11373c = null;
                return true;
            case 18:
                C1310N c1310n = (C1310N) message.obj;
                long j2 = c1310n.f11327c;
                C1370h c1370h = c1310n.f11325a;
                int i11 = c1310n.f11326b;
                if (j2 == 0) {
                    C1373k c1373k2 = new C1373k(i11, Arrays.asList(c1370h));
                    if (this.f11374d == null) {
                        this.f11374d = new q1.b(this.f11375e, q1.b.f11664i, C1374l.f11570b, m1.g.f11127b);
                    }
                    q1.b bVar3 = this.f11374d;
                    bVar3.getClass();
                    U.e eVar2 = new U.e();
                    l1.d[] dVarArr2 = {y1.b.f12340a};
                    eVar2.f3053a = new V0.j(i2, c1373k2);
                    bVar3.b(2, new C1313Q(eVar2, dVarArr2, false, 0));
                    return true;
                }
                C1373k c1373k3 = this.f11373c;
                if (c1373k3 != null) {
                    List list = c1373k3.f11569b;
                    if (c1373k3.f11568a != i11 || (list != null && list.size() >= c1310n.f11328d)) {
                        cVar.removeMessages(17);
                        C1373k c1373k4 = this.f11373c;
                        if (c1373k4 != null) {
                            if (c1373k4.f11568a > 0 || a()) {
                                if (this.f11374d == null) {
                                    this.f11374d = new q1.b(this.f11375e, q1.b.f11664i, C1374l.f11570b, m1.g.f11127b);
                                }
                                q1.b bVar4 = this.f11374d;
                                bVar4.getClass();
                                U.e eVar3 = new U.e();
                                l1.d[] dVarArr3 = {y1.b.f12340a};
                                eVar3.f3053a = new V0.j(i2, c1373k4);
                                bVar4.b(2, new C1313Q(eVar3, dVarArr3, false, 0));
                            }
                            this.f11373c = null;
                        }
                    } else {
                        C1373k c1373k5 = this.f11373c;
                        if (c1373k5.f11569b == null) {
                            c1373k5.f11569b = new ArrayList();
                        }
                        c1373k5.f11569b.add(c1370h);
                    }
                }
                if (this.f11373c != null) {
                    return true;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c1370h);
                this.f11373c = new C1373k(i11, arrayList2);
                cVar.sendMessageDelayed(cVar.obtainMessage(17), c1310n.f11327c);
                return true;
            case C0793l9.f8681C /* 19 */:
                this.f11372b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i3);
                return false;
        }
    }
}
