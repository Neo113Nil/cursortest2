package k2;

import java.util.concurrent.ScheduledFuture;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5350a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5351b;

    public /* synthetic */ C0533e(int i3, Object obj) {
        this.f5350a = i3;
        this.f5351b = obj;
    }

    public final String toString() {
        switch (this.f5350a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f5351b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Y1.c) this.f5351b).getClass().getSimpleName() + '@' + AbstractC0552y.i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((G) this.f5351b) + ']';
        }
    }
}
