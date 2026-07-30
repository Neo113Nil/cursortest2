package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class WatchFace {
    private String broadcastName;
    private Integer compressionType;
    private Integer height;
    private Long id;
    private Integer index;
    private String md5;
    private Integer textColor;
    private Integer thumHeight;
    private Integer thumWidth;
    private Integer timeBottomComtent;
    private Integer timePosition;
    private Integer timeTopContent;
    private Integer type;
    private Integer width;

    public WatchFace(Long l8, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
        this.id = l8;
        this.broadcastName = str;
        this.index = num;
        this.timePosition = num2;
        this.timeTopContent = num3;
        this.timeBottomComtent = num4;
        this.textColor = num5;
        this.md5 = str2;
        this.height = num6;
        this.width = num7;
        this.thumHeight = num8;
        this.thumWidth = num9;
        this.compressionType = num10;
        this.type = num11;
    }

    public WatchFace copy() {
        WatchFace watchFace = new WatchFace();
        watchFace.setId(getId());
        watchFace.setThumHeight(getThumHeight());
        watchFace.setThumWidth(getThumWidth());
        watchFace.setHeight(getHeight());
        watchFace.setWidth(getWidth());
        watchFace.setCompressionType(getCompressionType());
        watchFace.setBroadcastName(getBroadcastName());
        watchFace.setIndex(getIndex());
        watchFace.setMd5(getMd5());
        watchFace.setTextColor(getTextColor());
        watchFace.setTimeBottomComtent(getTimeBottomComtent());
        watchFace.setTimePosition(getTimePosition());
        watchFace.setTimeTopContent(getTimeTopContent());
        watchFace.setType(getType());
        return watchFace;
    }

    public String getBroadcastName() {
        return this.broadcastName;
    }

    public Integer getCompressionType() {
        return this.compressionType;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getMd5() {
        return this.md5;
    }

    public Integer getTextColor() {
        return this.textColor;
    }

    public Integer getThumHeight() {
        return this.thumHeight;
    }

    public Integer getThumWidth() {
        return this.thumWidth;
    }

    public Integer getTimeBottomComtent() {
        return this.timeBottomComtent;
    }

    public Integer getTimePosition() {
        return this.timePosition;
    }

    public Integer getTimeTopContent() {
        return this.timeTopContent;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setBroadcastName(String str) {
        this.broadcastName = str;
    }

    public void setCompressionType(Integer num) {
        this.compressionType = num;
    }

    public void setHeight(Integer num) {
        this.height = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIndex(Integer num) {
        this.index = num;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setTextColor(Integer num) {
        this.textColor = num;
    }

    public void setThumHeight(Integer num) {
        this.thumHeight = num;
    }

    public void setThumWidth(Integer num) {
        this.thumWidth = num;
    }

    public void setTimeBottomComtent(Integer num) {
        this.timeBottomComtent = num;
    }

    public void setTimePosition(Integer num) {
        this.timePosition = num;
    }

    public void setTimeTopContent(Integer num) {
        this.timeTopContent = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setWidth(Integer num) {
        this.width = num;
    }

    public WatchFace() {
    }
}
