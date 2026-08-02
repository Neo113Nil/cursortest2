package c2;

import E.AbstractC0005f;
import a2.C0162b;
import a2.C0164d;
import a2.C0165e;
import a2.C0166f;
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
import d2.C0381C;
import d2.C0388f;
import d2.C0389g;
import f2.C0421c;
import i2.AbstractC0457a;
import io.appmetrica.analytics.impl.C0583e9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m2.AbstractC1310b;
import m2.AbstractC1311c;
import m2.HandlerC1312d;
import p.C1342a;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286c implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f5659p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f5660q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static C0286c f5661r;

    /* renamed from: a, reason: collision with root package name */
    public long f5662a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5663b;

    /* renamed from: c, reason: collision with root package name */
    public d2.j f5664c;

    /* renamed from: d, reason: collision with root package name */
    public C0421c f5665d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5666e;

    /* renamed from: f, reason: collision with root package name */
    public final C0165e f5667f;

    /* renamed from: g, reason: collision with root package name */
    public final C0389g f5668g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5669h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5670i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5671j;

    /* renamed from: k, reason: collision with root package name */
    public final p.f f5672k;

    /* renamed from: l, reason: collision with root package name */
    public final p.f f5673l;

    /* renamed from: m, reason: collision with root package name */
    public final HandlerC1312d f5674m;
    public volatile boolean n;

    public C0286c(Context context, Looper looper) {
        C0165e c0165e = C0165e.f4275d;
        this.f5662a = 10000L;
        this.f5663b = false;
        this.f5669h = new AtomicInteger(1);
        this.f5670i = new AtomicInteger(0);
        this.f5671j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5672k = new p.f(0);
        this.f5673l = new p.f(0);
        this.n = true;
        this.f5666e = context;
        HandlerC1312d handlerC1312d = new HandlerC1312d(looper, this);
        Looper.getMainLooper();
        this.f5674m = handlerC1312d;
        this.f5667f = c0165e;
        this.f5668g = new C0389g(1);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0457a.f9317f == null) {
            AbstractC0457a.f9317f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC0457a.f9317f.booleanValue()) {
            this.n = false;
        }
        handlerC1312d.sendMessage(handlerC1312d.obtainMessage(6));
    }

    public static Status c(C0284a c0284a, C0162b c0162b) {
        return new Status(17, "API: " + ((String) c0284a.f5651b.f14271c) + " is not available on this device. Connection failed with: " + String.valueOf(c0162b), c0162b.f4266c, c0162b);
    }

    public static C0286c e(Context context) {
        C0286c c0286c;
        HandlerThread handlerThread;
        synchronized (f5660q) {
            if (f5661r == null) {
                synchronized (C0381C.f8223g) {
                    try {
                        handlerThread = C0381C.f8225i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C0381C.f8225i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C0381C.f8225i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C0165e.f4274c;
                f5661r = new C0286c(applicationContext, looper);
            }
            c0286c = f5661r;
        }
        return c0286c;
    }

    public final boolean a() {
        if (this.f5663b) {
            return false;
        }
        d2.i iVar = (d2.i) d2.h.b().f8268a;
        if (iVar != null && !iVar.f8270b) {
            return false;
        }
        int i4 = ((SparseIntArray) this.f5668g.f8264b).get(203400000, -1);
        return i4 == -1 || i4 == 0;
    }

    public final boolean b(C0162b c0162b, int i4) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        C0165e c0165e = this.f5667f;
        Context context = this.f5666e;
        c0165e.getClass();
        synchronized (AbstractC0457a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = AbstractC0457a.f9312a;
            if (context2 != null && (bool = AbstractC0457a.f9313b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            AbstractC0457a.f9313b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                AbstractC0457a.f9313b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    AbstractC0457a.f9313b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    AbstractC0457a.f9313b = Boolean.FALSE;
                }
            }
            AbstractC0457a.f9312a = applicationContext;
            booleanValue = AbstractC0457a.f9313b.booleanValue();
        }
        if (!booleanValue) {
            int i5 = c0162b.f4265b;
            if ((i5 == 0 || c0162b.f4266c == null) ? false : true) {
                activity = c0162b.f4266c;
            } else {
                Intent a3 = c0165e.a(i5, context, null);
                activity = a3 != null ? PendingIntent.getActivity(context, 0, a3, 201326592) : null;
            }
            if (activity != null) {
                int i6 = c0162b.f4265b;
                int i7 = GoogleApiActivity.f5769b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i4);
                intent.putExtra("notify_manager", true);
                c0165e.f(context, i6, PendingIntent.getActivity(context, 0, intent, AbstractC1311c.f14500a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m d(b2.f fVar) {
        C0284a c0284a = fVar.f5391e;
        ConcurrentHashMap concurrentHashMap = this.f5671j;
        m mVar = (m) concurrentHashMap.get(c0284a);
        if (mVar == null) {
            mVar = new m(this, fVar);
            concurrentHashMap.put(c0284a, mVar);
        }
        if (mVar.f5683b.m()) {
            this.f5673l.add(c0284a);
        }
        mVar.m();
        return mVar;
    }

    public final void f(C0162b c0162b, int i4) {
        if (b(c0162b, i4)) {
            return;
        }
        HandlerC1312d handlerC1312d = this.f5674m;
        handlerC1312d.sendMessage(handlerC1312d.obtainMessage(5, i4, 0, c0162b));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        m mVar;
        C0164d[] b4;
        int i4 = message.what;
        switch (i4) {
            case 1:
                this.f5662a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f5674m.removeMessages(12);
                for (C0284a c0284a : this.f5671j.keySet()) {
                    HandlerC1312d handlerC1312d = this.f5674m;
                    handlerC1312d.sendMessageDelayed(handlerC1312d.obtainMessage(12, c0284a), this.f5662a);
                }
                return true;
            case 2:
                message.obj.getClass();
                throw new ClassCastException();
            case 3:
                for (m mVar2 : this.f5671j.values()) {
                    d2.s.a(mVar2.f5694m.f5674m);
                    mVar2.f5692k = null;
                    mVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t tVar = (t) message.obj;
                m mVar3 = (m) this.f5671j.get(tVar.f5711c.f5391e);
                if (mVar3 == null) {
                    mVar3 = d(tVar.f5711c);
                }
                if (!mVar3.f5683b.m() || this.f5670i.get() == tVar.f5710b) {
                    mVar3.n(tVar.f5709a);
                    return true;
                }
                tVar.f5709a.c(o);
                mVar3.q();
                return true;
            case 5:
                int i5 = message.arg1;
                C0162b c0162b = (C0162b) message.obj;
                Iterator it = this.f5671j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        mVar = (m) it.next();
                        if (mVar.f5688g == i5) {
                        }
                    } else {
                        mVar = null;
                    }
                }
                if (mVar == null) {
                    Log.wtf("GoogleApiManager", AbstractC0005f.k(i5, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i6 = c0162b.f4265b;
                if (i6 != 13) {
                    mVar.e(c(mVar.f5684c, c0162b));
                    return true;
                }
                this.f5667f.getClass();
                AtomicBoolean atomicBoolean = a2.h.f4278a;
                mVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + C0162b.a(i6) + ": " + c0162b.f4267d, null, null));
                return true;
            case 6:
                if (this.f5666e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f5666e.getApplicationContext();
                    ComponentCallbacks2C0285b componentCallbacks2C0285b = ComponentCallbacks2C0285b.f5654e;
                    synchronized (componentCallbacks2C0285b) {
                        try {
                            if (!componentCallbacks2C0285b.f5658d) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C0285b);
                                application.registerComponentCallbacks(componentCallbacks2C0285b);
                                componentCallbacks2C0285b.f5658d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    k kVar = new k(this);
                    synchronized (componentCallbacks2C0285b) {
                        componentCallbacks2C0285b.f5657c.add(kVar);
                    }
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0285b.f5655a;
                    AtomicBoolean atomicBoolean3 = componentCallbacks2C0285b.f5656b;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f5662a = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                d((b2.f) message.obj);
                return true;
            case 9:
                if (this.f5671j.containsKey(message.obj)) {
                    m mVar4 = (m) this.f5671j.get(message.obj);
                    d2.s.a(mVar4.f5694m.f5674m);
                    if (mVar4.f5690i) {
                        mVar4.m();
                        return true;
                    }
                }
                return true;
            case 10:
                p.f fVar = this.f5673l;
                fVar.getClass();
                C1342a c1342a = new C1342a(fVar);
                while (c1342a.hasNext()) {
                    m mVar5 = (m) this.f5671j.remove((C0284a) c1342a.next());
                    if (mVar5 != null) {
                        mVar5.q();
                    }
                }
                this.f5673l.clear();
                return true;
            case 11:
                if (this.f5671j.containsKey(message.obj)) {
                    m mVar6 = (m) this.f5671j.get(message.obj);
                    C0286c c0286c = mVar6.f5694m;
                    d2.s.a(c0286c.f5674m);
                    boolean z = mVar6.f5690i;
                    if (z) {
                        C0284a c0284a2 = mVar6.f5684c;
                        HandlerC1312d handlerC1312d2 = mVar6.f5694m.f5674m;
                        if (z) {
                            handlerC1312d2.removeMessages(11, c0284a2);
                            handlerC1312d2.removeMessages(9, c0284a2);
                            mVar6.f5690i = false;
                        }
                        mVar6.e(c0286c.f5667f.b(c0286c.f5666e, C0166f.f4276a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        mVar6.f5683b.b("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.f5671j.containsKey(message.obj)) {
                    m mVar7 = (m) this.f5671j.get(message.obj);
                    d2.s.a(mVar7.f5694m.f5674m);
                    b2.c cVar = mVar7.f5683b;
                    if (cVar.g() && mVar7.f5687f.isEmpty()) {
                        l2.e eVar = mVar7.f5685d;
                        if (((Map) eVar.f14270b).isEmpty() && ((Map) eVar.f14271c).isEmpty()) {
                            cVar.b("Timing out service connection.");
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
                if (this.f5671j.containsKey(nVar.f5695a)) {
                    m mVar8 = (m) this.f5671j.get(nVar.f5695a);
                    if (mVar8.f5691j.contains(nVar) && !mVar8.f5690i) {
                        if (mVar8.f5683b.g()) {
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
                if (this.f5671j.containsKey(nVar2.f5695a)) {
                    m mVar9 = (m) this.f5671j.get(nVar2.f5695a);
                    ArrayList arrayList = mVar9.f5691j;
                    C0286c c0286c2 = mVar9.f5694m;
                    LinkedList<q> linkedList = mVar9.f5682a;
                    if (arrayList.remove(nVar2)) {
                        c0286c2.f5674m.removeMessages(15, nVar2);
                        c0286c2.f5674m.removeMessages(16, nVar2);
                        C0164d c0164d = nVar2.f5696b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (q qVar : linkedList) {
                            if (qVar != null && (b4 = qVar.b(mVar9)) != null) {
                                int length = b4.length;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    if (!d2.s.e(b4[i7], c0164d)) {
                                        i7++;
                                    } else if (i7 >= 0) {
                                        arrayList2.add(qVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            q qVar2 = (q) arrayList2.get(i8);
                            linkedList.remove(qVar2);
                            qVar2.d(new b2.k(c0164d));
                        }
                    }
                }
                return true;
            case 17:
                d2.j jVar = this.f5664c;
                if (jVar != null) {
                    if (jVar.f8274a > 0 || a()) {
                        if (this.f5665d == null) {
                            this.f5665d = new C0421c(this.f5666e, C0421c.f8811i, d2.k.f8276b, b2.e.f5385b);
                        }
                        C0421c c0421c = this.f5665d;
                        c0421c.getClass();
                        i iVar = new i();
                        iVar.f5677c = 0;
                        iVar.f5675a = new C0164d[]{AbstractC1310b.f14498a};
                        iVar.f5676b = false;
                        iVar.f5678d = new e0.t(jVar);
                        c0421c.b(2, iVar.a());
                    }
                    this.f5664c = null;
                    return true;
                }
                return true;
            case 18:
                s sVar = (s) message.obj;
                if (sVar.f5707c == 0) {
                    d2.j jVar2 = new d2.j(sVar.f5706b, Arrays.asList(sVar.f5705a));
                    if (this.f5665d == null) {
                        this.f5665d = new C0421c(this.f5666e, C0421c.f8811i, d2.k.f8276b, b2.e.f5385b);
                    }
                    C0421c c0421c2 = this.f5665d;
                    c0421c2.getClass();
                    i iVar2 = new i();
                    iVar2.f5677c = 0;
                    iVar2.f5675a = new C0164d[]{AbstractC1310b.f14498a};
                    iVar2.f5676b = false;
                    iVar2.f5678d = new e0.t(jVar2);
                    c0421c2.b(2, iVar2.a());
                    return true;
                }
                d2.j jVar3 = this.f5664c;
                if (jVar3 != null) {
                    List list = jVar3.f8275b;
                    if (jVar3.f8274a != sVar.f5706b || (list != null && list.size() >= sVar.f5708d)) {
                        this.f5674m.removeMessages(17);
                        d2.j jVar4 = this.f5664c;
                        if (jVar4 != null) {
                            if (jVar4.f8274a > 0 || a()) {
                                if (this.f5665d == null) {
                                    this.f5665d = new C0421c(this.f5666e, C0421c.f8811i, d2.k.f8276b, b2.e.f5385b);
                                }
                                C0421c c0421c3 = this.f5665d;
                                c0421c3.getClass();
                                i iVar3 = new i();
                                iVar3.f5677c = 0;
                                iVar3.f5675a = new C0164d[]{AbstractC1310b.f14498a};
                                iVar3.f5676b = false;
                                iVar3.f5678d = new e0.t(jVar4);
                                c0421c3.b(2, iVar3.a());
                            }
                            this.f5664c = null;
                        }
                    } else {
                        d2.j jVar5 = this.f5664c;
                        C0388f c0388f = sVar.f5705a;
                        if (jVar5.f8275b == null) {
                            jVar5.f8275b = new ArrayList();
                        }
                        jVar5.f8275b.add(c0388f);
                    }
                }
                if (this.f5664c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(sVar.f5705a);
                    this.f5664c = new d2.j(sVar.f5706b, arrayList3);
                    HandlerC1312d handlerC1312d3 = this.f5674m;
                    handlerC1312d3.sendMessageDelayed(handlerC1312d3.obtainMessage(17), sVar.f5707c);
                    return true;
                }
                return true;
            case C0583e9.f11743C /* 19 */:
                this.f5663b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i4);
                return false;
        }
    }
}
