package p000createpolar;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePaintLegendNebulaLegend3234 extends ThreadLocal {
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    PolarVoyageJobSchedulerStormSolar7380 polarVoyageJobSchedulerStormSolar7380 = new PolarVoyageJobSchedulerStormSolar7380(choreographer, PolarVoyageNestedScrollViewBlazeMaxMax1969.PolarVoyageAnimatorSetSparkUltraMax8233(myLooper));
                    return PolarVoyageObjectAnimatorSparkPhantomStrike9583.PolarVoyageLifecycleOlympianOmega3762(polarVoyageJobSchedulerStormSolar7380, polarVoyageJobSchedulerStormSolar7380.PolarVoyageAnimatorSetSparkUltraMax8233);
                }
                PolarVoyageCamera2MasterPulse1881.PolarVoyageCameraPixelBlaze2629("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(PolarVoyageGradientDrawableEclipseAuroraPhoenix3106.PolarVoyageZipVortexCelestial6185);
                return simpleDateFormat;
            case 2:
                return new Random();
            default:
                return new PolarVoyageNestedScrollViewCelestialHyperDragon4560();
        }
    }
}
