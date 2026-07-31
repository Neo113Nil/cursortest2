package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class TwoWayBooleanVariableBinder extends TwoWayVariableBinder<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayBooleanVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Boolean bool) {
        return toStringValue(bool.booleanValue());
    }

    @NotNull
    public String toStringValue(boolean z4) {
        return String.valueOf(z4);
    }
}
