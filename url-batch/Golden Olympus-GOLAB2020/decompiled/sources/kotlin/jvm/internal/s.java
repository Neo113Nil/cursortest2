package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class s implements InterfaceC3248n, Serializable {
    private final int arity;

    public s(int i4) {
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.InterfaceC3248n
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String i4 = H.i(this);
        Intrinsics.checkNotNullExpressionValue(i4, "renderLambdaToString(...)");
        return i4;
    }
}
