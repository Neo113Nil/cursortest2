package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.AbstractC1086uf;
import O1.Z0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedDictSetValueHandler implements DivActionTypedHandler {
    private final void handleSetValue(Z0 z02, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) z02.f5446c.evaluate(expressionResolver);
        String str2 = (String) z02.f5444a.evaluate(expressionResolver);
        AbstractC1086uf abstractC1086uf = z02.f5445b;
        VariableMutationHandler.Companion.setVariable(div2View, str, expressionResolver, new DivActionTypedDictSetValueHandler$handleSetValue$1(div2View, abstractC1086uf != null ? DivActionTypedUtilsKt.evaluate(abstractC1086uf, expressionResolver) : null, str2));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.j)) {
            return false;
        }
        handleSetValue(((AbstractC0948n2.j) action).c(), view, resolver);
        return true;
    }
}
