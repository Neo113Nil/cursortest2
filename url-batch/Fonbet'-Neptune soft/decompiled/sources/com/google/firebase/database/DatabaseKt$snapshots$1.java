package com.google.firebase.database;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/firebase/database/DataSnapshot;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.database.DatabaseKt$snapshots$1", f = "Database.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class DatabaseKt$snapshots$1 extends SuspendLambda implements Function2<ProducerScope<? super DataSnapshot>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Query $this_snapshots;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatabaseKt$snapshots$1(Query query, Continuation<? super DatabaseKt$snapshots$1> continuation) {
        super(2, continuation);
        this.$this_snapshots = query;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DatabaseKt$snapshots$1 databaseKt$snapshots$1 = new DatabaseKt$snapshots$1(this.$this_snapshots, continuation);
        databaseKt$snapshots$1.L$0 = obj;
        return databaseKt$snapshots$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super DataSnapshot> producerScope, Continuation<? super Unit> continuation) {
        return ((DatabaseKt$snapshots$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final ValueEventListener addValueEventListener = this.$this_snapshots.addValueEventListener(new DatabaseKt$snapshots$1$listener$1(this.$this_snapshots, producerScope));
            Intrinsics.checkNotNullExpressionValue(addValueEventListener, "addValueEventListener(...)");
            final Query query = this.$this_snapshots;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.google.firebase.database.DatabaseKt$snapshots$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = DatabaseKt$snapshots$1.invokeSuspend$lambda$0(Query.this, addValueEventListener);
                    return invokeSuspend$lambda$0;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Query query, ValueEventListener valueEventListener) {
        query.removeEventListener(valueEventListener);
        return Unit.INSTANCE;
    }
}
