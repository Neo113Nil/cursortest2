package androidx.room;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoomDatabaseExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$this_withTransaction = roomDatabase;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.$this_withTransaction, this.$block, continuation);
        roomDatabaseKt$withTransaction$transactionBlock$1.L$0 = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.L$0).getCoroutineContext().get(TransactionElement.INSTANCE);
                Intrinsics.checkNotNull(element);
                TransactionElement transactionElement2 = (TransactionElement) element;
                transactionElement2.acquire();
                try {
                    this.$this_withTransaction.beginTransaction();
                    try {
                        Function1 function1 = this.$block;
                        this.L$0 = transactionElement2;
                        this.label = 1;
                        Object invoke = function1.invoke(this);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        transactionElement = transactionElement2;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        this.$this_withTransaction.endTransaction();
                        throw th;
                    }
                } catch (Throwable th3) {
                    coroutine_suspended = transactionElement2;
                    th = th3;
                    coroutine_suspended.release();
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th4) {
                    th = th4;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            }
            this.$this_withTransaction.setTransactionSuccessful();
            this.$this_withTransaction.endTransaction();
            transactionElement.release();
            return obj;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
