package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class p implements l, Serializable {
    private final int arity;

    public p(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.l
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        E.f6153a.getClass();
        String a7 = F.a(this);
        Intrinsics.checkNotNullExpressionValue(a7, "renderLambdaToString(...)");
        return a7;
    }
}
