package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class BaseValidator {
    private final boolean allowEmpty;

    public BaseValidator(boolean z4) {
        this.allowEmpty = z4;
    }

    public final boolean getAllowEmpty() {
        return this.allowEmpty;
    }

    public abstract boolean validate(@NotNull String str);
}
