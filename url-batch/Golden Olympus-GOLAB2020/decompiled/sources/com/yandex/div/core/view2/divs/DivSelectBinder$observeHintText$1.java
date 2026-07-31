package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivSelectBinder$observeHintText$1 extends s implements Function1<String, Unit> {
    final /* synthetic */ DivSelectView $this_observeHintText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSelectBinder$observeHintText$1(DivSelectView divSelectView) {
        super(1);
        this.$this_observeHintText = divSelectView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.$this_observeHintText.setHint(hint);
    }
}
