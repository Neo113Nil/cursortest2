package com.squareup.cash.tax.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.tax.primitives.TaxTooltipModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class TaxTooltipViewModel {
    public final int anchorBottom;
    public final int anchorLeft;
    public final int anchorWidth;
    public final TaxTooltipModel taxTooltip;

    public TaxTooltipViewModel(int i, int i2, int i3, TaxTooltipModel taxTooltipModel) {
        this.anchorBottom = i;
        this.anchorLeft = i2;
        this.anchorWidth = i3;
        this.taxTooltip = taxTooltipModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTooltipViewModel)) {
            return false;
        }
        TaxTooltipViewModel taxTooltipViewModel = (TaxTooltipViewModel) obj;
        return this.anchorBottom == taxTooltipViewModel.anchorBottom && this.anchorLeft == taxTooltipViewModel.anchorLeft && this.anchorWidth == taxTooltipViewModel.anchorWidth && this.taxTooltip.equals(taxTooltipViewModel.taxTooltip);
    }

    public final int hashCode() {
        return this.taxTooltip.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorWidth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.anchorLeft, Integer.hashCode(this.anchorBottom) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.anchorBottom, this.anchorLeft, "TaxTooltipViewModel(anchorBottom=", ", anchorLeft=", ", anchorWidth=");
        m107m.append(this.anchorWidth);
        m107m.append(", taxTooltip=");
        m107m.append(this.taxTooltip);
        m107m.append(")");
        return m107m.toString();
    }
}
