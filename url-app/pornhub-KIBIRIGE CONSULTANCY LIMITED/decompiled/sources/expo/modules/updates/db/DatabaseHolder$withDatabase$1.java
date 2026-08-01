package expo.modules.updates.db;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DatabaseHolder.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.db.DatabaseHolder", f = "DatabaseHolder.kt", i = {0, 0, 1}, l = {40, 26}, m = "withDatabase", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes2.dex */
final class DatabaseHolder$withDatabase$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DatabaseHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseHolder$withDatabase$1(DatabaseHolder databaseHolder, Continuation<? super DatabaseHolder$withDatabase$1> continuation) {
        super(continuation);
        this.this$0 = databaseHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withDatabase(null, this);
    }
}
