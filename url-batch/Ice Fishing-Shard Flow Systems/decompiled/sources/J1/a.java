package J1;

import C4.p;
import E1.i;
import a.AbstractC0169a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
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
import t1.u;
import x1.AbstractC1001c;
import x1.AbstractC1002d;
import x1.C0999a;
import z1.C1054b;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f1360n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f1361o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f1362p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1363a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f1364b;

    /* renamed from: c, reason: collision with root package name */
    public int f1365c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f1366d;

    /* renamed from: e, reason: collision with root package name */
    public long f1367e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1368f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1369g;

    /* renamed from: h, reason: collision with root package name */
    public F1.a f1370h;

    /* renamed from: i, reason: collision with root package name */
    public final C0999a f1371i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f1372k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f1373l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f1374m;

    public a(Context context) {
        boolean z7;
        String packageName = context.getPackageName();
        this.f1363a = new Object();
        this.f1365c = 0;
        this.f1368f = new HashSet();
        this.f1369g = true;
        this.f1371i = C0999a.f8317a;
        this.f1372k = new HashMap();
        this.f1373l = new AtomicInteger(0);
        u.d("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f1370h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new i(sb.toString());
        }
        this.f1364b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = AbstractC1002d.f8327a;
        synchronized (AbstractC1002d.class) {
            Boolean bool = AbstractC1002d.f8329c;
            if (bool != null) {
                z7 = bool.booleanValue();
            } else {
                z7 = AbstractC0169a.b(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                AbstractC1002d.f8329c = Boolean.valueOf(z7);
            }
        }
        if (z7) {
            int i2 = AbstractC1001c.f8326a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = C1054b.a(context).f3070a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i5 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = AbstractC1002d.f8328b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i5), packageName);
                            } catch (Exception e7) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                            }
                        } else {
                            Method method3 = AbstractC1002d.f8327a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i5));
                                } catch (Exception e8) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
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
                    this.f1364b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e9) {
                    Log.wtf("WakeLock", e9.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f1361o;
        if (scheduledExecutorService == null) {
            synchronized (f1362p) {
                try {
                    scheduledExecutorService = f1361o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f1361o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f1374m = scheduledExecutorService;
    }

    public final void a(long j) {
        this.f1373l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f1360n), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f1363a) {
            try {
                if (!b()) {
                    this.f1370h = F1.a.f756d;
                    this.f1364b.acquire();
                    this.f1371i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f1365c++;
                if (this.f1369g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f1372k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f1372k.put(null, bVar);
                }
                bVar.f1375a++;
                this.f1371i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j7 > this.f1367e) {
                    this.f1367e = j7;
                    ScheduledFuture scheduledFuture = this.f1366d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f1366d = this.f1374m.schedule(new F.b(3, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z7;
        synchronized (this.f1363a) {
            z7 = this.f1365c > 0;
        }
        return z7;
    }

    public final void c() {
        if (this.f1373l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f1363a) {
            try {
                if (this.f1369g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f1372k.containsKey(null)) {
                    b bVar = (b) this.f1372k.get(null);
                    if (bVar != null) {
                        int i2 = bVar.f1375a - 1;
                        bVar.f1375a = i2;
                        if (i2 == 0) {
                            this.f1372k.remove(null);
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
        HashSet hashSet = this.f1368f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() > 0) {
            throw p.f(arrayList, 0);
        }
    }

    public final void e() {
        synchronized (this.f1363a) {
            try {
                if (b()) {
                    if (this.f1369g) {
                        int i2 = this.f1365c - 1;
                        this.f1365c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f1365c = 0;
                    }
                    d();
                    Iterator it = this.f1372k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f1375a = 0;
                    }
                    this.f1372k.clear();
                    ScheduledFuture scheduledFuture = this.f1366d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f1366d = null;
                        this.f1367e = 0L;
                    }
                    if (this.f1364b.isHeld()) {
                        try {
                            try {
                                this.f1364b.release();
                                if (this.f1370h != null) {
                                    this.f1370h = null;
                                }
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e7);
                                if (this.f1370h != null) {
                                    this.f1370h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f1370h != null) {
                                this.f1370h = null;
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
