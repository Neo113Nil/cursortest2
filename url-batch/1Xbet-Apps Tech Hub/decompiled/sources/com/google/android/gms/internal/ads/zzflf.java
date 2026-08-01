package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public abstract class zzflf {
    public abstract void zzb(View view, zzflm zzflmVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzflf zza(zzflg zzflgVar, zzflh zzflhVar) {
        if (zzfld.zzb()) {
            return new zzflj(zzflgVar, zzflhVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
