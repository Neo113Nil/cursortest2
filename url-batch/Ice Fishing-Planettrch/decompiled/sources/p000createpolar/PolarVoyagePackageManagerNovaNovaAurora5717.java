package p000createpolar;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyagePackageManagerNovaNovaAurora5717 extends HandlerThread implements Handler.Callback {
    public RuntimeException PolarVoyageBottomSheetOmegaNeo1907;
    public PolarVoyageGradleRogueMaster1893 PolarVoyageItemDecorationUltraDeltaEpic7485;
    public Error PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public Handler PolarVoyageStrictModeLegendEpic1532;
    public PolarVoyageObjectAnimatorBlazeForceElite8524 PolarVoyageViewRogueMaster4778;

    /* JADX WARN: Multi-variable type inference failed */
    public final void PolarVoyageMotionLayoutTransitionHeroVision4068() {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
        PolarVoyageGradleRogueMaster1893 polarVoyageGradleRogueMaster1893 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        polarVoyageGradleRogueMaster1893.PolarVoyageItemDecorationUltraDeltaEpic7485.removeCallbacks(polarVoyageGradleRogueMaster1893);
        try {
            SurfaceTexture surfaceTexture = polarVoyageGradleRogueMaster1893.PolarVoyageCameraPixelBlaze2629;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, polarVoyageGradleRogueMaster1893.PolarVoyageStrictModeLegendEpic1532, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = polarVoyageGradleRogueMaster1893.PolarVoyageViewRogueMaster4778;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768, polarVoyageGradleRogueMaster1893.PolarVoyageViewRogueMaster4778);
            }
            EGLContext eGLContext = polarVoyageGradleRogueMaster1893.PolarVoyageBottomSheetOmegaNeo1907;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768);
            }
            polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768 = null;
            polarVoyageGradleRogueMaster1893.PolarVoyageBottomSheetOmegaNeo1907 = null;
            polarVoyageGradleRogueMaster1893.PolarVoyageViewRogueMaster4778 = null;
            polarVoyageGradleRogueMaster1893.PolarVoyageCameraPixelBlaze2629 = null;
        }
    }

    public final void PolarVoyageZipVortexCelestial6185(int i) {
        EGLSurface eglCreatePbufferSurface;
        this.PolarVoyageItemDecorationUltraDeltaEpic7485.getClass();
        PolarVoyageGradleRogueMaster1893 polarVoyageGradleRogueMaster1893 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int[] iArr = polarVoyageGradleRogueMaster1893.PolarVoyageStrictModeLegendEpic1532;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768 = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, PolarVoyageGradleRogueMaster1893.PolarVoyageDrawableDeltaHyperion5742, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = PolarVoyageInputMethodManagerSolarHyperionAurora5339.PolarVoyageZipVortexCelestial6185;
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485("eglCreateContext failed", eglCreateContext != null);
        polarVoyageGradleRogueMaster1893.PolarVoyageBottomSheetOmegaNeo1907 = eglCreateContext;
        EGLDisplay eGLDisplay = polarVoyageGradleRogueMaster1893.PolarVoyageRotateAnimationCyberCelestialDelta4768;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageItemDecorationUltraDeltaEpic7485("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        polarVoyageGradleRogueMaster1893.PolarVoyageViewRogueMaster4778 = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        PolarVoyageLayoutInflaterMegaAlpha5562.PolarVoyageRemoteModelManagerOlympianCelestial9141("initialCapacity", 4);
        Object[] objArr2 = new Object[4];
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z2) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i3 = i2 + 1;
            int PolarVoyageBitmapVisionAuroraPixel4705 = PolarVoyageAccelerometerPhantomTitan1866.PolarVoyageBitmapVisionAuroraPixel4705(objArr2.length, i3);
            if (PolarVoyageBitmapVisionAuroraPixel4705 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, PolarVoyageBitmapVisionAuroraPixel4705);
            }
            objArr2[i2] = valueOf;
            i2 = i3;
            z2 = true;
        }
        if (z2) {
            throw new PolarVoyageApplicationInfoQuantumTitanVortex2371(sb.toString(), PolarVoyageDialogPhantomEliteAurora3058.PolarVoyageStrictModeLegendEpic1532(i2, objArr2));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        polarVoyageGradleRogueMaster1893.PolarVoyageCameraPixelBlaze2629 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(polarVoyageGradleRogueMaster1893);
        SurfaceTexture surfaceTexture2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485.PolarVoyageCameraPixelBlaze2629;
        surfaceTexture2.getClass();
        this.PolarVoyageViewRogueMaster4778 = new PolarVoyageObjectAnimatorBlazeForceElite8524(this, surfaceTexture2, i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    PolarVoyageZipVortexCelestial6185(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (PolarVoyageApplicationInfoQuantumTitanVortex2371 e) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.PolarVoyageBottomSheetOmegaNeo1907 = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.PolarVoyageBottomSheetOmegaNeo1907 = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    PolarVoyageMotionLayoutTransitionHeroVision4068();
                    return true;
                } catch (Throwable th) {
                    try {
                        PolarVoyageFlatMapSolarShadowAlpha5929.PolarVoyageAnimatorSetSparkUltraMax8233("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
