package com.yandex.div.core.actions;

import O1.AbstractC0948n2;
import O1.C0892k0;
import O1.S4;
import O1.Xb;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivActionTypedHandlerProxy {

    @NotNull
    public static final DivActionTypedHandlerProxy INSTANCE = new DivActionTypedHandlerProxy();

    private DivActionTypedHandlerProxy() {
    }

    public static final boolean handleAction(@NotNull C0892k0 action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return INSTANCE.handleAction(action.f6759h, action.f6761j, view, resolver, action.f6752a);
    }

    public static final boolean handleVisibilityAction(@NotNull Xb action, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        return INSTANCE.handleAction(action.d(), action.a(), view, resolver, action.b());
    }

    private final boolean handleAction(String str, AbstractC0948n2 abstractC0948n2, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, S4 s4) {
        if (abstractC0948n2 == null) {
            return false;
        }
        if (!(divViewFacade instanceof Div2View)) {
            Assert.fail("Div2View should be used!");
            return false;
        }
        if (abstractC0948n2 instanceof AbstractC0948n2.k) {
            return DivDownloadActionHandler.INSTANCE.handleAction(((AbstractC0948n2.k) abstractC0948n2).c(), s4, (Div2View) divViewFacade, expressionResolver);
        }
        Div2View div2View = (Div2View) divViewFacade;
        return div2View.getDiv2Component$div_release().getActionTypedHandlerCombiner().handleAction(str, abstractC0948n2, div2View, expressionResolver);
    }
}
