package p000createpolar;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final /* synthetic */ class PolarVoyageAlertDialogCyberForcePixel3810 implements Runnable {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;

    public /* synthetic */ PolarVoyageAlertDialogCyberForcePixel3810(int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = AlarmManagerSchedulerBroadcastReceiver.PolarVoyageZipVortexCelestial6185;
                return;
            default:
                PolarVoyageLocationManagerLegendHeroTitanium4938 polarVoyageLocationManagerLegendHeroTitanium4938 = PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageContentObserverPhoenixHero9760;
                synchronized (polarVoyageLocationManagerLegendHeroTitanium4938) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = polarVoyageLocationManagerLegendHeroTitanium4938.PolarVoyageZipVortexCelestial6185;
                        int i3 = polarVoyageLocationManagerLegendHeroTitanium4938.PolarVoyageMotionLayoutTransitionHeroVision4068;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                PolarVoyageRewardedAdUltraTitanium4787 polarVoyageRewardedAdUltraTitanium4787 = (PolarVoyageRewardedAdUltraTitanium4787) objArr[i4];
                                boolean showLayoutBounds = polarVoyageRewardedAdUltraTitanium4787.getShowLayoutBounds();
                                Class cls = PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageFirebaseModelDownloadConditionsLegendHyperionHyper7575;
                                polarVoyageRewardedAdUltraTitanium4787.setShowLayoutBounds(PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageActivityInfoBetaQuantum8726());
                                if (showLayoutBounds != polarVoyageRewardedAdUltraTitanium4787.getShowLayoutBounds()) {
                                    PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageRemoteModelManagerOlympianCelestial9141(polarVoyageRewardedAdUltraTitanium4787.getRoot());
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                PolarVoyageRewardedAdUltraTitanium4787.PolarVoyageRemoteModelManagerOlympianCelestial9141(((PolarVoyageRewardedAdUltraTitanium4787) objArr[i4]).getRoot());
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
