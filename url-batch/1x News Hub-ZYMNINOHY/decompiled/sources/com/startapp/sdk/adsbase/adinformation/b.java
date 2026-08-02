package com.startapp.sdk.adsbase.adinformation;

import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3264a;

    static {
        int[] iArr = new int[AdInformationPositions.Position.values().length];
        f3264a = iArr;
        try {
            iArr[AdInformationPositions.Position.TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3264a[AdInformationPositions.Position.TOP_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3264a[AdInformationPositions.Position.BOTTOM_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3264a[AdInformationPositions.Position.BOTTOM_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
