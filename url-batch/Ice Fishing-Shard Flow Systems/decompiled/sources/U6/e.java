package U6;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends T6.d {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f2745n;

    public e(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f2745n = socket;
    }

    @Override // T6.d
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // T6.d
    public final void k() {
        Socket socket = this.f2745n;
        try {
            socket.close();
        } catch (AssertionError e7) {
            if (!f.a(e7)) {
                throw e7;
            }
            f.f2746a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
        } catch (Exception e8) {
            f.f2746a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }
}
