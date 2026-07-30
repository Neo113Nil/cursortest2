package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class SupportWatchFace {
    private String broadcastName;
    private Long id;

    @Deprecated
    private String previewUrl;
    private String tpls;

    @Deprecated
    private Integer watchFaceId;

    public SupportWatchFace(Long l8, String str, String str2, Integer num, String str3) {
        this.id = l8;
        this.broadcastName = str;
        this.tpls = str2;
        this.watchFaceId = num;
        this.previewUrl = str3;
    }

    public String getBroadcastName() {
        return this.broadcastName;
    }

    public Long getId() {
        return this.id;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getTpls() {
        return this.tpls;
    }

    public Integer getWatchFaceId() {
        return this.watchFaceId;
    }

    public void setBroadcastName(String str) {
        this.broadcastName = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setPreviewUrl(String str) {
        this.previewUrl = str;
    }

    public void setTpls(String str) {
        this.tpls = str;
    }

    public void setWatchFaceId(Integer num) {
        this.watchFaceId = num;
    }

    public SupportWatchFace() {
    }
}
