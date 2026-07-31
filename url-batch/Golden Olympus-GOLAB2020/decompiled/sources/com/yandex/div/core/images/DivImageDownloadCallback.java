package com.yandex.div.core.images;

import android.graphics.drawable.PictureDrawable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public abstract class DivImageDownloadCallback {
    public void onError() {
    }

    public void onSuccess(@NonNull PictureDrawable pictureDrawable) {
    }

    public void onSuccess(@NonNull CachedBitmap cachedBitmap) {
    }
}
