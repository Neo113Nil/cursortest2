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
import kotlin.collections.ArraysKt;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/BillingProgramReportingDetailsAndroid;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$createBillingProgramReportingDetails$2", f = "OpenIapModule.kt", i = {0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "billingProgramConstant", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class OpenIapModule$createBillingProgramReportingDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BillingProgramReportingDetailsAndroid>, Object> {
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
    OpenIapModule$createBillingProgramReportingDetails$2(OpenIapModule openIapModule, BillingProgramAndroid billingProgramAndroid, Continuation<? super OpenIapModule$createBillingProgramReportingDetails$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
        this.$program = billingProgramAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$createBillingProgramReportingDetails$2(this.this$0, this.$program, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BillingProgramReportingDetailsAndroid> continuation) {
        return ((OpenIapModule$createBillingProgramReportingDetails$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OpenIapLog.INSTANCE.d("Creating billing program reporting details for: " + this.$program, "OpenIapModule");
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
                    throw new IllegalArgumentException("Cannot create reporting details for UNSPECIFIED program");
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
        OpenIapModule$createBillingProgramReportingDetails$2 openIapModule$createBillingProgramReportingDetails$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$createBillingProgramReportingDetails$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Class<?> cls = Class.forName("com.android.billingclient.api.BillingProgramReportingDetailsListener");
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$createBillingProgramReportingDetails$2$1$listener$1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    if (Intrinsics.areEqual(method.getName(), "onCreateBillingProgramReportingDetailsResponse")) {
                        Object obj3 = objArr != null ? objArr[0] : null;
                        BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                        Object orNull = objArr != null ? ArraysKt.getOrNull(objArr, 1) : null;
                        if (billingResult == null || billingResult.getResponseCode() != 0 || orNull == null) {
                            BillingResult billingResult2 = billingResult;
                            OpenIapLog.e$default(OpenIapLog.INSTANCE, "Reporting details creation failed: " + (billingResult2 != null ? billingResult2.getDebugMessage() : null), null, "OpenIapModule", 2, null);
                            if (cancellableContinuationImpl2.isActive()) {
                                CancellableContinuation<BillingProgramReportingDetailsAndroid> cancellableContinuation = cancellableContinuationImpl2;
                                Result.Companion companion = Result.INSTANCE;
                                cancellableContinuation.resumeWith(Result.m3984constructorimpl(ResultKt.createFailure(OpenIapError.PurchaseFailed.INSTANCE)));
                            }
                        } else {
                            try {
                                Object invoke = orNull.getClass().getMethod("getExternalTransactionToken", new Class[0]).invoke(orNull, new Object[0]);
                                String str = invoke instanceof String ? (String) invoke : null;
                                OpenIapLog.INSTANCE.d("Billing program reporting token created: " + str, "OpenIapModule");
                                if (cancellableContinuationImpl2.isActive() && str != null) {
                                    CancellableContinuation<BillingProgramReportingDetailsAndroid> cancellableContinuation2 = cancellableContinuationImpl2;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    cancellableContinuation2.resumeWith(Result.m3984constructorimpl(new BillingProgramReportingDetailsAndroid(billingProgramAndroid, str)));
                                } else if (cancellableContinuationImpl2.isActive()) {
                                    CancellableContinuation<BillingProgramReportingDetailsAndroid> cancellableContinuation3 = cancellableContinuationImpl2;
                                    Result.Companion companion3 = Result.INSTANCE;
                                    cancellableContinuation3.resumeWith(Result.m3984constructorimpl(ResultKt.createFailure(OpenIapError.PurchaseFailed.INSTANCE)));
                                }
                            } catch (Exception e) {
                                OpenIapLog.INSTANCE.e("Failed to extract token: " + e.getMessage(), e, "OpenIapModule");
                                if (cancellableContinuationImpl2.isActive()) {
                                    CancellableContinuation<BillingProgramReportingDetailsAndroid> cancellableContinuation4 = cancellableContinuationImpl2;
                                    Result.Companion companion4 = Result.INSTANCE;
                                    cancellableContinuation4.resumeWith(Result.m3984constructorimpl(ResultKt.createFailure(OpenIapError.PurchaseFailed.INSTANCE)));
                                }
                            }
                        }
                    }
                    return null;
                }
            });
            Class<?> cls2 = Class.forName("com.android.billingclient.api.BillingProgramReportingDetailsParams");
            Class<?> cls3 = Class.forName("com.android.billingclient.api.BillingProgramReportingDetailsParams$Builder");
            Object invoke = cls2.getMethod("newBuilder", new Class[0]).invoke(null, new Object[0]);
            cls3.getMethod("setBillingProgram", Integer.TYPE).invoke(invoke, Boxing.boxInt(i));
            billingClient.getClass().getMethod("createBillingProgramReportingDetailsAsync", cls2, cls).invoke(billingClient, cls3.getMethod("build", new Class[0]).invoke(invoke, new Object[0]), newProxyInstance);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(openIapModule$createBillingProgramReportingDetails$2);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        } catch (ClassNotFoundException e) {
            OpenIapLog.INSTANCE.e("BillingProgramReportingDetailsParams not found. Requires Billing Library 8.3.0+", e, "OpenIapModule");
            throw OpenIapError.FeatureNotSupported.INSTANCE;
        } catch (NoSuchMethodException e2) {
            OpenIapLog.INSTANCE.e("createBillingProgramReportingDetailsAsync not found. Requires Billing Library 8.3.0+", e2, "OpenIapModule");
            throw OpenIapError.FeatureNotSupported.INSTANCE;
        } catch (Exception e3) {
            OpenIapLog.INSTANCE.e("Failed to create billing program reporting details: " + e3.getMessage(), e3, "OpenIapModule");
            throw OpenIapError.PurchaseFailed.INSTANCE;
        }
    }
}
