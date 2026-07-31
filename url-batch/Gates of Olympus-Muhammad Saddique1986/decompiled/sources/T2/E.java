package T2;

import h2.AbstractC0508a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class E extends C0230e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f4384m;

    public E(Socket socket) {
        this.f4384m = socket;
    }

    @Override // T2.C0230e
    public final void j() {
        Socket socket = this.f4384m;
        try {
            socket.close();
        } catch (AssertionError e3) {
            if (!AbstractC0508a.J(e3)) {
                throw e3;
            }
            t.f4443a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e3);
        } catch (Exception e4) {
            t.f4443a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
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
