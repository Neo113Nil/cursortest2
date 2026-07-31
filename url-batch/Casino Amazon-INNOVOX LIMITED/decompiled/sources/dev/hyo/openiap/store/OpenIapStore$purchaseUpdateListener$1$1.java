package dev.hyo.openiap.store;

import android.util.Log;
import dev.hyo.openiap.OpenIapProtocol;
import dev.hyo.openiap.Purchase;
import dev.hyo.openiap.PurchaseOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore$purchaseUpdateListener$1$1", f = "OpenIapStore.kt", i = {}, l = {122, 133}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OpenIapStore$purchaseUpdateListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$purchaseUpdateListener$1$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$purchaseUpdateListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenIapStore$purchaseUpdateListener$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OpenIapStore$purchaseUpdateListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r10 == r2) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OpenIapProtocol openIapProtocol;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            Log.e("OpenIapStore", "Failed to refresh purchases after update", e);
            e.printStackTrace();
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.i("OpenIapStore", "Purchase update received, refreshing available purchases");
            this.label = 1;
            if (DelayKt.delay(500L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) obj;
                Log.i("OpenIapStore", "module.getAvailablePurchases returned: " + list.size() + " purchases");
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Log.i("OpenIapStore", "  Purchase[" + i2 + "]: " + ((Purchase) obj2).getProductId());
                    i2 = i3;
                }
                mutableStateFlow = this.this$0._availablePurchases;
                mutableStateFlow.setValue(list);
                Log.i("OpenIapStore", "Available purchases updated: " + list.size() + " purchases");
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.this$0.isConnected().getValue().booleanValue()) {
            Log.w("OpenIapStore", "Not connected, skipping purchase refresh (connection will be restored on next app start)");
            return Unit.INSTANCE;
        }
        Log.i("OpenIapStore", "About to call module.getAvailablePurchases(null)");
        openIapProtocol = this.this$0.module;
        Function2<PurchaseOptions, Continuation<? super List<? extends Purchase>>, Object> getAvailablePurchases = openIapProtocol.getGetAvailablePurchases();
        this.label = 2;
        obj = getAvailablePurchases.invoke(null, this);
    }
}
