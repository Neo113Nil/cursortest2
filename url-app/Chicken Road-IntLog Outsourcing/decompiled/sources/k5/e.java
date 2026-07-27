package k5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class e extends j5.d {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f10732n;

    public e(Socket socket) {
        this.f10732n = socket;
    }

    @Override // j5.d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // j5.d
    public final void k() {
        Socket socket = this.f10732n;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!f.a(e3)) {
                throw e3;
            }
            f.f10733a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e6) {
            f.f10733a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        }
    }
}
