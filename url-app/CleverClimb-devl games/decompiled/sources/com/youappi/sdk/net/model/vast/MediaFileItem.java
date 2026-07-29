package com.youappi.sdk.net.model.vast;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class MediaFileItem implements Serializable, Comparable {
    private int _bitrate;
    private String _delivery;
    private int _height;
    private String _type;
    private String _url;
    private int _width;

    public MediaFileItem(int i, int i2, int i3, String str, String str2, String str3) {
        this._height = i;
        this._width = i2;
        this._bitrate = i3;
        this._type = str;
        this._delivery = str2;
        this._url = str3;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int bitrate = ((MediaFileItem) obj).getBitrate();
        if (bitrate == getBitrate()) {
            return 0;
        }
        return getBitrate() > bitrate ? -1 : 1;
    }

    public float getAspectRatio() {
        if (this._height == 0 || this._width == 0) {
            return 0.0f;
        }
        return this._height / this._width;
    }

    public int getBitrate() {
        return this._bitrate;
    }

    public String getDelivery() {
        return this._delivery;
    }

    public int getHeight() {
        return this._height;
    }

    public String getType() {
        return this._type;
    }

    public String getUrl() {
        return this._url;
    }

    public int getWidth() {
        return this._width;
    }

    public boolean isPortrait() {
        return this._height >= this._width;
    }

    public void setBitrate(int i) {
        this._bitrate = i;
    }

    public void setDelivery(String str) {
        this._delivery = str;
    }

    public void setHeight(int i) {
        this._height = i;
    }

    public void setType(String str) {
        this._type = str;
    }

    public void setUrl(String str) {
        this._url = str;
    }

    public void setWidth(int i) {
        this._width = i;
    }

    public String toString() {
        return ("height = " + getHeight() + " width = " + getWidth() + " bitrate = " + getBitrate() + " type = " + getType() + " delivery = " + getDelivery() + "\n") + "url : " + getUrl();
    }

    public boolean valid() {
        return (this._height == 0 || this._width == 0 || this._type == null || !this._type.contains("mp4") || this._url == null || this._delivery == null || !this._delivery.contains("progressive")) ? false : true;
    }
}
