package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PagerIndicatorConnector {

    @NotNull
    private final Map<E9, DivPagerView> pagers = new LinkedHashMap();

    @NotNull
    private final List<IndicatorData> indicators = new ArrayList();

    @Metadata
    private static final class IndicatorData {

        @NotNull
        private final DivPagerIndicatorView indicator;

        @NotNull
        private final E9 pagerDiv;

        public IndicatorData(@NotNull DivPagerIndicatorView indicator, @NotNull E9 pagerDiv) {
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            Intrinsics.checkNotNullParameter(pagerDiv, "pagerDiv");
            this.indicator = indicator;
            this.pagerDiv = pagerDiv;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorData)) {
                return false;
            }
            IndicatorData indicatorData = (IndicatorData) obj;
            return Intrinsics.areEqual(this.indicator, indicatorData.indicator) && Intrinsics.areEqual(this.pagerDiv, indicatorData.pagerDiv);
        }

        @NotNull
        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final E9 getPagerDiv() {
            return this.pagerDiv;
        }

        public int hashCode() {
            return (this.indicator.hashCode() * 31) + this.pagerDiv.hashCode();
        }

        @NotNull
        public String toString() {
            return "IndicatorData(indicator=" + this.indicator + ", pagerDiv=" + this.pagerDiv + ')';
        }
    }

    public final void attach$div_release() {
        Iterator<Map.Entry<E9, DivPagerView>> it = this.pagers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clearChangePageCallbackForIndicators();
        }
        for (IndicatorData indicatorData : this.indicators) {
            DivPagerView divPagerView = this.pagers.get(indicatorData.getPagerDiv());
            if (divPagerView != null) {
                indicatorData.getIndicator().attachPager(divPagerView);
            }
        }
        this.pagers.clear();
        this.indicators.clear();
    }

    public final void submitIndicator$div_release(@NotNull DivPagerIndicatorView indicatorView, @NotNull E9 pagerDiv) {
        Intrinsics.checkNotNullParameter(indicatorView, "indicatorView");
        Intrinsics.checkNotNullParameter(pagerDiv, "pagerDiv");
        this.indicators.add(new IndicatorData(indicatorView, pagerDiv));
    }

    public final void submitPager$div_release(@NotNull DivPagerView pagerView, @NotNull E9 pagerDiv) {
        Intrinsics.checkNotNullParameter(pagerView, "pagerView");
        Intrinsics.checkNotNullParameter(pagerDiv, "pagerDiv");
        this.pagers.put(pagerDiv, pagerView);
    }
}
