package com.yandex.div.core.image;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {

    @NotNull
    private final List<DivImageUrlModifier> modifiers;

    @NotNull
    private final DivImageLoader providedImageLoader;

    @Nullable
    private final SvgDivImageLoader svgImageLoader;

    public DivImageLoaderWrapper(@NotNull DivImageLoader providedImageLoader, @NotNull Context divContext) {
        Intrinsics.checkNotNullParameter(providedImageLoader, "providedImageLoader");
        Intrinsics.checkNotNullParameter(divContext, "divContext");
        this.providedImageLoader = providedImageLoader;
        this.modifiers = CollectionsKt.listOf(new DivImageAssetUrlModifier());
        this.svgImageLoader = !providedImageLoader.hasSvgSupport().booleanValue() ? new SvgDivImageLoader(divContext) : null;
    }

    private final String getModifiedUrl(String str) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            str = ((DivImageUrlModifier) it.next()).modifyImageUrl(str);
        }
        return str;
    }

    private final DivImageLoader getProperLoader(String str) {
        return (this.svgImageLoader == null || !isSvg(str)) ? this.providedImageLoader : this.svgImageLoader;
    }

    private final boolean isSvg(String str) {
        int b02 = StringsKt.b0(str, '?', 0, false, 6, null);
        if (b02 < 0) {
            b02 = str.length();
        }
        String substring = str.substring(0, b02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return StringsKt.v(substring, ".svg", false, 2, null);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String modifiedUrl = getModifiedUrl(imageUrl);
        LoadReference loadImage = getProperLoader(modifiedUrl).loadImage(modifiedUrl, callback);
        Intrinsics.checkNotNullExpressionValue(loadImage, "getProperLoader(modified…ge(modifiedUrl, callback)");
        return loadImage;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String modifiedUrl = getModifiedUrl(imageUrl);
        LoadReference loadImageBytes = getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, callback);
        Intrinsics.checkNotNullExpressionValue(loadImageBytes, "getProperLoader(modified…es(modifiedUrl, callback)");
        return loadImageBytes;
    }
}
