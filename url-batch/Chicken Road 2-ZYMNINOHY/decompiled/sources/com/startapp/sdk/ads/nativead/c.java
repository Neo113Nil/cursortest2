package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.i2;

/* loaded from: classes.dex */
public final class c implements i2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f6206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f6207c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.f6207c = nativeAdDetails;
        this.f6206b = runnable;
    }

    @Override // com.startapp.sdk.internal.i2
    public final void a(Bitmap bitmap, int i4) {
        if (i4 == 0) {
            this.f6207c.setImageBitmap(bitmap);
        } else {
            this.f6207c.setSecondaryImageBitmap(bitmap);
        }
        int i5 = this.f6205a + 1;
        this.f6205a = i5;
        if (i5 == 2) {
            this.f6206b.run();
        }
    }
}
