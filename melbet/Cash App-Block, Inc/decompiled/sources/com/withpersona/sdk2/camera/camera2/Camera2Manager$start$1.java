package com.withpersona.sdk2.camera.camera2;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import kotlinx.coroutines.JobKt;

/* loaded from: classes4.dex */
public final class Camera2Manager$start$1 implements SurfaceHolder.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ Camera2Manager$start$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = this.$r8$classId;
        Object obj = this.this$0;
        switch (i4) {
            case 0:
                surfaceHolder.getClass();
                break;
            case 1:
                surfaceHolder.getClass();
                ((CameraWrapper.k) obj).invoke(surfaceHolder);
                break;
            default:
                surfaceHolder.getClass();
                FrameLoader frameLoader = (FrameLoader) obj;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(frameLoader.l, i2, i3, false);
                createScaledBitmap.getClass();
                frameLoader.l = createScaledBitmap;
                Surface surface = surfaceHolder.getSurface();
                surface.getClass();
                FrameProducer.DefaultImpls.startPreview$default((FrameProducer) frameLoader, surface, false, 2, (Object) null);
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.$r8$classId) {
            case 0:
                surfaceHolder.getClass();
                ((Camera2Manager) this.this$0).isPreviewSurfaceAvailable = true;
                Camera2Manager camera2Manager = (Camera2Manager) this.this$0;
                camera2Manager.previewView.setCameraPreviewSize(camera2Manager.cameraChoice.size.getWidth(), ((Camera2Manager) this.this$0).cameraChoice.size.getHeight(), ((Camera2Manager) this.this$0).orientation);
                Camera2Manager camera2Manager2 = (Camera2Manager) this.this$0;
                camera2Manager2.previewView.post(new Task$$ExternalSyntheticLambda0(camera2Manager2, 6));
                break;
            case 1:
                surfaceHolder.getClass();
                break;
            default:
                surfaceHolder.getClass();
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.$r8$classId) {
            case 0:
                surfaceHolder.getClass();
                ((Camera2Manager) this.this$0).isPreviewSurfaceAvailable = false;
                Camera2Manager camera2Manager = (Camera2Manager) this.this$0;
                JobKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager.AnonymousClass1(camera2Manager, null, 7), 3);
                break;
            case 1:
                surfaceHolder.getClass();
                surfaceHolder.removeCallback(this);
                break;
            default:
                surfaceHolder.getClass();
                surfaceHolder.removeCallback(this);
                break;
        }
    }
}
