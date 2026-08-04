package org.asyncstorage.shared_storage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SharedStorage.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\tH&J\u000e\u0010\u0011\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lorg/asyncstorage/shared_storage/SharedStorage;", "", "getValues", "", "Lorg/asyncstorage/shared_storage/Entry;", "keys", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValuesFlow", "Lkotlinx/coroutines/flow/Flow;", "setValues", "entries", "removeValues", "", "getKeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getKeysFlow", "clear", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SharedStorage {
    Object clear(Continuation<? super Unit> continuation) throws StorageException, CancellationException;

    Object getKeys(Continuation<? super List<String>> continuation) throws StorageException, CancellationException;

    Flow<List<String>> getKeysFlow() throws StorageException;

    Object getValues(List<String> list, Continuation<? super List<Entry>> continuation) throws StorageException, CancellationException;

    Flow<List<Entry>> getValuesFlow(List<String> keys) throws StorageException;

    Object removeValues(List<String> list, Continuation<? super Unit> continuation) throws StorageException, CancellationException;

    Object setValues(List<Entry> list, Continuation<? super List<Entry>> continuation) throws StorageException, CancellationException;
}
