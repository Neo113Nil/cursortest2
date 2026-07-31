package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.C0894k2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedTimerHandler implements DivActionTypedHandler {
    private final void handleTimerAction(C0894k2 c0894k2, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.applyTimerCommand((String) c0894k2.f6785b.evaluate(expressionResolver), C0894k2.a.f6787c.b((C0894k2.a) c0894k2.f6784a.evaluate(expressionResolver)));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.u)) {
            return false;
        }
        handleTimerAction(((AbstractC0948n2.u) action).c(), view, resolver);
        return true;
    }
}
