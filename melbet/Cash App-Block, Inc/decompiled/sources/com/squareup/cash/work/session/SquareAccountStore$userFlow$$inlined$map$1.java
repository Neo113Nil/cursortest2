package com.squareup.cash.work.session;

import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.stripe.android.financialconnections.features.common.SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.ReadonlyStateFlow;

/* loaded from: classes8.dex */
public final class SquareAccountStore$userFlow$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public SquareAccountStore$userFlow$$inlined$map$1(ReadonlyStateFlow readonlyStateFlow) {
        this.$r8$classId = 18;
        SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 = SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1.INSTANCE;
        this.$this_unsafeTransform$inlined = readonlyStateFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 13), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 17), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 18), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 24), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 17), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 20), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = flow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = flow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 28), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 4), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 9), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 12), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 22), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 sharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1 = SharedPartnerAuthKt$SharedPartnerAuth$webAuthFlow$1.INSTANCE;
                Object collect19 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = flow.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 24), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = flow.collect(new DeviceFeatureRequestWorker$run$1$1(flowCollector, 1), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect22 = flow.collect(new DeviceFeatureRequestWorker$run$1$1(flowCollector, 4), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SquareAccountStore$userFlow$$inlined$map$1(Flow flow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
    }
}
