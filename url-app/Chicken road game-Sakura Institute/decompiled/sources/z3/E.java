package z3;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E extends C1447e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f11974m;

    public E(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f11974m = socket;
    }

    @Override // z3.C1447e
    public final void j() {
        Socket socket = this.f11974m;
        try {
            socket.close();
        } catch (AssertionError e4) {
            if (!m3.z.o(e4)) {
                throw e4;
            }
            t.f12033a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e4);
        } catch (Exception e5) {
            t.f12033a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
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
