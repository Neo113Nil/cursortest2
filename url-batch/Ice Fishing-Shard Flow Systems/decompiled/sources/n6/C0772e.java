package n6;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: n6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772e implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7048a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7049b;

    public /* synthetic */ C0772e(int i2, Object obj) {
        this.f7048a = i2;
        this.f7049b = obj;
    }

    public final String toString() {
        switch (this.f7048a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f7049b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f7049b).getClass().getSimpleName() + '@' + AbstractC0792z.g(this) + ']';
            default:
                return "DisposeOnCancel[" + ((H) this.f7049b) + ']';
        }
    }
}
