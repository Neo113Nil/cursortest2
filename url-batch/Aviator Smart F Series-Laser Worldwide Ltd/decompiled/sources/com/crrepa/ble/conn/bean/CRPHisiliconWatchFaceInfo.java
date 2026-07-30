package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPHisiliconWatchFaceInfo {
    private int multipleFloats;
    private List<Integer> savedWatchFaceList;
    private int singleFloat;
    private int templateID;
    private int textType;

    public CRPHisiliconWatchFaceInfo(int i8, int i9, int i10, int i11, List<Integer> list) {
        this.templateID = i8;
        this.singleFloat = i9;
        this.multipleFloats = i10;
        this.textType = i11;
        this.savedWatchFaceList = list;
    }

    public int getMultipleFloats() {
        return this.multipleFloats;
    }

    public List<Integer> getSavedWatchFaceList() {
        return this.savedWatchFaceList;
    }

    public int getSingleFloat() {
        return this.singleFloat;
    }

    public int getTemplateID() {
        return this.templateID;
    }

    public int getTextType() {
        return this.textType;
    }

    public void setMultipleFloats(int i8) {
        this.multipleFloats = i8;
    }

    public void setSavedWatchFaceList(List<Integer> list) {
        this.savedWatchFaceList = list;
    }

    public void setSingleFloat(int i8) {
        this.singleFloat = i8;
    }

    public void setTemplateID(int i8) {
        this.templateID = i8;
    }

    public void setTextType(int i8) {
        this.textType = i8;
    }

    public String toString() {
        return "CRPHisiliconWatchFaceInfo{templateID=" + this.templateID + ", singleFloat=" + this.singleFloat + ", multipleFloats=" + this.multipleFloats + ", textType=" + this.textType + ", savedWatchFaceList=" + this.savedWatchFaceList + '}';
    }
}
