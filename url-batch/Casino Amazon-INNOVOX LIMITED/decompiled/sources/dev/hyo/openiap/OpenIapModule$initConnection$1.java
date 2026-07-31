package dev.hyo.openiap;

import com.android.billingclient.api.BillingClient;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", ConfigModelStoreKt.CONFIG_NAME_SPACE, "Ldev/hyo/openiap/InitConnectionConfig;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$initConnection$1", f = "OpenIapModule.kt", i = {0}, l = {145}, m = "invokeSuspend", n = {ConfigModelStoreKt.CONFIG_NAME_SPACE}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$initConnection$1 extends SuspendLambda implements Function2<InitConnectionConfig, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* compiled from: OpenIapModule.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BillingProgramAndroid.values().length];
            try {
                iArr[BillingProgramAndroid.UserChoiceBilling.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BillingProgramAndroid.ExternalOffer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlternativeBillingModeAndroid.values().length];
            try {
                iArr2[AlternativeBillingModeAndroid.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AlternativeBillingModeAndroid.UserChoice.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AlternativeBillingModeAndroid.AlternativeOnly.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$initConnection$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$initConnection$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$initConnection$1 openIapModule$initConnection$1 = new OpenIapModule$initConnection$1(this.this$0, continuation);
        openIapModule$initConnection$1.L$0 = obj;
        return openIapModule$initConnection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InitConnectionConfig initConnectionConfig, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$initConnection$1) create(initConnectionConfig, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AlternativeBillingModeAndroid alternativeBillingModeAndroid;
        AlternativeBillingMode alternativeBillingMode;
        BillingProgramAndroid enableBillingProgramAndroid;
        Set set;
        InitConnectionConfig initConnectionConfig = (InitConnectionConfig) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        if (initConnectionConfig != null && (enableBillingProgramAndroid = initConnectionConfig.getEnableBillingProgramAndroid()) != null) {
            OpenIapModule openIapModule = this.this$0;
            OpenIapLog.INSTANCE.d("Setting billing program from config: " + enableBillingProgramAndroid, "OpenIapModule");
            set = openIapModule.enabledBillingPrograms;
            set.add(enableBillingProgramAndroid);
            int i2 = WhenMappings.$EnumSwitchMapping$0[enableBillingProgramAndroid.ordinal()];
            if (i2 == 1) {
                openIapModule.alternativeBillingMode = AlternativeBillingMode.USER_CHOICE;
            } else if (i2 == 2) {
                openIapModule.alternativeBillingMode = AlternativeBillingMode.ALTERNATIVE_ONLY;
            }
        }
        if (initConnectionConfig != null && (alternativeBillingModeAndroid = initConnectionConfig.getAlternativeBillingModeAndroid()) != null) {
            OpenIapModule openIapModule2 = this.this$0;
            OpenIapLog.INSTANCE.d("Setting alternative billing mode from config (deprecated): " + alternativeBillingModeAndroid, "OpenIapModule");
            int i3 = WhenMappings.$EnumSwitchMapping$1[alternativeBillingModeAndroid.ordinal()];
            if (i3 == 1) {
                alternativeBillingMode = AlternativeBillingMode.NONE;
            } else if (i3 == 2) {
                alternativeBillingMode = AlternativeBillingMode.USER_CHOICE;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                alternativeBillingMode = AlternativeBillingMode.ALTERNATIVE_ONLY;
            }
            openIapModule2.alternativeBillingMode = alternativeBillingMode;
        }
        this.L$0 = SpillingKt.nullOutSpilledVariable(initConnectionConfig);
        this.label = 1;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass3(this.this$0, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }

    /* compiled from: OpenIapModule.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$initConnection$1$3", f = "OpenIapModule.kt", i = {0}, l = {1817}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, s = {"I$0"})
    /* renamed from: dev.hyo.openiap.OpenIapModule$initConnection$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ OpenIapModule this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(OpenIapModule openIapModule, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = openIapModule;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            OpenIapModule openIapModule = this.this$0;
            this.L$0 = openIapModule;
            this.I$0 = 0;
            this.label = 1;
            AnonymousClass3 anonymousClass3 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass3), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            openIapModule.initBillingClient(new Function1<BillingClient, Unit>() { // from class: dev.hyo.openiap.OpenIapModule$initConnection$1$3$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
                    invoke2(billingClient);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingClient it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m3984constructorimpl(true));
                }
            }, new Function1<Throwable, Unit>() { // from class: dev.hyo.openiap.OpenIapModule$initConnection$1$3$1$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    OpenIapLog.INSTANCE.w("Billing set up failed: " + (th != null ? th.getMessage() : null), "OpenIapModule");
                    CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m3984constructorimpl(false));
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass3);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }
    }
}
