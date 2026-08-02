package com.stripe.android.core.networking;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation$State$SUCCESS;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.wire.GrpcMethod;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.utils.RealIsWorkManagerAvailable;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultAnalyticsRequestV2Executor {
    public final Context context;
    public final RealIsWorkManagerAvailable isWorkManagerAvailable;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final DefaultStripeNetworkClient networkClient;
    public final RealAnalyticsRequestV2Storage storage;

    public DefaultAnalyticsRequestV2Executor(Context context, DefaultStripeNetworkClient defaultStripeNetworkClient, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealAnalyticsRequestV2Storage realAnalyticsRequestV2Storage, RealIsWorkManagerAvailable realIsWorkManagerAvailable) {
        context.getClass();
        defaultStripeNetworkClient.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realAnalyticsRequestV2Storage.getClass();
        realIsWorkManagerAvailable.getClass();
        this.context = context;
        this.networkClient = defaultStripeNetworkClient;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.storage = realAnalyticsRequestV2Storage;
        this.isWorkManagerAvailable = realIsWorkManagerAvailable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (executeRequest(r8, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueue(AnalyticsRequestV2 analyticsRequestV2, ContinuationImpl continuationImpl) {
        DefaultAnalyticsRequestV2Executor$enqueue$1 defaultAnalyticsRequestV2Executor$enqueue$1;
        Object obj;
        int i;
        boolean z;
        if (continuationImpl instanceof DefaultAnalyticsRequestV2Executor$enqueue$1) {
            defaultAnalyticsRequestV2Executor$enqueue$1 = (DefaultAnalyticsRequestV2Executor$enqueue$1) continuationImpl;
            int i2 = defaultAnalyticsRequestV2Executor$enqueue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultAnalyticsRequestV2Executor$enqueue$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = defaultAnalyticsRequestV2Executor$enqueue$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultAnalyticsRequestV2Executor$enqueue$1.label;
                z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    defaultAnalyticsRequestV2Executor$enqueue$1.L$0 = analyticsRequestV2;
                    defaultAnalyticsRequestV2Executor$enqueue$1.label = 1;
                    obj = this.isWorkManagerAvailable.invoke(defaultAnalyticsRequestV2Executor$enqueue$1);
                } else if (i == 1) {
                    analyticsRequestV2 = defaultAnalyticsRequestV2Executor$enqueue$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    analyticsRequestV2 = defaultAnalyticsRequestV2Executor$enqueue$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    defaultAnalyticsRequestV2Executor$enqueue$1.L$0 = analyticsRequestV2;
                    defaultAnalyticsRequestV2Executor$enqueue$1.label = 2;
                    obj = enqueueRequest(analyticsRequestV2, defaultAnalyticsRequestV2Executor$enqueue$1);
                }
                z = false;
                if (!z) {
                    return Unit.INSTANCE;
                }
                defaultAnalyticsRequestV2Executor$enqueue$1.L$0 = null;
                defaultAnalyticsRequestV2Executor$enqueue$1.label = 3;
            }
        }
        defaultAnalyticsRequestV2Executor$enqueue$1 = new DefaultAnalyticsRequestV2Executor$enqueue$1(this, continuationImpl);
        obj = defaultAnalyticsRequestV2Executor$enqueue$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultAnalyticsRequestV2Executor$enqueue$1.label;
        z = true;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(3:24|(1:26)|23)|20|21))|29|6|7|(0)(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e8, code lost:
    
        r1 = kotlin.Result.Companion;
        r1 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueRequest(AnalyticsRequestV2 analyticsRequestV2, ContinuationImpl continuationImpl) {
        DefaultAnalyticsRequestV2Executor$enqueueRequest$1 defaultAnalyticsRequestV2Executor$enqueueRequest$1;
        int i;
        WorkManagerImpl workManagerImpl;
        if (continuationImpl instanceof DefaultAnalyticsRequestV2Executor$enqueueRequest$1) {
            defaultAnalyticsRequestV2Executor$enqueueRequest$1 = (DefaultAnalyticsRequestV2Executor$enqueueRequest$1) continuationImpl;
            int i2 = defaultAnalyticsRequestV2Executor$enqueueRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultAnalyticsRequestV2Executor$enqueueRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultAnalyticsRequestV2Executor$enqueueRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultAnalyticsRequestV2Executor$enqueueRequest$1.label;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Context context = this.context;
                    context.getClass();
                    WorkManagerImpl instance$1 = WorkManagerImpl.getInstance$1(context);
                    defaultAnalyticsRequestV2Executor$enqueueRequest$1.L$1 = instance$1;
                    defaultAnalyticsRequestV2Executor$enqueueRequest$1.label = 1;
                    RealAnalyticsRequestV2Storage realAnalyticsRequestV2Storage = this.storage;
                    Object withContext = JobKt.withContext(realAnalyticsRequestV2Storage.dispatcher, new InquiryViewModel.AnonymousClass1(analyticsRequestV2, realAnalyticsRequestV2Storage, continuation, i3), defaultAnalyticsRequestV2Executor$enqueueRequest$1);
                    if (withContext != coroutineSingletons) {
                        obj = withContext;
                        workManagerImpl = instance$1;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    obj.getClass();
                    Object failure = (Operation$State$SUCCESS) obj;
                    Result.Companion companion = Result.Companion;
                    return Boolean.valueOf(!(failure instanceof Result.Failure));
                }
                workManagerImpl = defaultAnalyticsRequestV2Executor$enqueueRequest$1.L$1;
                SafeTrace.throwOnFailure(obj);
                String str = (String) obj;
                DefaultStripeNetworkClient defaultStripeNetworkClient = SendAnalyticsRequestV2Worker.networkClient;
                str.getClass();
                Pair[] pairArr = {new Pair("data", str)};
                Data.Builder builder = new Data.Builder();
                Pair pair = pairArr[0];
                builder.put((String) pair.first, pair.second);
                Data build = builder.build();
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                Constraints constraints = new Constraints(new NetworkRequestCompat(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
                GrpcMethod grpcMethod = new GrpcMethod(SendAnalyticsRequestV2Worker.class);
                ((Set) grpcMethod.responseAdapter).add("SendAnalyticsRequestV2Worker");
                WorkSpec workSpec = (WorkSpec) grpcMethod.requestAdapter;
                workSpec.input = build;
                workSpec.constraints = constraints;
                OneTimeWorkRequest build2 = grpcMethod.build();
                Result.Companion companion2 = Result.Companion;
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) workManagerImpl.enqueue(build2).values;
                defaultAnalyticsRequestV2Executor$enqueueRequest$1.L$1 = null;
                defaultAnalyticsRequestV2Executor$enqueueRequest$1.label = 2;
                obj = RecipientAvatars.await(callbackToFutureAdapter$SafeFuture, defaultAnalyticsRequestV2Executor$enqueueRequest$1);
            }
        }
        defaultAnalyticsRequestV2Executor$enqueueRequest$1 = new DefaultAnalyticsRequestV2Executor$enqueueRequest$1(this, continuationImpl);
        Object obj2 = defaultAnalyticsRequestV2Executor$enqueueRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultAnalyticsRequestV2Executor$enqueueRequest$1.label;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        DefaultStripeNetworkClient defaultStripeNetworkClient2 = SendAnalyticsRequestV2Worker.networkClient;
        str2.getClass();
        Pair[] pairArr2 = {new Pair("data", str2)};
        Data.Builder builder2 = new Data.Builder();
        Pair pair2 = pairArr2[0];
        builder2.put((String) pair2.first, pair2.second);
        Data build3 = builder2.build();
        NetworkType networkType2 = NetworkType.NOT_REQUIRED;
        Constraints constraints2 = new Constraints(new NetworkRequestCompat(null), NetworkType.CONNECTED, false, false, false, false, -1L, -1L, CollectionsKt.toSet(new LinkedHashSet()));
        GrpcMethod grpcMethod2 = new GrpcMethod(SendAnalyticsRequestV2Worker.class);
        ((Set) grpcMethod2.responseAdapter).add("SendAnalyticsRequestV2Worker");
        WorkSpec workSpec2 = (WorkSpec) grpcMethod2.requestAdapter;
        workSpec2.input = build3;
        workSpec2.constraints = constraints2;
        OneTimeWorkRequest build22 = grpcMethod2.build();
        Result.Companion companion22 = Result.Companion;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture2 = (CallbackToFutureAdapter$SafeFuture) workManagerImpl.enqueue(build22).values;
        defaultAnalyticsRequestV2Executor$enqueueRequest$1.L$1 = null;
        defaultAnalyticsRequestV2Executor$enqueueRequest$1.label = 2;
        obj2 = RecipientAvatars.await(callbackToFutureAdapter$SafeFuture2, defaultAnalyticsRequestV2Executor$enqueueRequest$1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25)(1:26))|12|13|(1:15)|16|17))|29|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r7 = kotlin.Result.Companion;
        r6 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(AnalyticsRequestV2 analyticsRequestV2, ContinuationImpl continuationImpl) {
        DefaultAnalyticsRequestV2Executor$executeRequest$1 defaultAnalyticsRequestV2Executor$executeRequest$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        AnalyticsRequestV2 analyticsRequestV22;
        DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor;
        if (continuationImpl instanceof DefaultAnalyticsRequestV2Executor$executeRequest$1) {
            defaultAnalyticsRequestV2Executor$executeRequest$1 = (DefaultAnalyticsRequestV2Executor$executeRequest$1) continuationImpl;
            int i2 = defaultAnalyticsRequestV2Executor$executeRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultAnalyticsRequestV2Executor$executeRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultAnalyticsRequestV2Executor$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultAnalyticsRequestV2Executor$executeRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    DefaultStripeNetworkClient defaultStripeNetworkClient = this.networkClient;
                    defaultAnalyticsRequestV2Executor$executeRequest$1.L$0 = analyticsRequestV2;
                    defaultAnalyticsRequestV2Executor$executeRequest$1.L$1 = this;
                    defaultAnalyticsRequestV2Executor$executeRequest$1.label = 1;
                    if (defaultStripeNetworkClient.executeRequest(analyticsRequestV2, defaultAnalyticsRequestV2Executor$executeRequest$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    analyticsRequestV22 = analyticsRequestV2;
                    defaultAnalyticsRequestV2Executor = this;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defaultAnalyticsRequestV2Executor = defaultAnalyticsRequestV2Executor$executeRequest$1.L$1;
                    analyticsRequestV22 = defaultAnalyticsRequestV2Executor$executeRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                defaultAnalyticsRequestV2Executor.logger.debug("EVENT: " + analyticsRequestV22.eventName);
                Object failure = Unit.INSTANCE;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    this.logger.error("Exception while making analytics request", m4120exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }
        defaultAnalyticsRequestV2Executor$executeRequest$1 = new DefaultAnalyticsRequestV2Executor$executeRequest$1(this, continuationImpl);
        Object obj2 = defaultAnalyticsRequestV2Executor$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultAnalyticsRequestV2Executor$executeRequest$1.label;
        if (i != 0) {
        }
        defaultAnalyticsRequestV2Executor.logger.debug("EVENT: " + analyticsRequestV22.eventName);
        Object failure2 = Unit.INSTANCE;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
