package com.yandex.div.core.view2.reuse.util;

import O1.Z;
import V1.a;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class RebindUtilsKt {
    public static final boolean tryRebindPlainContainerChildren(@NotNull ViewGroup viewGroup, @NotNull Div2View divView, @NotNull List<DivItemBuilderResult> items, @NotNull a divViewCreator) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        ReusableTokenList currentRebindReusableList$div_release = divView.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return false;
        }
        viewGroup.removeAllViews();
        for (DivItemBuilderResult divItemBuilderResult : items) {
            View uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(divItemBuilderResult.getDiv());
            if (uniqueViewForDiv == null) {
                uniqueViewForDiv = ((DivViewCreator) divViewCreator.get()).create(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            viewGroup.addView(uniqueViewForDiv);
        }
        return true;
    }

    public static final boolean tryRebindRecycleContainerChildren(@NotNull ViewGroup viewGroup, @NotNull Div2View div2View, @NotNull Z div) {
        View uniqueViewForDiv;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        Intrinsics.checkNotNullParameter(div, "div");
        ReusableTokenList currentRebindReusableList$div_release = div2View.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null || (uniqueViewForDiv = currentRebindReusableList$div_release.getUniqueViewForDiv(div)) == null) {
            return false;
        }
        viewGroup.addView(uniqueViewForDiv);
        return true;
    }
}
