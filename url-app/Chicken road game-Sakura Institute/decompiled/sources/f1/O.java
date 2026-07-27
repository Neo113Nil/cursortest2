package f1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class O extends Y {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6530b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Throwable finalException) {
        super(Integer.MAX_VALUE);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f6530b = finalException;
    }
}
