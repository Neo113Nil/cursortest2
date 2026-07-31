package com.yandex.div.core.view2.divs;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivBaseBinder$bindAlpha$1 extends s implements Function1<Double, Unit> {
    final /* synthetic */ View $this_bindAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivBaseBinder$bindAlpha$1(View view) {
        super(1);
        this.$this_bindAlpha = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).doubleValue());
        return Unit.f41027a;
    }

    public final void invoke(double d4) {
        BaseDivViewExtensionsKt.applyAlpha(this.$this_bindAlpha, d4);
    }
}
