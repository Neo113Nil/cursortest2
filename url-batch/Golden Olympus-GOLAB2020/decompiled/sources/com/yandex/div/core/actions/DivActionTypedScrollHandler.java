package com.yandex.div.core.actions;

import O1.A1;
import O1.AbstractC0948n2;
import O1.C1126x1;
import O1.F1;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedScrollHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(@Nullable String str, @NotNull AbstractC0948n2 action, @NotNull Div2View view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (action instanceof AbstractC0948n2.n) {
            handleAction(((AbstractC0948n2.n) action).c(), view, resolver);
            return true;
        }
        if (!(action instanceof AbstractC0948n2.o)) {
            return false;
        }
        handleAction(((AbstractC0948n2.o) action).c(), view, resolver);
        return true;
    }

    private final void handleAction(C1126x1 c1126x1, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) c1126x1.f8381b.evaluate(expressionResolver);
        int longValue = (int) ((Number) c1126x1.f8383d.evaluate(expressionResolver)).longValue();
        int longValue2 = (int) ((Number) c1126x1.f8382c.evaluate(expressionResolver)).longValue();
        String b4 = C1126x1.c.f8387c.b((C1126x1.c) c1126x1.f8384e.evaluate(expressionResolver));
        boolean booleanValue = ((Boolean) c1126x1.f8380a.evaluate(expressionResolver)).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, str, div2View, expressionResolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        create$default.changeCurrentItemByStep(b4, longValue2, booleanValue);
        create$default.scrollByOffset(b4, longValue, booleanValue);
    }

    private final void handleAction(F1 f12, Div2View div2View, ExpressionResolver expressionResolver) {
        String str = (String) f12.f2713c.evaluate(expressionResolver);
        boolean booleanValue = ((Boolean) f12.f2711a.evaluate(expressionResolver)).booleanValue();
        DivViewWithItemsController create$default = DivViewWithItemsController.Companion.create$default(DivViewWithItemsController.Companion, str, div2View, expressionResolver, null, 8, null);
        if (create$default == null) {
            return;
        }
        A1 a12 = f12.f2712b;
        if (a12 instanceof A1.e) {
            create$default.scrollTo((int) ((Number) ((A1.e) a12).c().f4176a.evaluate(expressionResolver)).longValue(), booleanValue);
            return;
        }
        if (a12 instanceof A1.d) {
            create$default.setCurrentItem((int) ((Number) ((A1.d) a12).c().f7428a.evaluate(expressionResolver)).longValue(), booleanValue);
        } else if (a12 instanceof A1.c) {
            create$default.scrollToEnd(booleanValue);
        } else if (a12 instanceof A1.f) {
            create$default.scrollToStart(booleanValue);
        }
    }
}
