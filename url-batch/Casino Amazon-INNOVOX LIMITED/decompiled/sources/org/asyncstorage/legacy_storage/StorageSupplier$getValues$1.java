package org.asyncstorage.legacy_storage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LegacyStorageSupplier.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.legacy_storage.StorageSupplier", f = "LegacyStorageSupplier.kt", i = {0}, l = {160}, m = "getValues", n = {"keys"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class StorageSupplier$getValues$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StorageSupplier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageSupplier$getValues$1(StorageSupplier storageSupplier, Continuation<? super StorageSupplier$getValues$1> continuation) {
        super(continuation);
        this.this$0 = storageSupplier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getValues(null, this);
    }
}
