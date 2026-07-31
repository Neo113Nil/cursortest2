package com.startapp.sdk.ads.nativead;

import android.graphics.Bitmap;
import com.startapp.sdk.internal.c2;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f95a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ NativeAdDetails c;

    public c(NativeAdDetails nativeAdDetails, Runnable runnable) {
        this.c = nativeAdDetails;
        this.b = runnable;
    }

    @Override // com.startapp.sdk.internal.c2
    public final void a(Bitmap bitmap, int i) {
        NativeAdDetails nativeAdDetails = this.c;
        if (i == 0) {
            nativeAdDetails.setImageBitmap(bitmap);
        } else {
            nativeAdDetails.setSecondaryImageBitmap(bitmap);
        }
        int i2 = this.f95a + 1;
        this.f95a = i2;
        if (i2 == 2) {
            this.b.run();
        }
    }
}
