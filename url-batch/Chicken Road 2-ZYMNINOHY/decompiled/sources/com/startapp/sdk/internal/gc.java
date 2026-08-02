package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public abstract /* synthetic */ class gc {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6985a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f6985a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6985a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6985a[AdPreferences.Placement.INAPP_NATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
