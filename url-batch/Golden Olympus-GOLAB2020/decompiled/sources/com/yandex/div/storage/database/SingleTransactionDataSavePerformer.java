package com.yandex.div.storage.database;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class SingleTransactionDataSavePerformer {

    @NotNull
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(@NotNull StorageStatementExecutor storageStatementsExecutor) {
        Intrinsics.checkNotNullParameter(storageStatementsExecutor, "storageStatementsExecutor");
        this.storageStatementsExecutor = storageStatementsExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createRawJsonsSaveStatement(List<? extends RawJson> list) {
        return StorageStatements.replaceRawJsons$default(StorageStatements.INSTANCE, list, null, 2, null);
    }

    private final ExecutionResult executeStatements(DivDataRepository.ActionOnError actionOnError, Function1<? super List<StorageStatement>, Unit> function1) {
        ArrayList arrayList = new ArrayList();
        function1.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        StorageStatement[] storageStatementArr = (StorageStatement[]) arrayList.toArray(new StorageStatement[0]);
        return storageStatementExecutor.execute(actionOnError, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }

    @NotNull
    public final ExecutionResult saveRawJsons(@NotNull List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) {
        Intrinsics.checkNotNullParameter(rawJsons, "rawJsons");
        Intrinsics.checkNotNullParameter(actionOnError, "actionOnError");
        return executeStatements(actionOnError, new SingleTransactionDataSavePerformer$saveRawJsons$1(this, rawJsons));
    }
}
