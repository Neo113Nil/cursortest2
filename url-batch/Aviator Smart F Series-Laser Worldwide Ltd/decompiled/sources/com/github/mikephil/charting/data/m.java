package com.github.mikephil.charting.data;

import android.graphics.DashPathEffect;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class m extends d implements v4.h {
    protected boolean mDrawHorizontalHighlightIndicator;
    protected boolean mDrawVerticalHighlightIndicator;
    protected DashPathEffect mHighlightDashPathEffect;
    protected float mHighlightLineWidth;

    public m(List<Entry> list, String str) {
        super(list, str);
        this.mDrawVerticalHighlightIndicator = true;
        this.mDrawHorizontalHighlightIndicator = true;
        this.mHighlightLineWidth = 0.5f;
        this.mHighlightDashPathEffect = null;
        this.mHighlightLineWidth = com.github.mikephil.charting.utils.i.convertDpToPixel(0.5f);
    }

    protected void copy(m mVar) {
        super.copy((d) mVar);
        mVar.mDrawHorizontalHighlightIndicator = this.mDrawHorizontalHighlightIndicator;
        mVar.mDrawVerticalHighlightIndicator = this.mDrawVerticalHighlightIndicator;
        mVar.mHighlightLineWidth = this.mHighlightLineWidth;
        mVar.mHighlightDashPathEffect = this.mHighlightDashPathEffect;
    }

    public void disableDashedHighlightLine() {
        this.mHighlightDashPathEffect = null;
    }

    public void enableDashedHighlightLine(float f8, float f9, float f10) {
        this.mHighlightDashPathEffect = new DashPathEffect(new float[]{f8, f9}, f10);
    }

    @Override // v4.h
    public DashPathEffect getDashPathEffectHighlight() {
        return this.mHighlightDashPathEffect;
    }

    @Override // v4.h
    public float getHighlightLineWidth() {
        return this.mHighlightLineWidth;
    }

    public boolean isDashedHighlightLineEnabled() {
        return this.mHighlightDashPathEffect != null;
    }

    @Override // v4.h
    public boolean isHorizontalHighlightIndicatorEnabled() {
        return this.mDrawHorizontalHighlightIndicator;
    }

    @Override // v4.h
    public boolean isVerticalHighlightIndicatorEnabled() {
        return this.mDrawVerticalHighlightIndicator;
    }

    public void setDrawHighlightIndicators(boolean z7) {
        setDrawVerticalHighlightIndicator(z7);
        setDrawHorizontalHighlightIndicator(z7);
    }

    public void setDrawHorizontalHighlightIndicator(boolean z7) {
        this.mDrawHorizontalHighlightIndicator = z7;
    }

    public void setDrawVerticalHighlightIndicator(boolean z7) {
        this.mDrawVerticalHighlightIndicator = z7;
    }

    public void setHighlightLineWidth(float f8) {
        this.mHighlightLineWidth = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }
}
