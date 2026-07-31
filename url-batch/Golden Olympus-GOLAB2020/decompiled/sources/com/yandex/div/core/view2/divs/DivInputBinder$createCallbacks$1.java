package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.util.inputfilter.InputFiltersHolder;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.data.VariableMutationException;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivInputBinder$createCallbacks$1 implements TwoWayVariableBinder.Callbacks {
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ InputFiltersHolder $filters;
    final /* synthetic */ BaseInputMask $inputMask;
    final /* synthetic */ String $secondaryVariable;
    final /* synthetic */ DivInputView $this_createCallbacks;

    DivInputBinder$createCallbacks$1(BaseInputMask baseInputMask, InputFiltersHolder inputFiltersHolder, DivInputView divInputView, String str, Div2View div2View) {
        this.$inputMask = baseInputMask;
        this.$filters = inputFiltersHolder;
        this.$this_createCallbacks = divInputView;
        this.$secondaryVariable = str;
        this.$divView = div2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyMaskOrFilters(Editable editable, Function1<? super String, Unit> function1) {
        String str;
        String obj;
        String str2 = "";
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            if (!Intrinsics.areEqual(baseInputMask.getValue(), str)) {
                Editable text = divInputView.getText();
                if (text != null && (obj = text.toString()) != null) {
                    str2 = obj;
                }
                baseInputMask.applyChangeFrom(str2, Integer.valueOf(divInputView.getSelectionStart()));
                divInputView.setText(baseInputMask.getValue());
                divInputView.setSelection(baseInputMask.getCursorPosition());
                setSecondVariable(baseInputMask.getValue());
            }
            function1.invoke(StringsKt.F(baseInputMask.getRawValue(), ',', JwtParser.SEPARATOR_CHAR, false, 4, null));
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            DivInputView divInputView2 = this.$this_createCallbacks;
            if (Intrinsics.areEqual(inputFiltersHolder.getCurrentValue(), str)) {
                return;
            }
            if (!inputFiltersHolder.checkValue(str)) {
                divInputView2.setText(inputFiltersHolder.getCurrentValue());
                divInputView2.setSelection(inputFiltersHolder.getCursorPosition());
                return;
            } else {
                inputFiltersHolder.setCurrentValue(str);
                inputFiltersHolder.setCursorPosition(divInputView2.getSelectionStart());
            }
        }
        function1.invoke(str);
    }

    private VariableMutationException setSecondVariable(String str) {
        String str2 = this.$secondaryVariable;
        if (str2 != null) {
            return this.$divView.setVariable(str2, str);
        }
        return null;
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void setViewStateChangeListener(@NotNull Function1<? super String, Unit> valueUpdater) {
        Intrinsics.checkNotNullParameter(valueUpdater, "valueUpdater");
        this.$this_createCallbacks.addAfterTextChangeAction(new DivInputBinder$createCallbacks$1$setViewStateChangeListener$1(this, valueUpdater));
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
    public void onVariableChanged(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        BaseInputMask baseInputMask = this.$inputMask;
        if (baseInputMask != null) {
            DivInputView divInputView = this.$this_createCallbacks;
            baseInputMask.overrideRawValue(str);
            setSecondVariable(baseInputMask.getValue());
            divInputView.setText(baseInputMask.getValue());
            return;
        }
        InputFiltersHolder inputFiltersHolder = this.$filters;
        if (inputFiltersHolder != null) {
            if (!inputFiltersHolder.checkValue(str)) {
                return;
            }
            inputFiltersHolder.setCurrentValue(str);
            inputFiltersHolder.setCursorPosition(str.length());
        }
        Editable text = this.$this_createCallbacks.getText();
        if (Intrinsics.areEqual(text != null ? text.toString() : null, str)) {
            return;
        }
        this.$this_createCallbacks.setText(str);
    }
}
