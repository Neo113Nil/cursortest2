package defpackage;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g50 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static g50 r;
    public long a;
    public boolean b;
    public rg1 c;
    public ct1 d;
    public final Context e;
    public final c50 f;
    public final c51 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final t9 k;
    public final t9 l;
    public final gt1 m;
    public volatile boolean n;

    public g50(Context context, Looper looper) {
        c50 c50Var = c50.d;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new t9(0);
        this.l = new t9(0);
        this.n = true;
        this.e = context;
        gt1 gt1Var = new gt1(looper, this);
        Looper.getMainLooper();
        this.m = gt1Var;
        this.f = c50Var;
        this.g = new c51(16);
        PackageManager packageManager = context.getPackageManager();
        if (uq1.u == null) {
            uq1.u = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (uq1.u.booleanValue()) {
            this.n = false;
        }
        gt1Var.sendMessage(gt1Var.obtainMessage(6));
    }

    public static Status b(h8 h8Var, fm fmVar) {
        return new Status(17, "API: " + ((String) h8Var.b.g) + " is not available on this device. Connection failed with: " + String.valueOf(fmVar), fmVar.g, fmVar);
    }

    public static g50 d(Context context) {
        g50 g50Var;
        HandlerThread handlerThread;
        synchronized (q) {
            if (r == null) {
                synchronized (wu1.g) {
                    try {
                        handlerThread = wu1.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            wu1.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = wu1.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = c50.c;
                r = new g50(applicationContext, looper);
            }
            g50Var = r;
        }
        return g50Var;
    }

    public final boolean a(fm fmVar, int i) {
        boolean z;
        PendingIntent activity;
        Boolean bool;
        c50 c50Var = this.f;
        Context context = this.e;
        c50Var.getClass();
        synchronized (m90.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = m90.a;
            if (context2 != null && (bool = m90.b) != null && context2 == applicationContext) {
                z = bool.booleanValue();
            }
            m90.b = null;
            boolean isInstantApp = applicationContext.getPackageManager().isInstantApp();
            m90.b = Boolean.valueOf(isInstantApp);
            m90.a = applicationContext;
            z = isInstantApp;
        }
        if (!z) {
            int i2 = fmVar.e;
            if (i2 == 0 || (activity = fmVar.g) == null) {
                Intent a = c50Var.a(i2, context, null);
                activity = a != null ? PendingIntent.getActivity(context, 0, a, 201326592) : null;
            }
            if (activity != null) {
                int i3 = fmVar.e;
                int i4 = GoogleApiActivity.e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c50Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, dt1.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final es1 c(ct1 ct1Var) {
        h8 h8Var = ct1Var.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        es1 es1Var = (es1) concurrentHashMap.get(h8Var);
        if (es1Var == null) {
            es1Var = new es1(this, ct1Var);
            concurrentHashMap.put(h8Var, es1Var);
        }
        if (es1Var.c.k()) {
            this.l.add(h8Var);
        }
        es1Var.m();
        return es1Var;
    }

    public final void e(fm fmVar, int i) {
        if (a(fmVar, i)) {
            return;
        }
        gt1 gt1Var = this.m;
        gt1Var.sendMessage(gt1Var.obtainMessage(5, i, 0, fmVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        es1 es1Var;
        vx[] b;
        j41 j41Var;
        j41 j41Var2;
        Context context = this.e;
        t9 t9Var = this.l;
        gt1 gt1Var = this.m;
        ConcurrentHashMap concurrentHashMap = this.j;
        int i = message.what;
        int i2 = 0;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                gt1Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    gt1Var.sendMessageDelayed(gt1Var.obtainMessage(12, (h8) it.next()), this.a);
                }
                return true;
            case 2:
                throw qy0.h(message.obj);
            case 3:
                for (es1 es1Var2 : concurrentHashMap.values()) {
                    y90.d(es1Var2.m.m);
                    es1Var2.l = null;
                    es1Var2.m();
                }
                return true;
            case 4:
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                os1 os1Var = (os1) message.obj;
                ct1 ct1Var = os1Var.c;
                xs1 xs1Var = os1Var.a;
                es1 es1Var3 = (es1) concurrentHashMap.get(ct1Var.e);
                if (es1Var3 == null) {
                    es1Var3 = c(os1Var.c);
                }
                if (!es1Var3.c.k() || this.i.get() == os1Var.b) {
                    es1Var3.n(xs1Var);
                    return true;
                }
                xs1Var.c(o);
                es1Var3.q();
                return true;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                int i3 = message.arg1;
                fm fmVar = (fm) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        es1Var = (es1) it2.next();
                        if (es1Var.h == i3) {
                        }
                    } else {
                        es1Var = null;
                    }
                }
                if (es1Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i3 + " while trying to fail enqueued calls.", new Exception());
                    return true;
                }
                int i4 = fmVar.e;
                if (i4 != 13) {
                    es1Var.e(b(es1Var.d, fmVar));
                    return true;
                }
                this.f.getClass();
                int i5 = i50.c;
                es1Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + fm.a(i4) + ": " + fmVar.h, null, null));
                return true;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                if (context.getApplicationContext() instanceof Application) {
                    tc.a((Application) context.getApplicationContext());
                    tc tcVar = tc.i;
                    ds1 ds1Var = new ds1(this);
                    tcVar.getClass();
                    synchronized (tcVar) {
                        tcVar.g.add(ds1Var);
                    }
                    AtomicBoolean atomicBoolean = tcVar.d;
                    AtomicBoolean atomicBoolean2 = tcVar.e;
                    if (!atomicBoolean2.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean.set(true);
                        }
                    }
                    if (!atomicBoolean.get()) {
                        this.a = 300000L;
                        return true;
                    }
                }
                return true;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                c((ct1) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    es1 es1Var4 = (es1) concurrentHashMap.get(message.obj);
                    y90.d(es1Var4.m.m);
                    if (es1Var4.j) {
                        es1Var4.m();
                        return true;
                    }
                }
                return true;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                t9Var.getClass();
                o9 o9Var = new o9(t9Var);
                while (o9Var.hasNext()) {
                    es1 es1Var5 = (es1) concurrentHashMap.remove((h8) o9Var.next());
                    if (es1Var5 != null) {
                        es1Var5.q();
                    }
                }
                t9Var.clear();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    es1 es1Var6 = (es1) concurrentHashMap.get(message.obj);
                    g50 g50Var = es1Var6.m;
                    y90.d(g50Var.m);
                    boolean z = es1Var6.j;
                    if (z) {
                        h8 h8Var = es1Var6.d;
                        gt1 gt1Var2 = es1Var6.m.m;
                        if (z) {
                            gt1Var2.removeMessages(11, h8Var);
                            gt1Var2.removeMessages(9, h8Var);
                            es1Var6.j = false;
                        }
                        es1Var6.e(g50Var.f.b(g50Var.e, d50.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        es1Var6.c.c("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    es1 es1Var7 = (es1) concurrentHashMap.get(message.obj);
                    y90.d(es1Var7.m.m);
                    b8 b8Var = es1Var7.c;
                    if (b8Var.a() && es1Var7.g.isEmpty()) {
                        c51 c51Var = es1Var7.e;
                        if (((Map) c51Var.e).isEmpty() && ((Map) c51Var.g).isEmpty()) {
                            b8Var.c("Timing out service connection.");
                            return true;
                        }
                        es1Var7.j();
                    }
                    return true;
                }
                return true;
            case 14:
                throw qy0.h(message.obj);
            case 15:
                fs1 fs1Var = (fs1) message.obj;
                if (concurrentHashMap.containsKey(fs1Var.a)) {
                    es1 es1Var8 = (es1) concurrentHashMap.get(fs1Var.a);
                    if (es1Var8.k.contains(fs1Var) && !es1Var8.j) {
                        if (es1Var8.c.a()) {
                            es1Var8.g();
                            return true;
                        }
                        es1Var8.m();
                        return true;
                    }
                }
                return true;
            case 16:
                fs1 fs1Var2 = (fs1) message.obj;
                if (concurrentHashMap.containsKey(fs1Var2.a)) {
                    es1 es1Var9 = (es1) concurrentHashMap.get(fs1Var2.a);
                    ArrayList arrayList = es1Var9.k;
                    g50 g50Var2 = es1Var9.m;
                    LinkedList<ms1> linkedList = es1Var9.b;
                    if (arrayList.remove(fs1Var2)) {
                        g50Var2.m.removeMessages(15, fs1Var2);
                        g50Var2.m.removeMessages(16, fs1Var2);
                        vx vxVar = fs1Var2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (ms1 ms1Var : linkedList) {
                            if (ms1Var != null && (b = ms1Var.b(es1Var9)) != null) {
                                int length = b.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        break;
                                    }
                                    if (!xa0.m(b[i6], vxVar)) {
                                        i6++;
                                    } else if (i6 >= 0) {
                                        arrayList2.add(ms1Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            ms1 ms1Var2 = (ms1) arrayList2.get(i2);
                            linkedList.remove(ms1Var2);
                            ms1Var2.d(new pl1(vxVar));
                            i2++;
                        }
                    }
                }
                return true;
            case 17:
                rg1 rg1Var = this.c;
                if (rg1Var != null) {
                    if (rg1Var.d <= 0) {
                        if (!this.b) {
                            synchronized (j41.class) {
                                try {
                                    if (j41.e == null) {
                                        j41.e = new j41(i2);
                                    }
                                    j41Var = j41.e;
                                } finally {
                                }
                            }
                            j41Var.getClass();
                            int i7 = ((SparseIntArray) this.g.e).get(203400000, -1);
                            if (i7 != -1) {
                            }
                        }
                        this.c = null;
                        return true;
                    }
                    if (this.d == null) {
                        this.d = new ct1(this.e, sg1.b);
                    }
                    this.d.b(rg1Var);
                    this.c = null;
                    return true;
                }
                return true;
            case 18:
                ((ns1) message.obj).getClass();
                if (0 == 0) {
                    rg1 rg1Var2 = new rg1(0, Arrays.asList(null));
                    if (this.d == null) {
                        this.d = new ct1(this.e, sg1.b);
                    }
                    this.d.b(rg1Var2);
                    return true;
                }
                rg1 rg1Var3 = this.c;
                if (rg1Var3 != null) {
                    List list = rg1Var3.e;
                    if (rg1Var3.d != 0 || (list != null && list.size() >= 0)) {
                        gt1Var.removeMessages(17);
                        rg1 rg1Var4 = this.c;
                        if (rg1Var4 != null) {
                            if (rg1Var4.d <= 0) {
                                if (!this.b) {
                                    synchronized (j41.class) {
                                        try {
                                            if (j41.e == null) {
                                                j41.e = new j41(i2);
                                            }
                                            j41Var2 = j41.e;
                                        } finally {
                                        }
                                    }
                                    j41Var2.getClass();
                                    int i8 = ((SparseIntArray) this.g.e).get(203400000, -1);
                                    if (i8 != -1) {
                                    }
                                }
                                this.c = null;
                            }
                            if (this.d == null) {
                                this.d = new ct1(this.e, sg1.b);
                            }
                            this.d.b(rg1Var4);
                            this.c = null;
                        }
                    } else {
                        rg1 rg1Var5 = this.c;
                        if (rg1Var5.e == null) {
                            rg1Var5.e = new ArrayList();
                        }
                        rg1Var5.e.add(null);
                    }
                }
                if (this.c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.c = new rg1(0, arrayList3);
                    gt1Var.sendMessageDelayed(gt1Var.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }
}
