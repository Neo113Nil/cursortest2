package B6;

import R5.A;
import R5.E;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z6.X;
import z6.a0;
import z6.d0;
import z6.g0;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f257a;

    static {
        Intrinsics.checkNotNullParameter(R5.x.f2438e, "<this>");
        Intrinsics.checkNotNullParameter(A.f2400e, "<this>");
        Intrinsics.checkNotNullParameter(R5.t.f2432e, "<this>");
        Intrinsics.checkNotNullParameter(E.f2404e, "<this>");
        x6.e[] elements = {a0.f8770b, d0.f8778b, X.f8765b, g0.f8788b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f257a = kotlin.collections.p.s(elements);
    }

    public static final boolean a(x6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return eVar.f() && f257a.contains(eVar);
    }
}
