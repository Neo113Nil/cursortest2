package org.asyncstorage.shared_storage;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.KClassUtil;
import androidx.sqlite.driver.AndroidSQLiteDriver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import org.asyncstorage.shared_storage.database.DatabaseFiles;
import org.asyncstorage.shared_storage.database.DatabaseFiles_androidKt;
import org.asyncstorage.shared_storage.database.StorageDatabase;

/* compiled from: SharedStorage.android.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0000\u001a\b\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"SharedStorage", "Lorg/asyncstorage/shared_storage/SharedStorage;", "context", "Landroid/content/Context;", "Lorg/asyncstorage/shared_storage/PlatformContext;", "databaseName", "", "sharedStorageInMemory", "getWALConnectionPoolSize", "", "shared-storage"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedStorage_androidKt {
    public static final SharedStorage SharedStorage(Context context, String databaseName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        DatabaseFiles of = DatabaseFiles_androidKt.of(DatabaseFiles.INSTANCE, context, databaseName);
        CoroutineDispatcher limitedParallelism = Dispatchers.getIO().limitedParallelism(1, databaseName + "-writer");
        CoroutineDispatcher limitedParallelism2 = Dispatchers.getIO().limitedParallelism(getWALConnectionPoolSize(), databaseName + "-reader");
        Room room = Room.INSTANCE;
        String fileAbsolutePath = of.getFileAbsolutePath();
        SharedStorage_androidKt$SharedStorage$$inlined$databaseBuilder$default$1 sharedStorage_androidKt$SharedStorage$$inlined$databaseBuilder$default$1 = new Function0<StorageDatabase>() { // from class: org.asyncstorage.shared_storage.SharedStorage_androidKt$SharedStorage$$inlined$databaseBuilder$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.room.RoomDatabase, org.asyncstorage.shared_storage.database.StorageDatabase] */
            @Override // kotlin.jvm.functions.Function0
            public final StorageDatabase invoke() {
                return (RoomDatabase) KClassUtil.findAndInstantiateDatabaseImpl$default(StorageDatabase.class, null, 2, null);
            }
        };
        if (StringsKt.isBlank(fileAbsolutePath)) {
            throw new IllegalArgumentException("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
        }
        if (!Intrinsics.areEqual(fileAbsolutePath, ":memory:")) {
            return new SharedStorageImpl((StorageDatabase) new RoomDatabase.Builder(Reflection.getOrCreateKotlinClass(StorageDatabase.class), fileAbsolutePath, sharedStorage_androidKt$SharedStorage$$inlined$databaseBuilder$default$1, context).setDriver(new AndroidSQLiteDriver()).setQueryExecutor(ExecutorsKt.asExecutor(limitedParallelism2)).setTransactionExecutor(ExecutorsKt.asExecutor(limitedParallelism)).setJournalMode(RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING).build(), of);
        }
        throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().".toString());
    }

    public static final SharedStorage sharedStorageInMemory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Room room = Room.INSTANCE;
        return new SharedStorageImpl((StorageDatabase) new RoomDatabase.Builder(Reflection.getOrCreateKotlinClass(StorageDatabase.class), null, new Function0<StorageDatabase>() { // from class: org.asyncstorage.shared_storage.SharedStorage_androidKt$sharedStorageInMemory$$inlined$inMemoryDatabaseBuilder$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.room.RoomDatabase, org.asyncstorage.shared_storage.database.StorageDatabase] */
            @Override // kotlin.jvm.functions.Function0
            public final StorageDatabase invoke() {
                return (RoomDatabase) KClassUtil.findAndInstantiateDatabaseImpl$default(StorageDatabase.class, null, 2, null);
            }
        }, context).setJournalMode(RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING).build(), DatabaseFiles_androidKt.ofInMemory(DatabaseFiles.INSTANCE));
    }

    private static final int getWALConnectionPoolSize() {
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("db_connection_pool_size", TypedValues.Custom.S_INT, "android");
            if (identifier != 0) {
                return Math.max(2, system.getInteger(identifier));
            }
            return 2;
        } catch (Exception unused) {
            return 2;
        }
    }
}
