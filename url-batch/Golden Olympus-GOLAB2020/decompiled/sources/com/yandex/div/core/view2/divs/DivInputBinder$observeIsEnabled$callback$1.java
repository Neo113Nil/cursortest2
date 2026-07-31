package com.yandex.div.core.view2.divs;

import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeIsEnabled$callback$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ DivInputView $this_observeIsEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeIsEnabled$callback$1(DivInputView divInputView) {
        super(1);
        this.$this_observeIsEnabled = divInputView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        if (!z4 && this.$this_observeIsEnabled.isFocused()) {
            DivActionTypedUtilsKt.closeKeyboard(this.$this_observeIsEnabled);
        }
        this.$this_observeIsEnabled.setEnabled$div_release(z4);
    }
}
