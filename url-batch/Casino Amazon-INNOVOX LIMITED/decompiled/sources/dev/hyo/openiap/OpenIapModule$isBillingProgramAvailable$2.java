package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import dev.hyo.openiap.OpenIapError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/BillingProgramAvailabilityResultAndroid;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$isBillingProgramAvailable$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "billingProgramConstant", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class OpenIapModule$isBillingProgramAvailable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BillingProgramAvailabilityResultAndroid>, Object> {
    final /* synthetic */ BillingProgramAndroid $program;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingProgramAndroid.values().length];
            try {
                iArr[BillingProgramAndroid.ExternalContentLink.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingProgramAndroid.ExternalOffer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BillingProgramAndroid.ExternalPayments.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BillingProgramAndroid.UserChoiceBilling.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BillingProgramAndroid.Unspecified.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$isBillingProgramAvailable$2(OpenIapModule openIapModule, BillingProgramAndroid billingProgramAndroid, Continuation<? super OpenIapModule$isBillingProgramAvailable$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
        this.$program = billingProgramAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$isBillingProgramAvailable$2(this.this$0, this.$program, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BillingProgramAvailabilityResultAndroid> continuation) {
        return ((OpenIapModule$isBillingProgramAvailable$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        billingClient = this.this$0.billingClient;
        if (billingClient == null) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        if (!billingClient.isReady()) {
            throw OpenIapError.NotPrepared.INSTANCE;
        }
        OpenIapLog.INSTANCE.d("Checking billing program availability for: " + this.$program, "OpenIapModule");
        int i3 = WhenMappings.$EnumSwitchMapping$0[this.$program.ordinal()];
        if (i3 != 1) {
            i = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        throw new IllegalArgumentException("USER_CHOICE_BILLING uses AlternativeBillingMode, not BillingProgram API");
                    }
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException("Cannot check availability for UNSPECIFIED program");
                }
                i = 4;
            }
        } else {
            i = 1;
        }
        final BillingProgramAndroid billingProgramAndroid = this.$program;
        this.L$0 = billingClient;
        this.L$1 = billingProgramAndroid;
        this.I$0 = i;
        this.I$1 = 0;
        this.label = 1;
        OpenIapModule$isBillingProgramAvailable$2 openIapModule$isBillingProgramAvailable$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$isBillingProgramAvailable$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Class<?> cls = Class.forName("com.android.billingclient.api.BillingProgramAvailabilityListener");
            billingClient.getClass().getMethod("isBillingProgramAvailableAsync", Integer.TYPE, cls).invoke(billingClient, Boxing.boxInt(i), Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$isBillingProgramAvailable$2$1$listener$1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    if (Intrinsics.areEqual(method.getName(), "onBillingProgramAvailabilityResponse")) {
                        boolean z = false;
                        Object obj3 = objArr != null ? objArr[0] : null;
                        BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                        OpenIapLog.INSTANCE.d("Billing program availability result: " + (billingResult != null ? Integer.valueOf(billingResult.getResponseCode()) : null) + " - " + (billingResult != null ? billingResult.getDebugMessage() : null), "OpenIapModule");
                        if (billingResult != null && billingResult.getResponseCode() == 0) {
                            z = true;
                        }
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<BillingProgramAvailabilityResultAndroid> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(new BillingProgramAvailabilityResultAndroid(billingProgramAndroid, z)));
                        }
                    }
                    return null;
                }
            }));
        } catch (NoSuchMethodException e) {
            OpenIapLog.INSTANCE.e("isBillingProgramAvailableAsync not found. Requires Billing Library 8.2.0+", e, "OpenIapModule");
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(new BillingProgramAvailabilityResultAndroid(billingProgramAndroid, false)));
            }
        } catch (Exception e2) {
            OpenIapLog.INSTANCE.e("Failed to check billing program availability: " + e2.getMessage(), e2, "OpenIapModule");
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(new BillingProgramAvailabilityResultAndroid(billingProgramAndroid, false)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(openIapModule$isBillingProgramAvailable$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
