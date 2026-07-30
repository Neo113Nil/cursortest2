package p000createpolar;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.PolarVoyageOnGlobalLayoutListenerVortexEpic7760;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageOnDeviceTranslatorShadowTurboNeo2626 implements ServiceConnection {
    public final /* synthetic */ PolarVoyageOnGlobalLayoutListenerVortexEpic7760 PolarVoyageMotionLayoutTransitionHeroVision4068;
    public final int PolarVoyageZipVortexCelestial6185;

    public PolarVoyageOnDeviceTranslatorShadowTurboNeo2626(PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760, int i) {
        this.PolarVoyageMotionLayoutTransitionHeroVision4068 = polarVoyageOnGlobalLayoutListenerVortexEpic7760;
        this.PolarVoyageZipVortexCelestial6185 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        if (iBinder == null) {
            synchronized (polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageDiffUtilTurboStrike5735) {
                i = polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageCameraPixelBlaze2629;
            }
            if (i == 3) {
                polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageBitmapMaxTitanTitan7960 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            PolarVoyageDrawableCompatPixelHeroShadow1846 polarVoyageDrawableCompatPixelHeroShadow1846 = polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageBitmapVisionAuroraPixel4705;
            polarVoyageDrawableCompatPixelHeroShadow1846.sendMessage(polarVoyageDrawableCompatPixelHeroShadow1846.obtainMessage(i2, polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageLayerDrawableShadowTitaniumOmega1942.get(), 16));
            return;
        }
        synchronized (polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageTextInputEditTextNebulaHero6651) {
            try {
                PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic77602 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("create-polar.PolarVoyageBitmapForceHyperion6750");
                polarVoyageOnGlobalLayoutListenerVortexEpic77602.PolarVoyageItemDecorationUltraDeltaEpic7485 = (queryLocalInterface == null || !(queryLocalInterface instanceof PolarVoyageBitmapForceHyperion6750)) ? new PolarVoyageBitmapForceHyperion6750(iBinder) : (PolarVoyageBitmapForceHyperion6750) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic77603 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
        int i3 = this.PolarVoyageZipVortexCelestial6185;
        PolarVoyageFlipAnimationSpeedAlpha8159 polarVoyageFlipAnimationSpeedAlpha8159 = new PolarVoyageFlipAnimationSpeedAlpha8159(polarVoyageOnGlobalLayoutListenerVortexEpic77603, 0);
        PolarVoyageDrawableCompatPixelHeroShadow1846 polarVoyageDrawableCompatPixelHeroShadow18462 = polarVoyageOnGlobalLayoutListenerVortexEpic77603.PolarVoyageBitmapVisionAuroraPixel4705;
        polarVoyageDrawableCompatPixelHeroShadow18462.sendMessage(polarVoyageDrawableCompatPixelHeroShadow18462.obtainMessage(7, i3, -1, polarVoyageFlipAnimationSpeedAlpha8159));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        PolarVoyageOnGlobalLayoutListenerVortexEpic7760 polarVoyageOnGlobalLayoutListenerVortexEpic7760;
        synchronized (this.PolarVoyageMotionLayoutTransitionHeroVision4068.PolarVoyageTextInputEditTextNebulaHero6651) {
            polarVoyageOnGlobalLayoutListenerVortexEpic7760 = this.PolarVoyageMotionLayoutTransitionHeroVision4068;
            polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageItemDecorationUltraDeltaEpic7485 = null;
        }
        int i = this.PolarVoyageZipVortexCelestial6185;
        PolarVoyageDrawableCompatPixelHeroShadow1846 polarVoyageDrawableCompatPixelHeroShadow1846 = polarVoyageOnGlobalLayoutListenerVortexEpic7760.PolarVoyageBitmapVisionAuroraPixel4705;
        polarVoyageDrawableCompatPixelHeroShadow1846.sendMessage(polarVoyageDrawableCompatPixelHeroShadow1846.obtainMessage(6, i, 1));
    }
}
