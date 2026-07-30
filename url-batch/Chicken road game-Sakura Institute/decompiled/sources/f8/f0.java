package f8;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f3599m;

    public f0(Socket socket) {
        this.f3599m = socket;
    }

    @Override // f8.e
    public final void j() {
        Socket socket = this.f3599m;
        try {
            socket.close();
        } catch (AssertionError e9) {
            if (!a8.d.L(e9)) {
                throw e9;
            }
            u.f3642a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e9);
        } catch (Exception e10) {
            u.f3642a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
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
