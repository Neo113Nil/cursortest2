package com.yandex.div.evaluable.function;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class EncodeRegex$evaluate$1 extends s implements Function1<MatchResult, CharSequence> {
    public static final EncodeRegex$evaluate$1 INSTANCE = new EncodeRegex$evaluate$1();

    EncodeRegex$evaluate$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return '\\' + it.getValue();
    }
}
