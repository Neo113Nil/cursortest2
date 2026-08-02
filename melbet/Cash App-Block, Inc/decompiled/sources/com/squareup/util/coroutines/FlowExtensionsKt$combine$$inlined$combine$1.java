package com.squareup.util.coroutines;

import androidx.lifecycle.Lifecycle;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.versioned.Versioned;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader$models$1;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$loadInstruments$1;
import com.squareup.cash.invitations.InviteContactsPresenter$contentModels$1;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$models$1$1$1;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2;
import com.squareup.cash.work.data.real.RealGetClockInControlsUseCase;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt$events$$inlined$filter$1$2;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.cash.work.tinygraph.real.RealJobRepository$getByIds$$inlined$getEntities$2$1;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.coroutines.FlowExtensionsKt$doOnFirst$$inlined$map$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.launchers.PictureLauncherResult;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.CombineKt;
import papa.SafeTrace;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public final class FlowExtensionsKt$combine$$inlined$combine$1 implements Flow {
    public final /* synthetic */ Object $flows$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $transform$inlined$1;

    public /* synthetic */ FlowExtensionsKt$combine$$inlined$combine$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$flows$inlined = obj;
        this.$transform$inlined$1 = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 29;
        int i3 = 19;
        int i4 = 20;
        int i5 = 1;
        int i6 = 3;
        int i7 = 17;
        int i8 = 0;
        Continuation continuation2 = null;
        Object obj = this.$transform$inlined$1;
        Object obj2 = this.$flows$inlined;
        switch (i) {
            case 0:
                Flow[] flowArr = (Flow[]) obj2;
                Object combineInternal = CombineKt.combineInternal(continuation, new Function0(flowArr, i8) { // from class: com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1.2
                    public final /* synthetic */ int $r8$classId;

                    {
                        this.$r8$classId = i8;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.$r8$classId) {
                            case 0:
                                return new Object[6];
                            case 1:
                                return new Object[7];
                            case 2:
                                return new Object[9];
                            default:
                                return new Object[14];
                        }
                    }
                }, new AnonymousClass3(continuation2, (RealInstrumentRowLoader$models$1) obj, i8), flowCollector, flowArr);
                if (combineInternal != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect = ((Transform$special$$inlined$map$1) obj2).collect(new ProfilePresenter$models$lambda$8$$inlined$map$1$2(flowCollector, (String) obj, i8), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect2 = ((ChannelFlowTransformLatest) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(i7, flowCollector, (ToolbarTuckTargets) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect3 = ((FinishSetupTileBadgeCounter) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(i3, flowCollector, (Orientation) obj), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect4 = ((Flow) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(i4, flowCollector, (RealRecipientRepository) obj), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect5 = ((FlowQuery$mapToList$$inlined$map$1) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(22, flowCollector, (OpenSourceKt$$ExternalSyntheticLambda11) obj), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect6 = ((Flow) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(23, flowCollector, (ErrorPresenter) obj), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect7 = ((FlowQuery$mapToList$$inlined$map$1) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(28, flowCollector, (ShareSheetPresenter) obj), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect8 = ((SafeFlow) obj2).collect(new WirelessProviderListPresenter$models$1$1$1(i2, flowCollector, (RealSheetState) obj), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect9 = ((FlowUtil$createFlow$$inlined$map$1) obj2).collect(new TaxWebAppBridge$openTakePhoto$1$1(12, flowCollector, (TabToolbarPresenter) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect10 = ((Flow) obj2).collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, (RealTapToPayEligibilityProvider) obj), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect11 = ((FlowQuery$mapToList$$inlined$map$1) obj2).collect(new TaxWebAppBridge$openTakePhoto$1$1(i7, flowCollector, (RealScheduledReloadsManager) obj), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect12 = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) obj2).collect(new TaxWebAppBridge$openTakePhoto$1$1(i2, flowCollector, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect13 = ((Flow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(i6, flowCollector, (CardModule.HeroNullStateModule) obj), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect14 = ((ChannelFlowTransformLatest) obj2).collect(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector, (RealGetClockInControlsUseCase) obj, i5), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect15 = ((Flow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(flowCollector, (AtomicBoolean) obj), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect16 = ((FlowExtensionsKt$combine$$inlined$combine$1) obj2).collect(new BaseRepositoryKt$events$$inlined$filter$1$2(flowCollector, (Function1) obj, 0), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect17 = ((Flow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(13, flowCollector, (KClass) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect18 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(14, flowCollector, (TextStreamsKt$$ExternalSyntheticLambda0) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect19 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(15, flowCollector, (StateBindingsKt$$ExternalSyntheticLambda0) obj), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect20 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(16, flowCollector, (HeroCardViewKt$$ExternalSyntheticLambda0) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect21 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(i7, flowCollector, (CardTransitionKt$$ExternalSyntheticLambda4) obj), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect22 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(18, flowCollector, (StripePaymentController$$ExternalSyntheticLambda1) obj), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect23 = ((SafeFlow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(i3, flowCollector, (StateBindingsKt$$ExternalSyntheticLambda0) obj), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect24 = ((Flow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(i4, flowCollector, (Lifecycle.State) obj), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Flow[] flowArr2 = (Flow[]) obj2;
                Object combineInternal2 = CombineKt.combineInternal(continuation, new Function0(flowArr2, i5) { // from class: com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1.2
                    public final /* synthetic */ int $r8$classId;

                    {
                        this.$r8$classId = i5;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.$r8$classId) {
                            case 0:
                                return new Object[6];
                            case 1:
                                return new Object[7];
                            case 2:
                                return new Object[9];
                            default:
                                return new Object[14];
                        }
                    }
                }, new AnonymousClass3(continuation2, (InstrumentSelectionPresenter$loadInstruments$1) obj, 8), flowCollector, flowArr2);
                if (combineInternal2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Flow[] flowArr3 = (Flow[]) obj2;
                Object combineInternal3 = CombineKt.combineInternal(continuation, new Function0(flowArr3, 2) { // from class: com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1.2
                    public final /* synthetic */ int $r8$classId;

                    {
                        this.$r8$classId = i5;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.$r8$classId) {
                            case 0:
                                return new Object[6];
                            case 1:
                                return new Object[7];
                            case 2:
                                return new Object[9];
                            default:
                                return new Object[14];
                        }
                    }
                }, new AnonymousClass3(continuation2, (InviteContactsPresenter$contentModels$1) obj, 9), flowCollector, flowArr3);
                if (combineInternal3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Flow[] flowArr4 = (Flow[]) obj2;
                Object combineInternal4 = CombineKt.combineInternal(continuation, new Function0(flowArr4, i6) { // from class: com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1.2
                    public final /* synthetic */ int $r8$classId;

                    {
                        this.$r8$classId = i6;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (this.$r8$classId) {
                            case 0:
                                return new Object[6];
                            case 1:
                                return new Object[7];
                            case 2:
                                return new Object[9];
                            default:
                                return new Object[14];
                        }
                    }
                }, new AnonymousClass3(continuation2, (Function15) obj, 10), flowCollector, flowArr4);
                if (combineInternal4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect25 = ((Flow) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(25, flowCollector, (KProperty1) obj), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect26 = ((PictureLauncherResult) obj2).collect(new TakeUntil$collectSafely$2.AnonymousClass1(27, flowCollector, (DocumentCameraWorker) obj), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1$3, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass3 extends SuspendLambda implements Function3 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object $transform$inlined;
        public FlowCollector L$0;
        public /* synthetic */ Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Continuation continuation, Object obj, Object obj2, int i) {
            super(3, continuation);
            this.$r8$classId = i;
            this.L$1 = obj;
            this.$transform$inlined = obj2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = this.$r8$classId;
            Object obj4 = this.$transform$inlined;
            FlowCollector flowCollector = (FlowCollector) obj;
            switch (i) {
                case 0:
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3((Continuation) obj3, (RealInstrumentRowLoader$models$1) obj4, 0);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = (Object[]) obj2;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                case 1:
                    AnonymousClass3 anonymousClass32 = new AnonymousClass3((Continuation) obj3, (RealAssignedLocationProvider) this.L$1, (String) obj4, 1);
                    anonymousClass32.L$0 = flowCollector;
                    anonymousClass32.L$2 = obj2;
                    return anonymousClass32.invokeSuspend(Unit.INSTANCE);
                case 2:
                    AnonymousClass3 anonymousClass33 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (TextStreamsKt$$ExternalSyntheticLambda0) obj4, 2);
                    anonymousClass33.L$0 = flowCollector;
                    anonymousClass33.L$2 = obj2;
                    return anonymousClass33.invokeSuspend(Unit.INSTANCE);
                case 3:
                    AnonymousClass3 anonymousClass34 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (StateBindingsKt$$ExternalSyntheticLambda0) obj4, 3);
                    anonymousClass34.L$0 = flowCollector;
                    anonymousClass34.L$2 = obj2;
                    return anonymousClass34.invokeSuspend(Unit.INSTANCE);
                case 4:
                    AnonymousClass3 anonymousClass35 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (HeroCardViewKt$$ExternalSyntheticLambda0) obj4, 4);
                    anonymousClass35.L$0 = flowCollector;
                    anonymousClass35.L$2 = obj2;
                    return anonymousClass35.invokeSuspend(Unit.INSTANCE);
                case 5:
                    AnonymousClass3 anonymousClass36 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (CardTransitionKt$$ExternalSyntheticLambda4) obj4, 5);
                    anonymousClass36.L$0 = flowCollector;
                    anonymousClass36.L$2 = obj2;
                    return anonymousClass36.invokeSuspend(Unit.INSTANCE);
                case 6:
                    AnonymousClass3 anonymousClass37 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (StripePaymentController$$ExternalSyntheticLambda1) obj4, 6);
                    anonymousClass37.L$0 = flowCollector;
                    anonymousClass37.L$2 = obj2;
                    return anonymousClass37.invokeSuspend(Unit.INSTANCE);
                case 7:
                    AnonymousClass3 anonymousClass38 = new AnonymousClass3((Continuation) obj3, (Flow) this.L$1, (StateBindingsKt$$ExternalSyntheticLambda0) obj4, 7);
                    anonymousClass38.L$0 = flowCollector;
                    anonymousClass38.L$2 = obj2;
                    return anonymousClass38.invokeSuspend(Unit.INSTANCE);
                case 8:
                    AnonymousClass3 anonymousClass39 = new AnonymousClass3((Continuation) obj3, (InstrumentSelectionPresenter$loadInstruments$1) obj4, 8);
                    anonymousClass39.L$0 = flowCollector;
                    anonymousClass39.L$1 = (Object[]) obj2;
                    return anonymousClass39.invokeSuspend(Unit.INSTANCE);
                case 9:
                    AnonymousClass3 anonymousClass310 = new AnonymousClass3((Continuation) obj3, (InviteContactsPresenter$contentModels$1) obj4, 9);
                    anonymousClass310.L$0 = flowCollector;
                    anonymousClass310.L$1 = (Object[]) obj2;
                    return anonymousClass310.invokeSuspend(Unit.INSTANCE);
                case 10:
                    AnonymousClass3 anonymousClass311 = new AnonymousClass3((Continuation) obj3, (Function15) obj4, 10);
                    anonymousClass311.L$0 = flowCollector;
                    anonymousClass311.L$1 = (Object[]) obj2;
                    return anonymousClass311.invokeSuspend(Unit.INSTANCE);
                default:
                    AnonymousClass3 anonymousClass312 = new AnonymousClass3((Continuation) obj3, (Function5) obj4, 11);
                    anonymousClass312.L$2 = flowCollector;
                    anonymousClass312.L$1 = (Object[]) obj2;
                    return anonymousClass312.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (r6.emit(r0, r5) == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r0 == r7) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        
            if (r2.emit(r1, r5) == r0) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object invoke;
            FlowCollector flowCollector2;
            Object invoke2;
            FlowCollector flowCollector3;
            Object invokeSuspend;
            Object invoke3;
            FlowCollector flowCollector4;
            FlowCollector flowCollector5;
            Object invoke4;
            AnonymousClass3 anonymousClass3 = this;
            int i = anonymousClass3.$r8$classId;
            int i2 = 10;
            int i3 = 5;
            int i4 = 4;
            int i5 = 0;
            int i6 = 3;
            Object obj2 = anonymousClass3.$transform$inlined;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = anonymousClass3.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = anonymousClass3.L$0;
                        Object[] objArr = (Object[]) anonymousClass3.L$1;
                        Object obj3 = objArr[0];
                        Object obj4 = objArr[1];
                        Object obj5 = objArr[2];
                        Object obj6 = objArr[3];
                        Object obj7 = objArr[4];
                        Object obj8 = objArr[5];
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$2 = flowCollector;
                        anonymousClass3.label = 1;
                        invoke = ((RealInstrumentRowLoader$models$1) obj2).invoke(obj3, obj4, obj5, obj6, obj7, obj8, anonymousClass3);
                        anonymousClass3 = anonymousClass3;
                        if (invoke == coroutineSingletons) {
                        }
                    } else if (i7 == 1) {
                        FlowCollector flowCollector6 = (FlowCollector) anonymousClass3.L$2;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector = flowCollector6;
                        invoke = obj;
                    } else if (i7 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    anonymousClass3.L$0 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.L$2 = null;
                    anonymousClass3.label = 2;
                    if (flowCollector.emit(invoke, anonymousClass3) == coroutineSingletons) {
                    }
                    break;
                case 1:
                    FlowCollector flowCollector7 = anonymousClass3.L$0;
                    Object obj9 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = anonymousClass3.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ChannelFlowTransformLatest memberships$default = RealMembershipRepository.getMemberships$default(((RealAssignedLocationProvider) anonymousClass3.L$1).membershipRepository, EntityType.LOCATION, EntityType.PERSON_WRAPPER, (String) obj2);
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        FlowKt.ensureActive(flowCollector7);
                        Object collect = memberships$default.collect(new RealAssignedJobProvider$getMerchantMemberships$lambda$0$$inlined$map$1$2(new FlowExtensionsKt$doOnFirst$$inlined$map$1.AnonymousClass2(flowCollector7, i2), (MerchantIdentifier) obj9, 1), anonymousClass3);
                        if (collect != coroutineSingletons2) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect != coroutineSingletons2) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect != coroutineSingletons2) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons2) {
                        }
                    } else if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    FlowCollector flowCollector8 = anonymousClass3.L$0;
                    Object obj10 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = anonymousClass3.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$1 = new FlowUtil$createFlow$$inlined$map$1((List) obj10, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (TextStreamsKt$$ExternalSyntheticLambda0) obj2, Reflection.factory.getOrCreateKotlinClass(Job.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, i5));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector8, flowUtil$createFlow$$inlined$map$1, anonymousClass3) == coroutineSingletons3) {
                        }
                    } else if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    FlowCollector flowCollector9 = anonymousClass3.L$0;
                    Object obj11 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = anonymousClass3.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$12 = new FlowUtil$createFlow$$inlined$map$1((List) obj11, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (StateBindingsKt$$ExternalSyntheticLambda0) obj2, Reflection.factory.getOrCreateKotlinClass(Location.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, 1));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector9, flowUtil$createFlow$$inlined$map$12, anonymousClass3) == coroutineSingletons4) {
                        }
                    } else if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 4:
                    FlowCollector flowCollector10 = anonymousClass3.L$0;
                    Object obj12 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass3.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$13 = new FlowUtil$createFlow$$inlined$map$1((List) obj12, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (HeroCardViewKt$$ExternalSyntheticLambda0) obj2, Reflection.factory.getOrCreateKotlinClass(Location.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, 2));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector10, flowUtil$createFlow$$inlined$map$13, anonymousClass3) == coroutineSingletons5) {
                        }
                    } else if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 5:
                    FlowCollector flowCollector11 = anonymousClass3.L$0;
                    Object obj13 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = anonymousClass3.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$14 = new FlowUtil$createFlow$$inlined$map$1((List) obj13, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (CardTransitionKt$$ExternalSyntheticLambda4) obj2, Reflection.factory.getOrCreateKotlinClass(Membership.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, i6));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector11, flowUtil$createFlow$$inlined$map$14, anonymousClass3) == coroutineSingletons6) {
                        }
                    } else if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 6:
                    FlowCollector flowCollector12 = anonymousClass3.L$0;
                    Object obj14 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = anonymousClass3.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$15 = new FlowUtil$createFlow$$inlined$map$1((List) obj14, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (StripePaymentController$$ExternalSyntheticLambda1) obj2, Reflection.factory.getOrCreateKotlinClass(Merchant.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, i4));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector12, flowUtil$createFlow$$inlined$map$15, anonymousClass3) == coroutineSingletons7) {
                        }
                    } else if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 7:
                    FlowCollector flowCollector13 = anonymousClass3.L$0;
                    Object obj15 = anonymousClass3.L$2;
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = anonymousClass3.label;
                    if (i14 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowUtil$createFlow$$inlined$map$1 flowUtil$createFlow$$inlined$map$16 = new FlowUtil$createFlow$$inlined$map$1((List) obj15, BaseRepositoryKt.events((Flow) anonymousClass3.L$1, (StateBindingsKt$$ExternalSyntheticLambda0) obj2, Reflection.factory.getOrCreateKotlinClass(Setting.class)), new RealJobRepository$getByIds$$inlined$getEntities$2$1(i6, continuation, i3));
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$2 = null;
                        anonymousClass3.label = 1;
                        if (FlowKt.emitAll(flowCollector13, flowUtil$createFlow$$inlined$map$16, anonymousClass3) == coroutineSingletons8) {
                        }
                    } else if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = anonymousClass3.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector2 = anonymousClass3.L$0;
                        Object[] objArr2 = (Object[]) anonymousClass3.L$1;
                        Object obj16 = objArr2[0];
                        Object obj17 = objArr2[1];
                        Object obj18 = objArr2[2];
                        Object obj19 = objArr2[3];
                        Object obj20 = objArr2[4];
                        Object obj21 = objArr2[5];
                        Object obj22 = objArr2[6];
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$2 = flowCollector2;
                        anonymousClass3.label = 1;
                        invoke2 = ((InstrumentSelectionPresenter$loadInstruments$1) obj2).invoke(obj16, obj17, obj18, obj19, obj20, obj21, obj22, anonymousClass3);
                        anonymousClass3 = anonymousClass3;
                        if (invoke2 == coroutineSingletons9) {
                        }
                    } else if (i15 == 1) {
                        FlowCollector flowCollector14 = (FlowCollector) anonymousClass3.L$2;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector2 = flowCollector14;
                        invoke2 = obj;
                    } else if (i15 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    anonymousClass3.L$0 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.L$2 = null;
                    anonymousClass3.label = 2;
                    if (flowCollector2.emit(invoke2, anonymousClass3) == coroutineSingletons9) {
                    }
                    break;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = anonymousClass3.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        flowCollector3 = anonymousClass3.L$0;
                        Object[] objArr3 = (Object[]) anonymousClass3.L$1;
                        Object obj23 = objArr3[0];
                        Object obj24 = objArr3[1];
                        Object obj25 = objArr3[2];
                        Object obj26 = objArr3[3];
                        Object obj27 = objArr3[4];
                        Object obj28 = objArr3[5];
                        Object obj29 = objArr3[6];
                        Object obj30 = objArr3[7];
                        Object obj31 = objArr3[8];
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$2 = flowCollector3;
                        anonymousClass3.label = 1;
                        boolean booleanValue = ((Boolean) obj23).booleanValue();
                        boolean booleanValue2 = ((Boolean) obj31).booleanValue();
                        InviteContactsPresenter$contentModels$1 inviteContactsPresenter$contentModels$1 = new InviteContactsPresenter$contentModels$1(((InviteContactsPresenter$contentModels$1) obj2).this$0, anonymousClass3);
                        inviteContactsPresenter$contentModels$1.Z$0 = booleanValue;
                        inviteContactsPresenter$contentModels$1.L$0 = (List) obj24;
                        inviteContactsPresenter$contentModels$1.L$1 = (Triple) obj25;
                        inviteContactsPresenter$contentModels$1.L$2 = (String) obj26;
                        inviteContactsPresenter$contentModels$1.L$3 = (List) obj27;
                        inviteContactsPresenter$contentModels$1.L$4 = (List) obj28;
                        inviteContactsPresenter$contentModels$1.L$5 = (Versioned) obj29;
                        inviteContactsPresenter$contentModels$1.L$6 = (Versioned) obj30;
                        inviteContactsPresenter$contentModels$1.Z$1 = booleanValue2;
                        invokeSuspend = inviteContactsPresenter$contentModels$1.invokeSuspend(Unit.INSTANCE);
                        if (invokeSuspend == coroutineSingletons10) {
                        }
                    } else if (i16 == 1) {
                        flowCollector3 = (FlowCollector) anonymousClass3.L$2;
                        SafeTrace.throwOnFailure(obj);
                        invokeSuspend = obj;
                    } else if (i16 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    anonymousClass3.L$0 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.L$2 = null;
                    anonymousClass3.label = 2;
                    if (flowCollector3.emit(invokeSuspend, anonymousClass3) == coroutineSingletons10) {
                    }
                    break;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = anonymousClass3.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowCollector flowCollector15 = anonymousClass3.L$0;
                        Object[] objArr4 = (Object[]) anonymousClass3.L$1;
                        Function15 function15 = (Function15) obj2;
                        Object obj32 = objArr4[0];
                        Object obj33 = objArr4[1];
                        Object obj34 = objArr4[2];
                        Object obj35 = objArr4[3];
                        Object obj36 = objArr4[4];
                        Object obj37 = objArr4[5];
                        Object obj38 = objArr4[6];
                        Object obj39 = objArr4[7];
                        Object obj40 = objArr4[8];
                        Object obj41 = objArr4[9];
                        Object obj42 = objArr4[10];
                        Object obj43 = objArr4[11];
                        Object obj44 = objArr4[12];
                        Object obj45 = objArr4[13];
                        anonymousClass3.L$0 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$2 = flowCollector15;
                        anonymousClass3.label = 1;
                        invoke3 = function15.invoke(obj32, obj33, obj34, obj35, obj36, obj37, obj38, obj39, obj40, obj41, obj42, obj43, obj44, obj45, anonymousClass3);
                        anonymousClass3 = anonymousClass3;
                        if (invoke3 != coroutineSingletons11) {
                            flowCollector4 = flowCollector15;
                            flowCollector5 = null;
                        }
                        break;
                    } else if (i17 == 1) {
                        FlowCollector flowCollector16 = (FlowCollector) anonymousClass3.L$2;
                        SafeTrace.throwOnFailure(obj);
                        flowCollector4 = flowCollector16;
                        flowCollector5 = null;
                        invoke3 = obj;
                    } else if (i17 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    anonymousClass3.L$0 = flowCollector5;
                    anonymousClass3.L$1 = flowCollector5;
                    anonymousClass3.L$2 = flowCollector5;
                    anonymousClass3.label = 2;
                    break;
                default:
                    FlowCollector flowCollector17 = (FlowCollector) anonymousClass3.L$2;
                    Object[] objArr5 = (Object[]) anonymousClass3.L$1;
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = anonymousClass3.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Object obj46 = objArr5[0];
                        Object obj47 = objArr5[1];
                        Object obj48 = objArr5[2];
                        Object obj49 = objArr5[3];
                        anonymousClass3.L$2 = null;
                        anonymousClass3.L$1 = null;
                        anonymousClass3.L$0 = flowCollector17;
                        anonymousClass3.label = 1;
                        invoke4 = ((Function5) obj2).invoke(obj46, obj47, obj48, obj49, anonymousClass3);
                        break;
                    } else if (i18 == 1) {
                        flowCollector17 = anonymousClass3.L$0;
                        SafeTrace.throwOnFailure(obj);
                        invoke4 = obj;
                    } else if (i18 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    anonymousClass3.L$2 = null;
                    anonymousClass3.L$1 = null;
                    anonymousClass3.L$0 = null;
                    anonymousClass3.label = 2;
                    break;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass3(Continuation continuation, Function function, int i) {
            super(3, continuation);
            this.$r8$classId = i;
            this.$transform$inlined = function;
        }
    }
}
