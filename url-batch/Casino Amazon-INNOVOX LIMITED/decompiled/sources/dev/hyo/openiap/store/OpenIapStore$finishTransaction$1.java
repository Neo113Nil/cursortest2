package dev.hyo.openiap.store;

import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.Purchase;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "", "purchaseInput", "Ldev/hyo/openiap/Purchase;", "Ldev/hyo/openiap/PurchaseInput;", "isConsumable", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$finishTransaction$1", f = "OpenIapStore.kt", i = {0, 0, 0}, l = {392}, m = "invokeSuspend", n = {"purchaseInput", "isConsumable", "token"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class OpenIapStore$finishTransaction$1 extends SuspendLambda implements Function3<Purchase, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$finishTransaction$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$finishTransaction$1> continuation) {
        super(3, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Purchase purchase, Boolean bool, Continuation<? super Unit> continuation) {
        OpenIapStore$finishTransaction$1 openIapStore$finishTransaction$1 = new OpenIapStore$finishTransaction$1(this.this$0, continuation);
        openIapStore$finishTransaction$1.L$0 = purchase;
        openIapStore$finishTransaction$1.L$1 = bool;
        return openIapStore$finishTransaction$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r3.contains(r7) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0017, B:9:0x0063, B:20:0x0038, B:22:0x0048), top: B:2:0x000f }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String purchaseToken;
        OpenIapProtocol openIapProtocol;
        String str;
        Set set;
        Set set2;
        Purchase purchase = (Purchase) this.L$0;
        Boolean bool = (Boolean) this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                purchaseToken = purchase.getPurchaseToken();
                if (purchaseToken != null) {
                    set = this.this$0.processedPurchaseTokens;
                }
                openIapProtocol = this.this$0.module;
                Function3<Purchase, Boolean, Continuation<? super Unit>, Object> finishTransaction = openIapProtocol.getMutationHandlers().getFinishTransaction();
                if (finishTransaction != null) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(purchase);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(bool);
                    this.L$2 = purchaseToken;
                    this.label = 1;
                    if (finishTransaction.invoke(purchase, bool, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = purchaseToken;
                }
                if (purchaseToken != null) {
                    set2 = this.this$0.processedPurchaseTokens;
                    set2.add(purchaseToken);
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            ResultKt.throwOnFailure(obj);
            purchaseToken = str;
            if (purchaseToken != null) {
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            this.this$0.setError(e.getMessage());
            throw e;
        }
    }
}
