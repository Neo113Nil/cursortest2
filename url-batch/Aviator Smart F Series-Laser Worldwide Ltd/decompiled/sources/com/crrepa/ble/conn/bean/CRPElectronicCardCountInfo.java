package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPElectronicCardCountInfo {
    private int count;
    private List<Integer> savedIdList;
    private int urlBytesLimit;

    public CRPElectronicCardCountInfo(int i8, int i9, List<Integer> list) {
        this.count = i8;
        this.urlBytesLimit = i9;
        this.savedIdList = list;
    }

    public int getCount() {
        return this.count;
    }

    public List<Integer> getSavedIdList() {
        return this.savedIdList;
    }

    public int getUrlBytesLimit() {
        return this.urlBytesLimit;
    }

    public void setCount(int i8) {
        this.count = i8;
    }

    public void setSavedIdList(List<Integer> list) {
        this.savedIdList = list;
    }

    public void setUrlBytesLimit(int i8) {
        this.urlBytesLimit = i8;
    }

    public String toString() {
        return "CRPElectronicCardCountInfo{count=" + this.count + ", urlBytesLimit=" + this.urlBytesLimit + ", savedIdList=" + this.savedIdList + '}';
    }
}
