package org.asyncstorage.shared_storage.database;

import androidx.room.RoomDatabaseConstructor;
import kotlin.Metadata;

/* compiled from: StorageDatabaseConstructor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lorg/asyncstorage/shared_storage/database/StorageDatabaseConstructor;", "Landroidx/room/RoomDatabaseConstructor;", "Lorg/asyncstorage/shared_storage/database/StorageDatabase;", "<init>", "()V", "initialize", "shared-storage"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageDatabaseConstructor implements RoomDatabaseConstructor<StorageDatabase> {
    public static final StorageDatabaseConstructor INSTANCE = new StorageDatabaseConstructor();

    private StorageDatabaseConstructor() {
    }

    @Override // androidx.room.RoomDatabaseConstructor
    public StorageDatabase initialize() {
        return new StorageDatabase_Impl();
    }
}
