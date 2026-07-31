package org.asyncstorage.shared_storage;

import co.touchlab.kermit.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: StorageException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.StorageExceptionKt$catchStorageException$3", f = "StorageException.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class StorageExceptionKt$catchStorageException$3<T> extends SuspendLambda implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Logger $log;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageExceptionKt$catchStorageException$3(Logger logger, Continuation<? super StorageExceptionKt$catchStorageException$3> continuation) {
        super(3, continuation);
        this.$log = logger;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        StorageExceptionKt$catchStorageException$3 storageExceptionKt$catchStorageException$3 = new StorageExceptionKt$catchStorageException$3(this.$log, continuation);
        storageExceptionKt$catchStorageException$3.L$0 = th;
        return storageExceptionKt$catchStorageException$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageException asStorageException;
        Throwable th = (Throwable) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        asStorageException = StorageExceptionKt.asStorageException(th, this.$log);
        throw asStorageException;
    }
}
