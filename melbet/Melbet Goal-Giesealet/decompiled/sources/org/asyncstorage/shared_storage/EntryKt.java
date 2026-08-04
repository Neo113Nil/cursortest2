package org.asyncstorage.shared_storage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.asyncstorage.shared_storage.database.StorageEntry;

/* compiled from: Entry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toStorageEntry", "Lorg/asyncstorage/shared_storage/database/StorageEntry;", "Lorg/asyncstorage/shared_storage/Entry;", "toEntry", "shared-storage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EntryKt {
    public static final StorageEntry toStorageEntry(Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return new StorageEntry(entry.getKey(), entry.getValue());
    }

    public static final Entry toEntry(StorageEntry storageEntry) {
        Intrinsics.checkNotNullParameter(storageEntry, "<this>");
        return new Entry(storageEntry.getKey(), storageEntry.getValue());
    }
}
