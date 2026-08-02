package com.squareup.scannerview;

/* loaded from: classes8.dex */
public final class Size implements Comparable {
    public final int height;
    public final int width;

    public Size(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Size size = (Size) obj;
        size.getClass();
        return (this.width * this.height) - (size.width * size.height);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return this.width == size.width && this.height == size.height;
    }

    public final int hashCode() {
        int i = this.width;
        int i2 = i << 16;
        return this.height ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.width + "x" + this.height;
    }
}
