package com.squareup.cash.wallet.data;

import android.os.Parcelable;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.postcard.app.CardDetails;
import com.squareup.protos.cash.postcard.app.GetCardDetailsRequest;
import com.squareup.protos.cash.postcard.app.GetCardDetailsResponse;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealIssuedCardManager implements IssuedCardManager {
    public static final CardTheme DEFAULT_BLACK_CARD_THEME;
    public final BlockersDataNavigator blockersNavigator;
    public final FlowStarter flowStarter;
    public final StateFlowImpl issuedCardFactory = FlowKt.MutableStateFlow(new IssuedCardFactory(null));
    public final PostcardClientService postcardAppService;
    public final SyncValueReader syncValueReader;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashAppCard.PhysicalCardOrderState.values().length];
            try {
                TextSize.Companion companion = CashAppCard.PhysicalCardOrderState.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        CardTheme.Identifier identifier = CardTheme.Identifier.BLACK;
        CardTheme.Gradient gradient = CardTheme.Gradient.DIAGONAL_LIGHT;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        DEFAULT_BLACK_CARD_THEME = new CardTheme("CT_blackFallback", "#FFFFFF", "#000000", "#2D2D2F", identifier, gradient, null, "#FFFFFF", "#333333", null, new CardTheme.CardCustomizationMargin("#000000", valueOf, valueOf, null, 8, null), null, Float.valueOf(0.15f), 12423964);
    }

    public RealIssuedCardManager(BlockersDataNavigator blockersDataNavigator, PostcardClientService postcardClientService, FlowStarter flowStarter, SyncValueReader syncValueReader) {
        this.blockersNavigator = blockersDataNavigator;
        this.postcardAppService = postcardClientService;
        this.flowStarter = flowStarter;
        this.syncValueReader = syncValueReader;
    }

    public final FinishSetupTileBadgeCounter getIssuedCardOrNull() {
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$1 = AndroidSyncValueSpecs.CashAppCard;
        SyncValueReader syncValueReader = this.syncValueReader;
        int i = 2;
        Continuation continuation = null;
        return FlowKt.combine(FlowKt.mapLatest(new Recomposer$join$2(i, continuation, 13), syncValueReader.getAllValues(androidSyncValueSpecs$Access$1)), new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.mapLatest(new Recomposer$join$2(i, continuation, 12), syncValueReader.getAllValues(AndroidSyncValueSpecs.CardThemeDefinitions)), 24), this.issuedCardFactory, new RealIssuedCardManager$getIssuedCardOrNull$1(this, null));
    }

    public final MoneyTabPresenter$models$lambda$17$$inlined$map$1 getIssuedCardState() {
        return new MoneyTabPresenter$models$lambda$17$$inlined$map$1(getIssuedCardOrNull(), 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e9, code lost:
    
        if (r9.invoke(r1, r3) == r4) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r10v6, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.squareup.cash.wallet.data.RealIssuedCardManager] */
    /* JADX WARN: Type inference failed for: r6v11, types: [app.cash.broadway.screen.Screen] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveCardDetails(WalletHomeScreen walletHomeScreen, WalletHomeScreen walletHomeScreen2, Function2 function2, Function0 function0, Function1 function1, ContinuationImpl continuationImpl) {
        RealIssuedCardManager$retrieveCardDetails$1 realIssuedCardManager$retrieveCardDetails$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        WalletHomeScreen walletHomeScreen3;
        WalletHomeScreen walletHomeScreen4;
        Function1 function12;
        Function0 function02;
        Object cardDetails;
        Function2 function22;
        BlockersData blockersData;
        Function0 function03;
        Function1 function13;
        WalletHomeScreen walletHomeScreen5;
        ApiResult apiResult;
        Function0 function04;
        BlockersData blockersData2;
        Function1 function14;
        Function0 function05;
        GetCardDetailsResponse getCardDetailsResponse;
        Function2 function23;
        int i2;
        ApiResult apiResult2;
        int i3;
        WalletHomeScreen walletHomeScreen6;
        CardDetails cardDetails2;
        ApiResult apiResult3;
        Screen screen;
        Function2 function24 = function2;
        if (continuationImpl instanceof RealIssuedCardManager$retrieveCardDetails$1) {
            realIssuedCardManager$retrieveCardDetails$1 = (RealIssuedCardManager$retrieveCardDetails$1) continuationImpl;
            int i4 = realIssuedCardManager$retrieveCardDetails$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                realIssuedCardManager$retrieveCardDetails$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = realIssuedCardManager$retrieveCardDetails$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIssuedCardManager$retrieveCardDetails$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Boolean bool = Boolean.TRUE;
                    realIssuedCardManager$retrieveCardDetails$1.L$0 = walletHomeScreen;
                    realIssuedCardManager$retrieveCardDetails$1.L$1 = walletHomeScreen2;
                    realIssuedCardManager$retrieveCardDetails$1.L$2 = function24;
                    realIssuedCardManager$retrieveCardDetails$1.L$3 = function0;
                    realIssuedCardManager$retrieveCardDetails$1.L$4 = function1;
                    realIssuedCardManager$retrieveCardDetails$1.label = 1;
                    if (function24.invoke(bool, realIssuedCardManager$retrieveCardDetails$1) != coroutineSingletons) {
                        walletHomeScreen3 = walletHomeScreen;
                        walletHomeScreen4 = walletHomeScreen2;
                        function12 = function1;
                        function02 = function0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        blockersData = realIssuedCardManager$retrieveCardDetails$1.L$5;
                        function13 = realIssuedCardManager$retrieveCardDetails$1.L$4;
                        function03 = realIssuedCardManager$retrieveCardDetails$1.L$3;
                        function22 = realIssuedCardManager$retrieveCardDetails$1.L$2;
                        ?? r10 = realIssuedCardManager$retrieveCardDetails$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        walletHomeScreen5 = r10;
                        apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            function04 = function03;
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        GetCardDetailsResponse getCardDetailsResponse2 = (GetCardDetailsResponse) ((ApiResult.Success) apiResult).response;
                        Boolean bool2 = Boolean.FALSE;
                        realIssuedCardManager$retrieveCardDetails$1.L$0 = null;
                        realIssuedCardManager$retrieveCardDetails$1.L$1 = walletHomeScreen5;
                        realIssuedCardManager$retrieveCardDetails$1.L$2 = function22;
                        realIssuedCardManager$retrieveCardDetails$1.L$3 = function03;
                        realIssuedCardManager$retrieveCardDetails$1.L$4 = function13;
                        realIssuedCardManager$retrieveCardDetails$1.L$5 = blockersData;
                        realIssuedCardManager$retrieveCardDetails$1.L$7 = apiResult;
                        realIssuedCardManager$retrieveCardDetails$1.L$8 = getCardDetailsResponse2;
                        realIssuedCardManager$retrieveCardDetails$1.I$0 = 0;
                        realIssuedCardManager$retrieveCardDetails$1.I$1 = 0;
                        realIssuedCardManager$retrieveCardDetails$1.label = 3;
                        if (function22.invoke(bool2, realIssuedCardManager$retrieveCardDetails$1) != coroutineSingletons) {
                            blockersData2 = blockersData;
                            function14 = function13;
                            function05 = function03;
                            getCardDetailsResponse = getCardDetailsResponse2;
                            function23 = function22;
                            i2 = 0;
                            apiResult2 = apiResult;
                            i3 = 0;
                            walletHomeScreen6 = walletHomeScreen5;
                            cardDetails2 = getCardDetailsResponse.card_details;
                            ResponseContext responseContext = getCardDetailsResponse.response_context;
                            if (cardDetails2 != null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function04 = realIssuedCardManager$retrieveCardDetails$1.L$3;
                            SafeTrace.throwOnFailure(obj);
                            function04.invoke();
                            return Unit.INSTANCE;
                        }
                        apiResult3 = realIssuedCardManager$retrieveCardDetails$1.L$7;
                        function14 = realIssuedCardManager$retrieveCardDetails$1.L$4;
                        function05 = realIssuedCardManager$retrieveCardDetails$1.L$3;
                        function23 = realIssuedCardManager$retrieveCardDetails$1.L$2;
                        screen = realIssuedCardManager$retrieveCardDetails$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        if (screen != null) {
                            function14.invoke(screen);
                        }
                        apiResult = apiResult3;
                        function22 = function23;
                        function04 = function05;
                        if (apiResult instanceof ApiResult.Failure) {
                            Boolean bool3 = Boolean.FALSE;
                            realIssuedCardManager$retrieveCardDetails$1.L$0 = null;
                            realIssuedCardManager$retrieveCardDetails$1.L$1 = null;
                            realIssuedCardManager$retrieveCardDetails$1.L$2 = null;
                            realIssuedCardManager$retrieveCardDetails$1.L$3 = function04;
                            realIssuedCardManager$retrieveCardDetails$1.L$4 = null;
                            realIssuedCardManager$retrieveCardDetails$1.L$5 = null;
                            realIssuedCardManager$retrieveCardDetails$1.L$7 = apiResult;
                            realIssuedCardManager$retrieveCardDetails$1.L$8 = null;
                            realIssuedCardManager$retrieveCardDetails$1.I$0 = 0;
                            realIssuedCardManager$retrieveCardDetails$1.I$1 = 0;
                            realIssuedCardManager$retrieveCardDetails$1.label = 5;
                        }
                        return Unit.INSTANCE;
                    }
                    int i5 = realIssuedCardManager$retrieveCardDetails$1.I$1;
                    int i6 = realIssuedCardManager$retrieveCardDetails$1.I$0;
                    getCardDetailsResponse = realIssuedCardManager$retrieveCardDetails$1.L$8;
                    apiResult2 = realIssuedCardManager$retrieveCardDetails$1.L$7;
                    BlockersData blockersData3 = realIssuedCardManager$retrieveCardDetails$1.L$5;
                    Function1 function15 = realIssuedCardManager$retrieveCardDetails$1.L$4;
                    Function0 function06 = realIssuedCardManager$retrieveCardDetails$1.L$3;
                    Function2 function25 = realIssuedCardManager$retrieveCardDetails$1.L$2;
                    ?? r6 = realIssuedCardManager$retrieveCardDetails$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i5;
                    function14 = function15;
                    function23 = function25;
                    blockersData2 = blockersData3;
                    walletHomeScreen6 = r6;
                    i2 = i6;
                    function05 = function06;
                    cardDetails2 = getCardDetailsResponse.card_details;
                    ResponseContext responseContext2 = getCardDetailsResponse.response_context;
                    if (cardDetails2 != null) {
                        responseContext2.getClass();
                        ScenarioPlan scenarioPlan = responseContext2.scenario_plan;
                        List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                        if (list != null && !list.isEmpty()) {
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            function14.invoke(this.blockersNavigator.getNext(blockersData2.exitScreen, blockersData2.updateFromResponseContext(responseContext2, false)));
                        }
                        apiResult = apiResult2;
                        function22 = function23;
                        function04 = function05;
                        if (apiResult instanceof ApiResult.Failure) {
                        }
                        return Unit.INSTANCE;
                    }
                    String str = cardDetails2.pan;
                    str.getClass();
                    cardDetails2.getClass();
                    String str2 = cardDetails2.security_code;
                    str2.getClass();
                    String str3 = cardDetails2.expiration;
                    str3.getClass();
                    realIssuedCardManager$retrieveCardDetails$1.L$0 = null;
                    realIssuedCardManager$retrieveCardDetails$1.L$1 = walletHomeScreen6;
                    realIssuedCardManager$retrieveCardDetails$1.L$2 = function23;
                    realIssuedCardManager$retrieveCardDetails$1.L$3 = function05;
                    realIssuedCardManager$retrieveCardDetails$1.L$4 = function14;
                    realIssuedCardManager$retrieveCardDetails$1.L$5 = null;
                    realIssuedCardManager$retrieveCardDetails$1.L$7 = apiResult2;
                    realIssuedCardManager$retrieveCardDetails$1.L$8 = null;
                    realIssuedCardManager$retrieveCardDetails$1.I$0 = i2;
                    realIssuedCardManager$retrieveCardDetails$1.I$1 = i3;
                    realIssuedCardManager$retrieveCardDetails$1.label = 4;
                    if (saveSensitiveData(str, str2, str3, realIssuedCardManager$retrieveCardDetails$1) != coroutineSingletons) {
                        apiResult3 = apiResult2;
                        screen = walletHomeScreen6;
                        if (screen != null) {
                        }
                        apiResult = apiResult3;
                        function22 = function23;
                        function04 = function05;
                        if (apiResult instanceof ApiResult.Failure) {
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                Function1 function16 = realIssuedCardManager$retrieveCardDetails$1.L$4;
                function02 = realIssuedCardManager$retrieveCardDetails$1.L$3;
                Function2 function26 = realIssuedCardManager$retrieveCardDetails$1.L$2;
                ?? r102 = realIssuedCardManager$retrieveCardDetails$1.L$1;
                WalletHomeScreen walletHomeScreen7 = realIssuedCardManager$retrieveCardDetails$1.L$0;
                SafeTrace.throwOnFailure(obj);
                function12 = function16;
                function24 = function26;
                walletHomeScreen3 = walletHomeScreen7;
                walletHomeScreen4 = r102;
                BlockersData startFlow$default = FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.SERVER_FLOW, walletHomeScreen3, null, ClientScenario.PLASMA, null, walletHomeScreen4 != null ? walletHomeScreen3 : walletHomeScreen4, null, null, null, 948);
                GetCardDetailsRequest getCardDetailsRequest = new GetCardDetailsRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), null, null, ByteString.EMPTY);
                ClientScenario clientScenario = startFlow$default.clientScenario;
                clientScenario.getClass();
                String str4 = startFlow$default.flowToken;
                realIssuedCardManager$retrieveCardDetails$1.L$0 = null;
                realIssuedCardManager$retrieveCardDetails$1.L$1 = walletHomeScreen4;
                realIssuedCardManager$retrieveCardDetails$1.L$2 = function24;
                realIssuedCardManager$retrieveCardDetails$1.L$3 = function02;
                realIssuedCardManager$retrieveCardDetails$1.L$4 = function12;
                realIssuedCardManager$retrieveCardDetails$1.L$5 = startFlow$default;
                realIssuedCardManager$retrieveCardDetails$1.label = 2;
                cardDetails = this.postcardAppService.getCardDetails(clientScenario, str4, getCardDetailsRequest, realIssuedCardManager$retrieveCardDetails$1);
                if (cardDetails != coroutineSingletons) {
                    function22 = function24;
                    blockersData = startFlow$default;
                    function03 = function02;
                    function13 = function12;
                    obj = cardDetails;
                    walletHomeScreen5 = walletHomeScreen4;
                    apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Success) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realIssuedCardManager$retrieveCardDetails$1 = new RealIssuedCardManager$retrieveCardDetails$1(this, continuationImpl);
        Object obj2 = realIssuedCardManager$retrieveCardDetails$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIssuedCardManager$retrieveCardDetails$1.label;
        if (i != 0) {
        }
        BlockersData startFlow$default2 = FlowStarter.startFlow$default(this.flowStarter, BlockersData.Flow.SERVER_FLOW, walletHomeScreen3, null, ClientScenario.PLASMA, null, walletHomeScreen4 != null ? walletHomeScreen3 : walletHomeScreen4, null, null, null, 948);
        GetCardDetailsRequest getCardDetailsRequest2 = new GetCardDetailsRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), null, null, ByteString.EMPTY);
        ClientScenario clientScenario2 = startFlow$default2.clientScenario;
        clientScenario2.getClass();
        String str42 = startFlow$default2.flowToken;
        realIssuedCardManager$retrieveCardDetails$1.L$0 = null;
        realIssuedCardManager$retrieveCardDetails$1.L$1 = walletHomeScreen4;
        realIssuedCardManager$retrieveCardDetails$1.L$2 = function24;
        realIssuedCardManager$retrieveCardDetails$1.L$3 = function02;
        realIssuedCardManager$retrieveCardDetails$1.L$4 = function12;
        realIssuedCardManager$retrieveCardDetails$1.L$5 = startFlow$default2;
        realIssuedCardManager$retrieveCardDetails$1.label = 2;
        cardDetails = this.postcardAppService.getCardDetails(clientScenario2, str42, getCardDetailsRequest2, realIssuedCardManager$retrieveCardDetails$1);
        if (cardDetails != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveSensitiveData(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RealIssuedCardManager$saveSensitiveData$1 realIssuedCardManager$saveSensitiveData$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealIssuedCardManager$saveSensitiveData$1) {
            realIssuedCardManager$saveSensitiveData$1 = (RealIssuedCardManager$saveSensitiveData$1) continuationImpl;
            int i2 = realIssuedCardManager$saveSensitiveData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIssuedCardManager$saveSensitiveData$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realIssuedCardManager$saveSensitiveData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIssuedCardManager$saveSensitiveData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter issuedCardOrNull = getIssuedCardOrNull();
                    realIssuedCardManager$saveSensitiveData$1.L$0 = str;
                    realIssuedCardManager$saveSensitiveData$1.L$1 = str2;
                    realIssuedCardManager$saveSensitiveData$1.L$2 = str3;
                    realIssuedCardManager$saveSensitiveData$1.label = 1;
                    obj = FlowKt.firstOrNull(issuedCardOrNull, realIssuedCardManager$saveSensitiveData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = realIssuedCardManager$saveSensitiveData$1.L$2;
                    str2 = realIssuedCardManager$saveSensitiveData$1.L$1;
                    str = realIssuedCardManager$saveSensitiveData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((IssuedCardFactory.IssuedCard) obj) != null) {
                    IssuedCardFactory issuedCardFactory = new IssuedCardFactory(new IssuedCardFactory.SensitiveCardData(new RedactedString(str), new RedactedString(str3), new RedactedString(str2)));
                    StateFlowImpl stateFlowImpl = this.issuedCardFactory;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, issuedCardFactory);
                }
                return Unit.INSTANCE;
            }
        }
        realIssuedCardManager$saveSensitiveData$1 = new RealIssuedCardManager$saveSensitiveData$1(this, continuationImpl);
        obj = realIssuedCardManager$saveSensitiveData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIssuedCardManager$saveSensitiveData$1.label;
        if (i != 0) {
        }
        if (((IssuedCardFactory.IssuedCard) obj) != null) {
        }
        return Unit.INSTANCE;
    }
}
