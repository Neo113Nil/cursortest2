package p000createpolar;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageToolbarBlazeForce5748 implements PolarVoyageKaptTitanBlaze4844 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageToolbarBlazeForce5748(int i, Object obj) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = obj;
    }

    @Override // p000createpolar.PolarVoyageKaptTitanBlaze4844
    public final Object get() {
        PolarVoyageSnackbarTitanSpectra1637 polarVoyageSnackbarTitanSpectra1637;
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return PolarVoyageNavigationViewNebulaNovaXPhoenix7849.PolarVoyageActivityInfoBetaQuantum8726((Context) obj);
            case 1:
                return new PolarVoyageZoomStateAlphaVision6590((Context) obj, 18);
            case 2:
                PolarVoyageLintStrikeBetaEpic1334 polarVoyageLintStrikeBetaEpic1334 = new PolarVoyageLintStrikeBetaEpic1334();
                polarVoyageLintStrikeBetaEpic1334.PolarVoyageRotateAnimationCyberCelestialDelta4768 = new PolarVoyageWithContextGammaMaster7108(3);
                polarVoyageLintStrikeBetaEpic1334.PolarVoyageStrictModeLegendEpic1532 = true;
                polarVoyageLintStrikeBetaEpic1334.PolarVoyageBottomSheetOmegaNeo1907 = 3;
                return new PolarVoyageCoordinatorLayoutMegaVisionOmega7602((Context) obj, polarVoyageLintStrikeBetaEpic1334);
            case 3:
                return new PolarVoyageDrawableMaxNovaX8749((Context) obj);
            case 4:
                Context context = (Context) obj;
                PolarVoyageLifecycleCameraControllerUltraShadowDelta8620 polarVoyageLifecycleCameraControllerUltraShadowDelta8620 = PolarVoyageSnackbarTitanSpectra1637.PolarVoyageContentProviderHyperSpark3838;
                synchronized (PolarVoyageSnackbarTitanSpectra1637.class) {
                    try {
                        if (PolarVoyageSnackbarTitanSpectra1637.PolarVoyageLayerDrawableShadowTitaniumOmega1942 == null) {
                            Context applicationContext = context.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            PolarVoyageSnackbarTitanSpectra1637.PolarVoyageLayerDrawableShadowTitaniumOmega1942 = new PolarVoyageSnackbarTitanSpectra1637(applicationContext, hashMap);
                        }
                        polarVoyageSnackbarTitanSpectra1637 = PolarVoyageSnackbarTitanSpectra1637.PolarVoyageLayerDrawableShadowTitaniumOmega1942;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return polarVoyageSnackbarTitanSpectra1637;
            default:
                try {
                    return (PolarVoyageAnimatedVectorDrawableCyberNeoMaster6358) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
