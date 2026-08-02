package com.squareup.util.coroutines;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class StateFlowKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ StateFlow f$1;
    public final /* synthetic */ StateFlow f$2;

    public /* synthetic */ StateFlowKt$$ExternalSyntheticLambda4(Function2 function2, StateFlow stateFlow, StateFlow stateFlow2, int i) {
        this.$r8$classId = i;
        this.f$0 = function2;
        this.f$1 = stateFlow;
        this.f$2 = stateFlow2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StateFlow stateFlow = this.f$2;
        StateFlow stateFlow2 = this.f$1;
        Function2 function2 = this.f$0;
        switch (i) {
        }
        return function2.invoke(stateFlow2.getValue(), stateFlow.getValue());
    }
}
