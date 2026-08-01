package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2508c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2509d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2510e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReference f2511f;
    public static final AtomicLong g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f2512h;

    /* renamed from: b, reason: collision with root package name */
    public volatile y2 f2513b;

    static {
        String str = Build.FINGERPRINT;
        f2508c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f2509d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f2510e = "eng".equals(str3) || "userdebug".equals(str3);
        f2511f = new AtomicReference();
        g = new AtomicLong();
        f2512h = new ConcurrentLinkedQueue();
    }

    public static void m() {
        while (true) {
            l lVar = (l) f2512h.poll();
            if (lVar == null) {
                return;
            }
            g.getAndDecrement();
            m mVar = lVar.f2473a;
            kg kgVar = lVar.f2474b;
            og ogVar = kgVar.f2467c;
            if ((ogVar != null && Boolean.TRUE.equals(ogVar.k(ng.g))) || mVar.e(kgVar.f2465a)) {
                mVar.f(kgVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final boolean e(Level level) {
        return this.f2513b == null || this.f2513b.e(level);
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void f(kg kgVar) {
        if (this.f2513b != null) {
            this.f2513b.f(kgVar);
            return;
        }
        if (g.incrementAndGet() > 20) {
            f2512h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f2512h.offer(new l(this, kgVar));
        if (this.f2513b != null) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y2
    public final void i(RuntimeException runtimeException, kg kgVar) {
        if (this.f2513b != null) {
            this.f2513b.i(runtimeException, kgVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
