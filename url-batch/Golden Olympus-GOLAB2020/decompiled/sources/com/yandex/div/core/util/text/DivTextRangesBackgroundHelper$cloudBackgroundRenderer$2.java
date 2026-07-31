package com.yandex.div.core.util.text;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2 extends s implements Function0<CloudTextRangeBackgroundRenderer> {
    final /* synthetic */ DivTextRangesBackgroundHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextRangesBackgroundHelper$cloudBackgroundRenderer$2(DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        super(0);
        this.this$0 = divTextRangesBackgroundHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CloudTextRangeBackgroundRenderer invoke() {
        Context context = this.this$0.getView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return new CloudTextRangeBackgroundRenderer(context, this.this$0.getResolver());
    }
}
