package com.yandex.div.storage;

import android.database.Cursor;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$collectsRawJsons$1 extends s implements Function1<DatabaseOpenHelper.Database, Cursor> {
    final /* synthetic */ Set<String> $rawJsonIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageImpl$collectsRawJsons$1(Set<String> set) {
        super(1);
        this.$rawJsonIds = set;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Cursor invoke(@NotNull DatabaseOpenHelper.Database readStateFor) {
        String asSqlList;
        Intrinsics.checkNotNullParameter(readStateFor, "$this$readStateFor");
        StringBuilder sb = new StringBuilder();
        sb.append("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n ");
        asSqlList = DivStorageImpl.Companion.asSqlList(this.$rawJsonIds);
        sb.append(asSqlList);
        return readStateFor.rawQuery(sb.toString(), new String[0]);
    }
}
