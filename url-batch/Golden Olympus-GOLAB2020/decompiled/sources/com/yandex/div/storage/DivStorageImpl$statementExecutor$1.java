package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$statementExecutor$1 extends s implements Function0<DatabaseOpenHelper.Database> {
    final /* synthetic */ DivStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageImpl$statementExecutor$1(DivStorageImpl divStorageImpl) {
        super(0);
        this.this$0 = divStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DatabaseOpenHelper.Database invoke() {
        DatabaseOpenHelper databaseOpenHelper;
        databaseOpenHelper = this.this$0.openHelper;
        return databaseOpenHelper.getWritableDatabase();
    }
}
