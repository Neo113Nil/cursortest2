package p000createpolar;

import android.content.Context;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextWatcherVisionHyper8055 implements Callable {
    public final /* synthetic */ Object PolarVoyageKotlinBetaPulseBeta3653;
    public final /* synthetic */ Context PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageTextWatcherVisionHyper8055(Context context, Object obj, int i) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = context;
        this.PolarVoyageKotlinBetaPulseBeta3653 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.PolarVoyageZipVortexCelestial6185) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Reflection.getPlayAdId(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
            default:
                return Reflection.isPlayTrackingEnabled(this.PolarVoyageMotionLayoutTransitionHeroVision4068, this.PolarVoyageKotlinBetaPulseBeta3653);
        }
    }
}
