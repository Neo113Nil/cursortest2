package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gj0 {
    public static boolean a(@NotNull ej0 imageValue, @NotNull Map images) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(images, "images");
        Bitmap bitmap = (Bitmap) images.get(imageValue.f());
        return (bitmap != null && bitmap.getWidth() > 1 && bitmap.getHeight() > 1) || !imageValue.b();
    }
}
