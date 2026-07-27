package M2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p implements l, Serializable {
    private final int arity;

    public p(int i2) {
        this.arity = i2;
    }

    @Override // M2.l
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        F.f3581a.getClass();
        String a4 = G.a(this);
        Intrinsics.checkNotNullExpressionValue(a4, "renderLambdaToString(...)");
        return a4;
    }
}
