package com.squareup.cash.wallet.presenters;

import androidx.compose.runtime.MutableState;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.cdf.minttag.DeviceType;
import com.squareup.cash.cdf.minttag.MintTagLockCompleted;
import com.squareup.cash.cdf.minttag.MintTagLockFailed;
import com.squareup.cash.cdf.minttag.MintTagUnlockCompleted;
import com.squareup.cash.cdf.minttag.MintTagUnlockFailed;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardLockPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ DeviceType $deviceType;
    public final /* synthetic */ MutableState $errorDevices$delegate;
    public final /* synthetic */ String $flowToken;
    public final /* synthetic */ Flow$Type $flowType;
    public final /* synthetic */ boolean $isTag;
    public final /* synthetic */ MutableState $loadingDevices$delegate;
    public final /* synthetic */ MutableState $optimisticOverrides$delegate;
    public final /* synthetic */ boolean $setLocked;
    public final /* synthetic */ long $startTimeMs;
    public BlockersData L$0;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardLockPresenter$models$1$1(CardLockPresenter cardLockPresenter, String str, boolean z, long j, boolean z2, DeviceType deviceType, String str2, Flow$Type flow$Type, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardLockPresenter;
        this.$deviceId = str;
        this.$isTag = z;
        this.$startTimeMs = j;
        this.$setLocked = z2;
        this.$deviceType = deviceType;
        this.$flowToken = str2;
        this.$flowType = flow$Type;
        this.$loadingDevices$delegate = mutableState;
        this.$optimisticOverrides$delegate = mutableState2;
        this.$errorDevices$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardLockPresenter$models$1$1(this.this$0, this.$deviceId, this.$isTag, this.$startTimeMs, this.$setLocked, this.$deviceType, this.$flowToken, this.$flowType, this.$loadingDevices$delegate, this.$optimisticOverrides$delegate, this.$errorDevices$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardLockPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockersData startFlow$default;
        Object withContext;
        ScenarioPlan scenarioPlan;
        CardLockPresenter cardLockPresenter = this.this$0;
        RealDeviceLockAnimationBus realDeviceLockAnimationBus = (RealDeviceLockAnimationBus) cardLockPresenter.deviceLockAnimationBus;
        Analytics analytics = (Analytics) cardLockPresenter.analytics;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        List<BlockerDescriptor> list = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            startFlow$default = FlowStarter.startFlow$default((FlowStarter) cardLockPresenter.flowStarter, BlockersData.Flow.SERVER_FLOW, new WalletHomeScreen(7, (Integer) null, (String) null), null, ClientScenario.PLASMA, null, new WalletHomeScreen(7, (Integer) null, (String) null), new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.CARD_TAB, (String) null, 6), null, new KClasses$$Lambda$2(this.$flowType, 21), EnumC0170g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            CoroutineContext coroutineContext = (CoroutineContext) cardLockPresenter.ioDispatcher;
            TaxWebAppPresenter$models$1$1 taxWebAppPresenter$models$1$1 = new TaxWebAppPresenter$models$1$1(cardLockPresenter, this.$deviceId, this.$flowType, startFlow$default, (Continuation) null, 28);
            this.L$0 = startFlow$default;
            this.label = 1;
            withContext = JobKt.withContext(coroutineContext, taxWebAppPresenter$models$1$1, this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            BlockersData blockersData = this.L$0;
            SafeTrace.throwOnFailure(obj);
            startFlow$default = blockersData;
            withContext = obj;
        }
        ApiResult apiResult = (ApiResult) withContext;
        MutableState mutableState = this.$loadingDevices$delegate;
        Map map = (Map) mutableState.getValue();
        String str = this.$deviceId;
        mutableState.setValue(MapsKt__MapsKt.minus(map, str));
        boolean z = apiResult instanceof ApiResult.Success;
        boolean z2 = this.$setLocked;
        boolean z3 = this.$isTag;
        String str2 = this.$flowToken;
        DeviceType deviceType = this.$deviceType;
        if (z) {
            if (z3) {
                long currentTimeMillis = System.currentTimeMillis() - this.$startTimeMs;
                if (z2) {
                    analytics.track(new MintTagLockCompleted(deviceType, str, str2, new Long(currentTimeMillis)), null);
                } else {
                    analytics.track(new MintTagUnlockCompleted(deviceType, str, str2, new Long(currentTimeMillis)), null);
                }
            }
            ApiResult.Success success = (ApiResult.Success) apiResult;
            Screen flowSuccessScreen = ((FlowNavigationHelper) cardLockPresenter.flowNavigationHelper).getFlowSuccessScreen(new WalletHomeScreen(7, (Integer) null, (String) null), success, startFlow$default, true);
            ResponseContext responseContext = ((GetFlowResponse) success.response).response_context;
            if (responseContext != null && (scenarioPlan = responseContext.scenario_plan) != null) {
                list = scenarioPlan.blocker_descriptors;
            }
            List<BlockerDescriptor> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                realDeviceLockAnimationBus.onToggleCompleted(str);
                cardLockPresenter.navigator.goTo(flowSuccessScreen);
            }
        } else {
            if (!(apiResult instanceof ApiResult.Failure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (z3) {
                String obj2 = apiResult.toString();
                if (z2) {
                    analytics.track(new MintTagLockFailed(deviceType, str, str2, obj2), null);
                } else {
                    analytics.track(new MintTagUnlockFailed(deviceType, str, str2, obj2), null);
                }
            }
            realDeviceLockAnimationBus.onToggleCompleted(str);
            MutableState mutableState2 = this.$optimisticOverrides$delegate;
            mutableState2.setValue(MapsKt__MapsKt.minus((Map) mutableState2.getValue(), str));
            MutableState mutableState3 = this.$errorDevices$delegate;
            mutableState3.setValue(MapsKt__MapsKt.plus((Map) mutableState3.getValue(), new Pair(str, TextUtilsCompat.errorMessaging((AndroidStringManager) cardLockPresenter.stringManager, (ApiResult.Failure) apiResult, null).message)));
        }
        return Unit.INSTANCE;
    }
}
