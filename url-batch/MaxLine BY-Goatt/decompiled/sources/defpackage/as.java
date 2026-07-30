package defpackage;

import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class as implements vs1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ as(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + o70.x(this) + ']';
            default:
                return "DisposeOnCancel[" + ((ec0) obj) + ']';
        }
    }
}
