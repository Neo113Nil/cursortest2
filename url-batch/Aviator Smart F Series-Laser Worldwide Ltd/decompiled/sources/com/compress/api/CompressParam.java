package com.compress.api;

/* loaded from: classes2.dex */
public class CompressParam {
    private byte[] alphaChannel;
    private byte[] blueChannel;
    private int cmpMode;
    private byte[] greenChannel;
    private int height;
    private int id;
    private int modeAlpha;
    private int modeRgb;
    private int pixelFormat;
    private byte[] redChannel;
    private int stride;
    private int tileWidth;
    private int width;

    public byte[] getAlphaChannel() {
        return this.alphaChannel;
    }

    public byte[] getBlueChannel() {
        return this.blueChannel;
    }

    public int getCmpMode() {
        return this.cmpMode;
    }

    public byte[] getGreenChannel() {
        return this.greenChannel;
    }

    public int getHeight() {
        return this.height;
    }

    public int getId() {
        return this.id;
    }

    public int getModeAlpha() {
        return this.modeAlpha;
    }

    public int getModeRgb() {
        return this.modeRgb;
    }

    public int getPixelFormat() {
        return this.pixelFormat;
    }

    public byte[] getRedChannel() {
        return this.redChannel;
    }

    public int getStride() {
        return this.stride;
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAlphaChannel(byte[] bArr) {
        this.alphaChannel = bArr;
    }

    public void setBlueChannel(byte[] bArr) {
        this.blueChannel = bArr;
    }

    public void setCmpMode(int i8) {
        this.cmpMode = i8;
    }

    public void setGreenChannel(byte[] bArr) {
        this.greenChannel = bArr;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setModeAlpha(int i8) {
        this.modeAlpha = i8;
    }

    public void setModeRgb(int i8) {
        this.modeRgb = i8;
    }

    public void setPixelFormat(int i8) {
        this.pixelFormat = i8;
    }

    public void setRedChannel(byte[] bArr) {
        this.redChannel = bArr;
    }

    public void setStride(int i8) {
        this.stride = i8;
    }

    public void setTileWidth(int i8) {
        this.tileWidth = i8;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }
}
