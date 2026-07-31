package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class CompositeLogIdKt {
    @NotNull
    public static final CompositeLogId compositeLogIdOf(@NotNull Div2View scope, @NotNull String actionLogId) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(actionLogId, "actionLogId");
        String id = scope.getDataTag().getId();
        Intrinsics.checkNotNullExpressionValue(id, "scope.dataTag.id");
        return new CompositeLogId(id, scope.getLogId(), actionLogId);
    }
}
