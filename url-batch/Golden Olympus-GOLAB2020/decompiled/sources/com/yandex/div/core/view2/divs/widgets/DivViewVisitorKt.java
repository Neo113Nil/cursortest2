package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1293g0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewVisitorKt {
    public static final void visitViewTree(@NotNull DivViewVisitor divViewVisitor, @NotNull View view) {
        Intrinsics.checkNotNullParameter(divViewVisitor, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof DivWrapLayout) {
            Iterator it = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                visitViewTree(divViewVisitor, (View) it.next());
            }
            divViewVisitor.visit((DivWrapLayout) view);
            return;
        }
        if (view instanceof DivFrameLayout) {
            Iterator it2 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                visitViewTree(divViewVisitor, (View) it2.next());
            }
            divViewVisitor.visit((DivFrameLayout) view);
            return;
        }
        if (view instanceof DivGridLayout) {
            Iterator it3 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it3.hasNext()) {
                visitViewTree(divViewVisitor, (View) it3.next());
            }
            divViewVisitor.visit((DivGridLayout) view);
            return;
        }
        if (view instanceof DivLinearLayout) {
            Iterator it4 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it4.hasNext()) {
                visitViewTree(divViewVisitor, (View) it4.next());
            }
            divViewVisitor.visit((DivLinearLayout) view);
            return;
        }
        if (view instanceof DivPagerView) {
            Iterator it5 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it5.hasNext()) {
                visitViewTree(divViewVisitor, (View) it5.next());
            }
            divViewVisitor.visit((DivPagerView) view);
            return;
        }
        if (view instanceof DivRecyclerView) {
            Iterator it6 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it6.hasNext()) {
                visitViewTree(divViewVisitor, (View) it6.next());
            }
            divViewVisitor.visit((DivRecyclerView) view);
            return;
        }
        if (view instanceof DivStateLayout) {
            Iterator it7 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it7.hasNext()) {
                visitViewTree(divViewVisitor, (View) it7.next());
            }
            divViewVisitor.visit((DivStateLayout) view);
            return;
        }
        if (view instanceof DivTabsLayout) {
            Iterator it8 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it8.hasNext()) {
                visitViewTree(divViewVisitor, (View) it8.next());
            }
            divViewVisitor.visit((DivTabsLayout) view);
            return;
        }
        if (view instanceof DivCustomWrapper) {
            Iterator it9 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it9.hasNext()) {
                visitViewTree(divViewVisitor, (View) it9.next());
            }
            divViewVisitor.visit((DivCustomWrapper) view);
            return;
        }
        if (view instanceof DivSeparatorView) {
            divViewVisitor.visit((DivSeparatorView) view);
            return;
        }
        if (view instanceof DivGifImageView) {
            divViewVisitor.visit((DivGifImageView) view);
            return;
        }
        if (view instanceof DivImageView) {
            divViewVisitor.visit((DivImageView) view);
            return;
        }
        if (view instanceof DivLineHeightTextView) {
            divViewVisitor.visit((DivLineHeightTextView) view);
            return;
        }
        if (view instanceof DivPagerIndicatorView) {
            divViewVisitor.visit((DivPagerIndicatorView) view);
            return;
        }
        if (view instanceof DivSliderView) {
            divViewVisitor.visit((DivSliderView) view);
            return;
        }
        if (view instanceof DivSelectView) {
            divViewVisitor.visit((DivSelectView) view);
            return;
        }
        if (view instanceof DivVideoView) {
            divViewVisitor.visit((DivVideoView) view);
            return;
        }
        if (view instanceof DivSwitchView) {
            divViewVisitor.visit((DivSwitchView) view);
            return;
        }
        if (view instanceof ViewGroup) {
            Iterator it10 = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it10.hasNext()) {
                visitViewTree(divViewVisitor, (View) it10.next());
            }
        }
        divViewVisitor.visit(view);
    }
}
