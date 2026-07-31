package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.C0965o1;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedHideTooltipHandler implements DivActionTypedHandler {
    private final void handleHideTooltip(C0965o1 c0965o1, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.hideTooltip((String) c0965o1.f7253a.evaluate(expressionResolver));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.m)) {
            return false;
        }
        handleHideTooltip(((AbstractC0948n2.m) action).c(), view, resolver);
        return true;
    }
}
