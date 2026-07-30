package com.crrepa.p;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f13578d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13579e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13580f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13581g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13582h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13583i = 5;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13584j = 38;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13585k = 39;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13586l = 6;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13587m = 7;

    /* renamed from: n, reason: collision with root package name */
    public static final int f13588n = 8;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f13589o = 16;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f13590p = 17;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f13591q = 18;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f13592r = 19;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f13593s = 20;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f13594t = 32;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13595u = 48;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13596v = 64;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f13597a;

    /* renamed from: b, reason: collision with root package name */
    private int f13598b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13599c;

    public a(int i8, byte[] bArr) {
        this.f13599c = false;
        this.f13598b = i8;
        this.f13597a = bArr;
    }

    public void a(boolean z7) {
        this.f13599c = z7;
    }

    public int b() {
        return this.f13598b;
    }

    public boolean c() {
        return this.f13599c;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13598b == aVar.f13598b && this.f13599c == aVar.f13599c && Objects.deepEquals(this.f13597a, aVar.f13597a);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f13597a)), Integer.valueOf(this.f13598b), Boolean.valueOf(this.f13599c));
    }

    public a(int i8, byte[] bArr, boolean z7) {
        this.f13597a = bArr;
        this.f13598b = i8;
        this.f13599c = z7;
    }

    public byte[] a() {
        return this.f13597a;
    }
}
