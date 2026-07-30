package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageServiceSpectraDelta5404 implements PolarVoyageFragmentPulseEliteDragon8768 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final /* synthetic */ long PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageServiceSpectraDelta5404(Object obj, long j, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = obj;
        this.PolarVoyageStrictModeLegendEpic1532 = j;
    }

    @Override // p000createpolar.PolarVoyageFragmentPulseEliteDragon8768
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068() {
        PolarVoyageNotificationForcePulse9896 polarVoyageNotificationForcePulse9896;
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((PolarVoyageInputFilterNovaEclipseAlpha5181) ((PolarVoyageInputMethodManagerBetaShadowHyper4520) this.PolarVoyageRotateAnimationCyberCelestialDelta4768)).PolarVoyageCameraViewEclipseLegendStrike8028(this.PolarVoyageStrictModeLegendEpic1532);
            default:
                PolarVoyageCountDownTimerMegaLegendTurbo5868 polarVoyageCountDownTimerMegaLegendTurbo5868 = (PolarVoyageCountDownTimerMegaLegendTurbo5868) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                long j = this.PolarVoyageStrictModeLegendEpic1532;
                synchronized (polarVoyageCountDownTimerMegaLegendTurbo5868) {
                    try {
                        if (!polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageDisplayMetricsVortexDragon9516 && (polarVoyageNotificationForcePulse9896 = polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageBottomSheetOmegaNeo1907) != null) {
                            int i = polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageMotionLayoutForceEpicAurora7183 ? polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageLayerDrawableShadowTitaniumOmega1942 : -1;
                            polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageLayerDrawableShadowTitaniumOmega1942++;
                            polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageMotionLayoutForceEpicAurora7183 = true;
                            if (i != -1) {
                                PolarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCountDownTimerMegaLegendTurbo5868, new SocketTimeoutException("sent ping but didn't receive pong within " + polarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653 + "ms (after " + (i - 1) + " successful ping/pongs)"), true, 2);
                            } else {
                                try {
                                    PolarVoyagePropertyValuesHolderVortexNeo2967 polarVoyagePropertyValuesHolderVortexNeo2967 = PolarVoyagePropertyValuesHolderVortexNeo2967.PolarVoyageBottomSheetOmegaNeo1907;
                                    polarVoyagePropertyValuesHolderVortexNeo2967.getClass();
                                    polarVoyageNotificationForcePulse9896.PolarVoyageMotionLayoutTransitionHeroVision4068(9, polarVoyagePropertyValuesHolderVortexNeo2967);
                                } catch (IOException e) {
                                    PolarVoyageCountDownTimerMegaLegendTurbo5868.PolarVoyageKotlinBetaPulseBeta3653(polarVoyageCountDownTimerMegaLegendTurbo5868, e, true, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
        }
    }
}
