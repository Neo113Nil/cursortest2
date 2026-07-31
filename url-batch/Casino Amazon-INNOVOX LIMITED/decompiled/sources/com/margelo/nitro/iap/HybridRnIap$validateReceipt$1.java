package com.margelo.nitro.iap;

import com.margelo.nitro.iap.Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid;
import com.margelo.nitro.iap.Variant_NullType_NitroReceiptValidationGoogleOptions;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.VerifyPurchaseGoogleOptions;
import dev.hyo.openiap.VerifyPurchaseProps;
import dev.hyo.openiap.VerifyPurchaseResult;
import dev.hyo.openiap.VerifyPurchaseResultAndroid;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$validateReceipt$1", f = "HybridRnIap.kt", i = {}, l = {1407}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$validateReceipt$1 extends SuspendLambda implements Function1<Continuation<? super Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid>, Object> {
    final /* synthetic */ NitroReceiptValidationParams $params;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$validateReceipt$1(NitroReceiptValidationParams nitroReceiptValidationParams, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$validateReceipt$1> continuation) {
        super(1, continuation);
        this.$params = nitroReceiptValidationParams;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$validateReceipt$1(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid> continuation) {
        return ((HybridRnIap$validateReceipt$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NitroReceiptValidationGoogleOptions value;
        Boolean unwrapBool;
        Boolean unwrapBool2;
        OpenIapModule openIap;
        Object invoke;
        Variant_NullType_Double wrapVariant;
        Variant_NullType_String wrapVariant2;
        Variant_NullType_Double wrapVariant3;
        Variant_NullType_String wrapVariant4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Variant_NullType_NitroReceiptValidationGoogleOptions google = this.$params.getGoogle();
                Variant_NullType_NitroReceiptValidationGoogleOptions.Second second = google instanceof Variant_NullType_NitroReceiptValidationGoogleOptions.Second ? (Variant_NullType_NitroReceiptValidationGoogleOptions.Second) google : null;
                if (second == null || (value = second.getValue()) == null) {
                    throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.DeveloperError.INSTANCE, null, "Missing required parameter: google options", null, 10, null));
                }
                for (Map.Entry entry : MapsKt.mapOf(TuplesKt.to("google.sku", value.getSku()), TuplesKt.to("google.accessToken", value.getAccessToken()), TuplesKt.to("google.packageName", value.getPackageName()), TuplesKt.to("google.purchaseToken", value.getPurchaseToken())).entrySet()) {
                    String str = (String) entry.getKey();
                    if (((String) entry.getValue()).length() == 0) {
                        throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.DeveloperError.INSTANCE, null, "Missing or empty required parameter: " + str, null, 10, null));
                    }
                }
                RnIapLog rnIapLog = RnIapLog.INSTANCE;
                unwrapBool = this.this$0.unwrapBool(value.isSub());
                rnIapLog.payload("validateReceipt", MapsKt.mapOf(TuplesKt.to("sku", value.getSku()), TuplesKt.to("packageName", value.getPackageName()), TuplesKt.to("isSub", unwrapBool)));
                String sku = value.getSku();
                String accessToken = value.getAccessToken();
                String packageName = value.getPackageName();
                String purchaseToken = value.getPurchaseToken();
                unwrapBool2 = this.this$0.unwrapBool(value.isSub());
                VerifyPurchaseProps verifyPurchaseProps = new VerifyPurchaseProps(null, new VerifyPurchaseGoogleOptions(accessToken, unwrapBool2, packageName, purchaseToken, sku), null, 5, null);
                openIap = this.this$0.getOpenIap();
                Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> verifyPurchase = openIap.getVerifyPurchase();
                this.label = 1;
                invoke = verifyPurchase.invoke(verifyPurchaseProps, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                invoke = obj;
            }
            VerifyPurchaseResult verifyPurchaseResult = (VerifyPurchaseResult) invoke;
            RnIapLog.INSTANCE.result("validateReceipt", verifyPurchaseResult.toString());
            VerifyPurchaseResultAndroid verifyPurchaseResultAndroid = verifyPurchaseResult instanceof VerifyPurchaseResultAndroid ? (VerifyPurchaseResultAndroid) verifyPurchaseResult : null;
            if (verifyPurchaseResultAndroid == null) {
                throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.InvalidPurchaseVerification.INSTANCE, null, "Unexpected result type from verifyPurchase", null, 10, null));
            }
            boolean autoRenewing = verifyPurchaseResultAndroid.getAutoRenewing();
            boolean betaProduct = verifyPurchaseResultAndroid.getBetaProduct();
            wrapVariant = this.this$0.wrapVariant(verifyPurchaseResultAndroid.getCancelDate());
            wrapVariant2 = this.this$0.wrapVariant(verifyPurchaseResultAndroid.getCancelReason());
            wrapVariant3 = this.this$0.wrapVariant(verifyPurchaseResultAndroid.getDeferredDate());
            wrapVariant4 = this.this$0.wrapVariant(verifyPurchaseResultAndroid.getDeferredSku());
            VerifyPurchaseResultAndroid verifyPurchaseResultAndroid2 = verifyPurchaseResultAndroid;
            return new Variant_NitroReceiptValidationResultIOS_NitroReceiptValidationResultAndroid.Second(new NitroReceiptValidationResultAndroid(autoRenewing, betaProduct, wrapVariant, wrapVariant2, wrapVariant3, wrapVariant4, verifyPurchaseResultAndroid.getFreeTrialEndDate(), verifyPurchaseResultAndroid.getGracePeriodEndDate(), verifyPurchaseResultAndroid.getParentProductId(), verifyPurchaseResultAndroid.getProductId(), verifyPurchaseResultAndroid.getProductType(), verifyPurchaseResultAndroid.getPurchaseDate(), verifyPurchaseResultAndroid.getQuantity(), verifyPurchaseResultAndroid2.getReceiptId(), verifyPurchaseResultAndroid2.getRenewalDate(), verifyPurchaseResultAndroid2.getTerm(), verifyPurchaseResultAndroid2.getTermSku(), verifyPurchaseResultAndroid2.getTestTransaction()));
        } catch (OpenIapException e) {
            RnIapLog.INSTANCE.failure("validateReceipt", e);
            throw e;
        } catch (Exception e2) {
            RnIapLog.INSTANCE.failure("validateReceipt", e2);
            String message = e2.getMessage();
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.InvalidPurchaseVerification.INSTANCE, null, message, "Receipt validation failed: " + (message == null ? "unknown reason" : message), 2, null));
        }
    }
}
