package E2;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC3551a;

/* loaded from: classes3.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f581a = kotlin.collections.T.h(AbstractC3551a.v(W1.t.f9627c).getDescriptor(), AbstractC3551a.w(W1.v.f9632c).getDescriptor(), AbstractC3551a.u(W1.r.f9622c).getDescriptor(), AbstractC3551a.x(W1.y.f9638c).getDescriptor());

    public static final boolean a(A2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && Intrinsics.areEqual(fVar, D2.k.l());
    }

    public static final boolean b(A2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return fVar.isInline() && f581a.contains(fVar);
    }
}
