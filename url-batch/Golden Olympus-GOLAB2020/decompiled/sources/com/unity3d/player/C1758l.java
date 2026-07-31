package com.unity3d.player;

import android.media.Image;
import android.media.ImageReader;
import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1758l implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1766o f22192a;

    public C1758l(C1766o c1766o) {
        this.f22192a = c1766o;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Semaphore semaphore = C1766o.f22201D;
        if (semaphore.tryAcquire()) {
            Image acquireNextImage = imageReader.acquireNextImage();
            if (acquireNextImage != null) {
                Image.Plane[] planes = acquireNextImage.getPlanes();
                if (acquireNextImage.getFormat() == 35 && planes != null && planes.length == 3) {
                    ((Camera2Wrapper) this.f22192a.f22203a).a(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride());
                } else {
                    h1.T.a(6, "Camera2: Wrong image format.");
                }
                Image image = this.f22192a.f22218p;
                if (image != null) {
                    image.close();
                }
                this.f22192a.f22218p = acquireNextImage;
            }
            semaphore.release();
        }
    }
}
