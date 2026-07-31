package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdType;

/* loaded from: classes3.dex */
public final /* synthetic */ class ll2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28642a;

    static {
        int[] iArr = new int[AdType.values().length];
        try {
            iArr[AdType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdType.BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AdType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AdType.REWARDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AdType.NATIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AdType.APP_OPEN_AD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f28642a = iArr;
    }
}
