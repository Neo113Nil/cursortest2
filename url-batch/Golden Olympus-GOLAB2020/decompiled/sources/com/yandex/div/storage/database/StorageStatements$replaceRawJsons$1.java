package com.yandex.div.storage.database;

import android.database.SQLException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class StorageStatements$replaceRawJsons$1 extends s implements Function1<List<? extends String>, Unit> {
    public static final StorageStatements$replaceRawJsons$1 INSTANCE = new StorageStatements$replaceRawJsons$1();

    StorageStatements$replaceRawJsons$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<String>) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull List<String> failedTransactions) {
        Intrinsics.checkNotNullParameter(failedTransactions, "failedTransactions");
        throw new SQLException("Insertion failed for raw jsons with ids: " + CollectionsKt.joinToString$default(failedTransactions, null, null, null, 0, null, null, 63, null));
    }
}
