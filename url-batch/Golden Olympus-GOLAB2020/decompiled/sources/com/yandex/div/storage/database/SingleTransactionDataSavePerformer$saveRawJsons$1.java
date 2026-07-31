package com.yandex.div.storage.database;

import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class SingleTransactionDataSavePerformer$saveRawJsons$1 extends s implements Function1<List<StorageStatement>, Unit> {
    final /* synthetic */ List<RawJson> $rawJsons;
    final /* synthetic */ SingleTransactionDataSavePerformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SingleTransactionDataSavePerformer$saveRawJsons$1(SingleTransactionDataSavePerformer singleTransactionDataSavePerformer, List<? extends RawJson> list) {
        super(1);
        this.this$0 = singleTransactionDataSavePerformer;
        this.$rawJsons = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<StorageStatement>) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull List<StorageStatement> executeStatements) {
        StorageStatement createRawJsonsSaveStatement;
        Intrinsics.checkNotNullParameter(executeStatements, "$this$executeStatements");
        createRawJsonsSaveStatement = this.this$0.createRawJsonsSaveStatement(this.$rawJsons);
        executeStatements.add(createRawJsonsSaveStatement);
    }
}
