package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* loaded from: classes2.dex */
public final class F3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24880b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f24881c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f24882d;

    /* renamed from: e, reason: collision with root package name */
    public final float f24883e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24884f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24885g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24886h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24887j;

    public F3(String str, int i, Integer num, Integer num2, float f6, boolean z8, boolean z9, boolean z10, boolean z11, int i4) {
        this.f24879a = str;
        this.f24880b = i;
        this.f24881c = num;
        this.f24882d = num2;
        this.f24883e = f6;
        this.f24884f = z8;
        this.f24885g = z9;
        this.f24886h = z10;
        this.i = z11;
        this.f24887j = i4;
    }

    public static Integer a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            PA.n(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC3194fG.c(((parseLong >> 24) & 255) ^ 255), AbstractC3194fG.c(parseLong & 255), AbstractC3194fG.c((parseLong >> 8) & 255), AbstractC3194fG.c((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e6) {
            AbstractC3217fl.O("SsaStyle", D.y.o(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e6);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e6) {
            AbstractC3217fl.O("SsaStyle", D.y.o(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e6);
            return false;
        }
    }
}
