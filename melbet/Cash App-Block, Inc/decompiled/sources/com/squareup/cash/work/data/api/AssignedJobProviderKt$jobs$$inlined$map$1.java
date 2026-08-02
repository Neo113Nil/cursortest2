package com.squareup.cash.work.data.api;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.MembershipStatus;
import com.squareup.protos.wire.roster.mds.Merchant;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AssignedJobProviderKt$jobs$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChannelFlowTransformLatest $this_unsafeTransform$inlined;

    public /* synthetic */ AssignedJobProviderKt$jobs$$inlined$map$1(ChannelFlowTransformLatest channelFlowTransformLatest, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = channelFlowTransformLatest;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        ChannelFlowTransformLatest channelFlowTransformLatest = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = channelFlowTransformLatest.collect(new AnonymousClass2(flowCollector, 26), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = channelFlowTransformLatest.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 3), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = channelFlowTransformLatest.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 11), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = channelFlowTransformLatest.collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, 20), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, RealGetClockInControlsUseCase realGetClockInControlsUseCase) {
            this.$r8$classId = 29;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x02b6  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x02c0  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:252:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x0342  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x0379  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:292:0x03ba  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x03c4  */
        /* JADX WARN: Removed duplicated region for block: B:312:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:318:0x0400  */
        /* JADX WARN: Removed duplicated region for block: B:333:0x0440  */
        /* JADX WARN: Removed duplicated region for block: B:339:0x044a  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x0481  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x048b  */
        /* JADX WARN: Removed duplicated region for block: B:373:0x04c2  */
        /* JADX WARN: Removed duplicated region for block: B:379:0x04cc  */
        /* JADX WARN: Removed duplicated region for block: B:393:0x0503  */
        /* JADX WARN: Removed duplicated region for block: B:399:0x050d  */
        /* JADX WARN: Removed duplicated region for block: B:413:0x0544  */
        /* JADX WARN: Removed duplicated region for block: B:419:0x054e  */
        /* JADX WARN: Removed duplicated region for block: B:433:0x0585  */
        /* JADX WARN: Removed duplicated region for block: B:439:0x058f  */
        /* JADX WARN: Removed duplicated region for block: B:453:0x05c6  */
        /* JADX WARN: Removed duplicated region for block: B:459:0x05d0  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:473:0x0607  */
        /* JADX WARN: Removed duplicated region for block: B:479:0x0611  */
        /* JADX WARN: Removed duplicated region for block: B:493:0x0648  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x0652  */
        /* JADX WARN: Removed duplicated region for block: B:513:0x0689  */
        /* JADX WARN: Removed duplicated region for block: B:519:0x0693  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x06ca  */
        /* JADX WARN: Removed duplicated region for block: B:539:0x06d4  */
        /* JADX WARN: Removed duplicated region for block: B:553:0x070b  */
        /* JADX WARN: Removed duplicated region for block: B:559:0x0715  */
        /* JADX WARN: Removed duplicated region for block: B:573:0x074c  */
        /* JADX WARN: Removed duplicated region for block: B:579:0x0756  */
        /* JADX WARN: Removed duplicated region for block: B:593:0x078d  */
        /* JADX WARN: Removed duplicated region for block: B:599:0x0797  */
        /* JADX WARN: Removed duplicated region for block: B:613:0x07ce  */
        /* JADX WARN: Removed duplicated region for block: B:619:0x07d8  */
        /* JADX WARN: Removed duplicated region for block: B:633:0x080f  */
        /* JADX WARN: Removed duplicated region for block: B:639:0x0819  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            CoreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i2;
            CoreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1;
            int i3;
            CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1;
            int i4;
            CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1 coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1;
            int i5;
            CoreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1;
            int i6;
            CoreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1;
            int i7;
            Hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1;
            int i8;
            Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1;
            int i9;
            Hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1;
            int i10;
            Hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i11;
            Hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1;
            int i12;
            Hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1;
            int i13;
            Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1;
            int i14;
            Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1 hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1;
            int i15;
            Hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1 hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1;
            int i16;
            Hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1 hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1;
            int i17;
            Hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1;
            int i18;
            HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1;
            int i19;
            RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1 revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i20;
            RevolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1 revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i21;
            RevolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1 revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1;
            int i22;
            WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1 walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1;
            int i23;
            WalletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1 walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1;
            int i24;
            RealShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1 realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1;
            int i25;
            RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1 realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1;
            int i26;
            RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1 realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1;
            int i27;
            RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1 realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1;
            int i28;
            RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1 realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1;
            int i29;
            RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1 realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            boolean z = false;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            Bitmap bitmap = null;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i32 = anonymousClass1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((AssignedJob) it.next()).job);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i33 = coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj3 = coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj32 = coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = coreInteractiveCardKt$InteractiveCardEffect$16$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i34 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj4 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                        break;
                                    }
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj42 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = coreInteractiveCardKt$InteractiveCardEffect$16$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i35 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj5 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                        break;
                                    }
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj52 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1) continuation;
                        int i36 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj6 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1) == coroutineSingletons6) {
                                        break;
                                    }
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1(this, continuation);
                    Object obj62 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$filter$2$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i37 = coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj7 = coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons7) {
                                        break;
                                    }
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj72 = coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = coreInteractiveCardKt$InteractiveCardEffect$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1) {
                        coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i38 = coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj8 = coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                if (((Boolean) obj).booleanValue()) {
                                    coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons8) {
                                        break;
                                    }
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj8);
                            }
                            break;
                        }
                    }
                    coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj82 = coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = coreInteractiveCardKt$InteractiveCardEffect$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i39 = hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj9 = hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons9) {
                                        break;
                                    }
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj9);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj92 = hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = hero3DCardViewKt$InteractiveCard$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i40 = hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj10 = hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj10);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons10) {
                                        break;
                                    }
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj10);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj102 = hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = hero3DCardViewKt$InteractiveCard$12$1$4$1$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i41 = hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj11 = hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons11) {
                                        break;
                                    }
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj112 = hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = hero3DCardViewKt$InteractiveCard$12$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i42 = hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj12 = hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons12) {
                                        break;
                                    }
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj12);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj122 = hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = hero3DCardViewKt$InteractiveCard$13$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i11 != 0) {
                    }
                case 11:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i43 = hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj13 = hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons13) {
                                        break;
                                    }
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj13);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj132 = hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = hero3DCardViewKt$InteractiveCard$13$4$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i44 = hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj14 = hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj14);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons14) {
                                        break;
                                    }
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj14);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj142 = hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = hero3DCardViewKt$InteractiveCard$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 13:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i45 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj15 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons15) {
                                        break;
                                    }
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj152 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1) {
                        hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1 = (Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1) continuation;
                        int i46 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj16 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.result;
                            CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj16);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1) == coroutineSingletons16) {
                                        break;
                                    }
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj16);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1 = new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1(this, continuation);
                    Object obj162 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.result;
                    CoroutineSingletons coroutineSingletons162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$filter$2$2$1.label;
                    if (i15 != 0) {
                    }
                case 15:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1 = (Hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i47 = hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj17 = hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                if (((Boolean) obj).booleanValue()) {
                                    hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons17) {
                                        break;
                                    }
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1 = new Hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj172 = hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = hero3DCardViewKt$InteractiveCard$9$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i16 != 0) {
                    }
                case 16:
                    if (continuation instanceof Hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1) {
                        hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1 = (Hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i48 = hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj18 = hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj18);
                                CardSchemeViewModel.Module.CustomizationImage customizationImage = (CardSchemeViewModel.Module.CustomizationImage) obj;
                                if (customizationImage != null) {
                                    byte[] bArr = customizationImage.bytes;
                                    int length = bArr.length;
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inMutable = true;
                                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, length, options);
                                }
                                hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(bitmap, hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons18) {
                                    break;
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj18);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1 = new Hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj182 = hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = hero3DCardViewKt$InteractiveCard$customizationMask$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i17 != 0) {
                    }
                case 17:
                    if (continuation instanceof Hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) {
                        hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 = (Hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) continuation;
                        int i49 = hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj19 = hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                Offset offset = (Offset) obj;
                                if (offset != null) {
                                    hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(offset, hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons19) {
                                        break;
                                    }
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1 = new Hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj192 = hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = hero3DCardViewKt$rotateDragFlow$$inlined$mapNotNull$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 18:
                    if (continuation instanceof HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1) {
                        heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1 = (HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i50 = heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj20 = heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj20);
                                if (((Boolean) obj).booleanValue()) {
                                    heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons20) {
                                        break;
                                    }
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj20);
                            }
                            break;
                        }
                    }
                    heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj202 = heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i19 != 0) {
                    }
                case 19:
                    if (continuation instanceof RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i51 = revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj21 = revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                if (((Boolean) obj).booleanValue()) {
                                    revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons21) {
                                        break;
                                    }
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj21);
                            }
                            break;
                        }
                    }
                    revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj212 = revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i20 != 0) {
                    }
                case 20:
                    if (continuation instanceof RevolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1 = (RevolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i52 = revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj23 = revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj23);
                                if (((Boolean) obj).booleanValue()) {
                                    revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons22) {
                                        break;
                                    }
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj23);
                            }
                            break;
                        }
                    }
                    revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1 = new RevolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj232 = revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons222 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = revolvingInteractiveCardsKt$SwampGLCardContent$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof RevolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1) {
                        revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1 = (RevolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i53 = revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj24 = revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                if (!((Boolean) obj).booleanValue()) {
                                    revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons23) {
                                        break;
                                    }
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1 = new RevolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj242 = revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = revolvingInteractiveCardsKt$collectCrossfadeTransitions$4$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1) {
                        walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1 = (WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i54 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj25 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj25);
                                if (((Boolean) obj).booleanValue()) {
                                    walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons24) {
                                        break;
                                    }
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj25);
                            }
                            break;
                        }
                    }
                    walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1 = new WalletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj252 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons242 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = walletCardSchemeViewKt$HeroPaymentDevicesCarousel$2$5$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof WalletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1) {
                        walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1 = (WalletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i55 = walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj26 = walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                if (((Boolean) obj).booleanValue()) {
                                    walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons25) {
                                        break;
                                    }
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1 = new WalletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj262 = walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = walletHomeViewKt$WalletHome$2$3$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof RealShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1) {
                        realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1 = (RealShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1) continuation;
                        int i56 = realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj28 : (List) obj) {
                                    if (((Membership) obj28).status == MembershipStatus.ACTIVE) {
                                        arrayList2.add(obj28);
                                    }
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    linkedHashSet.add(((Membership) it2.next()).fromReference.id);
                                }
                                realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(linkedHashSet, realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1) == coroutineSingletons26) {
                                    break;
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj27);
                            }
                            break;
                        }
                    }
                    realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1 = new RealShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj272 = realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons262 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = realShiftsTileDataLoader$activeMerchantIdsFlow$$inlined$map$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1) {
                        realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1 = (RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1) continuation;
                        int i57 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                if (!((List) obj).isEmpty()) {
                                    realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons27) {
                                        break;
                                    }
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj29);
                            }
                            break;
                        }
                    }
                    realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1 = new RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1(this, continuation);
                    Object obj292 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$filter$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1) {
                        realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1 = (RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                        int i58 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj30 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it3 = ((List) obj).iterator();
                                while (it3.hasNext()) {
                                    Merchant merchant = (Merchant) ((com.squareup.cash.work.tinygraph.models.Merchant) it3.next()).protoModel$delegate.getValue();
                                    String str = merchant != null ? merchant.token : null;
                                    if (str != null) {
                                        arrayList3.add(str);
                                    }
                                }
                                realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList3, realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons28) {
                                    break;
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1 = new RealBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj302 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realBrandDetailsDataLoader$state_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if (i27 != 0) {
                    }
                case 27:
                    if (continuation instanceof RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1) {
                        realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1 = (RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
                        int i59 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj31 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) obj;
                                if (merchantIdentifier != null) {
                                    realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(merchantIdentifier, realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1) == coroutineSingletons29) {
                                        break;
                                    }
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj31);
                            }
                            break;
                        }
                    }
                    realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1 = new RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj312 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 28:
                    if (continuation instanceof RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1) {
                        realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1 = (RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1) continuation;
                        int i60 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj33 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.result;
                            CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                String str2 = (String) obj;
                                if (str2 != null) {
                                    realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.label = 1;
                                    if (flowCollector.emit(str2, realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1) == coroutineSingletons30) {
                                        break;
                                    }
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1 = new RealDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1(this, continuation);
                    Object obj332 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.result;
                    CoroutineSingletons coroutineSingletons302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = realDashboardScheduleProvider$upcomingSchedules_delegate$lambda$0$$inlined$mapNotNull$2$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1) {
                        realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1 = (RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1) continuation;
                        int i61 = realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj34 = realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                Membership membership = (Membership) obj;
                                if (membership != null) {
                                    Set set = RealGetClockInControlsUseCase.END_BREAK_EARLY_PERMISSIONS;
                                    List list2 = membership.permissions;
                                    if (list2 != null) {
                                        List list3 = list2;
                                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                            Iterator it4 = list3.iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    if (RealGetClockInControlsUseCase.END_BREAK_EARLY_PERMISSIONS.contains((String) it4.next())) {
                                                        z = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Boolean valueOf = Boolean.valueOf(z);
                                realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1) == coroutineSingletons31) {
                                    break;
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj34);
                            }
                            break;
                        }
                    }
                    realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1 = new RealGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1(this, continuation);
                    Object obj342 = realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = realGetClockInControlsUseCase$getOverridePermission$$inlined$map$1$2$1.label;
                    if (i30 != 0) {
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
