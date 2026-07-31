package org.asyncstorage.legacy_storage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LegacyStorageModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.legacy_storage.LegacyStorageModule$multiGet$1", f = "LegacyStorageModule.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class LegacyStorageModule$multiGet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReadableArray $keys;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ LegacyStorageModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyStorageModule$multiGet$1(LegacyStorageModule legacyStorageModule, ReadableArray readableArray, Promise promise, Continuation<? super LegacyStorageModule$multiGet$1> continuation) {
        super(2, continuation);
        this.this$0 = legacyStorageModule;
        this.$keys = readableArray;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LegacyStorageModule$multiGet$1(this.this$0, this.$keys, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LegacyStorageModule$multiGet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AsyncStorageAccess asyncStorageAccess;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            asyncStorageAccess = this.this$0.storage;
            this.label = 1;
            obj = asyncStorageAccess.getValues(LegacyStorageSupplierKt.toKeyList(this.$keys), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$promise.resolve(LegacyStorageSupplierKt.toKeyValueArgument((List) obj));
        return Unit.INSTANCE;
    }
}
