package v7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import b7.k;
import c7.c0;
import com.google.android.gms.internal.measurement.d0;
import g7.c;
import g7.d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k7.e;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static volatile ScheduledExecutorService f9984n;

    /* renamed from: o, reason: collision with root package name */
    public static final Object f9985o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f9987b;

    /* renamed from: c, reason: collision with root package name */
    public int f9988c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f9989d;

    /* renamed from: e, reason: collision with root package name */
    public long f9990e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f9991f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public p7.a f9992h;

    /* renamed from: i, reason: collision with root package name */
    public final g7.a f9993i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f9994k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9995l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f9996m;

    public a(Context context) {
        boolean z10;
        String packageName = context.getPackageName();
        this.f9986a = new Object();
        this.f9988c = 0;
        this.f9991f = new HashSet();
        this.g = true;
        this.f9993i = g7.a.f4276a;
        this.f9994k = new HashMap();
        this.f9995l = new AtomicInteger(0);
        c0.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f9992h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new d0(sb2.toString(), 6);
        }
        this.f9987b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f4286a;
        synchronized (d.class) {
            Boolean bool = d.f4288c;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = e.i(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f4288c = Boolean.valueOf(z10);
            }
        }
        if (z10) {
            int i3 = c.f4285a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo d10 = i7.b.a(context).d(0, packageName);
                    if (d10 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i10 = d10.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f4287b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i10), packageName);
                            } catch (Exception e2) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            }
                        } else {
                            Method method3 = d.f4286a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i10));
                                } catch (Exception e9) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f9987b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f9984n;
        if (scheduledExecutorService == null) {
            synchronized (f9985o) {
                try {
                    scheduledExecutorService = f9984n;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f9984n = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f9996m = scheduledExecutorService;
    }

    public final void a() {
        this.f9995l.incrementAndGet();
        long min = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.f9986a) {
            try {
                if (!b()) {
                    this.f9992h = p7.a.f7688d;
                    this.f9987b.acquire();
                    this.f9993i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f9988c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f9994k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f9994k.put(null, bVar);
                }
                bVar.f9997a++;
                this.f9993i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - elapsedRealtime > min ? elapsedRealtime + min : Long.MAX_VALUE;
                if (j > this.f9990e) {
                    this.f9990e = j;
                    ScheduledFuture scheduledFuture = this.f9989d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f9989d = this.f9996m.schedule(new k(22, this), min, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f9986a) {
            z10 = this.f9988c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.f9995l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f9986a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f9994k.containsKey(null)) {
                    b bVar = (b) this.f9994k.get(null);
                    if (bVar != null) {
                        int i3 = bVar.f9997a - 1;
                        bVar.f9997a = i3;
                        if (i3 == 0) {
                            this.f9994k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f9991f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        i0.j();
    }

    public final void e() {
        synchronized (this.f9986a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i3 = this.f9988c - 1;
                        this.f9988c = i3;
                        if (i3 > 0) {
                            return;
                        }
                    } else {
                        this.f9988c = 0;
                    }
                    d();
                    Iterator it = this.f9994k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f9997a = 0;
                    }
                    this.f9994k.clear();
                    ScheduledFuture scheduledFuture = this.f9989d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f9989d = null;
                        this.f9990e = 0L;
                    }
                    if (this.f9987b.isHeld()) {
                        try {
                            try {
                                this.f9987b.release();
                                if (this.f9992h != null) {
                                    this.f9992h = null;
                                }
                            } catch (RuntimeException e2) {
                                if (!e2.getClass().equals(RuntimeException.class)) {
                                    throw e2;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e2);
                                if (this.f9992h != null) {
                                    this.f9992h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f9992h != null) {
                                this.f9992h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
