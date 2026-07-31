package Q;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f9077a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Throwable finalException) {
        super(null);
        Intrinsics.checkNotNullParameter(finalException, "finalException");
        this.f9077a = finalException;
    }

    public final Throwable a() {
        return this.f9077a;
    }
}
