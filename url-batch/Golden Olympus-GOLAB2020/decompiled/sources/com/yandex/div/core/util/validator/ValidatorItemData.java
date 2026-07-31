package com.yandex.div.core.util.validator;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ValidatorItemData {

    @NotNull
    private final String labelId;

    @NotNull
    private final BaseValidator validator;

    @NotNull
    private final String variableName;

    public ValidatorItemData(@NotNull BaseValidator validator, @NotNull String variableName, @NotNull String labelId) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        Intrinsics.checkNotNullParameter(labelId, "labelId");
        this.validator = validator;
        this.variableName = variableName;
        this.labelId = labelId;
    }

    @NotNull
    public final String getLabelId() {
        return this.labelId;
    }

    @NotNull
    public final BaseValidator getValidator() {
        return this.validator;
    }

    @NotNull
    public final String getVariableName() {
        return this.variableName;
    }
}
