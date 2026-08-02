package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U.A f9245a;

    public C1044b(U.A a3) {
        this.f9245a = a3;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        try {
            image = imageReader.acquireLatestImage();
        } catch (IllegalStateException e3) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e3);
            image = null;
        }
        if (image == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry) this.f9245a.f1348c).pushImage(image);
    }
}
