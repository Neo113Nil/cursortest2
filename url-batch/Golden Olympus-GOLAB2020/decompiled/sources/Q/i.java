package Q;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f9078a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Throwable readException) {
        super(null);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f9078a = readException;
    }

    public final Throwable a() {
        return this.f9078a;
    }
}
