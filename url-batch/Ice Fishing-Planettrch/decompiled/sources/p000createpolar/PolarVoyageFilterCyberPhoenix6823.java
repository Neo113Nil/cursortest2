package p000createpolar;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageFilterCyberPhoenix6823 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final PolarVoyageFilterCyberPhoenix6823 PolarVoyageViewRogueMaster4778 = new PolarVoyageFilterCyberPhoenix6823();
    public final AtomicBoolean PolarVoyageItemDecorationUltraDeltaEpic7485 = new AtomicBoolean();
    public final AtomicBoolean PolarVoyageStrictModeLegendEpic1532 = new AtomicBoolean();
    public final ArrayList PolarVoyageRotateAnimationCyberCelestialDelta4768 = new ArrayList();
    public boolean PolarVoyageBottomSheetOmegaNeo1907 = false;

    public static void PolarVoyageZipVortexCelestial6185(Application application) {
        PolarVoyageFilterCyberPhoenix6823 polarVoyageFilterCyberPhoenix6823 = PolarVoyageViewRogueMaster4778;
        synchronized (polarVoyageFilterCyberPhoenix6823) {
            try {
                if (!polarVoyageFilterCyberPhoenix6823.PolarVoyageBottomSheetOmegaNeo1907) {
                    application.registerActivityLifecycleCallbacks(polarVoyageFilterCyberPhoenix6823);
                    application.registerComponentCallbacks(polarVoyageFilterCyberPhoenix6823);
                    polarVoyageFilterCyberPhoenix6823.PolarVoyageBottomSheetOmegaNeo1907 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void PolarVoyageMotionLayoutTransitionHeroVision4068(boolean z) {
        synchronized (PolarVoyageViewRogueMaster4778) {
            try {
                ArrayList arrayList = this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((PolarVoyageFlowOnNovaTitaniumRogue3214) obj).PolarVoyageZipVortexCelestial6185(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.PolarVoyageItemDecorationUltraDeltaEpic7485.compareAndSet(true, false);
        this.PolarVoyageStrictModeLegendEpic1532.set(true);
        if (compareAndSet) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.PolarVoyageItemDecorationUltraDeltaEpic7485.compareAndSet(true, false);
        this.PolarVoyageStrictModeLegendEpic1532.set(true);
        if (compareAndSet) {
            PolarVoyageMotionLayoutTransitionHeroVision4068(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.PolarVoyageItemDecorationUltraDeltaEpic7485.compareAndSet(false, true)) {
            this.PolarVoyageStrictModeLegendEpic1532.set(true);
            PolarVoyageMotionLayoutTransitionHeroVision4068(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
