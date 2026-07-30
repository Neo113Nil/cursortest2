package p000createpolar;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextWatcherPhoenixDragonPulse6218 extends PolarVoyageSoundPoolPulseForceNeo6851 implements PolarVoyageStateFlowNebulaMax1492 {
    public final /* synthetic */ PolarVoyageFilterSparkFusion2880 PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ int PolarVoyageStrictModeLegendEpic1532;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PolarVoyageTextWatcherPhoenixDragonPulse6218(PolarVoyageFilterSparkFusion2880 polarVoyageFilterSparkFusion2880, int i) {
        super(1);
        this.PolarVoyageStrictModeLegendEpic1532 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageFilterSparkFusion2880;
    }

    @Override // p000createpolar.PolarVoyageStateFlowNebulaMax1492
    public final Object PolarVoyageZipVortexCelestial6185(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.PolarVoyageStrictModeLegendEpic1532;
        PolarVoyageFilterSparkFusion2880 polarVoyageFilterSparkFusion2880 = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = (PolarVoyageRewardedAdUltraTitanium4787) obj;
                if (!(polarVoyageRewardedAdUltraTitanium4787 instanceof PolarVoyageRewardedAdUltraTitanium4787)) {
                    polarVoyageRewardedAdUltraTitanium4787 = null;
                }
                if (polarVoyageRewardedAdUltraTitanium4787 != null) {
                    polarVoyageRewardedAdUltraTitanium4787.getAndroidViewsHandler$ui_release().removeViewInLayout(polarVoyageFilterSparkFusion2880);
                    HashMap<PolarVoyageConfigurationMegaTitaniumQuantum2348, PolarVoyageRoomEntityCelestialCosmosPixel5838> layoutNodeToHolder = polarVoyageRewardedAdUltraTitanium4787.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                    PolarVoyageInputMethodManagerBetaShadowHyper4520.PolarVoyageItemDecorationUltraDeltaEpic7485(layoutNodeToHolder).remove(polarVoyageRewardedAdUltraTitanium4787.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(polarVoyageFilterSparkFusion2880));
                    polarVoyageFilterSparkFusion2880.setImportantForAccessibility(0);
                }
                polarVoyageFilterSparkFusion2880.removeAllViewsInLayout();
                return PolarVoyageFilterGammaStrikeNova8373.PolarVoyageZipVortexCelestial6185;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_FIELD_NUMBER /* 5 */:
                    case PolarVoyageDigitalInkRecognitionCelestialPixel7898.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = polarVoyageFilterSparkFusion2880.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = polarVoyageFilterSparkFusion2880.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
