package com.yandex.div.core.view2;

import com.yandex.div.core.DivKit;
import com.yandex.div.histogram.RenderConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$renderConfig$1 extends s implements Function0<RenderConfiguration> {
    final /* synthetic */ Div2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$renderConfig$1(Div2View div2View) {
        super(0);
        this.this$0 = div2View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RenderConfiguration invoke() {
        return (RenderConfiguration) DivKit.Companion.getInstance(this.this$0.getContext$div_release()).getComponent$div_release().getHistogramRecordConfiguration().getRenderConfiguration().get();
    }
}
