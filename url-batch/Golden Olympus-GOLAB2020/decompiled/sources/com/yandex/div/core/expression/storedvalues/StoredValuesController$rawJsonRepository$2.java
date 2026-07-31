package com.yandex.div.core.expression.storedvalues;

import Q1.a;
import com.yandex.div.storage.DivStorageComponent;
import com.yandex.div.storage.RawJsonRepository;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class StoredValuesController$rawJsonRepository$2 extends s implements Function0<RawJsonRepository> {
    final /* synthetic */ a $divStorageComponentLazy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoredValuesController$rawJsonRepository$2(a aVar) {
        super(0);
        this.$divStorageComponentLazy = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final RawJsonRepository invoke() {
        return ((DivStorageComponent) this.$divStorageComponentLazy.get()).getRawJsonRepository();
    }
}
