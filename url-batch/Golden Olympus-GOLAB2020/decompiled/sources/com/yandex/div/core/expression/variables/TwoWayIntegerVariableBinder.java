package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayIntegerVariableBinder(@NotNull ErrorCollectors errorCollectors) {
        super(errorCollectors);
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
    }

    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Long l4) {
        return toStringValue(l4.longValue());
    }

    @NotNull
    public String toStringValue(long j4) {
        return String.valueOf(j4);
    }
}
