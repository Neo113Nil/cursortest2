package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindPlainEllipsis$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ DivLineHeightTextView $this_bindPlainEllipsis;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindPlainEllipsis$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindPlainEllipsis = divLineHeightTextView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String ellipsis) {
        Intrinsics.checkNotNullParameter(ellipsis, "ellipsis");
        this.this$0.applyPlainEllipsis(this.$this_bindPlainEllipsis, ellipsis);
    }
}
