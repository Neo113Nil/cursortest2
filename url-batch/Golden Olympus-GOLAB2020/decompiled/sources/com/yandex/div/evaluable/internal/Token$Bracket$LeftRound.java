package com.yandex.div.evaluable.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class Token$Bracket$LeftRound implements Token {

    @NotNull
    public static final Token$Bracket$LeftRound INSTANCE = new Token$Bracket$LeftRound();

    private Token$Bracket$LeftRound() {
    }

    @NotNull
    public String toString() {
        return "(";
    }
}
