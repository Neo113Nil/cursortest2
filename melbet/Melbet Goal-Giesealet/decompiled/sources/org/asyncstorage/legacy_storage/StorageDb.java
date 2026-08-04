package org.asyncstorage.legacy_storage;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyStorageSupplier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lorg/asyncstorage/legacy_storage/StorageDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "storage", "Lorg/asyncstorage/legacy_storage/StorageDao;", "Companion", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StorageDb extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile StorageDb instance;

    public abstract StorageDao storage();

    /* compiled from: LegacyStorageSupplier.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/asyncstorage/legacy_storage/StorageDb$Companion;", "", "<init>", "()V", "instance", "Lorg/asyncstorage/legacy_storage/StorageDb;", "getDatabase", "context", "Landroid/content/Context;", "buildDatabase", "react-native-async-storage_async-storage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StorageDb getDatabase(Context context) {
            StorageDb storageDb;
            Intrinsics.checkNotNullParameter(context, "context");
            StorageDb storageDb2 = StorageDb.instance;
            if (storageDb2 != null) {
                return storageDb2;
            }
            synchronized (this) {
                storageDb = StorageDb.instance;
                if (storageDb == null) {
                    storageDb = StorageDb.INSTANCE.buildDatabase(context);
                    Companion companion = StorageDb.INSTANCE;
                    StorageDb.instance = storageDb;
                }
            }
            return storageDb;
        }

        private final StorageDb buildDatabase(Context context) {
            File databasePath = context.getDatabasePath("RKStorage");
            RoomDatabase.Builder databaseBuilder = Room.databaseBuilder(context, StorageDb.class, "AsyncStorage");
            if (databasePath.exists()) {
                Intrinsics.checkNotNull(databasePath);
                databaseBuilder.createFromFile(databasePath).addMigrations(MIGRATION_TO_NEXT.INSTANCE);
            }
            return (StorageDb) databaseBuilder.build();
        }
    }
}
