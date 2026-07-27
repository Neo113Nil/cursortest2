package f1;

import W2.C0292n;
import W2.C0294p;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public static final J f6504d = new J(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        P msg = (P) obj;
        Throwable th = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C0292n c0292n = msg.f6532b;
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        c0292n.U(new C0294p(th, false));
        return Unit.f7487a;
    }
}
