package ge;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4345a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4346b;

    public /* synthetic */ e(int i3, Object obj) {
        this.f4345a = i3;
        this.f4346b = obj;
    }

    public final String toString() {
        switch (this.f4345a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f4346b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f4346b).getClass().getSimpleName() + '@' + a0.m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((m0) this.f4346b) + ']';
        }
    }
}
