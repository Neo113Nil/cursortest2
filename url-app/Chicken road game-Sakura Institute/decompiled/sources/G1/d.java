package G1;

import A.AbstractC0017m;
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
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import i.C0666a;
import i.C0671f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q.AbstractC1024c;

/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f3106o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f3107p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f3108q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static d f3109r;

    /* renamed from: a, reason: collision with root package name */
    public long f3110a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3111b;

    /* renamed from: c, reason: collision with root package name */
    public H1.h f3112c;

    /* renamed from: d, reason: collision with root package name */
    public J1.c f3113d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f3114e;

    /* renamed from: f, reason: collision with root package name */
    public final E1.e f3115f;

    /* renamed from: g, reason: collision with root package name */
    public final y.t f3116g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f3117h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f3118i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f3119j;

    /* renamed from: k, reason: collision with root package name */
    public final C0671f f3120k;

    /* renamed from: l, reason: collision with root package name */
    public final C0671f f3121l;

    /* renamed from: m, reason: collision with root package name */
    public final P1.e f3122m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f3123n;

    public d(Context context, Looper looper) {
        E1.e eVar = E1.e.f2288d;
        this.f3110a = 10000L;
        this.f3111b = false;
        this.f3117h = new AtomicInteger(1);
        this.f3118i = new AtomicInteger(0);
        this.f3119j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f3120k = new C0671f(0);
        this.f3121l = new C0671f(0);
        this.f3123n = true;
        this.f3114e = context;
        P1.e eVar2 = new P1.e(looper, this);
        this.f3122m = eVar2;
        this.f3115f = eVar;
        this.f3116g = new y.t(12);
        PackageManager packageManager = context.getPackageManager();
        if (M1.a.f3572i == null) {
            M1.a.f3572i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (M1.a.f3572i.booleanValue()) {
            this.f3123n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status b(a aVar, E1.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f3099b.f11495i) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f2279i, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f3108q) {
            if (f3109r == null) {
                synchronized (H1.y.f3311g) {
                    try {
                        handlerThread = H1.y.f3313i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            H1.y.f3313i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = H1.y.f3313i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = E1.e.f2287c;
                f3109r = new d(applicationContext, looper);
            }
            dVar = f3109r;
        }
        return dVar;
    }

    public final boolean a(E1.b bVar, int i2) {
        boolean z4;
        PendingIntent activity;
        Boolean bool;
        E1.e eVar = this.f3115f;
        Context context = this.f3114e;
        eVar.getClass();
        synchronized (M1.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = M1.a.f3564a;
            if (context2 != null && (bool = M1.a.f3565b) != null && context2 == applicationContext) {
                z4 = bool.booleanValue();
            }
            M1.a.f3565b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            M1.a.f3565b = Boolean.valueOf(isInstantApp);
            M1.a.f3564a = applicationContext;
            z4 = isInstantApp;
        }
        if (z4) {
            return false;
        }
        int i4 = bVar.f2278e;
        if (i4 == 0 || (activity = bVar.f2279i) == null) {
            Intent a4 = eVar.a(context, i4, null);
            activity = a4 != null ? PendingIntent.getActivity(context, 0, a4, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i5 = bVar.f2278e;
        int i6 = GoogleApiActivity.f6025e;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        eVar.f(context, i5, PendingIntent.getActivity(context, 0, intent, P1.d.f3786a | 134217728));
        return true;
    }

    public final l c(J1.c cVar) {
        a aVar = cVar.f3388e;
        ConcurrentHashMap concurrentHashMap = this.f3119j;
        l lVar = (l) concurrentHashMap.get(aVar);
        if (lVar == null) {
            lVar = new l(this, cVar);
            concurrentHashMap.put(aVar, lVar);
        }
        if (lVar.f3131b.l()) {
            this.f3121l.add(aVar);
        }
        lVar.m();
        return lVar;
    }

    public final void e(E1.b bVar, int i2) {
        if (a(bVar, i2)) {
            return;
        }
        P1.e eVar = this.f3122m;
        eVar.sendMessage(eVar.obtainMessage(5, i2, 0, bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r2 != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0121, code lost:
    
        if (r0 != 0) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        l lVar;
        E1.d[] b4;
        H1.f fVar;
        H1.f fVar2;
        int i2 = message.what;
        P1.e eVar = this.f3122m;
        ConcurrentHashMap concurrentHashMap = this.f3119j;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (i2) {
            case 1:
                this.f3110a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (a) it.next()), this.f3110a);
                }
                return true;
            case 2:
                throw AbstractC0017m.e(message.obj);
            case 3:
                for (l lVar2 : concurrentHashMap.values()) {
                    H1.o.a(lVar2.f3140k.f3122m);
                    lVar2.f3139j = null;
                    lVar2.m();
                }
                return true;
            case 4:
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                t tVar = (t) message.obj;
                l lVar3 = (l) concurrentHashMap.get(tVar.f3157c.f3388e);
                if (lVar3 == null) {
                    lVar3 = c(tVar.f3157c);
                }
                boolean l4 = lVar3.f3131b.l();
                w wVar = tVar.f3155a;
                if (!l4 || this.f3118i.get() == tVar.f3156b) {
                    lVar3.n(wVar);
                } else {
                    wVar.c(f3106o);
                    lVar3.p();
                }
                return true;
            case 5:
                int i4 = message.arg1;
                E1.b bVar = (E1.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        lVar = (l) it2.next();
                        if (lVar.f3136g == i4) {
                        }
                    } else {
                        lVar = null;
                    }
                }
                if (lVar != null) {
                    int i5 = bVar.f2278e;
                    if (i5 == 13) {
                        this.f3115f.getClass();
                        int i6 = E1.h.f2293c;
                        lVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + E1.b.a(i5) + ": " + bVar.f2280j, null, null));
                    } else {
                        lVar.e(b(lVar.f3132c, bVar));
                    }
                } else {
                    Log.wtf("GoogleApiManager", AbstractC0017m.o(i4, "Could not find API instance ", " while trying to fail enqueued calls.").toString(), new Exception());
                }
                return true;
            case 6:
                Context context = this.f3114e;
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar = c.f3101k;
                    i iVar = new i(this);
                    cVar.getClass();
                    synchronized (cVar) {
                        cVar.f3104i.add(iVar);
                    }
                    AtomicBoolean atomicBoolean = cVar.f3103e;
                    boolean z4 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = cVar.f3102d;
                    if (!z4) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f3110a = 300000L;
                    }
                }
                return true;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c((J1.c) message.obj);
                return true;
            case AbstractC1024c.f9242c /* 9 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l lVar4 = (l) concurrentHashMap.get(message.obj);
                    H1.o.a(lVar4.f3140k.f3122m);
                    if (lVar4.f3137h) {
                        lVar4.m();
                    }
                }
                return true;
            case 10:
                C0671f c0671f = this.f3121l;
                c0671f.getClass();
                C0666a c0666a = new C0666a(c0671f);
                while (c0666a.hasNext()) {
                    l lVar5 = (l) concurrentHashMap.remove((a) c0666a.next());
                    if (lVar5 != null) {
                        lVar5.p();
                    }
                }
                c0671f.clear();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l lVar6 = (l) concurrentHashMap.get(message.obj);
                    d dVar = lVar6.f3140k;
                    H1.o.a(dVar.f3122m);
                    boolean z5 = lVar6.f3137h;
                    if (z5) {
                        if (z5) {
                            d dVar2 = lVar6.f3140k;
                            P1.e eVar2 = dVar2.f3122m;
                            a aVar = lVar6.f3132c;
                            eVar2.removeMessages(11, aVar);
                            dVar2.f3122m.removeMessages(9, aVar);
                            lVar6.f3137h = false;
                        }
                        lVar6.e(dVar.f3115f.b(dVar.f3114e, E1.f.f2289a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        lVar6.f3131b.k("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    l lVar7 = (l) concurrentHashMap.get(message.obj);
                    H1.o.a(lVar7.f3140k.f3122m);
                    F1.a aVar2 = lVar7.f3131b;
                    if (aVar2.c() && lVar7.f3135f.size() == 0) {
                        y.t tVar2 = lVar7.f3133d;
                        if (((Map) tVar2.f11494e).isEmpty() && ((Map) tVar2.f11495i).isEmpty()) {
                            aVar2.k("Timing out service connection.");
                        } else {
                            lVar7.j();
                        }
                    }
                }
                return true;
            case 14:
                throw AbstractC0017m.e(message.obj);
            case AbstractC1024c.f9246g /* 15 */:
                m mVar = (m) message.obj;
                if (concurrentHashMap.containsKey(mVar.f3141a)) {
                    l lVar8 = (l) concurrentHashMap.get(mVar.f3141a);
                    if (lVar8.f3138i.contains(mVar) && !lVar8.f3137h) {
                        if (lVar8.f3131b.c()) {
                            lVar8.g();
                        } else {
                            lVar8.m();
                        }
                    }
                }
                return true;
            case 16:
                m mVar2 = (m) message.obj;
                if (concurrentHashMap.containsKey(mVar2.f3141a)) {
                    l lVar9 = (l) concurrentHashMap.get(mVar2.f3141a);
                    if (lVar9.f3138i.remove(mVar2)) {
                        d dVar3 = lVar9.f3140k;
                        dVar3.f3122m.removeMessages(15, mVar2);
                        dVar3.f3122m.removeMessages(16, mVar2);
                        LinkedList linkedList = lVar9.f3130a;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it3 = linkedList.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            E1.d dVar4 = mVar2.f3142b;
                            if (hasNext) {
                                r rVar = (r) it3.next();
                                if (rVar != null && (b4 = rVar.b(lVar9)) != null) {
                                    int length = b4.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length) {
                                            break;
                                        }
                                        if (!H1.o.f(b4[i7], dVar4)) {
                                            i7++;
                                        } else if (i7 >= 0) {
                                            arrayList.add(rVar);
                                        }
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    r rVar2 = (r) arrayList.get(i8);
                                    linkedList.remove(rVar2);
                                    rVar2.d(new F1.g(dVar4));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                H1.h hVar = this.f3112c;
                if (hVar != null) {
                    if (hVar.f3269d <= 0) {
                        if (!this.f3111b) {
                            synchronized (H1.f.class) {
                                try {
                                    if (H1.f.f3262e == null) {
                                        H1.f.f3262e = new H1.f(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                                    }
                                    fVar = H1.f.f3262e;
                                } finally {
                                }
                            }
                            fVar.getClass();
                            int i9 = ((SparseIntArray) this.f3116g.f11494e).get(203400000, -1);
                            if (i9 != -1) {
                            }
                        }
                        this.f3112c = null;
                    }
                    if (this.f3113d == null) {
                        this.f3113d = new J1.c(this.f3114e, J1.c.f3383i, F1.b.f2634b);
                    }
                    this.f3113d.a(hVar);
                    this.f3112c = null;
                }
                return true;
            case 18:
                ((s) message.obj).getClass();
                if (0 == 0) {
                    H1.h hVar2 = new H1.h(0, Arrays.asList(null));
                    if (this.f3113d == null) {
                        this.f3113d = new J1.c(this.f3114e, J1.c.f3383i, F1.b.f2634b);
                    }
                    this.f3113d.a(hVar2);
                } else {
                    H1.h hVar3 = this.f3112c;
                    if (hVar3 != null) {
                        List list = hVar3.f3270e;
                        if (hVar3.f3269d != 0 || (list != null && list.size() >= 0)) {
                            eVar.removeMessages(17);
                            H1.h hVar4 = this.f3112c;
                            if (hVar4 != null) {
                                if (hVar4.f3269d <= 0) {
                                    if (!this.f3111b) {
                                        synchronized (H1.f.class) {
                                            try {
                                                if (H1.f.f3262e == null) {
                                                    H1.f.f3262e = new H1.f(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                                                }
                                                fVar2 = H1.f.f3262e;
                                            } finally {
                                            }
                                        }
                                        fVar2.getClass();
                                        int i10 = ((SparseIntArray) this.f3116g.f11494e).get(203400000, -1);
                                        if (i10 != -1) {
                                        }
                                    }
                                    this.f3112c = null;
                                }
                                if (this.f3113d == null) {
                                    this.f3113d = new J1.c(this.f3114e, J1.c.f3383i, F1.b.f2634b);
                                }
                                this.f3113d.a(hVar4);
                                this.f3112c = null;
                            }
                        } else {
                            H1.h hVar5 = this.f3112c;
                            if (hVar5.f3270e == null) {
                                hVar5.f3270e = new ArrayList();
                            }
                            hVar5.f3270e.add(null);
                        }
                    }
                    if (this.f3112c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(null);
                        this.f3112c = new H1.h(0, arrayList2);
                        eVar.sendMessageDelayed(eVar.obtainMessage(17), 0L);
                    }
                }
                return true;
            case 19:
                this.f3111b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i2);
                return false;
        }
    }
}
