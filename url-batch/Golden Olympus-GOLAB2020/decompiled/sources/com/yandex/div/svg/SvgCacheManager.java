package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SvgCacheManager {

    @NotNull
    private final WeakHashMap<String, PictureDrawable> cache = new WeakHashMap<>();

    @Nullable
    public final PictureDrawable get(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return this.cache.get(imageUrl);
    }

    public final void set(@NotNull String imageUrl, @NotNull PictureDrawable pictureDrawable) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(pictureDrawable, "pictureDrawable");
        this.cache.put(imageUrl, pictureDrawable);
    }
}
