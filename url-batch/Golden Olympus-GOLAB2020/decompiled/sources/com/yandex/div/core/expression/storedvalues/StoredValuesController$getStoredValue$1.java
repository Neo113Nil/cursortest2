package com.yandex.div.core.expression.storedvalues;

import com.yandex.div.storage.rawjson.RawJson;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class StoredValuesController$getStoredValue$1 extends s implements Function1<RawJson, Boolean> {
    final /* synthetic */ String $storedValueId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoredValuesController$getStoredValue$1(String str) {
        super(1);
        this.$storedValueId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull RawJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(Intrinsics.areEqual(it.getId(), this.$storedValueId));
    }
}
