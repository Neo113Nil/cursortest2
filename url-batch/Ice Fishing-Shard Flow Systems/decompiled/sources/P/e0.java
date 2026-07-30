package P;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f2075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Throwable readException, int i2) {
        super(i2);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f2075b = readException;
    }
}
