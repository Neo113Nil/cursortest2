package com.squareup.util.coroutines;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class StateFlowKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function3 f$0;
    public final /* synthetic */ StateFlow f$1;
    public final /* synthetic */ StateFlow f$2;
    public final /* synthetic */ StateFlow f$3;

    public /* synthetic */ StateFlowKt$$ExternalSyntheticLambda2(Function3 function3, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, int i) {
        this.$r8$classId = i;
        this.f$0 = function3;
        this.f$1 = stateFlow;
        this.f$2 = stateFlow2;
        this.f$3 = stateFlow3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StateFlow stateFlow = this.f$3;
        StateFlow stateFlow2 = this.f$2;
        StateFlow stateFlow3 = this.f$1;
        Function3 function3 = this.f$0;
        switch (i) {
        }
        return function3.invoke(stateFlow3.getValue(), stateFlow2.getValue(), stateFlow.getValue());
    }
}
