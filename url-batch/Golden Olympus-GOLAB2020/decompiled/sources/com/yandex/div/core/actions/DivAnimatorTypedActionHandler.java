package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivAnimatorTypedActionHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (!(action instanceof AbstractC0948n2.a)) {
            if (!(action instanceof AbstractC0948n2.b)) {
                return false;
            }
            if (str == null) {
                return true;
            }
            view.getViewComponent$div_release().getAnimatorController().stopAnimator(str, ((AbstractC0948n2.b) action).c().f7553a);
            return true;
        }
        if (str == null) {
            return true;
        }
        List<View> findViewsWithTag = ViewLocator.findViewsWithTag(view, str);
        if (findViewsWithTag.size() != 1) {
            return true;
        }
        view.getViewComponent$div_release().getAnimatorController().startAnimator(str, (View) CollectionsKt.first((List) findViewsWithTag), ((AbstractC0948n2.a) action).c(), resolver);
        return true;
    }
}
