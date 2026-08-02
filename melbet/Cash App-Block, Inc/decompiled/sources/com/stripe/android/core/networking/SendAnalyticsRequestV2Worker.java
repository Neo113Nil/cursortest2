package com.stripe.android.core.networking;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.android.core.exception.InvalidRequestException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {
    public static final DefaultStripeNetworkClient networkClient = new DefaultStripeNetworkClient(null, null, 31);
    public static final MarkdownParser$$ExternalSyntheticLambda0 storage = new MarkdownParser$$ExternalSyntheticLambda0(5);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(2:18|(2:24|25)(2:22|23)))(2:27|28))(1:29))(2:45|(2:47|48)(3:49|(1:51)|43))|30|(2:32|33)(6:34|(1:36)(1:44)|37|(1:39)|40|41)))|55|6|7|(0)(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        if (r15 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        r0 = kotlin.Result.Companion;
        r15 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation continuation) {
        SendAnalyticsRequestV2Worker$doWork$1 sendAnalyticsRequestV2Worker$doWork$1;
        int i;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker;
        int i2;
        AnalyticsRequestV2 analyticsRequestV2;
        if (continuation instanceof SendAnalyticsRequestV2Worker$doWork$1) {
            sendAnalyticsRequestV2Worker$doWork$1 = (SendAnalyticsRequestV2Worker$doWork$1) continuation;
            int i3 = sendAnalyticsRequestV2Worker$doWork$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                sendAnalyticsRequestV2Worker$doWork$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = sendAnalyticsRequestV2Worker$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sendAnalyticsRequestV2Worker$doWork$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String string2 = getInputData().getString("data");
                    if (string2 == null) {
                        return new ListenableWorker.Result.Failure();
                    }
                    Context applicationContext = getApplicationContext();
                    applicationContext.getClass();
                    RealAnalyticsRequestV2Storage realAnalyticsRequestV2Storage = (RealAnalyticsRequestV2Storage) storage.invoke(applicationContext);
                    sendAnalyticsRequestV2Worker$doWork$1.L$0 = this;
                    sendAnalyticsRequestV2Worker$doWork$1.I$0 = 0;
                    sendAnalyticsRequestV2Worker$doWork$1.label = 1;
                    obj = JobKt.withContext(realAnalyticsRequestV2Storage.dispatcher, new WorkflowNode$tick$1$1(realAnalyticsRequestV2Storage, string2, continuation2, 29), sendAnalyticsRequestV2Worker$doWork$1);
                    if (obj != coroutineSingletons) {
                        sendAnalyticsRequestV2Worker = this;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    Object failure = (StripeResponse) obj;
                    Result.Companion companion = Result.Companion;
                    Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                    if (m4120exceptionOrNullimpl != null) {
                        return ((m4120exceptionOrNullimpl instanceof InvalidRequestException) || getRunAttemptCount() >= 4) ? new ListenableWorker.Result.Failure() : new ListenableWorker.Result.Retry();
                    }
                    return ListenableWorker.Result.success();
                }
                i2 = sendAnalyticsRequestV2Worker$doWork$1.I$0;
                sendAnalyticsRequestV2Worker = sendAnalyticsRequestV2Worker$doWork$1.L$0;
                SafeTrace.throwOnFailure(obj);
                analyticsRequestV2 = (AnalyticsRequestV2) obj;
                if (analyticsRequestV2 != null) {
                    return new ListenableWorker.Result.Failure();
                }
                int runAttemptCount = sendAnalyticsRequestV2Worker.getRunAttemptCount();
                Map map = JsonUtilsKt.toMap(analyticsRequestV2.params);
                Duration.Companion companion2 = Duration.Companion;
                AnalyticsRequestV2 analyticsRequestV22 = new AnalyticsRequestV2(analyticsRequestV2.eventName, analyticsRequestV2.clientId, analyticsRequestV2.origin, analyticsRequestV2.created, JsonUtilsKt.toJsonElement(MapsKt__MapsKt.plus(map, MapsKt__MapsKt.mapOf(new Pair("uses_work_manager", Boolean.TRUE), new Pair("is_retry", Boolean.valueOf(runAttemptCount > 0)), new Pair("delayed", Boolean.valueOf(Duration.m4175toDoubleimpl(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS) - analyticsRequestV2.created > 5.0d))))));
                Result.Companion companion3 = Result.Companion;
                DefaultStripeNetworkClient defaultStripeNetworkClient = networkClient;
                sendAnalyticsRequestV2Worker$doWork$1.L$0 = null;
                sendAnalyticsRequestV2Worker$doWork$1.I$0 = i2;
                sendAnalyticsRequestV2Worker$doWork$1.label = 2;
                obj = defaultStripeNetworkClient.executeRequest(analyticsRequestV22, sendAnalyticsRequestV2Worker$doWork$1);
            }
        }
        sendAnalyticsRequestV2Worker$doWork$1 = new SendAnalyticsRequestV2Worker$doWork$1(this, (ContinuationImpl) continuation);
        Object obj2 = sendAnalyticsRequestV2Worker$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendAnalyticsRequestV2Worker$doWork$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        analyticsRequestV2 = (AnalyticsRequestV2) obj2;
        if (analyticsRequestV2 != null) {
        }
    }
}
