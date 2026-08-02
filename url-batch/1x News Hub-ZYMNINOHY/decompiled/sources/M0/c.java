package M0;

import E1.AbstractC0033i;
import N0.B;
import a.AbstractC0129a;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.impl.C0642l9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.C1165a;
import p.C1170f;

/* loaded from: classes.dex */
public final class c implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f909p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f910q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static c f911r;

    /* renamed from: a, reason: collision with root package name */
    public long f912a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f913b;

    /* renamed from: c, reason: collision with root package name */
    public N0.i f914c;

    /* renamed from: d, reason: collision with root package name */
    public P0.c f915d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f916e;
    public final K0.e f;

    /* renamed from: g, reason: collision with root package name */
    public final V0.e f917g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f918h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f919i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f920j;

    /* renamed from: k, reason: collision with root package name */
    public final C1170f f921k;

    /* renamed from: l, reason: collision with root package name */
    public final C1170f f922l;

    /* renamed from: m, reason: collision with root package name */
    public final W0.e f923m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f924n;

    public c(Context context, Looper looper) {
        K0.e eVar = K0.e.f846d;
        this.f912a = 10000L;
        this.f913b = false;
        this.f918h = new AtomicInteger(1);
        this.f919i = new AtomicInteger(0);
        this.f920j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f921k = new C1170f(0);
        this.f922l = new C1170f(0);
        this.f924n = true;
        this.f916e = context;
        W0.e eVar2 = new W0.e(looper, this);
        Looper.getMainLooper();
        this.f923m = eVar2;
        this.f = eVar;
        this.f917g = new V0.e(13);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0129a.f1918d == null) {
            AbstractC0129a.f1918d = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0129a.f1918d.booleanValue()) {
            this.f924n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status c(a aVar, K0.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f901b.f1600c) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f837c, bVar);
    }

    public static c e(Context context) {
        c cVar;
        HandlerThread handlerThread;
        synchronized (f910q) {
            if (f911r == null) {
                synchronized (B.f987g) {
                    try {
                        handlerThread = B.f989i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            B.f989i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = B.f989i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = K0.e.f845c;
                f911r = new c(applicationContext, looper);
            }
            cVar = f911r;
        }
        return cVar;
    }

    public final boolean a() {
        if (this.f913b) {
            return false;
        }
        N0.h hVar = (N0.h) N0.g.b().f1026a;
        if (hVar != null && !hVar.f1028b) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f917g.f1599b).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final boolean b(K0.b bVar, int i3) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        K0.e eVar = this.f;
        Context context = this.f916e;
        eVar.getClass();
        synchronized (S0.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = S0.a.f1327b;
            if (context2 != null && (bool = S0.a.f1328c) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            S0.a.f1328c = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                S0.a.f1328c = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    S0.a.f1328c = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    S0.a.f1328c = Boolean.FALSE;
                }
            }
            S0.a.f1327b = applicationContext;
            booleanValue = S0.a.f1328c.booleanValue();
        }
        if (!booleanValue) {
            int i4 = bVar.f836b;
            if (i4 == 0 || (activity = bVar.f837c) == null) {
                Intent a3 = eVar.a(i4, context, null);
                activity = a3 != null ? PendingIntent.getActivity(context, 0, a3, 201326592) : null;
            }
            if (activity != null) {
                int i5 = bVar.f836b;
                int i6 = GoogleApiActivity.f2673b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i3);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i5, PendingIntent.getActivity(context, 0, intent, W0.d.f1622a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m d(L0.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f920j;
        a aVar = fVar.f883e;
        m mVar = (m) concurrentHashMap.get(aVar);
        if (mVar == null) {
            mVar = new m(this, fVar);
            concurrentHashMap.put(aVar, mVar);
        }
        if (mVar.f931c.m()) {
            this.f922l.add(aVar);
        }
        mVar.m();
        return mVar;
    }

    public final void f(K0.b bVar, int i3) {
        if (b(bVar, i3)) {
            return;
        }
        W0.e eVar = this.f923m;
        eVar.sendMessage(eVar.obtainMessage(5, i3, 0, bVar));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        m mVar;
        K0.d[] b3;
        int i3 = 21;
        int i4 = message.what;
        switch (i4) {
            case 1:
                this.f912a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f923m.removeMessages(12);
                for (a aVar : this.f920j.keySet()) {
                    W0.e eVar = this.f923m;
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, aVar), this.f912a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (m mVar2 : this.f920j.values()) {
                    N0.r.a(mVar2.f941n.f923m);
                    mVar2.f939l = null;
                    mVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                u uVar = (u) message.obj;
                m mVar3 = (m) this.f920j.get(uVar.f963c.f883e);
                if (mVar3 == null) {
                    mVar3 = d(uVar.f963c);
                }
                if (!mVar3.f931c.m() || this.f919i.get() == uVar.f962b) {
                    mVar3.n(uVar.f961a);
                    return true;
                }
                uVar.f961a.c(o);
                mVar3.q();
                return true;
            case 5:
                int i5 = message.arg1;
                K0.b bVar = (K0.b) message.obj;
                Iterator it = this.f920j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f935h == i5) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    Log.wtf("GoogleApiManager", AbstractC0033i.i(i5, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i6 = bVar.f836b;
                if (i6 != 13) {
                    mVar.e(c(mVar.f932d, bVar));
                    return true;
                }
                this.f.getClass();
                int i7 = K0.i.f851c;
                mVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + K0.b.a(i6) + ": " + bVar.f838d, null, null));
                return true;
            case 6:
                if (this.f916e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f916e.getApplicationContext();
                    b bVar2 = b.f904e;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f908d) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f908d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    k kVar = new k(this);
                    synchronized (bVar2) {
                        bVar2.f907c.add(kVar);
                    }
                    AtomicBoolean atomicBoolean = bVar2.f906b;
                    boolean z = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = bVar2.f905a;
                    if (!z) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f912a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((L0.f) message.obj);
                return true;
            case 9:
                if (this.f920j.containsKey(message.obj)) {
                    m mVar4 = (m) this.f920j.get(message.obj);
                    N0.r.a(mVar4.f941n.f923m);
                    if (mVar4.f937j) {
                        mVar4.m();
                        return true;
                    }
                }
                return true;
            case 10:
                C1170f c1170f = this.f922l;
                c1170f.getClass();
                C1165a c1165a = new C1165a(c1170f);
                while (c1165a.hasNext()) {
                    m mVar5 = (m) this.f920j.remove((a) c1165a.next());
                    if (mVar5 != null) {
                        mVar5.q();
                    }
                }
                this.f922l.clear();
                return true;
            case 11:
                if (this.f920j.containsKey(message.obj)) {
                    m mVar6 = (m) this.f920j.get(message.obj);
                    c cVar = mVar6.f941n;
                    N0.r.a(cVar.f923m);
                    boolean z2 = mVar6.f937j;
                    if (z2) {
                        if (z2) {
                            c cVar2 = mVar6.f941n;
                            W0.e eVar2 = cVar2.f923m;
                            a aVar2 = mVar6.f932d;
                            eVar2.removeMessages(11, aVar2);
                            cVar2.f923m.removeMessages(9, aVar2);
                            mVar6.f937j = false;
                        }
                        mVar6.e(cVar.f.b(cVar.f916e, K0.f.f847a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        mVar6.f931c.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.f920j.containsKey(message.obj)) {
                    m mVar7 = (m) this.f920j.get(message.obj);
                    N0.r.a(mVar7.f941n.f923m);
                    L0.c cVar3 = mVar7.f931c;
                    if (cVar3.a() && mVar7.f934g.isEmpty()) {
                        V0.e eVar3 = mVar7.f933e;
                        if (((Map) eVar3.f1599b).isEmpty() && ((Map) eVar3.f1600c).isEmpty()) {
                            cVar3.c("Timing out service connection.");
                            return true;
                        }
                        mVar7.j();
                    }
                    return true;
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                n nVar = (n) message.obj;
                if (this.f920j.containsKey(nVar.f942a)) {
                    m mVar8 = (m) this.f920j.get(nVar.f942a);
                    if (mVar8.f938k.contains(nVar) && !mVar8.f937j) {
                        if (mVar8.f931c.a()) {
                            mVar8.g();
                            return true;
                        }
                        mVar8.m();
                        return true;
                    }
                }
                return true;
            case 16:
                n nVar2 = (n) message.obj;
                if (this.f920j.containsKey(nVar2.f942a)) {
                    m mVar9 = (m) this.f920j.get(nVar2.f942a);
                    if (mVar9.f938k.remove(nVar2)) {
                        c cVar4 = mVar9.f941n;
                        cVar4.f923m.removeMessages(15, nVar2);
                        cVar4.f923m.removeMessages(16, nVar2);
                        K0.d dVar = nVar2.f943b;
                        LinkedList<r> linkedList = mVar9.f930a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (r rVar : linkedList) {
                            if (rVar != null && (b3 = rVar.b(mVar9)) != null) {
                                int length = b3.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length) {
                                        break;
                                    }
                                    if (!N0.r.e(b3[i8], dVar)) {
                                        i8++;
                                    } else if (i8 >= 0) {
                                        arrayList.add(rVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            r rVar2 = (r) arrayList.get(i9);
                            linkedList.remove(rVar2);
                            rVar2.d(new L0.k(dVar));
                        }
                    }
                }
                return true;
            case 17:
                N0.i iVar = this.f914c;
                if (iVar != null) {
                    if (iVar.f1032a > 0 || a()) {
                        if (this.f915d == null) {
                            this.f915d = new P0.c(this.f916e, P0.c.f1255i, N0.j.f1034b, L0.e.f877b);
                        }
                        P0.c cVar5 = this.f915d;
                        cVar5.getClass();
                        E1.B b4 = new E1.B();
                        b4.f311b = 0;
                        b4.f313d = new K0.d[]{W0.c.f1620a};
                        b4.f310a = false;
                        b4.f312c = new C0.e(i3, iVar);
                        cVar5.b(2, b4.a());
                    }
                    this.f914c = null;
                    return true;
                }
                return true;
            case 18:
                t tVar = (t) message.obj;
                if (tVar.f959c == 0) {
                    N0.i iVar2 = new N0.i(tVar.f958b, Arrays.asList(tVar.f957a));
                    if (this.f915d == null) {
                        this.f915d = new P0.c(this.f916e, P0.c.f1255i, N0.j.f1034b, L0.e.f877b);
                    }
                    P0.c cVar6 = this.f915d;
                    cVar6.getClass();
                    E1.B b5 = new E1.B();
                    b5.f311b = 0;
                    b5.f313d = new K0.d[]{W0.c.f1620a};
                    b5.f310a = false;
                    b5.f312c = new C0.e(i3, iVar2);
                    cVar6.b(2, b5.a());
                    return true;
                }
                N0.i iVar3 = this.f914c;
                if (iVar3 != null) {
                    List list = iVar3.f1033b;
                    if (iVar3.f1032a != tVar.f958b || (list != null && list.size() >= tVar.f960d)) {
                        this.f923m.removeMessages(17);
                        N0.i iVar4 = this.f914c;
                        if (iVar4 != null) {
                            if (iVar4.f1032a > 0 || a()) {
                                if (this.f915d == null) {
                                    this.f915d = new P0.c(this.f916e, P0.c.f1255i, N0.j.f1034b, L0.e.f877b);
                                }
                                P0.c cVar7 = this.f915d;
                                cVar7.getClass();
                                E1.B b6 = new E1.B();
                                b6.f311b = 0;
                                b6.f313d = new K0.d[]{W0.c.f1620a};
                                b6.f310a = false;
                                b6.f312c = new C0.e(i3, iVar4);
                                cVar7.b(2, b6.a());
                            }
                            this.f914c = null;
                        }
                    } else {
                        N0.i iVar5 = this.f914c;
                        N0.f fVar = tVar.f957a;
                        if (iVar5.f1033b == null) {
                            iVar5.f1033b = new ArrayList();
                        }
                        iVar5.f1033b.add(fVar);
                    }
                }
                if (this.f914c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(tVar.f957a);
                    this.f914c = new N0.i(tVar.f958b, arrayList2);
                    W0.e eVar4 = this.f923m;
                    eVar4.sendMessageDelayed(eVar4.obtainMessage(17), tVar.f959c);
                    return true;
                }
                return true;
            case C0642l9.f7777C /* 19 */:
                this.f913b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }
}
