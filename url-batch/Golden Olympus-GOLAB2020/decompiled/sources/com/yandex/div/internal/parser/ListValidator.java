package com.yandex.div.internal.parser;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ListValidator<T> {
    boolean isValid(@NotNull List<? extends T> list);
}
