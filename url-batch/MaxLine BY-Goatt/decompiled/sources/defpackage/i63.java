package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i63 {
    public static volatile ScheduledExecutorService n;
    public static final Object o = new Object();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public cd3 h;
    public final qb2 i;
    public final String j;
    public final HashMap k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    public i63(Context context) {
        boolean z;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = qb2.N;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        ll3.t("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new hx(sb.toString());
        }
        this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = b93.a;
        synchronized (b93.class) {
            Boolean bool = b93.c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = o70.s(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                b93.c = Boolean.valueOf(z);
            }
        }
        if (z) {
            int i = lp2.a;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo b = i93.a(context).b(0, packageName);
                    if (b == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = b.uid;
                        workSource = new WorkSource();
                        Method method2 = b93.b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = b93.a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
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
                    this.b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = n;
        if (scheduledExecutorService == null) {
            synchronized (o) {
                try {
                    scheduledExecutorService = n;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        n = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.m = scheduledExecutorService;
    }

    public final void a(long j) {
        this.l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.h = cd3.m;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.c++;
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                ae3 ae3Var = (ae3) this.k.get(null);
                if (ae3Var == null) {
                    ae3Var = new ae3();
                    this.k.put(null, ae3Var);
                }
                ae3Var.a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j2 > this.e) {
                    this.e = j2;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.m.schedule(new r7(15, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty(null);
                }
                if (this.k.containsKey(null)) {
                    ae3 ae3Var = (ae3) this.k.get(null);
                    if (ae3Var != null) {
                        int i = ae3Var.a - 1;
                        ae3Var.a = i;
                        if (i == 0) {
                            this.k.remove(null);
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
        HashSet hashSet = this.f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        b71.o();
    }

    public final void e() {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i = this.c - 1;
                        this.c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    d();
                    Iterator it = this.k.values().iterator();
                    while (it.hasNext()) {
                        ((ae3) it.next()).a = 0;
                    }
                    this.k.clear();
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    if (this.b.isHeld()) {
                        try {
                            try {
                                this.b.release();
                                if (this.h != null) {
                                    this.h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e);
                                if (this.h != null) {
                                    this.h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.h != null) {
                                this.h = null;
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
