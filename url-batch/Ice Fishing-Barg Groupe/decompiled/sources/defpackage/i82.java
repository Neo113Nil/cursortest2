package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i82 extends xa {
    public final Socket r3s1LDPKFs1S;

    public i82(Socket socket) {
        this.r3s1LDPKFs1S = socket;
    }

    @Override // defpackage.xa
    public final void cpQdD2nAriOS() {
        Socket socket = this.r3s1LDPKFs1S;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!jv2.PxuCJdSBwIXG(e)) {
                throw e;
            }
            jv2.PxuCJdSBwIXG.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            jv2.PxuCJdSBwIXG.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    @Override // defpackage.xa
    public final IOException x50lh2ztY7Y5(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
