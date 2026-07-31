package dev.hyo.openiap;

import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.utils.PurchaseVerificationValidatorKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/VerifyPurchaseWithProviderResult;", "props", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$verifyPurchaseWithProvider$1", f = "OpenIapModule.kt", i = {0, 0}, l = {1192}, m = "invokeSuspend", n = {"props", "options"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class OpenIapModule$verifyPurchaseWithProvider$1 extends SuspendLambda implements Function2<VerifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    OpenIapModule$verifyPurchaseWithProvider$1(Continuation<? super OpenIapModule$verifyPurchaseWithProvider$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$verifyPurchaseWithProvider$1 openIapModule$verifyPurchaseWithProvider$1 = new OpenIapModule$verifyPurchaseWithProvider$1(continuation);
        openIapModule$verifyPurchaseWithProvider$1.L$0 = obj;
        return openIapModule$verifyPurchaseWithProvider$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(VerifyPurchaseWithProviderProps verifyPurchaseWithProviderProps, Continuation<? super VerifyPurchaseWithProviderResult> continuation) {
        return ((OpenIapModule$verifyPurchaseWithProvider$1) create(verifyPurchaseWithProviderProps, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VerifyPurchaseWithProviderProps verifyPurchaseWithProviderProps = (VerifyPurchaseWithProviderProps) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (verifyPurchaseWithProviderProps.getProvider() != PurchaseVerificationProvider.Iapkit) {
                throw OpenIapError.FeatureNotSupported.INSTANCE;
            }
            RequestVerifyPurchaseWithIapkitProps iapkit = verifyPurchaseWithProviderProps.getIapkit();
            if (iapkit == null) {
                throw OpenIapError.DeveloperError.INSTANCE;
            }
            this.L$0 = verifyPurchaseWithProviderProps;
            this.L$1 = SpillingKt.nullOutSpilledVariable(iapkit);
            this.label = 1;
            obj = PurchaseVerificationValidatorKt.verifyPurchaseWithIapkit$default(iapkit, "OpenIapModule", null, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new VerifyPurchaseWithProviderResult(null, (RequestVerifyPurchaseWithIapkitResult) obj, verifyPurchaseWithProviderProps.getProvider(), 1, null);
    }
}
