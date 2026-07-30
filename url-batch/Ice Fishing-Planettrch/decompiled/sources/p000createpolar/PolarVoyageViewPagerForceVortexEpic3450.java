package p000createpolar;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageViewPagerForceVortexEpic3450 {
    public static final Set PolarVoyageBarcodeScannerInfernoSolarSpark7767;
    public static final PolarVoyageViewPagerForceVortexEpic3450 PolarVoyageBitmapVisionAuroraPixel4705;
    public static final PolarVoyageViewPagerForceVortexEpic3450 PolarVoyageDiffUtilTurboStrike5735;
    public static final String PolarVoyageKotlinBetaPulseBeta3653;
    public final String PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final String PolarVoyageZipVortexCelestial6185;

    static {
        String PolarVoyageRotateAnimationCyberCelestialDelta4768 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRotateAnimationCyberCelestialDelta4768("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        PolarVoyageKotlinBetaPulseBeta3653 = PolarVoyageRotateAnimationCyberCelestialDelta4768;
        String PolarVoyageRotateAnimationCyberCelestialDelta47682 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRotateAnimationCyberCelestialDelta4768("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String PolarVoyageRotateAnimationCyberCelestialDelta47683 = PolarVoyageLiveDataSpectraNebulaPixel5961.PolarVoyageRotateAnimationCyberCelestialDelta4768("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        PolarVoyageBarcodeScannerInfernoSolarSpark7767 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new PolarVoyageSharedFlowCosmosAlpha1205("proto"), new PolarVoyageSharedFlowCosmosAlpha1205("json"))));
        PolarVoyageBitmapVisionAuroraPixel4705 = new PolarVoyageViewPagerForceVortexEpic3450(PolarVoyageRotateAnimationCyberCelestialDelta4768, null);
        PolarVoyageDiffUtilTurboStrike5735 = new PolarVoyageViewPagerForceVortexEpic3450(PolarVoyageRotateAnimationCyberCelestialDelta47682, PolarVoyageRotateAnimationCyberCelestialDelta47683);
    }

    public PolarVoyageViewPagerForceVortexEpic3450(String str, String str2) {
        this.PolarVoyageZipVortexCelestial6185 = str;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = str2;
    }

    public static PolarVoyageViewPagerForceVortexEpic3450 PolarVoyageZipVortexCelestial6185(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new PolarVoyageViewPagerForceVortexEpic3450(str2, str3.isEmpty() ? null : str3);
    }
}
