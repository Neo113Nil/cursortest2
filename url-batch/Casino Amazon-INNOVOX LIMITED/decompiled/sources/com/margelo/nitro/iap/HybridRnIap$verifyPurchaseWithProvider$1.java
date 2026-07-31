package com.margelo.nitro.iap;

import com.margelo.nitro.iap.Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_;
import com.margelo.nitro.iap.Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps;
import com.margelo.nitro.iap.Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps;
import com.margelo.nitro.iap.Variant_NullType_NitroVerifyPurchaseWithIapkitProps;
import com.margelo.nitro.iap.Variant_NullType_NitroVerifyPurchaseWithIapkitResult;
import com.margelo.nitro.iap.Variant_NullType_String;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.RequestVerifyPurchaseWithIapkitResult;
import dev.hyo.openiap.VerifyPurchaseWithProviderError;
import dev.hyo.openiap.VerifyPurchaseWithProviderProps;
import dev.hyo.openiap.VerifyPurchaseWithProviderResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/NitroVerifyPurchaseWithProviderResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$verifyPurchaseWithProvider$1", f = "HybridRnIap.kt", i = {}, l = {1481}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$verifyPurchaseWithProvider$1 extends SuspendLambda implements Function1<Continuation<? super NitroVerifyPurchaseWithProviderResult>, Object> {
    final /* synthetic */ NitroVerifyPurchaseWithProviderProps $params;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$verifyPurchaseWithProvider$1(NitroVerifyPurchaseWithProviderProps nitroVerifyPurchaseWithProviderProps, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$verifyPurchaseWithProvider$1> continuation) {
        super(1, continuation);
        this.$params = nitroVerifyPurchaseWithProviderProps;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$verifyPurchaseWithProvider$1(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroVerifyPurchaseWithProviderResult> continuation) {
        return ((HybridRnIap$verifyPurchaseWithProvider$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapModule openIap;
        NitroVerifyPurchaseWithIapkitProps value;
        String unwrapString;
        NitroVerifyPurchaseWithIapkitAppleProps value2;
        NitroVerifyPurchaseWithIapkitGoogleProps value3;
        NitroVerifyPurchaseWithIapkitResult nitroVerifyPurchaseWithIapkitResult;
        NitroVerifyPurchaseWithProviderError[] nitroVerifyPurchaseWithProviderErrorArr;
        PurchaseVerificationProvider mapPurchaseVerificationProvider;
        IapkitPurchaseState mapIapkitPurchaseState;
        IapStore mapIapkitStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String lowerCase = this.$params.getProvider().name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                RnIapLog.INSTANCE.payload("verifyPurchaseWithProvider", MapsKt.mapOf(TuplesKt.to("provider", lowerCase)));
                Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("provider", lowerCase));
                Variant_NullType_NitroVerifyPurchaseWithIapkitProps iapkit = this.$params.getIapkit();
                Variant_NullType_NitroVerifyPurchaseWithIapkitProps.Second second = iapkit instanceof Variant_NullType_NitroVerifyPurchaseWithIapkitProps.Second ? (Variant_NullType_NitroVerifyPurchaseWithIapkitProps.Second) iapkit : null;
                if (second != null && (value = second.getValue()) != null) {
                    HybridRnIap hybridRnIap = this.this$0;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    unwrapString = hybridRnIap.unwrapString(value.getApiKey());
                    if (unwrapString == null) {
                        unwrapString = hybridRnIap.getIapkitApiKeyFromManifest();
                    }
                    if (unwrapString != null) {
                        linkedHashMap.put("apiKey", unwrapString);
                    }
                    Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps google = value.getGoogle();
                    Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps.Second second2 = google instanceof Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps.Second ? (Variant_NullType_NitroVerifyPurchaseWithIapkitGoogleProps.Second) google : null;
                    if (second2 != null && (value3 = second2.getValue()) != null) {
                        linkedHashMap.put("google", MapsKt.mapOf(TuplesKt.to("purchaseToken", value3.getPurchaseToken())));
                    }
                    Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps apple = value.getApple();
                    Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps.Second second3 = apple instanceof Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps.Second ? (Variant_NullType_NitroVerifyPurchaseWithIapkitAppleProps.Second) apple : null;
                    if (second3 != null && (value2 = second3.getValue()) != null) {
                        linkedHashMap.put("apple", MapsKt.mapOf(TuplesKt.to("jws", value2.getJws())));
                    }
                    mutableMapOf.put("iapkit", linkedHashMap);
                }
                VerifyPurchaseWithProviderProps fromJson = VerifyPurchaseWithProviderProps.INSTANCE.fromJson(mutableMapOf);
                if (fromJson != null) {
                    openIap = this.this$0.getOpenIap();
                    Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> verifyPurchaseWithProvider = openIap.getVerifyPurchaseWithProvider();
                    this.label = 1;
                    obj = verifyPurchaseWithProvider.invoke(fromJson, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new Exception("Failed to parse VerifyPurchaseWithProviderProps");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            VerifyPurchaseWithProviderResult verifyPurchaseWithProviderResult = (VerifyPurchaseWithProviderResult) obj;
            RnIapLog rnIapLog = RnIapLog.INSTANCE;
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("provider", verifyPurchaseWithProviderResult.getProvider());
            pairArr[1] = TuplesKt.to("hasIapkit", Boxing.boxBoolean(verifyPurchaseWithProviderResult.getIapkit() != null));
            rnIapLog.result("verifyPurchaseWithProvider", MapsKt.mapOf(pairArr));
            RequestVerifyPurchaseWithIapkitResult iapkit2 = verifyPurchaseWithProviderResult.getIapkit();
            if (iapkit2 != null) {
                HybridRnIap hybridRnIap2 = this.this$0;
                boolean isValid = iapkit2.isValid();
                mapIapkitPurchaseState = hybridRnIap2.mapIapkitPurchaseState(iapkit2.getState().name());
                mapIapkitStore = hybridRnIap2.mapIapkitStore(iapkit2.getStore().name());
                nitroVerifyPurchaseWithIapkitResult = new NitroVerifyPurchaseWithIapkitResult(isValid, mapIapkitPurchaseState, mapIapkitStore);
            } else {
                nitroVerifyPurchaseWithIapkitResult = null;
            }
            List<VerifyPurchaseWithProviderError> errors = verifyPurchaseWithProviderResult.getErrors();
            if (errors != null) {
                List<VerifyPurchaseWithProviderError> list = errors;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (VerifyPurchaseWithProviderError verifyPurchaseWithProviderError : list) {
                    String code = verifyPurchaseWithProviderError.getCode();
                    Variant_NullType_String.Second second4 = code != null ? new Variant_NullType_String.Second(code) : null;
                    String message = verifyPurchaseWithProviderError.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    arrayList.add(new NitroVerifyPurchaseWithProviderError(second4, message));
                }
                nitroVerifyPurchaseWithProviderErrorArr = (NitroVerifyPurchaseWithProviderError[]) arrayList.toArray(new NitroVerifyPurchaseWithProviderError[0]);
            } else {
                nitroVerifyPurchaseWithProviderErrorArr = null;
            }
            Variant_NullType_NitroVerifyPurchaseWithIapkitResult.Second second5 = nitroVerifyPurchaseWithIapkitResult != null ? new Variant_NullType_NitroVerifyPurchaseWithIapkitResult.Second(nitroVerifyPurchaseWithIapkitResult) : null;
            Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_.Second second6 = nitroVerifyPurchaseWithProviderErrorArr != null ? new Variant_NullType_Array_NitroVerifyPurchaseWithProviderError_.Second(nitroVerifyPurchaseWithProviderErrorArr) : null;
            mapPurchaseVerificationProvider = this.this$0.mapPurchaseVerificationProvider(verifyPurchaseWithProviderResult.getProvider().name());
            return new NitroVerifyPurchaseWithProviderResult(second5, second6, mapPurchaseVerificationProvider);
        } catch (Exception e) {
            RnIapLog.INSTANCE.failure("verifyPurchaseWithProvider", e);
            OpenIapError.VerificationFailed verificationFailed = OpenIapError.VerificationFailed.INSTANCE;
            HybridRnIap hybridRnIap3 = this.this$0;
            OpenIapError.VerificationFailed verificationFailed2 = verificationFailed;
            String message2 = e.getMessage();
            String message3 = e.getMessage();
            if (message3 == null) {
                message3 = "unknown reason";
            }
            throw new OpenIapException(HybridRnIap.toErrorJson$default(hybridRnIap3, verificationFailed2, null, message2, "Verification failed: " + message3, 2, null));
        }
    }
}
