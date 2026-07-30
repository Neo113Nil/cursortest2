package com.crrepa.band.my.model;

import com.crrepa.band.my.model.db.DownloadWatchFace;

/* loaded from: classes2.dex */
public class DownloadWatchFaceModel {
    private boolean checked = false;
    private DownloadWatchFace watchFace;

    public DownloadWatchFaceModel(DownloadWatchFace downloadWatchFace) {
        this.watchFace = downloadWatchFace;
    }

    public DownloadWatchFace getWatchFace() {
        return this.watchFace;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z7) {
        this.checked = z7;
    }

    public void setWatchFace(DownloadWatchFace downloadWatchFace) {
        this.watchFace = downloadWatchFace;
    }
}
