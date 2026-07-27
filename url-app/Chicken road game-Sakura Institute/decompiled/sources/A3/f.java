package A3;

import M2.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z3.v;

/* loaded from: classes.dex */
public final class f extends p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f853d = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h entry = (h) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        v vVar = g.f854e;
        return Boolean.valueOf(E1.i.f(entry.f858a));
    }
}
