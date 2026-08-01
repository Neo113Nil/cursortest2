package z1;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f4300m;

    public u(Socket socket) {
        this.f4300m = socket;
    }

    @Override // z1.e
    public final void j() {
        Socket socket = this.f4300m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!k0.k.l(e2)) {
                throw e2;
            }
            m.f4280a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e3) {
            m.f4280a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
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
