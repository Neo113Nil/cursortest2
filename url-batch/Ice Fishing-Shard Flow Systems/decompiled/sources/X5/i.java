package X5;

import kotlin.jvm.internal.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class i extends h implements l {

    /* renamed from: d, reason: collision with root package name */
    private final int f2892d;

    public i(V5.b bVar) {
        super(bVar);
        this.f2892d = 3;
    }

    @Override // kotlin.jvm.internal.l
    public final int getArity() {
        return this.f2892d;
    }

    @Override // X5.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        E.f6153a.getClass();
        String a7 = F.a(this);
        Intrinsics.checkNotNullExpressionValue(a7, "renderLambdaToString(...)");
        return a7;
    }
}
