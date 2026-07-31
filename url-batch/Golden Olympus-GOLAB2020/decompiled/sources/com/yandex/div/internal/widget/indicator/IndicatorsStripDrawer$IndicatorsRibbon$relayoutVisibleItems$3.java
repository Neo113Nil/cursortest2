package com.yandex.div.internal.widget.indicator;

import com.yandex.div.internal.widget.indicator.IndicatorsStripDrawer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import l2.b;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3 extends s implements Function1<IndicatorsStripDrawer.Indicator, Boolean> {
    final /* synthetic */ b $viewPort;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3(b bVar) {
        super(1);
        this.$viewPort = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull IndicatorsStripDrawer.Indicator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!this.$viewPort.a(Float.valueOf(it.getCenterOffset())));
    }
}
