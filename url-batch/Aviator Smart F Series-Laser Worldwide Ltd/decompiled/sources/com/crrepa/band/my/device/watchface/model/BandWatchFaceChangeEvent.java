package com.crrepa.band.my.device.watchface.model;

import com.crrepa.band.my.model.db.WatchFace;

/* loaded from: classes2.dex */
public class BandWatchFaceChangeEvent {
    private WatchFace watchFace;

    public BandWatchFaceChangeEvent(WatchFace watchFace) {
        this.watchFace = watchFace;
    }

    public WatchFace getWatchFace() {
        return this.watchFace;
    }

    public void setWatchFace(WatchFace watchFace) {
        this.watchFace = watchFace;
    }
}
