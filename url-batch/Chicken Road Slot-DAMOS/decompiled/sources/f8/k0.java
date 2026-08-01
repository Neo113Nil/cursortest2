package f8;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 extends k implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public ListenableFuture f4155v;

    @Override // f8.r
    public final void c() {
        this.f4155v = null;
    }

    @Override // f8.r
    public final String j() {
        ListenableFuture listenableFuture = this.f4155v;
        if (listenableFuture == null) {
            return null;
        }
        String valueOf = String.valueOf(listenableFuture);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 11);
        sb2.append("delegate=[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f4155v;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
