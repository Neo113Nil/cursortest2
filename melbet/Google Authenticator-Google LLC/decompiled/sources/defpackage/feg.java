package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class feg implements Application.ActivityLifecycleCallbacks, fed {
    private static final long g;
    public final ScheduledExecutorService a;
    public ScheduledFuture d;
    public iyi f;
    private final fee h;
    public final AtomicLong c = new AtomicLong(0);
    public final long b = g;
    protected final Object e = new Object();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g = 60000L;
    }

    private feg(iyi iyiVar, ScheduledExecutorService scheduledExecutorService, fee feeVar) {
        this.f = iyiVar;
        this.a = scheduledExecutorService;
        this.h = feeVar;
    }

    public static feg c(iyi iyiVar, ScheduledExecutorService scheduledExecutorService, fee feeVar, Application application) {
        feg fegVar = new feg(iyiVar, scheduledExecutorService, feeVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(fegVar);
        }
        feeVar.c = fegVar;
        return fegVar;
    }

    public final void a() {
        synchronized (this.e) {
            ScheduledFuture scheduledFuture = this.d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.d = null;
            }
        }
    }

    public final void b() {
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4;
        this.c.set(0L);
        iyi iyiVar = this.f;
        ArrayList arrayList3 = new ArrayList();
        fee feeVar = this.h;
        synchronized (feeVar.b) {
            Iterator it = feeVar.a.values().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                fec fecVar = (fec) it.next();
                fdz[] fdzVarArr = fecVar.c;
                HashMap hashMap = new HashMap(fdzVarArr.length > 0 ? 10 : 1);
                feb febVar = new feb(fecVar.b, fdzVarArr);
                synchronized (fecVar.a) {
                    febVar.c = fecVar.d;
                    febVar.d = fecVar.e;
                    fecVar.d = hashMap;
                    fecVar.e = 0;
                }
                arrayList3.add(febVar);
            }
        }
        jkj k = gya.a.k();
        int size = arrayList3.size();
        int i5 = 0;
        while (true) {
            cjf cjfVar = null;
            ihr ihrVar = null;
            if (i5 >= size) {
                gya gyaVar = (gya) k.q();
                if (gyaVar.b.size() != 0) {
                    cjfVar = ((cji) iyiVar.a).g(gyaVar);
                    cjfVar.h = (String) iyiVar.b;
                    Iterator it2 = ((CopyOnWriteArrayList) iyiVar.c).iterator();
                    while (it2.hasNext()) {
                        cjfVar.c((String) it2.next());
                    }
                }
                if (cjfVar != null) {
                    cjfVar.b();
                    return;
                }
                return;
            }
            feb febVar2 = (feb) arrayList3.get(i5);
            if (febVar2.d == 0) {
                arrayList = arrayList3;
                i2 = size;
            } else {
                jkj k2 = ihr.a.k();
                String str = febVar2.a;
                long a = fee.a(str);
                if (!k2.b.M()) {
                    k2.t();
                }
                ihr ihrVar2 = (ihr) k2.b;
                ihrVar2.b |= 2;
                ihrVar2.c = a;
                fdz[] fdzVarArr2 = febVar2.b;
                int length = fdzVarArr2.length;
                for (int i6 = i; i6 < length; i6++) {
                    long a2 = fee.a(fdzVarArr2[i6].a);
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    ihr ihrVar3 = (ihr) k2.b;
                    jkw jkwVar = ihrVar3.d;
                    if (!jkwVar.c()) {
                        ihrVar3.d = jkp.z(jkwVar);
                    }
                    ihrVar3.d.e(a2);
                }
                for (Map.Entry entry : febVar2.c.entrySet()) {
                    jkj k3 = ihq.a.k();
                    fdu fduVar = (fdu) entry.getKey();
                    fdv fdvVar = (fdv) entry.getValue();
                    if (fdzVarArr2.length > 0) {
                        Object[] objArr = fduVar.c;
                        ArrayList arrayList4 = new ArrayList(objArr.length);
                        int i7 = 0;
                        while (i7 < objArr.length) {
                            jkj k4 = iho.a.k();
                            Object obj = objArr[i7];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if (!k4.b.M()) {
                                    k4.t();
                                }
                                iho ihoVar = (iho) k4.b;
                                str2.getClass();
                                i4 = size;
                                ihoVar.b = 1;
                                ihoVar.c = str2;
                            } else {
                                i4 = size;
                                if (obj instanceof Integer) {
                                    Integer num = (Integer) obj;
                                    num.intValue();
                                    if (!k4.b.M()) {
                                        k4.t();
                                    }
                                    iho ihoVar2 = (iho) k4.b;
                                    ihoVar2.b = 2;
                                    ihoVar2.c = num;
                                } else {
                                    if (!(obj instanceof Boolean)) {
                                        throw new IllegalArgumentException("Metric " + str + " has field " + i7 + " with an unexpected value: " + String.valueOf(obj));
                                    }
                                    Boolean bool = (Boolean) obj;
                                    bool.booleanValue();
                                    if (!k4.b.M()) {
                                        k4.t();
                                    }
                                    iho ihoVar3 = (iho) k4.b;
                                    ihoVar3.b = 3;
                                    ihoVar3.c = bool;
                                }
                            }
                            arrayList4.add((iho) k4.q());
                            i7++;
                            arrayList3 = arrayList5;
                            size = i4;
                        }
                        arrayList2 = arrayList3;
                        i3 = size;
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        ihq ihqVar = (ihq) k3.b;
                        jkx jkxVar = ihqVar.c;
                        if (!jkxVar.c()) {
                            ihqVar.c = jkp.A(jkxVar);
                        }
                        jiz.f(arrayList4, ihqVar.c);
                    } else {
                        arrayList2 = arrayList3;
                        i3 = size;
                    }
                    ihp a3 = fdvVar.a();
                    if (!k3.b.M()) {
                        k3.t();
                    }
                    ihq ihqVar2 = (ihq) k3.b;
                    a3.getClass();
                    ihqVar2.d = a3;
                    ihqVar2.b |= 1;
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    ihr ihrVar4 = (ihr) k2.b;
                    ihq ihqVar3 = (ihq) k3.q();
                    ihqVar3.getClass();
                    jkx jkxVar2 = ihrVar4.e;
                    if (!jkxVar2.c()) {
                        ihrVar4.e = jkp.A(jkxVar2);
                    }
                    ihrVar4.e.add(ihqVar3);
                    arrayList3 = arrayList2;
                    size = i3;
                }
                arrayList = arrayList3;
                i2 = size;
                ihrVar = (ihr) k2.q();
            }
            if (ihrVar != null) {
                if (!k.b.M()) {
                    k.t();
                }
                gya gyaVar2 = (gya) k.b;
                jkx jkxVar3 = gyaVar2.b;
                if (!jkxVar3.c()) {
                    gyaVar2.b = jkp.A(jkxVar3);
                }
                gyaVar2.b.add(ihrVar);
            }
            i5++;
            arrayList3 = arrayList;
            size = i2;
            i = 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.e) {
            b();
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
