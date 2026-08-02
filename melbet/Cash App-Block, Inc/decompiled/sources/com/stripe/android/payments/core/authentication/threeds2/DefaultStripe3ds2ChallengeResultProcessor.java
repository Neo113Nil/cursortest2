package com.stripe.android.payments.core.authentication.threeds2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class DefaultStripe3ds2ChallengeResultProcessor {
    public final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    public final LinearRetryDelaySupplier retryDelaySupplier;
    public final StripeRepository stripeRepository;
    public final CoroutineContext workContext;

    public DefaultStripe3ds2ChallengeResultProcessor(StripeRepository stripeRepository, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, LinearRetryDelaySupplier linearRetryDelaySupplier, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, CoroutineContext coroutineContext) {
        stripeRepository.getClass();
        defaultAnalyticsRequestExecutor.getClass();
        paymentAnalyticsRequestFactory.getClass();
        linearRetryDelaySupplier.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        coroutineContext.getClass();
        this.stripeRepository = stripeRepository;
        this.analyticsRequestExecutor = defaultAnalyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.retryDelaySupplier = linearRetryDelaySupplier;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.workContext = coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object complete3ds2Auth(ChallengeResult challengeResult, ApiRequest.Options options, int i, ContinuationImpl continuationImpl) {
        DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
        int i2;
        Object m4033complete3ds2Auth0E7RQCE;
        Throwable m4120exceptionOrNullimpl;
        if (continuationImpl instanceof DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1) {
            defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 = (DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1) continuationImpl;
            int i3 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1.label = i3 - PKIFailureInfo.systemUnavail;
                DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
                Object obj = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = challengeResult.getIntentData().sourceId;
                    defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0 = challengeResult;
                    defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1 = options;
                    defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.I$0 = i;
                    defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label = 1;
                    m4033complete3ds2Auth0E7RQCE = ((StripeApiRepository) this.stripeRepository).m4033complete3ds2Auth0E7RQCE(str, options, defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        return bool;
                    }
                    i = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.I$0;
                    options = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1;
                    challengeResult = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    m4033complete3ds2Auth0E7RQCE = ((Result) obj).value;
                }
                ApiRequest.Options options2 = options;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4033complete3ds2Auth0E7RQCE);
                if (m4120exceptionOrNullimpl != null) {
                    this.logger.debug("3DS2 challenge completion request was successful. " + (3 - i) + " retries attempted.");
                    return Boolean.TRUE;
                }
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$0 = null;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.L$1 = null;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.I$0 = i;
                defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12.label = 2;
                obj = onComplete3ds2AuthFailure(challengeResult, options2, i, m4120exceptionOrNullimpl, defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$12);
            }
        }
        defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 = new DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1(this, continuationImpl);
        DefaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1 defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$1;
        Object obj3 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = defaultStripe3ds2ChallengeResultProcessor$complete3ds2Auth$122.label;
        if (i2 != 0) {
        }
        ApiRequest.Options options22 = options;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m4033complete3ds2Auth0E7RQCE);
        if (m4120exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onComplete3ds2AuthFailure(ChallengeResult challengeResult, ApiRequest.Options options, int i, Throwable th, ContinuationImpl continuationImpl) {
        DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1;
        int i2;
        int i3;
        ?? r13;
        if (continuationImpl instanceof DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1) {
            defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 = (DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1) continuationImpl;
            int i4 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = this.logger;
                    logger$Companion$NOOP_LOGGER$1.error("3DS2 challenge completion request failed. Remaining retries: " + i, th);
                    i3 = 0;
                    boolean z = th instanceof StripeException ? ((StripeException) th).isClientError : false;
                    if (i > 0 && z) {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        logger$Companion$NOOP_LOGGER$1.debug("Did not make a successful 3DS2 challenge completion request after retrying.");
                        return Boolean.FALSE;
                    }
                    long m4010getDelay3nIYWDw = this.retryDelaySupplier.m4010getDelay3nIYWDw(i);
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$0 = challengeResult;
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$1 = options;
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$0 = i;
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$1 = z ? 1 : 0;
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$2 = i3;
                    defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label = 1;
                    r13 = z;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$2;
                    int i6 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$1;
                    i = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$0;
                    ApiRequest.Options options2 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$1;
                    ChallengeResult challengeResult2 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    r13 = i6;
                    options = options2;
                    i3 = i5;
                    challengeResult = challengeResult2;
                }
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$0 = null;
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$1 = null;
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$0 = i;
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$1 = r13;
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$2 = i3;
                defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label = 2;
                Object complete3ds2Auth = complete3ds2Auth(challengeResult, options, i - 1, defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1);
                return complete3ds2Auth != coroutineSingletons ? coroutineSingletons : complete3ds2Auth;
            }
        }
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1 = new DefaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1(this, continuationImpl);
        Object obj2 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label;
        if (i2 != 0) {
        }
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$0 = null;
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.L$1 = null;
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$0 = i;
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$1 = r13;
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.I$2 = i3;
        defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1.label = 2;
        Object complete3ds2Auth2 = complete3ds2Auth(challengeResult, options, i - 1, defaultStripe3ds2ChallengeResultProcessor$onComplete3ds2AuthFailure$1);
        if (complete3ds2Auth2 != coroutineSingletons2) {
        }
    }
}
