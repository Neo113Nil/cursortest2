package com.yandex.div.core.view2.state;

import O1.C1165z4;
import O1.Z;
import android.view.View;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivMultipleStateSwitcher implements DivStateSwitcher {

    @NotNull
    private final DivBinder divBinder;

    @NotNull
    private final Div2View divView;

    public DivMultipleStateSwitcher(@NotNull Div2View divView, @NotNull DivBinder divBinder) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        this.divView = divView;
        this.divBinder = divBinder;
    }

    @Override // com.yandex.div.core.view2.state.DivStateSwitcher
    public void switchStates(@NotNull C1165z4.c state, @NotNull List<DivStatePath> paths, @NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        int i4 = 0;
        View rootView = this.divView.getChildAt(0);
        Z z4 = state.f8721a;
        List<DivStatePath> compactPathList$div_release = DivPathUtils.INSTANCE.compactPathList$div_release(paths);
        ArrayList arrayList = new ArrayList();
        for (Object obj : compactPathList$div_release) {
            if (!((DivStatePath) obj).isRootPath()) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            DivStatePath divStatePath = (DivStatePath) obj2;
            DivPathUtils divPathUtils = DivPathUtils.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            Pair<DivStateLayout, Z.o> tryFindStateDivAndLayout$div_release = divPathUtils.tryFindStateDivAndLayout$div_release(rootView, state, divStatePath, resolver);
            if (tryFindStateDivAndLayout$div_release == null) {
                return;
            }
            DivStateLayout component1 = tryFindStateDivAndLayout$div_release.component1();
            Z.o component2 = tryFindStateDivAndLayout$div_release.component2();
            if (component1 != null && !linkedHashSet.contains(component1)) {
                DivStatePath path = component1.getPath();
                if (path != null) {
                    divStatePath = path;
                }
                BindingContext bindingContext = component1.getBindingContext();
                if (bindingContext == null) {
                    bindingContext = this.divView.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, component1, component2, divStatePath.parentState());
                linkedHashSet.add(component1);
            }
        }
        if (linkedHashSet.isEmpty()) {
            DivBinder divBinder = this.divBinder;
            BindingContext bindingContext$div_release = this.divView.getBindingContext$div_release();
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            divBinder.bind(bindingContext$div_release, rootView, z4, DivStatePath.Companion.fromState$div_release(state));
        }
        this.divBinder.attachIndicators$div_release();
    }
}
