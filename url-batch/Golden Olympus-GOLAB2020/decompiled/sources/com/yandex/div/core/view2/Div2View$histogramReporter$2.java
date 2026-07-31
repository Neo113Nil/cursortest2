package com.yandex.div.core.view2;

import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.reporter.HistogramReporter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$histogramReporter$2 extends s implements Function0<Div2ViewHistogramReporter> {
    final /* synthetic */ Div2View this$0;

    @Metadata
    /* renamed from: com.yandex.div.core.view2.Div2View$histogramReporter$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function0<HistogramReporter> {
        final /* synthetic */ Div2View this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Div2View div2View) {
            super(0);
            this.this$0 = div2View;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final HistogramReporter invoke() {
            HistogramReporter histogramReporter = this.this$0.getDiv2Component$div_release().getHistogramReporter();
            Intrinsics.checkNotNullExpressionValue(histogramReporter, "div2Component.histogramReporter");
            return histogramReporter;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$histogramReporter$2(Div2View div2View) {
        super(0);
        this.this$0 = div2View;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Div2ViewHistogramReporter invoke() {
        Function0 function0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        function0 = this.this$0.renderConfig;
        return new Div2ViewHistogramReporter(anonymousClass1, function0);
    }
}
