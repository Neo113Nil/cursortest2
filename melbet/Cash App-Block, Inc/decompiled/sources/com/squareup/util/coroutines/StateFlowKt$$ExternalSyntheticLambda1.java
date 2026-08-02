package com.squareup.util.coroutines;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final /* synthetic */ class StateFlowKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ StateFlow f$1;

    public /* synthetic */ StateFlowKt$$ExternalSyntheticLambda1(Function1 function1, StateFlow stateFlow, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = stateFlow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StateFlow stateFlow = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
        }
        return function1.invoke(stateFlow.getValue());
    }
}
