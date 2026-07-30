package p000createpolar;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourceHyperOlympianOmega5605 extends PolarVoyageNavigationViewNebulaNovaXPhoenix7849 {
    public final /* synthetic */ int PolarVoyageViewRogueMaster4778;

    public /* synthetic */ PolarVoyageResourceHyperOlympianOmega5605(int i) {
        this.PolarVoyageViewRogueMaster4778 = i;
    }

    @Override // p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849
    public PolarVoyageRealtimeDatabaseEclipseUltra8894 PolarVoyageFCMCelestialCosmosPixel3711(Context context, Object obj) {
        switch (this.PolarVoyageViewRogueMaster4778) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageViewRogueMaster4778(context, (String) obj) != 0) {
                    return null;
                }
                return new PolarVoyageRealtimeDatabaseEclipseUltra8894(6, Boolean.TRUE);
            default:
                return super.PolarVoyageFCMCelestialCosmosPixel3711(context, obj);
        }
    }

    @Override // p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849
    public final Intent PolarVoyageLayerDrawableShadowTitaniumOmega1942(Context context, Object obj) {
        switch (this.PolarVoyageViewRogueMaster4778) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
                putExtra.getClass();
                return putExtra;
            default:
                return (Intent) obj;
        }
    }

    @Override // p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849
    public final Object PolarVoyageViewBindingPulseHeroSpeed5705(Intent intent, int i) {
        switch (this.PolarVoyageViewRogueMaster4778) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new PolarVoyageServiceInfoVortexEpicTurbo8786(intent, i);
        }
    }
}
