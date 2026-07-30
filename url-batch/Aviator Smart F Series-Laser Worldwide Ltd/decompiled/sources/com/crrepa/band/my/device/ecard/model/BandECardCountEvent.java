package com.crrepa.band.my.device.ecard.model;

import java.util.List;

/* loaded from: classes2.dex */
public class BandECardCountEvent {
    List<Integer> savedIdList;

    public BandECardCountEvent(List<Integer> list) {
        this.savedIdList = list;
    }

    public List<Integer> getSavedIdList() {
        return this.savedIdList;
    }

    public void setSavedIdList(List<Integer> list) {
        this.savedIdList = list;
    }
}
