package com.stripe.android.stripe3ds2.transaction;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__IndentKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ChallengeActionHandler$Default {
    public final StripeTransaction challengeRequestExecutor;
    public final ChallengeRequestData creqData;
    public final DefaultErrorReporter errorReporter;
    public final CoroutineContext workContext;

    public ChallengeActionHandler$Default(ChallengeRequestData challengeRequestData, DefaultErrorReporter defaultErrorReporter, StripeChallengeRequestExecutor$Factory stripeChallengeRequestExecutor$Factory, CoroutineContext coroutineContext) {
        challengeRequestData.getClass();
        defaultErrorReporter.getClass();
        stripeChallengeRequestExecutor$Factory.getClass();
        coroutineContext.getClass();
        StripeTransaction create = stripeChallengeRequestExecutor$Factory.create(defaultErrorReporter, coroutineContext);
        this.creqData = challengeRequestData;
        this.errorReporter = defaultErrorReporter;
        this.challengeRequestExecutor = create;
        this.workContext = coroutineContext;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(7:11|12|13|14|(1:16)|17|(1:22)(2:19|20))(2:24|25))(1:26))(1:30)|27))|34|6|7|(0)(0)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r0 = kotlin.Result.Companion;
        r9 = new kotlin.Result.Failure(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$executeChallengeRequest(ChallengeActionHandler$Default challengeActionHandler$Default, ChallengeRequestData challengeRequestData, ContinuationImpl continuationImpl) {
        ChallengeActionHandler$Default$executeChallengeRequest$1 challengeActionHandler$Default$executeChallengeRequest$1;
        int i;
        challengeActionHandler$Default.getClass();
        if (continuationImpl instanceof ChallengeActionHandler$Default$executeChallengeRequest$1) {
            challengeActionHandler$Default$executeChallengeRequest$1 = (ChallengeActionHandler$Default$executeChallengeRequest$1) continuationImpl;
            int i2 = challengeActionHandler$Default$executeChallengeRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                challengeActionHandler$Default$executeChallengeRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = challengeActionHandler$Default$executeChallengeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = challengeActionHandler$Default$executeChallengeRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    challengeActionHandler$Default$executeChallengeRequest$1.L$0 = challengeRequestData;
                    challengeActionHandler$Default$executeChallengeRequest$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        challengeRequestData = challengeActionHandler$Default$executeChallengeRequest$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Object failure = (ChallengeRequestResult) obj;
                        Result.Companion companion = Result.Companion;
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            DefaultErrorReporter defaultErrorReporter = challengeActionHandler$Default.errorReporter;
                            challengeRequestData.getClass();
                            defaultErrorReporter.reportError(new RuntimeException(StringsKt__IndentKt.replaceIndent("\n                            Failed to execute challenge request.\n\n                            CReq = " + ChallengeRequestData.copy$default(challengeRequestData, null, null, null, 3935) + "\n                        "), m4120exceptionOrNullimpl));
                        }
                        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
                        return m4120exceptionOrNullimpl2 == null ? failure : new ChallengeRequestResult.RuntimeError(m4120exceptionOrNullimpl2);
                    }
                    challengeRequestData = challengeActionHandler$Default$executeChallengeRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Result.Companion companion2 = Result.Companion;
                StripeTransaction stripeTransaction = challengeActionHandler$Default.challengeRequestExecutor;
                challengeActionHandler$Default$executeChallengeRequest$1.L$0 = challengeRequestData;
                challengeActionHandler$Default$executeChallengeRequest$1.label = 2;
                obj = stripeTransaction.execute(challengeRequestData, challengeActionHandler$Default$executeChallengeRequest$1);
            }
        }
        challengeActionHandler$Default$executeChallengeRequest$1 = new ChallengeActionHandler$Default$executeChallengeRequest$1(challengeActionHandler$Default, continuationImpl);
        Object obj2 = challengeActionHandler$Default$executeChallengeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = challengeActionHandler$Default$executeChallengeRequest$1.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        StripeTransaction stripeTransaction2 = challengeActionHandler$Default.challengeRequestExecutor;
        challengeActionHandler$Default$executeChallengeRequest$1.L$0 = challengeRequestData;
        challengeActionHandler$Default$executeChallengeRequest$1.label = 2;
        obj2 = stripeTransaction2.execute(challengeRequestData, challengeActionHandler$Default$executeChallengeRequest$1);
    }
}
