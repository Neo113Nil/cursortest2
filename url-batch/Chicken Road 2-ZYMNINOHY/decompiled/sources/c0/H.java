package c0;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public Exception f5447a;

    /* renamed from: b, reason: collision with root package name */
    public long f5448b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public long f5449c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f5447a == null) {
            this.f5447a = exc;
        }
        if (this.f5448b == -9223372036854775807L && I.f5450c0.get() <= 0) {
            this.f5448b = 200 + elapsedRealtime;
        }
        long j4 = this.f5448b;
        if (j4 == -9223372036854775807L || elapsedRealtime < j4) {
            this.f5449c = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f5447a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f5447a;
        this.f5447a = null;
        this.f5448b = -9223372036854775807L;
        this.f5449c = -9223372036854775807L;
        throw exc3;
    }
}
