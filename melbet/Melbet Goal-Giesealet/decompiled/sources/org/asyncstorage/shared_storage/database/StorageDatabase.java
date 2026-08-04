package org.asyncstorage.shared_storage.database;

import androidx.room.RoomDatabase;
import kotlin.Metadata;

/* compiled from: StorageDatabase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H ¢\u0006\u0002\b\u0006¨\u0006\b"}, d2 = {"Lorg/asyncstorage/shared_storage/database/StorageDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "storageDao", "Lorg/asyncstorage/shared_storage/database/StorageDao;", "storageDao$shared_storage", "Companion", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StorageDatabase extends RoomDatabase {
    public abstract StorageDao storageDao$shared_storage();
}
