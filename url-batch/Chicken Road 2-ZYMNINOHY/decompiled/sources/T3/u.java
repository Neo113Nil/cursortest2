package T3;

import i2.AbstractC0457a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class u extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f3009m;

    public u(Socket socket) {
        this.f3009m = socket;
    }

    @Override // T3.e
    public final void j() {
        Socket socket = this.f3009m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!AbstractC0457a.t(e4)) {
                throw e4;
            }
            n.f2990a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e5) {
            n.f2990a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
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
