package com.google.android.gms.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzbhc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    Drawable getMainImage();

    VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(Drawable drawable);

    zzbhc zza();

    boolean zzb();
}
