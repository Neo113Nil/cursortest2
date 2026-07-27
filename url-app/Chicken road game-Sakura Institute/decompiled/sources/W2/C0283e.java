package W2;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: W2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283e implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4255a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4256b;

    public /* synthetic */ C0283e(int i2, Object obj) {
        this.f4255a = i2;
        this.f4256b = obj;
    }

    public final String toString() {
        switch (this.f4255a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4256b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f4256b).getClass().getSimpleName() + '@' + B.f(this) + ']';
            default:
                return "DisposeOnCancel[" + ((L) this.f4256b) + ']';
        }
    }
}
