package com.yandex.div.core.view2.divs;

import O1.C1039s4;
import O1.Z;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.R$id;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivCustomBinder extends DivViewBinder<Z.d, C1039s4, DivCustomWrapper> {

    @NotNull
    private final DivBaseBinder baseBinder;

    @NotNull
    private final V1.a divBinder;

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivCustomBinder(@NotNull DivBaseBinder baseBinder, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController extensionController, @NotNull V1.a divBinder) {
        super(baseBinder);
        Intrinsics.checkNotNullParameter(baseBinder, "baseBinder");
        Intrinsics.checkNotNullParameter(divCustomContainerViewAdapter, "divCustomContainerViewAdapter");
        Intrinsics.checkNotNullParameter(extensionController, "extensionController");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        this.baseBinder = baseBinder;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = extensionController;
        this.divBinder = divBinder;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bind(DivCustomWrapper divCustomWrapper, View view, C1039s4 c1039s4, C1039s4 c1039s42, BindingContext bindingContext, Function0<? extends View> function0, Function1<? super View, Unit> function1) {
        View view2;
        List<Z> nonNullItems;
        C1039s4 c4;
        if (view != null) {
            Z.d div = divCustomWrapper.getDiv();
            if (Intrinsics.areEqual((div == null || (c4 = div.c()) == null) ? null : c4.f7834j, c1039s42.f7834j) && c1039s4 != null && (nonNullItems = DivCollectionExtensionsKt.getNonNullItems(c1039s4)) != null && nonNullItems.size() == DivCollectionExtensionsKt.getNonNullItems(c1039s42).size()) {
                view2 = view;
                Div2View divView = bindingContext.getDivView();
                if (!Intrinsics.areEqual(view, view2)) {
                    replaceInParent(divCustomWrapper, view2, divView);
                }
                function1.invoke(view2);
                this.baseBinder.bindId$div_release(divView, view2, c1039s42.getId());
                this.extensionController.bindView(divView, bindingContext.getExpressionResolver(), view2, c1039s42);
            }
        }
        view2 = (View) function0.invoke();
        view2.setTag(R$id.div_custom_tag, c1039s42);
        Div2View divView2 = bindingContext.getDivView();
        if (!Intrinsics.areEqual(view, view2)) {
        }
        function1.invoke(view2);
        this.baseBinder.bindId$div_release(divView2, view2, c1039s42.getId());
        this.extensionController.bindView(divView2, bindingContext.getExpressionResolver(), view2, c1039s42);
    }

    private final void replaceInParent(ViewGroup viewGroup, View view, Div2View div2View) {
        if (viewGroup.getChildCount() != 0) {
            DivViewVisitorKt.visitViewTree(div2View.getReleaseViewVisitor$div_release(), AbstractC1293g0.a(viewGroup, 0));
            viewGroup.removeViewAt(0);
        }
        viewGroup.addView(view);
    }

    public void bindView(@NotNull BindingContext context, @NotNull DivCustomWrapper view, @NotNull Z.d div, @NotNull DivStatePath path) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(path, "path");
        View customView = view.getCustomView();
        Z.d div2 = view.getDiv();
        Div2View divView = context.getDivView();
        ExpressionResolver expressionResolver2 = context.getExpressionResolver();
        if (div2 == div) {
            Object obj = this.divBinder.get();
            Intrinsics.checkNotNullExpressionValue(obj, "divBinder.get()");
            BaseDivViewExtensionsKt.bindStates(view, context, (DivBinder) obj);
            return;
        }
        if (customView != null && div2 != null && (bindingContext = view.getBindingContext()) != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
            this.extensionController.unbindView(divView, expressionResolver, customView, div2.b());
        }
        this.baseBinder.bindView(context, view, div, div2);
        this.baseBinder.bindId$div_release(divView, view, null);
        C1039s4 c4 = div.c();
        if (this.divCustomContainerViewAdapter.isCustomTypeSupported(c4.f7834j)) {
            bind(view, customView, div2 != null ? div2.c() : null, c4, context, new DivCustomBinder$bindView$2(this, c4, divView, expressionResolver2, path), new DivCustomBinder$bindView$3(this, c4, divView, expressionResolver2, path));
        }
    }
}
