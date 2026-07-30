package p000createpolar;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAsyncTaskMasterVision4556 {
    public final long PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public final long PolarVoyageBitmapVisionAuroraPixel4705;
    public final Map PolarVoyageDiffUtilTurboStrike5735;
    public final PolarVoyageCameraXRogueDragon5249 PolarVoyageKotlinBetaPulseBeta3653;
    public final Integer PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAsyncTaskMasterVision4556(String str, Integer num, PolarVoyageCameraXRogueDragon5249 polarVoyageCameraXRogueDragon5249, long j, long j2, HashMap hashMap) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = num;
        this.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCameraXRogueDragon5249;
        this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = j;
        this.PolarVoyageBitmapVisionAuroraPixel4705 = j2;
        this.PolarVoyageDiffUtilTurboStrike5735 = hashMap;
    }

    public final PolarVoyageStateEpicSpectraThunder6774 PolarVoyageKotlinBetaPulseBeta3653() {
        PolarVoyageStateEpicSpectraThunder6774 polarVoyageStateEpicSpectraThunder6774 = new PolarVoyageStateEpicSpectraThunder6774();
        String str = this.PolarVoyageZipVortexCelestial6185;
        if (str == null) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Null transportName");
            return null;
        }
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageZipVortexCelestial6185 = str;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageMotionLayoutTransitionHeroVision4068 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        PolarVoyageCameraXRogueDragon5249 polarVoyageCameraXRogueDragon5249 = this.PolarVoyageKotlinBetaPulseBeta3653;
        if (polarVoyageCameraXRogueDragon5249 == null) {
            PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Null encodedPayload");
            return null;
        }
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageKotlinBetaPulseBeta3653 = polarVoyageCameraXRogueDragon5249;
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Long.valueOf(this.PolarVoyageBarcodeScannerInfernoSolarSpark7767);
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageBitmapVisionAuroraPixel4705 = Long.valueOf(this.PolarVoyageBitmapVisionAuroraPixel4705);
        polarVoyageStateEpicSpectraThunder6774.PolarVoyageDiffUtilTurboStrike5735 = new HashMap(this.PolarVoyageDiffUtilTurboStrike5735);
        return polarVoyageStateEpicSpectraThunder6774;
    }

    public final int PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        String str2 = (String) this.PolarVoyageDiffUtilTurboStrike5735.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final String PolarVoyageZipVortexCelestial6185(String str) {
        String str2 = (String) this.PolarVoyageDiffUtilTurboStrike5735.get(str);
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PolarVoyageAsyncTaskMasterVision4556) {
            PolarVoyageAsyncTaskMasterVision4556 polarVoyageAsyncTaskMasterVision4556 = (PolarVoyageAsyncTaskMasterVision4556) obj;
            if (this.PolarVoyageZipVortexCelestial6185.equals(polarVoyageAsyncTaskMasterVision4556.PolarVoyageZipVortexCelestial6185)) {
                Integer num = polarVoyageAsyncTaskMasterVision4556.PolarVoyageMotionLayoutTransitionHeroVision4068;
                Integer num2 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.PolarVoyageKotlinBetaPulseBeta3653.equals(polarVoyageAsyncTaskMasterVision4556.PolarVoyageKotlinBetaPulseBeta3653) && this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 == polarVoyageAsyncTaskMasterVision4556.PolarVoyageBarcodeScannerInfernoSolarSpark7767 && this.PolarVoyageBitmapVisionAuroraPixel4705 == polarVoyageAsyncTaskMasterVision4556.PolarVoyageBitmapVisionAuroraPixel4705 && this.PolarVoyageDiffUtilTurboStrike5735.equals(polarVoyageAsyncTaskMasterVision4556.PolarVoyageDiffUtilTurboStrike5735)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.PolarVoyageZipVortexCelestial6185.hashCode() ^ 1000003) * 1000003;
        Integer num = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.PolarVoyageKotlinBetaPulseBeta3653.hashCode()) * 1000003;
        long j = this.PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.PolarVoyageBitmapVisionAuroraPixel4705;
        return this.PolarVoyageDiffUtilTurboStrike5735.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.PolarVoyageZipVortexCelestial6185 + ", code=" + this.PolarVoyageMotionLayoutTransitionHeroVision4068 + ", encodedPayload=" + this.PolarVoyageKotlinBetaPulseBeta3653 + ", eventMillis=" + this.PolarVoyageBarcodeScannerInfernoSolarSpark7767 + ", uptimeMillis=" + this.PolarVoyageBitmapVisionAuroraPixel4705 + ", autoMetadata=" + this.PolarVoyageDiffUtilTurboStrike5735 + "}";
    }
}
