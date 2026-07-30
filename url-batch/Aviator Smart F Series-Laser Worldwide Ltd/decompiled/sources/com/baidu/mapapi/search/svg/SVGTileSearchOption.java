package com.baidu.mapapi.search.svg;

/* loaded from: classes2.dex */
public class SVGTileSearchOption {
    public String mAkCipher;
    public String mCoordCipher;
    public String mDeviceIDCipher;
    public String mSign;
    public String mTime;
    public int mX;
    public int mY;
    public int mZ;

    public SVGTileSearchOption() {
        this.mCoordCipher = null;
        this.mAkCipher = null;
        this.mDeviceIDCipher = null;
        this.mTime = null;
        this.mSign = null;
    }

    public SVGTileSearchOption akCipher(String str) {
        this.mAkCipher = str;
        return this;
    }

    public SVGTileSearchOption coordCipher(String str) {
        this.mCoordCipher = str;
        return this;
    }

    public SVGTileSearchOption deviceIDCipher(String str) {
        this.mDeviceIDCipher = str;
        return this;
    }

    public SVGTileSearchOption sign(String str) {
        this.mSign = str;
        return this;
    }

    public SVGTileSearchOption time(String str) {
        this.mTime = str;
        return this;
    }

    public SVGTileSearchOption x(int i8) {
        this.mX = i8;
        return this;
    }

    public SVGTileSearchOption y(int i8) {
        this.mY = i8;
        return this;
    }

    public SVGTileSearchOption z(int i8) {
        this.mZ = i8;
        return this;
    }

    public SVGTileSearchOption(SVGTileSearchOption sVGTileSearchOption) {
        this.mCoordCipher = null;
        this.mAkCipher = null;
        this.mDeviceIDCipher = null;
        this.mTime = null;
        this.mSign = null;
        this.mCoordCipher = sVGTileSearchOption.mCoordCipher;
        this.mAkCipher = sVGTileSearchOption.mAkCipher;
        this.mDeviceIDCipher = sVGTileSearchOption.mDeviceIDCipher;
        this.mTime = sVGTileSearchOption.mTime;
        this.mSign = sVGTileSearchOption.mSign;
        this.mX = sVGTileSearchOption.mX;
        this.mY = sVGTileSearchOption.mY;
        this.mZ = sVGTileSearchOption.mZ;
    }
}
