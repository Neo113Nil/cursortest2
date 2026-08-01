package b7;

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
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseIntArray;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.z5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public static final Status f1259o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: p, reason: collision with root package name */
    public static final Status f1260p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f1261q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static d f1262r;

    /* renamed from: a, reason: collision with root package name */
    public long f1263a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1264b;

    /* renamed from: c, reason: collision with root package name */
    public c7.n f1265c;

    /* renamed from: d, reason: collision with root package name */
    public e7.d f1266d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1267e;

    /* renamed from: f, reason: collision with root package name */
    public final z6.f f1268f;
    public final c6.s g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f1269h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1270i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final s.f f1271k;

    /* renamed from: l, reason: collision with root package name */
    public final s.f f1272l;

    /* renamed from: m, reason: collision with root package name */
    public final z5 f1273m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f1274n;

    public d(Context context, Looper looper) {
        z6.f fVar = z6.f.f10879e;
        this.f1263a = 10000L;
        this.f1264b = false;
        this.f1269h = new AtomicInteger(1);
        this.f1270i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1271k = new s.f(0);
        this.f1272l = new s.f(0);
        this.f1274n = true;
        this.f1267e = context;
        z5 z5Var = new z5(looper, this);
        this.f1273m = z5Var;
        this.f1268f = fVar;
        this.g = new c6.s(fVar);
        PackageManager packageManager = context.getPackageManager();
        if (g7.b.f4282f == null) {
            g7.b.f4282f = Boolean.valueOf(g7.b.b() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (g7.b.f4282f.booleanValue()) {
            this.f1274n = false;
        }
        z5Var.sendMessage(z5Var.obtainMessage(6));
    }

    public static Status c(a aVar, z6.b bVar) {
        String str = aVar.f1237b.f315c;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(17, sb2.toString(), bVar.f10868i, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (f1261q) {
            if (f1262r == null) {
                synchronized (c7.o0.g) {
                    try {
                        handlerThread = c7.o0.f1962i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            c7.o0.f1962i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = c7.o0.f1962i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = z6.f.f10878d;
                f1262r = new d(applicationContext, looper);
            }
            dVar = f1262r;
        }
        return dVar;
    }

    public final b0 a(a7.j jVar) {
        a aVar = jVar.f333f;
        ConcurrentHashMap concurrentHashMap = this.j;
        b0 b0Var = (b0) concurrentHashMap.get(aVar);
        if (b0Var == null) {
            b0Var = new b0(this, jVar);
            concurrentHashMap.put(aVar, b0Var);
        }
        if (b0Var.f1242e.s()) {
            this.f1272l.add(aVar);
        }
        b0Var.o();
        return b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(w7.g gVar, int i3, a7.j jVar) {
        j0 j0Var;
        d dVar;
        if (i3 == 0) {
            return;
        }
        a aVar = jVar.f333f;
        if (e()) {
            c7.m mVar = (c7.m) c7.l.b().f1941a;
            boolean z10 = true;
            if (mVar != null) {
                if (mVar.f1946e) {
                    boolean z11 = mVar.f1947i;
                    b0 b0Var = (b0) this.j.get(aVar);
                    if (b0Var != null) {
                        c7.i iVar = b0Var.f1242e;
                        if (iVar instanceof c7.f) {
                            c7.i iVar2 = iVar;
                            if (iVar2.B != null && !iVar2.r()) {
                                c7.g a9 = j0.a(b0Var, iVar2, i3);
                                if (a9 != null) {
                                    b0Var.f1250o++;
                                    z10 = a9.f1905i;
                                }
                            }
                        }
                    }
                    z10 = z11;
                }
            }
            dVar = this;
            j0Var = new j0(dVar, i3, aVar, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            if (j0Var == null) {
                w7.n nVar = gVar.f10117a;
                z5 z5Var = dVar.f1273m;
                Objects.requireNonNull(z5Var);
                nVar.b(new e0(z5Var, 0), j0Var);
                return;
            }
            return;
        }
        j0Var = null;
        dVar = this;
        if (j0Var == null) {
        }
    }

    public final boolean e() {
        int i3;
        if (this.f1264b) {
            return false;
        }
        c7.m mVar = (c7.m) c7.l.b().f1941a;
        if (mVar != null && !mVar.f1946e) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.f1868d;
        synchronized (sparseIntArray) {
            i3 = sparseIntArray.get(203400000, -1);
        }
        return i3 == -1 || i3 == 0;
    }

    public final boolean f(z6.b bVar, int i3) {
        PendingIntent pendingIntent;
        z6.f fVar = this.f1268f;
        fVar.getClass();
        Context context = this.f1267e;
        if (!i7.a.W(context)) {
            boolean b10 = bVar.b();
            int i10 = bVar.f10867e;
            if (b10) {
                pendingIntent = bVar.f10868i;
            } else {
                pendingIntent = null;
                Intent a9 = fVar.a(i10, context, null);
                if (a9 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a9, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i11 = GoogleApiActivity.f2114e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i3);
                intent.putExtra("notify_manager", true);
                fVar.d(context, i10, PendingIntent.getActivity(context, 0, intent, m7.c.f6571a | 134217728));
                fVar.getClass();
                Integer num = bVar.f10870s;
                int intValue = num == null ? -1 : num.intValue();
                c7.q qVar = new c7.q(intValue, bVar.f10867e, System.currentTimeMillis(), context.getPackageName(), false);
                if (fVar.f10880c == null) {
                    fVar.f10880c = new e7.d(context, e7.d.f3953k, a7.b.f312a, a7.i.f325c);
                }
                e7.d dVar = fVar.f10880c;
                dVar.getClass();
                a8.l b11 = a8.l.b();
                b11.f359d = new z6.d[]{m7.b.f6569b};
                b11.f356a = false;
                b11.f358c = new d9.c(17, qVar);
                dVar.b(2, b11.a());
                return true;
            }
        }
        return false;
    }

    public final void g(z6.b bVar, int i3) {
        if (f(bVar, i3)) {
            return;
        }
        z5 z5Var = this.f1273m;
        z5Var.sendMessage(z5Var.obtainMessage(5, i3, 0, bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0340  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        b0 b0Var;
        boolean z10;
        boolean isIsolated;
        z6.d[] a9;
        z5 z5Var = this.f1273m;
        ConcurrentHashMap concurrentHashMap = this.j;
        int i3 = message.what;
        switch (i3) {
            case 1:
                this.f1263a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                z5Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    z5Var.sendMessageDelayed(z5Var.obtainMessage(12, (a) it.next()), this.f1263a);
                }
                return true;
            case 2:
                throw n0.l.e(message.obj);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                for (b0 b0Var2 : concurrentHashMap.values()) {
                    c7.c0.c(b0Var2.f1251p.f1273m);
                    b0Var2.f1249n = null;
                    b0Var2.o();
                }
                return true;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 13:
                m0 m0Var = (m0) message.obj;
                a7.j jVar = m0Var.f1318c;
                l0 l0Var = m0Var.f1316a;
                b0 b0Var3 = (b0) concurrentHashMap.get(jVar.f333f);
                if (b0Var3 == null) {
                    b0Var3 = a(jVar);
                }
                if (!b0Var3.f1242e.s() || this.f1270i.get() == m0Var.f1317b) {
                    b0Var3.m(l0Var);
                    return true;
                }
                l0Var.d(f1259o);
                b0Var3.n();
                return true;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                int i10 = message.arg1;
                z6.b bVar = (z6.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        b0Var = (b0) it2.next();
                        if (b0Var.j == i10) {
                        }
                    } else {
                        b0Var = null;
                    }
                }
                if (b0Var == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 65);
                    sb2.append("Could not find API instance ");
                    sb2.append(i10);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    return true;
                }
                int i11 = bVar.f10867e;
                if (i11 != 13) {
                    b0Var.g(c(b0Var.f1243f, bVar));
                    return true;
                }
                this.f1268f.getClass();
                int i12 = z6.i.f10887e;
                String e2 = z6.b.e(i11);
                String str = bVar.f10869r;
                StringBuilder sb3 = new StringBuilder(e2.length() + 69 + String.valueOf(str).length());
                sb3.append("Error resolution was canceled by the user, original error message: ");
                sb3.append(e2);
                sb3.append(": ");
                sb3.append(str);
                b0Var.g(new Status(17, sb3.toString(), null, null));
                return true;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context = this.f1267e;
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar = c.f1252s;
                    a0 a0Var = new a0(this);
                    cVar.getClass();
                    synchronized (cVar) {
                        cVar.f1255i.add(a0Var);
                    }
                    AtomicBoolean atomicBoolean = cVar.f1253d;
                    AtomicBoolean atomicBoolean2 = cVar.f1254e;
                    if (!atomicBoolean2.get()) {
                        Boolean bool = g7.b.f4284i;
                        if (bool == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                isIsolated = Process.isIsolated();
                                bool = Boolean.valueOf(isIsolated);
                            } else {
                                try {
                                    Object invoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                                    Object[] objArr = new Object[0];
                                    if (invoke == null) {
                                        throw new com.google.android.gms.internal.measurement.d0(c6.f.h0("expected a non-null reference", objArr), 5);
                                    }
                                    bool = (Boolean) invoke;
                                } catch (ReflectiveOperationException unused) {
                                    bool = Boolean.FALSE;
                                }
                            }
                            g7.b.f4284i = bool;
                        }
                        if (bool.booleanValue()) {
                            z10 = true;
                            if (!z10) {
                                this.f1263a = 300000L;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z10 = atomicBoolean.get();
                    if (!z10) {
                    }
                }
                return true;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                a((a7.j) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var4 = (b0) concurrentHashMap.get(message.obj);
                    c7.c0.c(b0Var4.f1251p.f1273m);
                    if (b0Var4.f1247l) {
                        b0Var4.o();
                        return true;
                    }
                }
                return true;
            case 10:
                s.f fVar = this.f1272l;
                fVar.getClass();
                s.a aVar = new s.a(fVar);
                while (aVar.hasNext()) {
                    b0 b0Var5 = (b0) concurrentHashMap.remove((a) aVar.next());
                    if (b0Var5 != null) {
                        b0Var5.n();
                    }
                }
                fVar.clear();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var6 = (b0) concurrentHashMap.get(message.obj);
                    d dVar = b0Var6.f1251p;
                    c7.c0.c(dVar.f1273m);
                    boolean z11 = b0Var6.f1247l;
                    if (z11) {
                        if (z11) {
                            d dVar2 = b0Var6.f1251p;
                            a aVar2 = b0Var6.f1243f;
                            dVar2.f1273m.removeMessages(11, aVar2);
                            dVar2.f1273m.removeMessages(9, aVar2);
                            b0Var6.f1247l = false;
                        }
                        b0Var6.g(dVar.f1268f.b(dVar.f1267e, z6.g.f10881a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        b0Var6.f1242e.e("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    b0 b0Var7 = (b0) concurrentHashMap.get(message.obj);
                    c7.c0.c(b0Var7.f1251p.f1273m);
                    c7.i iVar = b0Var7.f1242e;
                    if (iVar.q() && b0Var7.f1245i.isEmpty()) {
                        c6.c cVar2 = b0Var7.g;
                        if (((Map) cVar2.f1809e).isEmpty() && ((Map) cVar2.f1810i).isEmpty()) {
                            iVar.e("Timing out service connection.");
                            return true;
                        }
                        b0Var7.h();
                    }
                    return true;
                }
                return true;
            case 14:
                throw n0.l.e(message.obj);
            case 15:
                c0 c0Var = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var.f1257a)) {
                    b0 b0Var8 = (b0) concurrentHashMap.get(c0Var.f1257a);
                    if (b0Var8.f1248m.contains(c0Var) && !b0Var8.f1247l) {
                        if (b0Var8.f1242e.q()) {
                            b0Var8.d();
                            return true;
                        }
                        b0Var8.o();
                        return true;
                    }
                }
                return true;
            case 16:
                c0 c0Var2 = (c0) message.obj;
                if (concurrentHashMap.containsKey(c0Var2.f1257a)) {
                    b0 b0Var9 = (b0) concurrentHashMap.get(c0Var2.f1257a);
                    if (b0Var9.f1248m.remove(c0Var2)) {
                        d dVar3 = b0Var9.f1251p;
                        dVar3.f1273m.removeMessages(15, c0Var2);
                        dVar3.f1273m.removeMessages(16, c0Var2);
                        z6.d dVar4 = c0Var2.f1258b;
                        LinkedList<l0> linkedList = b0Var9.f1241d;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (l0 l0Var2 : linkedList) {
                            if ((l0Var2 instanceof l0) && (a9 = l0Var2.a(b0Var9)) != null) {
                                int length = a9.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    if (!c7.c0.k(a9[i13], dVar4)) {
                                        i13++;
                                    } else if (i13 >= 0) {
                                        arrayList.add(l0Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            l0 l0Var3 = (l0) arrayList.get(i14);
                            linkedList.remove(l0Var3);
                            l0Var3.e(new a7.n(dVar4));
                        }
                    }
                }
                return true;
            case 17:
                c7.n nVar = this.f1265c;
                if (nVar != null) {
                    if (nVar.f1956d > 0 || e()) {
                        if (this.f1266d == null) {
                            this.f1266d = new e7.d(this.f1267e, e7.d.f3954l, c7.o.f1959c, a7.i.f325c);
                        }
                        this.f1266d.c(nVar);
                    }
                    this.f1265c = null;
                    return true;
                }
                return true;
            case 18:
                k0 k0Var = (k0) message.obj;
                long j = k0Var.f1307c;
                c7.k kVar = k0Var.f1305a;
                int i15 = k0Var.f1306b;
                if (j == 0) {
                    c7.n nVar2 = new c7.n(i15, Arrays.asList(kVar));
                    if (this.f1266d == null) {
                        this.f1266d = new e7.d(this.f1267e, e7.d.f3954l, c7.o.f1959c, a7.i.f325c);
                    }
                    this.f1266d.c(nVar2);
                    return true;
                }
                c7.n nVar3 = this.f1265c;
                if (nVar3 != null) {
                    List list = nVar3.f1957e;
                    if (nVar3.f1956d != i15 || (list != null && list.size() >= k0Var.f1308d)) {
                        z5Var.removeMessages(17);
                        c7.n nVar4 = this.f1265c;
                        if (nVar4 != null) {
                            if (nVar4.f1956d > 0 || e()) {
                                if (this.f1266d == null) {
                                    this.f1266d = new e7.d(this.f1267e, e7.d.f3954l, c7.o.f1959c, a7.i.f325c);
                                }
                                this.f1266d.c(nVar4);
                            }
                            this.f1265c = null;
                        }
                    } else {
                        c7.n nVar5 = this.f1265c;
                        if (nVar5.f1957e == null) {
                            nVar5.f1957e = new ArrayList();
                        }
                        nVar5.f1957e.add(kVar);
                    }
                }
                if (this.f1265c == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(kVar);
                    this.f1265c = new c7.n(i15, arrayList2);
                    z5Var.sendMessageDelayed(z5Var.obtainMessage(17), j);
                    return true;
                }
                return true;
            case 19:
                this.f1264b = false;
                return true;
            default:
                StringBuilder sb4 = new StringBuilder(String.valueOf(i3).length() + 20);
                sb4.append("Unknown message id: ");
                sb4.append(i3);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
    }
}
