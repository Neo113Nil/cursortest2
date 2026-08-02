package com.squareup.scannerview;

import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import com.squareup.scannerview.CameraOperator;
import com.squareup.scannerview.scanner.RealObjectScanner;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import io.noties.markwon.LinkResolverDef;
import okhttp3.Cache;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final /* synthetic */ class CameraOperator$$ExternalSyntheticLambda0 implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CameraOperator$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                CameraOperator cameraOperator = (CameraOperator) obj;
                Image acquireLatestImage = imageReader.acquireLatestImage();
                try {
                    Step step = cameraOperator.step;
                    CameraOperator.AnonymousClass2 anonymousClass2 = cameraOperator.processingHandler;
                    if (step != null && acquireLatestImage != null) {
                        Image.Plane[] planes = acquireLatestImage.getPlanes();
                        if (acquireLatestImage.getFormat() == 35 && planes.length == 3) {
                            Rotation rotation = cameraOperator.displayRotation;
                            Rotation rotation2 = cameraOperator.cameraInfo.rotation;
                            rotation.getClass();
                            rotation2.getClass();
                            LinkResolverDef linkResolverDef = Rotation.Companion;
                            int i2 = rotation.r + rotation2.r;
                            linkResolverDef.getClass();
                            Rotation fromInt = LinkResolverDef.fromInt(i2);
                            Image.Plane plane = planes[0];
                            plane.getClass();
                            Image.Plane plane2 = planes[1];
                            plane2.getClass();
                            Image.Plane plane3 = planes[2];
                            plane3.getClass();
                            int width = acquireLatestImage.getWidth();
                            int height = acquireLatestImage.getHeight();
                            Rect rect = new Rect(cameraOperator.adjustedTargetBounds);
                            RealObjectScanner realObjectScanner = RealObjectScanner.INSTANCE;
                            PreviewFrame previewFrame = new PreviewFrame(plane, plane2, plane3, width, height, fromInt, rect);
                            anonymousClass2.removeMessages(0);
                            anonymousClass2.sendMessage(anonymousClass2.obtainMessage(0, previewFrame));
                        }
                        Timber.Forest.e(new AssertionError("Unexpected image format."));
                        cameraOperator.stop();
                        cameraOperator.errorCallback.invoke();
                    }
                    Cache.Companion.closeFinally(acquireLatestImage, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        Cache.Companion.closeFinally(acquireLatestImage, th);
                        throw th2;
                    }
                }
            default:
                Camera2Manager camera2Manager = (Camera2Manager) obj;
                Image acquireNextImage = imageReader.acquireNextImage();
                camera2Manager.cameraChoice.getClass();
                VideoCaptureMethod videoCaptureMethod = VideoCaptureMethod.Stream;
                if (acquireNextImage == null || camera2Manager.imageProcessingFlow.tryEmit(acquireNextImage)) {
                    return;
                }
                acquireNextImage.close();
                return;
        }
    }
}
