package com.squareup.cash.ui.gcm;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.text.TextUtilsCompat;
import androidx.emoji2.text.EmojiExclusions;
import androidx.glance.layout.SizeModifiersKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.EquatableBitmap$Companion$toEquatable$2;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberStart;
import com.squareup.cash.cdf.pushnotification.PushNotificationConfirmComplete;
import com.squareup.cash.cdf.pushnotification.PushNotificationConfirmReceiveError;
import com.squareup.cash.cdf.pushnotification.PushNotificationConfirmViewBlocker;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.payments.presenters.NearbyPayRequestPresenter$models$10$1$1$1;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$2$2;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.profile.presenters.RealGenericProfileElementsPresenter;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.recipients.data.Section;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.real.RealRecentSearchManager;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.presenters.BrandsSearchPresenter;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel;
import com.squareup.cash.support.backend.api.RecentlyViewedNode;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.ArticlesService$AllArticlesResult;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.supportarticles.app.v1.ListSupportArticlesResponse;
import com.squareup.cash.supportarticles.app.v1.RecommendSupportArticlesResponse;
import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.cash.supportarticles.app.v1.SupportLink;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toCardUpsellModule$1$content$2$1$4;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$13$1$1$3;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$models$1$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption;
import com.squareup.protos.franklin.lending.SelectPaymentPlanBlockerSubmitResponse;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import com.stripe.android.financialconnections.utils.PollingReachedMaxRetriesException;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class NotificationActionService$onHandleIntent$1 extends SuspendLambda implements Function2 {
    public Object $channelId;
    public /* synthetic */ Object $detailsIntent;
    public final /* synthetic */ Object $intent;
    public Object $paymentToken;
    public final /* synthetic */ int $r8$classId;
    public Object $request;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionService$onHandleIntent$1(SelectPaymentPlanBlockerPresenter selectPaymentPlanBlockerPresenter, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 7;
        this.this$0 = selectPaymentPlanBlockerPresenter;
        this.$channelId = str;
        this.$request = mutableState;
        this.$paymentToken = mutableState2;
        this.$detailsIntent = mutableState3;
        this.$intent = mutableState4;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$16$1$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda1((State) this.$request, 7)), 25);
            Hero3DCardViewKt$InteractiveCard$13$1$1$3 hero3DCardViewKt$InteractiveCard$13$1$1$3 = new Hero3DCardViewKt$InteractiveCard$13$1$1$3((MutableSharedFlow) this.$channelId, (PlatformHapticFeedback) this.$paymentToken, coroutineScope, (Animatable) this.$detailsIntent, (MutableState) this.$intent, null, 1);
            this.this$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(swipeableState$special$$inlined$filter$1, hero3DCardViewKt$InteractiveCard$13$1$1$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$wallet$views$Hero3DCardViewKt$InteractiveCard$13$1$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(7, (MutableState) this.$request)), 5);
            Hero3DCardViewKt$InteractiveCard$13$1$1$3 hero3DCardViewKt$InteractiveCard$13$1$1$3 = new Hero3DCardViewKt$InteractiveCard$13$1$1$3((MutableSharedFlow) this.$channelId, (PlatformHapticFeedback) this.$paymentToken, coroutineScope, (Animatable) this.$detailsIntent, (MutableState) this.$intent, null, 0);
            this.this$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, hero3DCardViewKt$InteractiveCard$13$1$1$3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$work$presenters$shift$ShiftNotePresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$request;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (PdfPreviewPresenter) this.$channelId, (CoroutineScope) this.$paymentToken, (State) this.$detailsIntent, (MutableState) this.$intent, 17);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$work$presenters$shift$TakeBreakBottomSheetPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.$request;
            ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope, (PdfPreviewPresenter) this.$channelId, (AskedQuestion) this.$paymentToken, (CoroutineScope) this.$detailsIntent, (State) this.$intent, 18);
            this.this$0 = null;
            this.label = 1;
            if (flow.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r11, r19) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (((kotlinx.coroutines.channels.ProducerCoroutine) r4)._channel.send(r0, r19) == r5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r0 == r5) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c0 -> B:10:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d3 -> B:8:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$stripe$android$financialconnections$utils$ErrorsKt$retryOnException$2(Object obj) {
        Ref$IntRef ref$IntRef;
        Ref$IntRef ref$IntRef2;
        Object failure;
        Throwable m4120exceptionOrNullimpl;
        Object invoke;
        PollTimingOptions pollTimingOptions = (PollTimingOptions) this.$paymentToken;
        int i = pollTimingOptions.maxNumberOfRetries;
        ProducerScope producerScope = (ProducerScope) this.$channelId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = i - 1;
            if (((ProducerCoroutine) producerScope)._channel.isClosedForSend()) {
            }
        } else {
            if (i2 == 1) {
                ref$IntRef = (Ref$IntRef) this.this$0;
                SafeTrace.throwOnFailure(obj);
                ref$IntRef2 = ref$IntRef;
                Function1 function1 = (Function1) this.$detailsIntent;
                Result.Companion companion = Result.Companion;
                this.$channelId = producerScope;
                this.this$0 = ref$IntRef2;
                this.label = 2;
                failure = function1.invoke(this);
                if (failure == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Result.Companion companion2 = Result.Companion;
                Function2 function2 = (Function2) this.$intent;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                }
                return coroutineSingletons;
            }
            if (i2 == 2) {
                ref$IntRef2 = (Ref$IntRef) this.this$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                    failure = obj;
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Result.Companion companion22 = Result.Companion;
                Function2 function22 = (Function2) this.$intent;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                    this.$channelId = producerScope;
                    this.this$0 = ref$IntRef2;
                    this.$request = null;
                    this.label = 3;
                } else {
                    if (ref$IntRef2.element == 0) {
                        throw new PollingReachedMaxRetriesException(EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 11, null, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "reached max number of retries ", "."), null);
                    }
                    this.$channelId = producerScope;
                    this.this$0 = ref$IntRef2;
                    this.$request = m4120exceptionOrNullimpl;
                    this.label = 4;
                    invoke = function22.invoke(m4120exceptionOrNullimpl, this);
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                ref$IntRef = (Ref$IntRef) this.this$0;
                SafeTrace.throwOnFailure(obj);
                ref$IntRef.element--;
                if (((ProducerCoroutine) producerScope)._channel.isClosedForSend()) {
                }
            } else {
                if (i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.$request;
                ref$IntRef2 = (Ref$IntRef) this.this$0;
                SafeTrace.throwOnFailure(obj);
                m4120exceptionOrNullimpl = th2;
                invoke = obj;
                if (!((Boolean) invoke).booleanValue()) {
                    throw m4120exceptionOrNullimpl;
                }
                ref$IntRef = ref$IntRef2;
                ref$IntRef.element--;
                if (((ProducerCoroutine) producerScope)._channel.isClosedForSend()) {
                    return Unit.INSTANCE;
                }
                long j = ref$IntRef.element == i + (-1) ? pollTimingOptions.initialDelayMs : pollTimingOptions.retryInterval;
                this.$channelId = producerScope;
                this.this$0 = ref$IntRef;
                this.$request = null;
                this.label = 1;
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$intent;
        switch (i) {
            case 0:
                return new NotificationActionService$onHandleIntent$1((NotificationActionService) this.this$0, (ConfirmPaymentRequest) this.$request, (String) this.$channelId, (String) this.$paymentToken, (Intent) this.$detailsIntent, (Intent) obj2, continuation, 0);
            case 1:
                return new NotificationActionService$onHandleIntent$1((PoolsListPresenter) this.$detailsIntent, (MutableState) obj2, continuation, 1);
            case 2:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$1 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (PdfPreviewPresenter) this.$channelId, (State) this.$paymentToken, (MutableState) this.$detailsIntent, (ParcelableSnapshotMutableIntState) obj2, 2);
                notificationActionService$onHandleIntent$1.this$0 = obj;
                return notificationActionService$onHandleIntent$1;
            case 3:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$12 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (RealGenericProfileElementsPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (State) obj2, 3);
                notificationActionService$onHandleIntent$12.this$0 = obj;
                return notificationActionService$onHandleIntent$12;
            case 4:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$13 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (TransfersPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 4);
                notificationActionService$onHandleIntent$13.this$0 = obj;
                return notificationActionService$onHandleIntent$13;
            case 5:
                return new NotificationActionService$onHandleIntent$1((ChannelListPresenter) this.this$0, (ChannelListViewEvent) this.$request, (String) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, continuation, 5);
            case 6:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$14 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (PdfPreviewPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 6);
                notificationActionService$onHandleIntent$14.this$0 = obj;
                return notificationActionService$onHandleIntent$14;
            case 7:
                return new NotificationActionService$onHandleIntent$1((SelectPaymentPlanBlockerPresenter) this.this$0, (String) this.$channelId, (MutableState) this.$request, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, continuation);
            case 8:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$15 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (LocalEditorialPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 8);
                notificationActionService$onHandleIntent$15.this$0 = obj;
                return notificationActionService$onHandleIntent$15;
            case 9:
                return new NotificationActionService$onHandleIntent$1((BrandsSearchPresenter) this.$detailsIntent, (MutableState) obj2, continuation, 9);
            case 10:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$16 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (RealShoppingJavascriptPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 10);
                notificationActionService$onHandleIntent$16.this$0 = obj;
                return notificationActionService$onHandleIntent$16;
            case 11:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$17 = new NotificationActionService$onHandleIntent$1((RealArticlesService) obj2, (String) this.$channelId, (String) this.$paymentToken, continuation);
                notificationActionService$onHandleIntent$17.$detailsIntent = obj;
                return notificationActionService$onHandleIntent$17;
            case 12:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$18 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (PdfPreviewPresenter) this.$channelId, (State) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 12);
                notificationActionService$onHandleIntent$18.this$0 = obj;
                return notificationActionService$onHandleIntent$18;
            case 13:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$19 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (SupportSearchPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableSharedFlow) this.$detailsIntent, (MutableState) obj2, 13);
                notificationActionService$onHandleIntent$19.this$0 = obj;
                return notificationActionService$onHandleIntent$19;
            case 14:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$110 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (LocalEditorialPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 14);
                notificationActionService$onHandleIntent$110.this$0 = obj;
                return notificationActionService$onHandleIntent$110;
            case 15:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$111 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (CardLockPresenter) this.$channelId, (TapToPayPaymentData) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 15);
                notificationActionService$onHandleIntent$111.this$0 = obj;
                return notificationActionService$onHandleIntent$111;
            case 16:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$112 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (InstrumentDetailsPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, 16);
                notificationActionService$onHandleIntent$112.this$0 = obj;
                return notificationActionService$onHandleIntent$112;
            case 17:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$113 = new NotificationActionService$onHandleIntent$1((Money) this.$request, (WithdrawViewModel.DepositPreferenceOption) this.$channelId, continuation, (WithdrawPresenter) this.$paymentToken, (State) this.$detailsIntent, (MutableState) obj2);
                notificationActionService$onHandleIntent$113.this$0 = obj;
                return notificationActionService$onHandleIntent$113;
            case 18:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$114 = new NotificationActionService$onHandleIntent$1((CardSchemePresenter) this.$request, (Flow) this.$channelId, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) this.$paymentToken, (CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) this.$detailsIntent, (CardSchemeViewModel.Module.Accessory.Button) obj2, continuation, 18);
                notificationActionService$onHandleIntent$114.this$0 = obj;
                return notificationActionService$onHandleIntent$114;
            case 19:
                return new NotificationActionService$onHandleIntent$1((Flow) this.this$0, (CardSchemePresenter) this.$request, (State) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj2, continuation, 19);
            case 20:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$115 = new NotificationActionService$onHandleIntent$1((MutableState) this.$detailsIntent, (MutableState) obj2, continuation, 20);
                notificationActionService$onHandleIntent$115.$paymentToken = obj;
                return notificationActionService$onHandleIntent$115;
            case 21:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$116 = new NotificationActionService$onHandleIntent$1((State) this.$request, (MutableSharedFlow) this.$channelId, (PlatformHapticFeedback) this.$paymentToken, (Animatable) this.$detailsIntent, (MutableState) obj2, continuation, 21);
                notificationActionService$onHandleIntent$116.this$0 = obj;
                return notificationActionService$onHandleIntent$116;
            case 22:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$117 = new NotificationActionService$onHandleIntent$1((MutableState) this.$request, (MutableSharedFlow) this.$channelId, (PlatformHapticFeedback) this.$paymentToken, (Animatable) this.$detailsIntent, (MutableState) obj2, continuation, 22);
                notificationActionService$onHandleIntent$117.this$0 = obj;
                return notificationActionService$onHandleIntent$117;
            case 23:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$118 = new NotificationActionService$onHandleIntent$1((PointerInputScope) this.$request, (MutableState) this.$channelId, (MutableSharedFlow) this.$paymentToken, (MutableSharedFlow) this.$detailsIntent, (MutableState) obj2, continuation, 23);
                notificationActionService$onHandleIntent$118.this$0 = obj;
                return notificationActionService$onHandleIntent$118;
            case 24:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$119 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (PdfPreviewPresenter) this.$channelId, (CoroutineScope) this.$paymentToken, (State) this.$detailsIntent, (MutableState) obj2, 24);
                notificationActionService$onHandleIntent$119.this$0 = obj;
                return notificationActionService$onHandleIntent$119;
            case 25:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$120 = new NotificationActionService$onHandleIntent$1((Flow) this.$request, continuation, (PdfPreviewPresenter) this.$channelId, (AskedQuestion) this.$paymentToken, (CoroutineScope) this.$detailsIntent, (State) obj2, 25);
                notificationActionService$onHandleIntent$120.this$0 = obj;
                return notificationActionService$onHandleIntent$120;
            case 26:
                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$121 = new NotificationActionService$onHandleIntent$1((PollTimingOptions) this.$paymentToken, (Function1) this.$detailsIntent, (Function2) obj2, continuation);
                notificationActionService$onHandleIntent$121.$channelId = obj;
                return notificationActionService$onHandleIntent$121;
            default:
                return new NotificationActionService$onHandleIntent$1((Ref$ObjectRef) this.$request, (PaymentFlowResultProcessor) this.$paymentToken, (String) this.$channelId, (ApiRequest.Options) this.$detailsIntent, (Ref$LongRef) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((NotificationActionService$onHandleIntent$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((NotificationActionService$onHandleIntent$1) create((CardSchemeViewModel.Module.CustomizationImage) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((NotificationActionService$onHandleIntent$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((NotificationActionService$onHandleIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015a, code lost:
    
        if (r1 == r10) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r12, r25) == r11) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0515, code lost:
    
        if (r3 == r8) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04c2, code lost:
    
        if (r7 == r8) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0700, code lost:
    
        if (r1 == r10) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06dc, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r11, r25) == r10) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7 A[Catch: CancellationException -> 0x012e, TryCatch #1 {CancellationException -> 0x012e, blocks: (B:58:0x0126, B:63:0x019b, B:65:0x01a7, B:67:0x01ad), top: B:57:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b A[Catch: CancellationException -> 0x016e, TryCatch #0 {CancellationException -> 0x016e, blocks: (B:83:0x0161, B:85:0x016b, B:87:0x0174), top: B:82:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174 A[Catch: CancellationException -> 0x016e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x016e, blocks: (B:83:0x0161, B:85:0x016b, B:87:0x0174), top: B:82:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Type inference failed for: r0v76, types: [timber.log.Timber$Forest] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v31, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r14v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v34, types: [com.squareup.cash.shopping.viewmodels.BrandsSearchViewModel$Loaded$Error] */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009f -> B:9:0x00a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object confirmPayment;
        AssetPoolAddMemberStart.AddMemberSource addMemberSource;
        Object firstOrNull;
        String str;
        Analytics analytics;
        String str2;
        Object obj2;
        List list;
        BlockersScreens.SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen;
        Object selectPaymentPlanBlockerSubmit;
        Object search;
        Object mapSections;
        SearchResults searchResults;
        BrandsSearchPresenter.State state;
        String str3;
        int i;
        Deferred async$default;
        Object awaitInternal;
        Object articleCss;
        Deferred deferred;
        ApiResult apiResult;
        Object await;
        Bitmap bitmap;
        Object withContext;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Object withContext2;
        Bitmap bitmap4;
        Bitmap bitmap5;
        Object mo4055retrieveStripeIntentBWLJW6A;
        Ref$ObjectRef ref$ObjectRef;
        Object mo4055retrieveStripeIntentBWLJW6A2;
        Ref$ObjectRef ref$ObjectRef2;
        int i2 = this.$r8$classId;
        int i3 = 5;
        int i4 = 0;
        int i5 = 2;
        int i6 = 3;
        Object obj3 = this.$intent;
        EquatableBitmap equatableBitmap = null;
        switch (i2) {
            case 0:
                Intent intent = (Intent) this.$detailsIntent;
                String str4 = (String) this.$paymentToken;
                String str5 = (String) this.$channelId;
                NotificationActionService notificationActionService = (NotificationActionService) this.this$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = notificationActionService.appService;
                    if (appService == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appService");
                        throw null;
                    }
                    ClientScenario clientScenario = ClientScenario.PAYMENT_FLOW;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    ConfirmPaymentRequest confirmPaymentRequest = (ConfirmPaymentRequest) this.$request;
                    this.label = 1;
                    confirmPayment = appService.confirmPayment(clientScenario, generateToken, confirmPaymentRequest, this);
                    if (confirmPayment == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    confirmPayment = obj;
                }
                ApiResult apiResult2 = (ApiResult) confirmPayment;
                if (apiResult2 instanceof ApiResult.Success) {
                    ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) ((ApiResult.Success) apiResult2).response;
                    int i8 = NotificationActionService.$r8$clinit;
                    ConfirmPaymentResponse.Status status = confirmPaymentResponse.status;
                    if (status == null) {
                        status = ProtoDefaults.CONFIRM_PAYMENT_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        ResponseContext responseContext = confirmPaymentResponse.response_context;
                        ScenarioPlan scenarioPlan = responseContext != null ? responseContext.scenario_plan : null;
                        List<BlockerDescriptor> list2 = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                        if (list2 == null || list2.isEmpty()) {
                            ProductionAttributionEventEmitter productionAttributionEventEmitter = notificationActionService.attributionEventEmitter;
                            if (productionAttributionEventEmitter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("attributionEventEmitter");
                                throw null;
                            }
                            productionAttributionEventEmitter.paymentConfirmationSuccessful(Role.SENDER);
                            notificationActionService.getAnalytics().track(new PushNotificationConfirmComplete(null, str4, 1), null);
                            AndroidNotificationManager androidNotificationManager = notificationActionService.notificationManager;
                            if (androidNotificationManager == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("notificationManager");
                                throw null;
                            }
                            androidNotificationManager.notificationManager.cancel(str4, 1);
                        } else {
                            notificationActionService.getAnalytics().track(new PushNotificationConfirmViewBlocker(str4), null);
                            notificationActionService.showError(str5, R.string.notif_request_send_failed, R.string.notif_failed_general, intent, null, str4);
                        }
                    } else if (ordinal == 2) {
                        notificationActionService.getAnalytics().track(new PushNotificationConfirmReceiveError(str4, PushNotificationConfirmReceiveError.LogicError.CONCURRENT_MODIFICATION, null, null, 25), null);
                        notificationActionService.showError(str5, R.string.notif_request_send_failed, R.string.notif_failed_general, intent, null, str4);
                    } else {
                        if (ordinal != 3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        notificationActionService.getAnalytics().track(new PushNotificationConfirmReceiveError(str4, PushNotificationConfirmReceiveError.LogicError.FAILED, null, null, 25), null);
                        notificationActionService.showError(str5, R.string.notif_request_send_failed, R.string.notif_failed_general, intent, null, str4);
                    }
                } else if (apiResult2 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult2;
                    Intent intent2 = (Intent) obj3;
                    int i9 = NotificationActionService.$r8$clinit;
                    notificationActionService.getAnalytics().track(new PushNotificationConfirmReceiveError(str4, null, String.valueOf(failure instanceof ApiResult.Failure.NetworkFailure), (failure instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) failure : null) != null ? String.valueOf(((ApiResult.Failure.HttpFailure) failure).code) : null, 5), null);
                    notificationActionService.showError(str5, R.string.notif_request_send_failed, R.string.notif_failed_connection, intent, intent2, str4);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.$detailsIntent;
                    Analytics analytics2 = (Analytics) poolsListPresenter.analytics;
                    PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) poolsListPresenter.flowToken;
                    String str6 = poolInvitePeopleListScreen.token;
                    addMemberSource = poolInvitePeopleListScreen.source;
                    String str7 = poolInvitePeopleListScreen.flowToken;
                    Flow granted = ((ModifiablePermissions) poolsListPresenter.moneyFormatter).granted();
                    this.this$0 = analytics2;
                    this.$channelId = str6;
                    this.$request = addMemberSource;
                    this.$paymentToken = str7;
                    this.label = 1;
                    firstOrNull = FlowKt.firstOrNull(granted, this);
                    if (firstOrNull == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    str = str7;
                    analytics = analytics2;
                    str2 = str6;
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str8 = (String) this.$paymentToken;
                    AssetPoolAddMemberStart.AddMemberSource addMemberSource2 = (AssetPoolAddMemberStart.AddMemberSource) this.$request;
                    String str9 = (String) this.$channelId;
                    Analytics analytics3 = (Analytics) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    str = str8;
                    addMemberSource = addMemberSource2;
                    analytics = analytics3;
                    firstOrNull = obj;
                    str2 = str9;
                }
                Boolean bool = (Boolean) firstOrNull;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Iterator it = ((List) ((MutableState) obj3).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((Section) obj2).f1192type == Section.Type.CONTACTS) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Section section = (Section) obj2;
                int size = (section == null || (list = section.recipients) == null) ? 0 : list.size();
                analytics.getClass();
                str2.getClass();
                str.getClass();
                addMemberSource.getClass();
                analytics.track(new AssetPoolAddMemberStart(str2, Boolean.valueOf(booleanValue), Integer.valueOf(size), addMemberSource, str), null);
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$request;
                    NearbyPayRequestPresenter$models$10$1$1$1 nearbyPayRequestPresenter$models$10$1$1$1 = new NearbyPayRequestPresenter$models$10$1$1$1((Object) coroutineScope, this.$channelId, this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(nearbyPayRequestPresenter$models$10$1$1$1, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$request;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$1 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope2, (RealGenericProfileElementsPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (State) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(cardSchemePresenter$toHeroModule$3$1$1, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i12 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$request;
                    AndroidPermissionChecker$granted$$inlined$map$2$2 androidPermissionChecker$granted$$inlined$map$2$2 = new AndroidPermissionChecker$granted$$inlined$map$2$2(coroutineScope3, (TransfersPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow3.collect(androidPermissionChecker$granted$$inlined$map$2$2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                MutableState mutableState = (MutableState) this.$paymentToken;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelListPresenter channelListPresenter = (ChannelListPresenter) this.this$0;
                    ChannelListViewEvent.ToggleClicked toggleClicked = (ChannelListViewEvent.ToggleClicked) ((ChannelListViewEvent) this.$request);
                    String str10 = (String) this.$channelId;
                    Category category = (Category) mutableState.getValue();
                    Integer num = (Integer) ((MutableState) this.$detailsIntent).getValue();
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$1 = new ShiftNotePresenter$models$1$1(i5, mutableState);
                    ShiftNotePresenter$models$1$1 shiftNotePresenter$models$1$12 = new ShiftNotePresenter$models$1$1(i6, (MutableState) obj3);
                    this.label = 1;
                    if (ChannelListPresenter.access$handleToggleClick(channelListPresenter, toggleClicked, str10, category, num, shiftNotePresenter$models$1$1, shiftNotePresenter$models$1$12, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$request;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$12 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope4, (PdfPreviewPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow4.collect(cardSchemePresenter$toHeroModule$3$1$12, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                MutableState mutableState2 = (MutableState) obj3;
                MutableState mutableState3 = (MutableState) this.$detailsIntent;
                MutableState mutableState4 = (MutableState) this.$paymentToken;
                MutableState mutableState5 = (MutableState) this.$request;
                SelectPaymentPlanBlockerPresenter selectPaymentPlanBlockerPresenter = (SelectPaymentPlanBlockerPresenter) this.this$0;
                BlockersScreens.SelectPaymentPlanBlockerScreen selectPaymentPlanBlockerScreen2 = selectPaymentPlanBlockerPresenter.args;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str11 = (String) this.$channelId;
                    this.label = 1;
                    LendingAppService lendingAppService = selectPaymentPlanBlockerPresenter.lendingAppService;
                    ClientScenario clientScenario2 = selectPaymentPlanBlockerScreen2.blockersData.clientScenario;
                    clientScenario2.getClass();
                    BlockersData blockersData = selectPaymentPlanBlockerScreen2.blockersData;
                    selectPaymentPlanBlockerScreen = selectPaymentPlanBlockerScreen2;
                    selectPaymentPlanBlockerSubmit = lendingAppService.selectPaymentPlanBlockerSubmit(clientScenario2, blockersData.flowToken, new SelectPaymentPlanBlockerSubmitRequest(new SelectPaymentPlanBlockerSubmitRequest$Action$UpdateOption(new SelectPaymentPlanBlockerSubmitRequest.UpdateOption(str11, ByteString.EMPTY)), blockersData.requestContext), this);
                    if (selectPaymentPlanBlockerSubmit == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    selectPaymentPlanBlockerSubmit = obj;
                    selectPaymentPlanBlockerScreen = selectPaymentPlanBlockerScreen2;
                }
                ApiResult apiResult3 = (ApiResult) selectPaymentPlanBlockerSubmit;
                if (apiResult3 instanceof ApiResult.Success) {
                    SelectPaymentPlanBlockerSubmitResponse selectPaymentPlanBlockerSubmitResponse = (SelectPaymentPlanBlockerSubmitResponse) ((ApiResult.Success) apiResult3).response;
                    mutableState5.setValue(null);
                    SelectPaymentPlanBlocker selectPaymentPlanBlocker = selectPaymentPlanBlockerSubmitResponse.updated_blocker;
                    if (selectPaymentPlanBlocker != null) {
                        mutableState4.setValue(selectPaymentPlanBlocker);
                        mutableState3.setValue(SelectPaymentPlanBlockerPresenter.getPreselectedPaymentOptionIndex(selectPaymentPlanBlocker));
                    }
                    mutableState2.setValue(new SelectPaymentPlanViewModel.ButtonState.Loaded(((Integer) mutableState3.getValue()) != null));
                }
                if (apiResult3 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure2 = (ApiResult.Failure) apiResult3;
                    mutableState5.setValue(null);
                    mutableState3.setValue(SelectPaymentPlanBlockerPresenter.getPreselectedPaymentOptionIndex((SelectPaymentPlanBlocker) mutableState4.getValue()));
                    mutableState2.setValue(new SelectPaymentPlanViewModel.ButtonState.Loaded(((Integer) mutableState3.getValue()) != null));
                    ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging(selectPaymentPlanBlockerPresenter.stringManager, failure2, null);
                    selectPaymentPlanBlockerPresenter.navigator.goTo(new FailureMessageBlockerScreen(selectPaymentPlanBlockerScreen.blockersData, errorMessaging.message, errorMessaging.title));
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$request;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$13 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope5, (LocalEditorialPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 13);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow5.collect(cardSchemePresenter$toHeroModule$3$1$13, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                BrandsSearchPresenter brandsSearchPresenter = (BrandsSearchPresenter) this.$detailsIntent;
                RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = brandsSearchPresenter.analyticsHelper;
                MutableState mutableState6 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState6.setValue(BrandsSearchPresenter.State.copy$default((BrandsSearchPresenter.State) mutableState6.getValue(), new BrandsSearchViewModel.Loading(((BrandsSearchPresenter.State) mutableState6.getValue()).searchText), null, false, 0, 26));
                    if (!((BrandsSearchPresenter.State) mutableState6.getValue()).isInitialQuery && !((BrandsSearchPresenter.State) mutableState6.getValue()).isRetrying) {
                        long j = brandsSearchPresenter.searchInputDelay;
                        this.label = 1;
                        break;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str3 = (String) this.$channelId;
                            BrandsSearchPresenter.State state2 = (BrandsSearchPresenter.State) this.$paymentToken;
                            mutableState6 = (MutableState) this.$request;
                            SearchResults searchResults2 = (SearchResults) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            searchResults = searchResults2;
                            state = state2;
                            mapSections = obj;
                            List list3 = (List) mapSections;
                            String str12 = searchResults.errorMessage;
                            mutableState6.setValue(BrandsSearchPresenter.State.copy$default(state, new BrandsSearchViewModel.Loaded(str3, list3, str12 != null ? new BrandsSearchViewModel.Loaded.Error(str12) : 0), null, false, 0, 30));
                            return Unit.INSTANCE;
                        }
                        SafeTrace.throwOnFailure(obj);
                        search = obj;
                        SearchResults searchResults3 = (SearchResults) search;
                        BrandsSearchPresenter.State state3 = (BrandsSearchPresenter.State) mutableState6.getValue();
                        String str13 = ((BrandsSearchPresenter.State) mutableState6.getValue()).searchText;
                        AndroidStringManager androidStringManager = brandsSearchPresenter.stringManager;
                        RealRecentSearchManager realRecentSearchManager = brandsSearchPresenter.recentSearchManager;
                        this.this$0 = searchResults3;
                        this.$request = mutableState6;
                        this.$paymentToken = state3;
                        this.$channelId = str13;
                        this.label = 3;
                        mapSections = EmojiExclusions.mapSections(searchResults3, androidStringManager, true, realRecentSearchManager, null, this);
                        if (mapSections != coroutineSingletons10) {
                            searchResults = searchResults3;
                            state = state3;
                            str3 = str13;
                            List list32 = (List) mapSections;
                            String str122 = searchResults.errorMessage;
                            mutableState6.setValue(BrandsSearchPresenter.State.copy$default(state, new BrandsSearchViewModel.Loaded(str3, list32, str122 != null ? new BrandsSearchViewModel.Loaded.Error(str122) : 0), null, false, 0, 30));
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons10;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SizeMap sizeMap = brandsSearchPresenter.repository;
                SearchQuery searchQuery = new SearchQuery(((BrandsSearchPresenter.State) mutableState6.getValue()).searchText, realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP), realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SEARCH));
                this.label = 2;
                search = sizeMap.search(searchQuery, this);
                break;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$request;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2 = new ChannelFlowMerge$collectTo$2(coroutineScope6, (RealShoppingJavascriptPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow6.collect(channelFlowMerge$collectTo$2, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                RealArticlesService realArticlesService = (RealArticlesService) obj3;
                LinkedHashMap linkedHashMap = realArticlesService.articleCache;
                CoroutineScope coroutineScope7 = (CoroutineScope) this.$detailsIntent;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                ArticlesService$AllArticlesResult.Failure failure3 = ArticlesService$AllArticlesResult.Failure.INSTANCE;
                ?? r14 = 0;
                ?? r142 = 0;
                Object obj4 = null;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list4 = (List) realArticlesService.supportViewedArticlesStore.keyValue.blockingGet();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((RecentlyViewedNode) it2.next()).token);
                    }
                    i = 10;
                    DeferredCoroutine async$default2 = JobKt.async$default(coroutineScope7, null, null, new TaxWebAppPresenter$models$1$1(realArticlesService, (String) this.$channelId, (String) this.$paymentToken, arrayList, (Continuation) null, 5), 3);
                    Continuation continuation = null;
                    async$default = JobKt.async$default(coroutineScope7, null, null, new ArticlePresenter$models$1$1(realArticlesService, (String) this.$channelId, (String) this.$paymentToken, continuation, 1), 3);
                    this.$detailsIntent = null;
                    this.this$0 = async$default;
                    this.label = 1;
                    awaitInternal = async$default2.awaitInternal(this);
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r14 = continuation;
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            apiResult = (ApiResult) this.$request;
                            Deferred deferred2 = (Deferred) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            deferred = deferred2;
                            i = 10;
                            articleCss = obj;
                            if (!(articleCss instanceof RealArticlesService.CssResult.Failure)) {
                                this.$detailsIntent = obj4;
                                this.this$0 = obj4;
                                this.$request = apiResult;
                                this.label = 3;
                                await = deferred.await(this);
                                r142 = obj4;
                                break;
                            }
                            return failure3;
                        }
                        if (i20 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        apiResult = (ApiResult) this.$request;
                        SafeTrace.throwOnFailure(obj);
                        await = obj;
                        i = 10;
                        ApiResult apiResult4 = (ApiResult) await;
                        if (apiResult4 instanceof ApiResult.Failure) {
                            Timber.Forest.w("Failed to retrieve recommended support articles.", new Object[0]);
                        }
                        ApiResult.Success success = (ApiResult.Success) apiResult;
                        Object obj5 = success.response;
                        Object obj6 = success.response;
                        List<SupportArticle> list5 = ((ListSupportArticlesResponse) obj5).articles;
                        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, i));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                        for (SupportArticle supportArticle : list5) {
                            String str14 = supportArticle.article_token;
                            str14.getClass();
                            linkedHashMap2.put(str14, RealArticlesService.toArticle(supportArticle));
                        }
                        linkedHashMap.putAll(linkedHashMap2);
                        LinkedHashMap linkedHashMap3 = realArticlesService.linkCache;
                        List list6 = ((ListSupportArticlesResponse) obj6).links;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            Link link = SizeModifiersKt.toLink((SupportLink) it3.next());
                            if (link != null) {
                                arrayList2.add(link);
                            }
                        }
                        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, i));
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            linkedHashMap4.put(((Link) next).token, next);
                        }
                        linkedHashMap3.putAll(linkedHashMap4);
                        List list7 = ((ListSupportArticlesResponse) obj6).home_article_ids;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it5 = list7.iterator();
                        while (it5.hasNext()) {
                            Article article = (Article) linkedHashMap.get((String) it5.next());
                            if (article != null) {
                                arrayList3.add(article);
                            }
                        }
                        RecommendSupportArticlesResponse recommendSupportArticlesResponse = (RecommendSupportArticlesResponse) (apiResult4 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult4).response : r142);
                        if (recommendSupportArticlesResponse != null) {
                            List list8 = recommendSupportArticlesResponse.links;
                            r142 = new ArrayList();
                            Iterator it6 = list8.iterator();
                            while (it6.hasNext()) {
                                Link link2 = SizeModifiersKt.toLink((SupportLink) it6.next());
                                if (link2 != null) {
                                    r142.add(link2);
                                }
                            }
                        }
                        if (r142 == 0) {
                            r142 = EmptyList.INSTANCE;
                        }
                        return new ArticlesService$AllArticlesResult.Success(arrayList3, r142);
                    }
                    async$default = (Deferred) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitInternal = obj;
                    i = 10;
                }
                ApiResult apiResult5 = (ApiResult) awaitInternal;
                if (apiResult5 instanceof ApiResult.Success) {
                    String str15 = ((ListSupportArticlesResponse) ((ApiResult.Success) apiResult5).response).stylesheet_url;
                    if (str15 != null) {
                        this.$detailsIntent = r14;
                        this.this$0 = async$default;
                        this.$request = apiResult5;
                        this.label = 2;
                        articleCss = realArticlesService.getArticleCss(str15, this);
                        if (articleCss != coroutineSingletons12) {
                            deferred = async$default;
                            apiResult = apiResult5;
                            obj4 = r14;
                            if (!(articleCss instanceof RealArticlesService.CssResult.Failure)) {
                            }
                        }
                        return coroutineSingletons12;
                    }
                } else {
                    ApiResult.Failure.NetworkFailure networkFailure = apiResult5 instanceof ApiResult.Failure.NetworkFailure ? (ApiResult.Failure.NetworkFailure) apiResult5 : r14;
                    if (networkFailure != null) {
                        r14 = networkFailure.error;
                    }
                    Timber.Forest.w("Failed to retrieve support articles.", new Object[0], r14);
                }
                return failure3;
            case 12:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$request;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$22 = new ChannelFlowMerge$collectTo$2(coroutineScope8, (PdfPreviewPresenter) this.$channelId, (State) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 10);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow7.collect(channelFlowMerge$collectTo$22, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$request;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$14 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope9, (SupportSearchPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableSharedFlow) this.$detailsIntent, (MutableState) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow8.collect(cardSchemePresenter$toHeroModule$3$1$14, this) == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$request;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$15 = new CardSchemePresenter$toHeroModule$3$1$1(coroutineScope10, (LocalEditorialPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 15);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow9.collect(cardSchemePresenter$toHeroModule$3$1$15, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$request;
                    BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(coroutineScope11, (CardLockPresenter) this.$channelId, (TapToPayPaymentData) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow10.collect(anonymousClass1, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i24 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$request;
                    ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$23 = new ChannelFlowMerge$collectTo$2(coroutineScope12, (InstrumentDetailsPresenter) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 14);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow11.collect(channelFlowMerge$collectTo$23, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Money money = (Money) this.$request;
                    WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) this.$channelId;
                    WithdrawPresenter withdrawPresenter = (WithdrawPresenter) this.$paymentToken;
                    Instrument instrument = (Instrument) ((State) this.$detailsIntent).getValue();
                    SignalsContext signalsContext = (SignalsContext) ((MutableState) obj3).getValue();
                    this.this$0 = null;
                    this.label = 1;
                    if (WithdrawPresenter.access$initiateCashOut(withdrawPresenter, money, instrument, depositPreferenceOption, signalsContext, this) == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = (CardModule.HeroNullStateModule.UnifiedCardHomeNUX) this.$paymentToken;
                CardSchemePresenter cardSchemePresenter = (CardSchemePresenter) this.$request;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = this.label;
                if (i27 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i28 = 24;
                    FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new FlowExtensionsKt$combine$$inlined$combine$1(12, new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new SquareAccountStore$userFlow$$inlined$map$1(cardSchemePresenter.syncValueReader.getAllValues(AndroidSyncValueSpecs.CardThemeDefinitions), i3), i28), unifiedCardHomeNUX), i28), (Flow) this.$channelId, new CardModelView.AnonymousClass1.AnonymousClass4(i6, (Continuation) r9, 19), i4);
                    CardSchemePresenter$toCardUpsellModule$1$content$2$1$4 cardSchemePresenter$toCardUpsellModule$1$content$2$1$4 = new CardSchemePresenter$toCardUpsellModule$1$content$2$1$4((CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent) this.$detailsIntent, unifiedCardHomeNUX, produceStateScope, cardSchemePresenter, (CardSchemeViewModel.Module.Accessory.Button) obj3, null);
                    this.this$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, cardSchemePresenter$toCardUpsellModule$1$content$2$1$4, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i27 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.this$0;
                    CardSchemePresenter$toHeroModule$3$1$1 cardSchemePresenter$toHeroModule$3$1$16 = new CardSchemePresenter$toHeroModule$3$1$1((CardSchemePresenter) this.$request, (State) this.$channelId, (MutableState) this.$paymentToken, (MutableState) this.$detailsIntent, (MutableState) obj3, 0);
                    this.label = 1;
                    Object collect = flow12.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(cardSchemePresenter$toHeroModule$3$1$16, 22), this);
                    if (collect != coroutineSingletons21) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState7 = (MutableState) this.$detailsIntent;
                CardSchemeViewModel.Module.CustomizationImage customizationImage = (CardSchemeViewModel.Module.CustomizationImage) this.$paymentToken;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                try {
                    if (i30 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (customizationImage == null) {
                            bitmap = null;
                            Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            EquatableBitmap equatableBitmap2 = (EquatableBitmap) mutableState7.getValue();
                            bitmap3 = equatableBitmap2 == null ? equatableBitmap2.bitmap : null;
                            if (bitmap != null) {
                                bitmap2 = bitmap;
                                Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                mutableState7.setValue(equatableBitmap);
                                ((MutableState) obj3).setValue(customizationImage);
                                if (bitmap3 != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            this.$paymentToken = customizationImage;
                            this.this$0 = bitmap;
                            this.$request = bitmap3;
                            this.$channelId = mutableState7;
                            this.label = 2;
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            withContext2 = JobKt.withContext(DefaultIoScheduler.INSTANCE, new EquatableBitmap$Companion$toEquatable$2(bitmap, r9, i4), this);
                            if (withContext2 != coroutineSingletons22) {
                                bitmap4 = bitmap;
                                bitmap5 = bitmap3;
                                equatableBitmap = (EquatableBitmap) withContext2;
                                bitmap3 = bitmap5;
                                bitmap2 = bitmap4;
                                Quat quat22 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                mutableState7.setValue(equatableBitmap);
                                ((MutableState) obj3).setValue(customizationImage);
                                if (bitmap3 != null) {
                                    bitmap3.recycle();
                                }
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons22;
                        }
                        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2(customizationImage, r9, i3);
                        this.$paymentToken = customizationImage;
                        this.this$0 = null;
                        this.label = 1;
                        withContext = JobKt.withContext(defaultIoScheduler, cameraHelper$unbind$2, this);
                        break;
                    } else {
                        if (i30 != 1) {
                            if (i30 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutableState7 = (MutableState) this.$channelId;
                            bitmap5 = (Bitmap) this.$request;
                            bitmap2 = (Bitmap) this.this$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                bitmap4 = bitmap2;
                                withContext2 = obj;
                            } catch (CancellationException e) {
                                e = e;
                                if (bitmap2 != null) {
                                }
                                throw e;
                            }
                            try {
                                equatableBitmap = (EquatableBitmap) withContext2;
                                bitmap3 = bitmap5;
                                bitmap2 = bitmap4;
                                Quat quat222 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                mutableState7.setValue(equatableBitmap);
                                ((MutableState) obj3).setValue(customizationImage);
                                if (bitmap3 != null && !bitmap3.equals(bitmap2)) {
                                    bitmap3.recycle();
                                }
                                return Unit.INSTANCE;
                            } catch (CancellationException e2) {
                                e = e2;
                                bitmap2 = bitmap4;
                                if (bitmap2 != null) {
                                }
                                throw e;
                            }
                        }
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                    }
                    Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    EquatableBitmap equatableBitmap22 = (EquatableBitmap) mutableState7.getValue();
                    if (equatableBitmap22 == null) {
                    }
                    if (bitmap != null) {
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    throw e;
                }
                bitmap = (Bitmap) withContext;
            case 21:
                return invokeSuspend$com$squareup$cash$wallet$views$CoreInteractiveCardKt$InteractiveCardEffect$16$1$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$wallet$views$Hero3DCardViewKt$InteractiveCard$13$1$1(obj);
            case 23:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = (PointerInputScope) this.$request;
                    TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1(coroutineScope13, (MutableState) this.$channelId, (MutableSharedFlow) this.$paymentToken, (MutableSharedFlow) this.$detailsIntent, (MutableState) obj3, (Continuation) null);
                    this.this$0 = null;
                    this.label = 1;
                    if (Draggable2DKt.awaitEachGesture(pointerInputScope, tapGestureDetectorKt$detectTapAndPress$2$1, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                return invokeSuspend$com$squareup$cash$work$presenters$shift$ShiftNotePresenter$models$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$work$presenters$shift$TakeBreakBottomSheetPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$stripe$android$financialconnections$utils$ErrorsKt$retryOnException$2(obj);
            default:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj3;
                ApiRequest.Options options = (ApiRequest.Options) this.$detailsIntent;
                String str16 = (String) this.$channelId;
                PaymentFlowResultProcessor paymentFlowResultProcessor = (PaymentFlowResultProcessor) this.$paymentToken;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.$request;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list9 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                    this.this$0 = ref$ObjectRef3;
                    this.label = 1;
                    mo4055retrieveStripeIntentBWLJW6A = paymentFlowResultProcessor.mo4055retrieveStripeIntentBWLJW6A(str16, options, list9, this);
                    if (mo4055retrieveStripeIntentBWLJW6A != coroutineSingletons24) {
                        ref$ObjectRef = ref$ObjectRef3;
                    }
                    return coroutineSingletons24;
                }
                if (i32 != 1) {
                    if (i32 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        ref$LongRef.element = System.currentTimeMillis();
                        List list10 = PaymentFlowResultProcessor.EXPAND_PAYMENT_METHOD;
                        this.this$0 = ref$ObjectRef3;
                        this.label = 3;
                        mo4055retrieveStripeIntentBWLJW6A2 = paymentFlowResultProcessor.mo4055retrieveStripeIntentBWLJW6A(str16, options, list10, this);
                        if (mo4055retrieveStripeIntentBWLJW6A2 != coroutineSingletons24) {
                            ref$ObjectRef2 = ref$ObjectRef3;
                            ref$ObjectRef2.element = new Result(mo4055retrieveStripeIntentBWLJW6A2);
                            if (!PaymentFlowResultProcessor.shouldRetry((Result) ref$ObjectRef3.element)) {
                            }
                        }
                        return coroutineSingletons24;
                    }
                    if (i32 != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef2 = (Ref$ObjectRef) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    mo4055retrieveStripeIntentBWLJW6A2 = ((Result) obj).value;
                    ref$ObjectRef2.element = new Result(mo4055retrieveStripeIntentBWLJW6A2);
                    if (!PaymentFlowResultProcessor.shouldRetry((Result) ref$ObjectRef3.element)) {
                        return Unit.INSTANCE;
                    }
                    long currentTimeMillis = 1000 - (System.currentTimeMillis() - ref$LongRef.element);
                    this.this$0 = null;
                    this.label = 2;
                    break;
                } else {
                    ref$ObjectRef = (Ref$ObjectRef) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    mo4055retrieveStripeIntentBWLJW6A = ((Result) obj).value;
                }
                ref$ObjectRef.element = new Result(mo4055retrieveStripeIntentBWLJW6A);
                if (!PaymentFlowResultProcessor.shouldRetry((Result) ref$ObjectRef3.element)) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionService$onHandleIntent$1(RealArticlesService realArticlesService, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.$intent = realArticlesService;
        this.$channelId = str;
        this.$paymentToken = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionService$onHandleIntent$1(Money money, WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, Continuation continuation, WithdrawPresenter withdrawPresenter, State state, MutableState mutableState) {
        super(2, continuation);
        this.$r8$classId = 17;
        this.$request = money;
        this.$channelId = depositPreferenceOption;
        this.$paymentToken = withdrawPresenter;
        this.$detailsIntent = state;
        this.$intent = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionService$onHandleIntent$1(PollTimingOptions pollTimingOptions, Function1 function1, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 26;
        this.$paymentToken = pollTimingOptions;
        this.$detailsIntent = function1;
        this.$intent = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationActionService$onHandleIntent$1(Object obj, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$detailsIntent = obj;
        this.$intent = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationActionService$onHandleIntent$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$request = obj2;
        this.$channelId = obj3;
        this.$paymentToken = obj4;
        this.$detailsIntent = obj5;
        this.$intent = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationActionService$onHandleIntent$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$request = obj;
        this.$channelId = obj2;
        this.$paymentToken = obj3;
        this.$detailsIntent = obj4;
        this.$intent = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionService$onHandleIntent$1(Ref$ObjectRef ref$ObjectRef, PaymentFlowResultProcessor paymentFlowResultProcessor, String str, ApiRequest.Options options, Ref$LongRef ref$LongRef, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 27;
        this.$request = ref$ObjectRef;
        this.$paymentToken = paymentFlowResultProcessor;
        this.$channelId = str;
        this.$detailsIntent = options;
        this.$intent = ref$LongRef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationActionService$onHandleIntent$1(Flow flow, Continuation continuation, Object obj, Object obj2, Object obj3, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$request = flow;
        this.$channelId = obj;
        this.$paymentToken = obj2;
        this.$detailsIntent = obj3;
        this.$intent = state;
    }
}
