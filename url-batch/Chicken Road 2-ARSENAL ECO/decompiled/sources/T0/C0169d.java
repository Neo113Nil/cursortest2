package T0;

import a1.AbstractC0223a;
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
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q.C0583c;
import q.C0587g;
import u0.C0673c;
import u0.C0689s;

/* renamed from: T0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f2277o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f2278p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f2279q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static C0169d f2280r;

    /* renamed from: a, reason: collision with root package name */
    public long f2281a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2282b;

    /* renamed from: c, reason: collision with root package name */
    public U0.j f2283c;

    /* renamed from: d, reason: collision with root package name */
    public W0.c f2284d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2285e;

    /* renamed from: f, reason: collision with root package name */
    public final R0.d f2286f;

    /* renamed from: g, reason: collision with root package name */
    public final C0689s f2287g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f2288h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f2289i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f2290j;

    /* renamed from: k, reason: collision with root package name */
    public final C0583c f2291k;

    /* renamed from: l, reason: collision with root package name */
    public final C0583c f2292l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.e f2293m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f2294n;

    public C0169d(Context context, Looper looper) {
        R0.d dVar = R0.d.f2063c;
        this.f2281a = 10000L;
        this.f2282b = false;
        this.f2288h = new AtomicInteger(1);
        this.f2289i = new AtomicInteger(0);
        this.f2290j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f2291k = new C0583c(0);
        this.f2292l = new C0583c(0);
        this.f2294n = true;
        this.f2285e = context;
        c1.e eVar = new c1.e(looper, this);
        this.f2293m = eVar;
        this.f2286f = dVar;
        this.f2287g = new C0689s(dVar);
        PackageManager packageManager = context.getPackageManager();
        if (Y0.b.f3087e == null) {
            Y0.b.f3087e = Boolean.valueOf(Y0.b.b() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (Y0.b.f3087e.booleanValue()) {
            this.f2294n = false;
        }
        eVar.sendMessage(eVar.obtainMessage(6));
    }

    public static Status b(C0166a c0166a, R0.a aVar) {
        String str = c0166a.f2270b.f2202c;
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), aVar.f2054h, aVar);
    }

    public static C0169d d(Context context) {
        C0169d c0169d;
        HandlerThread handlerThread;
        synchronized (f2279q) {
            if (f2280r == null) {
                synchronized (U0.C.f2497g) {
                    try {
                        handlerThread = U0.C.f2499i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            U0.C.f2499i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = U0.C.f2499i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = R0.d.f2062b;
                f2280r = new C0169d(applicationContext, looper);
            }
            c0169d = f2280r;
        }
        return c0169d;
    }

    public final boolean a(R0.a aVar, int i7) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        R0.d dVar = this.f2286f;
        Context context = this.f2285e;
        dVar.getClass();
        synchronized (AbstractC0223a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC0223a.f3124a;
            if (context2 != null && (bool = AbstractC0223a.f3125b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC0223a.f3125b = null;
            if (Y0.b.b()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC0223a.f3125b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC0223a.f3125b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC0223a.f3125b = Boolean.FALSE;
                }
            }
            AbstractC0223a.f3124a = applicationContext;
            booleanValue = AbstractC0223a.f3125b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        if (aVar.a()) {
            activity = aVar.f2054h;
        } else {
            Intent a7 = dVar.a(aVar.f2053g, context, null);
            activity = a7 != null ? PendingIntent.getActivity(context, 0, a7, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i8 = aVar.f2053g;
        int i9 = GoogleApiActivity.f3854g;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i7);
        intent.putExtra("notify_manager", true);
        dVar.f(context, i8, PendingIntent.getActivity(context, 0, intent, c1.d.f3778a | 134217728));
        return true;
    }

    public final B c(W0.c cVar) {
        C0166a c0166a = cVar.f2794e;
        ConcurrentHashMap concurrentHashMap = this.f2290j;
        B b7 = (B) concurrentHashMap.get(c0166a);
        if (b7 == null) {
            b7 = new B(this, cVar);
            concurrentHashMap.put(c0166a, b7);
        }
        if (b7.f2223e.m()) {
            this.f2292l.add(c0166a);
        }
        b7.j();
        return b7;
    }

    public final void e(R0.a aVar, int i7) {
        if (a(aVar, i7)) {
            return;
        }
        c1.e eVar = this.f2293m;
        eVar.sendMessage(eVar.obtainMessage(5, i7, 0, aVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0127, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        B b7;
        R0.c[] b8;
        U0.h hVar;
        U0.h hVar2;
        Context context = this.f2285e;
        C0583c c0583c = this.f2292l;
        c1.e eVar = this.f2293m;
        ConcurrentHashMap concurrentHashMap = this.f2290j;
        int i7 = message.what;
        int i8 = 0;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f2281a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (C0166a) it.next()), this.f2281a);
                }
                return true;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (B b9 : concurrentHashMap.values()) {
                    U0.t.b(b9.f2233o.f2293m);
                    b9.f2232n = null;
                    b9.j();
                }
                return true;
            case 4:
            case 8:
            case 13:
                K k4 = (K) message.obj;
                W0.c cVar = k4.f2247c;
                N n7 = k4.f2245a;
                B b10 = (B) concurrentHashMap.get(cVar.f2794e);
                if (b10 == null) {
                    b10 = c(k4.f2247c);
                }
                if (!b10.f2223e.m() || this.f2289i.get() == k4.f2246b) {
                    b10.k(n7);
                    return true;
                }
                n7.c(f2277o);
                b10.m();
                return true;
            case 5:
                int i9 = message.arg1;
                R0.a aVar = (R0.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b7 = (B) it2.next();
                        if (b7.f2228j == i9) {
                        }
                    } else {
                        b7 = null;
                    }
                }
                if (b7 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i9);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i10 = aVar.f2053g;
                if (i10 != 13) {
                    b7.b(b(b7.f2224f, aVar));
                    return true;
                }
                this.f2286f.getClass();
                int i11 = R0.f.f2067c;
                String c7 = R0.a.c(i10);
                String str = aVar.f2055i;
                StringBuilder sb2 = new StringBuilder(String.valueOf(c7).length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(c7);
                sb2.append(": ");
                sb2.append(str);
                b7.b(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0168c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0168c componentCallbacks2C0168c = ComponentCallbacks2C0168c.f2272j;
                    z zVar = new z(this);
                    componentCallbacks2C0168c.getClass();
                    synchronized (componentCallbacks2C0168c) {
                        componentCallbacks2C0168c.f2275h.add(zVar);
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C0168c.f2273f;
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0168c.f2274g;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.f2281a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                c((W0.c) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    B b11 = (B) concurrentHashMap.get(message.obj);
                    U0.t.b(b11.f2233o.f2293m);
                    if (b11.f2230l) {
                        b11.j();
                        return true;
                    }
                }
                return true;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                Iterator it3 = c0583c.iterator();
                while (true) {
                    C0587g c0587g = (C0587g) it3;
                    if (!c0587g.hasNext()) {
                        c0583c.clear();
                        return true;
                    }
                    B b12 = (B) concurrentHashMap.remove((C0166a) c0587g.next());
                    if (b12 != null) {
                        b12.m();
                    }
                }
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    B b13 = (B) concurrentHashMap.get(message.obj);
                    C0169d c0169d = b13.f2233o;
                    U0.t.b(c0169d.f2293m);
                    boolean z5 = b13.f2230l;
                    if (z5) {
                        C0166a c0166a = b13.f2224f;
                        c1.e eVar2 = b13.f2233o.f2293m;
                        if (z5) {
                            eVar2.removeMessages(11, c0166a);
                            eVar2.removeMessages(9, c0166a);
                            b13.f2230l = false;
                        }
                        b13.b(c0169d.f2286f.b(c0169d.f2285e, R0.e.f2064a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        b13.f2223e.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    B b14 = (B) concurrentHashMap.get(message.obj);
                    U0.t.b(b14.f2233o.f2293m);
                    S0.a aVar2 = b14.f2223e;
                    if (aVar2.a() && b14.f2227i.size() == 0) {
                        C0673c c0673c = b14.f2225g;
                        if (((Map) c0673c.f5968f).isEmpty() && ((Map) c0673c.f5969g).isEmpty()) {
                            aVar2.d("Timing out service connection.");
                            return true;
                        }
                        b14.g();
                        return true;
                    }
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                C c8 = (C) message.obj;
                if (concurrentHashMap.containsKey(c8.f2234a)) {
                    B b15 = (B) concurrentHashMap.get(c8.f2234a);
                    if (b15.f2231m.contains(c8) && !b15.f2230l) {
                        if (b15.f2223e.a()) {
                            b15.d();
                            return true;
                        }
                        b15.j();
                        return true;
                    }
                }
                return true;
            case 16:
                C c9 = (C) message.obj;
                if (concurrentHashMap.containsKey(c9.f2234a)) {
                    B b16 = (B) concurrentHashMap.get(c9.f2234a);
                    ArrayList arrayList = b16.f2231m;
                    C0169d c0169d2 = b16.f2233o;
                    LinkedList<H> linkedList = b16.f2222d;
                    if (arrayList.remove(c9)) {
                        c0169d2.f2293m.removeMessages(15, c9);
                        c0169d2.f2293m.removeMessages(16, c9);
                        R0.c cVar2 = c9.f2235b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (H h7 : linkedList) {
                            if ((h7 instanceof H) && (b8 = h7.b(b16)) != null) {
                                int length = b8.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        break;
                                    }
                                    if (!U0.t.i(b8[i12], cVar2)) {
                                        i12++;
                                    } else if (i12 >= 0) {
                                        arrayList2.add(h7);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i8 < size) {
                            H h8 = (H) arrayList2.get(i8);
                            linkedList.remove(h8);
                            h8.d(new S0.h(cVar2));
                            i8++;
                        }
                    }
                }
                return true;
            case 17:
                U0.j jVar = this.f2283c;
                if (jVar != null) {
                    if (jVar.f2547f <= 0) {
                        if (!this.f2282b) {
                            synchronized (U0.h.class) {
                                try {
                                    if (U0.h.f2540g == null) {
                                        U0.h.f2540g = new U0.h(i8);
                                    }
                                    hVar = U0.h.f2540g;
                                } finally {
                                }
                            }
                            hVar.getClass();
                            int i13 = ((SparseIntArray) this.f2287g.f6034f).get(203400000, -1);
                            if (i13 != -1) {
                            }
                        }
                        this.f2283c = null;
                        return true;
                    }
                    if (this.f2284d == null) {
                        this.f2284d = new W0.c(this.f2285e, W0.c.f2789i, S0.d.f2203b);
                    }
                    this.f2284d.b(jVar);
                    this.f2283c = null;
                    return true;
                }
                return true;
            case 18:
                ((J) message.obj).getClass();
                if (0 == 0) {
                    U0.j jVar2 = new U0.j(0, Arrays.asList(null));
                    if (this.f2284d == null) {
                        this.f2284d = new W0.c(this.f2285e, W0.c.f2789i, S0.d.f2203b);
                    }
                    this.f2284d.b(jVar2);
                    return true;
                }
                U0.j jVar3 = this.f2283c;
                if (jVar3 != null) {
                    List list = jVar3.f2548g;
                    if (jVar3.f2547f != 0 || (list != null && list.size() >= 0)) {
                        eVar.removeMessages(17);
                        U0.j jVar4 = this.f2283c;
                        if (jVar4 != null) {
                            if (jVar4.f2547f <= 0) {
                                if (!this.f2282b) {
                                    synchronized (U0.h.class) {
                                        try {
                                            if (U0.h.f2540g == null) {
                                                U0.h.f2540g = new U0.h(i8);
                                            }
                                            hVar2 = U0.h.f2540g;
                                        } finally {
                                        }
                                    }
                                    hVar2.getClass();
                                    int i14 = ((SparseIntArray) this.f2287g.f6034f).get(203400000, -1);
                                    if (i14 != -1) {
                                    }
                                }
                                this.f2283c = null;
                            }
                            if (this.f2284d == null) {
                                this.f2284d = new W0.c(this.f2285e, W0.c.f2789i, S0.d.f2203b);
                            }
                            this.f2284d.b(jVar4);
                            this.f2283c = null;
                        }
                    } else {
                        U0.j jVar5 = this.f2283c;
                        if (jVar5.f2548g == null) {
                            jVar5.f2548g = new ArrayList();
                        }
                        jVar5.f2548g.add(null);
                    }
                }
                if (this.f2283c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.f2283c = new U0.j(0, arrayList3);
                    eVar.sendMessageDelayed(eVar.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.f2282b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i7);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
