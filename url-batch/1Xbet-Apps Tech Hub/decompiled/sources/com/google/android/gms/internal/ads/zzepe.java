package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzepe implements zzeuy {
    private final zzeuy zza;
    private final zzfeq zzb;
    private final Context zzc;
    private final zzcaw zzd;

    public zzepe(zzeqy zzeqyVar, zzfeq zzfeqVar, Context context, zzcaw zzcawVar) {
        this.zza = zzeqyVar;
        this.zzb = zzfeqVar;
        this.zzc = context;
        this.zzd = zzcawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzeuy
    public final ListenableFuture zzb() {
        return zzgbb.zzm(this.zza.zzb(), new zzftn() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // com.google.android.gms.internal.ads.zzftn
            public final Object apply(Object obj) {
                return zzepe.this.zzc((zzevd) obj);
            }
        }, zzcca.zzf);
    }

    final /* synthetic */ zzepf zzc(zzevd zzevdVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = zzqVar.zzg;
        if (zzqVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar2 : zzqVarArr) {
                boolean z4 = zzqVar2.zzi;
                if (!z4 && !z2) {
                    str = zzqVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzqVar.zza;
            z = zzqVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            zzcaw zzcawVar = this.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = zzcawVar.zzi().zzm();
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr2 = zzqVar.zzg;
        if (zzqVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzq zzqVar3 : zzqVarArr2) {
                if (zzqVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzqVar3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (zzqVar3.zzf / f) : -1;
                    }
                    sb.append(i4);
                    sb.append("x");
                    int i5 = zzqVar3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (zzqVar3.zzc / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzepf(zzqVar, str, z, sb.toString(), f, i2, i, str2, this.zzb.zzp);
    }
}
