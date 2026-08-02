package com.squareup.kotterknife;

import android.app.Application;
import android.content.IntentSender;
import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.api.Action;
import com.squareup.cash.phoneplans.backend.RealEsimChecker$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$goToLinkedAccountsScreen$1;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.treehouse.network.RealHttpClient;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.sup.api.v1.MerchantConfigService;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.internal.InlineLinkedList$InlineListNode;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession$invoke$1;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancelledContinuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import net.idrnd.misnap.iad.Payload;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class Lazy implements Callback, OnFailureListener, ActivityItemEventDecorator, Action, ReadOnlyProperty, CaptchaAnalyticsEvent {
    public final /* synthetic */ int $r8$classId;
    public Object initializer;
    public Object value;

    public final class EMPTY {
        public static final EMPTY INSTANCE = new EMPTY();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Lazy(int i) {
        this((String) null, new CardAppletTile$$ExternalSyntheticLambda0(4));
        this.$r8$classId = i;
        switch (i) {
            case 19:
                this.initializer = new ArrayDeque(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                this.value = new Object();
                break;
            case 22:
                break;
            case 24:
                break;
            default:
                this.initializer = Action.Type.CUSTOM;
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.value = emptyMap;
                break;
        }
    }

    public static Object checkPendingBeforeStartFlow$default(Lazy lazy, BlockersData blockersData, Money money, String str, PendingTransfersConfirmationDialog.Destination destination, DepositPreference depositPreference, String str2, Money money2, boolean z, int i) {
        DepositPreference depositPreference2 = (i & 16) != 0 ? null : depositPreference;
        String str3 = (i & 32) != 0 ? null : str2;
        Money money3 = (i & 64) != 0 ? null : money2;
        boolean z2 = (i & 128) != 0 ? false : z;
        TransferData transferData = blockersData.transferData;
        transferData.getClass();
        if (transferData.confirmPendingTransfers) {
            return new PendingTransfersConfirmationDialog(destination, new PendingTransfersConfirmationDialog.DestinationParams(blockersData, money, str, str3, money3, z2));
        }
        int ordinal = destination.ordinal();
        if (ordinal == 0) {
            return new AddMoneyScreen(blockersData, money, str, str3, money3, z2);
        }
        if (ordinal == 1) {
            return new WithdrawScreen(blockersData, money, str, depositPreference2);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static Object startAddMoneyFlow$default(Lazy lazy, BlockersData blockersData, Money money) {
        lazy.getClass();
        return checkPendingBeforeStartFlow$default(lazy, blockersData, money, null, PendingTransfersConfirmationDialog.Destination.ADD_MONEY, null, null, null, false, 16);
    }

    public static Object startWithdrawFlow$default(Lazy lazy, BlockersData blockersData, Money money, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        lazy.getClass();
        return checkPendingBeforeStartFlow$default(lazy, blockersData, money, str, PendingTransfersConfirmationDialog.Destination.WITHDRAW, null, null, null, false, 224);
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new CheckStatusPresenter.AnonymousClass1.C00611(this, null, 22), 3);
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public Map getAdditionalParams() {
        return (Map) this.value;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public Map getAttributes() {
        return (EmptyMap) this.value;
    }

    @Override // com.stripe.android.core.networking.AnalyticsEvent
    public String getEventName() {
        return "elements.captcha.passive.attach";
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public String getName() {
        return "low_disk_space_clear_image_cache";
    }

    @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
    public String getSiteKey() {
        return (String) this.initializer;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public Action.Type getType() {
        return (Action.Type) this.initializer;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object obj, KProperty kProperty) {
        kProperty.getClass();
        if (Intrinsics.areEqual(this.value, EMPTY.INSTANCE)) {
            this.value = ((KotterKnifeKt$$ExternalSyntheticLambda1) this.initializer).invoke(obj, kProperty);
        }
        return this.value;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object goToLinkedAccountsScreen(ContinuationImpl continuationImpl) {
        RealTransfersInboundNavigator$goToLinkedAccountsScreen$1 realTransfersInboundNavigator$goToLinkedAccountsScreen$1;
        Object obj;
        int i;
        Navigator navigator = (Navigator) this.initializer;
        if (continuationImpl instanceof RealTransfersInboundNavigator$goToLinkedAccountsScreen$1) {
            realTransfersInboundNavigator$goToLinkedAccountsScreen$1 = (RealTransfersInboundNavigator$goToLinkedAccountsScreen$1) continuationImpl;
            int i2 = realTransfersInboundNavigator$goToLinkedAccountsScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTransfersInboundNavigator$goToLinkedAccountsScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realTransfersInboundNavigator$goToLinkedAccountsScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTransfersInboundNavigator$goToLinkedAccountsScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    navigator.goTo(LinkedAccountsScreen.INSTANCE);
                    KeyValue keyValue = (KeyValue) this.value;
                    realTransfersInboundNavigator$goToLinkedAccountsScreen$1.label = 1;
                    obj = keyValue.get(realTransfersInboundNavigator$goToLinkedAccountsScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    navigator.goTo(LinkedAccountsNuxScreen.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
        realTransfersInboundNavigator$goToLinkedAccountsScreen$1 = new RealTransfersInboundNavigator$goToLinkedAccountsScreen$1(this, continuationImpl);
        obj = realTransfersInboundNavigator$goToLinkedAccountsScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTransfersInboundNavigator$goToLinkedAccountsScreen$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, ContinuationImpl continuationImpl) {
        FetchFinancialConnectionsSession$invoke$1 fetchFinancialConnectionsSession$invoke$1;
        int i;
        if (continuationImpl instanceof FetchFinancialConnectionsSession$invoke$1) {
            fetchFinancialConnectionsSession$invoke$1 = (FetchFinancialConnectionsSession$invoke$1) continuationImpl;
            int i2 = fetchFinancialConnectionsSession$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fetchFinancialConnectionsSession$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fetchFinancialConnectionsSession$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchFinancialConnectionsSession$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = (FinancialConnectionsRepositoryImpl) this.value;
                    fetchFinancialConnectionsSession$invoke$1.label = 1;
                    obj = financialConnectionsRepositoryImpl.getFinancialConnectionsSession(str, fetchFinancialConnectionsSession$invoke$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Payload payload = (Payload) this.initializer;
                fetchFinancialConnectionsSession$invoke$1.label = 2;
                Object invoke = payload.invoke((FinancialConnectionsSession) obj, fetchFinancialConnectionsSession$invoke$1);
                return invoke != coroutineSingletons ? coroutineSingletons : invoke;
            }
        }
        fetchFinancialConnectionsSession$invoke$1 = new FetchFinancialConnectionsSession$invoke$1(this, continuationImpl);
        Object obj2 = fetchFinancialConnectionsSession$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchFinancialConnectionsSession$invoke$1.label;
        if (i != 0) {
        }
        Payload payload2 = (Payload) this.initializer;
        fetchFinancialConnectionsSession$invoke$1.label = 2;
        Object invoke2 = payload2.invoke((FinancialConnectionsSession) obj2, fetchFinancialConnectionsSession$invoke$1);
        if (invoke2 != coroutineSingletons2) {
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        switch (this.$r8$classId) {
            case 2:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.initializer;
                if (!(cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation)) {
                    Result.Companion companion = Result.Companion;
                    cancellableContinuationImpl.resumeWith(new Result.Failure(iOException));
                    break;
                }
                break;
            default:
                CancellableContinuationImpl cancellableContinuationImpl2 = (CancellableContinuationImpl) this.initializer;
                Result.Companion companion2 = Result.Companion;
                cancellableContinuationImpl2.resumeWith(new Result.Failure(iOException));
                break;
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        switch (this.$r8$classId) {
            case 2:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.initializer;
                try {
                    try {
                        Object invoke = ((Function2) this.value).invoke(response.body.bytes(), Integer.valueOf(response.code));
                        response.close();
                        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation) {
                            return;
                        }
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(invoke);
                        return;
                    } finally {
                    }
                } catch (Exception e) {
                    if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation) {
                        return;
                    }
                    Result.Companion companion2 = Result.Companion;
                    cancellableContinuationImpl.resumeWith(new Result.Failure(e));
                    return;
                }
            default:
                CancellableContinuationImpl cancellableContinuationImpl2 = (CancellableContinuationImpl) this.initializer;
                RealHttpClient realHttpClient = (RealHttpClient) this.value;
                try {
                    try {
                        Result.Companion companion3 = Result.Companion;
                        cancellableContinuationImpl2.resumeWith(RealHttpClient.access$toHttpResponse(realHttpClient, response));
                    } catch (IOException e2) {
                        Result.Companion companion4 = Result.Companion;
                        cancellableContinuationImpl2.resumeWith(new Result.Failure(e2));
                    }
                    response.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
        }
    }

    public void plusAssign(InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode) {
        if (inlineLinkedList$InlineListNode.getNextListNode() != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Expected node to not be linked.");
            return;
        }
        InlineLinkedList$InlineListNode inlineLinkedList$InlineListNode2 = (InlineLinkedList$InlineListNode) this.value;
        if (inlineLinkedList$InlineListNode2 != null) {
            this.value = inlineLinkedList$InlineListNode;
            inlineLinkedList$InlineListNode2.setNextListNode(inlineLinkedList$InlineListNode);
        } else if (((InlineLinkedList$InlineListNode) this.initializer) != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        } else {
            this.initializer = inlineLinkedList$InlineListNode;
            this.value = inlineLinkedList$InlineListNode;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.value;
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).mStatus.startResolutionForResult(6, ((AndroidLocationSettingsChecker) this.initializer).activity);
            } catch (IntentSender.SendIntentException e) {
                Timber.Forest.e("Failed to request user to update Location Setting.", new Object[0], e);
            }
        }
        if (cancellableContinuationImpl.getState$kotlinx_coroutines_core() instanceof CancelledContinuation) {
            return;
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
    }

    public Lazy(Map map, Map map2) {
        this.$r8$classId = 8;
        map.getClass();
        map2.getClass();
        this.initializer = map;
        this.value = map2;
    }

    public Lazy(Payload payload, FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl) {
        this.$r8$classId = 25;
        financialConnectionsRepositoryImpl.getClass();
        this.initializer = payload;
        this.value = financialConnectionsRepositoryImpl;
    }

    public Lazy(RealFamilyAccountsManager realFamilyAccountsManager) {
        this.$r8$classId = 13;
        this.initializer = realFamilyAccountsManager.isSponsored();
        this.value = StateFlowKt.mapState(realFamilyAccountsManager.sponsorsFlow(), new StoryQueries$$ExternalSyntheticLambda0(29));
    }

    public Lazy(RealShiftTimeFormatter realShiftTimeFormatter, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 23;
        this.initializer = realShiftTimeFormatter;
        this.value = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public Lazy(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl) {
        this.$r8$classId = 26;
        financialConnectionsManifestRepositoryImpl.getClass();
        financialConnectionsSheetConfiguration.getClass();
        this.initializer = financialConnectionsManifestRepositoryImpl;
        this.value = financialConnectionsSheetConfiguration;
    }

    public Lazy(Application application, FeatureFlagManager featureFlagManager) {
        this.$r8$classId = 14;
        this.initializer = featureFlagManager;
        this.value = LazyKt.lazy(new RealEsimChecker$$ExternalSyntheticLambda0(application, 0));
    }

    public Lazy(Analytics analytics, GrowToolsManagerScreen growToolsManagerScreen) {
        this.$r8$classId = 5;
        growToolsManagerScreen.getClass();
        this.initializer = analytics;
        this.value = growToolsManagerScreen;
    }

    public Lazy(Navigator navigator, KeyValue keyValue) {
        this.$r8$classId = 20;
        navigator.getClass();
        this.initializer = navigator;
        this.value = keyValue;
    }

    public Lazy(CoroutineContext coroutineContext) {
        this.$r8$classId = 28;
        coroutineContext.getClass();
        this.initializer = new StripeApiRepository$$ExternalSyntheticLambda5(22);
        this.value = coroutineContext;
    }

    public Lazy(String str, Function1 function1) {
        this.$r8$classId = 22;
        function1.getClass();
        this.initializer = function1;
        this.value = str;
    }

    public Lazy(StripeEphemeralKeyPairGenerator stripeEphemeralKeyPairGenerator, DefaultErrorReporter defaultErrorReporter) {
        this.$r8$classId = 29;
        StripeDiffieHellmanKeyGenerator stripeDiffieHellmanKeyGenerator = new StripeDiffieHellmanKeyGenerator(defaultErrorReporter);
        this.initializer = stripeEphemeralKeyPairGenerator;
        this.value = stripeDiffieHellmanKeyGenerator;
    }

    public Lazy(SyncValueReader syncValueReader, MerchantConfigService merchantConfigService, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 10;
        this.initializer = syncValueReader;
        this.value = merchantConfigService;
        factory.create(MoneyFormatterConfig.COMPACT);
    }

    public Lazy(RealContactRepository realContactRepository, AppConfigManager appConfigManager, AppService appService, long j) {
        this.$r8$classId = 15;
        this.initializer = realContactRepository;
        this.value = appService;
        FlowKt.MutableSharedFlow$default(0, 50, null, 5);
    }

    public Lazy(boolean z, String str) {
        this.$r8$classId = 27;
        this.initializer = str;
        this.value = MapsKt__MapsJVMKt.mapOf(new Pair("is_ready", Boolean.valueOf(z)));
    }

    public /* synthetic */ Lazy(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.initializer = obj;
        this.value = obj2;
    }

    public Lazy(KotterKnifeKt$$ExternalSyntheticLambda1 kotterKnifeKt$$ExternalSyntheticLambda1) {
        this.$r8$classId = 0;
        this.initializer = kotterKnifeKt$$ExternalSyntheticLambda1;
        this.value = EMPTY.INSTANCE;
    }
}
