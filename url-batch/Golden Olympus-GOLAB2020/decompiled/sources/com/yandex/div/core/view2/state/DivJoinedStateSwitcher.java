package com.yandex.div.core.view2.state;

import O1.C1165z4;
import O1.Z;
import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivJoinedStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivJoinedStateSwitcher(@NotNull Div2View divView, @NotNull DivBinder divBinder) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        this.divView = divView;
        this.divBinder = divBinder;
    }

    private final DivStatePath findCommonPath(List<DivStatePath> list, DivStatePath divStatePath) {
        int size = list.size();
        if (size == 0) {
            return divStatePath;
        }
        if (size == 1) {
            return (DivStatePath) CollectionsKt.first((List) list);
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            DivStatePath divStatePath2 = (DivStatePath) it.next();
            next = DivStatePath.Companion.lowestCommonAncestor$div_release((DivStatePath) next, divStatePath2);
            if (next == null) {
                next = divStatePath;
            }
        }
        return (DivStatePath) next;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull C1165z4.c state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        View view = this.divView.getChildAt(0);
        Z z4 = state.f8721a;
        DivStatePath fromState$div_release = DivStatePath.Companion.fromState$div_release(state);
        DivStatePath findCommonPath = findCommonPath(paths, fromState$div_release);
        if (!findCommonPath.isRootPath()) {
            DivPathUtils divPathUtils = DivPathUtils.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(view, "rootView");
            Pair<DivStateLayout, Z.o> tryFindStateDivAndLayout$div_release = divPathUtils.tryFindStateDivAndLayout$div_release(view, state, findCommonPath, resolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout component1 = tryFindStateDivAndLayout$div_release.component1();
            Z.o component2 = tryFindStateDivAndLayout$div_release.component2();
            if (component1 != null) {
                DivStatePath path = component1.getPath();
                fromState$div_release = path == null ? findCommonPath : path;
                z4 = component2;
                view = component1;
            }
        }
        Intrinsics.checkNotNullExpressionValue(view, "view");
        BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(view);
        if (bindingContext == null) {
            bindingContext = this.divView.getBindingContext$div_release();
        }
        DivBinder divBinder = this.divBinder;
        Intrinsics.checkNotNullExpressionValue(view, "view");
        divBinder.bind(bindingContext, view, z4, fromState$div_release.parentState());
        this.divBinder.attachIndicators$div_release();
    }
}
