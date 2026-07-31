package com.yandex.div.storage.database;

import com.yandex.div.storage.rawjson.RawJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class StorageStatements$replaceRawJsons$2$cardIdsString$2 extends s implements Function0<String> {
    final /* synthetic */ List<RawJson> $rawJsons;

    @Metadata
    /* renamed from: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements Function1<RawJson, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final CharSequence invoke(@NotNull RawJson it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    StorageStatements$replaceRawJsons$2$cardIdsString$2(List<? extends RawJson> list) {
        super(0);
        this.$rawJsons = list;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final String invoke() {
        return CollectionsKt.joinToString$default(this.$rawJsons, null, null, null, 0, null, AnonymousClass1.INSTANCE, 31, null);
    }
}
