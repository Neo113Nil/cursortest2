package dev.hyo.openiap.store;

import android.util.Log;
import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.Purchase;
import dev.hyo.openiap.PurchaseOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Ldev/hyo/openiap/Purchase;", "options", "Ldev/hyo/openiap/PurchaseOptions;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$getAvailablePurchases$1", f = "OpenIapStore.kt", i = {0}, l = {349}, m = "invokeSuspend", n = {"options"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapStore$getAvailablePurchases$1 extends SuspendLambda implements Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$getAvailablePurchases$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$getAvailablePurchases$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapStore$getAvailablePurchases$1 openIapStore$getAvailablePurchases$1 = new OpenIapStore$getAvailablePurchases$1(this.this$0, continuation);
        openIapStore$getAvailablePurchases$1.L$0 = obj;
        return openIapStore$getAvailablePurchases$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PurchaseOptions purchaseOptions, Continuation<? super List<? extends Purchase>> continuation) {
        return ((OpenIapStore$getAvailablePurchases$1) create(purchaseOptions, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapProtocol openIapProtocol;
        OpenIapProtocol openIapProtocol2;
        MutableStateFlow mutableStateFlow;
        PurchaseOptions purchaseOptions = (PurchaseOptions) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    openIapProtocol = this.this$0.module;
                    Log.i("OpenIapStore", "getAvailablePurchases called, module type: " + openIapProtocol.getClass().getSimpleName());
                    this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$getAvailablePurchases$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit invokeSuspend$lambda$0;
                            invokeSuspend$lambda$0 = OpenIapStore$getAvailablePurchases$1.invokeSuspend$lambda$0((LoadingStates) obj2);
                            return invokeSuspend$lambda$0;
                        }
                    });
                    Log.i("OpenIapStore", "Calling module.getAvailablePurchases(options)");
                    openIapProtocol2 = this.this$0.module;
                    Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getAvailablePurchases = openIapProtocol2.getGetAvailablePurchases();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(purchaseOptions);
                    this.label = 1;
                    obj = getAvailablePurchases.invoke(purchaseOptions, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                Log.i("OpenIapStore", "module.getAvailablePurchases returned " + list.size() + " purchases");
                mutableStateFlow = this.this$0._availablePurchases;
                mutableStateFlow.setValue(list);
                return list;
            } catch (Exception e) {
                Log.e("OpenIapStore", "getAvailablePurchases exception: " + e.getMessage(), e);
                this.this$0.setError(e.getMessage());
                throw e;
            }
        } finally {
            this.this$0.setLoading(new Function1() { // from class: dev.hyo.openiap.store.OpenIapStore$getAvailablePurchases$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = OpenIapStore$getAvailablePurchases$1.invokeSuspend$lambda$1((LoadingStates) obj2);
                    return invokeSuspend$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(LoadingStates loadingStates) {
        loadingStates.setRestorePurchases(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(LoadingStates loadingStates) {
        loadingStates.setRestorePurchases(false);
        return Unit.INSTANCE;
    }
}
