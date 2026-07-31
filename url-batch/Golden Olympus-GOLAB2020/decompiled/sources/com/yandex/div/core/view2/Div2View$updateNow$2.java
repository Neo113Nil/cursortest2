package com.yandex.div.core.view2;

import com.yandex.div.histogram.Div2ViewHistogramReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class Div2View$updateNow$2 extends s implements Function0<Unit> {
    final /* synthetic */ Div2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Div2View$updateNow$2(Div2View div2View) {
        super(0);
        this.this$0 = div2View;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m60invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m60invoke() {
        Div2ViewHistogramReporter histogramReporter;
        histogramReporter = this.this$0.getHistogramReporter();
        histogramReporter.onBindingFinished();
    }
}
