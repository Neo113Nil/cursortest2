package com.squareup.scannerview;

import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes8.dex */
public final class PixelGrid {
    public final Lazy condensedByteArray$delegate;
    public final byte[] data;
    public final int height;
    public final int pixelStride;
    public final int rowStride;
    public final int size;
    public final int width;

    public PixelGrid(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        i3 = (i5 & 4) != 0 ? i : i3;
        i4 = (i5 & 8) != 0 ? 1 : i4;
        bArr = (i5 & 16) != 0 ? new byte[i3 * i2] : bArr;
        this.width = i;
        this.height = i2;
        this.rowStride = i3;
        this.pixelStride = i4;
        this.data = bArr;
        this.size = i * i2;
        this.condensedByteArray$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 5));
    }
}
