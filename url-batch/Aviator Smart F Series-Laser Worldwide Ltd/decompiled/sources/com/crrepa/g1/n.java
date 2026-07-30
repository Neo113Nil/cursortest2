package com.crrepa.g1;

import android.graphics.Color;
import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12928a = 5;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12929b = 6;

    /* renamed from: c, reason: collision with root package name */
    private static final int f12930c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f12931d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f12932e = 2081;

    private n() {
    }

    public static int a(@ColorInt int i8) {
        int a8 = (a(Color.red(i8), 5) << 11) + (a(Color.green(i8), 6) << 5) + a(Color.blue(i8), 5);
        return a8 == f12932e ? a8 + 1 : a8;
    }

    private static int a(int i8, int i9) {
        return (i8 >> (8 - i9)) & 255;
    }
}
