package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p000createpolar.PolarVoyageAlarmManagerAlphaInferno3493;
import p000createpolar.PolarVoyageJobSchedulerSpectraTitan1488;
import p000createpolar.PolarVoyageLayoutInfernoSpeed9711;
import p000createpolar.PolarVoyageMediaPlayerNebulaTurboLegend3509;
import p000createpolar.PolarVoyageOrientationSensorPrimeAurora5884;
import p000createpolar.PolarVoyageWorkManagerVortexNova2773;
import p000createpolar.PolarVoyageZoomStateSpectraHeroBlaze1138;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        PolarVoyageZoomStateSpectraHeroBlaze1138.PolarVoyageMotionLayoutTransitionHeroVision4068(getApplicationContext());
        PolarVoyageAlarmManagerAlphaInferno3493 PolarVoyageZipVortexCelestial6185 = PolarVoyageLayoutInfernoSpeed9711.PolarVoyageZipVortexCelestial6185();
        PolarVoyageZipVortexCelestial6185.PolarVoyageCameraViewSpectraMaxSpectra2824(string);
        PolarVoyageZipVortexCelestial6185.PolarVoyageBottomSheetOmegaNeo1907 = PolarVoyageOrientationSensorPrimeAurora5884.PolarVoyageMotionLayoutTransitionHeroVision4068(i);
        if (string2 != null) {
            PolarVoyageZipVortexCelestial6185.PolarVoyageRotateAnimationCyberCelestialDelta4768 = Base64.decode(string2, 0);
        }
        PolarVoyageWorkManagerVortexNova2773 polarVoyageWorkManagerVortexNova2773 = PolarVoyageZoomStateSpectraHeroBlaze1138.PolarVoyageZipVortexCelestial6185().PolarVoyageBarcodeScannerInfernoSolarSpark7767;
        polarVoyageWorkManagerVortexNova2773.PolarVoyageBitmapVisionAuroraPixel4705.execute(new PolarVoyageJobSchedulerSpectraTitan1488(polarVoyageWorkManagerVortexNova2773, PolarVoyageZipVortexCelestial6185.PolarVoyageDiffUtilTurboStrike5735(), i2, new PolarVoyageMediaPlayerNebulaTurboLegend3509(21, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
