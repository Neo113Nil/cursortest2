package dev.hyo.openiap.store;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OpenIapStore.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.store.OpenIapStore", f = "OpenIapStore.kt", i = {0}, l = {406}, m = "getActiveSubscriptions", n = {"subscriptionIds"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapStore$getActiveSubscriptions$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OpenIapStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapStore$getActiveSubscriptions$1(OpenIapStore openIapStore, Continuation<? super OpenIapStore$getActiveSubscriptions$1> continuation) {
        super(continuation);
        this.this$0 = openIapStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getActiveSubscriptions(null, this);
    }
}
