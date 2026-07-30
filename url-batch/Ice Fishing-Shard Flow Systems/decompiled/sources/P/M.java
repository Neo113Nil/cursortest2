package P;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.C0781n;
import n6.C0784q;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final M f2002d = new M(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d0 msg = (d0) obj;
        Throwable th = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C0781n c0781n = msg.f2069b;
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        c0781n.J(new C0784q(th, false));
        return Unit.f6114a;
    }
}
