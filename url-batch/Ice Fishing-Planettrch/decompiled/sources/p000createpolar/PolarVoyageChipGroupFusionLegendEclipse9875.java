package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageChipGroupFusionLegendEclipse9875 {
    public final int PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final byte[] PolarVoyageBitmapVisionAuroraPixel4705;
    public final PolarVoyageToastTitanThunderMaster6938 PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final boolean PolarVoyageZipVortexCelestial6185;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PolarVoyageChipGroupFusionLegendEclipse9875(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageContentProviderHyperSpark3838((i == 0) ^ (bArr2 == null));
        this.PolarVoyageZipVortexCelestial6185 = z;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = i;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageBottomSheetNovaXNova5051("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.PolarVoyageKotlinBetaPulseBeta3653 = new PolarVoyageToastTitanThunderMaster6938(i4, i2, i3, bArr);
    }
}
