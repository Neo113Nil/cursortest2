package p3;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f3050m;

    public u(Socket socket) {
        this.f3050m = socket;
    }

    @Override // p3.e
    public final void j() {
        Socket socket = this.f3050m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!m0.a.p(e4)) {
                throw e4;
            }
            m.f3037a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e5) {
            m.f3037a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
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
