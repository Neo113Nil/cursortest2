package com.jieli.bmp_convert;

/* loaded from: classes4.dex */
public class ConvertParam {
    public static final int FORMAT_ARGB_8565 = 1;
    public static final int FORMAT_ARGB_8888 = 2;
    public static final int FORMAT_AUTO = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f15135a = 0;

    public int getFormat() {
        return this.f15135a;
    }

    public ConvertParam setFormat(int i8) {
        this.f15135a = i8;
        return this;
    }

    public String toString() {
        return "ConvertParam{format=" + this.f15135a + '}';
    }
}
