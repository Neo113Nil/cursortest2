package p000createpolar;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageContextDragonTitan2232 {
    public final InetSocketAddress PolarVoyageKotlinBetaPulseBeta3653;
    public final Proxy PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageServiceVisionTurbo4674 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageContextDragonTitan2232(PolarVoyageServiceVisionTurbo4674 polarVoyageServiceVisionTurbo4674, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageServiceVisionTurbo4674;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = proxy;
        this.PolarVoyageKotlinBetaPulseBeta3653 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyageContextDragonTitan2232)) {
            return false;
        }
        PolarVoyageContextDragonTitan2232 polarVoyageContextDragonTitan2232 = (PolarVoyageContextDragonTitan2232) obj;
        return polarVoyageContextDragonTitan2232.PolarVoyageZipVortexCelestial6185.equals(this.PolarVoyageZipVortexCelestial6185) && polarVoyageContextDragonTitan2232.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyageContextDragonTitan2232.PolarVoyageKotlinBetaPulseBeta3653, this.PolarVoyageKotlinBetaPulseBeta3653);
    }

    public final int hashCode() {
        return this.PolarVoyageKotlinBetaPulseBeta3653.hashCode() + ((this.PolarVoyageMotionLayoutTransitionHeroVision4068.hashCode() + ((this.PolarVoyageZipVortexCelestial6185.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        PolarVoyageFragmentMasterInfernoStorm7113 polarVoyageFragmentMasterInfernoStorm7113 = this.PolarVoyageZipVortexCelestial6185.PolarVoyageItemDecorationUltraDeltaEpic7485;
        String str = polarVoyageFragmentMasterInfernoStorm7113.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        InetSocketAddress inetSocketAddress = this.PolarVoyageKotlinBetaPulseBeta3653;
        InetAddress address = inetSocketAddress.getAddress();
        String PolarVoyageMotionLayoutTransitionHeroVision4068 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : PolarVoyageThreadInfernoQuantumPhantom6954.PolarVoyageMotionLayoutTransitionHeroVision4068(hostAddress);
        if (PolarVoyageDebugTitaniumInferno5712.PolarVoyageMotionLayoutForceEpicAurora7183(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (polarVoyageFragmentMasterInfernoStorm7113.PolarVoyageBitmapVisionAuroraPixel4705 != inetSocketAddress.getPort() || str.equals(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            sb.append(":");
            sb.append(polarVoyageFragmentMasterInfernoStorm7113.PolarVoyageBitmapVisionAuroraPixel4705);
        }
        if (!str.equals(PolarVoyageMotionLayoutTransitionHeroVision4068)) {
            if (this.PolarVoyageMotionLayoutTransitionHeroVision4068.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (PolarVoyageMotionLayoutTransitionHeroVision4068 == null) {
                sb.append("<unresolved>");
            } else if (PolarVoyageDebugTitaniumInferno5712.PolarVoyageMotionLayoutForceEpicAurora7183(PolarVoyageMotionLayoutTransitionHeroVision4068, ':')) {
                sb.append("[");
                sb.append(PolarVoyageMotionLayoutTransitionHeroVision4068);
                sb.append("]");
            } else {
                sb.append(PolarVoyageMotionLayoutTransitionHeroVision4068);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
