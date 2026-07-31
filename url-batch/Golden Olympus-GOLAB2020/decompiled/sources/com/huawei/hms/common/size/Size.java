package com.huawei.hms.common.size;

import com.huawei.hms.common.internal.Objects;

/* loaded from: classes.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    private final int f14105a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14106b;

    public Size(int i4, int i5) {
        this.f14105a = i4;
        this.f14106b = i5;
    }

    public static Size parseSize(String str) {
        try {
            int indexOf = str.indexOf("x");
            if (indexOf < 0) {
                indexOf = str.indexOf("*");
            }
            return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
        } catch (Exception unused) {
            throw new IllegalArgumentException("Size parses failed");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f14105a == size.f14105a && this.f14106b == size.f14106b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f14106b;
    }

    public final int getWidth() {
        return this.f14105a;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(getWidth()), Integer.valueOf(getHeight()));
    }

    public final String toString() {
        return "Width is " + this.f14105a + " Height is " + this.f14106b;
    }
}
