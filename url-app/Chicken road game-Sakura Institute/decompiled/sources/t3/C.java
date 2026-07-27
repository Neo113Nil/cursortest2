package t3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class C extends IOException {

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1211b f10747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(EnumC1211b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f10747d = errorCode;
    }
}
