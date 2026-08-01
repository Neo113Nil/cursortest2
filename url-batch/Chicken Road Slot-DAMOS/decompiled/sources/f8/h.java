package f8;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final r f4148d;

    /* renamed from: e, reason: collision with root package name */
    public final ListenableFuture f4149e;

    public h(r rVar, ListenableFuture listenableFuture) {
        this.f4148d = rVar;
        this.f4149e = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4148d.f4174d != this) {
            return;
        }
        if (r.f4172t.r(this.f4148d, this, r.h(this.f4149e))) {
            r.e(this.f4148d);
        }
    }
}
