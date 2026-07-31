package j1;

import H5.r;
import U0.t;
import Y0.c;
import Y0.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import f1.C0363a;
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
import u.f;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f4876n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f4877o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f4878p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4879a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f4880b;

    /* renamed from: c, reason: collision with root package name */
    public int f4881c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f4882d;

    /* renamed from: e, reason: collision with root package name */
    public long f4883e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f4884f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4885g;

    /* renamed from: h, reason: collision with root package name */
    public C0363a f4886h;

    /* renamed from: i, reason: collision with root package name */
    public final Y0.a f4887i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4888j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f4889k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f4890l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f4891m;

    public C0435a(Context context) {
        boolean z5;
        String packageName = context.getPackageName();
        this.f4879a = new Object();
        this.f4881c = 0;
        this.f4884f = new HashSet();
        this.f4885g = true;
        this.f4887i = Y0.a.f3082a;
        this.f4889k = new HashMap();
        this.f4890l = new AtomicInteger(0);
        t.d("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f4886h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f4888j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f4888j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new r(sb.toString());
        }
        this.f4880b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f3091a;
        synchronized (d.class) {
            Boolean bool = d.f3093c;
            if (bool != null) {
                z5 = bool.booleanValue();
            } else {
                z5 = f.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f3093c = Boolean.valueOf(z5);
            }
        }
        if (z5) {
            int i7 = c.f3090a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfo = a1.b.a(context).f345a.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i8 = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f3092b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i8), packageName);
                            } catch (Exception e4) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                            }
                        } else {
                            Method method3 = d.f3091a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i8));
                                } catch (Exception e7) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
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
                    this.f4880b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
                    Log.wtf("WakeLock", e8.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f4877o;
        if (scheduledExecutorService == null) {
            synchronized (f4878p) {
                try {
                    scheduledExecutorService = f4877o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f4877o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f4891m = scheduledExecutorService;
    }

    public final void a(long j4) {
        this.f4890l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f4876n), 1L);
        if (j4 > 0) {
            max = Math.min(j4, max);
        }
        synchronized (this.f4879a) {
            try {
                if (!b()) {
                    this.f4886h = C0363a.f4198f;
                    this.f4880b.acquire();
                    this.f4887i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f4881c++;
                if (this.f4885g) {
                    TextUtils.isEmpty(null);
                }
                C0436b c0436b = (C0436b) this.f4889k.get(null);
                if (c0436b == null) {
                    c0436b = new C0436b();
                    this.f4889k.put(null, c0436b);
                }
                c0436b.f4892a++;
                this.f4887i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j7 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j7 > this.f4883e) {
                    this.f4883e = j7;
                    ScheduledFuture scheduledFuture = this.f4882d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f4882d = this.f4891m.schedule(new A.b(13, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z5;
        synchronized (this.f4879a) {
            z5 = this.f4881c > 0;
        }
        return z5;
    }

    public final void c() {
        if (this.f4890l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f4888j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f4879a) {
            try {
                if (this.f4885g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f4889k.containsKey(null)) {
                    C0436b c0436b = (C0436b) this.f4889k.get(null);
                    if (c0436b != null) {
                        int i7 = c0436b.f4892a - 1;
                        c0436b.f4892a = i7;
                        if (i7 == 0) {
                            this.f4889k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f4888j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f4884f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f4879a) {
            try {
                if (b()) {
                    if (this.f4885g) {
                        int i7 = this.f4881c - 1;
                        this.f4881c = i7;
                        if (i7 > 0) {
                            return;
                        }
                    } else {
                        this.f4881c = 0;
                    }
                    d();
                    Iterator it = this.f4889k.values().iterator();
                    while (it.hasNext()) {
                        ((C0436b) it.next()).f4892a = 0;
                    }
                    this.f4889k.clear();
                    ScheduledFuture scheduledFuture = this.f4882d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f4882d = null;
                        this.f4883e = 0L;
                    }
                    if (this.f4880b.isHeld()) {
                        try {
                            try {
                                this.f4880b.release();
                                if (this.f4886h != null) {
                                    this.f4886h = null;
                                }
                            } catch (RuntimeException e4) {
                                if (!e4.getClass().equals(RuntimeException.class)) {
                                    throw e4;
                                }
                                Log.e("WakeLock", String.valueOf(this.f4888j).concat(" failed to release!"), e4);
                                if (this.f4886h != null) {
                                    this.f4886h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f4886h != null) {
                                this.f4886h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f4888j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
