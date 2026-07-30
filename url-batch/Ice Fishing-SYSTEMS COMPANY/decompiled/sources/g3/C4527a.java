package g3;

import B0.c;
import E.e;
import F3.C;
import O2.w;
import S2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import c3.C0540a;
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

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4527a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f37884n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f37885o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f37886p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f37887a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f37888b;

    /* renamed from: c, reason: collision with root package name */
    public int f37889c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f37890d;

    /* renamed from: e, reason: collision with root package name */
    public long f37891e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f37892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37893g;

    /* renamed from: h, reason: collision with root package name */
    public C0540a f37894h;
    public final S2.a i;

    /* renamed from: j, reason: collision with root package name */
    public final String f37895j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f37896k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f37897l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f37898m;

    public C4527a(Context context) {
        boolean z8;
        String packageName = context.getPackageName();
        this.f37887a = new Object();
        this.f37889c = 0;
        this.f37892f = new HashSet();
        this.f37893g = true;
        this.i = S2.a.f2963a;
        this.f37896k = new HashMap();
        this.f37897l = new AtomicInteger(0);
        w.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f37894h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f37895j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f37895j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new c(sb.toString());
        }
        this.f37888b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = d.f2975a;
        synchronized (d.class) {
            Boolean bool = d.f2977c;
            if (bool != null) {
                z8 = bool.booleanValue();
            } else {
                z8 = e.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                d.f2977c = Boolean.valueOf(z8);
            }
        }
        if (z8) {
            int i = S2.c.f2974a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo c4 = U2.c.a(context).c(0, packageName);
                    if (c4 == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i4 = c4.uid;
                        workSource = new WorkSource();
                        Method method2 = d.f2976b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i4), packageName);
                            } catch (Exception e6) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
                            }
                        } else {
                            Method method3 = d.f2975a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i4));
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
                    this.f37888b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                    Log.wtf("WakeLock", e10.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorService = f37885o;
        if (scheduledExecutorService == null) {
            synchronized (f37886p) {
                try {
                    scheduledExecutorService = f37885o;
                    if (scheduledExecutorService == null) {
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f37885o = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f37898m = scheduledExecutorService;
    }

    public final void a(long j9) {
        this.f37897l.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f37884n), 1L);
        if (j9 > 0) {
            max = Math.min(j9, max);
        }
        synchronized (this.f37887a) {
            try {
                if (!b()) {
                    this.f37894h = C0540a.f5710n;
                    this.f37888b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f37889c++;
                if (this.f37893g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f37896k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f37896k.put(null, bVar);
                }
                bVar.f37899a++;
                this.i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
                if (j10 > this.f37891e) {
                    this.f37891e = j10;
                    ScheduledFuture scheduledFuture = this.f37890d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f37890d = this.f37898m.schedule(new C(21, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z8;
        synchronized (this.f37887a) {
            z8 = this.f37889c > 0;
        }
        return z8;
    }

    public final void c() {
        if (this.f37897l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f37895j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f37887a) {
            try {
                if (this.f37893g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f37896k.containsKey(null)) {
                    b bVar = (b) this.f37896k.get(null);
                    if (bVar != null) {
                        int i = bVar.f37899a - 1;
                        bVar.f37899a = i;
                        if (i == 0) {
                            this.f37896k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f37895j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f37892f;
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
        synchronized (this.f37887a) {
            try {
                if (b()) {
                    if (this.f37893g) {
                        int i = this.f37889c - 1;
                        this.f37889c = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.f37889c = 0;
                    }
                    d();
                    Iterator it = this.f37896k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f37899a = 0;
                    }
                    this.f37896k.clear();
                    ScheduledFuture scheduledFuture = this.f37890d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f37890d = null;
                        this.f37891e = 0L;
                    }
                    if (this.f37888b.isHeld()) {
                        try {
                            try {
                                this.f37888b.release();
                                if (this.f37894h != null) {
                                    this.f37894h = null;
                                }
                            } catch (RuntimeException e6) {
                                if (!e6.getClass().equals(RuntimeException.class)) {
                                    throw e6;
                                }
                                Log.e("WakeLock", String.valueOf(this.f37895j).concat(" failed to release!"), e6);
                                if (this.f37894h != null) {
                                    this.f37894h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f37894h != null) {
                                this.f37894h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f37895j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
