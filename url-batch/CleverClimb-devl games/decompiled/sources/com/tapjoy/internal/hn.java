package com.tapjoy.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.tapjoy.internal.ew;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class hn {

    /* renamed from: a, reason: collision with root package name */
    final gz f8300a;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    ScheduledFuture f8302c;

    /* renamed from: b, reason: collision with root package name */
    final AtomicBoolean f8301b = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f8303d = new Runnable() { // from class: com.tapjoy.internal.hn.1
        @Override // java.lang.Runnable
        public final void run() {
            if (hn.this.f8301b.compareAndSet(true, false)) {
                gx.a("The session ended");
                gz gzVar = hn.this.f8300a;
                long elapsedRealtime = SystemClock.elapsedRealtime() - gzVar.f8231c;
                hd hdVar = gzVar.f8229a;
                synchronized (hdVar) {
                    long a2 = hdVar.f8262c.i.a() + elapsedRealtime;
                    hdVar.f8262c.i.a(a2);
                    hdVar.f8261b.i = Long.valueOf(a2);
                }
                ew.a a3 = gzVar.a(ez.APP, com.umeng.analytics.pro.b.ac);
                a3.i = Long.valueOf(elapsedRealtime);
                gzVar.a(a3);
                gzVar.f8231c = 0L;
                hd hdVar2 = gzVar.f8229a;
                long longValue = a3.e.longValue();
                synchronized (hdVar2) {
                    SharedPreferences.Editor a4 = hdVar2.f8262c.a();
                    hdVar2.f8262c.j.a(a4, longValue);
                    hdVar2.f8262c.k.a(a4, elapsedRealtime);
                    a4.apply();
                    hdVar2.f8261b.j = Long.valueOf(longValue);
                    hdVar2.f8261b.k = Long.valueOf(elapsedRealtime);
                }
                final gy gyVar = gzVar.f8230b;
                if (gyVar.f8225b != null) {
                    gyVar.a();
                    new in() { // from class: com.tapjoy.internal.gy.1
                        AnonymousClass1() {
                        }

                        @Override // com.tapjoy.internal.in
                        public final boolean a() {
                            return !gy.this.f8224a.c();
                        }
                    }.run();
                }
                gyVar.f8224a.flush();
                ft.f8131d.notifyObservers();
            }
        }
    };
    private final Runnable e = new Runnable() { // from class: com.tapjoy.internal.hn.2
        @Override // java.lang.Runnable
        public final void run() {
        }
    };

    hn(gz gzVar) {
        this.f8300a = gzVar;
    }

    public final void a() {
        if (this.f8301b.get()) {
            if (!Boolean.FALSE.booleanValue()) {
                this.f8303d.run();
            } else if (this.f8302c == null || this.f8302c.cancel(false)) {
                this.f8302c = ho.f8306a.schedule(this.f8303d, 3000L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
