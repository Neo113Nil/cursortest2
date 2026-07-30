package p000createpolar;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLiveDataScopeDeltaForce2288 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ PolarVoyageGradlePluginDragonEpicDelta4266 PolarVoyageZipVortexCelestial6185;

    public PolarVoyageLiveDataScopeDeltaForce2288(PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266) {
        this.PolarVoyageZipVortexCelestial6185 = polarVoyageGradlePluginDragonEpicDelta4266;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = this.PolarVoyageZipVortexCelestial6185;
        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageCameraViewSpectraMaxSpectra2824(surface);
        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyagePoseDetectionCosmosVision6217 = surface;
        PolarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginDragonEpicDelta4266, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        PolarVoyageGradlePluginDragonEpicDelta4266 polarVoyageGradlePluginDragonEpicDelta4266 = this.PolarVoyageZipVortexCelestial6185;
        polarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageCameraViewSpectraMaxSpectra2824(null);
        PolarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageZipVortexCelestial6185(polarVoyageGradlePluginDragonEpicDelta4266, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        PolarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageZipVortexCelestial6185(this.PolarVoyageZipVortexCelestial6185, i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        PolarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageZipVortexCelestial6185(this.PolarVoyageZipVortexCelestial6185, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        PolarVoyageGradlePluginDragonEpicDelta4266.PolarVoyageZipVortexCelestial6185(this.PolarVoyageZipVortexCelestial6185, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}
