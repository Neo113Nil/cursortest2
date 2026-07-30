package com.crrepa.band.my.model;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class WatchFaceSvgModel {
    private boolean checked;
    private int colorNumber;
    private boolean isPureBlack;
    private ArrayList<WatchFaceSvgPathModel> pathModels;
    private int svgHeight;
    private int svgWidth;

    public int getColorNumber() {
        return this.colorNumber;
    }

    public ArrayList<WatchFaceSvgPathModel> getPathModels() {
        return this.pathModels;
    }

    public int getSvgHeight() {
        return this.svgHeight;
    }

    public int getSvgWidth() {
        return this.svgWidth;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isPureBlack() {
        return this.isPureBlack;
    }

    public void setChecked(boolean z7) {
        this.checked = z7;
    }

    public void setColorNumber(int i8) {
        this.colorNumber = i8;
    }

    public void setPathModels(ArrayList<WatchFaceSvgPathModel> arrayList) {
        this.pathModels = arrayList;
    }

    public void setPureBlack(boolean z7) {
        this.isPureBlack = z7;
    }

    public void setSvgHeight(int i8) {
        this.svgHeight = i8;
    }

    public void setSvgWidth(int i8) {
        this.svgWidth = i8;
    }
}
