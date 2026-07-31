package com.startapp.sdk.internal;

import com.startapp.sdk.ads.banner.BannerFormat;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269a;

    static {
        int[] iArr = new int[BannerFormat.values().length];
        f269a = iArr;
        try {
            iArr[BannerFormat.MREC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f269a[BannerFormat.COVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
