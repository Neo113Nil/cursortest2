package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.V1;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedShowTooltipHandler implements DivActionTypedHandler {
    private final void handleShowTooltip(V1 v12, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) v12.f5010a.evaluate(expressionResolver);
        Expression expression = v12.f5011b;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
        if (bool != null) {
            div2View.showTooltip(str, bool.booleanValue());
        } else {
            div2View.showTooltip(str);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.s)) {
            return false;
        }
        handleShowTooltip(((AbstractC0948n2.s) action).c(), view, resolver);
        return true;
    }
}
