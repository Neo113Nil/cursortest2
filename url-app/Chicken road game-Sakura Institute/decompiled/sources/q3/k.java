package q3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final IOException f9424d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f9425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f9424d = firstConnectException;
        this.f9425e = firstConnectException;
    }
}
