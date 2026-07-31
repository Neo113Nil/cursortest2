package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.H;
import kotlin.jvm.internal.InterfaceC3248n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class l extends d implements InterfaceC3248n {
    private final int arity;

    public l(int i4, kotlin.coroutines.d dVar) {
        super(dVar);
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.InterfaceC3248n
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h4 = H.h(this);
        Intrinsics.checkNotNullExpressionValue(h4, "renderLambdaToString(...)");
        return h4;
    }
}
