package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcgv;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcgv zzcgvVar) throws zzf {
        this.zzb = zzcgvVar.getLayoutParams();
        ViewParent parent = zzcgvVar.getParent();
        this.zzd = zzcgvVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzf("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcgvVar.zzF());
        viewGroup.removeView(zzcgvVar.zzF());
        zzcgvVar.zzan(true);
    }
}
