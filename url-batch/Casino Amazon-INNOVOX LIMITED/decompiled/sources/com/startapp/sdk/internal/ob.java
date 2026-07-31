package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ob {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f363a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f363a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f363a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f363a[AdPreferences.Placement.INAPP_NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
