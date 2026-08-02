package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gye implements Runnable {
    final /* synthetic */ hvw a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ hvm d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    public gye(hvw hvwVar, Runnable runnable, AtomicReference atomicReference, hvm hvmVar, long j, long j2) {
        this.a = hvwVar;
        this.b = runnable;
        this.c = atomicReference;
        this.d = hvmVar;
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            hvw hvwVar = this.a;
            if (hvwVar.isDone()) {
                return;
            }
            this.b.run();
            hvw hvwVar2 = new hvw();
            this.c.set(hvwVar2);
            if (hvwVar.isDone()) {
                return;
            }
            hvm hvmVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            hvwVar2.q(hvmVar.a(this, elapsedRealtime < j ? (j + j2) - elapsedRealtime : j2 - ((elapsedRealtime - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.p(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
