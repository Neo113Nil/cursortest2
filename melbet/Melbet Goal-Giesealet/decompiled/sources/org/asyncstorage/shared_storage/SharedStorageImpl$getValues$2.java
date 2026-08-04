package org.asyncstorage.shared_storage;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.asyncstorage.shared_storage.database.StorageDao;

/* compiled from: SharedStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lorg/asyncstorage/shared_storage/Entry;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.SharedStorageImpl$getValues$2", f = "SharedStorageImpl.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SharedStorageImpl$getValues$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends Entry>>, Object> {
    final /* synthetic */ List<String> $keys;
    Object L$0;
    int label;
    final /* synthetic */ SharedStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedStorageImpl$getValues$2(SharedStorageImpl sharedStorageImpl, List<String> list, Continuation<? super SharedStorageImpl$getValues$2> continuation) {
        super(1, continuation);
        this.this$0 = sharedStorageImpl;
        this.$keys = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SharedStorageImpl$getValues$2(this.this$0, this.$keys, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Entry>> continuation) {
        return invoke2((Continuation<? super List<Entry>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<Entry>> continuation) {
        return ((SharedStorageImpl$getValues$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageDao storageDao;
        SharedStorageImpl sharedStorageImpl;
        List requestedEntry;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedStorageImpl sharedStorageImpl2 = this.this$0;
            storageDao = sharedStorageImpl2.storage;
            this.L$0 = sharedStorageImpl2;
            this.label = 1;
            Object values = storageDao.getValues(this.$keys, this);
            if (values == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedStorageImpl = sharedStorageImpl2;
            obj = values;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedStorageImpl = (SharedStorageImpl) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        requestedEntry = sharedStorageImpl.toRequestedEntry((List) obj, this.$keys);
        return requestedEntry;
    }
}
