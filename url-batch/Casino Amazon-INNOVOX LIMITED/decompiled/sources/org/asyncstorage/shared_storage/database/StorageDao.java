package org.asyncstorage.shared_storage.database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: StorageDatabase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H'J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0007J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0097@¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H§@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\tH'J\u000e\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0010¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lorg/asyncstorage/shared_storage/database/StorageDao;", "", "getValues", "", "Lorg/asyncstorage/shared_storage/database/StorageEntry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValuesFlow", "Lkotlinx/coroutines/flow/Flow;", "setValues", "", "entries", "setValuesAndGet", "removeValues", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeysFlow", "clear", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StorageDao {
    Object clear(Continuation<? super Unit> continuation);

    Object getKeys(Continuation<? super List<String>> continuation);

    Flow<List<String>> getKeysFlow();

    Object getValues(List<String> list, Continuation<? super List<StorageEntry>> continuation);

    Flow<List<StorageEntry>> getValuesFlow(List<String> keys);

    Object removeValues(List<String> list, Continuation<? super Unit> continuation);

    Object setValues(List<StorageEntry> list, Continuation<? super Unit> continuation);

    default Object setValuesAndGet(List<StorageEntry> list, Continuation<? super List<StorageEntry>> continuation) {
        return setValuesAndGet$suspendImpl(this, list, continuation);
    }

    /* compiled from: StorageDatabase.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object setValuesAndGet(StorageDao storageDao, List<StorageEntry> list, Continuation<? super List<StorageEntry>> continuation) {
            return StorageDao.super.setValuesAndGet(list, continuation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r5.setValues(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[LOOP:0: B:17:0x006e->B:19:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object setValuesAndGet$suspendImpl(StorageDao storageDao, List<StorageEntry> list, Continuation<? super List<StorageEntry>> continuation) {
        StorageDao$setValuesAndGet$1 storageDao$setValuesAndGet$1;
        int i;
        Iterator<T> it;
        if (continuation instanceof StorageDao$setValuesAndGet$1) {
            storageDao$setValuesAndGet$1 = (StorageDao$setValuesAndGet$1) continuation;
            if ((storageDao$setValuesAndGet$1.label & Integer.MIN_VALUE) != 0) {
                storageDao$setValuesAndGet$1.label -= Integer.MIN_VALUE;
                Object obj = storageDao$setValuesAndGet$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = storageDao$setValuesAndGet$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    storageDao$setValuesAndGet$1.L$0 = storageDao;
                    storageDao$setValuesAndGet$1.L$1 = list;
                    storageDao$setValuesAndGet$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    list = (List) storageDao$setValuesAndGet$1.L$1;
                    storageDao = (StorageDao) storageDao$setValuesAndGet$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                List<StorageEntry> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StorageEntry) it.next()).getKey());
                }
                storageDao$setValuesAndGet$1.L$0 = SpillingKt.nullOutSpilledVariable(storageDao);
                storageDao$setValuesAndGet$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                storageDao$setValuesAndGet$1.label = 2;
                Object values = storageDao.getValues(arrayList, storageDao$setValuesAndGet$1);
                return values != coroutine_suspended ? coroutine_suspended : values;
            }
        }
        storageDao$setValuesAndGet$1 = new StorageDao$setValuesAndGet$1(storageDao, continuation);
        Object obj2 = storageDao$setValuesAndGet$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = storageDao$setValuesAndGet$1.label;
        if (i != 0) {
        }
        List<StorageEntry> list22 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        storageDao$setValuesAndGet$1.L$0 = SpillingKt.nullOutSpilledVariable(storageDao);
        storageDao$setValuesAndGet$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
        storageDao$setValuesAndGet$1.label = 2;
        Object values2 = storageDao.getValues(arrayList2, storageDao$setValuesAndGet$1);
        if (values2 != coroutine_suspended2) {
        }
    }
}
