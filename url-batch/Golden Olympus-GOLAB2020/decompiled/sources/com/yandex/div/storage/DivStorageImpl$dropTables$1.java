package com.yandex.div.storage;

import com.yandex.div.storage.database.DatabaseOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivStorageImpl$dropTables$1 extends s implements Function0<DatabaseOpenHelper.Database> {
    final /* synthetic */ DatabaseOpenHelper.Database $db;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivStorageImpl$dropTables$1(DatabaseOpenHelper.Database database) {
        super(0);
        this.$db = database;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final DatabaseOpenHelper.Database invoke() {
        return this.$db;
    }
}
