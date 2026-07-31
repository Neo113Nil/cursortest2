package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.el, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1908el implements InterfaceC1860cl<BitmapDrawable> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC1860cl
    public final boolean a(BitmapDrawable bitmapDrawable, Bitmap bitmap) {
        BitmapDrawable drawable = bitmapDrawable;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return Intrinsics.areEqual(bitmap, drawable.getBitmap());
    }
}
