package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.I1;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedSetStateHandler implements DivActionTypedHandler {
    private final void handleSetState(I1 i12, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) i12.f3129a.evaluate(expressionResolver);
        try {
            div2View.switchToState(DivStatePath.Companion.parse(str), ((Boolean) i12.f3130b.evaluate(expressionResolver)).booleanValue());
        } catch (PathFormatException e4) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Invalid format of " + str, e4));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.p)) {
            return false;
        }
        handleSetState(((AbstractC0948n2.p) action).c(), view, resolver);
        return true;
    }
}
