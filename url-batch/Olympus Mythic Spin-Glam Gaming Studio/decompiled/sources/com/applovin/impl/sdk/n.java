package com.applovin.impl.sdk;

import android.app.ActivityManager;
import com.applovin.impl.n7;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class n {
    private static final a l = new a();
    private final k a;
    private long c;
    private Long d;
    private long e;
    private long h;
    private Object i;
    private final AtomicBoolean b = new AtomicBoolean();
    private final Object f = new Object();
    private final AtomicBoolean g = new AtomicBoolean();
    private final Map j = new HashMap();
    private final Object k = new Object();

    public static class a {
        private long a = -1;
        private int b;

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a((Object) this) && b() == aVar.b() && a() == aVar.a();
        }

        public int hashCode() {
            long b = b();
            return ((((int) (b ^ (b >>> 32))) + 59) * 59) + a();
        }

        public String toString() {
            return "FullScreenAdTracker.LostShowAttemptsData(lastAttemptedTimeMillis=" + b() + ", attemptCount=" + a() + ")";
        }

        static /* synthetic */ int a(a aVar) {
            int i = aVar.b;
            aVar.b = i + 1;
            return i;
        }

        public int a() {
            return this.b;
        }
    }

    n(k kVar) {
        this.a = kVar;
    }

    public void a(boolean z) {
        synchronized (this.f) {
            try {
                this.g.set(z);
                if (z) {
                    this.h = System.currentTimeMillis();
                    this.a.O();
                    if (o.a()) {
                        this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad pending display: " + this.h);
                    }
                    ActivityManager.MemoryInfo a2 = n7.a((ActivityManager) k.o().getSystemService("activity"));
                    if (a2 != null) {
                        this.e = a2.availMem;
                    }
                    final Long l2 = (Long) this.a.a(x4.J1);
                    if (l2.longValue() >= 0) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                n.this.a(l2);
                            }
                        }, l2.longValue());
                    }
                } else {
                    this.h = 0L;
                    this.a.O();
                    if (o.a()) {
                        this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad not pending display: " + System.currentTimeMillis());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        return this.c;
    }

    public Long c() {
        return this.d;
    }

    public boolean d() {
        return this.b.get();
    }

    public boolean e() {
        return this.g.get();
    }

    public void b(Object obj) {
        if (!w3.a(obj) && this.b.compareAndSet(true, false)) {
            this.i = null;
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad hidden: " + System.currentTimeMillis());
            }
            AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_hidden", obj);
        }
    }

    public void c(String str) {
        synchronized (this.k) {
            try {
                a aVar = (a) this.j.get(str);
                if (aVar == null) {
                    aVar = new a();
                    this.j.put(str, aVar);
                }
                aVar.a = System.currentTimeMillis();
                a.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a b(String str) {
        a aVar;
        synchronized (this.k) {
            aVar = (a) this.j.get(str);
            if (aVar == null) {
                aVar = l;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        if (e() && System.currentTimeMillis() - this.h >= l2.longValue()) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Resetting \"pending display\" state...");
            }
            this.g.set(false);
        }
    }

    public Object a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final Object obj) {
        final Long l2;
        if (w3.a(obj) || !this.b.compareAndSet(false, true)) {
            return;
        }
        this.i = obj;
        this.c = System.currentTimeMillis();
        this.a.O();
        if (o.a()) {
            this.a.O().a("FullScreenAdTracker", "Setting fullscreen ad displayed: " + this.c);
        }
        ActivityManager.MemoryInfo a2 = n7.a((ActivityManager) k.o().getSystemService("activity"));
        if (a2 != null) {
            long j = this.e;
            if (j > 0) {
                this.d = Long.valueOf(j - a2.availMem);
                this.e = 0L;
                AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
                l2 = (Long) this.a.a(x4.K1);
                if (l2.longValue() < 0) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.n$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.this.a(l2, obj);
                        }
                    }, l2.longValue());
                    return;
                }
                return;
            }
        }
        this.d = null;
        AppLovinBroadcastManager.sendBroadcastWithAdObject("com.applovin.fullscreen_ad_displayed", obj);
        l2 = (Long) this.a.a(x4.K1);
        if (l2.longValue() < 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l2, Object obj) {
        if (this.b.get() && System.currentTimeMillis() - this.c >= l2.longValue()) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("FullScreenAdTracker", "Resetting \"display\" state...");
            }
            b(obj);
        }
    }

    public void a(String str) {
        synchronized (this.k) {
            this.j.remove(str);
        }
    }
}
