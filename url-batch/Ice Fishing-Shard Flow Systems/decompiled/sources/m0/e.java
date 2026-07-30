package m0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final f f6494d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f6495e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f callbackName, Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(callbackName, "callbackName");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f6494d = callbackName;
        this.f6495e = cause;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6495e;
    }
}
