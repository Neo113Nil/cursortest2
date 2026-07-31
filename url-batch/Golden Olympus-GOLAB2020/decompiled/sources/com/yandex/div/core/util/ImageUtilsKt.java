package com.yandex.div.core.util;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import androidx.core.graphics.drawable.b;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ImageUtilsKt {
    @NotNull
    public static final CachedBitmap toCachedBitmap(@NotNull PictureDrawable pictureDrawable, @NotNull Uri imageUrl, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(pictureDrawable, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new CachedBitmap(b.b(pictureDrawable, 0, 0, null, 7, null), bArr, imageUrl, BitmapSource.MEMORY);
    }

    public static /* synthetic */ CachedBitmap toCachedBitmap$default(PictureDrawable pictureDrawable, Uri uri, byte[] bArr, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bArr = null;
        }
        return toCachedBitmap(pictureDrawable, uri, bArr);
    }
}
