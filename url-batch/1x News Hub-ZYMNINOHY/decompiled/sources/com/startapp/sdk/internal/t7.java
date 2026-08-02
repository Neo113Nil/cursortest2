package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t7 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4459a;

    static {
        int[] iArr = new int[AdPreferences.Placement.values().length];
        f4459a = iArr;
        try {
            iArr[AdPreferences.Placement.INAPP_OFFER_WALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4459a[AdPreferences.Placement.INAPP_OVERLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4459a[AdPreferences.Placement.INAPP_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4459a[AdPreferences.Placement.INAPP_SPLASH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4459a[AdPreferences.Placement.INAPP_FULL_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4459a[AdPreferences.Placement.INAPP_BROWSER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
