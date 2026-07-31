package com.yandex.div.evaluable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface VariableProvider {
    @Nullable
    Object get(@NotNull String str);
}
