package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p000createpolar.PolarVoyageExoPlayerCelestialNeoThunder6671;
import p000createpolar.PolarVoyageToolbarHeroSpeed2535;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements PolarVoyageExoPlayerCelestialNeoThunder6671 {
    @Override // p000createpolar.PolarVoyageExoPlayerCelestialNeoThunder6671
    public final Object PolarVoyageMotionLayoutTransitionHeroVision4068(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: create-polar.PolarVoyageSupervisorJobPhoenixTitanThunder1383
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new PolarVoyageTabLayoutTurboBetaRogue3011(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new PolarVoyageToolbarHeroSpeed2535(24);
    }

    @Override // p000createpolar.PolarVoyageExoPlayerCelestialNeoThunder6671
    public final List PolarVoyageZipVortexCelestial6185() {
        return Collections.EMPTY_LIST;
    }
}
