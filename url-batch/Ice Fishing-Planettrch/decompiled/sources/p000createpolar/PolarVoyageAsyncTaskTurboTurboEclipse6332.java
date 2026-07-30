package p000createpolar;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAsyncTaskTurboTurboEclipse6332 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ Runnable PolarVoyageZipVortexCelestial6185;

    public PolarVoyageAsyncTaskTurboTurboEclipse6332(Runnable runnable) {
        this.PolarVoyageZipVortexCelestial6185 = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.PolarVoyageZipVortexCelestial6185.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.PolarVoyageZipVortexCelestial6185.run();
    }
}
