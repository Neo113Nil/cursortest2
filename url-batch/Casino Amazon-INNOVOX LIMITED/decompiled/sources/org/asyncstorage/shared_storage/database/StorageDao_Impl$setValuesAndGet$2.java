package org.asyncstorage.shared_storage.database;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: StorageDao_Impl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lorg/asyncstorage/shared_storage/database/StorageEntry;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.database.StorageDao_Impl$setValuesAndGet$2", f = "StorageDao_Impl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class StorageDao_Impl$setValuesAndGet$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends StorageEntry>>, Object> {
    final /* synthetic */ List<StorageEntry> $entries;
    int label;
    final /* synthetic */ StorageDao_Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StorageDao_Impl$setValuesAndGet$2(StorageDao_Impl storageDao_Impl, List<StorageEntry> list, Continuation<? super StorageDao_Impl$setValuesAndGet$2> continuation) {
        super(1, continuation);
        this.this$0 = storageDao_Impl;
        this.$entries = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StorageDao_Impl$setValuesAndGet$2(this.this$0, this.$entries, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends StorageEntry>> continuation) {
        return invoke2((Continuation<? super List<StorageEntry>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<StorageEntry>> continuation) {
        return ((StorageDao_Impl$setValuesAndGet$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object valuesAndGet;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        valuesAndGet = super/*org.asyncstorage.shared_storage.database.StorageDao*/.setValuesAndGet(this.$entries, this);
        return valuesAndGet == coroutine_suspended ? coroutine_suspended : valuesAndGet;
    }
}
