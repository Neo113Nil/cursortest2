package X5;

import kotlin.jvm.internal.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class j extends c implements l {
    private final int arity;

    public j(int i2, V5.b bVar) {
        super(bVar);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.l
    public int getArity() {
        return this.arity;
    }

    @Override // X5.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        E.f6153a.getClass();
        String a7 = F.a(this);
        Intrinsics.checkNotNullExpressionValue(a7, "renderLambdaToString(...)");
        return a7;
    }
}
