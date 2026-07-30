package p000createpolar;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGradleRogueMaster1893 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] PolarVoyageDrawableDeltaHyperion5742 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public EGLContext PolarVoyageBottomSheetOmegaNeo1907;
    public SurfaceTexture PolarVoyageCameraPixelBlaze2629;
    public final Handler PolarVoyageItemDecorationUltraDeltaEpic7485;
    public EGLDisplay PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final int[] PolarVoyageStrictModeLegendEpic1532 = new int[1];
    public EGLSurface PolarVoyageViewRogueMaster4778;

    public PolarVoyageGradleRogueMaster1893(Handler handler) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.PolarVoyageCameraPixelBlaze2629;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
