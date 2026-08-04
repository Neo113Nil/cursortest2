package org.asyncstorage.shared_storage.database;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StorageDatabase.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.database.StorageDao", f = "StorageDatabase.kt", i = {0, 0, 1, 1}, l = {26, 27}, m = "setValuesAndGet$suspendImpl", n = {"$this", "entries", "$this", "entries"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class StorageDao$setValuesAndGet$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StorageDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageDao$setValuesAndGet$1(StorageDao storageDao, Continuation<? super StorageDao$setValuesAndGet$1> continuation) {
        super(continuation);
        this.this$0 = storageDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StorageDao.setValuesAndGet$suspendImpl(this.this$0, null, this);
    }
}
