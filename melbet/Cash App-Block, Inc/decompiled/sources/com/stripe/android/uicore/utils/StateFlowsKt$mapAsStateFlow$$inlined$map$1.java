package com.stripe.android.uicore.utils;

import com.squareup.cash.work.tinygraph.BaseRepositoryKt$events$$inlined$filter$1$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class StateFlowsKt$mapAsStateFlow$$inlined$map$1 implements Flow {
    public final /* synthetic */ Function1 $callee$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public /* synthetic */ StateFlowsKt$mapAsStateFlow$$inlined$map$1(Flow flow, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$callee$inlined = function1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$callee$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new BaseRepositoryKt$events$$inlined$filter$1$2(flowCollector, function1, 2), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new BaseRepositoryKt$events$$inlined$filter$1$2(flowCollector, function1, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
