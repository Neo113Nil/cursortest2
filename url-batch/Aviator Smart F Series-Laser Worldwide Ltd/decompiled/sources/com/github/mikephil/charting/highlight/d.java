package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.components.YAxis;

/* loaded from: classes3.dex */
public class d {
    private YAxis.AxisDependency axis;
    private int mDataIndex;
    private int mDataSetIndex;
    private float mDrawX;
    private float mDrawY;
    private int mStackIndex;
    private float mX;
    private float mXPx;
    private float mY;
    private float mYPx;

    public d(float f8, float f9, int i8) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f8;
        this.mY = f9;
        this.mDataSetIndex = i8;
    }

    public boolean equalTo(d dVar) {
        return dVar != null && this.mDataSetIndex == dVar.mDataSetIndex && this.mX == dVar.mX && this.mStackIndex == dVar.mStackIndex && this.mDataIndex == dVar.mDataIndex;
    }

    public YAxis.AxisDependency getAxis() {
        return this.axis;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public int getDataSetIndex() {
        return this.mDataSetIndex;
    }

    public float getDrawX() {
        return this.mDrawX;
    }

    public float getDrawY() {
        return this.mDrawY;
    }

    public int getStackIndex() {
        return this.mStackIndex;
    }

    public float getX() {
        return this.mX;
    }

    public float getXPx() {
        return this.mXPx;
    }

    public float getY() {
        return this.mY;
    }

    public float getYPx() {
        return this.mYPx;
    }

    public boolean isStacked() {
        return this.mStackIndex >= 0;
    }

    public void setDataIndex(int i8) {
        this.mDataIndex = i8;
    }

    public void setDraw(float f8, float f9) {
        this.mDrawX = f8;
        this.mDrawY = f9;
    }

    public String toString() {
        return "Highlight, x: " + this.mX + ", y: " + this.mY + ", dataSetIndex: " + this.mDataSetIndex + ", stackIndex (only stacked barentry): " + this.mStackIndex;
    }

    public d(float f8, int i8, int i9) {
        this(f8, Float.NaN, i8);
        this.mStackIndex = i9;
    }

    public d(float f8, float f9, float f10, float f11, int i8, YAxis.AxisDependency axisDependency) {
        this.mDataIndex = -1;
        this.mStackIndex = -1;
        this.mX = f8;
        this.mY = f9;
        this.mXPx = f10;
        this.mYPx = f11;
        this.mDataSetIndex = i8;
        this.axis = axisDependency;
    }

    public d(float f8, float f9, float f10, float f11, int i8, int i9, YAxis.AxisDependency axisDependency) {
        this(f8, f9, f10, f11, i8, axisDependency);
        this.mStackIndex = i9;
    }
}
