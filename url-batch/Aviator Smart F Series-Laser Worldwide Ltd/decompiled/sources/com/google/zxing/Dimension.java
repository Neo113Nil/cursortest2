package com.google.zxing;

/* loaded from: classes4.dex */
public final class Dimension {
    private final int height;
    private final int width;

    public Dimension(int i8, int i9) {
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException();
        }
        this.width = i8;
        this.height = i9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dimension) {
            Dimension dimension = (Dimension) obj;
            if (this.width == dimension.width && this.height == dimension.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 32713) + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
