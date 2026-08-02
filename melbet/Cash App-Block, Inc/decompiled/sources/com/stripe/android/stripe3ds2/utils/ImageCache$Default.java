package com.stripe.android.stripe3ds2.utils;

/* loaded from: classes9.dex */
public final class ImageCache$Default {
    public static final ImageCache$Default INSTANCE = new ImageCache$Default();
    public static final ImageCache$Default$cache$1 cache = new ImageCache$Default$cache$1(Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), 10240), 0);
}
