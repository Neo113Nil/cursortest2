package com.yandex.div.core.tooltip;

import O1.InterfaceC0752c3;
import O1.Yb;
import O1.Z;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class DivTooltipViewBuilder {

    @NotNull
    private final V1.a div2Builder;

    public DivTooltipViewBuilder(@NotNull V1.a div2Builder) {
        Intrinsics.checkNotNullParameter(div2Builder, "div2Builder");
        this.div2Builder = div2Builder;
    }

    private View prepareTooltipView(BindingContext bindingContext, Z z4) {
        InterfaceC0752c3 b4 = z4.b();
        View buildView = ((Div2Builder) this.div2Builder.get()).buildView(z4, bindingContext, DivStatePath.Companion.fromRootDiv$div_release(0L, z4));
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DisplayMetrics displayMetrics = buildView.getContext().getResources().getDisplayMetrics();
        Yb width = b4.getWidth();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "displayMetrics");
        buildView.setLayoutParams(new RelativeLayout.LayoutParams(BaseDivViewExtensionsKt.toLayoutParamsSize$default(width, displayMetrics, expressionResolver, null, 4, null), BaseDivViewExtensionsKt.toLayoutParamsSize$default(b4.getHeight(), displayMetrics, expressionResolver, null, 4, null)));
        buildView.setFocusable(true);
        return buildView;
    }

    @NotNull
    public DivTooltipContainer buildTooltipView(@NotNull BindingContext context, @NotNull Z div, int i4, int i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(div, "div");
        View prepareTooltipView = prepareTooltipView(context, div);
        Context context2 = context.getDivView().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.divView.getContext()");
        DivTooltipContainer divTooltipContainer = new DivTooltipContainer(context2, null, 0, 6, null);
        divTooltipContainer.addView(prepareTooltipView);
        divTooltipContainer.setLayoutParams(new ViewGroup.LayoutParams(i4, i5));
        return divTooltipContainer;
    }
}
