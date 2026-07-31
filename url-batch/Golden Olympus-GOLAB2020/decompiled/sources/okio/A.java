package okio;

import com.ironsource.C1463f4;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class A extends C3370c {

    /* renamed from: b, reason: collision with root package name */
    private final Socket f43251b;

    public A(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f43251b = socket;
    }

    @Override // okio.C3370c
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C1463f4.f16211f);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.C3370c
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f43251b.close();
        } catch (AssertionError e4) {
            if (!p.e(e4)) {
                throw e4;
            }
            logger2 = q.f43290a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.f43251b, (Throwable) e4);
        } catch (Exception e5) {
            logger = q.f43290a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f43251b, (Throwable) e5);
        }
    }
}
