package p000createpolar;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Reflection;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVectorDrawableHeroRogue1190 implements Callable {
    public final /* synthetic */ Object PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final /* synthetic */ int PolarVoyageZipVortexCelestial6185;

    public /* synthetic */ PolarVoyageVectorDrawableHeroRogue1190(int i, Object obj) {
        this.PolarVoyageZipVortexCelestial6185 = i;
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.PolarVoyageZipVortexCelestial6185;
        Object obj = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    return ((Callable) obj).call();
                } catch (Throwable th) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                    return null;
                }
            default:
                try {
                    return Reflection.getAdvertisingInfoObject((Context) obj);
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
