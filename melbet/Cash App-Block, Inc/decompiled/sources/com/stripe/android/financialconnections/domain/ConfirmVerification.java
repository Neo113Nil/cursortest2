package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.VerificationType;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ConfirmVerification {
    public final FinancialConnectionsConsumerSessionRepositoryImpl consumerSessionRepository;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"com/stripe/android/financialconnections/domain/ConfirmVerification$OTPError", "", "Type", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class OTPError extends Throwable {

        /* renamed from: type, reason: collision with root package name */
        public final Type f1429type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Type {
            public static final /* synthetic */ Type[] $VALUES;
            public static final Type CODE_INVALID;
            public static final Type SMS_CODE_EXPIRED;

            /* JADX INFO: Fake field, exist only in values array */
            Type EF0;

            static {
                Type type2 = new Type("EMAIL_CODE_EXPIRED", 0);
                Type type3 = new Type("SMS_CODE_EXPIRED", 1);
                SMS_CODE_EXPIRED = type3;
                Type type4 = new Type("CODE_INVALID", 2);
                CODE_INVALID = type4;
                $VALUES = new Type[]{type2, type3, type4};
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public OTPError(String str, Type type2) {
            super(str);
            this.f1429type = type2;
        }
    }

    public ConfirmVerification(FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl) {
        financialConnectionsConsumerSessionRepositoryImpl.getClass();
        this.consumerSessionRepository = financialConnectionsConsumerSessionRepositoryImpl;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:46|47))(3:48|49|(1:51))|11|12|(2:14|15)(7:17|(1:19)|(1:44)|25|26|29|30)))|54|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0028, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        r6 = kotlin.Result.Companion;
        r8 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sms(String str, String str2, ContinuationImpl continuationImpl) {
        ConfirmVerification$sms$1 confirmVerification$sms$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        String str3;
        StripeError stripeError;
        if (continuationImpl instanceof ConfirmVerification$sms$1) {
            confirmVerification$sms$1 = (ConfirmVerification$sms$1) continuationImpl;
            int i2 = confirmVerification$sms$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                confirmVerification$sms$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = confirmVerification$sms$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmVerification$sms$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = this.consumerSessionRepository;
                    VerificationType verificationType = VerificationType.SMS;
                    confirmVerification$sms$1.label = 1;
                    obj = financialConnectionsConsumerSessionRepositoryImpl.confirmConsumerVerification(str, str2, verificationType, confirmVerification$sms$1);
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
                Object failure = (ConsumerSession) obj;
                Result.Companion companion2 = Result.Companion;
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    return (ConsumerSession) failure;
                }
                VerificationType verificationType2 = VerificationType.SMS;
                StripeException stripeException = m4120exceptionOrNullimpl instanceof StripeException ? (StripeException) m4120exceptionOrNullimpl : null;
                if (stripeException == null || (stripeError = stripeException.stripeError) == null || (str3 = stripeError.code) == null) {
                    str3 = "";
                }
                switch (str3.hashCode()) {
                    case -1200814029:
                        if (!str3.equals("consumer_session_expired")) {
                            throw m4120exceptionOrNullimpl;
                        }
                        break;
                    case -743856726:
                        if (!str3.equals("consumer_verification_expired")) {
                            throw m4120exceptionOrNullimpl;
                        }
                        break;
                    case -446933440:
                        if (str3.equals("consumer_verification_code_invalid")) {
                            throw new OTPError(str3, OTPError.Type.CODE_INVALID);
                        }
                        throw m4120exceptionOrNullimpl;
                    case 1449761750:
                        if (!str3.equals("consumer_verification_max_attempts_exceeded")) {
                            throw m4120exceptionOrNullimpl;
                        }
                        break;
                    default:
                        throw m4120exceptionOrNullimpl;
                }
                throw new OTPError(str3, OTPError.Type.SMS_CODE_EXPIRED);
            }
        }
        confirmVerification$sms$1 = new ConfirmVerification$sms$1(this, continuationImpl);
        Object obj2 = confirmVerification$sms$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmVerification$sms$1.label;
        if (i != 0) {
        }
        Object failure2 = (ConsumerSession) obj2;
        Result.Companion companion22 = Result.Companion;
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl != null) {
        }
    }
}
