package com.squareup.workflow1.ui;

import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final class TextControllerImpl {
    public final StateFlowImpl _textValue;
    public final FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 onTextChanged;

    public TextControllerImpl(boolean z) {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(Boolean.valueOf(z));
        this._textValue = MutableStateFlow;
        this.onTextChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public String getTextValue() {
        return (String) this._textValue.getValue();
    }

    public void setTextValue(String str) {
        str.getClass();
        StateFlowImpl stateFlowImpl = this._textValue;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, str);
    }

    public void setValue(List list) {
        list.getClass();
        StateFlowImpl stateFlowImpl = this._textValue;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, list);
    }

    public TextControllerImpl(List list) {
        list.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(list);
        this._textValue = MutableStateFlow;
        this.onTextChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public TextControllerImpl(GovernmentIdNfcData governmentIdNfcData) {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(governmentIdNfcData);
        this._textValue = MutableStateFlow;
        this.onTextChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public TextControllerImpl(String str) {
        str.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(str);
        this._textValue = MutableStateFlow;
        this.onTextChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextControllerImpl(Option option) {
        this(r1);
        List listOf;
        if (option == null) {
            listOf = EmptyList.INSTANCE;
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(option);
        }
    }
}
