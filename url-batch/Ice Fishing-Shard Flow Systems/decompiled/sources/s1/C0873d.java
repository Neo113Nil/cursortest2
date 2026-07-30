package s1;

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
import android.os.Process;
import android.util.Log;
import android.util.SparseIntArray;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import i.C0511M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import r1.InterfaceC0843b;
import t1.C0911H;
import t1.C0920g;
import t1.C0921h;
import t1.C0922i;
import t1.C0923j;
import t1.C0924k;
import u.C0930a;
import u.C0935f;
import x1.AbstractC1000b;
import z1.AbstractC1053a;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f7643o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f7644p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f7645q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static C0873d f7646r;

    /* renamed from: a, reason: collision with root package name */
    public long f7647a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7648b;

    /* renamed from: c, reason: collision with root package name */
    public C0923j f7649c;

    /* renamed from: d, reason: collision with root package name */
    public v1.d f7650d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7651e;

    /* renamed from: f, reason: collision with root package name */
    public final q1.e f7652f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.s f7653g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f7654h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f7655i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final C0935f f7656k;

    /* renamed from: l, reason: collision with root package name */
    public final C0935f f7657l;

    /* renamed from: m, reason: collision with root package name */
    public final C1.e f7658m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f7659n;

    public C0873d(Context context, Looper looper) {
        q1.e eVar = q1.e.f7323e;
        this.f7647a = 10000L;
        this.f7648b = false;
        this.f7654h = new AtomicInteger(1);
        this.f7655i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f7656k = new C0935f(0);
        this.f7657l = new C0935f(0);
        this.f7659n = true;
        this.f7651e = context;
        C1.e eVar2 = new C1.e(looper, this);
        this.f7658m = eVar2;
        this.f7652f = eVar;
        this.f7653g = new P0.s(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC1000b.f8322e == null) {
            AbstractC1000b.f8322e = Boolean.valueOf(AbstractC1000b.b() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC1000b.f8322e.booleanValue()) {
            this.f7659n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status b(C0870a c0870a, q1.b bVar) {
        String str = c0870a.f7635b.f7437c;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), bVar.f7312i, bVar);
    }

    public static C0873d c(Context context) {
        C0873d c0873d;
        HandlerThread handlerThread;
        synchronized (f7645q) {
            if (f7646r == null) {
                synchronized (C0911H.f7913g) {
                    try {
                        handlerThread = C0911H.f7915i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C0911H.f7915i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C0911H.f7915i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = q1.e.f7322d;
                f7646r = new C0873d(applicationContext, looper);
            }
            c0873d = f7646r;
        }
        return c0873d;
    }

    public final v a(r1.j jVar) {
        C0870a c0870a = jVar.f7454f;
        ConcurrentHashMap concurrentHashMap = this.j;
        v vVar = (v) concurrentHashMap.get(c0870a);
        if (vVar == null) {
            vVar = new v(this, jVar);
            concurrentHashMap.put(c0870a, vVar);
        }
        if (vVar.f7736f.b()) {
            this.f7657l.add(c0870a);
        }
        vVar.n();
        return vVar;
    }

    public final boolean d() {
        int i2;
        if (this.f7648b) {
            return false;
        }
        C0922i c0922i = (C0922i) C0921h.a().f7958a;
        if (c0922i != null && !c0922i.f7960e) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f7653g.f2251d;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(203400000, -1);
        }
        return i2 == -1 || i2 == 0;
    }

    public final boolean e(q1.b bVar, int i2) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        q1.e eVar = this.f7652f;
        Context context = this.f7651e;
        eVar.getClass();
        synchronized (AbstractC1053a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC1053a.f8712a;
            if (context2 != null && (bool = AbstractC1053a.f8713b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC1053a.f8713b = null;
            if (AbstractC1000b.b()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC1053a.f8713b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC1053a.f8713b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC1053a.f8713b = Boolean.FALSE;
                }
            }
            AbstractC1053a.f8712a = applicationContext;
            booleanValue = AbstractC1053a.f8713b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        if (bVar.a()) {
            activity = bVar.f7312i;
        } else {
            Intent a7 = eVar.a(bVar.f7311e, context, null);
            activity = a7 != null ? PendingIntent.getActivity(context, 0, a7, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i5 = bVar.f7311e;
        int i7 = GoogleApiActivity.f4364e;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        eVar.d(context, i5, PendingIntent.getActivity(context, 0, intent, C1.d.f294a | 134217728));
        eVar.getClass();
        Integer num = bVar.f7314m;
        t1.l lVar = new t1.l(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), bVar.f7311e, false);
        if (eVar.f7324c == null) {
            eVar.f7324c = new v1.d(context, v1.d.j, InterfaceC0843b.f7434a, r1.i.f7447b);
        }
        v1.d dVar = eVar.f7324c;
        dVar.getClass();
        h4.w wVar = new h4.w();
        wVar.f5279b = 0;
        wVar.f5281d = new q1.d[]{C1.c.f292b};
        wVar.f5278a = false;
        wVar.f5280c = new C0511M(23, lVar);
        dVar.b(2, wVar.a());
        return true;
    }

    public final void f(q1.b bVar, int i2) {
        if (e(bVar, i2)) {
            return;
        }
        C1.e eVar = this.f7658m;
        eVar.sendMessage(eVar.obtainMessage(5, i2, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x050e A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        v vVar;
        boolean z7;
        boolean isIsolated;
        q1.d[] a7;
        boolean z8;
        C1.e eVar = this.f7658m;
        ConcurrentHashMap concurrentHashMap = this.j;
        int i2 = message.what;
        int i5 = 23;
        switch (i2) {
            case 1:
                this.f7647a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (C0870a) it.next()), this.f7647a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (v vVar2 : concurrentHashMap.values()) {
                    t1.u.b(vVar2.f7746q.f7658m);
                    vVar2.f7744o = null;
                    vVar2.n();
                }
                return true;
            case 4:
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                C0863E c0863e = (C0863E) message.obj;
                r1.j jVar = c0863e.f7610c;
                C0865G c0865g = c0863e.f7608a;
                v vVar3 = (v) concurrentHashMap.get(jVar.f7454f);
                if (vVar3 == null) {
                    vVar3 = a(jVar);
                }
                if (!vVar3.f7736f.b() || this.f7655i.get() == c0863e.f7609b) {
                    vVar3.l(c0865g);
                    return true;
                }
                c0865g.d(f7643o);
                vVar3.m();
                return true;
            case 5:
                int i7 = message.arg1;
                q1.b bVar = (q1.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        vVar = (v) it2.next();
                        if (vVar.f7740k == i7) {
                        }
                    } else {
                        vVar = null;
                    }
                }
                if (vVar == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 65);
                    sb.append("Could not find API instance ");
                    sb.append(i7);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                int i8 = bVar.f7311e;
                if (i8 != 13) {
                    vVar.g(b(vVar.f7737g, bVar));
                    return true;
                }
                this.f7652f.getClass();
                int i9 = q1.g.f7329c;
                String c7 = q1.b.c(i8);
                String str = bVar.f7313l;
                StringBuilder sb2 = new StringBuilder(String.valueOf(c7).length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(c7);
                sb2.append(": ");
                sb2.append(str);
                vVar.g(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                Context context = this.f7651e;
                if (context.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C0872c.a((Application) context.getApplicationContext());
                    ComponentCallbacks2C0872c componentCallbacks2C0872c = ComponentCallbacks2C0872c.f7638m;
                    u uVar = new u(this);
                    componentCallbacks2C0872c.getClass();
                    synchronized (componentCallbacks2C0872c) {
                        componentCallbacks2C0872c.f7641i.add(uVar);
                    }
                    AtomicBoolean atomicBoolean = componentCallbacks2C0872c.f7639d;
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0872c.f7640e;
                    if (!atomicBoolean2.get()) {
                        Boolean bool = AbstractC1000b.f8325h;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new E1.i(AbstractC1053a.O("expected a non-null reference", objArr));
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            AbstractC1000b.f8325h = bool;
                        }
                        if (bool.booleanValue()) {
                            z7 = true;
                            if (!z7) {
                                this.f7647a = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z7 = atomicBoolean.get();
                    if (!z7) {
                    }
                }
                return true;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                a((r1.j) message.obj);
                return true;
            case 9:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                v vVar4 = (v) concurrentHashMap.get(message.obj);
                t1.u.b(vVar4.f7746q.f7658m);
                if (!vVar4.f7742m) {
                    return true;
                }
                vVar4.n();
                return true;
            case 10:
                C0935f c0935f = this.f7657l;
                c0935f.getClass();
                C0930a c0930a = new C0930a(c0935f);
                while (c0930a.hasNext()) {
                    v vVar5 = (v) concurrentHashMap.remove((C0870a) c0930a.next());
                    if (vVar5 != null) {
                        vVar5.m();
                    }
                }
                c0935f.clear();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                v vVar6 = (v) concurrentHashMap.get(message.obj);
                C0873d c0873d = vVar6.f7746q;
                t1.u.b(c0873d.f7658m);
                boolean z9 = vVar6.f7742m;
                if (!z9) {
                    return true;
                }
                if (z9) {
                    C0873d c0873d2 = vVar6.f7746q;
                    C0870a c0870a = vVar6.f7737g;
                    c0873d2.f7658m.removeMessages(11, c0870a);
                    c0873d2.f7658m.removeMessages(9, c0870a);
                    vVar6.f7742m = false;
                }
                vVar6.g(c0873d.f7652f.b(c0873d.f7651e, q1.f.f7325a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                ((com.google.android.gms.common.internal.a) vVar6.f7736f).e("Timing out connection while resuming.");
                return true;
            case 12:
                if (!concurrentHashMap.containsKey(message.obj)) {
                    return true;
                }
                v vVar7 = (v) concurrentHashMap.get(message.obj);
                t1.u.b(vVar7.f7746q.f7658m);
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) vVar7.f7736f;
                if (aVar.m() && vVar7.j.isEmpty()) {
                    P0.s sVar = vVar7.f7738h;
                    if (((Map) sVar.f2251d).isEmpty() && ((Map) sVar.f2252e).isEmpty()) {
                        aVar.e("Timing out service connection.");
                        return true;
                    }
                    vVar7.h();
                }
                return true;
            case 14:
                message.obj.getClass();
                throw new ClassCastException();
            case 15:
                w wVar = (w) message.obj;
                if (!concurrentHashMap.containsKey(wVar.f7747a)) {
                    return true;
                }
                v vVar8 = (v) concurrentHashMap.get(wVar.f7747a);
                if (!vVar8.f7743n.contains(wVar) || vVar8.f7742m) {
                    return true;
                }
                if (((com.google.android.gms.common.internal.a) vVar8.f7736f).m()) {
                    vVar8.d();
                    return true;
                }
                vVar8.n();
                return true;
            case 16:
                w wVar2 = (w) message.obj;
                if (!concurrentHashMap.containsKey(wVar2.f7747a)) {
                    return true;
                }
                v vVar9 = (v) concurrentHashMap.get(wVar2.f7747a);
                if (!vVar9.f7743n.remove(wVar2)) {
                    return true;
                }
                C0873d c0873d3 = vVar9.f7746q;
                c0873d3.f7658m.removeMessages(15, wVar2);
                c0873d3.f7658m.removeMessages(16, wVar2);
                q1.d dVar = wVar2.f7748b;
                LinkedList<AbstractC0862D> linkedList = vVar9.f7735e;
                ArrayList arrayList = new ArrayList(linkedList.size());
                for (AbstractC0862D abstractC0862D : linkedList) {
                    if ((abstractC0862D instanceof AbstractC0862D) && (a7 = abstractC0862D.a(vVar9)) != null) {
                        int length = a7.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            if (!t1.u.i(a7[i10], dVar)) {
                                i10++;
                            } else if (i10 >= 0) {
                                arrayList.add(abstractC0862D);
                            }
                        }
                    }
                }
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC0862D abstractC0862D2 = (AbstractC0862D) arrayList.get(i11);
                    linkedList.remove(abstractC0862D2);
                    abstractC0862D2.e(new r1.n(dVar));
                }
                return true;
            case 17:
                C0923j c0923j = this.f7649c;
                if (c0923j == null) {
                    return true;
                }
                if (c0923j.f7964d > 0 || d()) {
                    if (this.f7650d == null) {
                        this.f7650d = new v1.d(this.f7651e, v1.d.f8213k, C0924k.f7966b, r1.i.f7447b);
                    }
                    v1.d dVar2 = this.f7650d;
                    dVar2.getClass();
                    h4.w wVar3 = new h4.w();
                    wVar3.f5279b = 0;
                    wVar3.f5281d = new q1.d[]{C1.c.f291a};
                    wVar3.f5278a = false;
                    wVar3.f5280c = new l4.b(i5, c0923j);
                    dVar2.b(2, wVar3.a());
                }
                this.f7649c = null;
                return true;
            case 18:
                C0861C c0861c = (C0861C) message.obj;
                long j = c0861c.f7605c;
                C0920g c0920g = c0861c.f7603a;
                int i12 = c0861c.f7604b;
                if (j == 0) {
                    C0923j c0923j2 = new C0923j(i12, Arrays.asList(c0920g));
                    if (this.f7650d == null) {
                        this.f7650d = new v1.d(this.f7651e, v1.d.f8213k, C0924k.f7966b, r1.i.f7447b);
                    }
                    v1.d dVar3 = this.f7650d;
                    dVar3.getClass();
                    h4.w wVar4 = new h4.w();
                    wVar4.f5279b = 0;
                    wVar4.f5281d = new q1.d[]{C1.c.f291a};
                    wVar4.f5278a = false;
                    wVar4.f5280c = new l4.b(i5, c0923j2);
                    dVar3.b(2, wVar4.a());
                    return true;
                }
                C0923j c0923j3 = this.f7649c;
                if (c0923j3 != null) {
                    List list = c0923j3.f7965e;
                    if (c0923j3.f7964d != i12 || (list != null && list.size() >= c0861c.f7606d)) {
                        eVar.removeMessages(17);
                        C0923j c0923j4 = this.f7649c;
                        if (c0923j4 != null) {
                            if (c0923j4.f7964d > 0 || d()) {
                                if (this.f7650d == null) {
                                    z8 = true;
                                    this.f7650d = new v1.d(this.f7651e, v1.d.f8213k, C0924k.f7966b, r1.i.f7447b);
                                } else {
                                    z8 = true;
                                }
                                v1.d dVar4 = this.f7650d;
                                dVar4.getClass();
                                h4.w wVar5 = new h4.w();
                                wVar5.f5279b = 0;
                                wVar5.f5281d = new q1.d[]{C1.c.f291a};
                                wVar5.f5278a = false;
                                wVar5.f5280c = new l4.b(i5, c0923j4);
                                dVar4.b(2, wVar5.a());
                            } else {
                                z8 = true;
                            }
                            this.f7649c = null;
                            if (this.f7649c == null) {
                                return z8;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c0920g);
                            this.f7649c = new C0923j(i12, arrayList2);
                            eVar.sendMessageDelayed(eVar.obtainMessage(17), j);
                            return z8;
                        }
                    } else {
                        C0923j c0923j5 = this.f7649c;
                        if (c0923j5.f7965e == null) {
                            c0923j5.f7965e = new ArrayList();
                        }
                        c0923j5.f7965e.add(c0920g);
                    }
                }
                z8 = true;
                if (this.f7649c == null) {
                }
                break;
            case 19:
                this.f7648b = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 20);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
