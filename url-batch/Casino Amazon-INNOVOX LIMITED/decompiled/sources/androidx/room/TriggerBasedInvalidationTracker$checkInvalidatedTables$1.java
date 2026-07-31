package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InvalidationTracker.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 1}, l = {445, 453}, m = "checkInvalidatedTables", n = {"connection", "invalidatedTableIds"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class TriggerBasedInvalidationTracker$checkInvalidatedTables$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$checkInvalidatedTables$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation<? super TriggerBasedInvalidationTracker$checkInvalidatedTables$1> continuation) {
        super(continuation);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object checkInvalidatedTables;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        checkInvalidatedTables = this.this$0.checkInvalidatedTables(null, this);
        return checkInvalidatedTables;
    }
}
