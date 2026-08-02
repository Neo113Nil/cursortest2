package com.squareup.util.coil;

import coil3.EventListener;
import coil3.Extras;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import java.io.IOException;

/* loaded from: classes.dex */
public final class DatadogCoilEventListener extends EventListener {
    public final Extras.Key datadogListener = new Extras.Key(25);

    @Override // coil3.EventListener, coil3.request.ImageRequest.Listener
    public final void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        imageRequest.getClass();
        if (errorResult.getThrowable() instanceof IOException) {
            return;
        }
        this.datadogListener.onError(imageRequest, errorResult);
    }
}
