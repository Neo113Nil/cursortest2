package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class PieDataSet extends DataSet implements v4.i {
    private boolean mAutomaticallyDisableSliceSpacing;
    private float mShift;
    private float mSliceSpace;
    private boolean mUsingSliceColorAsValueLineColor;
    private int mValueLineColor;
    private float mValueLinePart1Length;
    private float mValueLinePart1OffsetPercentage;
    private float mValueLinePart2Length;
    private boolean mValueLineVariableLength;
    private float mValueLineWidth;
    private ValuePosition mXValuePosition;
    private ValuePosition mYValuePosition;

    public enum ValuePosition {
        INSIDE_SLICE,
        OUTSIDE_SLICE
    }

    public PieDataSet(List<PieEntry> list, String str) {
        super(list, str);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
        ValuePosition valuePosition = ValuePosition.INSIDE_SLICE;
        this.mXValuePosition = valuePosition;
        this.mYValuePosition = valuePosition;
        this.mUsingSliceColorAsValueLineColor = false;
        this.mValueLineColor = -16777216;
        this.mValueLineWidth = 1.0f;
        this.mValueLinePart1OffsetPercentage = 75.0f;
        this.mValueLinePart1Length = 0.3f;
        this.mValueLinePart2Length = 0.4f;
        this.mValueLineVariableLength = true;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet copy() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.mValues.size(); i8++) {
            arrayList.add(((PieEntry) this.mValues.get(i8)).copy());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, getLabel());
        copy(pieDataSet);
        return pieDataSet;
    }

    @Override // v4.i
    public float getSelectionShift() {
        return this.mShift;
    }

    @Override // v4.i
    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    @Override // v4.i
    public int getValueLineColor() {
        return this.mValueLineColor;
    }

    @Override // v4.i
    public float getValueLinePart1Length() {
        return this.mValueLinePart1Length;
    }

    @Override // v4.i
    public float getValueLinePart1OffsetPercentage() {
        return this.mValueLinePart1OffsetPercentage;
    }

    @Override // v4.i
    public float getValueLinePart2Length() {
        return this.mValueLinePart2Length;
    }

    @Override // v4.i
    public float getValueLineWidth() {
        return this.mValueLineWidth;
    }

    @Override // v4.i
    public ValuePosition getXValuePosition() {
        return this.mXValuePosition;
    }

    @Override // v4.i
    public ValuePosition getYValuePosition() {
        return this.mYValuePosition;
    }

    @Override // v4.i
    public boolean isAutomaticallyDisableSliceSpacingEnabled() {
        return this.mAutomaticallyDisableSliceSpacing;
    }

    @Override // v4.i
    public boolean isUsingSliceColorAsValueLineColor() {
        return this.mUsingSliceColorAsValueLineColor;
    }

    @Override // v4.i
    public boolean isValueLineVariableLength() {
        return this.mValueLineVariableLength;
    }

    public void setAutomaticallyDisableSliceSpacing(boolean z7) {
        this.mAutomaticallyDisableSliceSpacing = z7;
    }

    public void setSelectionShift(float f8) {
        this.mShift = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setSliceSpace(float f8) {
        if (f8 > 20.0f) {
            f8 = 20.0f;
        }
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        this.mSliceSpace = com.github.mikephil.charting.utils.i.convertDpToPixel(f8);
    }

    public void setUsingSliceColorAsValueLineColor(boolean z7) {
        this.mUsingSliceColorAsValueLineColor = z7;
    }

    public void setValueLineColor(int i8) {
        this.mValueLineColor = i8;
    }

    public void setValueLinePart1Length(float f8) {
        this.mValueLinePart1Length = f8;
    }

    public void setValueLinePart1OffsetPercentage(float f8) {
        this.mValueLinePart1OffsetPercentage = f8;
    }

    public void setValueLinePart2Length(float f8) {
        this.mValueLinePart2Length = f8;
    }

    public void setValueLineVariableLength(boolean z7) {
        this.mValueLineVariableLength = z7;
    }

    public void setValueLineWidth(float f8) {
        this.mValueLineWidth = f8;
    }

    public void setXValuePosition(ValuePosition valuePosition) {
        this.mXValuePosition = valuePosition;
    }

    public void setYValuePosition(ValuePosition valuePosition) {
        this.mYValuePosition = valuePosition;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.mikephil.charting.data.DataSet
    public void calcMinMax(PieEntry pieEntry) {
        if (pieEntry == null) {
            return;
        }
        calcMinMaxY(pieEntry);
    }

    protected void copy(PieDataSet pieDataSet) {
        super.copy((DataSet) pieDataSet);
    }
}
