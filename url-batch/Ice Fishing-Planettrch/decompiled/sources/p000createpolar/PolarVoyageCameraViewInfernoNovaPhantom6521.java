package p000createpolar;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraViewInfernoNovaPhantom6521 implements PolarVoyageModelInputOutputInfernoBeta7978 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final PolarVoyageDebugCelestialNebula7743 PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageCameraViewInfernoNovaPhantom6521(PolarVoyageDebugCelestialNebula7743 polarVoyageDebugCelestialNebula7743, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageDebugCelestialNebula7743;
    }

    @Override // p000createpolar.PolarVoyageDebugCelestialNebula7743
    public final Object get() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        PolarVoyageDebugCelestialNebula7743 polarVoyageDebugCelestialNebula7743 = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String packageName = ((Context) polarVoyageDebugCelestialNebula7743.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                PolarVoyageR8UltraEliteBeta8736.PolarVoyageItemDecorationUltraDeltaEpic7485("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new PolarVoyageStateListAnimatorGammaEpicEpic8366(Integer.valueOf(PolarVoyageStateListAnimatorGammaEpicEpic8366.PolarVoyageBottomSheetOmegaNeo1907).intValue(), (Context) polarVoyageDebugCelestialNebula7743.get(), "com.google.android.datatransport.events");
        }
    }
}
