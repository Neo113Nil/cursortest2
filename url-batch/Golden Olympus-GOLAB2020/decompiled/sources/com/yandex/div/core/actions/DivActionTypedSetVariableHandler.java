package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedSetVariableHandler implements DivActionTypedHandler {
    private final void handleSetVariable(AbstractC0948n2.r rVar, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) rVar.c().f4368b.evaluate(expressionResolver);
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new DivActionTypedSetVariableHandler$handleSetVariable$1(this, DivActionTypedUtilsKt.evaluate(rVar.c().f4367a, expressionResolver), div2View, str));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.r)) {
            return false;
        }
        handleSetVariable((AbstractC0948n2.r) action, view, resolver);
        return true;
    }
}
