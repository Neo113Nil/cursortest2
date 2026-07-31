package com.margelo.nitro.iap;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.iap.Variant_NullType_InitConnectionConfig;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.listener.OpenIapDeveloperProvidedBillingListener;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import dev.hyo.openiap.listener.OpenIapUserChoiceBillingListener;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$initConnection$1", f = "HybridRnIap.kt", i = {0, 2}, l = {119, 156, 265}, m = "invokeSuspend", n = {"configValue", "deferred"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class HybridRnIap$initConnection$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ Variant_NullType_InitConnectionConfig $config;
    Object L$0;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* compiled from: HybridRnIap.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlternativeBillingModeAndroid.values().length];
            try {
                iArr[AlternativeBillingModeAndroid.USER_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlternativeBillingModeAndroid.ALTERNATIVE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$initConnection$1(Variant_NullType_InitConnectionConfig variant_NullType_InitConnectionConfig, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$initConnection$1> continuation) {
        super(1, continuation);
        this.$config = variant_NullType_InitConnectionConfig;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$initConnection$1(this.$config, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$initConnection$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r2 == r0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019e, code lost:
    
        if (r2 == r0) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224 A[Catch: all -> 0x021a, TryCatch #9 {all -> 0x021a, blocks: (B:13:0x01a9, B:17:0x01cc, B:18:0x01f4, B:23:0x01f7, B:24:0x0219, B:28:0x021e, B:30:0x0224, B:31:0x022a, B:32:0x0239, B:68:0x014d, B:74:0x016a, B:76:0x0170, B:77:0x0176, B:79:0x0165, B:80:0x0168, B:81:0x0157), top: B:67:0x014d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InitConnectionConfig value;
        boolean z;
        Object withContext;
        Object obj2;
        CompletableDeferred completableDeferred;
        boolean z2;
        Object obj3;
        CompletableDeferred completableDeferred2;
        boolean z3;
        CompletableDeferred completableDeferred3;
        dev.hyo.openiap.AlternativeBillingModeAndroid alternativeBillingModeAndroid;
        dev.hyo.openiap.InitConnectionConfig initConnectionConfig;
        Object withContext2;
        OpenIapModule openIap;
        OpenIapModule openIap2;
        OpenIapModule openIap3;
        OpenIapModule openIap4;
        CompletableDeferred completableDeferred4;
        Object await;
        CompletableDeferred completableDeferred5;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Variant_NullType_InitConnectionConfig variant_NullType_InitConnectionConfig = this.$config;
                Variant_NullType_InitConnectionConfig.Second second = variant_NullType_InitConnectionConfig instanceof Variant_NullType_InitConnectionConfig.Second ? (Variant_NullType_InitConnectionConfig.Second) variant_NullType_InitConnectionConfig : null;
                value = second != null ? second.getValue() : null;
                RnIapLog.INSTANCE.payload("initConnection", value);
                z = this.this$0.isInitialized;
                if (z) {
                    RnIapLog.INSTANCE.result("initConnection", Boxing.boxBoolean(true));
                    return Boxing.boxBoolean(true);
                }
                this.L$0 = value;
                this.label = 1;
                withContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, null), this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        await = obj;
                        boolean booleanValue = ((Boolean) await).booleanValue();
                        RnIapLog.INSTANCE.result("initConnection.await", Boxing.boxBoolean(booleanValue));
                        return Boxing.boxBoolean(booleanValue);
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred5 = (CompletableDeferred) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        completableDeferred3 = completableDeferred5;
                        withContext2 = obj;
                        if (((Boolean) withContext2).booleanValue()) {
                            this.this$0.isInitialized = true;
                            completableDeferred3.complete(Boxing.boxBoolean(true));
                            RnIapLog.INSTANCE.result("initConnection", Boxing.boxBoolean(true));
                            this.this$0.initDeferred = null;
                            return Boxing.boxBoolean(true);
                        }
                        OpenIapError.InitConnection initConnection = OpenIapError.InitConnection.INSTANCE;
                        RnIapLog.INSTANCE.failure("initConnection.native", new Exception(initConnection.getMessage()));
                        throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, initConnection, null, null, "Failed to initialize connection", 6, null));
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            OpenIapError.InitConnection initConnection2 = OpenIapError.InitConnection.INSTANCE;
                            RnIapLog.INSTANCE.failure("initConnection.native", th);
                            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, initConnection2, null, th.getMessage(), th.getMessage(), 2, null));
                        } catch (Exception e) {
                            e = e;
                            completableDeferred3 = completableDeferred5;
                            if (!completableDeferred3.isCompleted()) {
                                completableDeferred3.completeExceptionally(e);
                            }
                            this.this$0.isInitialized = false;
                            RnIapLog.INSTANCE.failure("initConnection", e);
                            throw e;
                        }
                    }
                }
                value = (InitConnectionConfig) this.L$0;
                ResultKt.throwOnFailure(obj);
                withContext = obj;
            }
            ((Result) withContext).getValue();
            obj2 = this.this$0.initLock;
            HybridRnIap hybridRnIap = this.this$0;
            synchronized (obj2) {
                completableDeferred = hybridRnIap.initDeferred;
                if (completableDeferred == null) {
                    hybridRnIap.initDeferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                completableDeferred4 = this.this$0.initDeferred;
                Intrinsics.checkNotNull(completableDeferred4);
                this.L$0 = null;
                this.label = 2;
                await = completableDeferred4.await(this);
            } else {
                try {
                    z3 = this.this$0.listenersAttached;
                    if (!z3) {
                        this.this$0.listenersAttached = true;
                        RnIapLog.INSTANCE.payload("listeners.attach", null);
                        openIap = this.this$0.getOpenIap();
                        final HybridRnIap hybridRnIap2 = this.this$0;
                        openIap.addPurchaseUpdateListener(new OpenIapPurchaseUpdateListener() { // from class: com.margelo.nitro.iap.HybridRnIap$initConnection$1$$ExternalSyntheticLambda0
                            @Override // dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener
                            public final void onPurchaseUpdated(dev.hyo.openiap.Purchase purchase) {
                                HybridRnIap$initConnection$1.invokeSuspend$lambda$3(HybridRnIap.this, purchase);
                            }
                        });
                        openIap2 = this.this$0.getOpenIap();
                        final HybridRnIap hybridRnIap3 = this.this$0;
                        openIap2.addPurchaseErrorListener(new OpenIapPurchaseErrorListener() { // from class: com.margelo.nitro.iap.HybridRnIap$initConnection$1$$ExternalSyntheticLambda1
                            @Override // dev.hyo.openiap.listener.OpenIapPurchaseErrorListener
                            public final void onPurchaseError(OpenIapError openIapError) {
                                HybridRnIap$initConnection$1.invokeSuspend$lambda$6(HybridRnIap.this, openIapError);
                            }
                        });
                        openIap3 = this.this$0.getOpenIap();
                        final HybridRnIap hybridRnIap4 = this.this$0;
                        openIap3.addUserChoiceBillingListener(new OpenIapUserChoiceBillingListener() { // from class: com.margelo.nitro.iap.HybridRnIap$initConnection$1$$ExternalSyntheticLambda2
                            @Override // dev.hyo.openiap.listener.OpenIapUserChoiceBillingListener
                            public final void onUserChoiceBilling(dev.hyo.openiap.UserChoiceBillingDetails userChoiceBillingDetails) {
                                HybridRnIap$initConnection$1.invokeSuspend$lambda$9(HybridRnIap.this, userChoiceBillingDetails);
                            }
                        });
                        openIap4 = this.this$0.getOpenIap();
                        final HybridRnIap hybridRnIap5 = this.this$0;
                        openIap4.addDeveloperProvidedBillingListener(new OpenIapDeveloperProvidedBillingListener() { // from class: com.margelo.nitro.iap.HybridRnIap$initConnection$1$$ExternalSyntheticLambda3
                            @Override // dev.hyo.openiap.listener.OpenIapDeveloperProvidedBillingListener
                            public final void onDeveloperProvidedBilling(dev.hyo.openiap.DeveloperProvidedBillingDetailsAndroid developerProvidedBillingDetailsAndroid) {
                                HybridRnIap$initConnection$1.invokeSuspend$lambda$12(HybridRnIap.this, developerProvidedBillingDetailsAndroid);
                            }
                        });
                        RnIapLog.INSTANCE.result("listeners.attach", "attached");
                    }
                    completableDeferred3 = this.this$0.initDeferred;
                    Intrinsics.checkNotNull(completableDeferred3);
                    if (value != null) {
                        try {
                            try {
                                HybridRnIap hybridRnIap6 = this.this$0;
                                AlternativeBillingModeAndroid alternativeBillingModeAndroid2 = value.getAlternativeBillingModeAndroid();
                                int i2 = alternativeBillingModeAndroid2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alternativeBillingModeAndroid2.ordinal()];
                                if (i2 == 1) {
                                    alternativeBillingModeAndroid = dev.hyo.openiap.AlternativeBillingModeAndroid.UserChoice;
                                } else {
                                    alternativeBillingModeAndroid = i2 != 2 ? null : dev.hyo.openiap.AlternativeBillingModeAndroid.AlternativeOnly;
                                }
                                BillingProgramAndroid enableBillingProgramAndroid = value.getEnableBillingProgramAndroid();
                                initConnectionConfig = new dev.hyo.openiap.InitConnectionConfig(alternativeBillingModeAndroid, enableBillingProgramAndroid != null ? hybridRnIap6.mapBillingProgram(enableBillingProgramAndroid) : null);
                            } catch (Exception e2) {
                                e = e2;
                                if (!completableDeferred3.isCompleted()) {
                                }
                                this.this$0.isInitialized = false;
                                RnIapLog.INSTANCE.failure("initConnection", e);
                                throw e;
                            }
                        } catch (Throwable th3) {
                            this.this$0.initDeferred = null;
                            throw th3;
                        }
                    } else {
                        initConnectionConfig = null;
                    }
                    try {
                        RnIapLog.INSTANCE.payload("initConnection.native", initConnectionConfig);
                        this.L$0 = completableDeferred3;
                        this.label = 3;
                        withContext2 = BuildersKt.withContext(Dispatchers.getMain(), new HybridRnIap$initConnection$1$ok$1(this.this$0, initConnectionConfig, null), this);
                    } catch (Throwable th4) {
                        th = th4;
                        completableDeferred5 = completableDeferred3;
                        OpenIapError.InitConnection initConnection22 = OpenIapError.InitConnection.INSTANCE;
                        RnIapLog.INSTANCE.failure("initConnection.native", th);
                        throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, initConnection22, null, th.getMessage(), th.getMessage(), 2, null));
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th5) {
                    this.this$0.listenersAttached = false;
                    OpenIapError.InitConnection initConnection3 = OpenIapError.InitConnection.INSTANCE;
                    String message = th5.getMessage();
                    if (message == null) {
                        message = th5.getClass().getName();
                    }
                    String str = message;
                    RnIapLog.INSTANCE.failure("initConnection.listeners", th5);
                    OpenIapException openIapException = new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, initConnection3, null, str, "Failed to register billing listeners: " + str, 2, null));
                    obj3 = this.this$0.initLock;
                    HybridRnIap hybridRnIap7 = this.this$0;
                    synchronized (obj3) {
                        completableDeferred2 = hybridRnIap7.initDeferred;
                        if (completableDeferred2 != null && !completableDeferred2.isCompleted()) {
                            completableDeferred2.completeExceptionally(openIapException);
                        }
                        hybridRnIap7.initDeferred = null;
                        Unit unit = Unit.INSTANCE;
                        this.this$0.isInitialized = false;
                        throw openIapException;
                    }
                }
            }
            return coroutine_suspended;
        } catch (CancellationException e4) {
            throw e4;
        } catch (Throwable th6) {
            OpenIapError.InitConnection initConnection4 = OpenIapError.InitConnection.INSTANCE;
            String message2 = th6.getMessage();
            if (message2 == null) {
                message2 = th6.getClass().getName();
            }
            String str2 = message2;
            RnIapLog.INSTANCE.failure("initConnection.setActivity", th6);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, initConnection4, null, str2, "Failed to set activity: " + str2, 2, null));
        }
    }

    /* compiled from: HybridRnIap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Landroid/app/Activity;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$initConnection$1$1", f = "HybridRnIap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.margelo.nitro.iap.HybridRnIap$initConnection$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Activity>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ HybridRnIap this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HybridRnIap hybridRnIap, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = hybridRnIap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Activity>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m3984constructorimpl;
            OpenIapModule openIap;
            ReactApplicationContext context;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HybridRnIap hybridRnIap = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                context = hybridRnIap.getContext();
                m3984constructorimpl = Result.m3984constructorimpl(context.getCurrentActivity());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
            }
            HybridRnIap hybridRnIap2 = this.this$0;
            if (Result.m3991isSuccessimpl(m3984constructorimpl)) {
                Activity activity = (Activity) m3984constructorimpl;
                if (activity != null) {
                    RnIapLog.INSTANCE.debug("Activity available: " + activity.getClass().getName());
                    openIap = hybridRnIap2.getOpenIap();
                    openIap.setActivity(activity);
                } else {
                    RnIapLog.INSTANCE.warn("Activity is null during initConnection");
                }
            }
            if (Result.m3987exceptionOrNullimpl(m3984constructorimpl) != null) {
                RnIapLog.INSTANCE.warn("Activity not available during initConnection - OpenIAP will use Context");
            }
            return Result.m3983boximpl(m3984constructorimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(HybridRnIap hybridRnIap, dev.hyo.openiap.Purchase purchase) {
        Object m3984constructorimpl;
        NitroPurchase convertToNitroPurchase;
        try {
            Result.Companion companion = Result.INSTANCE;
            RnIapLog.INSTANCE.result("purchaseUpdatedListener", MapsKt.mapOf(TuplesKt.to("id", purchase.getId()), TuplesKt.to("sku", purchase.getProductId())));
            convertToNitroPurchase = hybridRnIap.convertToNitroPurchase(purchase);
            hybridRnIap.sendPurchaseUpdate(convertToNitroPurchase);
            m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
        if (m3987exceptionOrNullimpl != null) {
            RnIapLog.INSTANCE.failure("purchaseUpdatedListener", m3987exceptionOrNullimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6(HybridRnIap hybridRnIap, OpenIapError openIapError) {
        Object m3984constructorimpl;
        String code = OpenIapError.INSTANCE.toCode(openIapError);
        String message = openIapError.getMessage();
        if (message == null) {
            message = OpenIapError.INSTANCE.defaultMessage(code);
        }
        String str = message;
        try {
            Result.Companion companion = Result.INSTANCE;
            RnIapLog.INSTANCE.result("purchaseErrorListener", MapsKt.mapOf(TuplesKt.to("code", code), TuplesKt.to("message", str)));
            hybridRnIap.sendPurchaseError(new NitroPurchaseResult(-1.0d, null, code, str, null));
            m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
        if (m3987exceptionOrNullimpl != null) {
            RnIapLog.INSTANCE.failure("purchaseErrorListener", m3987exceptionOrNullimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$9(HybridRnIap hybridRnIap, dev.hyo.openiap.UserChoiceBillingDetails userChoiceBillingDetails) {
        Object m3984constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            RnIapLog.INSTANCE.result("userChoiceBillingListener", MapsKt.mapOf(TuplesKt.to("products", userChoiceBillingDetails.getProducts()), TuplesKt.to("token", userChoiceBillingDetails.getExternalTransactionToken())));
            hybridRnIap.sendUserChoiceBilling(new UserChoiceBillingDetails(userChoiceBillingDetails.getExternalTransactionToken(), (String[]) userChoiceBillingDetails.getProducts().toArray(new String[0])));
            m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
        if (m3987exceptionOrNullimpl != null) {
            RnIapLog.INSTANCE.failure("userChoiceBillingListener", m3987exceptionOrNullimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$12(HybridRnIap hybridRnIap, dev.hyo.openiap.DeveloperProvidedBillingDetailsAndroid developerProvidedBillingDetailsAndroid) {
        Object m3984constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            RnIapLog.INSTANCE.result("developerProvidedBillingListener", MapsKt.mapOf(TuplesKt.to("token", developerProvidedBillingDetailsAndroid.getExternalTransactionToken())));
            hybridRnIap.sendDeveloperProvidedBilling(new DeveloperProvidedBillingDetailsAndroid(developerProvidedBillingDetailsAndroid.getExternalTransactionToken()));
            m3984constructorimpl = Result.m3984constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m3984constructorimpl = Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m3987exceptionOrNullimpl = Result.m3987exceptionOrNullimpl(m3984constructorimpl);
        if (m3987exceptionOrNullimpl != null) {
            RnIapLog.INSTANCE.failure("developerProvidedBillingListener", m3987exceptionOrNullimpl);
        }
    }
}
