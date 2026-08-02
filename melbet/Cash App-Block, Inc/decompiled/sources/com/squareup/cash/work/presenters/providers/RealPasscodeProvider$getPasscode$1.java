package com.squareup.cash.work.presenters.providers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.glance.session.SessionWorker$doWork$2$1;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.CardScene$applyIconToMaterial$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.presenters.MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.BackgroundMetadata;
import com.squareup.cash.payments.backend.api.RemotePersonalizedPaymentLoadingState;
import com.squareup.cash.payments.presenters.RealPersonalizePaymentManager;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository$modelFlow$1;
import com.squareup.cash.savings.backend.api.GeneralSavingsError;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.cash.savings.backend.real.PersistentActiveGoalStore;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sharesheet.RealShareableAssetsManager$download$lambda$0$$inlined$map$1;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider;
import com.squareup.cash.tabprovider.real.RealLocalTabProvider$showLocal$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.web.TaxWebAppBridge$openTakePhoto$1$1;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardCustomizationError;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.applets.presenters.ShiftsTileState;
import com.squareup.cash.work.data.api.PayDataState;
import com.squareup.cash.work.data.api.ShiftDataState;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealGetClockInEssentialsUseCase;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealShiftDataLoader;
import com.squareup.cash.work.data.real.ShiftLoaderContext;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.service.api.SquareMerchantToken;
import com.squareup.cash.work.service.api.passcode.GetPasscodeRequest;
import com.squareup.cash.work.service.api.passcode.PasscodeService;
import com.squareup.cash.work.tinygraph.BaseRepositoryKt;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.MembershipProperties;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardRenderingInfo;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.stripe.android.financialconnections.utils.FlowsKt$get$1;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPasscodeProvider$getPasscode$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPasscodeProvider$getPasscode$1(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$1 = new RealPasscodeProvider$getPasscode$1((RealPasscodeProvider) obj4, (Continuation) obj3, 0);
                realPasscodeProvider$getPasscode$1.L$0 = (String) obj;
                realPasscodeProvider$getPasscode$1.L$1 = (MerchantIdentifier) obj2;
                return realPasscodeProvider$getPasscode$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$12 = new RealPasscodeProvider$getPasscode$1((RealPersonalizePaymentManager) obj4, (Continuation) obj3, 1);
                realPasscodeProvider$getPasscode$12.L$0 = (RemotePersonalizedPaymentLoadingState) obj;
                realPasscodeProvider$getPasscode$12.L$1 = (List) obj2;
                return realPasscodeProvider$getPasscode$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$13 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (ProfilePrivacyPresenter) obj4, 2);
                realPasscodeProvider$getPasscode$13.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$13.L$1 = obj2;
                return realPasscodeProvider$getPasscode$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$14 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (TabToolbarPresenter) obj4, 3);
                realPasscodeProvider$getPasscode$14.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$14.L$1 = obj2;
                return realPasscodeProvider$getPasscode$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$15 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealRecipientRepository) obj4, 4);
                realPasscodeProvider$getPasscode$15.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$15.L$1 = obj2;
                return realPasscodeProvider$getPasscode$15.invokeSuspend(Unit.INSTANCE);
            case 5:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$16 = new RealPasscodeProvider$getPasscode$1((RealSavingsAppletTileRepository) obj4, (Continuation) obj3, 5);
                realPasscodeProvider$getPasscode$16.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$16.L$1 = (Throwable) obj2;
                return realPasscodeProvider$getPasscode$16.invokeSuspend(Unit.INSTANCE);
            case 6:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$17 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealSavingsAppletTileRepository) obj4, 6);
                realPasscodeProvider$getPasscode$17.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$17.L$1 = obj2;
                return realPasscodeProvider$getPasscode$17.invokeSuspend(Unit.INSTANCE);
            case 7:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$18 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (PersistentActiveGoalStore) obj4, 7);
                realPasscodeProvider$getPasscode$18.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$18.L$1 = obj2;
                return realPasscodeProvider$getPasscode$18.invokeSuspend(Unit.INSTANCE);
            case 8:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$19 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (HCaptcha) obj4, 8);
                realPasscodeProvider$getPasscode$19.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$19.L$1 = obj2;
                return realPasscodeProvider$getPasscode$19.invokeSuspend(Unit.INSTANCE);
            case 9:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$110 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealLocalTabProvider) obj4, 9);
                realPasscodeProvider$getPasscode$110.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$110.L$1 = obj2;
                return realPasscodeProvider$getPasscode$110.invokeSuspend(Unit.INSTANCE);
            case 10:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$111 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (MarkwonConfiguration) obj4, 10);
                realPasscodeProvider$getPasscode$111.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$111.L$1 = obj2;
                return realPasscodeProvider$getPasscode$111.invokeSuspend(Unit.INSTANCE);
            case 11:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$112 = new RealPasscodeProvider$getPasscode$1((RealBalanceBasedAddCashManager) obj4, (Continuation) obj3, 11);
                realPasscodeProvider$getPasscode$112.L$0 = (BalanceBasedAddCashPreference) obj;
                realPasscodeProvider$getPasscode$112.L$1 = (BalanceBasedAddCashPreference) obj2;
                return realPasscodeProvider$getPasscode$112.invokeSuspend(Unit.INSTANCE);
            case 12:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$113 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealTransfersWithdrawManager) obj4, 12);
                realPasscodeProvider$getPasscode$113.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$113.L$1 = obj2;
                return realPasscodeProvider$getPasscode$113.invokeSuspend(Unit.INSTANCE);
            case 13:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$114 = new RealPasscodeProvider$getPasscode$1((RealCardCustomizationRepository) obj4, (Continuation) obj3, 13);
                realPasscodeProvider$getPasscode$114.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$114.L$1 = (Throwable) obj2;
                return realPasscodeProvider$getPasscode$114.invokeSuspend(Unit.INSTANCE);
            case 14:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$115 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealCardCustomizationRepository) obj4, 14);
                realPasscodeProvider$getPasscode$115.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$115.L$1 = obj2;
                return realPasscodeProvider$getPasscode$115.invokeSuspend(Unit.INSTANCE);
            case 15:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$116 = new RealPasscodeProvider$getPasscode$1((RealShiftsTileDataLoader) obj4, (Continuation) obj3, 15);
                realPasscodeProvider$getPasscode$116.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$116.L$1 = (Throwable) obj2;
                return realPasscodeProvider$getPasscode$116.invokeSuspend(Unit.INSTANCE);
            case 16:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$117 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealShiftsTileDataLoader) obj4, 16);
                realPasscodeProvider$getPasscode$117.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$117.L$1 = obj2;
                return realPasscodeProvider$getPasscode$117.invokeSuspend(Unit.INSTANCE);
            case 17:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$118 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealAssignedJobProvider) obj4, 17);
                realPasscodeProvider$getPasscode$118.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$118.L$1 = obj2;
                return realPasscodeProvider$getPasscode$118.invokeSuspend(Unit.INSTANCE);
            case 18:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$119 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealBrandDetailsDataLoader) obj4, 18);
                realPasscodeProvider$getPasscode$119.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$119.L$1 = obj2;
                return realPasscodeProvider$getPasscode$119.invokeSuspend(Unit.INSTANCE);
            case 19:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$120 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealClockInEssentialsProvider) obj4, 19);
                realPasscodeProvider$getPasscode$120.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$120.L$1 = obj2;
                return realPasscodeProvider$getPasscode$120.invokeSuspend(Unit.INSTANCE);
            case 20:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$121 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealDashboardScheduleProvider) obj4, 20);
                realPasscodeProvider$getPasscode$121.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$121.L$1 = obj2;
                return realPasscodeProvider$getPasscode$121.invokeSuspend(Unit.INSTANCE);
            case 21:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$122 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealPayDataLoader) obj4, 21);
                realPasscodeProvider$getPasscode$122.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$122.L$1 = obj2;
                return realPasscodeProvider$getPasscode$122.invokeSuspend(Unit.INSTANCE);
            case 22:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$123 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealShiftDataLoader) obj4, 22);
                realPasscodeProvider$getPasscode$123.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$123.L$1 = obj2;
                return realPasscodeProvider$getPasscode$123.invokeSuspend(Unit.INSTANCE);
            case 23:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$124 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, (RealAssignedLocationProvider) obj4, 23);
                realPasscodeProvider$getPasscode$124.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$124.L$1 = obj2;
                return realPasscodeProvider$getPasscode$124.invokeSuspend(Unit.INSTANCE);
            default:
                RealPasscodeProvider$getPasscode$1 realPasscodeProvider$getPasscode$125 = new RealPasscodeProvider$getPasscode$1((Continuation) obj3, obj4, 24);
                realPasscodeProvider$getPasscode$125.L$0 = (FlowCollector) obj;
                realPasscodeProvider$getPasscode$125.L$1 = (Object[]) obj2;
                return realPasscodeProvider$getPasscode$125.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[LOOP:2: B:167:0x038a->B:191:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x057e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object passcode;
        Object first;
        Object obj2;
        String str;
        Image image;
        List list;
        Flow appLockMonitor$special$$inlined$map$2;
        Flow combine;
        Flow flow;
        CardModule.HeroIssuedCardModule heroIssuedCardModule;
        CardRenderingInfo cardRenderingInfo;
        Flow transformLatest;
        int i = this.$r8$classId;
        int i2 = 21;
        int i3 = 15;
        int i4 = 18;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        int i5 = 10;
        int i6 = 4;
        int i7 = 8;
        int i8 = 2;
        int i9 = 19;
        final int i10 = 0;
        Object obj3 = this.this$0;
        final int i11 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        switch (i) {
            case 0:
                String str2 = (String) this.L$0;
                MerchantIdentifier merchantIdentifier = (MerchantIdentifier) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str2 != null && merchantIdentifier != null) {
                        GetPasscodeRequest getPasscodeRequest = new GetPasscodeRequest(str2);
                        SquareMerchantToken squareMerchantToken = new SquareMerchantToken(merchantIdentifier.token);
                        PasscodeService passcodeService = ((RealPasscodeProvider) obj3).passcodeService;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        passcode = passcodeService.getPasscode(getPasscodeRequest, squareMerchantToken, this);
                        if (passcode == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    passcode = obj;
                }
                ApiResult apiResult = (ApiResult) passcode;
                if (apiResult instanceof ApiResult.Success) {
                    break;
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 1:
                RemotePersonalizedPaymentLoadingState remotePersonalizedPaymentLoadingState = (RemotePersonalizedPaymentLoadingState) this.L$0;
                List list2 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (remotePersonalizedPaymentLoadingState instanceof RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment) {
                        RealRecipientRepository realRecipientRepository = ((RealPersonalizePaymentManager) obj3).recipientRepository;
                        String str3 = ((RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment) remotePersonalizedPaymentLoadingState).senderCustomerToken;
                        this.L$0 = remotePersonalizedPaymentLoadingState;
                        this.L$1 = list2;
                        this.label = 1;
                        first = FlowKt.first(realRecipientRepository.customerStore.getCustomerForId(str3), this);
                        if (first == coroutineSingletons2) {
                            break;
                        }
                    } else if (remotePersonalizedPaymentLoadingState instanceof RemotePersonalizedPaymentLoadingState.ErrorLoadingPersonalizedPayment) {
                        break;
                    } else if (remotePersonalizedPaymentLoadingState instanceof RemotePersonalizedPaymentLoadingState.LoadingPersonalizedPayment) {
                        break;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                Recipient recipient = (Recipient) first;
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        String str4 = ((BackgroundMetadata) obj2).id;
                        Personalization personalization = ((RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment) remotePersonalizedPaymentLoadingState).personalization;
                        String str5 = personalization != null ? personalization.selected_background_id : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (str4.equals(str5)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                BackgroundMetadata backgroundMetadata = (BackgroundMetadata) obj2;
                RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment locallyStoredPersonalizedPayment = (RemotePersonalizedPaymentLoadingState.LocallyStoredPersonalizedPayment) remotePersonalizedPaymentLoadingState;
                Money money = locallyStoredPersonalizedPayment.amount;
                if (recipient == null || (str = recipient.fullName) == null) {
                    str = locallyStoredPersonalizedPayment.senderFullName;
                }
                String str6 = str;
                if (recipient == null || (image = recipient.photo) == null) {
                    image = locallyStoredPersonalizedPayment.senderPhoto;
                }
                Recipient recipient2 = new Recipient(null, false, false, null, null, null, false, false, false, null, null, image, null, null, false, 0L, null, null, false, null, null, null, null, null, str6, null, null, null, false, null, false, false, null, null, -16779265, 63);
                Background access$toBackground = backgroundMetadata != null ? zzaho.access$toBackground(backgroundMetadata) : null;
                Personalization personalization2 = locallyStoredPersonalizedPayment.personalization;
                if (personalization2 == null || (list = personalization2.elements) == null) {
                    list = EmptyList.INSTANCE;
                }
                List list3 = list;
                String str7 = locallyStoredPersonalizedPayment.note;
                boolean z12 = locallyStoredPersonalizedPayment.isSender;
                ReactionsData reactionsData = locallyStoredPersonalizedPayment.reactionsData;
                com.squareup.cash.mosaic.personalization.api.v2.Personalization personalization3 = locallyStoredPersonalizedPayment.personalizationPayload;
                break;
            case 2:
                ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) obj3;
                ModifiablePermissions modifiablePermissions = profilePrivacyPresenter.readContactsPermissions;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object obj4 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    modifiablePermissions.request();
                    long millis = profilePrivacyPresenter.clock.millis();
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(FlowKt.merge(new CashQrScannerPresenter$special$$inlined$filter$1(modifiablePermissions.denied(), i7), new CashQrScannerPresenter$special$$inlined$filter$1(modifiablePermissions.granted(), 7)), 1);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector);
                    Object collect = take.collect(new MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1.AnonymousClass2(flowCollector, profilePrivacyPresenter, millis, 1), this);
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons3) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) obj3;
                ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) tabToolbarPresenter.badges;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                Object obj5 = this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    modifiablePermissions2.request();
                    long millis2 = ((AndroidClock) tabToolbarPresenter.sessionFlags).millis();
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take2 = FlowKt.take(FlowKt.merge(new CashQrScannerPresenter$special$$inlined$filter$1(modifiablePermissions2.denied(), 17), new CashQrScannerPresenter$special$$inlined$filter$1(modifiablePermissions2.granted(), r5)), 1);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector2);
                    Object collect2 = take2.collect(new MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1.AnonymousClass2(flowCollector2, tabToolbarPresenter, millis2, 2), this);
                    if (collect2 != coroutineSingletons4) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons4) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 == coroutineSingletons4) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                RealRecipientRepository realRecipientRepository2 = (RealRecipientRepository) obj3;
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                Object obj6 = this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest transformLatest2 = FlowKt.transformLatest(realRecipientRepository2.favoritesRepository.getFavorites(), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) (z ? 1 : 0), (Object) realRecipientRepository2, obj6, 23));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector3, transformLatest2, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                Throwable th = (Throwable) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((RealSavingsAppletTileRepository) obj3).errorReporter.report(new GeneralSavingsError("Error loading savings applet", th), defaultSamplingStrategy);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector4.emit(null, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                FlowCollector flowCollector5 = (FlowCollector) this.L$0;
                Object obj7 = this.L$1;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SavingsApplet savingsApplet = (SavingsApplet) obj7;
                    if (savingsApplet == null || !savingsApplet.visible) {
                        appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(z2 ? 1 : 0, i9);
                    } else {
                        RealSavingsAppletTileRepository realSavingsAppletTileRepository = (RealSavingsAppletTileRepository) obj3;
                        appLockMonitor$special$$inlined$map$2 = FlowKt.combine(realSavingsAppletTileRepository.savingsBalanceState, realSavingsAppletTileRepository.allFolders, realSavingsAppletTileRepository.savingsConfigState, realSavingsAppletTileRepository.isC4BAccountFlow, new RealSavingsAppletTileRepository$modelFlow$1(savingsApplet, realSavingsAppletTileRepository, null));
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector5, appLockMonitor$special$$inlined$map$2, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                PersistentActiveGoalStore persistentActiveGoalStore = (PersistentActiveGoalStore) obj3;
                FlowCollector flowCollector6 = (FlowCollector) this.L$0;
                Object obj8 = this.L$1;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj9 : (List) obj8) {
                        if (obj9 instanceof SavingsFolder.GoalFolder) {
                            arrayList.add(obj9);
                        }
                    }
                    if (arrayList.size() > 1) {
                        persistentActiveGoalStore.errorReporter.report(new GeneralSavingsError("More than one goal found for default V2 goal.", null), defaultSamplingStrategy);
                    }
                    Flow access$buildProviderFlowFromLocalStatus = PersistentActiveGoalStore.access$buildProviderFlowFromLocalStatus(persistentActiveGoalStore, (SavingsFolder.GoalFolder) CollectionsKt.singleOrNull((List) arrayList));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector6, access$buildProviderFlowFromLocalStatus, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                FlowCollector flowCollector7 = (FlowCollector) this.L$0;
                Object obj10 = this.L$1;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str8 = (String) obj10;
                    HCaptcha hCaptcha = (HCaptcha) obj3;
                    str8.getClass();
                    ByteString.Companion companion = ByteString.Companion;
                    String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(ByteString.Companion.encodeUtf8(str8).digest$okio("SHA-256").hex(), ".png");
                    LinkedHashMap linkedHashMap = (LinkedHashMap) hCaptcha.internalConfig;
                    Object obj11 = linkedHashMap.get(str8);
                    Object obj12 = obj11;
                    if (obj11 == null) {
                        ReadonlySharedFlow shareIn = FlowKt.shareIn(FlowKt.flowOn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealShareableAssetsManager$download$lambda$0$$inlined$map$1((Flow) MapsKt__MapsKt.getValue((LinkedHashMap) hCaptcha.captchaVerifier, str8), (Object) hCaptcha, (Object) m$1, (Object) str8, 0), new ProfileCropView.AnonymousClass3(hCaptcha, str8, z3 ? 1 : 0, 17), 3), (CoroutineContext) hCaptcha.onOpenListeners), (CoroutineScope) hCaptcha.handler, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 0);
                        str8 = str8;
                        linkedHashMap.put(str8, shareIn);
                        obj12 = shareIn;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector7);
                    Object collect3 = ((Flow) obj12).collect(new BufferCountKt$bufferSkip$1.AnonymousClass1(flowCollector7, hCaptcha, str8, i6), this);
                    if (collect3 != coroutineSingletons9) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 != coroutineSingletons9) {
                        collect3 = Unit.INSTANCE;
                    }
                    if (collect3 == coroutineSingletons9) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                RealLocalTabProvider realLocalTabProvider = (RealLocalTabProvider) obj3;
                SyncValueReader syncValueReader = realLocalTabProvider.syncValueReader;
                FlowCollector flowCollector8 = (FlowCollector) this.L$0;
                Object obj13 = this.L$1;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FeatureFlag$StringAmplitudeExperiment.Value value = (FeatureFlag$StringAmplitudeExperiment.Value) obj13;
                    String str9 = value.value;
                    int hashCode = str9.hashCode();
                    if (hashCode == -1760914855) {
                        if (str9.equals("data_driven")) {
                            combine = FlowKt.combine(new RealRecipientRepository$suggestions$$inlined$map$1(syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard), 26), syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalAccount), ((RealFeatureFlagManager) realLocalTabProvider.featureFlagManager).peekValues(LaunchDarklyFeatureFlags$GetNeighborhoodsTabContent.INSTANCE), new RealLocalTabProvider$showLocal$1$2(i6, z4 ? 1 : 0, i10));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (FlowKt.emitAll(flowCollector8, combine, this) == coroutineSingletons10) {
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(value, "AmplitudeExperiments.MobileLocalTabVisibility unknown value: ");
                    } else if (hashCode != 464944051) {
                        if (hashCode == 1528363547 && str9.equals("force_off")) {
                            combine = new AppLockMonitor$special$$inlined$map$2(Boolean.FALSE, i9);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (FlowKt.emitAll(flowCollector8, combine, this) == coroutineSingletons10) {
                                break;
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(value, "AmplitudeExperiments.MobileLocalTabVisibility unknown value: ");
                        break;
                    } else {
                        if (str9.equals("force_on")) {
                            combine = new AppLockMonitor$special$$inlined$map$2(Boolean.TRUE, i9);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 1;
                            if (FlowKt.emitAll(flowCollector8, combine, this) == coroutineSingletons10) {
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m$1(value, "AmplitudeExperiments.MobileLocalTabVisibility unknown value: ");
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj3;
                FlowCollector flowCollector9 = (FlowCollector) this.L$0;
                Object obj14 = this.L$1;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj14;
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(i2, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(markwonConfiguration.getTransactions(ziplineHistoryDataJavaScripter, true), markwonConfiguration.getTransactions(ziplineHistoryDataJavaScripter, false), new CardModelView.AnonymousClass1.AnonymousClass4(3, (Continuation) (z6 ? 1 : 0), 17), i10), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Object) markwonConfiguration, (Object) ziplineHistoryDataJavaScripter, (Continuation) (z5 ? 1 : 0), 26));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector9, finishSetupTileBadgeCounter, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) this.L$0;
                BalanceBasedAddCashPreference balanceBasedAddCashPreference2 = (BalanceBasedAddCashPreference) this.L$1;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (balanceBasedAddCashPreference2 == null || !balanceBasedAddCashPreference.state.equals(BalanceBasedAddCashPreference.State.Disabled.INSTANCE)) {
                        if (balanceBasedAddCashPreference2 != null) {
                            break;
                        }
                    } else {
                        StateFlowImpl stateFlowImpl = ((RealBalanceBasedAddCashManager) obj3).cachedOverride;
                        this.L$0 = balanceBasedAddCashPreference;
                        this.L$1 = null;
                        this.label = 1;
                        stateFlowImpl.setValue(null);
                        if (Unit.INSTANCE == coroutineSingletons12) {
                            break;
                        }
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                FlowCollector flowCollector10 = (FlowCollector) this.L$0;
                Object obj15 = this.L$1;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final RealTransfersWithdrawManager realTransfersWithdrawManager = (RealTransfersWithdrawManager) obj3;
                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) obj15).enabled()) {
                        final StateFlow singleValueOrDefault = realTransfersWithdrawManager.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CashOutFeeData, null, new TaxWebAppBridge$$ExternalSyntheticLambda1(i5));
                        flow = new Flow() { // from class: com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector11, Continuation continuation) {
                                int i25 = i11;
                                RealTransfersWithdrawManager realTransfersWithdrawManager2 = realTransfersWithdrawManager;
                                Flow flow2 = singleValueOrDefault;
                                switch (i25) {
                                    case 0:
                                        Object collect4 = flow2.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector11, realTransfersWithdrawManager2), continuation);
                                        if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect5 = flow2.collect(new TaxWebAppBridge$openTakePhoto$1$1(18, flowCollector11, realTransfersWithdrawManager2), continuation);
                                        if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        final Flow select = realTransfersWithdrawManager.p2pSettingsManager.select();
                        flow = new Flow() { // from class: com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager$feeDataFromProfile$$inlined$map$1
                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector11, Continuation continuation) {
                                int i25 = i10;
                                RealTransfersWithdrawManager realTransfersWithdrawManager2 = realTransfersWithdrawManager;
                                Flow flow2 = select;
                                switch (i25) {
                                    case 0:
                                        Object collect4 = flow2.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector11, realTransfersWithdrawManager2), continuation);
                                        if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                    default:
                                        Object collect5 = flow2.collect(new TaxWebAppBridge$openTakePhoto$1$1(18, flowCollector11, realTransfersWithdrawManager2), continuation);
                                        if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                            break;
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector10, flow, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i24 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                FlowCollector flowCollector11 = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((RealCardCustomizationRepository) obj3).errorReporter.report(new CardCustomizationError(th2), defaultSamplingStrategy);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector11.emit(null, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                FlowCollector flowCollector12 = (FlowCollector) this.L$0;
                Object obj16 = this.L$1;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Iterator it2 = ((CardScheme) obj16).modules.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            CardModule.Type type2 = ((CardModule) it2.next()).f1328type;
                            if (type2 != null) {
                                CardModule.Type.HeroIssuedCard heroIssuedCard = type2 instanceof CardModule.Type.HeroIssuedCard ? (CardModule.Type.HeroIssuedCard) type2 : null;
                                if (heroIssuedCard != null) {
                                    heroIssuedCardModule = heroIssuedCard.value;
                                    if (heroIssuedCardModule == null) {
                                    }
                                }
                            }
                            heroIssuedCardModule = null;
                            if (heroIssuedCardModule == null) {
                            }
                        } else {
                            heroIssuedCardModule = null;
                        }
                    }
                    String str10 = (heroIssuedCardModule == null || (cardRenderingInfo = heroIssuedCardModule.card_rendering_info) == null) ? null : cardRenderingInfo.customization_image_path;
                    Flow customizationFor = str10 != null ? ((RealCardCustomizationRepository) obj3).getCustomizationFor(str10) : new AppLockMonitor$special$$inlined$map$2(z7 ? 1 : 0, i9);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector12, customizationFor, this) == coroutineSingletons15) {
                        break;
                    }
                } else if (i26 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                FlowCollector flowCollector13 = (FlowCollector) this.L$0;
                Throwable th3 = (Throwable) this.L$1;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String message = th3.getMessage();
                    if (message == null) {
                        message = "Failed to fetch login essentials";
                    }
                    ShiftsTileState.Error error = new ShiftsTileState.Error(message);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector13.emit(error, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i27 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                FlowCollector flowCollector14 = (FlowCollector) this.L$0;
                Object obj17 = this.L$1;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealShiftsTileDataLoader realShiftsTileDataLoader = (RealShiftsTileDataLoader) obj3;
                    FinishSetupTileBadgeCounter finishSetupTileBadgeCounter2 = new FinishSetupTileBadgeCounter(i2, new SafeFlow(new RoomDatabase$performClear$1.AnonymousClass1(((StateFlow) realShiftsTileDataLoader.tileStateFlow$delegate.getValue()).getValue() instanceof ShiftsTileState.Loading, realShiftsTileDataLoader, (Continuation) null)), new RealPasscodeProvider$getPasscode$1((Object) realShiftsTileDataLoader, (Continuation) (z8 ? 1 : 0), i3));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector14, finishSetupTileBadgeCounter2, this) == coroutineSingletons17) {
                        break;
                    }
                } else if (i28 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 17:
                FlowCollector flowCollector15 = (FlowCollector) this.L$0;
                Object obj18 = this.L$1;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List<Membership> list4 = (List) obj18;
                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                    for (Membership membership : list4) {
                        String str11 = membership.fromReference.id;
                        MembershipProperties membershipProperties = membership.properties;
                        linkedHashMap2.put(str11, membershipProperties != null ? membershipProperties.wage : null);
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((Membership) it3.next()).fromReference.id);
                    }
                    RealJobRepository realJobRepository = ((RealAssignedJobProvider) obj3).jobRepository;
                    SessionWorker$doWork$2$1 sessionWorker$doWork$2$1 = new SessionWorker$doWork$2$1(realJobRepository, arrayList2, z10 ? 1 : 0, i7);
                    TextStreamsKt$$ExternalSyntheticLambda0 textStreamsKt$$ExternalSyntheticLambda0 = new TextStreamsKt$$ExternalSyntheticLambda0(i5, arrayList2);
                    ChannelFlowTransformLatest transformLatest3 = FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(i4, BaseRepositoryKt.toFlow(sessionWorker$doWork$2$1), textStreamsKt$$ExternalSyntheticLambda0), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(z9 ? 1 : 0, (Flow) realJobRepository.data, textStreamsKt$$ExternalSyntheticLambda0, i8));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector15);
                    Object collect4 = transformLatest3.collect(new TakeUntil$collectSafely$2.AnonymousClass1(5, flowCollector15, linkedHashMap2), this);
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (collect4 != coroutineSingletons19) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 != coroutineSingletons19) {
                        collect4 = Unit.INSTANCE;
                    }
                    if (collect4 == coroutineSingletons18) {
                        break;
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 18:
                FlowCollector flowCollector16 = (FlowCollector) this.L$0;
                Object obj19 = this.L$1;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow safeFlow = new SafeFlow(new CardAppletWorker$setup$1$2$1((RealBrandDetailsDataLoader) obj3, (List) obj19, (Continuation) null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector16, safeFlow, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 19:
                FlowCollector flowCollector17 = (FlowCollector) this.L$0;
                Object obj20 = this.L$1;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter essentials = ((RealGetClockInEssentialsUseCase) ((RealClockInEssentialsProvider) obj3).getClockInEssentialsUseCase).getEssentials();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector17, essentials, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                FlowCollector flowCollector18 = (FlowCollector) this.L$0;
                Object obj21 = this.L$1;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Triple triple = (Triple) obj21;
                    SafeFlow safeFlow2 = new SafeFlow(new TakeUntil$collectSafely$2((RealDashboardScheduleProvider) obj3, (String) triple.first, (String) triple.second, (Continuation) null, 14));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector18, safeFlow2, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                FlowCollector flowCollector19 = (FlowCollector) this.L$0;
                Object obj22 = this.L$1;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPayDataLoader.Identity identity = (RealPayDataLoader.Identity) obj22;
                    RealPayDataLoader realPayDataLoader = (RealPayDataLoader) obj3;
                    MerchantIdentifier merchantIdentifier2 = identity.merchantIdentifier;
                    if (merchantIdentifier2 == null) {
                        transformLatest = new AppLockMonitor$special$$inlined$map$2(new PayDataState.Loading(false), i9);
                    } else {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        transformLatest = FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(i3, realPayDataLoader.refreshEvents, atomicBoolean), new PageFetcher$flow$1.AnonymousClass2(realPayDataLoader, merchantIdentifier2, identity, atomicBoolean, null, 4));
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector19, transformLatest, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                RealShiftDataLoader realShiftDataLoader = (RealShiftDataLoader) obj3;
                FlowCollector flowCollector20 = (FlowCollector) this.L$0;
                Object obj23 = this.L$1;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShiftLoaderContext shiftLoaderContext = (ShiftLoaderContext) obj23;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = ShiftDataState.NotReady.INSTANCE;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(i8, z11 ? 1 : 0, i4), realShiftDataLoader.commands);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    FlowKt.ensureActive(flowCollector20);
                    Object collect5 = flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(new ChannelFlowMerge$collectTo$2(flowCollector20, ref$ObjectRef, realShiftDataLoader, shiftLoaderContext, 16), this);
                    if (collect5 != coroutineSingletons24) {
                        collect5 = Unit.INSTANCE;
                    }
                    if (collect5 != coroutineSingletons24) {
                        collect5 = Unit.INSTANCE;
                    }
                    if (collect5 == coroutineSingletons24) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                FlowCollector flowCollector21 = (FlowCollector) this.L$0;
                Object obj24 = this.L$1;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocationRepository realLocationRepository = ((RealAssignedLocationProvider) obj3).locationRepository;
                    List list5 = (List) obj24;
                    LocationStatus locationStatus = LocationStatus.ACTIVE;
                    list5.getClass();
                    Continuation continuation = null;
                    CardScene$applyIconToMaterial$1 cardScene$applyIconToMaterial$1 = new CardScene$applyIconToMaterial$1(realLocationRepository, list5, locationStatus, continuation, 4);
                    HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(i7, list5, locationStatus);
                    ChannelFlowTransformLatest transformLatest4 = FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(20, BaseRepositoryKt.toFlow(cardScene$applyIconToMaterial$1), heroCardViewKt$$ExternalSyntheticLambda0), new FlowExtensionsKt$combine$$inlined$combine$1.AnonymousClass3(continuation, (Flow) realLocationRepository.data, heroCardViewKt$$ExternalSyntheticLambda0, i6));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (FlowKt.emitAll(flowCollector21, transformLatest4, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                FlowCollector flowCollector22 = (FlowCollector) this.L$0;
                Object[] objArr = (Object[]) this.L$1;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Object obj25 = objArr[0];
                    Object obj26 = objArr[1];
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (((FlowsKt$get$1) obj3).invoke(flowCollector22, obj25, obj26, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPasscodeProvider$getPasscode$1(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }
}
