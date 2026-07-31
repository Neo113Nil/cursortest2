package org.asyncstorage.shared_storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StorageException.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.StorageExceptionKt", f = "StorageException.kt", i = {0, 0}, l = {19}, m = "catchStorageException", n = {"log", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class StorageExceptionKt$catchStorageException$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    StorageExceptionKt$catchStorageException$1(Continuation<? super StorageExceptionKt$catchStorageException$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StorageExceptionKt.catchStorageException(null, null, this);
    }
}
