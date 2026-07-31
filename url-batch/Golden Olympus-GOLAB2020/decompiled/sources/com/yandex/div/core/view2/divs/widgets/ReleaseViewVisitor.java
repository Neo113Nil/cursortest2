package com.yandex.div.core.view2.divs.widgets;

import O1.InterfaceC0752c3;
import O1.Z;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ReleaseViewVisitor extends DivViewVisitor {

    @NotNull
    private final DivCustomContainerViewAdapter divCustomContainerViewAdapter;

    @NotNull
    private final DivExtensionController divExtensionController;

    @NotNull
    private final Div2View divView;

    public ReleaseViewVisitor(@NotNull Div2View divView, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(divCustomContainerViewAdapter, "divCustomContainerViewAdapter");
        Intrinsics.checkNotNullParameter(divExtensionController, "divExtensionController");
        this.divView = divView;
        this.divCustomContainerViewAdapter = divCustomContainerViewAdapter;
        this.divExtensionController = divExtensionController;
    }

    private void releaseInternal(View view, InterfaceC0752c3 interfaceC0752c3, ExpressionResolver expressionResolver) {
        if (interfaceC0752c3 != null && expressionResolver != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, view, interfaceC0752c3);
        }
        release$div_release(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void defaultVisit(@NotNull DivHolderView<?> view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = (View) view;
        Z div = view.getDiv();
        InterfaceC0752c3 b4 = div != null ? div.b() : null;
        BindingContext bindingContext = view.getBindingContext();
        releaseInternal(view2, b4, bindingContext != null ? bindingContext.getExpressionResolver() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release$div_release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof Releasable) {
            ((Releasable) view).release();
        }
        Iterable<Releasable> releasableList = ReleasablesKt.getReleasableList(view);
        if (releasableList != null) {
            Iterator<Releasable> it = releasableList.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivPagerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.visit(view);
        view.getViewPager().setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivRecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.visit(view);
        view.setAdapter(null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull DivCustomWrapper view) {
        BindingContext bindingContext;
        ExpressionResolver expressionResolver;
        Intrinsics.checkNotNullParameter(view, "view");
        Z.d div = view.getDiv();
        if (div == null || (bindingContext = view.getBindingContext()) == null || (expressionResolver = bindingContext.getExpressionResolver()) == null) {
            return;
        }
        release$div_release(view);
        View customView = view.getCustomView();
        if (customView != null) {
            this.divExtensionController.unbindView(this.divView, expressionResolver, customView, div.c());
            this.divCustomContainerViewAdapter.release(customView, div.c());
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivViewVisitor
    public void visit(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        release$div_release(view);
    }
}
