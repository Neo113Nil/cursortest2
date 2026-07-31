package com.yandex.div.core.view2.divs;

import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeText$1 extends s implements Function1<BaseInputMask, Unit> {
    final /* synthetic */ G $inputMask;
    final /* synthetic */ DivInputView $this_observeText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeText$1(G g4, DivInputView divInputView) {
        super(1);
        this.$inputMask = g4;
        this.$this_observeText = divInputView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BaseInputMask) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable BaseInputMask baseInputMask) {
        this.$inputMask.f41132b = baseInputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_observeText;
            divInputView.setText(baseInputMask.getValue());
            divInputView.setSelection(baseInputMask.getCursorPosition());
        }
    }
}
