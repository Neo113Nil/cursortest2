package com.google.android.exoplayer2;

import com.google.android.exoplayer2.RendererCapabilities;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n3 {
    public static void a(RendererCapabilities rendererCapabilities) {
    }

    public static void b(RendererCapabilities rendererCapabilities, RendererCapabilities.Listener listener) {
    }

    public static int c(int i8) {
        return d(i8, 0, 0);
    }

    public static int d(int i8, int i9, int i10) {
        return e(i8, i9, i10, 0, 128);
    }

    public static int e(int i8, int i9, int i10, int i11, int i12) {
        return i8 | i9 | i10 | i11 | i12;
    }

    public static int f(int i8) {
        return i8 & 24;
    }

    public static int g(int i8) {
        return i8 & RendererCapabilities.MODE_SUPPORT_MASK;
    }

    public static int h(int i8) {
        return i8 & 7;
    }

    public static int i(int i8) {
        return i8 & 64;
    }

    public static int j(int i8) {
        return i8 & 32;
    }
}
