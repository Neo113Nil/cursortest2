package com.yandex.div.serialization;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ParsingContextWrapper extends ParsingContext {
    @NotNull
    ParsingContext getBaseContext();
}
