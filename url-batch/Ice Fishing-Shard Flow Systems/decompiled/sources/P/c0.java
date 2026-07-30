package P;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2065b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Throwable finalException) {
        super(Integer.MAX_VALUE);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f2065b = finalException;
    }
}
