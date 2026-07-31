package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayStringVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    @NotNull
    public String toStringValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str;
    }
}
