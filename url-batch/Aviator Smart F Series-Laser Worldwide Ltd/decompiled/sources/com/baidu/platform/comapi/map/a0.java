package com.baidu.platform.comapi.map;

/* loaded from: classes2.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private int f9581a;

    /* renamed from: b, reason: collision with root package name */
    private int f9582b;

    /* renamed from: c, reason: collision with root package name */
    private int f9583c;

    /* renamed from: d, reason: collision with root package name */
    private int f9584d;

    public int a() {
        return this.f9581a;
    }

    public int b() {
        return this.f9583c;
    }

    public int c() {
        return this.f9584d;
    }

    public int d() {
        return this.f9582b;
    }

    public String toString() {
        return "Style: color:" + Integer.toHexString(this.f9581a) + " width:" + this.f9582b + " fillcolor:" + Integer.toHexString(this.f9583c);
    }

    static int c(int i8) {
        return ((i8 & 16711680) >> 16) | ((-16777216) & i8) | ((i8 & 255) << 16) | (65280 & i8);
    }

    public a0 a(int i8) {
        this.f9581a = i8;
        return this;
    }

    public a0 b(int i8) {
        this.f9582b = i8;
        return this;
    }
}
