package com.yandex.div.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface AssertionErrorHandler {
    void handleError(@NotNull AssertionError assertionError);
}
