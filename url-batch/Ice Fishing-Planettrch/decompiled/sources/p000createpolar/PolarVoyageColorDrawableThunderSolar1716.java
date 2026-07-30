package p000createpolar;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageColorDrawableThunderSolar1716 extends PolarVoyagePagingDataTitaniumNebula9959 {
    public final Socket PolarVoyageDrawableDeltaHyperion5742;

    public PolarVoyageColorDrawableThunderSolar1716(Socket socket) {
        this.PolarVoyageDrawableDeltaHyperion5742 = socket;
    }

    @Override // p000createpolar.PolarVoyagePagingDataTitaniumNebula9959
    public final IOException PolarVoyageBottomSheetOmegaNeo1907(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000createpolar.PolarVoyagePagingDataTitaniumNebula9959
    public final void PolarVoyageViewRogueMaster4778() {
        Socket socket = this.PolarVoyageDrawableDeltaHyperion5742;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!PolarVoyageTextViewLegendCosmos5811.PolarVoyageZipVortexCelestial6185(e)) {
                throw e;
            }
            PolarVoyageTextViewLegendCosmos5811.PolarVoyageZipVortexCelestial6185.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            PolarVoyageTextViewLegendCosmos5811.PolarVoyageZipVortexCelestial6185.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
