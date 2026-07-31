package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeText$2 extends s implements Function1<InputFiltersHolder, Unit> {
    final /* synthetic */ G $inputFilters;
    final /* synthetic */ DivInputView $this_observeText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeText$2(G g4, DivInputView divInputView) {
        super(1);
        this.$inputFilters = g4;
        this.$this_observeText = divInputView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InputFiltersHolder) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable InputFiltersHolder inputFiltersHolder) {
        String str;
        this.$inputFilters.f41132b = inputFiltersHolder;
        if (inputFiltersHolder != null) {
            DivInputView divInputView = this.$this_observeText;
            Editable editableText = divInputView.getEditableText();
            if (editableText == null || (str = editableText.toString()) == null) {
                str = "";
            }
            inputFiltersHolder.setCurrentValue(str);
            inputFiltersHolder.setCursorPosition(divInputView.getSelectionStart());
        }
    }
}
