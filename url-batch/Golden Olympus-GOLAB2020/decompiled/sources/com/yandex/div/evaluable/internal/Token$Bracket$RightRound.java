package com.yandex.div.evaluable.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Token$Bracket$RightRound implements Token {

    @NotNull
    public static final Token$Bracket$RightRound INSTANCE = new Token$Bracket$RightRound();

    private Token$Bracket$RightRound() {
    }

    @NotNull
    public String toString() {
        return ")";
    }
}
