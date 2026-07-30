package p000createpolar;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRippleDrawableVisionNebulaCyber5301 implements PolarVoyageLooperHyperionOlympian2573 {
    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final void PolarVoyageBarcodeScannerInfernoSolarSpark7767(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
            sSLParameters.setApplicationProtocols((String[]) PolarVoyagePreviewDeltaVisionCyber7933.PolarVoyageTextInputEditTextNebulaHero6651(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageKotlinBetaPulseBeta3653(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final boolean PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyagePagingCyberUltraMaster2078 polarVoyagePagingCyberUltraMaster2078 = PolarVoyagePagingCyberUltraMaster2078.PolarVoyageZipVortexCelestial6185;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // p000createpolar.PolarVoyageLooperHyperionOlympian2573
    public final String PolarVoyageZipVortexCelestial6185(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
