package q2;

import e2.InterfaceC0424c;
import java.util.concurrent.ScheduledFuture;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818e implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7889a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7890b;

    public /* synthetic */ C0818e(int i3, Object obj) {
        this.f7889a = i3;
        this.f7890b = obj;
    }

    public final String toString() {
        switch (this.f7889a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f7890b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC0424c) this.f7890b).getClass().getSimpleName() + '@' + AbstractC0837y.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((G) this.f7890b) + ']';
        }
    }
}
