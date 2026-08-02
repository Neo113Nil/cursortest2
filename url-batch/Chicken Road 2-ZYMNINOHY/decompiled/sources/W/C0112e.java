package W;

import android.os.SystemClock;

/* renamed from: W.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112e {

    /* renamed from: a, reason: collision with root package name */
    public final D f3302a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3303b;

    public C0112e() {
        this(D.f3254a);
    }

    public final synchronized void a() {
        boolean z = false;
        while (!this.f3303b) {
            try {
                this.f3302a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j4) {
        if (j4 <= 0) {
            return this.f3303b;
        }
        this.f3302a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = j4 + elapsedRealtime;
        if (j5 < elapsedRealtime) {
            a();
        } else {
            boolean z = false;
            while (!this.f3303b && elapsedRealtime < j5) {
                try {
                    this.f3302a.getClass();
                    wait(j5 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                this.f3302a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f3303b;
    }

    public final synchronized boolean c() {
        if (this.f3303b) {
            return false;
        }
        this.f3303b = true;
        notifyAll();
        return true;
    }

    public C0112e(D d4) {
        this.f3302a = d4;
    }
}
