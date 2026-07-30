package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public final class Size {
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private final int height;
    private final int width;

    public Size(int i8, int i9) {
        Assertions.checkArgument((i8 == -1 || i8 >= 0) && (i9 == -1 || i9 >= 0));
        this.width = i8;
        this.height = i9;
    }

    public boolean equals(@Nullable Object obj) {
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
        return this.width == size.width && this.height == size.height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i8 = this.height;
        int i9 = this.width;
        return i8 ^ ((i9 >>> 16) | (i9 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
