package com.yandex.div.storage;

import V1.a;
import W1.h;
import W1.i;
import W1.l;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.rawjson.RawJson;
import f2.AbstractC2420c;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public class DivStorageImpl implements DivStorage {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleTransactionDataSavePerformer dataSaveUseCase;

    @NotNull
    private final String dbName;

    @NotNull
    private final Migration defaultDropAllMigration;

    @NotNull
    private final Map<Pair<Integer, Integer>, Migration> migrations;

    @NotNull
    private final DatabaseOpenHelper openHelper;

    @NotNull
    private final StorageStatementExecutor statementExecutor;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String asSqlList(Collection<? extends T> collection) {
            return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class CursorDrivenRawJson implements RawJson, Closeable, AutoCloseable {

        @NotNull
        private final Cursor cursor;
        private boolean cursorInvalid;

        @NotNull
        private final h data$delegate;

        @NotNull
        private final String id;
        final /* synthetic */ DivStorageImpl this$0;

        public CursorDrivenRawJson(@NotNull DivStorageImpl divStorageImpl, Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            this.this$0 = divStorageImpl;
            this.cursor = cursor;
            String string = cursor.getString(divStorageImpl.indexOf(cursor, "raw_json_id"));
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…exOf(COLUMN_RAW_JSON_ID))");
            this.id = string;
            this.data$delegate = i.a(l.f9608d, new DivStorageImpl$CursorDrivenRawJson$data$2(this, divStorageImpl));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }

        @NotNull
        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public JSONObject getData() {
            return (JSONObject) this.data$delegate.getValue();
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        @NotNull
        public String getId() {
            return this.id;
        }
    }

    public DivStorageImpl(@NotNull Context context, @NotNull DatabaseOpenHelperProvider openHelperProvider, @NotNull String databaseNamePrefix) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(openHelperProvider, "openHelperProvider");
        Intrinsics.checkNotNullParameter(databaseNamePrefix, "databaseNamePrefix");
        if (databaseNamePrefix.length() == 0) {
            str = "div-storage.db";
        } else {
            str = databaseNamePrefix + "-div-storage.db";
        }
        String str2 = str;
        this.dbName = str2;
        this.openHelper = openHelperProvider.provide(context, str2, 3, new DivStorageImpl$openHelper$1(this), new DivStorageImpl$openHelper$2(this));
        this.statementExecutor = new StorageStatementExecutor(new DivStorageImpl$statementExecutor$1(this));
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = MapsKt.mapOf(TuplesKt.to(TuplesKt.to(2, 3), new Migration() { // from class: M1.c
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.migrations$lambda$0(database);
            }
        }));
        this.defaultDropAllMigration = new Migration() { // from class: M1.d
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(DivStorageImpl.this, database);
            }
        };
    }

    private List<RawJson> collectsRawJsons(Set<String> set) {
        ArrayList arrayList = new ArrayList(set.size());
        ReadState readStateFor = readStateFor(new DivStorageImpl$collectsRawJsons$1(set));
        try {
            Cursor cursor = readStateFor.getCursor();
            if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(this, cursor);
                    arrayList.add(new RawJson.Ready(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(readStateFor, null);
            return arrayList;
        } finally {
        }
    }

    private Set<String> collectsRawJsonsIdsFor(Function1<? super RawJson, Boolean> function1) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readRawJsons(new DivStorageImpl$collectsRawJsonsIdsFor$1(this, function1, linkedHashSet)));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl this$0, DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(db, "db");
        this$0.dropTables(db);
        this$0.createTables(db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException("Column '" + str + "' not found in cursor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e4) {
            throw new SQLException("Create \"raw_json\" table", e4);
        }
    }

    private ReadState readStateFor(final Function1<? super DatabaseOpenHelper.Database, ? extends Cursor> function1) {
        final DatabaseOpenHelper.Database readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new DivStorageImpl$readStateFor$1(readableDatabase), new a() { // from class: M1.b
            @Override // V1.a
            public final Object get() {
                Cursor readStateFor$lambda$12;
                readStateFor$lambda$12 = DivStorageImpl.readStateFor$lambda$12(DatabaseOpenHelper.Database.this, function1);
                return readStateFor$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor readStateFor$lambda$12(DatabaseOpenHelper.Database db, Function1 func) {
        Intrinsics.checkNotNullParameter(db, "$db");
        Intrinsics.checkNotNullParameter(func, "$func");
        return (Cursor) func.invoke(db);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJSONObject(byte[] bArr) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new JSONObject(new String(bArr, UTF_8));
    }

    private DivStorageErrorException toStorageException(Exception exc, String str, String str2) {
        return new DivStorageErrorException("Unexpected exception on database access: " + str, exc, str2);
    }

    static /* synthetic */ DivStorageErrorException toStorageException$default(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toStorageException");
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.toStorageException(exc, str, str2);
    }

    public void createTables(@NotNull DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(db, "db");
        try {
            db.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            db.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            db.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            db.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e4) {
            throw new SQLException("Create tables", e4);
        }
    }

    public void dropTables(@NotNull DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(db, "db");
        new StorageStatementExecutor(new DivStorageImpl$dropTables$1(db)).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    @NotNull
    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    @NotNull
    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    public void onCreate(@NotNull DatabaseOpenHelper.Database db) {
        Intrinsics.checkNotNullParameter(db, "db");
        createTables(db);
    }

    public void onUpgrade(@NotNull DatabaseOpenHelper.Database db, int i4, int i5) {
        Intrinsics.checkNotNullParameter(db, "db");
        KAssert kAssert = KAssert.INSTANCE;
        Integer valueOf = Integer.valueOf(i5);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", valueOf, 3);
        }
        if (i4 == 3) {
            return;
        }
        Migration migration = getMigrations().get(TuplesKt.to(Integer.valueOf(i4), Integer.valueOf(i5)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(db);
        } catch (SQLException e4) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Migration from " + i4 + " to " + i5 + " throws exception", e4);
            }
            this.defaultDropAllMigration.migrate(db);
        }
    }

    @Override // com.yandex.div.storage.DivStorage
    @NotNull
    public DivStorage.LoadDataResult<RawJson> readRawJsons(@NotNull Set<String> rawJsonIds) {
        Intrinsics.checkNotNullParameter(rawJsonIds, "rawJsonIds");
        String str = "Read raw jsons with ids: " + rawJsonIds;
        ArrayList arrayList = new ArrayList();
        List<RawJson> emptyList = CollectionsKt.emptyList();
        try {
            emptyList = collectsRawJsons(rawJsonIds);
        } catch (SQLException e4) {
            arrayList.add(toStorageException$default(this, e4, str, null, 2, null));
        } catch (IllegalStateException e5) {
            arrayList.add(toStorageException$default(this, e5, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(emptyList, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    @NotNull
    public DivStorage.RemoveResult removeRawJsons(@NotNull Function1<? super RawJson, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Set<String> collectsRawJsonsIdsFor = collectsRawJsonsIdsFor(predicate);
        return new DivStorage.RemoveResult(collectsRawJsonsIdsFor, getStatementExecutor().execute(DivDataRepository.ActionOnError.SKIP_ELEMENT, StorageStatements.INSTANCE.deleteRawJsons(collectsRawJsonsIdsFor)).getErrors());
    }

    @Override // com.yandex.div.storage.DivStorage
    @NotNull
    public ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
        Intrinsics.checkNotNullParameter(rawJsons, "rawJsons");
        Intrinsics.checkNotNullParameter(actionOnError, "actionOnError");
        return this.dataSaveUseCase.saveRawJsons(rawJsons, actionOnError);
    }
}
