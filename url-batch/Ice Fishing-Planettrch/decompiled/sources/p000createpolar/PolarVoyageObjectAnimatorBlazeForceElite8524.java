package p000createpolar;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import com.adjust.sdk.Constants;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageObjectAnimatorBlazeForceElite8524 extends Surface {
    public static int PolarVoyageBottomSheetOmegaNeo1907;
    public static boolean PolarVoyageViewRogueMaster4778;
    public final boolean PolarVoyageItemDecorationUltraDeltaEpic7485;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final PolarVoyagePackageManagerNovaNovaAurora5717 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageObjectAnimatorBlazeForceElite8524(PolarVoyagePackageManagerNovaNovaAurora5717 polarVoyagePackageManagerNovaNovaAurora5717, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyagePackageManagerNovaNovaAurora5717;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = z;
    }

    public static synchronized boolean PolarVoyageMotionLayoutTransitionHeroVision4068(Context context) {
        boolean z;
        synchronized (PolarVoyageObjectAnimatorBlazeForceElite8524.class) {
            try {
                if (!PolarVoyageViewRogueMaster4778) {
                    PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageZipVortexCelestial6185(context);
                    PolarVoyageViewRogueMaster4778 = true;
                }
                z = PolarVoyageBottomSheetOmegaNeo1907 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: PolarVoyageApplicationInfoQuantumTitanVortex2371 -> 0x0040, TRY_LEAVE, TryCatch #0 {PolarVoyageApplicationInfoQuantumTitanVortex2371 -> 0x0040, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0011, B:11:0x0034, B:19:0x001f, B:22:0x002c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int PolarVoyageZipVortexCelestial6185(Context context) {
        boolean PolarVoyageGuidelineStormSolar2850;
        try {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 26 || (!Constants.REFERRER_API_SAMSUNG.equals(Build.MANUFACTURER) && !"XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                PolarVoyageGuidelineStormSolar2850 = PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageGuidelineStormSolar2850("EGL_EXT_protected_content");
                if (PolarVoyageGuidelineStormSolar2850) {
                    return 0;
                }
                return PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageGuidelineStormSolar2850("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            PolarVoyageGuidelineStormSolar2850 = false;
            if (PolarVoyageGuidelineStormSolar2850) {
            }
        } catch (PolarVoyageApplicationInfoQuantumTitanVortex2371 e) {
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageRemoteModelManagerOlympianCelestial9141("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e.getMessage());
            return 0;
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.PolarVoyageStrictModeLegendEpic1532) {
            try {
                if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
                    PolarVoyagePackageManagerNovaNovaAurora5717 polarVoyagePackageManagerNovaNovaAurora5717 = this.PolarVoyageStrictModeLegendEpic1532;
                    polarVoyagePackageManagerNovaNovaAurora5717.PolarVoyageStrictModeLegendEpic1532.getClass();
                    polarVoyagePackageManagerNovaNovaAurora5717.PolarVoyageStrictModeLegendEpic1532.sendEmptyMessage(2);
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
