package com.compress.api;

/* loaded from: classes2.dex */
public class DecompressRet {
    private byte[] alphaChannel;
    private byte[] blueChannel;
    private int format;
    private byte[] greenChannel;
    private int height;
    private byte[] redChannel;
    private int width;

    public byte[] getAlphaChannel() {
        return this.alphaChannel;
    }

    public byte[] getBlueChannel() {
        return this.blueChannel;
    }

    public int getFormat() {
        return this.format;
    }

    public byte[] getGreenChannel() {
        return this.greenChannel;
    }

    public int getHeight() {
        return this.height;
    }

    public byte[] getRedChannel() {
        return this.redChannel;
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

    public void setFormat(int i8) {
        this.format = i8;
    }

    public void setGreenChannel(byte[] bArr) {
        this.greenChannel = bArr;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setRedChannel(byte[] bArr) {
        this.redChannel = bArr;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }
}
