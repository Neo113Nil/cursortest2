package o2;

import java.util.concurrent.Future;

/* renamed from: o2.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3339l implements InterfaceC3341m {

    /* renamed from: b, reason: collision with root package name */
    private final Future f42084b;

    public C3339l(Future future) {
        this.f42084b = future;
    }

    @Override // o2.InterfaceC3341m
    public void a(Throwable th) {
        if (th != null) {
            this.f42084b.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f42084b + ']';
    }
}
