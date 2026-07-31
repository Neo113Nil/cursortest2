package N2;

import a.AbstractC0157a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class E extends C0149e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f2904m;

    public E(Socket socket) {
        this.f2904m = socket;
    }

    @Override // N2.C0149e
    public final void j() {
        Socket socket = this.f2904m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!AbstractC0157a.K(e3)) {
                throw e3;
            }
            t.f2963a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e4) {
            t.f2963a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
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
