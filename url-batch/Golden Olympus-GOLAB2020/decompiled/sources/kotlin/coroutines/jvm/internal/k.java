package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.H;
import kotlin.jvm.internal.InterfaceC3248n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k extends j implements InterfaceC3248n {

    /* renamed from: l, reason: collision with root package name */
    private final int f41124l;

    public k(int i4, kotlin.coroutines.d dVar) {
        super(dVar);
        this.f41124l = i4;
    }

    @Override // kotlin.jvm.internal.InterfaceC3248n
    public int getArity() {
        return this.f41124l;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String h4 = H.h(this);
        Intrinsics.checkNotNullExpressionValue(h4, "renderLambdaToString(...)");
        return h4;
    }
}
