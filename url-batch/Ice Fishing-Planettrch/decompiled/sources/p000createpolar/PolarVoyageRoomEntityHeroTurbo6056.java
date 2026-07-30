package p000createpolar;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageRoomEntityHeroTurbo6056 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final /* synthetic */ PolarVoyageBannerAdPhoenixForcePhoenix6096 PolarVoyageBottomSheetOmegaNeo1907;
    public final long PolarVoyageItemDecorationUltraDeltaEpic7485 = SystemClock.uptimeMillis() + 10000;
    public boolean PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Runnable PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageRoomEntityHeroTurbo6056(PolarVoyageBannerAdPhoenixForcePhoenix6096 polarVoyageBannerAdPhoenixForcePhoenix6096) {
        this.PolarVoyageBottomSheetOmegaNeo1907 = polarVoyageBannerAdPhoenixForcePhoenix6096;
    }

    public final void PolarVoyageZipVortexCelestial6185(View view) {
        if (this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            return;
        }
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = runnable;
        View decorView = this.PolarVoyageBottomSheetOmegaNeo1907.getWindow().getDecorView();
        decorView.getClass();
        if (!this.PolarVoyageRotateAnimationCyberCelestialDelta4768) {
            decorView.postOnAnimation(new PolarVoyageLightSensorSparkBlazeTitanium9192(10, this));
        } else if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.PolarVoyageStrictModeLegendEpic1532;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
                this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = false;
                this.PolarVoyageBottomSheetOmegaNeo1907.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.PolarVoyageStrictModeLegendEpic1532 = null;
        PolarVoyageRewardedAdMegaInfernoStrike2378 polarVoyageRewardedAdMegaInfernoStrike2378 = (PolarVoyageRewardedAdMegaInfernoStrike2378) this.PolarVoyageBottomSheetOmegaNeo1907.PolarVoyageDrawableDeltaHyperion5742.getValue();
        synchronized (polarVoyageRewardedAdMegaInfernoStrike2378.PolarVoyageZipVortexCelestial6185) {
            z = polarVoyageRewardedAdMegaInfernoStrike2378.PolarVoyageMotionLayoutTransitionHeroVision4068;
        }
        if (z) {
            this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = false;
            this.PolarVoyageBottomSheetOmegaNeo1907.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.PolarVoyageBottomSheetOmegaNeo1907.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
