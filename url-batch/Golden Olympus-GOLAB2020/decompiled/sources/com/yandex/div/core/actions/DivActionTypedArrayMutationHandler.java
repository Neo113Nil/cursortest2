package com.yandex.div.core.actions;

import O1.A0;
import O1.AbstractC0948n2;
import O1.C1089v0;
import O1.F0;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedArrayMutationHandler implements DivActionTypedHandler {
    private final void handle(C1089v0 c1089v0, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) c1089v0.f8189c.evaluate(expressionResolver);
        Expression expression = c1089v0.f8187a;
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, str, expressionResolver, new DivActionTypedArrayMutationHandler$handle$1(expression != null ? Integer.valueOf((int) ((Number) expression.evaluate(expressionResolver)).longValue()) : null, div2View, str, DivActionTypedUtilsKt.evaluate(c1089v0.f8188b, expressionResolver)));
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (action instanceof AbstractC0948n2.c) {
            handle(((AbstractC0948n2.c) action).c(), view, resolver);
            return true;
        }
        if (action instanceof AbstractC0948n2.d) {
            handle(((AbstractC0948n2.d) action).c(), view, resolver);
            return true;
        }
        if (!(action instanceof AbstractC0948n2.e)) {
            return false;
        }
        handle(((AbstractC0948n2.e) action).c(), view, resolver);
        return true;
    }

    private final void handle(A0 a02, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) a02.f1288b.evaluate(expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, str, expressionResolver, new DivActionTypedArrayMutationHandler$handle$2((int) ((Number) a02.f1287a.evaluate(expressionResolver)).longValue(), div2View, str));
    }

    private final void handle(F0 f02, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) f02.f2705c.evaluate(expressionResolver);
        DivActionTypedArrayMutationHandlerKt.updateVariable(div2View, str, expressionResolver, new DivActionTypedArrayMutationHandler$handle$3((int) ((Number) f02.f2703a.evaluate(expressionResolver)).longValue(), div2View, str, DivActionTypedUtilsKt.evaluate(f02.f2704b, expressionResolver)));
    }
}
