package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
/* loaded from: classes.dex */
final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object readDataOrHandleCorruption;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readDataOrHandleCorruption = this.this$0.readDataOrHandleCorruption(this);
        return readDataOrHandleCorruption;
    }
}
