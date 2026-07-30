package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p000createpolar.PolarVoyageAlarmManagerAlphaInferno3493;
import p000createpolar.PolarVoyageAlertDialogCyberForcePixel3810;
import p000createpolar.PolarVoyageJobSchedulerSpectraTitan1488;
import p000createpolar.PolarVoyageLayoutInfernoSpeed9711;
import p000createpolar.PolarVoyageOrientationSensorPrimeAurora5884;
import p000createpolar.PolarVoyageWorkManagerVortexNova2773;
import p000createpolar.PolarVoyageZoomStateSpectraHeroBlaze1138;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int PolarVoyageZipVortexCelestial6185 = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        PolarVoyageZoomStateSpectraHeroBlaze1138.PolarVoyageMotionLayoutTransitionHeroVision4068(context);
        PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageZipVortexCelestial61852 = PolarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185();
        PolarVoyageZipVortexCelestial61852.PolarVoyageCameraViewSpectraMaxSpectra2824(queryParameter);
        PolarVoyageZipVortexCelestial61852.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageMotionLayoutTransitionHeroVision4068(intValue);
        if (queryParameter2 != null) {
            PolarVoyageZipVortexCelestial61852.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Base64.decode(queryParameter2, 0);
        }
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = PolarVoyageZoomStateSpectraHeroBlaze1138.PolarVoyageZipVortexCelestial6185().PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        polarVoyageWorkManagerVortexNova2773.PolarVoyageBitmapVisionAuroraPixel4705.execute(new PolarVoyageJobSchedulerSpectraTitan1488(polarVoyageWorkManagerVortexNova2773, PolarVoyageZipVortexCelestial61852.PolarVoyageDiffUtilTurboStrike5735(), i, new PolarVoyageAlertDialogCyberForcePixel3810(0)));
    }
}
