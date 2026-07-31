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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.SharedStorageImpl$getKeys$2", f = "SharedStorageImpl.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class SharedStorageImpl$getKeys$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {
    int label;
    final /* synthetic */ SharedStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedStorageImpl$getKeys$2(SharedStorageImpl sharedStorageImpl, Continuation<? super SharedStorageImpl$getKeys$2> continuation) {
        super(1, continuation);
        this.this$0 = sharedStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SharedStorageImpl$getKeys$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends String>> continuation) {
        return invoke2((Continuation<? super List<String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<String>> continuation) {
        return ((SharedStorageImpl$getKeys$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageDao storageDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        storageDao = this.this$0.storage;
        this.label = 1;
        Object keys = storageDao.getKeys(this);
        return keys == coroutine_suspended ? coroutine_suspended : keys;
    }
}
