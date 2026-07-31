package dev.hyo.openiap.store;

import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.listener.OpenIapPurchaseErrorListener;
import dev.hyo.openiap.listener.OpenIapPurchaseUpdateListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$endConnection$1", f = "OpenIapStore.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OpenIapStore$endConnection$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$endConnection$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$endConnection$1> continuation) {
        super(1, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OpenIapStore$endConnection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((OpenIapStore$endConnection$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapPurchaseUpdateListener openIapPurchaseUpdateListener;
        OpenIapPurchaseErrorListener openIapPurchaseErrorListener;
        OpenIapProtocol openIapProtocol;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OpenIapStore openIapStore = this.this$0;
                openIapPurchaseUpdateListener = openIapStore.purchaseUpdateListener;
                openIapStore.removePurchaseUpdateListener(openIapPurchaseUpdateListener);
                OpenIapStore openIapStore2 = this.this$0;
                openIapPurchaseErrorListener = openIapStore2.purchaseErrorListener;
                openIapStore2.removePurchaseErrorListener(openIapPurchaseErrorListener);
                openIapProtocol = this.this$0.module;
                Function1<Continuation<? super Boolean>, Object> endConnection = openIapProtocol.getEndConnection();
                this.label = 1;
                obj = endConnection.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            mutableStateFlow = this.this$0._isConnected;
            mutableStateFlow.setValue(Boxing.boxBoolean(false));
            this.this$0.clear();
            return Boxing.boxBoolean(booleanValue);
        } catch (Exception e) {
            this.this$0.setError(e.getMessage());
            throw e;
        }
    }
}
