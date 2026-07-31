package okhttp3.internal.connection;

import W1.AbstractC1233c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final IOException f42817b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f42818c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f42817b = firstConnectException;
        this.f42818c = firstConnectException;
    }

    public final void a(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        AbstractC1233c.a(this.f42817b, e4);
        this.f42818c = e4;
    }

    public final IOException c() {
        return this.f42817b;
    }

    public final IOException d() {
        return this.f42818c;
    }
}
