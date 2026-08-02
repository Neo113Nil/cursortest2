package com.stripe.android.uicore.image;

import android.graphics.Bitmap;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class ImageLruDiskCache$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
