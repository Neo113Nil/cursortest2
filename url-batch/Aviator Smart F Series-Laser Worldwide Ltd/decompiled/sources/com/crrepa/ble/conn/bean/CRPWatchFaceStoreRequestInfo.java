package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPWatchFaceStoreType;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPWatchFaceStoreRequestInfo {
    private int apiVersion;
    private int feature;
    private String firmwareVersion;
    private int maxSize;
    private int pageIndex;
    private int perPageCount;
    private CRPWatchFaceStoreType storeType;
    private List<Integer> typeList;

    public CRPWatchFaceStoreRequestInfo(CRPWatchFaceStoreType cRPWatchFaceStoreType, List<Integer> list, String str, int i8, int i9, int i10) {
        this.storeType = cRPWatchFaceStoreType;
        this.typeList = list;
        this.firmwareVersion = str;
        this.perPageCount = i8;
        this.pageIndex = i9;
        this.maxSize = i10;
    }

    public int getApiVersion() {
        return this.apiVersion;
    }

    public int getFeature() {
        return this.feature;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getPerPageCount() {
        return this.perPageCount;
    }

    public CRPWatchFaceStoreType getStoreType() {
        return this.storeType;
    }

    public List<Integer> getTypeList() {
        return this.typeList;
    }

    public void setApiVersion(int i8) {
        this.apiVersion = i8;
    }

    public void setFeature(int i8) {
        this.feature = i8;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setMaxSize(int i8) {
        this.maxSize = i8;
    }

    public void setPageIndex(int i8) {
        this.pageIndex = i8;
    }

    public void setPerPageCount(int i8) {
        this.perPageCount = i8;
    }

    public void setStoreType(CRPWatchFaceStoreType cRPWatchFaceStoreType) {
        this.storeType = cRPWatchFaceStoreType;
    }

    public void setTypeList(List<Integer> list) {
        this.typeList = list;
    }

    public String toString() {
        return "CRPWatchFaceStoreTagInfo{storeType=" + this.storeType + ", typeList=" + this.typeList + ", firmwareVersion='" + this.firmwareVersion + "', perPageCount=" + this.perPageCount + ", pageIndex=" + this.pageIndex + ", maxSize=" + this.maxSize + ", apiVersion=" + this.apiVersion + ", feature=" + this.feature + '}';
    }
}
