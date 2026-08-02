package defpackage;

import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kez implements Runnable, jxl {
    public final boolean a;
    public final boolean b;
    public final long c;
    public volatile ScheduledFuture d;
    public volatile boolean e;
    final /* synthetic */ kff f;

    public kez(kff kffVar, jxs jxsVar, boolean z) {
        long b;
        this.f = kffVar;
        this.a = z;
        if (jxsVar == null) {
            this.b = false;
            b = 0;
        } else {
            this.b = true;
            b = jxsVar.b(TimeUnit.NANOSECONDS);
        }
        this.c = b;
    }

    @Override // defpackage.jxl
    public final void a(jxr jxrVar) {
        if (this.b && this.a && (jxrVar.c() instanceof TimeoutException)) {
            this.f.h.n(b());
        } else {
            this.f.h.n(iwx.a(jxrVar));
        }
    }

    final kbq b() {
        long j = this.c;
        long abs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j2 = abs / 1000000000;
        long abs2 = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j3 = abs2 % 1000000000;
        StringBuilder sb = new StringBuilder(true != this.a ? "CallOptions" : "Context");
        sb.append(" deadline exceeded after ");
        if (j < 0) {
            sb.append('-');
        }
        sb.append(j2);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j3)));
        sb.append("s. ");
        kff kffVar = this.f;
        sb.append(String.format(Locale.US, "Name resolution delay %.9f seconds.", Double.valueOf(((Long) kffVar.g.e(jxb.f)) == null ? 0.0d : r0.longValue() / kff.a)));
        if (kffVar.h != null) {
            khi khiVar = new khi();
            kffVar.h.m(khiVar);
            sb.append(" ");
            sb.append(khiVar);
        }
        return kbq.e.e(sb.toString());
    }

    final void c() {
        this.e = true;
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f.e.g(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.h.n(b());
    }
}
