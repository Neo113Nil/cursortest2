package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcdl {
    private final Context zza;
    private final zzcdw zzb;
    private final ViewGroup zzc;
    private zzcdk zzd;

    public zzcdl(Context context, ViewGroup viewGroup, zzcgv zzcgvVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcgvVar;
        this.zzd = null;
    }

    public final zzcdk zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcdk zzcdkVar = this.zzd;
        if (zzcdkVar != null) {
            return zzcdkVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcdk zzcdkVar = this.zzd;
        if (zzcdkVar != null) {
            zzcdkVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcdv zzcdvVar) {
        if (this.zzd != null) {
            return;
        }
        zzbdm.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcdw zzcdwVar = this.zzb;
        zzcdk zzcdkVar = new zzcdk(context, zzcdwVar, i5, z, zzcdwVar.zzm().zza(), zzcdvVar);
        this.zzd = zzcdkVar;
        this.zzc.addView(zzcdkVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcdk zzcdkVar = this.zzd;
        if (zzcdkVar != null) {
            zzcdkVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcdk zzcdkVar = this.zzd;
        if (zzcdkVar != null) {
            zzcdkVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcdk zzcdkVar = this.zzd;
        if (zzcdkVar != null) {
            zzcdkVar.zzC(i);
        }
    }
}
