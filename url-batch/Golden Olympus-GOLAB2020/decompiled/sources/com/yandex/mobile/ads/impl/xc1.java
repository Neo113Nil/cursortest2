package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;

/* loaded from: classes3.dex */
public final class xc1 extends LruCache<String, Bitmap> {
    xc1(int i4) {
        super(i4);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        return bitmap2 != null ? bitmap2.getByteCount() / 1024 : super.sizeOf(str, null);
    }
}
