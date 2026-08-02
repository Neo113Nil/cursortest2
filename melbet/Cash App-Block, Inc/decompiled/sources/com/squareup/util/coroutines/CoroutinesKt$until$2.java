package com.squareup.util.coroutines;

import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.room.TransactorKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.Badger$collect$$inlined$combine$2$3;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.crypto.backend.balance.CryptoBalanceRepoKt$asMoney$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenPreludeNavigator;
import com.squareup.cash.investing.backend.real.PersistentEntityPriceCache;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$LimitsInlineMessageSource$Network;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$VersionedLimitsPagelet;
import com.squareup.cash.limits.backend.real.RealLimitsPageletStore;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.session.backend.Session;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor;
import com.squareup.cash.support.backend.real.RealSupportPhoneVerificationMonitor$setup$1$1$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageRequest;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse$Response$LimitsHubInlineMessage;
import com.squareup.protos.cash.cashlimitsxp.api.v1.LimitsHubService;
import com.squareup.protos.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireGrpcClient;
import com.squareup.wire.internal.GrpcKt;
import com.squareup.wire.internal.PipeDuplexRequestBody;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import okhttp3.Call;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class CoroutinesKt$until$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $function;
    public final /* synthetic */ int $r8$classId;
    public Object $signal;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$until$2(Function1 function1, StandaloneCoroutine standaloneCoroutine, JobImpl jobImpl, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$signal = function1;
        this.L$0 = standaloneCoroutine;
        this.$function = jobImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$function;
        switch (i) {
            case 0:
                CoroutinesKt$until$2 coroutinesKt$until$2 = new CoroutinesKt$until$2((Function1) this.$signal, (Function1) obj2, continuation, 0);
                coroutinesKt$until$2.L$0 = obj;
                return coroutinesKt$until$2;
            case 1:
                CoroutinesKt$until$2 coroutinesKt$until$22 = new CoroutinesKt$until$2((PersistentEntityPriceCache) this.$signal, (CryptoBalanceRepoKt$asMoney$$inlined$map$1) obj2, continuation, 1);
                coroutinesKt$until$22.L$0 = obj;
                return coroutinesKt$until$22;
            case 2:
                CoroutinesKt$until$2 coroutinesKt$until$23 = new CoroutinesKt$until$2((RealLimitsPageletStore) obj2, continuation, 2);
                coroutinesKt$until$23.L$0 = obj;
                return coroutinesKt$until$23;
            case 3:
                CoroutinesKt$until$2 coroutinesKt$until$24 = new CoroutinesKt$until$2(3, (Lifecycle) this.$signal, (LanguageDisclosureSetupTeardown) obj2, continuation);
                coroutinesKt$until$24.L$0 = obj;
                return coroutinesKt$until$24;
            case 4:
                CoroutinesKt$until$2 coroutinesKt$until$25 = new CoroutinesKt$until$2((Session) this.$signal, (String) obj2, continuation, 4);
                coroutinesKt$until$25.L$0 = obj;
                return coroutinesKt$until$25;
            case 5:
                return new CoroutinesKt$until$2((CoroutineContext) this.$signal, (CompositeSetupTeardown) obj2, this.L$0, continuation);
            case 6:
                CoroutinesKt$until$2 coroutinesKt$until$26 = new CoroutinesKt$until$2(6, (Lifecycle) this.$signal, (RealSupportPhoneVerificationMonitor) obj2, continuation);
                coroutinesKt$until$26.L$0 = obj;
                return coroutinesKt$until$26;
            case 7:
                CoroutinesKt$until$2 coroutinesKt$until$27 = new CoroutinesKt$until$2((RealSupportPhoneVerificationMonitor) obj2, continuation, 7);
                coroutinesKt$until$27.L$0 = obj;
                return coroutinesKt$until$27;
            case 8:
                return new CoroutinesKt$until$2((Function1) this.$signal, (StandaloneCoroutine) this.L$0, (JobImpl) obj2, continuation);
            case 9:
                CoroutinesKt$until$2 coroutinesKt$until$28 = new CoroutinesKt$until$2((Signal) this.$signal, (Flow) obj2, continuation, 9);
                coroutinesKt$until$28.L$0 = obj;
                return coroutinesKt$until$28;
            case 10:
                CoroutinesKt$until$2 coroutinesKt$until$29 = new CoroutinesKt$until$2((StateFlow) this.$signal, (CoroutinesKt$until$2) obj2, continuation, 10);
                coroutinesKt$until$29.L$0 = obj;
                return coroutinesKt$until$29;
            case 11:
                CoroutinesKt$until$2 coroutinesKt$until$210 = new CoroutinesKt$until$2((Function2) this.$signal, (Ref$ObjectRef) obj2, continuation, 11);
                coroutinesKt$until$210.L$0 = obj;
                return coroutinesKt$until$210;
            case 12:
                return new CoroutinesKt$until$2((StateFlow) this.L$0, (Function2) this.$signal, (Ref$ObjectRef) obj2, continuation, 12);
            case 13:
                return new CoroutinesKt$until$2((BufferedChannel) this.L$0, (RealGrpcStreamingCall) this.$signal, (Call) obj2, continuation, 13);
            case 14:
                CoroutinesKt$until$2 coroutinesKt$until$211 = new CoroutinesKt$until$2((Flow[]) this.$signal, continuation, (RealSupportPhoneVerificationMonitor$setup$1$1$1) obj2);
                coroutinesKt$until$211.L$0 = obj;
                return coroutinesKt$until$211;
            case 15:
                CoroutinesKt$until$2 coroutinesKt$until$212 = new CoroutinesKt$until$2((FlowCollector) this.$signal, (ChannelFlow) obj2, continuation, 15);
                coroutinesKt$until$212.L$0 = obj;
                return coroutinesKt$until$212;
            default:
                CoroutinesKt$until$2 coroutinesKt$until$213 = new CoroutinesKt$until$2((Function3) this.$signal, (FlowCollector) obj2, continuation, 16);
                coroutinesKt$until$213.L$0 = obj;
                return coroutinesKt$until$213;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((CoroutinesKt$until$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0262, code lost:
    
        if (r1 == r7) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0246, code lost:
    
        if (r3 == r7) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03da, code lost:
    
        if (r0.emit(null, r14) == r7) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0387, code lost:
    
        if (r2 == r7) goto L202;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ca  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object inlineMessage;
        ApiResult apiResult;
        LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet;
        ApiResult apiResult2;
        String str;
        Object invoke;
        int i = this.$r8$classId;
        Object obj2 = this.$function;
        ?? r5 = 0;
        r5 = 0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                try {
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JobImpl jobImpl = new JobImpl((Job) coroutineScope.getCoroutineContext().get(Job.Key.$$INSTANCE));
                        CoroutinesKt$until$2 coroutinesKt$until$2 = new CoroutinesKt$until$2((Function1) obj2, JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new PreferenceFlow$flow$1((Function1) this.$signal, jobImpl, r5, 19), 1), jobImpl, (Continuation) null);
                        this.L$0 = null;
                        this.label = 1;
                        Object withContext = JobKt.withContext(jobImpl, coroutinesKt$until$2, this);
                        r5 = withContext == coroutineSingletons ? coroutineSingletons : withContext;
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        r5 = obj;
                    }
                    break;
                } catch (CancellationException unused) {
                    break;
                }
            case 1:
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PersistentEntityPriceCache persistentEntityPriceCache = (PersistentEntityPriceCache) this.$signal;
                    AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$1 = new AnimationsKt$takeUntil$1$1(persistentEntityPriceCache.database.investingEntityPriceCacheQueries, persistentEntityPriceCache, (CryptoBalanceRepoKt$asMoney$$inlined$map$1) obj2, producerScope, (Continuation) null, 8);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(animationsKt$takeUntil$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LimitsHubService limitsHubService = ((RealLimitsPageletStore) obj2).limitsHubService;
                    GetInlineMessageRequest getInlineMessageRequest = new GetInlineMessageRequest(ByteString.EMPTY);
                    this.L$0 = flowCollector;
                    this.label = 1;
                    inlineMessage = limitsHubService.getInlineMessage(getInlineMessageRequest, this);
                    break;
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    inlineMessage = obj;
                } else if (i4 == 2) {
                    apiResult2 = (ApiResult) this.$signal;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = apiResult2;
                    if (apiResult instanceof ApiResult.Failure) {
                        this.L$0 = null;
                        this.$signal = apiResult;
                        this.label = 3;
                        break;
                    }
                } else if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                apiResult = (ApiResult) inlineMessage;
                if (apiResult instanceof ApiResult.Success) {
                    TransactorKt transactorKt = ((GetInlineMessageResponse) ((ApiResult.Success) apiResult).response).response;
                    GetInlineMessageResponse$Response$LimitsHubInlineMessage getInlineMessageResponse$Response$LimitsHubInlineMessage = transactorKt instanceof GetInlineMessageResponse$Response$LimitsHubInlineMessage ? (GetInlineMessageResponse$Response$LimitsHubInlineMessage) transactorKt : null;
                    GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = getInlineMessageResponse$Response$LimitsHubInlineMessage != null ? getInlineMessageResponse$Response$LimitsHubInlineMessage.value : null;
                    if (limitsHubInlineMessage != null) {
                        LimitsPageletStore$LimitsInlineMessageSource$Network limitsPageletStore$LimitsInlineMessageSource$Network = new LimitsPageletStore$LimitsInlineMessageSource$Network(limitsHubInlineMessage);
                        Long l = limitsHubInlineMessage.version;
                        if (l != null) {
                            limitsPageletStore$VersionedLimitsPagelet = new LimitsPageletStore$VersionedLimitsPagelet(limitsPageletStore$LimitsInlineMessageSource$Network, l.longValue());
                            this.L$0 = flowCollector;
                            this.$signal = apiResult;
                            this.label = 2;
                            if (flowCollector.emit(limitsPageletStore$VersionedLimitsPagelet, this) != coroutineSingletons3) {
                                apiResult2 = apiResult;
                                apiResult = apiResult2;
                            }
                            break;
                        }
                    }
                    limitsPageletStore$VersionedLimitsPagelet = null;
                    this.L$0 = flowCollector;
                    this.$signal = apiResult;
                    this.label = 2;
                    if (flowCollector.emit(limitsPageletStore$VersionedLimitsPagelet, this) != coroutineSingletons3) {
                    }
                }
                if (apiResult instanceof ApiResult.Failure) {
                }
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Lifecycle lifecycle = (Lifecycle) this.$signal;
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CashApp$onCreate$4$1$1 cashApp$onCreate$4$1$1 = new CashApp$onCreate$4$1$1((LanguageDisclosureSetupTeardown) obj2, r5, 27);
                    this.L$0 = null;
                    this.label = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, cashApp$onCreate$4$1$1, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                SessionManager sessionManager = (SessionManager) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (sessionManager.updateSession((Session) this.$signal, (String) obj2, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoroutineContext coroutineContext = (CoroutineContext) this.$signal;
                    MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2((CompositeSetupTeardown) obj2, this.L$0, (Continuation) null);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, mutatorMutex$mutate$2, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Lifecycle lifecycle2 = (Lifecycle) this.$signal;
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    Cache.AnonymousClass1 anonymousClass1 = new Cache.AnonymousClass1((RealSupportPhoneVerificationMonitor) obj2, r5, 6);
                    this.L$0 = null;
                    this.label = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle2, state2, anonymousClass1, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                RealSupportPhoneVerificationMonitor realSupportPhoneVerificationMonitor = (RealSupportPhoneVerificationMonitor) obj2;
                SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) this.L$0;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (supportPhoneConfirmation != null) {
                        str = supportPhoneConfirmation.verification_id;
                        if (str == null) {
                            str = "";
                        }
                        RealInitialScreenPreludeNavigator realInitialScreenPreludeNavigator = realSupportPhoneVerificationMonitor.initialScreenPreludeNavigator;
                        this.L$0 = null;
                        this.$signal = str;
                        this.label = 1;
                        Object join = realInitialScreenPreludeNavigator.initialScreenLoaded.join(this);
                        if (join != obj3) {
                            join = Unit.INSTANCE;
                            break;
                        }
                    }
                } else if (i9 == 1) {
                    str = (String) this.$signal;
                    SafeTrace.throwOnFailure(obj);
                } else if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    str = (String) this.$signal;
                    SafeTrace.throwOnFailure(obj);
                    RealRouter realRouter = realSupportPhoneVerificationMonitor.router;
                    ClientRoute.ViewSupportPhoneVerification viewSupportPhoneVerification = new ClientRoute.ViewSupportPhoneVerification(str);
                    RoutingParams routingParams = new RoutingParams(null, "support_sync_value", null, null, null, null, 509);
                    realRouter.getClass();
                    realRouter.clientRouteRouter.route(viewSupportPhoneVerification, routingParams);
                    break;
                }
                RealAppLockState realAppLockState = realSupportPhoneVerificationMonitor.appLockState;
                this.L$0 = null;
                this.$signal = str;
                this.label = 2;
                Object first = FlowKt.first(realAppLockState.stateFlow, new DataStoreImpl$data$1.AnonymousClass2(7), this);
                Object obj4 = first;
                if (first != obj3) {
                    obj4 = Unit.INSTANCE;
                    break;
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = (Function1) this.$signal;
                    this.label = 1;
                    invoke = function1.invoke(this);
                    if (invoke == coroutineSingletons8) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    invoke = obj;
                }
                ((StandaloneCoroutine) this.L$0).cancel(null);
                ((JobImpl) obj2).complete$1();
                break;
            case 9:
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Signal signal = (Signal) this.$signal;
                    FlowExtensionsKt$runUntil$1$1 flowExtensionsKt$runUntil$1$1 = new FlowExtensionsKt$runUntil$1$1((Flow) obj2, producerScope2, r5, 0);
                    this.L$0 = null;
                    this.label = 1;
                    if (StateFlowKt.until(signal, flowExtensionsKt$runUntil$1$1, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutinesKt$until$2 coroutinesKt$until$22 = (CoroutinesKt$until$2) obj2;
                StateFlow stateFlow = (StateFlow) this.$signal;
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
                    m.element = stateFlow.getValue();
                    Continuation continuation = null;
                    FlowQuery$asFlow$1 flowQuery$asFlow$1 = new FlowQuery$asFlow$1(m, StateFlowKt.launchUndispatchedWithRethrow(coroutineScope2, EmptyCoroutineContext.INSTANCE, new PreferenceFlow$flow$1(coroutinesKt$until$22, m, continuation, 21)), coroutinesKt$until$22, continuation, 15);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, flowQuery$asFlow$1, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                Object obj5 = this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowQuery$asFlow$1 flowQuery$asFlow$12 = new FlowQuery$asFlow$1((Function2) this.$signal, obj5, (Ref$ObjectRef) obj2, (Continuation) null, 16);
                    this.L$0 = null;
                    this.label = 1;
                    if (JobKt.coroutineScope(flowQuery$asFlow$12, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                Object obj6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow2 = (StateFlow) this.L$0;
                    CoroutinesKt$until$2 coroutinesKt$until$23 = new CoroutinesKt$until$2((Function2) this.$signal, (Ref$ObjectRef) obj2, (Continuation) r5, 11);
                    this.label = 1;
                    Object coroutineScope3 = JobKt.coroutineScope(new CoroutinesKt$until$2(stateFlow2, coroutinesKt$until$23, (Continuation) r5, 10), this);
                    Object obj7 = coroutineScope3;
                    if (coroutineScope3 != obj6) {
                        obj7 = Unit.INSTANCE;
                    }
                    if (obj7 == obj6) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = (BufferedChannel) this.L$0;
                    RealGrpcStreamingCall realGrpcStreamingCall = (RealGrpcStreamingCall) this.$signal;
                    PipeDuplexRequestBody pipeDuplexRequestBody = (PipeDuplexRequestBody) realGrpcStreamingCall.requestBody;
                    ((WireGrpcClient) realGrpcStreamingCall.grpcClient).getClass();
                    this.label = 1;
                    if (GrpcKt.writeToRequestBody(bufferedChannel, pipeDuplexRequestBody, Long.MAX_VALUE, (ProtoAdapter) ((GrpcMethod) realGrpcStreamingCall.method).requestAdapter, (Call) obj2, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 14:
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow[] flowArr = (Flow[]) this.$signal;
                    Badger$collect$$inlined$combine$2$3 badger$collect$$inlined$combine$2$3 = new Badger$collect$$inlined$combine$2$3((Continuation) r5, (RealSupportPhoneVerificationMonitor$setup$1$1$1) obj2, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (CombineKt.combineInternal(this, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, badger$collect$$inlined$combine$2$3, flowCollector2, flowArr) == coroutineSingletons13) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                Object obj8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowCollector flowCollector3 = (FlowCollector) this.$signal;
                    ReceiveChannel produceImpl = ((ChannelFlow) obj2).produceImpl(coroutineScope4);
                    this.L$0 = null;
                    this.label = 1;
                    Object emitAllImpl$FlowKt__ChannelsKt = FlowKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector3, produceImpl, true, this);
                    Object obj9 = emitAllImpl$FlowKt__ChannelsKt;
                    if (emitAllImpl$FlowKt__ChannelsKt != obj8) {
                        obj9 = Unit.INSTANCE;
                    }
                    if (obj9 == obj8) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (((Function3) this.$signal).invoke(coroutineScope5, (FlowCollector) obj2, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
        return r5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutinesKt$until$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$signal = obj2;
        this.$function = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutinesKt$until$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$signal = obj;
        this.$function = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutinesKt$until$2(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$function = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$until$2(CoroutineContext coroutineContext, CompositeSetupTeardown compositeSetupTeardown, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$signal = coroutineContext;
        this.$function = compositeSetupTeardown;
        this.L$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutinesKt$until$2(int i, Lifecycle lifecycle, IoActivitySetupTeardown ioActivitySetupTeardown, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$signal = lifecycle;
        this.$function = ioActivitySetupTeardown;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesKt$until$2(Flow[] flowArr, Continuation continuation, RealSupportPhoneVerificationMonitor$setup$1$1$1 realSupportPhoneVerificationMonitor$setup$1$1$1) {
        super(2, continuation);
        this.$r8$classId = 14;
        this.$signal = flowArr;
        this.$function = realSupportPhoneVerificationMonitor$setup$1$1$1;
    }
}
