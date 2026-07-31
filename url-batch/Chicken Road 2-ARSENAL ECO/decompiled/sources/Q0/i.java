package Q0;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements k1.c, k1.e, k1.d, k1.b {

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f1983f;

    @Override // k1.b
    public void a() {
        this.f1983f.countDown();
    }

    @Override // k1.e
    public void b(Object obj) {
        this.f1983f.countDown();
    }

    @Override // k1.d
    public void d(Exception exc) {
        this.f1983f.countDown();
    }

    @Override // k1.c
    public void h(k1.n nVar) {
        this.f1983f.countDown();
    }

    public /* synthetic */ i() {
        this.f1983f = new CountDownLatch(1);
    }
}
