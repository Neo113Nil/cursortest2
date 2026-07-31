package o2;

import java.util.concurrent.Future;

/* renamed from: o2.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3318a0 implements InterfaceC3320b0 {

    /* renamed from: b, reason: collision with root package name */
    private final Future f42044b;

    public C3318a0(Future future) {
        this.f42044b = future;
    }

    @Override // o2.InterfaceC3320b0
    public void dispose() {
        this.f42044b.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f42044b + ']';
    }
}
