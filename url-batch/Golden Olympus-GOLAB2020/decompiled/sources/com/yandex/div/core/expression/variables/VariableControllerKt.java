package com.yandex.div.core.expression.variables;

import O1.AbstractC1176zf;
import android.net.Uri;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class VariableControllerKt {
    public static final void declare(@NotNull VariableController variableController, @NotNull AbstractC1176zf divVariable, @NotNull ExpressionResolver resolver, @NotNull ErrorCollector errorCollector) {
        Intrinsics.checkNotNullParameter(variableController, "<this>");
        Intrinsics.checkNotNullParameter(divVariable, "divVariable");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(errorCollector, "errorCollector");
        try {
            variableController.declare(DivVariablesParserKt.toVariable(divVariable, resolver));
        } catch (VariableDeclarationException e4) {
            errorCollector.logError(e4);
        }
    }

    @Nullable
    public static final Object wrapVariableValue(@Nullable Object obj) {
        return obj instanceof Uri ? Url.m221boximpl(Url.m222constructorimpl(obj.toString())) : obj;
    }
}
