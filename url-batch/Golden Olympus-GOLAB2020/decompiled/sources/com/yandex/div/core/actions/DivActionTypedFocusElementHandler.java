package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.C0875j1;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedFocusElementHandler implements DivActionTypedHandler {
    private final void handleRequestFocus(C0875j1 c0875j1, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) c0875j1.f6545a.evaluate(expressionResolver);
        View findViewWithTag = div2View.findViewWithTag(str);
        if (findViewWithTag == null && (findViewWithTag = div2View.getViewComponent$div_release().getDivTooltipController().findViewWithTag(str)) == null) {
            return;
        }
        findViewWithTag.requestFocus();
        BaseDivViewExtensionsKt.gainAccessibilityFocus(findViewWithTag);
        if (findViewWithTag instanceof DivInputView) {
            DivActionTypedUtilsKt.openKeyboard((DivInputView) findViewWithTag);
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.l)) {
            return false;
        }
        handleRequestFocus(((AbstractC0948n2.l) action).c(), view, resolver);
        return true;
    }
}
