package com.crrepa.band.my.device.muslim.model;

import java.util.List;

/* loaded from: classes2.dex */
public class BandMuslimNameChangeEvent {
    private List<Integer> indexList;
    private final boolean isCancel;

    public BandMuslimNameChangeEvent(boolean z7) {
        this.isCancel = z7;
    }

    public List<Integer> getIndexList() {
        return this.indexList;
    }

    public boolean isCancel() {
        return this.isCancel;
    }

    public void setIndexList(List<Integer> list) {
        this.indexList = list;
    }
}
