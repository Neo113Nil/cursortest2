package dev.hyo.openiap;

import android.app.Activity;
import android.net.Uri;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$launchExternalLink$2", f = "OpenIapModule.kt", i = {0, 0, 0, 0, 0}, l = {1817}, m = "invokeSuspend", n = {"client", "billingProgramConstant", "launchModeConstant", "linkTypeConstant", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "I$0", "I$1", "I$2", "I$3"})
/* loaded from: classes3.dex */
final class OpenIapModule$launchExternalLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ LaunchExternalLinkParamsAndroid $params;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[ExternalLinkLaunchModeAndroid.values().length];
            try {
                iArr2[ExternalLinkLaunchModeAndroid.LaunchInExternalBrowserOrApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ExternalLinkLaunchModeAndroid.CallerWillLaunchLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ExternalLinkLaunchModeAndroid.Unspecified.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ExternalLinkTypeAndroid.values().length];
            try {
                iArr3[ExternalLinkTypeAndroid.LinkToDigitalContentOffer.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ExternalLinkTypeAndroid.LinkToAppDownload.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ExternalLinkTypeAndroid.Unspecified.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$launchExternalLink$2(OpenIapModule openIapModule, LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid, Activity activity, Continuation<? super OpenIapModule$launchExternalLink$2> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
        this.$params = launchExternalLinkParamsAndroid;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapModule$launchExternalLink$2(this.this$0, this.$params, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$launchExternalLink$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingClient billingClient;
        int i;
        int i2;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 != 1) {
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
        OpenIapLog.INSTANCE.d("Launching external link: program=" + this.$params.getBillingProgram() + ", launchMode=" + this.$params.getLaunchMode() + ", linkType=" + this.$params.getLinkType(), "OpenIapModule");
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.$params.getBillingProgram().ordinal()];
        if (i5 == 1) {
            i = 1;
        } else if (i5 != 2) {
            i = 4;
            if (i5 != 3) {
                if (i5 == 4) {
                    throw new IllegalArgumentException("USER_CHOICE_BILLING does not use external links");
                }
                if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Cannot launch with UNSPECIFIED program");
            }
        } else {
            i = 3;
        }
        int i6 = WhenMappings.$EnumSwitchMapping$1[this.$params.getLaunchMode().ordinal()];
        if (i6 == 1) {
            i2 = 1;
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Cannot launch with UNSPECIFIED launch mode");
            }
            i2 = 2;
        }
        int i7 = WhenMappings.$EnumSwitchMapping$2[this.$params.getLinkType().ordinal()];
        if (i7 == 1) {
            i3 = 1;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Cannot launch with UNSPECIFIED link type");
            }
            i3 = 2;
        }
        LaunchExternalLinkParamsAndroid launchExternalLinkParamsAndroid = this.$params;
        Activity activity = this.$activity;
        this.L$0 = billingClient;
        this.L$1 = launchExternalLinkParamsAndroid;
        this.L$2 = activity;
        this.I$0 = i;
        this.I$1 = i2;
        this.I$2 = i3;
        this.I$3 = 0;
        this.label = 1;
        OpenIapModule$launchExternalLink$2 openIapModule$launchExternalLink$2 = this;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(openIapModule$launchExternalLink$2), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        try {
            Class<?> cls = Class.forName("com.android.billingclient.api.LaunchExternalLinkParams");
            Class<?> cls2 = Class.forName("com.android.billingclient.api.LaunchExternalLinkParams$Builder");
            Object invoke = cls.getMethod("newBuilder", new Class[0]).invoke(null, new Object[0]);
            cls2.getMethod("setBillingProgram", Integer.TYPE).invoke(invoke, Boxing.boxInt(i));
            cls2.getMethod("setLaunchMode", Integer.TYPE).invoke(invoke, Boxing.boxInt(i2));
            cls2.getMethod("setLinkType", Integer.TYPE).invoke(invoke, Boxing.boxInt(i3));
            cls2.getMethod("setLinkUri", Uri.class).invoke(invoke, Uri.parse(launchExternalLinkParamsAndroid.getLinkUri()));
            Object invoke2 = cls2.getMethod("build", new Class[0]).invoke(invoke, new Object[0]);
            Class<?> cls3 = Class.forName("com.android.billingclient.api.LaunchExternalLinkResponseListener");
            billingClient.getClass().getMethod("launchExternalLink", Activity.class, cls, cls3).invoke(billingClient, activity, invoke2, Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, new InvocationHandler() { // from class: dev.hyo.openiap.OpenIapModule$launchExternalLink$2$1$listener$1
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    if (Intrinsics.areEqual(method.getName(), "onLaunchExternalLinkResponse")) {
                        boolean z = false;
                        Object obj3 = objArr != null ? objArr[0] : null;
                        BillingResult billingResult = obj3 instanceof BillingResult ? (BillingResult) obj3 : null;
                        OpenIapLog.INSTANCE.d("External link launch result: " + (billingResult != null ? Integer.valueOf(billingResult.getResponseCode()) : null) + " - " + (billingResult != null ? billingResult.getDebugMessage() : null), "OpenIapModule");
                        if (billingResult != null && billingResult.getResponseCode() == 0) {
                            z = true;
                        }
                        if (cancellableContinuationImpl2.isActive()) {
                            CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                            Result.Companion companion = Result.INSTANCE;
                            cancellableContinuation.resumeWith(Result.m3984constructorimpl(Boolean.valueOf(z)));
                        }
                    }
                    return null;
                }
            }));
        } catch (NoSuchMethodException e) {
            OpenIapLog.INSTANCE.e("launchExternalLink not found. Requires Billing Library 8.2.0+", e, "OpenIapModule");
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(Boxing.boxBoolean(false)));
            }
        } catch (Exception e2) {
            OpenIapLog.INSTANCE.e("Failed to launch external link: " + e2.getMessage(), e2, "OpenIapModule");
            if (cancellableContinuationImpl2.isActive()) {
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m3984constructorimpl(Boxing.boxBoolean(false)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(openIapModule$launchExternalLink$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
