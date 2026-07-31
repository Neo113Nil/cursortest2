package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.C1037s2;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedVideoHandler implements DivActionTypedHandler {
    private final void handleVideoAction(C1037s2 c1037s2, Div2View div2View, ExpressionResolver expressionResolver) {
        div2View.applyVideoCommand((String) c1037s2.f7796b.evaluate(expressionResolver), C1037s2.a.f7798c.b((C1037s2.a) c1037s2.f7795a.evaluate(expressionResolver)), expressionResolver);
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.v)) {
            return false;
        }
        handleVideoAction(((AbstractC0948n2.v) action).c(), view, resolver);
        return true;
    }
}
