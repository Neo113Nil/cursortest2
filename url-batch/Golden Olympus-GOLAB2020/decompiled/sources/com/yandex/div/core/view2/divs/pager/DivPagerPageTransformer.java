package com.yandex.div.core.view2.divs.pager;

import O1.AbstractC0919l9;
import O1.C0991p9;
import O1.C1116w9;
import O1.EnumC1163z2;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerPageTransformer implements ViewPager2.k {
    private final boolean isHorizontal;

    @NotNull
    private final DivPagerPageOffsetProvider offsetProvider;

    @Nullable
    private final AbstractC0919l9 pageTransformation;

    @NotNull
    private final SparseArray<Float> pageTranslations;
    private final int parentSize;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ExpressionResolver resolver;

    public DivPagerPageTransformer(@NotNull RecyclerView recyclerView, @NotNull ExpressionResolver resolver, @NotNull SparseArray<Float> pageTranslations, int i4, @Nullable AbstractC0919l9 abstractC0919l9, @NotNull DivPagerPageOffsetProvider offsetProvider, boolean z4) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(pageTranslations, "pageTranslations");
        Intrinsics.checkNotNullParameter(offsetProvider, "offsetProvider");
        this.recyclerView = recyclerView;
        this.resolver = resolver;
        this.pageTranslations = pageTranslations;
        this.parentSize = i4;
        this.pageTransformation = abstractC0919l9;
        this.offsetProvider = offsetProvider;
        this.isHorizontal = z4;
    }

    private final void apply(C1116w9 c1116w9, View view, float f4) {
        applyAlphaAndScale(view, f4, c1116w9.f8330a, c1116w9.f8331b, c1116w9.f8332c, c1116w9.f8333d, c1116w9.f8334e);
        applyOffset$default(this, view, f4, false, 2, null);
    }

    private final void applyAlphaAndScale(View view, float f4, Expression<EnumC1163z2> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        float interpolation = 1 - DivUtilKt.getAndroidInterpolator(expression.evaluate(this.resolver)).getInterpolation(Math.abs(g.f(g.c(f4, -1.0f), 1.0f)));
        if (f4 > 0.0f) {
            applyPageAlpha(view, interpolation, expression2.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression3.evaluate(this.resolver).doubleValue());
        } else {
            applyPageAlpha(view, interpolation, expression4.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression5.evaluate(this.resolver).doubleValue());
        }
    }

    private final void applyEvaluatedOffset(View view, int i4, float f4) {
        this.pageTranslations.put(i4, Float.valueOf(f4));
        if (this.isHorizontal) {
            view.setTranslationX(f4);
        } else {
            view.setTranslationY(f4);
        }
    }

    private final void applyOffset(View view, float f4, boolean z4) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        float f5 = -(z4 ? this.parentSize * f4 : this.offsetProvider.getPageOffset(f4, childAdapterPosition, this.pageTransformation instanceof AbstractC0919l9.c));
        if (this.isHorizontal && ViewsKt.isLayoutRtl(this.recyclerView)) {
            f5 = -f5;
        }
        applyEvaluatedOffset(view, childAdapterPosition, f5);
    }

    static /* synthetic */ void applyOffset$default(DivPagerPageTransformer divPagerPageTransformer, View view, float f4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        divPagerPageTransformer.applyOffset(view, f4, z4);
    }

    private final void applyPageAlpha(View view, float f4, double d4) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        RecyclerView.h adapter = this.recyclerView.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        view.setAlpha((float) getInterpolation(((Number) ((DivItemBuilderResult) divPagerAdapter.getItemsToShow().get(childAdapterPosition)).getDiv().b().v().evaluate(this.resolver)).doubleValue(), d4, f4));
    }

    private final void applyPageScale(View view, float f4, double d4) {
        if (d4 == 1.0d) {
            return;
        }
        float interpolation = (float) getInterpolation(1.0d, d4, f4);
        view.setScaleX(interpolation);
        view.setScaleY(interpolation);
    }

    private final double getInterpolation(double d4, double d5, float f4) {
        return Math.min(d4, d5) + (Math.abs(d5 - d4) * f4);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.k
    public void transformPage(@NotNull View page, float f4) {
        Intrinsics.checkNotNullParameter(page, "page");
        AbstractC0919l9 abstractC0919l9 = this.pageTransformation;
        Object b4 = abstractC0919l9 != null ? abstractC0919l9.b() : null;
        if (b4 instanceof C1116w9) {
            apply((C1116w9) b4, page, f4);
        } else if (b4 instanceof C0991p9) {
            apply((C0991p9) b4, page, f4);
        } else {
            applyOffset$default(this, page, f4, false, 2, null);
        }
    }

    private final void apply(C0991p9 c0991p9, View view, float f4) {
        applyAlphaAndScale(view, f4, c0991p9.f7481a, c0991p9.f7482b, c0991p9.f7483c, c0991p9.f7484d, c0991p9.f7485e);
        if (f4 <= 0.0f && (f4 >= 0.0f || !((Boolean) c0991p9.f7486f.evaluate(this.resolver)).booleanValue())) {
            applyOffset(view, f4, true);
            view.setTranslationZ(-Math.abs(f4));
        } else {
            applyOffset$default(this, view, f4, false, 2, null);
            view.setTranslationZ(0.0f);
        }
    }
}
