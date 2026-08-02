package com.squareup.cash.support.backend.real;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter$models$3$1;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionService;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityGetRequest;
import com.squareup.protos.cash.activity.api.v1.ActivityGetResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealSupportTransactionService implements SupportTransactionService {
    public final LinkedHashMap activityRowCache = new LinkedHashMap();
    public final ActivityClientService appService;
    public final ErrorReporter errorReporter;
    public final Flow javaScripter;
    public final CoroutineContext jsDispatcher;
    public final SessionManager sessionManager;
    public final Flow signOutSignal;
    public final SupportTransactionMapper supportTransactionMapper;
    public final TimeoutConfig timeoutConfig;

    /* renamed from: com.squareup.cash.support.backend.real.RealSupportTransactionService$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ RealSupportTransactionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RealSupportTransactionService realSupportTransactionService, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = realSupportTransactionService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            RealSupportTransactionService realSupportTransactionService = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(realSupportTransactionService, continuation, 0);
                default:
                    return new AnonymousClass1(realSupportTransactionService, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            RealSupportTransactionService realSupportTransactionService = this.this$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Flow flow = realSupportTransactionService.signOutSignal;
                        RingtoneView.AnonymousClass1.C00651 c00651 = new RingtoneView.AnonymousClass1.C00651(realSupportTransactionService, 29);
                        this.label = 1;
                        if (flow.collect(c00651, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = realSupportTransactionService.javaScripter;
                    this.label = 1;
                    Object first = FlowKt.first(flow2, this);
                    return first == coroutineSingletons2 ? coroutineSingletons2 : first;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/support/backend/real/RealSupportTransactionService$SupportTransactionLoadingError", "Lcom/squareup/cash/observability/types/ReportedError;", "jvm"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class SupportTransactionLoadingError extends ReportedError {
        public final String message;
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Support.INSTANCE);
        public final Map metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("", Thread$State$EnumUnboxingLocalUtility.m("owner_id", "#cash-support-android"));

        public SupportTransactionLoadingError(String str) {
            this.message = str;
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    public final class TimeoutConfig {
        public final long paymentHistoryRenderTimeoutInMilliSeconds;

        public TimeoutConfig(long j) {
            this.paymentHistoryRenderTimeoutInMilliSeconds = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeoutConfig) && this.paymentHistoryRenderTimeoutInMilliSeconds == ((TimeoutConfig) obj).paymentHistoryRenderTimeoutInMilliSeconds;
        }

        public final int hashCode() {
            return Long.hashCode(this.paymentHistoryRenderTimeoutInMilliSeconds) + (Long.hashCode(2000L) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.paymentHistoryRenderTimeoutInMilliSeconds, "TimeoutConfig(getJsScripterTimeoutInMilliSeconds=2000, paymentHistoryRenderTimeoutInMilliSeconds=", ")");
        }
    }

    public RealSupportTransactionService(ActivityClientService activityClientService, SessionManager sessionManager, Flow flow, ErrorReporter errorReporter, TimeoutConfig timeoutConfig, SupportTransactionMapper supportTransactionMapper, Flow flow2, CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        this.appService = activityClientService;
        this.sessionManager = sessionManager;
        this.javaScripter = flow;
        this.errorReporter = errorReporter;
        this.timeoutConfig = timeoutConfig;
        this.supportTransactionMapper = supportTransactionMapper;
        this.signOutSignal = flow2;
        this.jsDispatcher = coroutineContext;
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this, null, 0), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSupportTransaction(String str, ContinuationImpl continuationImpl) {
        RealSupportTransactionService$getSupportTransaction$1 realSupportTransactionService$getSupportTransaction$1;
        int i;
        ApiResult apiResult;
        ActivityRow.Body body;
        ApiResult apiResult2;
        if (continuationImpl instanceof RealSupportTransactionService$getSupportTransaction$1) {
            realSupportTransactionService$getSupportTransaction$1 = (RealSupportTransactionService$getSupportTransaction$1) continuationImpl;
            int i2 = realSupportTransactionService$getSupportTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportTransactionService$getSupportTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportTransactionService$getSupportTransaction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportTransactionService$getSupportTransaction$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ActivityToken activityToken = new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN, PlatformKt.activeAccountToken(this.sessionManager), (String) (z ? 1 : 0), 12);
                    ActivityGetRequest activityGetRequest = new ActivityGetRequest(new ActivityItemGlobalId(new ActivityItemGlobalId.ActivityId.ActivityRowId(str), activityToken, 4), activityToken, ActivityScope.SUPPORT_TRANSACTION);
                    realSupportTransactionService$getSupportTransaction$1.label = 1;
                    obj = this.appService.activityGet(activityGetRequest, realSupportTransactionService$getSupportTransaction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ApiResult.Success success = realSupportTransactionService$getSupportTransaction$1.L$3;
                        SafeTrace.throwOnFailure(obj);
                        apiResult2 = success;
                        SupportTransaction supportTransaction = (SupportTransaction) obj;
                        if (supportTransaction != null) {
                            ApiResult.Success success2 = (ApiResult.Success) apiResult2;
                            ActivityRow activityRow = ((ActivityGetResponse) success2.response).activityRow;
                            activityRow.getClass();
                            ActivityRow.Body body2 = activityRow.body;
                            body2.getClass();
                            ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow = body2 instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body2 : null;
                            PaymentHistoryInputsRow value = paymentHistoryInputsRow != null ? paymentHistoryInputsRow.getValue() : null;
                            value.getClass();
                            String str2 = value.entity_id;
                            if (str2 == null) {
                                str2 = "unknown_entity_id";
                            }
                            ActivityRow activityRow2 = ((ActivityGetResponse) success2.response).activityRow;
                            activityRow2.getClass();
                            this.activityRowCache.put(str2, activityRow2);
                            return new SupportTransactionService.SupportTransactionResult.Success(supportTransaction);
                        }
                        return SupportTransactionService.SupportTransactionResult.Failure.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success3 = (ApiResult.Success) apiResult;
                    ActivityRow activityRow3 = ((ActivityGetResponse) success3.response).activityRow;
                    if (activityRow3 != null && (body = activityRow3.body) != null) {
                        ActivityRow.Body.PaymentHistoryInputsRow paymentHistoryInputsRow2 = body instanceof ActivityRow.Body.PaymentHistoryInputsRow ? (ActivityRow.Body.PaymentHistoryInputsRow) body : null;
                        PaymentHistoryInputsRow value2 = paymentHistoryInputsRow2 != null ? paymentHistoryInputsRow2.getValue() : null;
                        if (value2 != null) {
                            realSupportTransactionService$getSupportTransaction$1.L$3 = success3;
                            realSupportTransactionService$getSupportTransaction$1.label = 2;
                            obj = toSupportTransaction(value2, realSupportTransactionService$getSupportTransaction$1);
                            apiResult2 = apiResult;
                        }
                    }
                }
                return SupportTransactionService.SupportTransactionResult.Failure.INSTANCE;
            }
        }
        realSupportTransactionService$getSupportTransaction$1 = new RealSupportTransactionService$getSupportTransaction$1(this, continuationImpl);
        Object obj3 = realSupportTransactionService$getSupportTransaction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportTransactionService$getSupportTransaction$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
        return SupportTransactionService.SupportTransactionResult.Failure.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toSupportTransaction(List list, ContinuationImpl continuationImpl) {
        RealSupportTransactionService$toSupportTransaction$1 realSupportTransactionService$toSupportTransaction$1;
        int i;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter;
        if (continuationImpl instanceof RealSupportTransactionService$toSupportTransaction$1) {
            realSupportTransactionService$toSupportTransaction$1 = (RealSupportTransactionService$toSupportTransaction$1) continuationImpl;
            int i2 = realSupportTransactionService$toSupportTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportTransactionService$toSupportTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportTransactionService$toSupportTransaction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportTransactionService$toSupportTransaction$1.label;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                ErrorReporter errorReporter = this.errorReporter;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(2000L, DurationUnit.MILLISECONDS);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, continuation, i3);
                    realSupportTransactionService$toSupportTransaction$1.L$0 = list;
                    realSupportTransactionService$toSupportTransaction$1.label = 1;
                    obj = JobKt.m4185withTimeoutOrNullKLykuaI(duration, anonymousClass1, realSupportTransactionService$toSupportTransaction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = realSupportTransactionService$toSupportTransaction$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        List list3 = (List) obj;
                        if (list3 != null) {
                            return list3;
                        }
                        errorReporter.report(new SupportTransactionLoadingError("Support transaction load timeout"), defaultSamplingStrategy);
                        return EmptyList.INSTANCE;
                    }
                    list = realSupportTransactionService$toSupportTransaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj;
                if (ziplineHistoryDataJavaScripter != null) {
                    errorReporter.report(new SupportTransactionLoadingError("Support transaction get javaScripter timeout"), defaultSamplingStrategy);
                    return EmptyList.INSTANCE;
                }
                Duration.Companion companion2 = Duration.Companion;
                long duration2 = DurationKt.toDuration(this.timeoutConfig.paymentHistoryRenderTimeoutInMilliSeconds, DurationUnit.MILLISECONDS);
                FormBlockerPresenter$models$3$1 formBlockerPresenter$models$3$1 = new FormBlockerPresenter$models$3$1(list, this, ziplineHistoryDataJavaScripter, null);
                realSupportTransactionService$toSupportTransaction$1.L$0 = null;
                realSupportTransactionService$toSupportTransaction$1.label = 2;
                obj = JobKt.m4185withTimeoutOrNullKLykuaI(duration2, formBlockerPresenter$models$3$1, realSupportTransactionService$toSupportTransaction$1);
            }
        }
        realSupportTransactionService$toSupportTransaction$1 = new RealSupportTransactionService$toSupportTransaction$1(this, continuationImpl);
        Object obj2 = realSupportTransactionService$toSupportTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportTransactionService$toSupportTransaction$1.label;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy2 = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        ErrorReporter errorReporter2 = this.errorReporter;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ziplineHistoryDataJavaScripter = (ZiplineHistoryDataJavaScripter) obj2;
        if (ziplineHistoryDataJavaScripter != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toSupportTransaction(PaymentHistoryInputsRow paymentHistoryInputsRow, ContinuationImpl continuationImpl) {
        RealSupportTransactionService$toSupportTransaction$2 realSupportTransactionService$toSupportTransaction$2;
        int i;
        if (continuationImpl instanceof RealSupportTransactionService$toSupportTransaction$2) {
            realSupportTransactionService$toSupportTransaction$2 = (RealSupportTransactionService$toSupportTransaction$2) continuationImpl;
            int i2 = realSupportTransactionService$toSupportTransaction$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSupportTransactionService$toSupportTransaction$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSupportTransactionService$toSupportTransaction$2.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSupportTransactionService$toSupportTransaction$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(paymentHistoryInputsRow);
                    realSupportTransactionService$toSupportTransaction$2.label = 1;
                    obj = toSupportTransaction(listOf, realSupportTransactionService$toSupportTransaction$2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return CollectionsKt.firstOrNull((List) obj);
            }
        }
        realSupportTransactionService$toSupportTransaction$2 = new RealSupportTransactionService$toSupportTransaction$2(this, continuationImpl);
        Object obj3 = realSupportTransactionService$toSupportTransaction$2.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSupportTransactionService$toSupportTransaction$2.label;
        if (i != 0) {
        }
        return CollectionsKt.firstOrNull((List) obj3);
    }
}
