package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {

    @NotNull
    private final String divId;

    public DivIdLoggingImageDownloadCallback(@NotNull String divId) {
        Intrinsics.checkNotNullParameter(divId, "divId");
        this.divId = divId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivIdLoggingImageDownloadCallback(@NotNull Div2View divView) {
        this(divView.getLogId());
        Intrinsics.checkNotNullParameter(divView, "divView");
    }
}
