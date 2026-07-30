package com.baidu.ar.bean;

/* loaded from: classes.dex */
public class Size {
    private int mHeight;
    private int mWidth;

    public Size() {
    }

    public Size(int i8, int i9) {
        this.mWidth = i8;
        this.mHeight = i9;
    }

    public static Size parseSize(String str) {
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            return null;
        }
        try {
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.mWidth == size.mWidth && this.mHeight == size.mHeight;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        int i8 = this.mHeight;
        int i9 = this.mWidth;
        return i8 ^ ((i9 >>> 16) | (i9 << 16));
    }

    public void setHeight(int i8) {
        this.mHeight = i8;
    }

    public void setWidth(int i8) {
        this.mWidth = i8;
    }

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }
}
