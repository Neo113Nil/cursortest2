package com.github.mikephil.charting.utils;

/* loaded from: classes3.dex */
public class h extends g {
    public h(j jVar) {
        super(jVar);
    }

    @Override // com.github.mikephil.charting.utils.g
    public void prepareMatrixOffset(boolean z7) {
        this.mMatrixOffset.reset();
        if (!z7) {
            this.mMatrixOffset.postTranslate(this.mViewPortHandler.offsetLeft(), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
        } else {
            this.mMatrixOffset.setTranslate(-(this.mViewPortHandler.getChartWidth() - this.mViewPortHandler.offsetRight()), this.mViewPortHandler.getChartHeight() - this.mViewPortHandler.offsetBottom());
            this.mMatrixOffset.postScale(-1.0f, 1.0f);
        }
    }
}
