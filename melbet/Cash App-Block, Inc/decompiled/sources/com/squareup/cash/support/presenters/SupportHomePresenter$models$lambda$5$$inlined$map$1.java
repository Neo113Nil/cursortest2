package com.squareup.cash.support.presenters;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics$createMetricsFlow$1;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$special$$inlined$map$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes6.dex */
public final class SupportHomePresenter$models$lambda$5$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 $this_unsafeTransform$inlined;

    public /* synthetic */ SupportHomePresenter$models$lambda$5$$inlined$map$1(FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 27;
        int i3 = 14;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, 21), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 14), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 17), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 22), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealInvestingMetrics$createMetricsFlow$1.AnonymousClass1.C00621(flowCollector, i2), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new MoneyTabPresenter$models$lambda$17$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 1), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new ProfileSecurityPresenter$special$$inlined$map$1$2(flowCollector, 16), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, 12), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect13 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 6), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
