package com.yandex.div.serialization;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface Serializer<D, V> {
    D serialize(@NotNull ParsingContext parsingContext, V v4);
}
