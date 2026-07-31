package com.yandex.div.evaluable;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface FunctionProvider {
    @NotNull
    Function get(@NotNull String str, @NotNull List<? extends EvaluableType> list);

    @NotNull
    Function getMethod(@NotNull String str, @NotNull List<? extends EvaluableType> list);
}
