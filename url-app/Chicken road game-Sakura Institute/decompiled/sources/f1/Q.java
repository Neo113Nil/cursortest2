package f1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q extends Y {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Throwable readException, int i2) {
        super(i2);
        Intrinsics.checkNotNullParameter(readException, "readException");
        this.f6535b = readException;
    }
}
