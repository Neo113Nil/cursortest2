package com.yandex.div.core.util.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextRangesBackgroundHelper$multiLineRenderer$2 extends s implements Function0<MultiLineRenderer> {
    final /* synthetic */ DivTextRangesBackgroundHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextRangesBackgroundHelper$multiLineRenderer$2(DivTextRangesBackgroundHelper divTextRangesBackgroundHelper) {
        super(0);
        this.this$0 = divTextRangesBackgroundHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MultiLineRenderer invoke() {
        return new MultiLineRenderer(this.this$0.getView(), this.this$0.getResolver());
    }
}
