package defpackage;

import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddn implements dde, ddd, ddb {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.ddb
    public final void a() {
        this.a.countDown();
    }

    @Override // defpackage.ddd
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.dde
    public final void d(Object obj) {
        this.a.countDown();
    }
}
