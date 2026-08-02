package com.squareup.cash.wallet.views;

import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SafeFlow $this_unsafeTransform$inlined;

    public /* synthetic */ HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(SafeFlow safeFlow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = safeFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        SafeFlow safeFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 18), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 6), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 12), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 13), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 14), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 15), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 16), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 19), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect14 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 21), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
