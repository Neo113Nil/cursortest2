package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ob3 implements ev1, xu1, tu1, uu1 {
    public final CountDownLatch m;

    public /* synthetic */ ob3() {
        this.m = new CountDownLatch(1);
    }

    @Override // defpackage.tu1
    public void b() {
        this.m.countDown();
    }

    @Override // defpackage.xu1
    public void c(Exception exc) {
        this.m.countDown();
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        this.m.countDown();
    }

    @Override // defpackage.ev1
    public void onSuccess(Object obj) {
        this.m.countDown();
    }
}
