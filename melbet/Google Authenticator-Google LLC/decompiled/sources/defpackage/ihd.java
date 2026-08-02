package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihd implements ewq {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final ihb b;
    private final gzp c;

    public ihd(ihb ihbVar, gzp gzpVar) {
        this.b = ihbVar;
        this.c = gzpVar;
    }

    @Override // defpackage.ewq
    public final void a() {
        boolean isIsolated;
        isIsolated = Process.isIsolated();
        if (isIsolated || a.getAndSet(true)) {
            return;
        }
        gty aC = hoq.aC(290, "AndroidLoggerConfig");
        try {
            ihb ihbVar = this.b;
            gzp gzpVar = this.c;
            hnu hnuVar = gzpVar.f() ? (hnu) gzpVar.b() : null;
            if (!hna.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            if (!a.j(hng.d, ihbVar)) {
                throw new IllegalStateException("Logger backends can only be configured once.");
            }
            hng.e();
            AtomicReference atomicReference = hnh.a.b;
            if (hnuVar == null) {
                hnuVar = hnw.a;
            }
            atomicReference.set(hnuVar);
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
