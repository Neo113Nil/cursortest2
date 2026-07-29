package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzadh
/* loaded from: classes2.dex */
public final class zzpz extends NativeAd.Image {
    private final Drawable mDrawable;
    private final Uri mUri;
    private final double zzbhv;
    private final zzpw zzbkm;

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:2|3)|(11:5|6|7|8|9|10|11|12|13|14|15)|24|6|7|8|9|10|11|12|13|14|15) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|2|3|(11:5|6|7|8|9|10|11|12|13|14|15)|24|6|7|8|9|10|11|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        com.google.android.gms.internal.ads.zzane.zzb("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0026, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        com.google.android.gms.internal.ads.zzane.zzb("", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzpz(zzpw zzpwVar) {
        Drawable drawable;
        IObjectWrapper zzjy;
        this.zzbkm = zzpwVar;
        Uri uri = null;
        try {
            zzjy = this.zzbkm.zzjy();
        } catch (RemoteException e) {
            zzane.zzb("", e);
        }
        if (zzjy != null) {
            drawable = (Drawable) ObjectWrapper.unwrap(zzjy);
            this.mDrawable = drawable;
            uri = this.zzbkm.getUri();
            this.mUri = uri;
            double d2 = 1.0d;
            d2 = this.zzbkm.getScale();
            this.zzbhv = d2;
        }
        drawable = null;
        this.mDrawable = drawable;
        uri = this.zzbkm.getUri();
        this.mUri = uri;
        double d22 = 1.0d;
        d22 = this.zzbkm.getScale();
        this.zzbhv = d22;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.zzbhv;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.mUri;
    }
}
