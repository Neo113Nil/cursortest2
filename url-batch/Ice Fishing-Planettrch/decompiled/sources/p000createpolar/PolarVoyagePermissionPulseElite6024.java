package p000createpolar;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePermissionPulseElite6024 {
    public final PolarVoyageInterpolatorCelestialFusion9132 PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final List PolarVoyageKotlinBetaPulseBeta3653;
    public final PolarVoyageServiceCyberOlympian6675 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageAdapterDelegateSpeedVisionRogue8497 PolarVoyageZipVortexCelestial6185;

    public PolarVoyagePermissionPulseElite6024(PolarVoyageAdapterDelegateSpeedVisionRogue8497 polarVoyageAdapterDelegateSpeedVisionRogue8497, PolarVoyageServiceCyberOlympian6675 polarVoyageServiceCyberOlympian6675, List list, PolarVoyageFragmentPulseEliteDragon8768 polarVoyageFragmentPulseEliteDragon8768) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageAdapterDelegateSpeedVisionRogue8497;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageServiceCyberOlympian6675;
        this.PolarVoyageKotlinBetaPulseBeta3653 = list;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = new PolarVoyageInterpolatorCelestialFusion9132(new PolarVoyageShapeDrawableMasterLegend3767(polarVoyageFragmentPulseEliteDragon8768, 1));
    }

    public final List PolarVoyageZipVortexCelestial6185() {
        return (List) this.PolarVoyageBarcodeScannerInfernoSolarSpark7767.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PolarVoyagePermissionPulseElite6024)) {
            return false;
        }
        PolarVoyagePermissionPulseElite6024 polarVoyagePermissionPulseElite6024 = (PolarVoyagePermissionPulseElite6024) obj;
        return polarVoyagePermissionPulseElite6024.PolarVoyageZipVortexCelestial6185 == this.PolarVoyageZipVortexCelestial6185 && polarVoyagePermissionPulseElite6024.PolarVoyageMotionLayoutTransitionHeroVision4068 == this.PolarVoyageMotionLayoutTransitionHeroVision4068 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(polarVoyagePermissionPulseElite6024.PolarVoyageZipVortexCelestial6185(), PolarVoyageZipVortexCelestial6185()) && polarVoyagePermissionPulseElite6024.PolarVoyageKotlinBetaPulseBeta3653.equals(this.PolarVoyageKotlinBetaPulseBeta3653);
    }

    public final int hashCode() {
        return this.PolarVoyageKotlinBetaPulseBeta3653.hashCode() + ((PolarVoyageZipVortexCelestial6185().hashCode() + ((this.PolarVoyageMotionLayoutTransitionHeroVision4068.hashCode() + ((this.PolarVoyageZipVortexCelestial6185.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> PolarVoyageZipVortexCelestial6185 = PolarVoyageZipVortexCelestial6185();
        ArrayList arrayList = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(PolarVoyageZipVortexCelestial6185, 10));
        for (Certificate certificate : PolarVoyageZipVortexCelestial6185) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.PolarVoyageZipVortexCelestial6185);
        sb.append(" cipherSuite=");
        sb.append(this.PolarVoyageMotionLayoutTransitionHeroVision4068);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.PolarVoyageKotlinBetaPulseBeta3653;
        ArrayList arrayList2 = new ArrayList(PolarVoyageLiveDataSpectraTitanElite7418.PolarVoyageThreadPhoenixVisionSolar1313(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
