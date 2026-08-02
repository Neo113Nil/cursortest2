package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hng extends hmx {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile hlw g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public hng(String str) {
        super(str);
        if (a || b) {
            this.g = new hmy().a(d());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        hni hniVar = hnk.c;
        String str2 = hniVar.a;
        int i = hniVar.f;
        this.g = new hni(2, Level.OFF, hniVar.c, hniVar.d, hniVar.e).a(d());
    }

    public static void e() {
        while (true) {
            hng hngVar = (hng) hnf.a.poll();
            if (hngVar == null) {
                f();
                return;
            }
            hngVar.g = ((hmz) d.get()).a(hngVar.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hlu, java.lang.Object] */
    private static void f() {
        while (true) {
            ikm ikmVar = (ikm) f.poll();
            if (ikmVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = ikmVar.b;
            Object obj = ikmVar.a;
            if (!r1.A()) {
                if (((hlw) obj).c(r1.o())) {
                }
            }
            ((hlw) obj).b(r1);
        }
    }

    @Override // defpackage.hmx, defpackage.hlw
    public final void a(RuntimeException runtimeException, hlu hluVar) {
        if (this.g != null) {
            this.g.a(runtimeException, hluVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.hlw
    public final void b(hlu hluVar) {
        if (this.g != null) {
            this.g.b(hluVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new ikm(this, hluVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
    }
}
