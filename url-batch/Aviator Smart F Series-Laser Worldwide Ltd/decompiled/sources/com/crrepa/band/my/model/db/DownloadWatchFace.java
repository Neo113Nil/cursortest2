package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class DownloadWatchFace {
    private Long id;
    private String url;
    private Long watchFaceId;

    public DownloadWatchFace(Long l8, Long l9, String str) {
        this.id = l8;
        this.watchFaceId = l9;
        this.url = str;
    }

    public Long getId() {
        return this.id;
    }

    public String getUrl() {
        return this.url;
    }

    public Long getWatchFaceId() {
        return this.watchFaceId;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWatchFaceId(Long l8) {
        this.watchFaceId = l8;
    }

    public DownloadWatchFace() {
    }
}
