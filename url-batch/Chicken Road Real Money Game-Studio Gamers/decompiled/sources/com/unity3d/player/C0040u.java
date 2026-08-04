package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0040u implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ C0044w a;

    C0040u(C0044w c0044w) {
        this.a = c0044w;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore;
        Semaphore semaphore2;
        Image image;
        com.unity3d.player.a.b bVar;
        semaphore = C0044w.D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    bVar = this.a.a;
                    ((Camera2Wrapper) bVar).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC0050z.Log(6, "Camera2: Wrong image format.");
                }
                image = this.a.p;
                if (image != null) {
                    image.close();
                }
                this.a.p = acquireNextImage;
            }
            semaphore2 = C0044w.D;
            semaphore2.release();
        }
    }
}
