package com.google.android.cameraview;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Size implements Comparable<Size> {
    private final int mHeight;
    private final int mWidth;

    public Size(int i8, int i9) {
        this.mWidth = i8;
        this.mHeight = i9;
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

    public String toString() {
        return this.mWidth + "x" + this.mHeight;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Size size) {
        return (this.mWidth * this.mHeight) - (size.mWidth * size.mHeight);
    }
}
