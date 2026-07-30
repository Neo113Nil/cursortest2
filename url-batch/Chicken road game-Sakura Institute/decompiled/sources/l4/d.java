package l4;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m4.y;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f5955o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f5956p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f5957q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static d f5958r;

    /* renamed from: a, reason: collision with root package name */
    public long f5959a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5960b;

    /* renamed from: c, reason: collision with root package name */
    public m4.h f5961c;

    /* renamed from: d, reason: collision with root package name */
    public o4.c f5962d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5963e;

    /* renamed from: f, reason: collision with root package name */
    public final j4.e f5964f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.c f5965g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5966h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5967i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5968j;

    /* renamed from: k, reason: collision with root package name */
    public final i.f f5969k;

    /* renamed from: l, reason: collision with root package name */
    public final i.f f5970l;

    /* renamed from: m, reason: collision with root package name */
    public final u4.e f5971m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f5972n;

    public d(Context context, Looper looper) {
        j4.e eVar = j4.e.f5013d;
        this.f5959a = 10000L;
        this.f5960b = false;
        this.f5966h = new AtomicInteger(1);
        this.f5967i = new AtomicInteger(0);
        this.f5968j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5969k = new i.f(0);
        this.f5970l = new i.f(0);
        this.f5972n = true;
        this.f5963e = context;
        u4.e eVar2 = new u4.e(looper, this);
        this.f5971m = eVar2;
        this.f5964f = eVar;
        this.f5965g = new androidx.room.c(26);
        PackageManager packageManager = context.getPackageManager();
        if (a8.m.f566f == null) {
            a8.m.f566f = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (a8.m.f566f.booleanValue()) {
            this.f5972n = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static Status b(a aVar, j4.b bVar) {
        return new Status(17, "API: " + ((String) aVar.f5948b.f1070h) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f5004h, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f5957q) {
            if (f5958r == null) {
                synchronized (y.f6413g) {
                    try {
                        handlerThread = y.f6415i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            y.f6415i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = y.f6415i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = j4.e.f5012c;
                f5958r = new d(applicationContext, looper);
            }
            dVar = f5958r;
        }
        return dVar;
    }

    public final boolean a(j4.b bVar, int i7) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        j4.e eVar = this.f5964f;
        Context context = this.f5963e;
        eVar.getClass();
        synchronized (r4.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = r4.a.f7935a;
            if (context2 != null && (bool = r4.a.f7936b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            r4.a.f7936b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                r4.a.f7936b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    r4.a.f7936b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    r4.a.f7936b = Boolean.FALSE;
                }
            }
            r4.a.f7935a = applicationContext;
            booleanValue = r4.a.f7936b.booleanValue();
        }
        if (!booleanValue) {
            int i8 = bVar.f5003g;
            if ((i8 == 0 || bVar.f5004h == null) ? false : true) {
                activity = bVar.f5004h;
            } else {
                Intent a3 = eVar.a(context, i8, null);
                activity = a3 != null ? PendingIntent.getActivity(context, 0, a3, 201326592) : null;
            }
            if (activity != null) {
                int i9 = bVar.f5003g;
                int i10 = GoogleApiActivity.f1770g;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i7);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i9, PendingIntent.getActivity(context, 0, intent, u4.d.f9055a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final j c(o4.c cVar) {
        a aVar = cVar.f6837e;
        ConcurrentHashMap concurrentHashMap = this.f5968j;
        j jVar = (j) concurrentHashMap.get(aVar);
        if (jVar == null) {
            jVar = new j(this, cVar);
            concurrentHashMap.put(aVar, jVar);
        }
        if (jVar.f5975d.m()) {
            this.f5970l.add(aVar);
        }
        jVar.m();
        return jVar;
    }

    public final void e(j4.b bVar, int i7) {
        if (a(bVar, i7)) {
            return;
        }
        u4.e eVar = this.f5971m;
        eVar.sendMessage(eVar.obtainMessage(5, i7, 0, bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        if (r0 != 0) goto L84;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        j jVar;
        j4.d[] b9;
        m4.f fVar;
        m4.f fVar2;
        Context context = this.f5963e;
        i.f fVar3 = this.f5970l;
        u4.e eVar = this.f5971m;
        ConcurrentHashMap concurrentHashMap = this.f5968j;
        int i7 = message.what;
        switch (i7) {
            case 1:
                this.f5959a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                eVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    eVar.sendMessageDelayed(eVar.obtainMessage(12, (a) it.next()), this.f5959a);
                }
                return true;
            case 2:
                throw a0.m.f(message.obj);
            case 3:
                for (j jVar2 : concurrentHashMap.values()) {
                    m4.o.a(jVar2.f5984m.f5971m);
                    jVar2.f5983l = null;
                    jVar2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                q qVar = (q) message.obj;
                o4.c cVar = qVar.f5998c;
                s sVar = qVar.f5996a;
                j jVar3 = (j) concurrentHashMap.get(cVar.f6837e);
                if (jVar3 == null) {
                    jVar3 = c(qVar.f5998c);
                }
                if (!jVar3.f5975d.m() || this.f5967i.get() == qVar.f5997b) {
                    jVar3.n(sVar);
                    return true;
                }
                sVar.c(f5955o);
                jVar3.p();
                return true;
            case 5:
                int i8 = message.arg1;
                j4.b bVar = (j4.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        jVar = (j) it2.next();
                        if (jVar.f5980i == i8) {
                        }
                    } else {
                        jVar = null;
                    }
                }
                if (jVar == null) {
                    Log.wtf("GoogleApiManager", a0.m.n(i8, "Could not find API instance ", " while trying to fail enqueued calls.").toString(), new Exception());
                    return true;
                }
                int i9 = bVar.f5003g;
                if (i9 != 13) {
                    jVar.e(b(jVar.f5976e, bVar));
                    return true;
                }
                this.f5964f.getClass();
                AtomicBoolean atomicBoolean = j4.h.f5016a;
                jVar.e(new Status(17, "Error resolution was canceled by the user, original error message: " + j4.b.a(i9) + ": " + bVar.f5005i, null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar2 = c.f5950j;
                    i iVar = new i(this);
                    cVar2.getClass();
                    synchronized (cVar2) {
                        cVar2.f5953h.add(iVar);
                    }
                    AtomicBoolean atomicBoolean2 = cVar2.f5951f;
                    AtomicBoolean atomicBoolean3 = cVar2.f5952g;
                    if (!atomicBoolean3.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f5959a = 300000L;
                        return true;
                    }
                }
                return true;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                c((o4.c) message.obj);
                return true;
            case q.c.f7259c /* 9 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar4 = (j) concurrentHashMap.get(message.obj);
                    m4.o.a(jVar4.f5984m.f5971m);
                    if (jVar4.f5981j) {
                        jVar4.m();
                        return true;
                    }
                }
                return true;
            case q.c.f7261e /* 10 */:
                fVar3.getClass();
                i.a aVar = new i.a(fVar3);
                while (aVar.hasNext()) {
                    j jVar5 = (j) concurrentHashMap.remove((a) aVar.next());
                    if (jVar5 != null) {
                        jVar5.p();
                    }
                }
                fVar3.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar6 = (j) concurrentHashMap.get(message.obj);
                    d dVar = jVar6.f5984m;
                    m4.o.a(dVar.f5971m);
                    boolean z8 = jVar6.f5981j;
                    if (z8) {
                        a aVar2 = jVar6.f5976e;
                        u4.e eVar2 = jVar6.f5984m.f5971m;
                        if (z8) {
                            eVar2.removeMessages(11, aVar2);
                            eVar2.removeMessages(9, aVar2);
                            jVar6.f5981j = false;
                        }
                        jVar6.e(dVar.f5964f.b(dVar.f5963e, j4.f.f5014a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        jVar6.f5975d.d("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar7 = (j) concurrentHashMap.get(message.obj);
                    m4.o.a(jVar7.f5984m.f5971m);
                    k4.a aVar3 = jVar7.f5975d;
                    if (aVar3.a() && jVar7.f5979h.size() == 0) {
                        androidx.room.c cVar3 = jVar7.f5977f;
                        if (((Map) cVar3.f1069g).isEmpty() && ((Map) cVar3.f1070h).isEmpty()) {
                            aVar3.d("Timing out service connection.");
                            return true;
                        }
                        jVar7.j();
                        return true;
                    }
                }
                return true;
            case 14:
                throw a0.m.f(message.obj);
            case q.c.f7263g /* 15 */:
                k kVar = (k) message.obj;
                if (concurrentHashMap.containsKey(kVar.f5985a)) {
                    j jVar8 = (j) concurrentHashMap.get(kVar.f5985a);
                    if (jVar8.f5982k.contains(kVar) && !jVar8.f5981j) {
                        if (jVar8.f5975d.a()) {
                            jVar8.g();
                            return true;
                        }
                        jVar8.m();
                        return true;
                    }
                }
                return true;
            case 16:
                k kVar2 = (k) message.obj;
                if (concurrentHashMap.containsKey(kVar2.f5985a)) {
                    j jVar9 = (j) concurrentHashMap.get(kVar2.f5985a);
                    ArrayList arrayList = jVar9.f5982k;
                    d dVar2 = jVar9.f5984m;
                    LinkedList<o> linkedList = jVar9.f5974c;
                    if (arrayList.remove(kVar2)) {
                        dVar2.f5971m.removeMessages(15, kVar2);
                        dVar2.f5971m.removeMessages(16, kVar2);
                        j4.d dVar3 = kVar2.f5986b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (o oVar : linkedList) {
                            if (oVar != null && (b9 = oVar.b(jVar9)) != null) {
                                int length = b9.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    if (!m4.o.f(b9[i10], dVar3)) {
                                        i10++;
                                    } else if (i10 >= 0) {
                                        arrayList2.add(oVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            o oVar2 = (o) arrayList2.get(i11);
                            linkedList.remove(oVar2);
                            oVar2.d(new k4.g(dVar3));
                        }
                    }
                }
                return true;
            case 17:
                m4.h hVar = this.f5961c;
                if (hVar != null) {
                    if (hVar.f6371f <= 0) {
                        if (!this.f5960b) {
                            synchronized (m4.f.class) {
                                try {
                                    if (m4.f.f6364f == null) {
                                        m4.f.f6364f = new m4.f();
                                    }
                                    fVar = m4.f.f6364f;
                                } finally {
                                }
                            }
                            fVar.getClass();
                            int i12 = ((SparseIntArray) this.f5965g.f1069g).get(203400000, -1);
                            if (i12 != -1) {
                            }
                        }
                        this.f5961c = null;
                        return true;
                    }
                    if (this.f5962d == null) {
                        this.f5962d = new o4.c(this.f5963e, o4.c.f6832i, k4.b.f5356b);
                    }
                    this.f5962d.a(hVar);
                    this.f5961c = null;
                    return true;
                }
                return true;
            case 18:
                ((p) message.obj).getClass();
                if (0 == 0) {
                    m4.h hVar2 = new m4.h(0, Arrays.asList(null));
                    if (this.f5962d == null) {
                        this.f5962d = new o4.c(this.f5963e, o4.c.f6832i, k4.b.f5356b);
                    }
                    this.f5962d.a(hVar2);
                    return true;
                }
                m4.h hVar3 = this.f5961c;
                if (hVar3 != null) {
                    List list = hVar3.f6372g;
                    if (hVar3.f6371f != 0 || (list != null && list.size() >= 0)) {
                        eVar.removeMessages(17);
                        m4.h hVar4 = this.f5961c;
                        if (hVar4 != null) {
                            if (hVar4.f6371f <= 0) {
                                if (!this.f5960b) {
                                    synchronized (m4.f.class) {
                                        try {
                                            if (m4.f.f6364f == null) {
                                                m4.f.f6364f = new m4.f();
                                            }
                                            fVar2 = m4.f.f6364f;
                                        } finally {
                                        }
                                    }
                                    fVar2.getClass();
                                    int i13 = ((SparseIntArray) this.f5965g.f1069g).get(203400000, -1);
                                    if (i13 != -1) {
                                    }
                                }
                                this.f5961c = null;
                            }
                            if (this.f5962d == null) {
                                this.f5962d = new o4.c(this.f5963e, o4.c.f6832i, k4.b.f5356b);
                            }
                            this.f5962d.a(hVar4);
                            this.f5961c = null;
                        }
                    } else {
                        m4.h hVar5 = this.f5961c;
                        if (hVar5.f6372g == null) {
                            hVar5.f6372g = new ArrayList();
                        }
                        hVar5.f6372g.add(null);
                    }
                }
                if (this.f5961c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.f5961c = new m4.h(0, arrayList3);
                    eVar.sendMessageDelayed(eVar.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.f5960b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }
}
