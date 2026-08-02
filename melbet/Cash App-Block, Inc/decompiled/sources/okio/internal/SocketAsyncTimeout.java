package okio.internal;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.AsyncTimeout;

/* loaded from: classes3.dex */
public final class SocketAsyncTimeout extends AsyncTimeout {
    public final Socket socket;

    public SocketAsyncTimeout(Socket socket) {
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void timedOut() {
        Logger logger;
        Logger logger2;
        Socket socket = this.socket;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!_JavaIoKt.isAndroidGetsocknameError(e)) {
                throw e;
            }
            logger2 = _JavaIoKt.logger;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            logger = _JavaIoKt.logger;
            logger.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
