package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.s;
import y5.b;

/* loaded from: classes5.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        s.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(IOException e8) {
        s.checkNotNullParameter(e8, "e");
        b.addSuppressed(this.firstConnectException, e8);
        this.lastConnectException = e8;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
