package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface TemplateResolver<D, T extends EntityTemplate<V>, V> {
    V resolve(@NotNull ParsingContext parsingContext, @NotNull T t4, D d4);
}
