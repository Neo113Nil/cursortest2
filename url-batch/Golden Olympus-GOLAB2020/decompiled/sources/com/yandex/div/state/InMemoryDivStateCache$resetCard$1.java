package com.yandex.div.state;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class InMemoryDivStateCache$resetCard$1 extends s implements Function1<Pair<? extends String, ? extends String>, Boolean> {
    final /* synthetic */ String $cardId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InMemoryDivStateCache$resetCard$1(String str) {
        super(1);
        this.$cardId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(Pair<String, String> pair) {
        return Boolean.valueOf(Intrinsics.areEqual(pair.getFirst(), this.$cardId));
    }
}
