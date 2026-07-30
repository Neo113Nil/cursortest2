package p000createpolar;

import java.util.Arrays;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraXRogueDragon5249 {
    public final byte[] PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final PolarVoyageSharedFlowCosmosAlpha1205 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageCameraXRogueDragon5249(PolarVoyageSharedFlowCosmosAlpha1205 polarVoyageSharedFlowCosmosAlpha1205, byte[] bArr) {
        if (polarVoyageSharedFlowCosmosAlpha1205 == null) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("encoding is null");
            throw null;
        }
        if (bArr == null) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("bytes is null");
            throw null;
        }
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageSharedFlowCosmosAlpha1205;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolarVoyageCameraXRogueDragon5249)) {
            return false;
        }
        PolarVoyageCameraXRogueDragon5249 polarVoyageCameraXRogueDragon5249 = (PolarVoyageCameraXRogueDragon5249) obj;
        if (this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageCameraXRogueDragon5249.PolarVoyageZipVortexCelestial6185)) {
            return Arrays.equals(this.PolarVoyageMotionLayoutTransitionHeroVision4068, polarVoyageCameraXRogueDragon5249.PolarVoyageMotionLayoutTransitionHeroVision4068);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.PolarVoyageMotionLayoutTransitionHeroVision4068) ^ ((this.PolarVoyageZipVortexCelestial6185.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.PolarVoyageZipVortexCelestial6185 + ", bytes=[...]}";
    }
}
