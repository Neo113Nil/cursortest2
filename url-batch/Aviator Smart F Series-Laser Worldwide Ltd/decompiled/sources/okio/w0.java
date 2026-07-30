package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class w0 extends a {
    private final Socket socket;

    public w0(Socket socket) {
        kotlin.jvm.internal.s.checkNotNullParameter(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.a
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.a
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.socket.close();
        } catch (AssertionError e8) {
            if (!j0.isAndroidGetsocknameError(e8)) {
                throw e8;
            }
            logger2 = k0.logger;
            logger2.log(Level.WARNING, kotlin.jvm.internal.s.stringPlus("Failed to close timed out socket ", this.socket), (Throwable) e8);
        } catch (Exception e9) {
            logger = k0.logger;
            logger.log(Level.WARNING, kotlin.jvm.internal.s.stringPlus("Failed to close timed out socket ", this.socket), (Throwable) e9);
        }
    }
}
