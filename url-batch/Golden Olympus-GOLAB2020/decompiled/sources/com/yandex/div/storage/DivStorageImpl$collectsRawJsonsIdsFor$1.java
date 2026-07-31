package com.yandex.div.storage;

import android.database.Cursor;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$collectsRawJsonsIdsFor$1 extends s implements Function1<ReadState, Unit> {
    final /* synthetic */ Function1<RawJson, Boolean> $predicate;
    final /* synthetic */ Set<String> $results;
    final /* synthetic */ DivStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivStorageImpl$collectsRawJsonsIdsFor$1(DivStorageImpl divStorageImpl, Function1<? super RawJson, Boolean> function1, Set<String> set) {
        super(1);
        this.this$0 = divStorageImpl;
        this.$predicate = function1;
        this.$results = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReadState) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull ReadState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Cursor cursor = it.getCursor();
        if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
            return;
        }
        do {
            DivStorageImpl.CursorDrivenRawJson cursorDrivenRawJson = new DivStorageImpl.CursorDrivenRawJson(this.this$0, cursor);
            if (((Boolean) this.$predicate.invoke(cursorDrivenRawJson)).booleanValue()) {
                this.$results.add(cursorDrivenRawJson.getId());
            }
            cursorDrivenRawJson.close();
        } while (cursor.moveToNext());
    }
}
