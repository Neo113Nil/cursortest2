package com.margelo.nitro.iap;

import com.margelo.nitro.iap.Variant_Boolean_NitroPurchaseResult;
import com.margelo.nitro.iap.Variant_NullType_NitroFinishTransactionAndroidParams;
import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.opentelemetry.semconv.OtelAttributes;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/margelo/nitro/iap/Variant_Boolean_NitroPurchaseResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$finishTransaction$1", f = "HybridRnIap.kt", i = {0, 0, 1, 2}, l = {725, 741, 743}, m = "invokeSuspend", n = {"purchaseToken", "isConsumable", "purchaseToken", "purchaseToken"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: classes2.dex */
final class HybridRnIap$finishTransaction$1 extends SuspendLambda implements Function1<Continuation<? super Variant_Boolean_NitroPurchaseResult>, Object> {
    final /* synthetic */ NitroFinishTransactionParams $params;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$finishTransaction$1(NitroFinishTransactionParams nitroFinishTransactionParams, HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$finishTransaction$1> continuation) {
        super(1, continuation);
        this.$params = nitroFinishTransactionParams;
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$finishTransaction$1(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Variant_Boolean_NitroPurchaseResult> continuation) {
        return ((HybridRnIap$finishTransaction$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015a, code lost:
    
        if (r4 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
    
        if (r4 == null) goto L70;
     */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v35 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String message;
        NitroFinishTransactionAndroidParams value;
        String purchaseToken;
        Boolean unwrapBool;
        Object ensureConnection;
        int i;
        OpenIapModule openIap;
        String str;
        OpenIapModule openIap2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Variant_NullType_NitroFinishTransactionAndroidParams android2 = this.$params.getAndroid();
                    Variant_NullType_NitroFinishTransactionAndroidParams.Second second = android2 instanceof Variant_NullType_NitroFinishTransactionAndroidParams.Second ? (Variant_NullType_NitroFinishTransactionAndroidParams.Second) android2 : null;
                    if (second == null || (value = second.getValue()) == null) {
                        return new Variant_Boolean_NitroPurchaseResult.First(true);
                    }
                    purchaseToken = value.getPurchaseToken();
                    unwrapBool = this.this$0.unwrapBool(value.isConsumable());
                    ?? booleanValue = unwrapBool != null ? unwrapBool.booleanValue() : 0;
                    RnIapLog.INSTANCE.payload("finishTransaction", MapsKt.mapOf(TuplesKt.to("purchaseToken", "<hidden>"), TuplesKt.to("isConsumable", Boxing.boxBoolean(booleanValue))));
                    if (!StringsKt.isBlank(purchaseToken)) {
                        this.L$0 = purchaseToken;
                        this.I$0 = booleanValue;
                        this.label = 1;
                        ensureConnection = this.this$0.ensureConnection(this);
                        if (ensureConnection != coroutine_suspended) {
                            i = booleanValue;
                        }
                        return coroutine_suspended;
                    }
                    RnIapLog.INSTANCE.warn("finishTransaction called with missing purchaseToken");
                    return new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(-1.0d, "Missing purchaseToken", OpenIapError.INSTANCE.toCode(OpenIapError.DeveloperError.INSTANCE), "Missing purchaseToken", null));
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = (String) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ((Boolean) obj).booleanValue();
                        Variant_Boolean_NitroPurchaseResult.Second second2 = new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(0.0d, null, CommonUrlParts.Values.FALSE_INTEGER, OtelAttributes.OtelStatusCodeValues.OK, str));
                        RnIapLog.INSTANCE.result("finishTransaction", MapsKt.mapOf(TuplesKt.to("success", Boxing.boxBoolean(true))));
                        return second2;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ((Boolean) obj).booleanValue();
                    Variant_Boolean_NitroPurchaseResult.Second second22 = new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(0.0d, null, CommonUrlParts.Values.FALSE_INTEGER, OtelAttributes.OtelStatusCodeValues.OK, str));
                    RnIapLog.INSTANCE.result("finishTransaction", MapsKt.mapOf(TuplesKt.to("success", Boxing.boxBoolean(true))));
                    return second22;
                }
                i = this.I$0;
                purchaseToken = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (i != 0) {
                    openIap2 = this.this$0.getOpenIap();
                    Function2<String, Continuation<? super Boolean>, Object> consumePurchaseAndroid = openIap2.getConsumePurchaseAndroid();
                    this.L$0 = purchaseToken;
                    this.label = 2;
                    obj = consumePurchaseAndroid.invoke(purchaseToken, this);
                    if (obj != coroutine_suspended) {
                        str = purchaseToken;
                        ((Boolean) obj).booleanValue();
                        Variant_Boolean_NitroPurchaseResult.Second second222 = new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(0.0d, null, CommonUrlParts.Values.FALSE_INTEGER, OtelAttributes.OtelStatusCodeValues.OK, str));
                        RnIapLog.INSTANCE.result("finishTransaction", MapsKt.mapOf(TuplesKt.to("success", Boxing.boxBoolean(true))));
                        return second222;
                    }
                } else {
                    openIap = this.this$0.getOpenIap();
                    Function2<String, Continuation<? super Boolean>, Object> acknowledgePurchaseAndroid = openIap.getAcknowledgePurchaseAndroid();
                    this.L$0 = purchaseToken;
                    this.label = 3;
                    obj = acknowledgePurchaseAndroid.invoke(purchaseToken, this);
                    if (obj != coroutine_suspended) {
                        str = purchaseToken;
                        ((Boolean) obj).booleanValue();
                        Variant_Boolean_NitroPurchaseResult.Second second2222 = new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(0.0d, null, CommonUrlParts.Values.FALSE_INTEGER, OtelAttributes.OtelStatusCodeValues.OK, str));
                        RnIapLog.INSTANCE.result("finishTransaction", MapsKt.mapOf(TuplesKt.to("success", Boxing.boxBoolean(true))));
                        return second2222;
                    }
                }
                return coroutine_suspended;
            } catch (Exception e) {
                OpenIapError.BillingError billingError = OpenIapError.BillingError.INSTANCE;
                RnIapLog.INSTANCE.failure("finishTransaction", e);
                String message2 = e.getMessage();
                String code = OpenIapError.INSTANCE.toCode(billingError);
                String message3 = e.getMessage();
                if (message3 != null) {
                    message = StringsKt.isBlank(message3) ? null : message3;
                }
                message = billingError.getMessage();
                return new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(-1.0d, message2, code, message, null));
            }
        } catch (Exception e2) {
            String str2 = purchaseToken;
            OpenIapError.InitConnection initConnection = OpenIapError.InitConnection.INSTANCE;
            String message4 = e2.getMessage();
            String code2 = OpenIapError.INSTANCE.toCode(initConnection);
            String message5 = e2.getMessage();
            if (message5 != null) {
                message = StringsKt.isBlank(message5) ? null : message5;
            }
            message = initConnection.getMessage();
            return new Variant_Boolean_NitroPurchaseResult.Second(new NitroPurchaseResult(-1.0d, message4, code2, message, str2));
        }
    }
}
