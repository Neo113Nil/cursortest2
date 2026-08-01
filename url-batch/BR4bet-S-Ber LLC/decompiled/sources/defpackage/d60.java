package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class d60 extends h7 {
    public final Socket m;

    public d60(Socket socket) {
        this.m = socket;
    }

    @Override // defpackage.h7
    public final void j() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!xf.w(e)) {
                throw e;
            }
            yy.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            yy.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
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
