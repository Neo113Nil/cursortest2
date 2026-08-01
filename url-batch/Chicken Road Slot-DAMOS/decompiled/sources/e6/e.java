package e6;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final j f3939d;

    /* renamed from: e, reason: collision with root package name */
    public final ListenableFuture f3940e;

    public e(j jVar, ListenableFuture listenableFuture) {
        this.f3939d = jVar;
        this.f3940e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3939d.f3948d != this) {
            return;
        }
        if (h.f3946t.i(this.f3939d, this, h.f(this.f3940e))) {
            h.c(this.f3939d);
        }
    }
}
