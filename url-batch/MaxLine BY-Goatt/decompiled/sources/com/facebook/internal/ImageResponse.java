package com.facebook.internal;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ImageResponse {
    private final Bitmap bitmap;
    private final Exception error;
    private final boolean isCachedRedirect;
    private final ImageRequest request;

    public ImageResponse(ImageRequest imageRequest, Exception exc, boolean z, Bitmap bitmap) {
        imageRequest.getClass();
        this.request = imageRequest;
        this.error = exc;
        this.isCachedRedirect = z;
        this.bitmap = bitmap;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Exception getError() {
        return this.error;
    }

    public final ImageRequest getRequest() {
        return this.request;
    }

    public final boolean isCachedRedirect() {
        return this.isCachedRedirect;
    }
}
