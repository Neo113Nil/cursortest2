package p000createpolar;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public abstract class PolarVoyageItemDecorationPulsePixelNebula7577 extends PolarVoyagePackageManagerNeoNeoTurbo8097 {
    public static String PolarVoyageSnackbarGammaEclipse2140(String str) {
        if (PolarVoyageDebugTitaniumInferno5712.PolarVoyageDiffUtilDragonSpeedEclipse6225("|")) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageViewRogueMaster4778("marginPrefix must be non-blank string.");
            return null;
        }
        List PolarVoyageViewBindingPulseHeroSpeed5705 = PolarVoyageDebugTitaniumInferno5712.PolarVoyageViewBindingPulseHeroSpeed5705(str);
        int length = str.length();
        PolarVoyageViewBindingPulseHeroSpeed5705.size();
        int size = PolarVoyageViewBindingPulseHeroSpeed5705.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : PolarVoyageViewBindingPulseHeroSpeed5705) {
            int i2 = i + 1;
            if (i < 0) {
                PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageOnPreDrawListenerNovaCelestialDragon7415();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && PolarVoyageDebugTitaniumInferno5712.PolarVoyageDiffUtilDragonSpeedEclipse6225(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageFlingGestureEclipsePrimeMax1376(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageBitmapMaxTitanTitan7960(i3, str2, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        PolarVoyageStrictModeBetaEpicStrike6595.PolarVoyageCombineBlazeSparkInferno2844(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
