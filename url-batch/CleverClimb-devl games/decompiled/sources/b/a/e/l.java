package b.a.e;

import java.util.concurrent.CountDownLatch;

/* compiled from: Ping.java */
/* loaded from: classes.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f1990a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private long f1991b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f1992c = -1;

    l() {
    }

    void a() {
        if (this.f1991b != -1) {
            throw new IllegalStateException();
        }
        this.f1991b = System.nanoTime();
    }

    void b() {
        if (this.f1992c != -1 || this.f1991b == -1) {
            throw new IllegalStateException();
        }
        this.f1992c = System.nanoTime();
        this.f1990a.countDown();
    }

    void c() {
        if (this.f1992c != -1 || this.f1991b == -1) {
            throw new IllegalStateException();
        }
        this.f1992c = this.f1991b - 1;
        this.f1990a.countDown();
    }
}
