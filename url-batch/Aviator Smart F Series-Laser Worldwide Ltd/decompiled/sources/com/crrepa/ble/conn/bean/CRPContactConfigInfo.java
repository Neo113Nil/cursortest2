package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPContactConfigInfo {
    private int count;
    private int height;
    private int nameLength;
    private boolean supported;
    private int width;

    public int getCount() {
        return this.count;
    }

    public int getHeight() {
        return this.height;
    }

    public int getNameLength() {
        return this.nameLength;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSupported() {
        return this.supported;
    }

    public void setCount(int i8) {
        this.count = i8;
    }

    public void setHeight(int i8) {
        this.height = i8;
    }

    public void setNameLength(int i8) {
        this.nameLength = i8;
    }

    public void setSupported(boolean z7) {
        this.supported = z7;
    }

    public void setWidth(int i8) {
        this.width = i8;
    }

    public String toString() {
        return "CRPContactConfigInfo{supported=" + this.supported + ", count=" + this.count + ", width=" + this.width + ", height=" + this.height + ", nameLength=" + this.nameLength + '}';
    }
}
