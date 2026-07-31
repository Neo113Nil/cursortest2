package com.yandex.div.core.image;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // com.yandex.div.core.image.DivImageUrlModifier
    @NotNull
    public String modifyImageUrl(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (!StringsKt.K(imageUrl, "divkit-asset", false, 2, null)) {
            return imageUrl;
        }
        return "file:///android_asset/divkit/" + StringsKt.v0(imageUrl, "divkit-asset://");
    }
}
