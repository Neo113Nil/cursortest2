package com.unity3d.player.a;

import android.media.Image;
import android.media.ImageReader;
import com.unity3d.player.Camera2Wrapper;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.a.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0120m implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C0123p a;

    public C0120m(C0123p c0123p) {
        this.a = c0123p;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore = C0123p.D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.a.a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    AbstractC0126t.Log(6, "Camera2: Wrong image format.");
                }
                Image image = this.a.p;
                if (image != null) {
                    image.close();
                }
                this.a.p = acquireNextImage;
            }
            semaphore.release();
        }
    }
}
