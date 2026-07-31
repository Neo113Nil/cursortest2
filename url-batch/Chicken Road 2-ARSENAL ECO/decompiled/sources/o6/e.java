package o6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class e extends n6.d {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f5632n;

    public e(Socket socket) {
        this.f5632n = socket;
    }

    @Override // n6.d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // n6.d
    public final void k() {
        Socket socket = this.f5632n;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!f.a(e4)) {
                throw e4;
            }
            f.f5633a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e7) {
            f.f5633a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        }
    }
}
