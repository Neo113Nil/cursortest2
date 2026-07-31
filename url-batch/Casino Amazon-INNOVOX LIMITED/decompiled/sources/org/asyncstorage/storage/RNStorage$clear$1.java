package org.asyncstorage.storage;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.asyncstorage.shared_storage.SharedStorage;

/* compiled from: RNStorage.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.storage.RNStorage$clear$1", f = "RNStorage.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class RNStorage$clear$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ RNStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RNStorage$clear$1(RNStorage rNStorage, Promise promise, Continuation<? super RNStorage$clear$1> continuation) {
        super(1, continuation);
        this.this$0 = rNStorage;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RNStorage$clear$1(this.this$0, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((RNStorage$clear$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedStorage sharedStorage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sharedStorage = this.this$0.db;
            this.label = 1;
            if (sharedStorage.clear(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$promise.resolve(null);
        return Unit.INSTANCE;
    }
}
