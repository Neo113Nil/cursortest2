package K6;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public final EnumC0131b f1489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(EnumC0131b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f1489d = errorCode;
    }
}
