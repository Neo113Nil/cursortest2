package v1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class v extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f4524m;

    public v(Socket socket) {
        this.f4524m = socket;
    }

    @Override // v1.e
    public final void j() {
        Socket socket = this.f4524m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!i1.r.j(e2)) {
                throw e2;
            }
            n.f4503a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            n.f4503a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
