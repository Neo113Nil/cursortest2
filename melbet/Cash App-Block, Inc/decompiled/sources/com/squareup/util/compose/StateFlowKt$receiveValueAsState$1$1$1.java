package com.squareup.util.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.investing.backend.api.PolledData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes6.dex */
public final class StateFlowKt$receiveValueAsState$1$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef $state;

    public /* synthetic */ StateFlowKt$receiveValueAsState$1$1$1(int i, Ref$ObjectRef ref$ObjectRef) {
        this.$r8$classId = i;
        this.$state = ref$ObjectRef;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Ref$ObjectRef ref$ObjectRef = this.$state;
        switch (i) {
            case 0:
                MutableState mutableState = (MutableState) ref$ObjectRef.element;
                if (mutableState == null) {
                    ref$ObjectRef.element = Updater.mutableStateOf$default(obj);
                } else {
                    mutableState.setValue(obj);
                }
                return Unit.INSTANCE;
            case 1:
                ((StateFlowImpl) ((MutableStateFlow) ref$ObjectRef.element)).setValue((PolledData) obj);
                return Unit.INSTANCE;
            default:
                ref$ObjectRef.element = obj;
                throw new AbortFlowException(this);
        }
    }
}
