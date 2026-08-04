package org.asyncstorage.shared_storage;

import androidx.constraintlayout.widget.ConstraintLayout;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.SharedStorageImpl$clear$2", f = "SharedStorageImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SharedStorageImpl$clear$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SharedStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedStorageImpl$clear$2(SharedStorageImpl sharedStorageImpl, Continuation<? super SharedStorageImpl$clear$2> continuation) {
        super(1, continuation);
        this.this$0 = sharedStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SharedStorageImpl$clear$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((SharedStorageImpl$clear$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageDao storageDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            storageDao = this.this$0.storage;
            this.label = 1;
            if (storageDao.clear(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
