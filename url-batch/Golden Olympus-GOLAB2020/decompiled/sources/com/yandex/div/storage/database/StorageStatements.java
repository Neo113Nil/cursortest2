package com.yandex.div.storage.database;

import W1.h;
import W1.i;
import W1.l;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.rawjson.RawJson;
import f2.AbstractC2420c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class StorageStatements {

    @NotNull
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String asSqlList(Collection<? extends T> collection) {
        return CollectionsKt.joinToString$default(collection, "', '", "('", "')", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorageStatement replaceRawJsons$default(StorageStatements storageStatements, List list, Function1 function1, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            function1 = StorageStatements$replaceRawJsons$1.INSTANCE;
        }
        return storageStatements.replaceRawJsons(list, function1);
    }

    @NotNull
    public final StorageStatement deleteRawJsons(@NotNull final Set<String> elementIds) {
        Intrinsics.checkNotNullParameter(elementIds, "elementIds");
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$deleteRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                String asSqlList;
                Intrinsics.checkNotNullParameter(compiler, "compiler");
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM raw_json WHERE raw_json_id IN ");
                asSqlList = StorageStatements.INSTANCE.asSqlList(elementIds);
                sb.append(asSqlList);
                compiler.compileStatement(sb.toString()).executeUpdateDelete();
            }

            @NotNull
            public String toString() {
                return "Deleting raw jsons with ids: " + elementIds;
            }
        };
    }

    @NotNull
    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$dropAllTables$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                Intrinsics.checkNotNullParameter(compiler, "compiler");
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                ReadState compileQuery = compiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = compileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        AbstractC2420c.a(compileQuery, null);
                        return;
                    }
                    do {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(cursor.…lumnIndexOrThrow(\"name\"))");
                        arrayList.add(string);
                    } while (cursor.moveToNext());
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(compileQuery, null);
                    int size = arrayList.size();
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        compiler.compileStatement("DROP TABLE IF EXISTS " + ((String) obj)).execute();
                    }
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Drop all database tables";
            }
        };
    }

    @NotNull
    public final StorageStatement readRawJsons(@NotNull final Function1<? super ReadState, Unit> reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements$readRawJsons$1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                Intrinsics.checkNotNullParameter(compiler, "compiler");
                ReadState compileQuery = compiler.compileQuery("SELECT * FROM raw_json", new String[0]);
                try {
                    reader.invoke(compileQuery);
                    AbstractC2420c.a(compileQuery, null);
                } finally {
                }
            }

            @NotNull
            public String toString() {
                return "Selecting all raw jsons";
            }
        };
    }

    @NotNull
    public final StorageStatement replaceRawJsons(@NotNull final List<? extends RawJson> rawJsons, @NotNull final Function1<? super List<String>, Unit> onFailedTransactions) {
        Intrinsics.checkNotNullParameter(rawJsons, "rawJsons");
        Intrinsics.checkNotNullParameter(onFailedTransactions, "onFailedTransactions");
        return new StorageStatement(rawJsons, onFailedTransactions) { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2
            final /* synthetic */ Function1<List<String>, Unit> $onFailedTransactions;
            final /* synthetic */ List<RawJson> $rawJsons;

            @NotNull
            private final h cardIdsString$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$rawJsons = rawJsons;
                this.$onFailedTransactions = onFailedTransactions;
                this.cardIdsString$delegate = i.a(l.f9608d, new StorageStatements$replaceRawJsons$2$cardIdsString$2(rawJsons));
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString$delegate.getValue();
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(@NotNull SqlCompiler compiler) {
                Intrinsics.checkNotNullParameter(compiler, "compiler");
                ArrayList arrayList = new ArrayList();
                SQLiteStatement compileStatement = compiler.compileStatement("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
                for (RawJson rawJson : this.$rawJsons) {
                    compileStatement.bindString(1, rawJson.getId());
                    String jSONObject = rawJson.getData().toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "json.data.toString()");
                    byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    compileStatement.bindBlob(2, bytes);
                    Long valueOf = Long.valueOf(compileStatement.executeInsert());
                    if (valueOf.longValue() >= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(rawJson.getId());
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.$onFailedTransactions.invoke(arrayList);
            }

            @NotNull
            public String toString() {
                return "Replace raw jsons (" + getCardIdsString() + ')';
            }
        };
    }
}
