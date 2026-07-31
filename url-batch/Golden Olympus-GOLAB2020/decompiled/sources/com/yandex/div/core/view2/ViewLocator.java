package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ViewLocator {

    @NotNull
    public static final ViewLocator INSTANCE = new ViewLocator();

    private ViewLocator() {
    }

    @Nullable
    public static final View findSingleViewWithTag(@NotNull Div2View divView, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<View> findViewsWithTag = findViewsWithTag(divView, tag);
        if (findViewsWithTag.isEmpty()) {
            return null;
        }
        if (findViewsWithTag.size() <= 1) {
            return (View) CollectionsKt.first((List) findViewsWithTag);
        }
        DivActionTypedUtilsKt.logError(divView, new RuntimeException("Ambiguous scope id. There are " + findViewsWithTag.size() + " divs with id '" + tag + '\''));
        return null;
    }

    @NotNull
    public static final List<View> findViewsWithTag(@NotNull Div2View divView, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return INSTANCE.findViewsWithTag((View) divView.getView(), (Object) tag);
    }

    private final List<View> findViewsWithTagTraversal(View view, Object obj, List<View> list) {
        if (Intrinsics.areEqual(obj, view.getTag())) {
            list.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                Intrinsics.checkNotNullExpressionValue(childAt, "view.getChildAt(i)");
                findViewsWithTagTraversal(childAt, obj, list);
            }
        }
        return list;
    }

    private final List<View> findViewsWithTag(View view, Object obj) {
        if (obj == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        findViewsWithTagTraversal(view, obj, arrayList);
        return arrayList;
    }
}
