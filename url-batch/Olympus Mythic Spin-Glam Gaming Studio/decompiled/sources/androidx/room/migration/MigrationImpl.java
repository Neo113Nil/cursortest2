package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Migration.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/migration/MigrationImpl;", "Landroidx/room/migration/Migration;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Lkotlin/Function1;", "migrateCallback", "Lkotlin/jvm/functions/Function1;", "getMigrateCallback", "()Lkotlin/jvm/functions/Function1;", "room-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
final class MigrationImpl extends Migration {
    private final Function1 migrateCallback;

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.migrateCallback.invoke(database);
    }
}
