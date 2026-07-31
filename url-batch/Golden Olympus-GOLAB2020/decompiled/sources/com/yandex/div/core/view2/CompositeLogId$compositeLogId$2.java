package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class CompositeLogId$compositeLogId$2 extends s implements Function0<String> {
    final /* synthetic */ CompositeLogId this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeLogId$compositeLogId$2(CompositeLogId compositeLogId) {
        super(0);
        this.this$0 = compositeLogId;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        String formatCompositeLogId;
        formatCompositeLogId = this.this$0.formatCompositeLogId();
        return formatCompositeLogId;
    }
}
