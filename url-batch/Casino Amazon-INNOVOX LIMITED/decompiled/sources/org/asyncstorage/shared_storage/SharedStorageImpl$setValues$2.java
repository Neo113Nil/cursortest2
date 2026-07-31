package org.asyncstorage.shared_storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.asyncstorage.shared_storage.database.StorageDao;

/* compiled from: SharedStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lorg/asyncstorage/shared_storage/Entry;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "org.asyncstorage.shared_storage.SharedStorageImpl$setValues$2", f = "SharedStorageImpl.kt", i = {0}, l = {44}, m = "invokeSuspend", n = {"values"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class SharedStorageImpl$setValues$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends Entry>>, Object> {
    final /* synthetic */ List<Entry> $entries;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SharedStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedStorageImpl$setValues$2(List<Entry> list, SharedStorageImpl sharedStorageImpl, Continuation<? super SharedStorageImpl$setValues$2> continuation) {
        super(1, continuation);
        this.$entries = list;
        this.this$0 = sharedStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SharedStorageImpl$setValues$2(this.$entries, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Entry>> continuation) {
        return invoke2((Continuation<? super List<Entry>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<Entry>> continuation) {
        return ((SharedStorageImpl$setValues$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StorageDao storageDao;
        SharedStorageImpl sharedStorageImpl;
        List requestedEntry;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<Entry> list = this.$entries;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(EntryKt.toStorageEntry((Entry) it.next()));
            }
            ArrayList arrayList2 = arrayList;
            SharedStorageImpl sharedStorageImpl2 = this.this$0;
            storageDao = sharedStorageImpl2.storage;
            this.L$0 = SpillingKt.nullOutSpilledVariable(arrayList2);
            this.L$1 = sharedStorageImpl2;
            this.label = 1;
            Object valuesAndGet = storageDao.setValuesAndGet(arrayList2, this);
            if (valuesAndGet == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedStorageImpl = sharedStorageImpl2;
            obj = valuesAndGet;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedStorageImpl = (SharedStorageImpl) this.L$1;
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) obj;
        List<Entry> list3 = this.$entries;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Entry) it2.next()).getKey());
        }
        requestedEntry = sharedStorageImpl.toRequestedEntry(list2, arrayList3);
        return requestedEntry;
    }
}
