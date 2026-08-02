package com.squareup.cash.ui;

import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1;

/* loaded from: classes.dex */
public final class MainContainerDelegate$special$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealFeatureFlagManager$values$$inlined$map$1 $this_unsafeTransform$inlined;

    public /* synthetic */ MainContainerDelegate$special$$inlined$map$1(RealFeatureFlagManager$values$$inlined$map$1 realFeatureFlagManager$values$$inlined$map$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = realFeatureFlagManager$values$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        RealFeatureFlagManager$values$$inlined$map$1 realFeatureFlagManager$values$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = realFeatureFlagManager$values$$inlined$map$1.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector, 11), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = realFeatureFlagManager$values$$inlined$map$1.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
