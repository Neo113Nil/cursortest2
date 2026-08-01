package expo.modules.updates.db;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdatesDatabase.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"expo/modules/updates/db/UpdatesDatabase$Companion$MIGRATION_9_10$1", "Landroidx/room/migration/Migration;", "migrate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesDatabase$Companion$MIGRATION_9_10$1 extends Migration {
    UpdatesDatabase$Companion$MIGRATION_9_10$1() {
        super(9, 10);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        UpdatesDatabase.INSTANCE.runInTransactionWithForeignKeysOff(db, new Function1() { // from class: expo.modules.updates.db.UpdatesDatabase$Companion$MIGRATION_9_10$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit migrate$lambda$0;
                migrate$lambda$0 = UpdatesDatabase$Companion$MIGRATION_9_10$1.migrate$lambda$0((SupportSQLiteDatabase) obj);
                return migrate$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit migrate$lambda$0(SupportSQLiteDatabase runInTransactionWithForeignKeysOff) {
        Intrinsics.checkNotNullParameter(runInTransactionWithForeignKeysOff, "$this$runInTransactionWithForeignKeysOff");
        runInTransactionWithForeignKeysOff.execSQL("ALTER TABLE `assets` ADD COLUMN `expected_hash` TEXT");
        return Unit.INSTANCE;
    }
}
